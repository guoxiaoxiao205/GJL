package com.example.app.http;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by guoxiao on 17/1/7.
 */

public class InterceptorResponse implements Interceptor {
    String[] urlString = {"http://lottery.caiqr.cn/index/",
            "http://lottery.caiqr.cn/index/notice"};

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        /*if (!NetworkUtil.isNetworkAvailable(MyApplication.getApp())) {
            request = request.newBuilder()
                    .cacheControl(CacheControl.FORCE_CACHE)
                    .url(request.url())
                    .build();
        }*/

        Response response = chain.proceed(request);
       /* if (NetworkUtil.isNetworkAvailable(MyApplication.getApp())) {
            int maxAge = 60 * 60; // read from cache for 1 minute
            response.newBuilder()
                    .removeHeader("Pragma")
                    .header("Cache-Control", "public, max-age=" + maxAge)
                    .build();

        }*/
        int maxStale = 60 * 60 * 24 * 28; // tolerate 4-weeks stale
        response.newBuilder()
                .removeHeader("Pragma")
                .header("Cache-Control", "public, only-if-cached, max-stale=" + maxStale)
                .build();

        return response;
    }

}
