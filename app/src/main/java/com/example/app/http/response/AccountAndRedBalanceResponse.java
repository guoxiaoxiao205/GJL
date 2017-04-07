package com.example.app.http.response;

/**
 * Created by wanxin on 16/11/21.
 */

public class AccountAndRedBalanceResponse {

    /**
     * fill_on_sale : 1
     * fill_button_name : 充值
     * fill_button_url :
     * account_info : {"account_type_nm":"现金账户","account_type_id":1,"account_id":null,"user_id":null,"balancestr":"1854","balance":1854,"is_default_option":1,"status":1,"model_id":0,"use_priorty":1,"is_virtual":0,"is_withdrawal":1,"is_expense":1,"is_exchange":1,"unit":"元","is_direct":0,"img_url":"http://7xoiug.com1.z0.glb.clouddn.com/payment%2F%E4%BD%99%E9%A2%9D%E6%94%AF%E4%BB%98.png","withdraw_fee":0,"fill_sales":0,"pay_for_sales":0,"memo":null,"backup_1":"http://cashier.caiqr.cn/paymentAccount.html","backup_2":null,"backup_3":null,"backup_4":null}
     * red_balance : 0
     * red_ad_img : http://7vzspj.com2.z0.glb.qiniucdn.com/img_red%2Fred_ad_001.png
     * red_ad_url : null
     * red_ad_content : 买幸运红包，花500得505
     */

    private AccountInfoBean account_info;
    private String red_balance;
    private String red_ad_img;

    public AccountInfoBean getAccount_info() {
        return account_info;
    }

    public void setAccount_info(AccountInfoBean account_info) {
        this.account_info = account_info;
    }

    public String getRed_balance() {
        return red_balance;
    }

    public void setRed_balance(String red_balance) {
        this.red_balance = red_balance;
    }

    public String getRed_ad_img() {
        return red_ad_img;
    }

    public void setRed_ad_img(String red_ad_img) {
        this.red_ad_img = red_ad_img;
    }


    public static class AccountInfoBean {
        /**
         * account_type_nm : 现金账户
         * account_type_id : 1
         * account_id : null
         * user_id : null
         * balancestr : 1854
         * balance : 1854
         * is_default_option : 1
         * status : 1
         * model_id : 0
         * use_priorty : 1
         * is_virtual : 0
         * is_withdrawal : 1
         * is_expense : 1
         * is_exchange : 1
         * unit : 元
         * is_direct : 0
         * img_url : http://7xoiug.com1.z0.glb.clouddn.com/payment%2F%E4%BD%99%E9%A2%9D%E6%94%AF%E4%BB%98.png
         * withdraw_fee : 0
         * fill_sales : 0
         * pay_for_sales : 0
         * memo : null
         * backup_1 : http://cashier.caiqr.cn/paymentAccount.html
         * backup_2 : null
         * backup_3 : null
         * backup_4 : null
         */

        private String balancestr;

        public String getBalancestr() {
            return balancestr;
        }

        public void setBalancestr(String balancestr) {
            this.balancestr = balancestr;
        }

    }
}
