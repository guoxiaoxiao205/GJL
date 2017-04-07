package com.example.app.utils;


/**
 * Created by wanxin on 16/12/14.
 */

public class GameIntent {

 /*   public static final String K3 = "kuai3";
    public static final String D11 = "d11";
    public static final String Ssq="ssq";
    public static final String Dlt="dlt";*/
 /*   public static void intentGame(final Activity context, final String gameEn) {
        if (CommonUtils.isFastClick())
            return ;
        new Handler().postDelayed(new Runnable() {
            public void run() {
                Intent intent = new Intent();
                String game = gameEn.toLowerCase();
                if (game.contains(K3)) {
                    intent.setClass(context.getApplicationContext(), Fast3Activity.class);
                } else if (game.contains(D11)) {
                    intent.setClass(context.getApplicationContext(), D11Activity.class);
                }else if (game.contains(Ssq)){
                    intent.setClass(context.getApplicationContext(), SsqActivity.class);
                }else if (game.contains(Dlt)){
                    intent.setClass(context.getApplicationContext(), DltActivity.class);
                }else{
                    return;
                }
                intent.putExtra(ParamMapKey.GAMEEN, gameEn);
                context.startActivity(intent);
                context.overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }

        }, 100);*/




/*   public static void intentGame(final Activity context, final String gameEn) {
        if (CommonUtils.isFastClick())
            return ;
        new Handler().postDelayed(new Runnable() {
            public void run() {
                Intent intent =GameIntent.intentGameName(context,gameEn);
                intent.putExtra(ParamMapKey.GAMEEN, gameEn);
                context.startActivity(intent);
                context.overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }

        }, 100);

    }
    public static Intent intentGameName(Context context , String gameEn){
        Intent intent = new Intent();
        String game = gameEn.toLowerCase();
              if (game.contains(K3)) {
                    intent.setClass(context.getApplicationContext(), Fast3Activity.class);
                } else if (game.contains(D11)) {
                    intent.setClass(context.getApplicationContext(), D11Activity.class);
                }else if (game.contains(Ssq)){
                    intent.setClass(context.getApplicationContext(), SsqActivity.class);
                }else if (game.contains(Dlt)){
                    intent.setClass(context.getApplicationContext(), DltActivity.class);
                }
        intent.putExtra(ParamMapKey.GAMEEN, gameEn);
        return intent;
    }*/
}