package com.example.app.utils;

/**
 * Created by wanxin on 17/2/14.
 */

public class FontIconNum {
    /**
     * 字符串转换unicode
     */
    public static String num2Unicode(String string) {

        StringBuilder unicode = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {

            // 取出每一个字符
            char c = string.charAt(i);
            switch (c){
                case '1':
                    unicode.append("\ue60b");
                    break;
                case '2':
                    unicode.append("\ue60f");
                    break;
                case '3':
                    unicode.append("\ue60d");
                    break;
                case '4':
                    unicode.append("\ue610");
                    break;
                case '5':
                    unicode.append("\ue613");
                    break;
                case '6':
                    unicode.append("\ue612");
                    break;
                case '7':
                    unicode.append("\ue611");
                    break;
                case '8':
                    unicode.append("\ue614");
                    break;
                case '9':
                    unicode.append("\ue615");
                    break;
                case '0':
                    unicode.append("\ue60c");
                    break;
                case ':':
                    unicode.append("\ue60e");
                    break;
            }

        }

        return unicode.toString();
    }
}
