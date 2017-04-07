package com.example.app.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/**
 * Created by guoxiao on 17/2/28.
 */

public class AppUpgrade {

    public static void setAppUpgrade(Context context, String url) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse(url));
        context.startActivity(intent);
    }
}
