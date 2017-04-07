package com.example.app.http.response;

import java.util.List;

/**
 * Created by wanxin on 16/12/1.
 */

public class GetRedConstantListResponse {

    /**
     * red_list : [{"amount_value":"300","show_name":"300元","red_program_id":"20160524165942720071070","red_amount":"305"},{"amount_value":"500","show_name":"500元","red_program_id":"20160524180707256201800","red_amount":"518"},{"amount_value":"1000","show_name":"1000元","red_program_id":"20160524181547306601252","red_amount":"1058"}]
     * red_custom_program_id : 20160524181933161257923
     * channel_list : [{"account_type_nm":"现金账户","account_type_id":1,"account_id":null,"user_id":null,"balance":1054,"balancestr":"1054","is_default_option":1,"status":1,"model_id":0,"use_priorty":1,"is_virtual":0,"is_withdrawal":1,"is_expense":1,"is_exchange":1,"unit":"元","is_direct":0,"img_url":"http://7xoiug.com1.z0.glb.clouddn.com/payment%2F%E4%BD%99%E9%A2%9D%E6%94%AF%E4%BB%98.png","withdraw_fee":0,"fill_sales":0,"pay_for_sales":0,"memo":null,"backup_1":"http://cashier.caiqr.cn/paymentAccount.html","backup_2":null,"backup_3":null,"backup_4":null},{"account_type_nm":"支付宝","account_type_id":4,"account_id":null,"user_id":null,"balance":0,"balancestr":"0","is_default_option":0,"status":1,"model_id":0,"use_priorty":1,"is_virtual":0,"is_withdrawal":0,"is_expense":1,"is_exchange":1,"unit":null,"is_direct":1,"img_url":"http://7xoiug.com1.z0.glb.clouddn.com/zhifubaozhifu.png","withdraw_fee":0,"fill_sales":0,"pay_for_sales":0,"memo":"只支持固定金额(100,300,500)元","backup_1":null,"backup_2":null,"backup_3":null,"backup_4":null},{"account_type_nm":"微信","account_type_id":5,"account_id":null,"user_id":null,"balance":0,"balancestr":"0","is_default_option":0,"status":1,"model_id":0,"use_priorty":1,"is_virtual":0,"is_withdrawal":0,"is_expense":1,"is_exchange":1,"unit":null,"is_direct":1,"img_url":"http://7xoiug.com1.z0.glb.clouddn.com/weixinzhifu.png","withdraw_fee":0,"fill_sales":0,"pay_for_sales":0,"memo":null,"backup_1":"http://cashier.caiqr.cn/paymentWeChat.html","backup_2":null,"backup_3":null,"backup_4":null},{"account_type_nm":"易宝支付","account_type_id":8,"account_id":null,"user_id":null,"balance":0,"balancestr":"0","is_default_option":0,"status":1,"model_id":0,"use_priorty":1,"is_virtual":0,"is_withdrawal":0,"is_expense":0,"is_exchange":0,"unit":null,"is_direct":1,"img_url":"http://7xoiug.com1.z0.glb.clouddn.com/payment%2F%E6%98%93%E5%AE%9D%E6%94%AF%E4%BB%98.png","withdraw_fee":0,"fill_sales":0,"pay_for_sales":0,"memo":"单笔500元，单日单卡2000元","backup_1":"http://cashier.caiqr.cn/paymentYeePay.html","backup_2":null,"backup_3":null,"backup_4":null}]
     */

    private String red_custom_program_id;
    private List<RedListBean> red_list;
    private List<ChannelListBean> channel_list;

    public String getRed_custom_program_id() {
        return red_custom_program_id;
    }

    public void setRed_custom_program_id(String red_custom_program_id) {
        this.red_custom_program_id = red_custom_program_id;
    }

    public List<RedListBean> getRed_list() {
        return red_list;
    }

    public void setRed_list(List<RedListBean> red_list) {
        this.red_list = red_list;
    }

    public List<ChannelListBean> getChannel_list() {
        return channel_list;
    }

    public void setChannel_list(List<ChannelListBean> channel_list) {
        this.channel_list = channel_list;
    }

    public static class RedListBean {
        /**
         * amount_value : 300
         * show_name : 300元
         * red_program_id : 20160524165942720071070
         * red_amount : 305
         */

        private int amount_value;
        private String show_name;
        private String red_program_id;
        private int red_amount;

        public int getAmount_value() {
            return amount_value;
        }

        public void setAmount_value(int amount_value) {
            this.amount_value = amount_value;
        }

        public String getShow_name() {
            return show_name;
        }

        public void setShow_name(String show_name) {
            this.show_name = show_name;
        }

