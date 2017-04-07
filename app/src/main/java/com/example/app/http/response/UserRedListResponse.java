package com.example.app.http.response;

import java.util.List;

/**
 * Created by wanxin on 16/12/3.
 */

public class UserRedListResponse {
    //红包类型
    public static final int OVER = -1;//过期或者用完
    public static final int VALID = 0;//在有效期红包
    public static final int INVALID = 1;//未生效红包

    /**
     * red_balance : 81
     * red_memo : {"memo":"其中9元即将过期","color":"cd1d1b"}
     * red_ad_img : http://7vzspj.com1.z0.glb.clouddn.com/maihongbao.png
     * red_ad_url : null
     * red_ad_content : 买幸运红包，花500得505
     * no_red_content : ["没红包这事儿合适吗？","暂无红包"]
     * red_list : [{"fid":"8020160913140923186653494","balance":"6元","red_amount":"6元","balance_num":600,"red_name":"彩球送68元开运红包\n满30元可用","pay_name":"满30元减6元","show_name":"6元 (满30元减6元)","red_recommend":0,"red_line_color":"999999","red_left_date_color":"","red_memo":"","red_flg":1,"red_left_date":"16年12月01日生效"}]
     * show_more : 0
     * page : 3
     */

    private String red_balance;
//    private RedMemoBean red_memo;
    private Object red_memo;
    private String red_ad_img;
    private Object red_ad_url;
    private String red_ad_content;
    private String show_more;
    private int page;
    private List<String> no_red_content;
    private List<RedListBean> red_list;

    public String getRed_balance() {
        return red_balance;
    }

    public void setRed_balance(String red_balance) {
        this.red_balance = red_balance;
    }

    public Object getRed_memo() {
        return red_memo;
    }

    public void setRed_memo(Object red_memo) {
        this.red_memo = red_memo;
    }

    public String getRed_ad_img() {
        return red_ad_img;
    }

    public void setRed_ad_img(String red_ad_img) {
        this.red_ad_img = red_ad_img;
    }

    public Object getRed_ad_url() {
        return red_ad_url;
    }

    public void setRed_ad_url(Object red_ad_url) {
        this.red_ad_url = red_ad_url;
    }

    public String getRed_ad_content() {
        return red_ad_content;
    }

    public void setRed_ad_content(String red_ad_content) {
        this.red_ad_content = red_ad_content;
    }

    public String getShow_more() {
        return show_more;
    }

    public void setShow_more(String show_more) {
        this.show_more = show_more;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public List<String> getNo_red_content() {
        return no_red_content;
    }

    public void setNo_red_content(List<String> no_red_content) {
        this.no_red_content = no_red_content;
    }

    public List<RedListBean> getRed_list() {
        return red_list;
    }

    public void setRed_list(List<RedListBean> red_list) {
        this.red_list = red_list;
    }

//    public static class RedMemoBean {
//        /**
//         * memo : 其中9元即将过期
//         * color : cd1d1b
//         */
//
//        private String memo;
//        private String color;
//
//        public String getMemo() {
//            return memo;
//        }
//
//        public void setMemo(String memo) {
//            this.memo = memo;
//        }
//
//        public String getColor() {
//            return color;
//        }
//
//        public void setColor(String color) {
//            this.color = color;
//        }
//    }

    public static class RedListBean {
        /**
         * fid : 8020160913140923186653494
         * balance : 6元
         * red_amount : 6元
         * balance_num : 600
         * red_name : 彩球送68元开运红包
         * 满30元可用
         * pay_name : 满30元减6元
         * show_name : 6元 (满30元减6元)
         * red_recommend : 0
         * red_line_color : 999999
         * red_left_date_color :
         * red_memo :
         * red_flg : 1
         * red_left_date : 16年12月01日生效
         */

        private String fid;
        private String balance;
        private String red_amount;
        private int balance_num;
        private String red_name;
        private String pay_name;
        private String show_name;
        private int red_recommend;
        private String red_line_color;
        private String red_left_date_color;
        private String red_memo;
        private int red_flg = OVER;
        private String red_left_date;

        public String getFid() {
            return fid;
        }

        public void setFid(String fid) {
            this.fid = fid;
        }

        public String getBalance() {
            return balance;
        }

        public void setBalance(String balance) {
            this.balance = balance;
        }

        public String getRed_amount() {
            return red_amount;
        }

        public void setRed_amount(String red_amount) {
            this.red_amount = red_amount;
        }

        public int getBalance_num() {
            return balance_num;
        }

        public void setBalance_num(int balance_num) {
            this.balance_num = balance_num;
        }

        public String getRed_name() {
            return red_name;
        }

        public void setRed_name(String red_name) {
            this.red_name = red_name;
        }

        public String getPay_name() {
            return pay_name;
        }

        public void setPay_name(String pay_name) {
            this.pay_name = pay_name;
        }

        public String getShow_name() {
            return show_name;
        }

        public void setShow_name(String show_name) {
            this.show_name = show_name;
        }

        public int getRed_recommend() {
            return red_recommend;
        }

        public void setRed_recommend(int red_recommend) {
            this.red_recommend = red_recommend;
        }

        public String getRed_line_color() {
            return red_line_color;
        }

        public void setRed_line_color(String red_line_color) {
            this.red_line_color = red_line_color;
        }

        public String getRed_left_date_color() {
            return red_left_date_color;
        }

        public void setRed_left_date_color(String red_left_date_color) {
            this.red_left_date_color = red_left_date_color;
        }

        public String getRed_memo() {
            return red_memo;
        }

        public void setRed_memo(String red_memo) {
            this.red_memo = red_memo;
        }

        public int getRed_flg() {
            return red_flg;
        }

        public void setRed_flg(int red_flg) {
            this.red_flg = red_flg;
        }

        public String getRed_left_date() {
            return red_left_date;
        }

        public void setRed_left_date(String red_left_date) {
            this.red_left_date = red_left_date;
        }
    }
}
