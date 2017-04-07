package com.example.app.http.response;

import java.util.List;

/**
 * Created by wanxin on 16/11/30.
 */

public class CreateRechargeOrderResponse {

    /**
     * pay_for_tokens : [{"pay_for_token":"201603201228307602728","pay_for_channel":"3","flow_id":"14584481102729991717"}]
     * order_info : {"order_id":"114584481105265","user_id":"01447935739273319070","order_type":1,"amount":10000,"order_status":0,"trading_info":null,"create_time":"2016-03-20 12:28:30 +0800","elapse_time":null,"update_time":null,"error_code":null,"err_msg":null,"third_handle_date":null,"third_handle_batch":null,"ratify_status":1,"no_pass_reason":null}
     */

    private OrderInfoBean order_info;
    private List<PayForTokensBean> pay_for_tokens;

    public OrderInfoBean getOrder_info() {
        return order_info;
    }

    public void setOrder_info(OrderInfoBean order_info) {
        this.order_info = order_info;
    }

    public List<PayForTokensBean> getPay_for_tokens() {
        return pay_for_tokens;
    }

    public void setPay_for_tokens(List<PayForTokensBean> pay_for_tokens) {
        this.pay_for_tokens = pay_for_tokens;
    }

    public static class OrderInfoBean {
        /**
         * order_id : 114584481105265
         * user_id : 01447935739273319070
         * order_type : 1
         * amount : 10000
         * order_status : 0
         * trading_info : null
         * create_time : 2016-03-20 12:28:30 +0800
         * elapse_time : null
         * update_time : null
         * error_code : null
         * err_msg : null
         * third_handle_date : null
         * third_handle_batch : null
         * ratify_status : 1
         * no_pass_reason : null
         */

        private String order_id;
        private String user_id;
        private int order_type;
        private int amount;
        private int order_status;
        private Object trading_info;
        private String create_time;
        private Object elapse_time;
        private Object update_time;
        private Object error_code;
        private Object err_msg;
        private Object third_handle_date;
        private Object third_handle_batch;
        private int ratify_status;
        private Object no_pass_reason;

        public String getOrder_id() {
            return order_id;
        }

        public void setOrder_id(String order_id) {
            this.order_id = order_id;
        }

        public String getUser_id() {
            return user_id;
        }

        public void setUser_id(String user_id) {
            this.user_id = user_id;
        }

        public int getOrder_type() {
            return order_type;
        }

        public void setOrder_type(int order_type) {
            this.order_type = order_type;
        }

        public int getAmount() {
            return amount;
        }

        public void setAmount(int amount) {
            this.amount = amount;
        }

        public int getOrder_status() {
            return order_status;
        }

        public void setOrder_status(int order_status) {
            this.order_status = order_status;
        }

        public Object getTrading_info() {
            return trading_info;
        }

        public void setTrading_info(Object trading_info) {
            this.trading_info = trading_info;
        }

        public String getCreate_time() {
            return create_time;
        }

        public void setCreate_time(String create_time) {
            this.create_time = create_time;
        }

        public Object getElapse_time() {
            return elapse_time;
        }

        public void setElapse_time(Object elapse_time) {
            this.elapse_time = elapse_time;
        }

        public Object getUpdate_time() {
            return update_time;
        }

        public void setUpdate_time(Object update_time) {
            this.update_time = update_time;
        }

        public Object getError_code() {
            return error_code;
        }

        public void setError_code(Object error_code) {
            this.error_code = error_code;
        }

        public Object getErr_msg() {
            return err_msg;
        }

        public void setErr_msg(Object err_msg) {
            this.err_msg = err_msg;
        }

        public Object getThird_handle_date() {
            return third_handle_date;
        }

        public void setThird_handle_date(Object third_handle_date) {
            this.third_handle_date = third_handle_date;
        }

        public Object getThird_handle_batch() {
            return third_handle_batch;
        }

        public void setThird_handle_batch(Object third_handle_batch) {
            this.third_handle_batch = third_handle_batch;
        }

        public int getRatify_status() {
            return ratify_status;
        }

        public void setRatify_status(int ratify_status) {
            this.ratify_status = ratify_status;
        }

        public Object getNo_pass_reason() {
            return no_pass_reason;
        }

        public void setNo_pass_reason(Object no_pass_reason) {
            this.no_pass_reason = no_pass_reason;
        }
    }

    public static class PayForTokensBean {
        /**
         * pay_for_token : 201603201228307602728
         * pay_for_channel : 3
         * flow_id : 14584481102729991717
         */

        private String pay_for_token;
        private String pay_for_channel;
        private String flow_id;

        public String getPay_for_token() {
            return pay_for_token;
        }

        public void setPay_for_token(String pay_for_token) {
            this.pay_for_token = pay_for_token;
        }

        public String getPay_for_channel() {
            return pay_for_channel;
        }

        public void setPay_for_channel(String pay_for_channel) {
            this.pay_for_channel = pay_for_channel;
        }

        public String getFlow_id() {
            return flow_id;
        }

        public void setFlow_id(String flow_id) {
            this.flow_id = flow_id;
        }
    }
}
