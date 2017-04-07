package com.example.app.http.response;

import java.io.Serializable;
import java.util.List;

/**
 * Created by wanxin on 16/11/24.
 */

public class SelectUserBankCardResponse{

    /**
     * user_id : 01445521690334915078
     * channel_type : 3
     * channel_infos : [{"real_name":"玩心","card_no":"6225768789137252","bank_short_name":"招商银行","issuer_bank_province":"广东省","issuer_bank_city":"深圳市","sub_bank_name":"招商银行","bank_img_url":"http://7vzspj.com2.z0.glb.qiniucdn.com/cardbin%2F%E6%8B%9B%E5%95%86.png","card_type":2,"status":"1","withdraw_memo":"预计一个工作日内到账","mobile":"15210813371"}]
     * bound_count : 3
     * create_time : 2016-06-23 10:36:30 +0800
     * create_user : 01445521690334915078
     * update_user : 01445521690334915078
     * update_time : 2016-07-07 12:33:53 +0800
     * unbound_count : 0
     * unbound_infos : []
     * real_name : null
     * card_code : null
     */

    private String user_id;
    private int channel_type;
    private int bound_count;
    private String create_time;
    private String create_user;
    private String update_user;
    private String update_time;
    private int unbound_count;
    private Object real_name;
    private Object card_code;
    private List<ChannelInfosBean> channel_infos;
    private List<?> unbound_infos;

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public int getChannel_type() {
        return channel_type;
    }

    public void setChannel_type(int channel_type) {
        this.channel_type = channel_type;
    }

    public int getBound_count() {
        return bound_count;
    }

    public void setBound_count(int bound_count) {
        this.bound_count = bound_count;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getCreate_user() {
        return create_user;
    }

    public void setCreate_user(String create_user) {
        this.create_user = create_user;
    }

    public String getUpdate_user() {
        return update_user;
    }

    public void setUpdate_user(String update_user) {
        this.update_user = update_user;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }

    public int getUnbound_count() {
        return unbound_count;
    }

    public void setUnbound_count(int unbound_count) {
        this.unbound_count = unbound_count;
    }

    public Object getReal_name() {
        return real_name;
    }

    public void setReal_name(Object real_name) {
        this.real_name = real_name;
    }

    public Object getCard_code() {
        return card_code;
    }

    public void setCard_code(Object card_code) {
        this.card_code = card_code;
    }

    public List<ChannelInfosBean> getChannel_infos() {
        return channel_infos;
    }

    public void setChannel_infos(List<ChannelInfosBean> channel_infos) {
        this.channel_infos = channel_infos;
    }

    public List<?> getUnbound_infos() {
        return unbound_infos;
    }

    public void setUnbound_infos(List<?> unbound_infos) {
        this.unbound_infos = unbound_infos;
    }

    public static class ChannelInfosBean implements Serializable {
        /**
         * real_name : 玩心
         * card_no : 6225768789137252
         * bank_short_name : 招商银行
         * issuer_bank_province : 广东省
         * issuer_bank_city : 深圳市
         * sub_bank_name : 招商银行
         * bank_img_url : http://7vzspj.com2.z0.glb.qiniucdn.com/cardbin%2F%E6%8B%9B%E5%95%86.png
         * card_type : 2
         * status : 1
         * withdraw_memo : 预计一个工作日内到账
         * mobile : 15210813371
         */

        private String real_name;
        private String card_no;
        private String bank_short_name;
        private String issuer_bank_province;
        private String issuer_bank_city;
        private String sub_bank_name;
        private String bank_img_url;
        private int card_type;
        private String status;
        private String withdraw_memo;
        private String mobile;

        public String getReal_name() {
            return real_name;
        }

        public void setReal_name(String real_name) {
            this.real_name = real_name;
        }

        public String getCard_no() {
            return card_no;
        }

        public void setCard_no(String card_no) {
            this.card_no = card_no;
        }

        public String getBank_short_name() {
            return bank_short_name;
        }

        public void setBank_short_name(String bank_short_name) {
            this.bank_short_name = bank_short_name;
        }

        public String getIssuer_bank_province() {
            return issuer_bank_province;
        }

        public void setIssuer_bank_province(String issuer_bank_province) {
            this.issuer_bank_province = issuer_bank_province;
        }

        public String getIssuer_bank_city() {
            return issuer_bank_city;
        }

        public void setIssuer_bank_city(String issuer_bank_city) {
            this.issuer_bank_city = issuer_bank_city;
        }

        public String getSub_bank_name() {
            return sub_bank_name;
        }

        public void setSub_bank_name(String sub_bank_name) {
            this.sub_bank_name = sub_bank_name;
        }

        public String getBank_img_url() {
            return bank_img_url;
        }

        public void setBank_img_url(String bank_img_url) {
            this.bank_img_url = bank_img_url;
        }

        public int getCard_type() {
            return card_type;
        }

        public void setCard_type(int card_type) {
            this.card_type = card_type;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getWithdraw_memo() {
            return withdraw_memo;
        }

        public void setWithdraw_memo(String withdraw_memo) {
            this.withdraw_memo = withdraw_memo;
        }

        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }
    }
}
