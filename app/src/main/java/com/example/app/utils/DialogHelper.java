package com.example.app.utils;

import android.content.Context;

/**
 * 网络请求加载
 */
public class DialogHelper {

    private static android.app.AlertDialog alertDialog = null;

    /**
     * 启动进度条
     */
    public static void showProgressDlg(Context ctx) {

        if (null == alertDialog) {
            if (ctx == null) {
                return;
            }
           /* View layout = LayoutInflater.from(ctx).inflate(R.layout.dialog_http_send, null);
            android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(ctx, R.style.dialogTransparent);
            alertDialog = builder.create();
            alertDialog.show();
            alertDialog.setContentView(layout);
            LoadFlower loadFlower = (LoadFlower)layout.findViewById(R.id.loadFlower);
            loadFlower.setBgColor(Color.TRANSPARENT);
            loadFlower.startAnimation();
            alertDialog.setCancelable(false);*/

        }
    }


    /**
     * 结束进度条
     */
    public static void stopProgressDlg() {
        if (null != alertDialog && alertDialog.isShowing()) {
            alertDialog.dismiss();
            alertDialog = null;
        }
    }

}
