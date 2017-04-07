package com.example.app.http.response;

import java.util.List;

/**
 * Created by wanxin on 16/12/3.
 */

public class RedDetailResponse {

    /**
     * red_balance : 305
     * red_table : [{"title":"类目","content":"彩球305元幸运红包"},{"title":"总金额","content":"305元"},{"title":"生效时间","content":"2016年11月26日 16点19分"},{"title":"有效期限","content":"2017年2月24日 23点59分"}]
     * red_status : 0
     * red_button : {"button_text":"去投注","button_action":"match_detail"}
     */

    private String red_balance;
    private int red_status;
    private RedButtonBean red_button;
    private List<RedTableBean> red_table;

    public String getRed_balance() {
        return red_balance;
    }

    public void setRed_balance(String red_balance) {
        this.red_balance = red_balance;
    }

    public int getRed_status() {
        return red_status;
    }

    public void setRed_status(int red_status) {
        this.red_status = red_status;
    }

    public RedButtonBean getRed_button() {
        return red_button;
    }

    public void setRed_button(RedButtonBean red_button) {
        this.red_button = red_button;
    }

    public List<RedTableBean> getRed_table() {
        return red_table;
    }

    public void setRed_table(List<RedTableBean> red_table) {
        this.red_table = red_table;
    }

    public static class RedButtonBean {
        /**
         * button_text : 去投注
         * button_action : match_detail
         */

        private String button_text;
        private String button_action;

        public String getButton_text() {
            return button_text;
        }

        public void setButton_text(String button_text) {
            this.button_text = button_text;
        }

        public String getButton_action() {
            return button_action;
        }

        public void setButton_action(String button_action) {
            this.button_action = button_action;
        }
    }

    public static class RedTableBean {
        /**
         * title : 类目
         * content : 彩球305元幸运红包
         */

        private String title;
        private String content;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }
    }
}
