package facerec.blueberry.com.baseutils.factory;

/**
 * Created by guoxiao on 17/1/10.
 */


import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

import facerec.blueberry.com.baseutils.request.HttpResult;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import retrofit2.Converter;

final class GsonResponseBodyConverterM<T> implements Converter<ResponseBody, T> {
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private final Gson gson;
    private final TypeAdapter<T> adapter;
    private T t;

    GsonResponseBodyConverterM(Gson gson, TypeAdapter<T> adapter) {
        this.gson = gson;
        this.adapter = adapter;

    }

    @Override
    public T convert(ResponseBody value) throws IOException {
        String response = value.string();
        HttpResult httpStatus = gson.fromJson(response, HttpResult.class);
        if (httpStatus.getResp() == "" || httpStatus.getResp() == null) {
            HttpResult httpResult = new HttpResult<>();
            httpResult.setCode(httpStatus.getCode());
            httpResult.setMsg(httpStatus.getMsg());
            response = adapter.toJson((T) httpResult);
        }

        MediaType contentType = value.contentType();
        Charset charset = contentType != null ? contentType.charset(UTF_8) : UTF_8;
        InputStream inputStream = new ByteArrayInputStream(response.getBytes());
        Reader reader = new InputStreamReader(inputStream, charset);
        JsonReader jsonReader = gson.newJsonReader(reader);

        try {
            return adapter.read(jsonReader);
        } finally {
            value.close();
        }
    }
}
