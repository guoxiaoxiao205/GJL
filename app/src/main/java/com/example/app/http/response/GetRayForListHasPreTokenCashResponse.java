package com.example.app.http.response;

import java.util.List;

/**
 * Created by wanxin on 16/12/15.
 */

public class GetRayForListHasPreTokenCashResponse {

    /**
     * red_list : [{"fid":"8020161126161931176095107","red_left_date_color":"","balance":"305元","red_amount":"305元","red_name":"彩球305元幸运红包","red_memo":"","red_line_color":"","balance_num":30500,"red_left_date":"71天","red_recommend":0,"show_name":"305元 (总面额305元)","red_flg":0,"pay_name":"305元"}]
     * account_infos : [{"img_url":"http://7xoiug.com1.z0.glb.clouddn.com/payment%2F%E4%BD%99%E9%A2%9D%E6%94%AF%E4%BB%98.png","is_exchange":1,"memo":null,"account_id":"0144552169033491507811337","account_type_id":1,"status":1,"withdraw_fee":0,"backup_1":"http://cashier.caiqr.cn/paymentAccount.html","backup_2":null,"is_expense":1,"backup_3":null,"pay_for_sales":0,"backup_4":null,"fill_sales":0,"balancestr":"725","is_direct":0,"is_virtual":0,"unit":"元","balance":725,"is_withdrawal":1,"model_id":0,"account_type_nm":"现金账户","use_priorty":1,"user_id":"01445521690334915078","is_default_option":0},{"img_url":"http://7xoiug.com1.z0. glb.clouddn.com/weixinzhifu.png","is_exchange":1,"memo":null,"account_id":"0144552169033491507851738","account_type_id":5,"status":1,"withdraw_fee":0,"backup_1":"http://cashier.caiqr.cn/paymentWeChat.html","backup_2":null,"is_expense":1,"backup_3":null,"pay_for_sales":0,"backup_4":null,"fill_sales":0,"balancestr":"0","is_direct":1,"is_virtual":0,"unit":null,"balance":0,"is_withdrawal":0,"model_id":0,"account_type_nm":"微信","use_priorty":1,"user_id":"01445521690334915078","is_default_option":0},{"img_url":"http://7xoiug.com1.z0.glb.clouddn.com/payment%2F%E6%98%93%E5%AE%9D%E6%94%AF%E4%BB%98.png","is_exchange":0,"memo":"单笔500元，单日单卡2000元","account_id":"0144552169033491507881823","account_type_id":8,"status":1,"withdraw_fee":0,"backup_1":"http://cashier.caiqr.cn/paymentYeePay.html","backup_2":null,"is_expense":0,"backup_3":null,"pay_for_sales":0,"backup_4":null,"fill_sales":0,"balancestr":"0","is_direct":1,"is_virtual":0,"unit":null,"balance":0,"is_withdrawal":0,"model_id":0,"account_type_nm":"易宝支付","use_priorty":1,"user_id":"01445521690334915078","is_default_option":0}]
     * default_account : null
     * pre_handle_token : {"backup_9":null,"backup_5":null,"memo":"[{\"title\":\"类目\",\"content\":\"投注\"},{\"title\":\"详情\",\"content\":[\"周四003, 主胜 \",\"周四005, 主胜 \",\"2串1, 10倍, 20元\"]}]","backup_6":null,"initiate_account_id":null,"backup_7":null,"backup_8":null,"backup_1":null,"backup_2":"0","backup_3":null,"backup_4":null,"elapse_time":"2016-12-15 23:52:00 +0800","amount":2000,"pay_for_token":null,"user_id":"01445521690334915078","pay_for_channel":null,"operate_type_id":1001,"error_code":null,"trade_status":1001,"handle_id":"211481773525211521271078","operator_code":null,"update_time":null,"flow_id":"1481773525971031503878","module_id":"001","create_time":"2016-12-15 11:45:25 +0800","backup_10":null,"transto_account_id":null,"operator_user":null}
     */

    private Object default_account;
    private PreHandleTokenBean pre_handle_token;
    private List<RedListBean> red_list;
    private List<AccountInfosBean> account_infos;

    public Object getDefault_account() {
        return default_account;
    }

    public void setDefault_account(Object default_account) {
        this.default_account = default_account;
    }

    public PreHandleTokenBean getPre_handle_token() {
        return pre_handle_token;
    }

    public void setPre_handle_token(PreHandleTokenBean pre_handle_token) {
        this.pre_handle_token = pre_handle_token;
    }

