package com.example.app;

import android.app.Application;
import android.content.Context;


/**
 * Created by guoxiao on 17/4/7.
 */

public class MyApplication extends Application {

    public Boolean isNewAppVersion = false;
    private static MyApplication application;
    public static Context context;


    @Override
    public void onCreate() {
        super.onCreate();
        application = this;
        context = getApplicationContext();
    }

    public static MyApplication getApp() {
        return application;
    }

}
