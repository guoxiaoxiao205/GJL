package com.example.app.http.response;

/**
 * Created by guoxiao on 17/1/9.
 */

public class UserMessageResponse {
    //名字
    private String nick_name;
    //头像地址
    private String head_img_url;
    //手机号
    private String mobile;
    //验证是否成功
    private int status;
    //验证吐司
    private String message;
    //修改金额
    private int free_pay_pwd_quota;
    //是否开启开启小额免密
    private int free_pay_pwd_status;
    //余额支付是否成功
    private String pay_for_token;

    public String getPay_for_token() {
        return pay_for_token;
    }

    public void setPay_for_token(String pay_for_token) {
        this.pay_for_token = pay_for_token;
    }

    public int getFree_pay_pwd_status() {
        return free_pay_pwd_status;
    }

    public void setFree_pay_pwd_status(int free_pay_pwd_status) {
        this.free_pay_pwd_status = free_pay_pwd_status;
    }

    public int getFree_pay_pwd_quota() {
        return free_pay_pwd_quota;
    }

    public void setFree_pay_pwd_quota(int free_pay_pwd_quota) {
        this.free_pay_pwd_quota = free_pay_pwd_quota;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getHead_img_url() {
        return head_img_url;
    }

    public void setHead_img_url(String head_img_url) {
        this.head_img_url = head_img_url;
    }

    public String getNick_name() {
        return nick_name;
    }

    public void setNick_name(String nick_name) {
        this.nick_name = nick_name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

}
