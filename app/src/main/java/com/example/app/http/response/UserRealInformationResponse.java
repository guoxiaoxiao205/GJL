package com.example.app.http.response;

/**
 * Created by wanxin on 16/11/28.
 */

public class UserRealInformationResponse {

    /**
     * login_token : {"user_id":"01445521690334915078","token":"ofm+SqfPCeXAPp+MwQnz//Qw38Q=","ip":"61.50.105.186","device_id":"524258e4ab8ef0ad3aaa6e4e6185b417","device_name":"Meizu m1 note","device_token":"ec3c6a42b730f141b51d6c54eca33011","idfa":null,"client_type":0,"create_time":"2016-11-24 19:07:40 +0800","elapse_time":"2017-11-24 19:07:40 +0800","status":0,"app_type":0}
     * user_info : {"user_id":"01445521690334915078","mobile":"13121143026","oauth_id":"o6W2ZuKndB1oQGM-VS8vs_oLyFC4","third_id":"03","nick_name":"%E4%B8%87%E6%96%B0","bg_show_name":"万一","device_id":"524258e4ab8ef0ad3aaa6e4e6185b417","device_name":"Meizu m1 note","device_token":"ec3c6a42b730f141b51d6c54eca33011","imei":"866190025480023","city":null,"province":null,"country":"CN","sex":1,"head_img_url":"http://7vzspj.com2.z0.glb.qiniucdn.com/images/face/boy2.png","card_code":"110224199010025032","channel_id":"yingyongbao","client_type":0,"partner_id":null,"create_time":"2015-10-22 21:48:10 +0800","update_time":"2016-11-28 21:30:47 +0800","status":0,"is_vip":"0","last_sign_ip":"127.0.0.1","last_launch_time":"2016-11-28 11:11:34 +0800","change_nick_name_times":1,"change_head_img_times":1,"social_nick_name":null,"qq_id":null,"wx_id":null,"email":null,"real_name":"万新","card_image_url_front":null,"card_image_url_back":null,"blocked":"0","has_pwd":true,"has_pay_pwd":true,"free_pay_pwd_quota":200,"free_pay_pwd_status":0,"is_admin":false,"is_new":false}
     * account_info : {"account_balance":"1554元","red_balance":"305","fill_on_sale":1,"fill_button_name":"充值","fill_button_url":""}
     */

    private LoginTokenBean login_token;
    private UserInfoBean user_info;
    private AccountInfoBean account_info;

    public LoginTokenBean getLogin_token() {
        return login_token;
    }

    public void setLogin_token(LoginTokenBean login_token) {
        this.login_token = login_token;
    }

    public UserInfoBean getUser_info() {
        return user_info;
    }

    public void setUser_info(UserInfoBean user_info) {
        this.user_info = user_info;
    }

    public AccountInfoBean getAccount_info() {
        return account_info;
    }

    public void setAccount_info(AccountInfoBean account_info) {
        this.account_info = account_info;
    }

    public static class LoginTokenBean {
        /**
         * user_id : 01445521690334915078
         * token : ofm+SqfPCeXAPp+MwQnz//Qw38Q=
         * ip : 61.50.105.186
         * device_id : 524258e4ab8ef0ad3aaa6e4e6185b417
         * device_name : Meizu m1 note
         * device_token : ec3c6a42b730f141b51d6c54eca33011
         * idfa : null
         * client_type : 0
         * create_time : 2016-11-24 19:07:40 +0800
         * elapse_time : 2017-11-24 19:07:40 +0800
         * status : 0
         * app_type : 0
         */

        private String user_id;
        private String token;
        private String ip;
        private String device_id;
        private String device_name;
        private String device_token;
        private Object idfa;
        private int client_type;
        private String create_time;
        private String elapse_time;
        private int status;
        private int app_type;

        public String getUser_id() {
            return user_id;
        }