    public List<RedListBean> getRed_list() {
        return red_list;
    }

    public void setRed_list(List<RedListBean> red_list) {
        this.red_list = red_list;
    }

    public List<AccountInfosBean> getAccount_infos() {
        return account_infos;
    }

    public void setAccount_infos(List<AccountInfosBean> account_infos) {
        this.account_infos = account_infos;
    }

    public static class PreHandleTokenBean {
        /**
         * backup_9 : null
         * backup_5 : null
         * memo : [{"title":"类目","content":"投注"},{"title":"详情","content":["周四003, 主胜 ","周四005, 主胜 ","2串1, 10倍, 20元"]}]
         * backup_6 : null
         * initiate_account_id : null
         * backup_7 : null
         * backup_8 : null
         * backup_1 : null
         * backup_2 : 0
         * backup_3 : null
         * backup_4 : null
         * elapse_time : 2016-12-15 23:52:00 +0800
         * amount : 2000
         * pay_for_token : null
         * user_id : 01445521690334915078
         * pay_for_channel : null
         * operate_type_id : 1001
         * error_code : null
         * trade_status : 1001
         * handle_id : 211481773525211521271078
         * operator_code : null
         * update_time : null
         * flow_id : 1481773525971031503878
         * module_id : 001
         * create_time : 2016-12-15 11:45:25 +0800
         * backup_10 : null
         * transto_account_id : null
         * operator_user : null
         */

        private Object backup_9;
        private Object backup_5;
        private String memo;
        private Object backup_6;
        private Object initiate_account_id;
        private Object backup_7;
        private Object backup_8;
        private Object backup_1;
        private String backup_2;
        private Object backup_3;
        private Object backup_4;
        private String elapse_time;
        private int amount;
        private Object pay_for_token;
        private String user_id;
        private Object pay_for_channel;
        private int operate_type_id;
        private Object error_code;
        private int trade_status;
        private String handle_id;
        private Object operator_code;
        private Object update_time;
        private String flow_id;
        private String module_id;
        private String create_time;
        private Object backup_10;
        private Object transto_account_id;
        private Object operator_user;

        public Object getBackup_9() {
            return backup_9;
        }

        public void setBackup_9(Object backup_9) {
            this.backup_9 = backup_9;
        }

        public Object getBackup_5() {
            return backup_5;
        }

        public void setBackup_5(Object backup_5) {
            this.backup_5 = backup_5;
        }

        public String getMemo() {
            return memo;
        }

        public void setMemo(String memo) {
            this.memo = memo;
        }

        public Object getBackup_6() {
            return backup_6;
        }

        public void setBackup_6(Object backup_6) {
            this.backup_6 = backup_6;
        }

        public Object getInitiate_account_id() {
            return initiate_account_id;
        }

        public void setInitiate_account_id(Object initiate_account_id) {
            this.initiate_account_id = initiate_account_id;
        }

        public Object getBackup_7() {
            return backup_7;
        }

        public void setBackup_7(Object backup_7) {
            this.backup_7 = backup_7;
        }

        public Object getBackup_8() {
            return backup_8;
        }

        public void setBackup_8(Object backup_8) {
            this.backup_8 = backup_8;
        }

        public Object getBackup_1() {
            return backup_1;
        }

        public void setBackup_1(Object backup_1) {
            this.backup_1 = backup_1;
        }

        public String getBackup_2() {
            return backup_2;
        }