        public String getRed_program_id() {
            return red_program_id;
        }

        public void setRed_program_id(String red_program_id) {
            this.red_program_id = red_program_id;
        }

        public int getRed_amount() {
            return red_amount;
        }

        public void setRed_amount(int red_amount) {
            this.red_amount = red_amount;
        }
    }

    public static class ChannelListBean {
        /**
         * account_type_nm : 现金账户
         * account_type_id : 1
         * account_id : null
         * user_id : null
         * balance : 1054
         * balancestr : 1054
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

        private String account_type_nm;
        private int account_type_id;
        private Object account_id;
        private Object user_id;
        private double balance;
        private String balancestr;
        private int is_default_option;
        private int status;
        private int model_id;
        private int use_priorty;
        private int is_virtual;
        private int is_withdrawal;
        private int is_expense;
        private int is_exchange;
        private String unit;
        private int is_direct;
        private String img_url;
        private int withdraw_fee;
        private int fill_sales;
        private int pay_for_sales;
        private String memo;
        private String backup_1;
        private Object backup_2;
        private Object backup_3;
        private Object backup_4;

        public String getAccount_type_nm() {
            return account_type_nm;
        }

        public void setAccount_type_nm(String account_type_nm) {
            this.account_type_nm = account_type_nm;
        }

        public int getAccount_type_id() {
            return account_type_id;
        }

        public void setAccount_type_id(int account_type_id) {
            this.account_type_id = account_type_id;
        }

        public Object getAccount_id() {
            return account_id;
        }

        public void setAccount_id(Object account_id) {
            this.account_id = account_id;
        }

        public Object getUser_id() {
            return user_id;
        }

        public void setUser_id(Object user_id) {
            this.user_id = user_id;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public String getBalancestr() {
            return balancestr;
        }

        public void setBalancestr(String balancestr) {
            this.balancestr = balancestr;
        }

        public int getIs_default_option() {
            return is_default_option;
        }

        public void setIs_default_option(int is_default_option) {
            this.is_default_option = is_default_option;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public int getModel_id() {
            return model_id;
        }

        public void setModel_id(int model_id) {
            this.model_id = model_id;
        }

        public int getUse_priorty() {
            return use_priorty;
        }

        public void setUse_priorty(int use_priorty) {
            this.use_priorty = use_priorty;
        }

        public int getIs_virtual() {
            return is_virtual;
        }

        public void setIs_virtual(int is_virtual) {
            this.is_virtual = is_virtual;
        }

        public int getIs_withdrawal() {
            return is_withdrawal;
        }

        public void setIs_withdrawal(int is_withdrawal) {
            this.is_withdrawal = is_withdrawal;
        }

        public int getIs_expense() {
            return is_expense;
        }

        public void setIs_expense(int is_expense) {
            this.is_expense = is_expense;
        }

        public int getIs_exchange() {
            return is_exchange;
        }

        public void setIs_exchange(int is_exchange) {
            this.is_exchange = is_exchange;
        }

        public String getUnit() {
            return unit;
        }

        public void setUnit(String unit) {
            this.unit = unit;
        }

        public int getIs_direct() {
            return is_direct;
        }

        public void setIs_direct(int is_direct) {
            this.is_direct = is_direct;
        }

        public String getImg_url() {
            return img_url;
        }

        public void setImg_url(String img_url) {
            this.img_url = img_url;
        }

        public int getWithdraw_fee() {
            return withdraw_fee;
        }

        public void setWithdraw_fee(int withdraw_fee) {
            this.withdraw_fee = withdraw_fee;
        }

        public int getFill_sales() {
            return fill_sales;
        }

        public void setFill_sales(int fill_sales) {
            this.fill_sales = fill_sales;
        }

        public int getPay_for_sales() {
            return pay_for_sales;
        }

        public void setPay_for_sales(int pay_for_sales) {
            this.pay_for_sales = pay_for_sales;
        }

        public String getMemo() {
            return memo;
        }

        public void setMemo(String memo) {
            this.memo = memo;
        }

        public String getBackup_1() {
            return backup_1;
        }

        public void setBackup_1(String backup_1) {
            this.backup_1 = backup_1;
        }

        public Object getBackup_2() {
            return backup_2;
        }

        public void setBackup_2(Object backup_2) {
            this.backup_2 = backup_2;
        }

        public Object getBackup_3() {
            return backup_3;
        }

        public void setBackup_3(Object backup_3) {
            this.backup_3 = backup_3;
        }

        public Object getBackup_4() {
            return backup_4;
        }

        public void setBackup_4(Object backup_4) {
            this.backup_4 = backup_4;
        }
    }
}
