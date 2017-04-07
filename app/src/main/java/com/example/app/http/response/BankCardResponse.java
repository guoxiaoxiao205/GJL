package com.example.app.http.response;

import java.io.Serializable;

/**
 * Created by wanxin on 16/11/24.
 */

public class BankCardResponse implements Serializable {

    /**
     * id : 297
     * card_bin : 621226
     * card_type : 1
     * card_name : 牡丹卡普卡
     * primary_account_no : 621226xxxxxxxxxxxxx
     * account_len : 19
     * issuer_bank_name : 工商银行
     * bank_short_name : 工商银行
     * issuer_bank_code : 01020000
     * issuer_bank_province : 北京
     * issuer_bank_city : 北京
     * status : 1
     * bank_img_url : http://7vzspj.com2.z0.glb.qiniucdn.com/cardbin%2F%E5%B7%A5%E5%95%86.png
     * bank_back_url :
     * memo : 预计一个工作日内到账
     * card_type_name : 借记卡
     */

    private int id;
    private int card_bin;
    private int card_type;
    private String card_name;
    private String primary_account_no;
    private int account_len;
    private String issuer_bank_name;
    private String bank_short_name;
    private String issuer_bank_code;
    private String issuer_bank_province;
    private String issuer_bank_city;
    private int status;
    private String bank_img_url;
    private String bank_back_url;
    private String memo;
    private String card_type_name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCard_bin() {
        return card_bin;
    }

    public void setCard_bin(int card_bin) {
        this.card_bin = card_bin;
    }

    public int getCard_type() {
        return card_type;
    }

    public void setCard_type(int card_type) {
        this.card_type = card_type;
    }

    public String getCard_name() {
        return card_name;
    }

    public void setCard_name(String card_name) {
        this.card_name = card_name;
    }

    public String getPrimary_account_no() {
        return primary_account_no;
    }

    public void setPrimary_account_no(String primary_account_no) {
        this.primary_account_no = primary_account_no;
    }

    public int getAccount_len() {
        return account_len;
    }

    public void setAccount_len(int account_len) {
        this.account_len = account_len;
    }

    public String getIssuer_bank_name() {
        return issuer_bank_name;
    }

    public void setIssuer_bank_name(String issuer_bank_name) {
        this.issuer_bank_name = issuer_bank_name;
    }

    public String getBank_short_name() {
        return bank_short_name;
    }

    public void setBank_short_name(String bank_short_name) {
        this.bank_short_name = bank_short_name;
    }

    public String getIssuer_bank_code() {
        return issuer_bank_code;
    }

    public void setIssuer_bank_code(String issuer_bank_code) {
        this.issuer_bank_code = issuer_bank_code;
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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getBank_img_url() {
        return bank_img_url;
    }

    public void setBank_img_url(String bank_img_url) {
        this.bank_img_url = bank_img_url;
    }

    public String getBank_back_url() {
        return bank_back_url;
    }

    public void setBank_back_url(String bank_back_url) {
        this.bank_back_url = bank_back_url;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getCard_type_name() {
        return card_type_name;
    }

    public void setCard_type_name(String card_type_name) {
        this.card_type_name = card_type_name;
    }
}
