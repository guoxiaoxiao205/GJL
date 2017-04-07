package com.example.app.http.response;

import java.util.List;

/**
 * Created by wanxin on 16/12/17.
 */

public class OrderListResponse {


    /**
     * private String  downloadUrl;
     * private String  bulletTips;
     * private int ifSkipDownload;
     * ifNext : 1
     * lastOrderTime : 2016-11-16 10:09:22.509
     * orderVos : [{"bonus":null,"createTime":"2016-11-10","gameName":"上海快3","orderAmount":"8","orderId":"16083120010190099247","orderStatus":5,"orderStatusCn":"等待开奖","orderType":1,"orderTypeCn":"普通投注","periodId":"2016111111","prizeStatus":0,"successTickets":null,"totalTickets":4}]
     */


    private String downloadUrl;
    private int ifSkipDownload;
    private int ifNext;
    private String lastOrderTime;
    private List<OrderVosBean> orderVos;


    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public int getIfSkipDownload() {
        return ifSkipDownload;
    }

    public void setIfSkipDownload(int ifSkipDownload) {
        this.ifSkipDownload = ifSkipDownload;
    }

    public int getIfNext() {
        return ifNext;
    }

    public void setIfNext(int ifNext) {
        this.ifNext = ifNext;
    }

    public String getLastOrderTime() {
        return lastOrderTime;
    }

    public void setLastOrderTime(String lastOrderTime) {
        this.lastOrderTime = lastOrderTime;
    }

    public List<OrderVosBean> getOrderVos() {
        return orderVos;
    }

    public void setOrderVos(List<OrderVosBean> orderVos) {
        this.orderVos = orderVos;
    }

    public static class OrderVosBean {


        /**
         * bonus : null
         * createTime : 2016-11-10
         * gameName : 上海快3
         * orderAmount : 8
         * orderId : 16083120010190099247
         * orderStatus : 5
         * orderStatusCn : 等待开奖
         * orderType : 1
         * orderTypeCn : 普通投注
         * periodId : 2016111111
         * prizeStatus : 0
         * successTickets : null
         * totalTickets : 4
         */
        private int ifSkipDetail;
        private Object bonus;
        private String createTime;
        private String gameName;
        private String orderAmount;
        private String orderId;
        private int orderStatus;
        private String orderStatusCn;
        private int orderType;
        private String orderTypeCn;
        private String periodId;
        private int prizeStatus;
        private Object successTickets;
        private int totalTickets;


        public int getIfSkipDetail() {
            return ifSkipDetail;
        }

        public void setIfSkipDetail(int ifSkipDetail) {
            this.ifSkipDetail = ifSkipDetail;
        }
        public Object getBonus() {
            return bonus;
        }

        public void setBonus(Object bonus) {
            this.bonus = bonus;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public String getGameName() {
            return gameName;
        }

        public void setGameName(String gameName) {
            this.gameName = gameName;
        }

        public String getOrderAmount() {
            return orderAmount;
        }

        public void setOrderAmount(String orderAmount) {
            this.orderAmount = orderAmount;
        }

        public String getOrderId() {
            return orderId;
        }

        public void setOrderId(String orderId) {
            this.orderId = orderId;
        }

        public int getOrderStatus() {
            return orderStatus;
        }

        public void setOrderStatus(int orderStatus) {
            this.orderStatus = orderStatus;
        }

        public String getOrderStatusCn() {
            return orderStatusCn;
        }

        public void setOrderStatusCn(String orderStatusCn) {
            this.orderStatusCn = orderStatusCn;
        }

        public int getOrderType() {
            return orderType;
        }

        public void setOrderType(int orderType) {
            this.orderType = orderType;
        }

        public String getOrderTypeCn() {
            return orderTypeCn;
        }

        public void setOrderTypeCn(String orderTypeCn) {
            this.orderTypeCn = orderTypeCn;
        }

        public String getPeriodId() {
            return periodId;
        }

        public void setPeriodId(String periodId) {
            this.periodId = periodId;
        }

        public int getPrizeStatus() {
            return prizeStatus;
        }

        public void setPrizeStatus(int prizeStatus) {
            this.prizeStatus = prizeStatus;
        }

        public Object getSuccessTickets() {
            return successTickets;
        }

        public void setSuccessTickets(Object successTickets) {
            this.successTickets = successTickets;
        }

        public int getTotalTickets() {
            return totalTickets;
        }

        public void setTotalTickets(int totalTickets) {
            this.totalTickets = totalTickets;
        }
    }
}
