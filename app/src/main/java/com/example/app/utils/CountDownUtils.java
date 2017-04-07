package com.example.app.utils;

import android.os.CountDownTimer;


/**
 * Created by wanxin on 16/12/14.
 */

public class CountDownUtils extends CountDownTimer {

    private ClockListener mClockListener=null;

    public CountDownUtils(long second, ClockListener clockListener) {
        super(second * 1000, 1000); //间隔1秒
        this.mClockListener =null;
        this.mClockListener = clockListener;
    }

    @Override
    public void onTick(long millisUntilFinished) {
        mClockListener.onTick(second2Time(millisUntilFinished / 1000));
        mClockListener.remainFiveMinutes((int) (millisUntilFinished / 1000));
    }

    @Override
    public void onFinish() {
        mClockListener.timeEnd();
    }

    public interface ClockListener {
        void timeEnd();

        //09:06
        void onTick(String time);

        void remainFiveMinutes(int n);

    }


    private String second2Time(long totalSecond) {
        long hour = totalSecond / 3600;    //小时
        long minute = totalSecond % 3600 / 60;  //分钟
        long second = totalSecond % 60;  //秒
        String hourStr = hour < 10 ? "0" + hour : "" + hour;
        String minuteStr = minute < 10 ? "0" + minute : "" + minute;
        String secondStr = second < 10 ? "0" + second : "" + second;
        if (hour > 0) {
            return hourStr + ":" + minuteStr + ":" + secondStr;
        } else {
            return minuteStr + ":" + secondStr;
        }

    }

}
