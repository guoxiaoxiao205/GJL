package com.example.app.http;

import android.util.Log;

import com.example.app.MyApplication;

import facerec.blueberry.com.baseutils.factory.GsonConverterFactoryM;
import facerec.blueberry.com.baseutils.factory.TrustAllCerts;

import java.io.IOException;
import java.security.SecureRandom;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

import com.example.app.utils.CommonUtils;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;

/**
 * Created by 2016/7/23.
 * 网络请求
 */
public class ServiceFactory {
    //测试环境
      public static final String BASE_URL_A = "http://lytest.caiqr.cn/";
      public static final String BASE_URL_B = "http://api.caiqr.cn/";
    //正式环境
/*      public static final String BASE_URL_A = "https://lottery.laoyingcp.com";
      public static final String BASE_URL_B = "https://api.laoyingcp.com/";*/
    private static final int DEFAULT_TIMEOUT = 10;
    private static Retrofit sRetrefitA, sRetrefitB;
    private static OkHttpClient sClient;


    static {
    /*    File cacheFile = new File(MyApplication.getApp().getCacheDir(),"ZhiBookCache");
        Cache cache = new Cache(cacheFile,1024*1024*50);*/
        sClient = new OkHttpClient.Builder()
                .connectTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)
                .writeTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)
                .readTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)
                /*.addInterceptor(new Interceptor() {
                    @Override
                    public Response intercept(Chain chain) throws IOException {
                        Request request = chain.request()
                                .newBuilder()
                                .addHeader("User-Agent", "eagleLottery/" + CommonUtils.getAppVersionName(MyApplication.getApp()) + "(" + CommonUtils.getPhoneName() + "/")
                                .addHeader("Content-Type", "application/x-www-form-urlencoded")
                                .build();
                        return chain.proceed(request);
                    }
                })*/
               .addInterceptor(new InterceptorResponse())
                .addInterceptor(
                        new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
                            @Override
                            public void log(String message) {
                                //打印retrofit日志
                                Log.i("RetrofitLog","retrofitBack = "+message);
                            }
                        }).setLevel(HttpLoggingInterceptor.Level.BODY))
                .retryOnConnectionFailure(true)
                .sslSocketFactory(createSSLSocketFactory(),new TrustAllCerts())
                .build();
        sRetrefitA = new Retrofit.Builder()
                .client(sClient)
                .baseUrl(BASE_URL_A)
                .addConverterFactory(GsonConverterFactoryM.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        sRetrefitB = new Retrofit.Builder()
                .client(sClient)
                .baseUrl(BASE_URL_B)
                .addConverterFactory(GsonConverterFactoryM.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
    }

    public static <T> T createServiceA(Class<T> serviceClazz) {

        return sRetrefitA.create(serviceClazz);
    }

    public static <T> T createServiceB(Class<T> serviceClazz) {

        return sRetrefitB.create(serviceClazz);
    }
    public static SSLSocketFactory createSSLSocketFactory() {
        SSLSocketFactory ssfFactory = null;

        try {
            SSLContext sc = SSLContext.getInstance("TLS");
            sc.init(null, new TrustManager[]{new TrustAllCerts()}, new SecureRandom());

            ssfFactory = sc.getSocketFactory();
        } catch (Exception e) {
        }

        return ssfFactory;
    }
    /**
     * 向外部提供api请求
     *
     * @return
     */
    public static LotteryService movieApiA() {
        return ServiceFactory.createServiceA(LotteryService.class);
    }
    public static LotteryService movieApiB() {
        return ServiceFactory.createServiceB(LotteryService.class);
    }

}
