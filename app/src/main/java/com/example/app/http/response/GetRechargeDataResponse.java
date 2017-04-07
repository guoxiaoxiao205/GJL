package com.example.app.http.response;

import java.util.List;

/**
 * Created by wanxin on 16/11/25.
 */

public class GetRechargeDataResponse {

    /**
     * fill_list : [{"pay_version":"3.0","client_type":"0","amount_value":50,"show_name":"50元","is_default":0}]
     * channel_list : [{"account_type_id":4,"account_type_nm":"支付宝","model_id":0,"use_priorty":1,"is_virtual":0,"is_withdrawal":0,"is_expense":1,"is_exchange":1,"is_direct":1,"unit":null,"img_url":"http://7xoiug.com1.z0.glb.clouddn.com/zhifubaozhifu.png","withdraw_fee":0,"fill_sales":0,"pay_for_sales":0,"status":1,"arrival_cycle":null,"create_user":"01447898430703722557","update_user":null,"create_time":"2015-12-02 11:12:39 +0800","update_time":"2016-12-26 21:11:07 +0800","memo":"只支持固定金额(100,300,500)元","backup_1":null,"backup_2":null,"backup_3":null,"backup_4":null}]
     * template : 根据国家相关规定，每笔充值金额的50%可提现，剩下的50%只可用于购买彩票或兑换红包。
     * big_moneny : [{"account_type_id":999,"account_type_nm":"VIP服务","img_url":"http://7xoiug.com1.z0.glb.clouddn.com/payment%2F%E4%BA%BA%E5%B7%A5%E6%9C%8D%E5%8A%A1.png","memo":"单笔20000元以上"}]
     */

    private String template;
    private List<FillListBean> fill_list;
    private List<ChannelListBean> channel_list;
    private List<BigMonenyBean> big_moneny;

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public List<FillListBean> getFill_list() {
        return fill_list;
    }

    public void setFill_list(List<FillListBean> fill_list) {
        this.fill_list = fill_list;
    }

    public List<ChannelListBean> getChannel_list() {
        return channel_list;
    }

    public void setChannel_list(List<ChannelListBean> channel_list) {
        this.channel_list = channel_list;
    }

    public List<BigMonenyBean> getBig_moneny() {
        return big_moneny;
    }

    public void setBig_moneny(List<BigMonenyBean> big_moneny) {
        this.big_moneny = big_moneny;
    }

    public static class FillListBean {
        /**
         * pay_version : 3.0
         * client_type : 0
         * amount_value : 50
         * show_name : 50元
         * is_default : 0
         */

        private String pay_version;
        private String client_type;
        private int amount_value;
        private String show_name;
        private int is_default;

        public String getPay_version() {
            return pay_version;
        }

        public void setPay_version(String pay_version) {
            this.pay_version = pay_version;
        }

        public String getClient_type() {
            return client_type;
        }

        public void setClient_type(String client_type) {
            this.client_type = client_type;
        }

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

        public int getIs_default() {
            return is_default;
        }

        public void setIs_default(int is_default) {
            this.is_default = is_default;
        }
    }

    public static class ChannelListBean {
        /**
         * account_type_id : 4
         * account_type_nm : 支付宝
         * model_id : 0
         * use_priorty : 1
         * is_virtual : 0
         * is_withdrawal : 0
         * is_expense : 1
         * is_exchange : 1
         * is_direct : 1
         * unit : null
         * img_url : http://7xoiug.com1.z0.glb.clouddn.com/zhifubaozhifu.png
         * withdraw_fee : 0
         * fill_sales : 0
         * pay_for_sales : 0
         * status : 1
         * arrival_cycle : null
         * create_user : 01447898430703722557
         * update_user : null
         * create_time : 2015-12-02 11:12:39 +0800
         * update_time : 2016-12-26 21:11:07 +0800
         * memo : 只支持固定金额(100,300,500)元
         * backup_1 : null
         * backup_2 : null
         * backup_3 : null
         * backup_4 : null
         */

        private int account_type_id;
        private String account_type_nm;
        private int model_id;
        private int use_priorty;
        private int is_virtual;
        private int is_withdrawal;
        private int is_expense;
        private int is_exchange;
        private int is_direct;
        private Object unit;
        private String img_url;
        private int withdraw_fee;
        private int fill_sales;
        private int pay_for_sales;
        private int status;
        private Object arrival_cycle;
        private String create_user;
        private Object update_user;
        private String create_time;
        private String update_time;
        private String memo;
        private String backup_1;
        private Object backup_2;
        private Object backup_3;
        private Object backup_4;

        public int getAccount_type_id() {
            return account_type_id;
        }

        public void setAccount_type_id(int account_type_id) {
            this.account_type_id = account_type_id;
        }

        public String getAccount_type_nm() {
            return account_type_nm;
        }

        public void setAccount_type_nm(String account_type_nm) {
            this.account_type_nm = account_type_nm;
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

        public int getIs_direct() {
            return is_direct;
        }

        public void setIs_direct(int is_direct) {
            this.is_direct = is_direct;
        }

        public Object getUnit() {
            return unit;
        }

        public void setUnit(Object unit) {
            this.unit = unit;
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

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public Object getArrival_cycle() {
            return arrival_cycle;
        }

        public void setArrival_cycle(Object arrival_cycle) {
            this.arrival_cycle = arrival_cycle;
        }

        public String getCreate_user() {
            return create_user;
        }

        public void setCreate_user(String create_user) {
            this.create_user = create_user;
        }

        public Object getUpdate_user() {
            return update_user;
        }

        public void setUpdate_user(Object update_user) {
            this.update_user = update_user;
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

    public static class BigMonenyBean {
        /**
         * account_type_id : 999
         * account_type_nm : VIP服务
         * img_url : http://7xoiug.com1.z0.glb.clouddn.com/payment%2F%E4%BA%BA%E5%B7%A5%E6%9C%8D%E5%8A%A1.png
         * memo : 单笔20000元以上
         */

        private int account_type_id;
        private String account_type_nm;
        private String img_url;
        private String memo;

        public int getAccount_type_id() {
            return account_type_id;
        }

        public void setAccount_type_id(int account_type_id) {
            this.account_type_id = account_type_id;
        }

        public String getAccount_type_nm() {
            return account_type_nm;
        }

        public void setAccount_type_nm(String account_type_nm) {
            this.account_type_nm = account_type_nm;
        }

        public String getImg_url() {
            return img_url;
        }

        public void setImg_url(String img_url) {
            this.img_url = img_url;
        }

        public String getMemo() {
            return memo;
        }

        public void setMemo(String memo) {
            this.memo = memo;
        }
    }
}
