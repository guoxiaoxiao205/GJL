package com.example.app.utils;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.WindowManager;
import android.widget.EditText;


import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by wanxin on 16/9/14.
 * 单位转换获取手机信息工具类
 */
public class CommonUtils {

    private CommonUtils() {
        throw new UnsupportedOperationException("cannot be instantiated");
    }

    //单位转化

    /**
     * dp转px
     *
     * @param context Context
     * @param dpVal   dp数值
     */
    public static int dp2px(Context context, float dpVal) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpVal * scale + 0.5f);
    }

    /**
     * sp转px
     *
     * @param context Context
     * @param spVal   sp数值
     */
    public static int sp2px(Context context, float spVal) {
        final float fontScale = context.getResources().getDisplayMetrics().scaledDensity;
        return (int) (spVal * fontScale + 0.5f);
    }

    /**
     * px转dp
     *
     * @param context Context
     * @param pxVal   px数值
     */
    public static int px2dp(Context context, float pxVal) {
        return (int) (pxVal / context.getResources().getDisplayMetrics().density + 0.5f);
    }


    /**
     * px转sp
     *
     * @param context Context
     * @param pxVal   px数值
     */
    public static int px2sp(Context context, float pxVal) {
        return (int) (pxVal / context.getResources().getDisplayMetrics().scaledDensity + 0.5f);
    }


    /**
     * 获取友盟的渠道名称
     */
    public static String getUMChannelName() {
       /* try {
            ApplicationInfo appInfo = MyApplication.getApp().getPackageManager()
                    .getApplicationInfo(MyApplication.getApp().getPackageName(),
                            PackageManager.GET_META_DATA);
            LogUtil.d("当前渠道为==》", appInfo.metaData.getString("UMENG_CHANNEL"));
            return appInfo.metaData.getString("UMENG_CHANNEL");
        } catch (Exception e) {
            e.printStackTrace();
            return "others";
        }*/
        return"";
    }


    /**
     *
     * 获取手机WLAN MAC 地址
     *
     * @param context Context
     */
    @SuppressLint("HardwareIds")
    private static String getPhoneMacId(Context context) {
        WifiManager wifi = (WifiManager) context.getSystemService(Context.WIFI_SERVICE);
        WifiInfo info = wifi.getConnectionInfo();
        return info.getMacAddress();
    }

    /**
     * 获取手机 IMEI 仅仅只对Android手机有效
     *
     * @param context Context
     */
    public static String getPhoneIMEI(Context context) {
        try {
            TelephonyManager TelephonyMgr = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
            String szImei = TelephonyMgr.getDeviceId();
            return szImei;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    /**
     * 获取手机唯一标识
     *
     * @param context Context
     */
    public static String getPhoneId(Context context) {
        return getMD5Str(getPhoneIMEI(context) + getPhoneMacId(context));
    }

    /**
     * 获取手机 名称+型号
     */
    public static String getPhoneName() {
        return Build.MANUFACTURER + " " + Build.MODEL;
    }


    /**
     * 获取应用程序版本名称
     *
     * @param context Context
     */
    public static String getAppVersionName(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(
                    context.getPackageName(), 0);
            return packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 获取应用程序版本号
     *
     * @param context Context
     */
    public static String getAppVersionCode(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(
                    context.getPackageName(), 0);
            return packageInfo.versionCode + "";
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 判断网络是否连接
     *
     * @param context Context
     */
    public static boolean isConnected(Context context) {
        ConnectivityManager connectivity = (ConnectivityManager) context
                .getSystemService(Context.CONNECTIVITY_SERVICE);
        if (null != connectivity) {
            NetworkInfo info = connectivity.getActiveNetworkInfo();
            if (null != info && info.isConnected()) {
                if (info.getState() == NetworkInfo.State.CONNECTED) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 判断是否是wifi连接
     *
     * @param context
     */
    public static boolean isWifi(Context context) {
        ConnectivityManager cm = (ConnectivityManager) context
                .getSystemService(Context.CONNECTIVITY_SERVICE);
        return cm != null && cm.getActiveNetworkInfo().getType() == ConnectivityManager.TYPE_WIFI;
    }


    /**
     * 获取MD5加密字符串
     *
     * @param str 被加密的字符串
     */
    public static String getMD5Str(String str) {
        MessageDigest messageDigest = null;

        try {
            messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(str.getBytes("UTF-8"));
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        byte[] byteArray = messageDigest.digest();

        StringBuffer md5StrBuff = new StringBuffer();

        for (byte b : byteArray) {
            if (Integer.toHexString(0xFF & b).length() == 1)
                md5StrBuff.append("0").append(Integer.toHexString(0xFF & b));
            else
                md5StrBuff.append(Integer.toHexString(0xFF & b));
        }
        return md5StrBuff.toString();
    }


    /**
     * Decode字符串
     *
     * @param str 被Decode的字符串
     */
    public static String getDecoderStr(String str) {
        try {
            return URLDecoder.decode(str, "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return "";
        }
    }

    /**
     * Encoder 字符串
     *
     * @param string 被Encoder的字符串
     */
    private static String getEncoderStr(String string) {
        try {
            return URLEncoder.encode(string, "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return "";
        }
    }

    /**
     * 生成随机数字和字母
     *
     * @param length 生成随机字符串的个数
     */
    public static String getStringRandom(int length) {
        String val = "";
        Random random = new Random();
        //参数length，表示生成几位随机数
        for (int i = 0; i < length; i++) {
            String charOrNum = random.nextInt(2) % 2 == 0 ? "char" : "num";
            //输出字母还是数字
            if ("char".equalsIgnoreCase(charOrNum)) {
                //输出是大写字母还是小写字母
                int temp = random.nextInt(2) % 2 == 0 ? 65 : 97;
                val += (char) (random.nextInt(26) + temp);
            } else if ("num".equalsIgnoreCase(charOrNum)) {
                val += String.valueOf(random.nextInt(10));
            }
        }
        return val;
    }

    /**
     * 获取当前时间戳字符串
     */
    public static String getCurrentTimeMillis() {
        long currentTime = System.currentTimeMillis();
        String str = String.valueOf(currentTime);
        return str.substring(0, 10);
    }

    /**
     * 给TextView设置部分文字颜色
     *
     * @param showStr         字符串
     * @param foregroundColor 部分文字颜色
     * @param start           部分文字颜色开始
     * @param end             部分文字颜色结束
     */
    public static SpannableStringBuilder getTextColorBuilder(String showStr, int foregroundColor, int start, int end) {
        if (start >= end) {
            return new SpannableStringBuilder(showStr);
        } else if (end > showStr.length()) {
            return new SpannableStringBuilder(showStr);
        } else {
            SpannableStringBuilder builder = new SpannableStringBuilder(showStr);
            ForegroundColorSpan redSpan = new ForegroundColorSpan(foregroundColor);
            builder.setSpan(redSpan, start, end, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            return builder;
        }
    }


    public static Bitmap drawableIdToBitmap(Context context, int id) {
        return BitmapFactory.decodeResource(context.getResources(), id);
    }


    /**
     * 检查EditText输入手机号合法 true为合法
     */
    public static boolean checkPhoneYes(EditText et_Phone) {
        String phone = et_Phone.getText().toString();
        return !TextUtils.isEmpty(phone) && et_Phone.length() == 11;
    }


    /**
     * 校验输入 true 表示合法   false 表示不合法
     */
    public static boolean checkInputYes(String string) {
        String regEx = "[`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(string);
        return !m.find() && string.length() > 1;
    }

    //星号替换银行卡号
    public static String getBankCardFormat(String cardNo) {
        if (cardNo.length() > 4) {
            return "************ " + cardNo.substring(cardNo.length() - 4, cardNo.length());
        } else {
            return cardNo;
        }
    }

    /**
     * 校验银行卡卡号
     * return true代表成功
     */
    public static boolean checkBankCard(String cardId) {
        if (cardId.matches("0*") || cardId.length() < 16) {
            return false;
        }
        char bit = getBankCardCheckCode(cardId.substring(0, cardId.length() - 1));
        return cardId.charAt(cardId.length() - 1) == bit;
    }

    /**
     * 从不含校验位的银行卡卡号采用 Luhm 校验算法获得校验位
     */
    public static char getBankCardCheckCode(String nonCheckCodeCardId) {
        char[] chs = nonCheckCodeCardId.trim().toCharArray();
        int luhmSum = 0;
        for (int i = chs.length - 1, j = 0; i >= 0; i--, j++) {
            int k = chs[i] - '0';
            if (j % 2 == 0) {
                k *= 2;
                k = k / 10 + k % 10;
            }
            luhmSum += k;
        }
        return (luhmSum % 10 == 0) ? '0' : (char) ((10 - luhmSum % 10) + '0');
    }


    /**
     * 加工手机号
     *
     * @param phoneNum
     * @return
     */
    public static String starPhone(String phoneNum) {
        if (phoneNum.length() == 11) {
            StringBuffer str = new StringBuffer(phoneNum);
            str = str.replace(3, 7, "****");
            return str.toString();
        } else {
            return phoneNum;
        }
    }

    /**
     * 加工身份证号
     *
     * @param cardCode
     * @return
     */
    public static String starCardCode(String cardCode) {
        return cardCode.charAt(0)
                + "***************" +
                cardCode.charAt(cardCode.length() - 1);
    }

    /**
     * 返回List<String> 的字符串的MD5
     *
     * @param list
     * @return
     */
    public static String getListMD5String(List<String> list) {
        String num = "";
        for (String number : list) {
            num += number;
        }
        return getMD5Str(num);
    }


    /**
     * 设置添加屏幕的背景透明度
     *
     * @param bgAlpha
     */
    public static void setActivityAlpha(Activity context, float bgAlpha) {
        WindowManager.LayoutParams lp = context.getWindow().getAttributes();
        lp.alpha = bgAlpha;
        context.getWindow().addFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);
        context.getWindow().setAttributes(lp);
    }

    //防止按钮连续点击
    private static long lastClickTime;

    public synchronized static boolean isFastClick() {
        long time = System.currentTimeMillis();
        if (time - lastClickTime < 600) {
            return true;
        }
        lastClickTime = time;
        return false;
    }

    /**
     * 字符串URLEncoder并且Base64
     */
    public static String getEncodeAndBase64(String str) {
        String result = "";
        try {
            result = URLEncoder.encode(str, "utf-8");
            result = Base64.encode(result.getBytes());
            result = URLEncoder.encode(result, "utf-8");
        } catch (Exception e) {
            e.printStackTrace();
        }


        return result;
    }

    /**
     * 手机号是否合法
     */
    public static boolean checksStrMobileIsOK(String str) {
        return !TextUtils.isEmpty(str) && str.length() == 11;
    }

    /**
     * 去除字符串 没有的小数点 和 0
     */
    public static String removeZero(String s) {
        if (s.indexOf(".") > 0) {
            //正则表达
            s = s.replaceAll("0+?$", "");//去掉后面无用的零
            return s.replaceAll("[.]$", "");//如小数点后面全是零则去掉小数点
        }
        return s;
    }

    /**
     * 打客服电话
     */
    public static void callCustomerMobile(Context context) {
        /*try {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:" + context.getResources().getString(R.string.phone)));
            ComponentName cn = intent.resolveActivity(context.getPackageManager());
            if (cn != null) {
                context.startActivity(intent);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }*/
    }
    public static String getAppPackage() {
       /* try {
            String pkName = MyApplication.getApp().getApplicationContext().getPackageName();
            return pkName;
        } catch (Exception e) {
        }*/
        return null;
    }

}
