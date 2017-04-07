package com.example.app.utils;

import android.os.Handler;
import android.os.Message;

/**
 * Created by guoxiao on 16/12/12.
 */

public class RealRequest {
   private RealRequestIn realRequestIn;
    private Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (msg.obj!=null)
                realRequestIn.realHttpRequset((String) msg.obj);
        }
    };

    public interface RealRequestIn {
        void  realHttpRequset(String url);
    }
    /***
     * 实时请求
     * @param time 时常
     * @param url
     */
    public  void startRealRequest(int time,String url){
        Message message=new Message();
        message.obj=url;
        handler.sendMessageDelayed(message, time*1000);
    }


}