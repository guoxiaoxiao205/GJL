package com.example.app.http.response;

import java.util.List;

/**
 * Created by wanxin on 16/12/19.
 */

public class FollowOrderDetailResponse {

    /**
     * amount : 24.0
     * bonus : null
     * commonFlag : 0
     * followId : 161219160000021778
     * followInfo : 已追0期/共12期
     * followModeCn : 到期后停止
     * followName : 上海快3追号
     * followOrderVos : [{"bonus":null,"click":0,"commonFlag":0,"gameId":1,"orderAmount":2,"orderId":"16121916SHK440001753178","orderStatus":1,"orderStatusCn":"---","orderTime":null,"periodId":"20161219044","prizeStatus":1,"successTickets":null,"userCode":"01445521690334915078"}]
     * followStatus : 1
     * followStatusCn : 过期未支付
     * gameEn : shKuai3
     * gameId : 1
     * gameName : 沪快3
     * ifShowPay : 0
     * ifShowTrueAmount : 0
     * lotteryNumVoList : [{"extraCn":"和值","lotteryNumberList":["8"]}]
     * periodCancel : 12
     * periodDone : 0
     * prizeStatus : 0
     * saleEndTime : -21894
     * totalPeriod : 12
     * trueAmount : 0.0
     * "ifShowRefundDesc":0,
     *   "ifShowOrderRefundDesc":0,          //是否显示页面中部退款说明  0:不显示  1:显示
     "ifShowFollowRefundDesc":0,
     * userCode : 01445521690334915078
     */


    private double amount;
    private String bonus;
    private int commonFlag;
    private int ifShowRefundDesc;
    private String followId;
    private String followInfo;
    private String followModeCn;
    private String followName;
    private int followStatus;
    private String followStatusCn;
    private String gameEn;
    private int gameId;
    private String gameName;
    private int ifShowPay;
    private int ifShowTrueAmount;
    private int ifShowOrderRefundDesc;
    private int ifShowFollowRefundDesc;
    private int periodCancel;
    private int periodDone;
    private int prizeStatus;
    private int saleEndTime;
    private int totalPeriod;
    private double trueAmount;
    private String userCode;
    private List<FollowOrderVosBean> followOrderVos;
    private List<LotteryNumVoListBean> lotteryNumVoList;

    public int getIfShowOrderRefundDesc() {
        return ifShowOrderRefundDesc;
    }

    public void setIfShowOrderRefundDesc(int ifShowOrderRefundDesc) {
        this.ifShowOrderRefundDesc = ifShowOrderRefundDesc;
    }

    public int getIfShowFollowRefundDesc() {
        return ifShowFollowRefundDesc;
    }