        public void setBackup_2(String backup_2) {
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

        public String getElapse_time() {
            return elapse_time;
        }

        public void setElapse_time(String elapse_time) {
            this.elapse_time = elapse_time;
        }

        public int getAmount() {
            return amount;
        }

        public void setAmount(int amount) {
            this.amount = amount;
        }

        public Object getPay_for_token() {
            return pay_for_token;
        }

        public void setPay_for_token(Object pay_for_token) {
            this.pay_for_token = pay_for_token;
        }

        public String getUser_id() {
            return user_id;
        }

        public void setUser_id(String user_id) {
            this.user_id = user_id;
        }

        public Object getPay_for_channel() {
            return pay_for_channel;
        }

        public void setPay_for_channel(Object pay_for_channel) {
            this.pay_for_channel = pay_for_channel;
        }

        public int getOperate_type_id() {
            return operate_type_id;
        }

        public void setOperate_type_id(int operate_type_id) {
            this.operate_type_id = operate_type_id;
        }

        public Object getError_code() {
            return error_code;
        }

        public void setError_code(Object error_code) {
            this.error_code = error_code;
        }

        public int getTrade_status() {
            return trade_status;
        }

        public void setTrade_status(int trade_status) {
            this.trade_status = trade_status;
        }

        public String getHandle_id() {
            return handle_id;
        }

        public void setHandle_id(String handle_id) {
            this.handle_id = handle_id;
        }

        public Object getOperator_code() {
            return operator_code;
        }

        public void setOperator_code(Object operator_code) {
            this.operator_code = operator_code;
        }

        public Object getUpdate_time() {
            return update_time;
        }

        public void setUpdate_time(Object update_time) {
            this.update_time = update_time;
        }

        public String getFlow_id() {
            return flow_id;
        }

        public void setFlow_id(String flow_id) {
            this.flow_id = flow_id;
        }

        public String getModule_id() {
            return module_id;
        }

        public void setModule_id(String module_id) {
            this.module_id = module_id;
        }

        public String getCreate_time() {
            return create_time;
        }

        public void setCreate_time(String create_time) {
            this.create_time = create_time;
        }

        public Object getBackup_10() {
            return backup_10;
        }

        public void setBackup_10(Object backup_10) {
            this.backup_10 = backup_10;
        }

        public Object getTransto_account_id() {
            return transto_account_id;
        }

        public void setTransto_account_id(Object transto_account_id) {
            this.transto_account_id = transto_account_id;
        }

        public Object getOperator_user() {
            return operator_user;
        }

        public void setOperator_user(Object operator_user) {
            this.operator_user = operator_user;
        }
    }

    public static class RedListBean {
        /**
         * fid : 8020161126161931176095107
         * red_left_date_color :
         * balance : 305元
         * red_amount : 305元
         * red_name : 彩球305元幸运红包
         * red_memo :
         * red_line_color :
         * balance_num : 30500
         * red_left_date : 71天
         * red_recommend : 0
         * show_name : 305元 (总面额305元)
         * red_flg : 0
         * pay_name : 305元
         */
        private boolean select;
        private String fid;
        private String red_left_date_color;
        private String balance;
        private String red_amount;
        private String red_name;
        private String red_memo;
        private String red_line_color;
        private int balance_num;
        private String red_left_date;
        private int red_recommend;
        private String show_name;
        private int red_flg;
        private String pay_name;

        public boolean isSelect() {
            return select;
        }

        public void setSelect(boolean select) {
            this.select = select;
        }

        public String getFid() {
            return fid;
        }

        public void setFid(String fid) {
            this.fid = fid;
        }

        public String getRed_left_date_color() {
            return red_left_date_color;
        }

        public void setRed_left_date_color(String red_left_date_color) {
            this.red_left_date_color = red_left_date_color;
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

        public String getRed_name() {
            return red_name;
        }

        public void setRed_name(String red_name) {
            this.red_name = red_name;
        }

        public String getRed_memo() {
            return red_memo;
        }

        public void setRed_memo(String red_memo) {
            this.red_memo = red_memo;
        }

        public String getRed_line_color() {
            return red_line_color;
        }

        public void setRed_line_color(String red_line_color) {
            this.red_line_color = red_line_color;
        }

        public int getBalance_num() {
            return balance_num;
        }

        public void setBalance_num(int balance_num) {
            this.balance_num = balance_num;
        }

        public String getRed_left_date() {
            return red_left_date;
        }

        public void setRed_left_date(String red_left_date) {
            this.red_left_date = red_left_date;
        }

        public int getRed_recommend() {
            return red_recommend;
        }

        public void setRed_recommend(int red_recommend) {
            this.red_recommend = red_recommend;
        }

        public String getShow_name() {
            return show_name;
        }

        public void setShow_name(String show_name) {
            this.show_name = show_name;
        }

        public int getRed_flg() {
            return red_flg;
        }

        public void setRed_flg(int red_flg) {
            this.red_flg = red_flg;
        }

        public String getPay_name() {
            return pay_name;
        }

        public void setPay_name(String pay_name) {
            this.pay_name = pay_name;
        }
    }

