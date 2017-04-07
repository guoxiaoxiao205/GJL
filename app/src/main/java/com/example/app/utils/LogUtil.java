package com.example.app.utils;

import android.util.Log;

import java.util.Arrays;
import java.util.List;

/**
 * Created by wanxin on 16/9/14.
 * log工具类
 */
public class LogUtil {

    private static boolean logCanPrint;

    private LogUtil() {
        throw new UnsupportedOperationException("cannot be instantiated");
    }

    /**
     * 获取日志是否允许打印
     *
     * @return 日志是否允许打印
     */
    public static boolean isLogCanPrint() {
        return logCanPrint;
    }

    /**
     * 设置log是否允许打印
     *
     * @param logCanPrintFlag true为打印log,false不打印log
     */
    public static void setLogCanPrint(boolean logCanPrintFlag) {
        logCanPrint = logCanPrintFlag;
    }

    /**
     * 打印字符串日志 String
     *
     * @param tag 日志TAG
     * @param msg 日志内容
     */
    public static void d(String tag, String msg) {
        if (logCanPrint) {
            Log.d(tag, msg);
        }

    }

    /**
     * 打印整形日志 int
     *
     * @param tag 日志TAG
     * @param msg 日志内容
     */
    public static void d(String tag, int msg) {
        if (logCanPrint) {
            Log.d(tag, msg + "");
        }

    }

    /**
     * 打印浮点型日志 float
     *
     * @param tag 日志TAG
     * @param msg 日志内容
     */
    public static void d(String tag, float msg) {
        if (logCanPrint) {
            Log.d(tag, msg + "");
        }

    }

    /**
     * 打印字符串数组日志 String[]
     *
     * @param tag   日志TAG
     * @param array 日志内容
     */
    public static void d(String tag, String[] array) {
        if (logCanPrint) {
            Log.d(tag, Arrays.toString(array));
        }

    }

    /**
     * 打印整形数组日志 int[]
     *
     * @param tag   日志TAG
     * @param array 日志内容
     */
    public static void d(String tag, int[] array) {
        if (logCanPrint) {
            Log.d(tag, Arrays.toString(array));
        }

    }

    /**
     * 打印列表日志 List
     *
     * @param tag  日志TAG
     * @param list 日志内容
     */
    public static void d(String tag, List list) {
        if (logCanPrint) {
            Log.d(tag, list.toString());
        }

    }
}