    public void setIfShowFollowRefundDesc(int ifShowFollowRefundDesc) {
        this.ifShowFollowRefundDesc = ifShowFollowRefundDesc;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getIfShowRefundDesc() {
        return ifShowRefundDesc;
    }

    public void setIfShowRefundDesc(int ifShowRefundDesc) {
        this.ifShowRefundDesc = ifShowRefundDesc;
    }

    public String getBonus() {
        return bonus;
    }

    public void setBonus(String bonus) {
        this.bonus = bonus;
    }

    public int getCommonFlag() {
        return commonFlag;
    }

    public void setCommonFlag(int commonFlag) {
        this.commonFlag = commonFlag;
    }

    public String getFollowId() {
        return followId;
    }

    public void setFollowId(String followId) {
        this.followId = followId;
    }

    public String getFollowInfo() {
        return followInfo;
    }

    public void setFollowInfo(String followInfo) {
        this.followInfo = followInfo;
    }

    public String getFollowModeCn() {
        return followModeCn;
    }

    public void setFollowModeCn(String followModeCn) {
        this.followModeCn = followModeCn;
    }

    public String getFollowName() {
        return followName;
    }

    public void setFollowName(String followName) {
        this.followName = followName;
    }

    public int getFollowStatus() {
        return followStatus;
    }

    public void setFollowStatus(int followStatus) {
        this.followStatus = followStatus;
    }

    public String getFollowStatusCn() {
        return followStatusCn;
    }

    public void setFollowStatusCn(String followStatusCn) {
        this.followStatusCn = followStatusCn;
    }

    public String getGameEn() {
        return gameEn;
    }

    public void setGameEn(String gameEn) {
        this.gameEn = gameEn;
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public int getIfShowPay() {
        return ifShowPay;
    }

    public void setIfShowPay(int ifShowPay) {
        this.ifShowPay = ifShowPay;
    }

    public int getIfShowTrueAmount() {
        return ifShowTrueAmount;
    }

    public void setIfShowTrueAmount(int ifShowTrueAmount) {
        this.ifShowTrueAmount = ifShowTrueAmount;
    }

    public int getPeriodCancel() {
        return periodCancel;
    }

    public void setPeriodCancel(int periodCancel) {
        this.periodCancel = periodCancel;
    }

    public int getPeriodDone() {
        return periodDone;
    }

    public void setPeriodDone(int periodDone) {
        this.periodDone = periodDone;
    }

    public int getPrizeStatus() {
        return prizeStatus;
    }

    public void setPrizeStatus(int prizeStatus) {
        this.prizeStatus = prizeStatus;
    }

    public int getSaleEndTime() {
        return saleEndTime;
    }

    public void setSaleEndTime(int saleEndTime) {
        this.saleEndTime = saleEndTime;
    }

    public int getTotalPeriod() {
        return totalPeriod;
    }

    public void setTotalPeriod(int totalPeriod) {
        this.totalPeriod = totalPeriod;
    }

    public double getTrueAmount() {
        return trueAmount;
    }

    public void setTrueAmount(double trueAmount) {
        this.trueAmount = trueAmount;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public List<FollowOrderVosBean> getFollowOrderVos() {
        return followOrderVos;
    }

    public void setFollowOrderVos(List<FollowOrderVosBean> followOrderVos) {
        this.followOrderVos = followOrderVos;
    }

    public List<LotteryNumVoListBean> getLotteryNumVoList() {
        return lotteryNumVoList;
    }

    public void setLotteryNumVoList(List<LotteryNumVoListBean> lotteryNumVoList) {
        this.lotteryNumVoList = lotteryNumVoList;
    }

    public static class FollowOrderVosBean {

        /**
         * bonus : null
         * click : 0
         * commonFlag : 0
         * gameId : 1
         * orderAmount : 2.0
         * orderId : 16121916SHK440001753178
         * orderStatus : 1
         * orderStatusCn : ---
         * orderTime : null
         * periodId : 20161219044
         * prizeStatus : 1
         * successTickets : null
         * userCode : 01445521690334915078
         *   private int followStatus;
         */
        private Object bonus;
        private int click;
        private int commonFlag;
        private int gameId;
        private double orderAmount;
        private String orderId;
        private int orderStatus;
        private String orderStatusCn;
        private Object orderTime;
        private String periodId;
        private int prizeStatus;
        private Object successTickets;
        private String userCode;

        public Object getBonus() {
            return bonus;
        }

        public void setBonus(Object bonus) {
            this.bonus = bonus;
        }

        public int getClick() {
            return click;
        }

        public void setClick(int click) {
            this.click = click;
        }

        public int getCommonFlag() {
            return commonFlag;
        }

        public void setCommonFlag(int commonFlag) {
            this.commonFlag = commonFlag;
        }

        public int getGameId() {
            return gameId;
        }

        public void setGameId(int gameId) {
            this.gameId = gameId;
        }

        public double getOrderAmount() {
            return orderAmount;
        }

        public void setOrderAmount(double orderAmount) {
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

        public Object getOrderTime() {
            return orderTime;
        }

        public void setOrderTime(Object orderTime) {
            this.orderTime = orderTime;
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

        public String getUserCode() {
            return userCode;
        }

        public void setUserCode(String userCode) {
            this.userCode = userCode;
        }
    }

    public static class LotteryNumVoListBean {

        /**
         * extraCn : 和值
         * lotteryNumber : 5 9
         */

        private String extraCn;
        private String lotteryNumber;

        public String getExtraCn() {
            return extraCn;
        }

        public void setExtraCn(String extraCn) {
            this.extraCn = extraCn;
        }

        public String getLotteryNumber() {
            return lotteryNumber;
        }

        public void setLotteryNumber(String lotteryNumber) {
            this.lotteryNumber = lotteryNumber;
        }
    }
}
