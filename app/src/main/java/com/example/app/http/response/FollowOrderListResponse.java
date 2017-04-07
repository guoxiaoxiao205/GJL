package com.example.app.http.response;

import java.util.List;

/**
 * Created by wanxin on 16/11/14.
 */

public class FollowOrderListResponse {


    /**
     * followTime : 2017-02-07 14:53:43.596
     * followVoList : [{"bonus":18,"commonFlag":0,"createTime":"2月10日 14:22","followId":"170210140000188078","followInfo":"已追10期/共10期","followStatus":3,"followStatusCn":"中奖18.00元","gameName":"鄂11选5","periodCancel":0,"periodDone":10,"prizeStatus":2,"statusCnColor":"d21100","totalPeriod":10,"userCode":"01445521690334915078"},{"bonus":0,"commonFlag":0,"createTime":"2月10日 14:16","followId":"170210140000187978","followInfo":"已追5期/共5期","followStatus":3,"followStatusCn":"未中奖","gameName":"沪快3","periodCancel":0,"periodDone":5,"prizeStatus":1,"statusCnColor":"999999","totalPeriod":5,"userCode":"01445521690334915078"},{"bonus":0,"commonFlag":0,"createTime":"2月10日 14:16","followId":"170210140000187878","followInfo":"已追5期/共5期","followStatus":3,"followStatusCn":"未中奖","gameName":"鄂11选5","periodCancel":0,"periodDone":5,"prizeStatus":1,"statusCnColor":"999999","totalPeriod":5,"userCode":"01445521690334915078"},{"bonus":0,"commonFlag":0,"createTime":"2月10日 14:15","followId":"170210140000187778","followInfo":"已追25期/共25期","followStatus":3,"followStatusCn":"未中奖","gameName":"沪快3","periodCancel":0,"periodDone":25,"prizeStatus":1,"statusCnColor":"999999","totalPeriod":25,"userCode":"01445521690334915078"},{"bonus":2640,"commonFlag":0,"createTime":"2月10日 14:14","followId":"170210140000187678","followInfo":"已追46期/共46期","followStatus":3,"followStatusCn":"中奖2640.00元","gameName":"鄂11选5","periodCancel":0,"periodDone":46,"prizeStatus":2,"statusCnColor":"d21100","totalPeriod":46,"userCode":"01445521690334915078"},{"bonus":0,"commonFlag":0,"createTime":"2月10日 11:45","followId":"170210110000187578","followInfo":"已追10期/共10期","followStatus":3,"followStatusCn":"未中奖","gameName":"鲁11选5","periodCancel":0,"periodDone":10,"prizeStatus":1,"statusCnColor":"999999","totalPeriod":10,"userCode":"01445521690334915078"},{"bonus":0,"commonFlag":0,"createTime":"2月10日 11:44","followId":"170210110000187478","followInfo":"已追0期/共65期","followStatus":1,"followStatusCn":"过期未支付","gameName":"沪快3","periodCancel":65,"periodDone":0,"prizeStatus":1,"statusCnColor":"999999","totalPeriod":65,"userCode":"01445521690334915078"},{"bonus":0,"commonFlag":0,"createTime":"2月10日 11:43","followId":"170210110000187378","followInfo":"已追0期/共65期","followStatus":1,"followStatusCn":"过期未支付","gameName":"沪快3","periodCancel":65,"periodDone":0,"prizeStatus":1,"statusCnColor":"999999","totalPeriod":65,"userCode":"01445521690334915078"},{"bonus":0,"commonFlag":0,"createTime":"2月10日 11:43","followId":"170210110000187278","followInfo":"已追65期/共65期","followStatus":3,"followStatusCn":"未中奖","gameName":"沪快3","periodCancel":0,"periodDone":65,"prizeStatus":1,"statusCnColor":"999999","totalPeriod":65,"userCode":"01445521690334915078"},{"bonus":0,"commonFlag":0,"createTime":"2月9日 20:14","followId":"170209200000187178","followInfo":"已追14期/共14期","followStatus":3,"followStatusCn":"未中奖","gameName":"沪快3","periodCancel":0,"periodDone":14,"prizeStatus":1,"statusCnColor":"999999","totalPeriod":14,"userCode":"01445521690334915078"},{"bonus":0,"commonFlag":0,"createTime":"2月9日 20:14","followId":"170209200000187078","followInfo":"已追14期/共14期","followStatus":3,"followStatusCn":"未中奖","gameName":"沪快3","periodCancel":0,"periodDone":14,"prizeStatus":1,"statusCnColor":"999999","totalPeriod":14,"userCode":"01445521690334915078"},{"bonus":0,"commonFlag":0,"createTime":"2月9日 17:52","followId":"170209170000186978","followInfo":"已追10期/共10期","followStatus":3,"followStatusCn":"未中奖","gameName":"鄂11选5","periodCancel":0,"periodDone":10,"prizeStatus":1,"statusCnColor":"999999","totalPeriod":10,"userCode":"01445521690334915078"}]
     * ifNext : 0
     */

    private String downloadUrl;
    private int ifSkipDownload;
    private String followTime;
    private int ifNext;
    private List<FollowVoListBean> followVoList;


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

    public String getFollowTime() {
        return followTime;
    }

    public void setFollowTime(String followTime) {
        this.followTime = followTime;
    }

    public int getIfNext() {
        return ifNext;
    }

    public void setIfNext(int ifNext) {
        this.ifNext = ifNext;
    }

    public List<FollowVoListBean> getFollowVoList() {
        return followVoList;
    }

    public void setFollowVoList(List<FollowVoListBean> followVoList) {
        this.followVoList = followVoList;
    }

    public static class FollowVoListBean {

        /**
         * bonus : 18
         * commonFlag : 0
         * createTime : 2月10日 14:22
         * followId : 170210140000188078
         * followInfo : 已追10期/共10期
         * followStatus : 3
         * followStatusCn : 中奖18.00元
         * gameName : 鄂11选5
         * periodCancel : 0
         * periodDone : 10
         * prizeStatus : 2
         * statusCnColor : d21100
         * totalPeriod : 10
         * userCode : 01445521690334915078

         */
        private int ifSkipDetail;
        private int bonus;
        private int commonFlag;
        private String createTime;
        private String followId;
        private String followInfo;
        private int followStatus;
        private String followStatusCn;
        private String gameName;
        private int periodCancel;
        private int periodDone;
        private int prizeStatus;
        private String statusCnColor;
        private int totalPeriod;
        private String userCode;

        public int getIfSkipDetail() {
            return ifSkipDetail;
        }

        public void setIfSkipDetail(int ifSkipDetail) {
            this.ifSkipDetail = ifSkipDetail;
        }

        public int getBonus() {
            return bonus;
        }

        public void setBonus(int bonus) {
            this.bonus = bonus;
        }

        public int getCommonFlag() {
            return commonFlag;
        }

        public void setCommonFlag(int commonFlag) {
            this.commonFlag = commonFlag;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
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

        public String getGameName() {
            return gameName;
        }

        public void setGameName(String gameName) {
            this.gameName = gameName;
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

        public String getStatusCnColor() {
            return statusCnColor;
        }

        public void setStatusCnColor(String statusCnColor) {
            this.statusCnColor = statusCnColor;
        }

        public int getTotalPeriod() {
            return totalPeriod;
        }

        public void setTotalPeriod(int totalPeriod) {
            this.totalPeriod = totalPeriod;
        }

        public String getUserCode() {
            return userCode;
        }

        public void setUserCode(String userCode) {
            this.userCode = userCode;
        }
    }
}
