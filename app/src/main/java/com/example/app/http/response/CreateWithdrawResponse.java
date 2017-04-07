package com.example.app.http.response;

import java.util.List;

/**
 * Created by wanxin on 16/12/5.
 */

public class CreateWithdrawResponse {


    /**
     * order_info : {"order_id":"21480943428882978"}
     * flow_id : 1480943428242837368078
     * pay_for_token : 1480943428242837368078
     * pay_for_channel : 1
     * user_id : 01445521690334915078
     * handle_id : 21480943428882978
     * initiate_account_id : ["99999999999999999999100011"]
     * transto_account_id : 0144552169033491507871161
     * operate_type_id : 2009
     * amount : 1000
     * memo : [{"title":"类型","content":"提现"},{"title":"订单ID","content":"21480943428882978"},{"title":"提现到","content":"http://7vzspj.com2.z0.glb.qiniucdn.com/cardbin%2F%E6%8B%9B%E5%95%86.png;************7683"}]
     * module_id : 004
     * backup_1 : null
     * backup_4 : null
     * operator_user : null
     * create_time : 2016-12-05 21:10:28
     * update_time : 2016-12-05 21:10:28
     * trade_status : 1002
     */

    private OrderInfoBean order_info;
    private String flow_id;
    private String pay_for_token;
    private int pay_for_channel;
    private String user_id;
    private String handle_id;
    private String transto_account_id;
    private int operate_type_id;
    private String amount;
    private String memo;
    private String module_id;
    private Object backup_1;
    private Object backup_4;
    private Object operator_user;
    private String create_time;
    private String update_time;
    private int trade_status;
    private List<String> initiate_account_id;

    public OrderInfoBean getOrder_info() {
        return order_info;
    }

    public void setOrder_info(OrderInfoBean order_info) {
        this.order_info = order_info;
    }

    public String getFlow_id() {
        return flow_id;
    }

    public void setFlow_id(String flow_id) {
        this.flow_id = flow_id;
    }

    public String getPay_for_token() {
        return pay_for_token;
    }

    public void setPay_for_token(String pay_for_token) {
        this.pay_for_token = pay_for_token;
    }

    public int getPay_for_channel() {
        return pay_for_channel;
    }

    public void setPay_for_channel(int pay_for_channel) {
        this.pay_for_channel = pay_for_channel;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getHandle_id() {
        return handle_id;
    }

    public void setHandle_id(String handle_id) {
        this.handle_id = handle_id;
    }

    public String getTransto_account_id() {
        return transto_account_id;
    }

    public void setTransto_account_id(String transto_account_id) {
        this.transto_account_id = transto_account_id;
    }

    public int getOperate_type_id() {
        return operate_type_id;
    }

    public void setOperate_type_id(int operate_type_id) {
        this.operate_type_id = operate_type_id;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getModule_id() {
        return module_id;
    }

    public void setModule_id(String module_id) {
        this.module_id = module_id;
    }

    public Object getBackup_1() {
        return backup_1;
    }

    public void setBackup_1(Object backup_1) {
        this.backup_1 = backup_1;
    }

    public Object getBackup_4() {
        return backup_4;
    }

    public void setBackup_4(Object backup_4) {
        this.backup_4 = backup_4;
    }

    public Object getOperator_user() {
        return operator_user;
    }

    public void setOperator_user(Object operator_user) {
        this.operator_user = operator_user;
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

    public int getTrade_status() {
        return trade_status;
    }

    public void setTrade_status(int trade_status) {
        this.trade_status = trade_status;
    }

    public List<String> getInitiate_account_id() {
        return initiate_account_id;
    }

    public void setInitiate_account_id(List<String> initiate_account_id) {
        this.initiate_account_id = initiate_account_id;
    }

    public static class OrderInfoBean {
        /**
         * order_id : 21480943428882978
         */

        private String order_id;

        public String getOrder_id() {
            return order_id;
        }

        public void setOrder_id(String order_id) {
            this.order_id = order_id;
        }
    }
}
