package com.example.app.http.response;

import java.util.List;

/**
 * Created by wanxin on 16/12/17.
 */

public class OrderDetailResponse {

    /**
     * betInfo : 1注，1倍
     * betNumbers : 1
     * betTimes : 1
     * bonus : 0.0
     * bonusColor:"999999
     * bonusStr:--,
     * bonusTitle:中奖奖金,
     * bonusColor:"999999",
     * commonFlag : 0
     * endTime : 1481889390728
     * gameEn : shKuai3
     * gameId : 1
     * gameName : 上海快3
     * ifShowPay : 0
     * ifShowTicket : 0
     * lineStatus : 1
     * lotteryNumVoList : [{"extraCn":"和值","lotteryNumberList":["4 ,1"]}]
     * orderAmount : 2.0
     * orderId : 16121619SHK670001741278
     * orderStatus : 4
     * orderStatusCn : 订单失败退款中
     * periodId : 20161216067
     * postStationName :
     * prizeStatus : 1
     * prizeStatusCn :
     * prompt : 中奖后奖金将会转入您的彩票账户余额，您的方案将由依法成立的投注站点进行出票，我们将及时通知您所获得的彩票状态，如因故障未能成功出票，我们将退款至可用余额。
     * refundAmount : 0
     * ifShowRefundDesc:1
     * refundingAmount : 2.0
     * remark : {"rt":2}
     * saleEndTime : -82863
     * statusProcess : ["已支付_Y_R","订单失败_X_R"]
     * successTickets : 0
     * timeName : 创建时间
     * timeValue : 2016年12月16日 19时54分13秒
     * totalTickets : 1
     * trueAmount : 0.0
     * awardTimeValue
     * userCode : 01445521690334915078
     * winningNumbers : 1 2 3
     * winningNumberColor:"333333",
     */

    private int ifShowRefundDesc;
    private String betInfo;
    private int betNumbers;
    private int betTimes;
    private String bonus;
    private String bonusColor;
    private String bonusStr;
    private String bonusTitle;
    private int commonFlag;
    private long endTime;
    private String gameEn;
    private int gameId;
    private String gameName;
    private int ifShowPay;
    private int ifShowTicket;
    private String lineStatus;
    private double orderAmount;
    private String orderId;
    private int orderStatus;
    private String orderStatusCn;
    private String periodId;
    private String postStationName;
    private int prizeStatus;
    private String prizeStatusCn;
    private String prompt;
    private int refundAmount;
    private double refundingAmount;
    private String remark;
    private int saleEndTime;
    private int successTickets;
    private String timeName;
    private String timeValue;
    private int totalTickets;
    private double trueAmount;
    private String userCode;
    private String awardTimeValue;
    private String winningNumbers;
    private String winningNumberColor;
    private List<LotteryNumVoListBean> lotteryNumVoList;
    private List<String> statusProcess;

    public String getAwardTimeValue() {
        return awardTimeValue;
    }

    public void setAwardTimeValue(String awardTimeValue) {
        this.awardTimeValue = awardTimeValue;
    }

    public int getIfShowRefundDesc() {
        return ifShowRefundDesc;
    }

    public void setIfShowRefundDesc(int ifShowRefundDesc) {
        this.ifShowRefundDesc = ifShowRefundDesc;
    }

    public String getBetInfo() {
        return betInfo;
    }

    public void setBetInfo(String betInfo) {
        this.betInfo = betInfo;
    }

    public int getBetNumbers() {
        return betNumbers;
    }

    public void setBetNumbers(int betNumbers) {
        this.betNumbers = betNumbers;
    }

    public int getBetTimes() {
        return betTimes;
    }

    public void setBetTimes(int betTimes) {
        this.betTimes = betTimes;
    }

    public String getBonus() {
        return bonus;
    }

    public void setBonus(String bonus) {
        this.bonus = bonus;
    }

    public String getBonusColor() {
        return bonusColor;
    }

    public void setBonusColor(String bonusColor) {
        this.bonusColor = bonusColor;
    }

    public String getBonusStr() {
        return bonusStr;
    }

    public void setBonusStr(String bonusStr) {
        this.bonusStr = bonusStr;
    }

    public String getBonusTitle() {
        return bonusTitle;
    }

    public void setBonusTitle(String bonusTitle) {
        this.bonusTitle = bonusTitle;
    }

    public int getCommonFlag() {
        return commonFlag;
    }

    public void setCommonFlag(int commonFlag) {
        this.commonFlag = commonFlag;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
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

    public int getIfShowTicket() {
        return ifShowTicket;
    }

    public void setIfShowTicket(int ifShowTicket) {
        this.ifShowTicket = ifShowTicket;
    }

    public String getLineStatus() {
        return lineStatus;
    }

    public void setLineStatus(String lineStatus) {
        this.lineStatus = lineStatus;
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

    public String getPeriodId() {
        return periodId;
    }

    public void setPeriodId(String periodId) {
        this.periodId = periodId;
    }

    public String getPostStationName() {
        return postStationName;
    }

    public void setPostStationName(String postStationName) {
        this.postStationName = postStationName;
    }

    public int getPrizeStatus() {
        return prizeStatus;
    }

    public void setPrizeStatus(int prizeStatus) {
        this.prizeStatus = prizeStatus;
    }

    public String getPrizeStatusCn() {
        return prizeStatusCn;
    }

    public void setPrizeStatusCn(String prizeStatusCn) {
        this.prizeStatusCn = prizeStatusCn;
    }

    public String getPrompt() {
        return prompt;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public int getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(int refundAmount) {
        this.refundAmount = refundAmount;
    }

    public double getRefundingAmount() {
        return refundingAmount;
    }

    public void setRefundingAmount(double refundingAmount) {
        this.refundingAmount = refundingAmount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getSaleEndTime() {
        return saleEndTime;
    }

    public void setSaleEndTime(int saleEndTime) {
        this.saleEndTime = saleEndTime;
    }

    public int getSuccessTickets() {
        return successTickets;
    }

    public void setSuccessTickets(int successTickets) {
        this.successTickets = successTickets;
    }

    public String getTimeName() {
        return timeName;
    }

    public void setTimeName(String timeName) {
        this.timeName = timeName;
    }

    public String getTimeValue() {
        return timeValue;
    }

    public void setTimeValue(String timeValue) {
        this.timeValue = timeValue;
    }

    public int getTotalTickets() {
        return totalTickets;
    }

    public void setTotalTickets(int totalTickets) {
        this.totalTickets = totalTickets;
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

    public String getWinningNumbers() {
        return winningNumbers;
    }

    public void setWinningNumbers(String winningNumbers) {
        this.winningNumbers = winningNumbers;
    }

    public String getWinningNumberColor() {
        return winningNumberColor;
    }

    public void setWinningNumberColor(String winningNumberColor) {
        this.winningNumberColor = winningNumberColor;
    }

    public List<LotteryNumVoListBean> getLotteryNumVoList() {
        return lotteryNumVoList;
    }

    public void setLotteryNumVoList(List<LotteryNumVoListBean> lotteryNumVoList) {
        this.lotteryNumVoList = lotteryNumVoList;
    }

    public List<String> getStatusProcess() {
        return statusProcess;
    }

    public void setStatusProcess(List<String> statusProcess) {
        this.statusProcess = statusProcess;
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