        public void setUser_id(String user_id) {
            this.user_id = user_id;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public String getIp() {
            return ip;
        }

        public void setIp(String ip) {
            this.ip = ip;
        }

        public String getDevice_id() {
            return device_id;
        }

        public void setDevice_id(String device_id) {
            this.device_id = device_id;
        }

        public String getDevice_name() {
            return device_name;
        }

        public void setDevice_name(String device_name) {
            this.device_name = device_name;
        }

        public String getDevice_token() {
            return device_token;
        }

        public void setDevice_token(String device_token) {
            this.device_token = device_token;
        }

        public Object getIdfa() {
            return idfa;
        }

        public void setIdfa(Object idfa) {
            this.idfa = idfa;
        }

        public int getClient_type() {
            return client_type;
        }

        public void setClient_type(int client_type) {
            this.client_type = client_type;
        }

        public String getCreate_time() {
            return create_time;
        }

        public void setCreate_time(String create_time) {
            this.create_time = create_time;
        }

        public String getElapse_time() {
            return elapse_time;
        }

        public void setElapse_time(String elapse_time) {
            this.elapse_time = elapse_time;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public int getApp_type() {
            return app_type;
        }

        public void setApp_type(int app_type) {
            this.app_type = app_type;
        }
    }

    public static class UserInfoBean {
        /**
         * user_id : 01445521690334915078
         * mobile : 13121143026
         * oauth_id : o6W2ZuKndB1oQGM-VS8vs_oLyFC4
         * third_id : 03
         * nick_name : %E4%B8%87%E6%96%B0
         * bg_show_name : 万一
         * device_id : 524258e4ab8ef0ad3aaa6e4e6185b417
         * device_name : Meizu m1 note
         * device_token : ec3c6a42b730f141b51d6c54eca33011
         * imei : 866190025480023
         * city : null
         * province : null
         * country : CN
         * sex : 1
         * head_img_url : http://7vzspj.com2.z0.glb.qiniucdn.com/images/face/boy2.png
         * card_code : 110224199010025032
         * channel_id : yingyongbao
         * client_type : 0
         * partner_id : null
         * create_time : 2015-10-22 21:48:10 +0800
         * update_time : 2016-11-28 21:30:47 +0800
         * status : 0
         * is_vip : 0
         * last_sign_ip : 127.0.0.1
         * last_launch_time : 2016-11-28 11:11:34 +0800
         * change_nick_name_times : 1
         * change_head_img_times : 1
         * social_nick_name : null
         * qq_id : null
         * wx_id : null
         * email : null
         * real_name : 万新
         * card_image_url_front : null
         * card_image_url_back : null
         * blocked : 0
         * has_pwd : true
         * has_pay_pwd : true
         * free_pay_pwd_quota : 200
         * free_pay_pwd_status : 0
         * is_admin : false
         * is_new : false
         */

        private String user_id;
        private String mobile;
        private String oauth_id;
        private String third_id;
        private String nick_name;
        private String bg_show_name;
        private String device_id;
        private String device_name;
        private String device_token;
        private String imei;
        private String city;
        private String province;
        private String country;
        private int sex;
        private String head_img_url;
        private String card_code;
        private String channel_id;
        private int client_type;
        private String partner_id;
        private String create_time;
        private String update_time;
        private int status;
        private String is_vip;
        private String last_sign_ip;
        private String last_launch_time;
        private int change_nick_name_times;
        private int change_head_img_times;
        private String social_nick_name;
        private String qq_id;
        private String wx_id;
        private String email;
        private String real_name;
        private String card_image_url_front;
        private String card_image_url_back;
        private String blocked;
        private boolean has_pwd;
        private boolean has_pay_pwd;
        private int free_pay_pwd_quota;
        private int free_pay_pwd_status;
        private boolean is_admin;
        private boolean is_new;

        public String getUser_id() {
            return user_id;
        }

        public void setUser_id(String user_id) {
            this.user_id = user_id;
        }

        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public String getOauth_id() {
            return oauth_id;
        }

        public void setOauth_id(String oauth_id) {
            this.oauth_id = oauth_id;
        }

        public String getThird_id() {
            return third_id;
        }

        public void setThird_id(String third_id) {
            this.third_id = third_id;
        }

        public String getNick_name() {
            return nick_name;
        }

        public void setNick_name(String nick_name) {
            this.nick_name = nick_name;
        }

        public String getBg_show_name() {
            return bg_show_name;
        }

        public void setBg_show_name(String bg_show_name) {
            this.bg_show_name = bg_show_name;
        }

        public String getDevice_id() {
            return device_id;
        }

        public void setDevice_id(String device_id) {
            this.device_id = device_id;
        }

        public String getDevice_name() {
            return device_name;
        }

        public void setDevice_name(String device_name) {
            this.device_name = device_name;
        }

        public String getDevice_token() {
            return device_token;
        }

        public void setDevice_token(String device_token) {
            this.device_token = device_token;
        }

        public String getImei() {
            return imei;
        }

        public void setImei(String imei) {
            this.imei = imei;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public int getSex() {
            return sex;
        }

        public void setSex(int sex) {
            this.sex = sex;
        }

        public String getHead_img_url() {
            return head_img_url;
        }

        public void setHead_img_url(String head_img_url) {
            this.head_img_url = head_img_url;
        }

        public String getCard_code() {
            return card_code;
        }

        public void setCard_code(String card_code) {
            this.card_code = card_code;
        }

        public String getChannel_id() {
            return channel_id;
        }

        public void setChannel_id(String channel_id) {
            this.channel_id = channel_id;
        }

        public int getClient_type() {
            return client_type;
        }

        public void setClient_type(int client_type) {
            this.client_type = client_type;
        }

        public String getPartner_id() {
            return partner_id;
        }

        public void setPartner_id(String partner_id) {
            this.partner_id = partner_id;
        }

        public String getCreate_time() {
            return create_time;
        }

        public void setCreate_time(String create_time) {
            this.create_time = create_time;
        }

        public String getUpdate_time() {
            return update_time;
        }

        public void setUpdate_time(String update_time) {
            this.update_time = update_time;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getIs_vip() {
            return is_vip;
        }

        public void setIs_vip(String is_vip) {
            this.is_vip = is_vip;
        }

        public String getLast_sign_ip() {
            return last_sign_ip;
        }

        public void setLast_sign_ip(String last_sign_ip) {
            this.last_sign_ip = last_sign_ip;
        }

        public String getLast_launch_time() {
            return last_launch_time;
        }

        public void setLast_launch_time(String last_launch_time) {
            this.last_launch_time = last_launch_time;
        }

        public int getChange_nick_name_times() {
            return change_nick_name_times;
        }

        public void setChange_nick_name_times(int change_nick_name_times) {
            this.change_nick_name_times = change_nick_name_times;
        }

        public int getChange_head_img_times() {
            return change_head_img_times;
        }

        public void setChange_head_img_times(int change_head_img_times) {
            this.change_head_img_times = change_head_img_times;
        }

        public String getSocial_nick_name() {
            return social_nick_name;
        }

        public void setSocial_nick_name(String social_nick_name) {
            this.social_nick_name = social_nick_name;
        }

        public String getQq_id() {
            return qq_id;
        }

        public void setQq_id(String qq_id) {
            this.qq_id = qq_id;
        }

        public String getWx_id() {
            return wx_id;
        }

        public void setWx_id(String wx_id) {
            this.wx_id = wx_id;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getReal_name() {
            return real_name;
        }

        public void setReal_name(String real_name) {
            this.real_name = real_name;
        }

        public String getCard_image_url_front() {
            return card_image_url_front;
        }

        public void setCard_image_url_front(String card_image_url_front) {
            this.card_image_url_front = card_image_url_front;
        }

        public String getCard_image_url_back() {
            return card_image_url_back;
        }

        public void setCard_image_url_back(String card_image_url_back) {
            this.card_image_url_back = card_image_url_back;
        }

        public String getBlocked() {
            return blocked;
        }

        public void setBlocked(String blocked) {
            this.blocked = blocked;
        }

        public boolean isHas_pwd() {
            return has_pwd;
        }

        public void setHas_pwd(boolean has_pwd) {
            this.has_pwd = has_pwd;
        }

        public boolean isHas_pay_pwd() {
            return has_pay_pwd;
        }

        public void setHas_pay_pwd(boolean has_pay_pwd) {
            this.has_pay_pwd = has_pay_pwd;
        }

        public int getFree_pay_pwd_quota() {
            return free_pay_pwd_quota;
        }

        public void setFree_pay_pwd_quota(int free_pay_pwd_quota) {
            this.free_pay_pwd_quota = free_pay_pwd_quota;
        }

        public int getFree_pay_pwd_status() {
            return free_pay_pwd_status;
        }

        public void setFree_pay_pwd_status(int free_pay_pwd_status) {
            this.free_pay_pwd_status = free_pay_pwd_status;
        }

        public boolean isIs_admin() {
            return is_admin;
        }

        public void setIs_admin(boolean is_admin) {
            this.is_admin = is_admin;
        }

        public boolean isIs_new() {
            return is_new;
        }

        public void setIs_new(boolean is_new) {
            this.is_new = is_new;
        }
    }

    public static class AccountInfoBean {
        /**
         * account_balance : 1554元
         * red_balance : 305
         * fill_on_sale : 1
         * fill_button_name : 充值
         * fill_button_url :
         */

        private String account_balance;
        private String red_balance;
        private int fill_on_sale;
        private String fill_button_name;
        private String fill_button_url;

        public String getAccount_balance() {
            return account_balance;
        }

        public void setAccount_balance(String account_balance) {
            this.account_balance = account_balance;
        }

        public String getRed_balance() {
            return red_balance;
        }

        public void setRed_balance(String red_balance) {
            this.red_balance = red_balance;
        }

        public int getFill_on_sale() {
            return fill_on_sale;
        }

        public void setFill_on_sale(int fill_on_sale) {
            this.fill_on_sale = fill_on_sale;
        }

        public String getFill_button_name() {
            return fill_button_name;
        }

        public void setFill_button_name(String fill_button_name) {
            this.fill_button_name = fill_button_name;
        }

        public String getFill_button_url() {
            return fill_button_url;
        }

        public void setFill_button_url(String fill_button_url) {
            this.fill_button_url = fill_button_url;
        }
    }
}