    public static class AccountInfosBean {
        /**
         * img_url : http://7xoiug.com1.z0.glb.clouddn.com/payment%2F%E4%BD%99%E9%A2%9D%E6%94%AF%E4%BB%98.png
         * is_exchange : 1
         * memo : null
         * account_id : 0144552169033491507811337
         * account_type_id : 1
         * status : 1
         * withdraw_fee : 0
         * backup_1 : http://cashier.caiqr.cn/paymentAccount.html
         * backup_2 : null
         * is_expense : 1
         * backup_3 : null
         * pay_for_sales : 0
         * backup_4 : null
         * fill_sales : 0
         * balancestr : 725
         * is_direct : 0
         * is_virtual : 0
         * unit : 元
         * balance : 725
         * is_withdrawal : 1
         * model_id : 0
         * account_type_nm : 现金账户
         * use_priorty : 1
         * user_id : 01445521690334915078
         * is_default_option : 0
         */

        private String img_url;
        private int is_exchange;
        private String memo;
        private String account_id;
        private int account_type_id;
        private int status;
        private int withdraw_fee;
        private String backup_1;
        private Object backup_2;
        private int is_expense;
        private Object backup_3;
        private int pay_for_sales;
        private Object backup_4;
        private int fill_sales;
        private String balancestr;
        private int is_direct;
        private int is_virtual;
        private String unit;
        private double balance;
        private int is_withdrawal;
        private int model_id;
        private String account_type_nm;
        private int use_priorty;
        private String user_id;
        private int is_default_option;

        public String getImg_url() {
            return img_url;
        }

        public void setImg_url(String img_url) {
            this.img_url = img_url;
        }

        public int getIs_exchange() {
            return is_exchange;
        }

        public void setIs_exchange(int is_exchange) {
            this.is_exchange = is_exchange;
        }

        public String getMemo() {
            return memo;
        }

        public void setMemo(String memo) {
            this.memo = memo;
        }

        public String getAccount_id() {
            return account_id;
        }

        public void setAccount_id(String account_id) {
            this.account_id = account_id;
        }

        public int getAccount_type_id() {
            return account_type_id;
        }

        public void setAccount_type_id(int account_type_id) {
            this.account_type_id = account_type_id;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public int getWithdraw_fee() {
            return withdraw_fee;
        }

        public void setWithdraw_fee(int withdraw_fee) {
            this.withdraw_fee = withdraw_fee;
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

        public int getIs_expense() {
            return is_expense;
        }

        public void setIs_expense(int is_expense) {
            this.is_expense = is_expense;
        }

        public Object getBackup_3() {
            return backup_3;
        }

        public void setBackup_3(Object backup_3) {
            this.backup_3 = backup_3;
        }

        public int getPay_for_sales() {
            return pay_for_sales;
        }

        public void setPay_for_sales(int pay_for_sales) {
            this.pay_for_sales = pay_for_sales;
        }

        public Object getBackup_4() {
            return backup_4;
        }

        public void setBackup_4(Object backup_4) {
            this.backup_4 = backup_4;
        }

        public int getFill_sales() {
            return fill_sales;
        }

        public void setFill_sales(int fill_sales) {
            this.fill_sales = fill_sales;
        }

        public String getBalancestr() {
            return balancestr;
        }

        public void setBalancestr(String balancestr) {
            this.balancestr = balancestr;
        }

        public int getIs_direct() {
            return is_direct;
        }

        public void setIs_direct(int is_direct) {
            this.is_direct = is_direct;
        }

        public int getIs_virtual() {
            return is_virtual;
        }

        public void setIs_virtual(int is_virtual) {
            this.is_virtual = is_virtual;
        }

        public String getUnit() {
            return unit;
        }

        public void setUnit(String unit) {
            this.unit = unit;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public int getIs_withdrawal() {
            return is_withdrawal;
        }

        public void setIs_withdrawal(int is_withdrawal) {
            this.is_withdrawal = is_withdrawal;
        }

        public int getModel_id() {
            return model_id;
        }

        public void setModel_id(int model_id) {
            this.model_id = model_id;
        }

        public String getAccount_type_nm() {
            return account_type_nm;
        }

        public void setAccount_type_nm(String account_type_nm) {
            this.account_type_nm = account_type_nm;
        }

        public int getUse_priorty() {
            return use_priorty;
        }

        public void setUse_priorty(int use_priorty) {
            this.use_priorty = use_priorty;
        }

        public String getUser_id() {
            return user_id;
        }

        public void setUser_id(String user_id) {
            this.user_id = user_id;
        }

        public int getIs_default_option() {
            return is_default_option;
        }

        public void setIs_default_option(int is_default_option) {
            this.is_default_option = is_default_option;
        }
    }
}
