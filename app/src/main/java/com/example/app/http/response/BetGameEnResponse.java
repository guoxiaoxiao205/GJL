package com.example.app.http.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by guoxiao on 16/12/13.
 */

public class BetGameEnResponse {

    /**
     *
     *
     * awardInfoVos : [{"awardStatus":1,"awardTime":"2017-01-11 12:28","gameEn":"shKuai3","gameName":"沪快3","periodId":"22","playTypeAndBonus":null,"resultMap":{"awardStyle1":"小","awardStyle2":"单","awardShape":"三同号","hezhi":3},"winningNumbers":"1 1 1"},{"awardStatus":1,"awardTime":"2017-01-11 12:38","gameEn":"shKuai3","gameName":"沪快3","periodId":"23","playTypeAndBonus":null,"resultMap":{"awardStyle1":"小","awardStyle2":"单","awardShape":"三同号","hezhi":3},"winningNumbers":"1 1 1"},{"awardStatus":1,"awardTime":"2017-01-11 12:48","gameEn":"shKuai3","gameName":"沪快3","periodId":"24","playTypeAndBonus":null,"resultMap":{"awardStyle1":"小","awardStyle2":"单","awardShape":"三同号","hezhi":3},"winningNumbers":"1 1 1"},{"awardStatus":1,"awardTime":"2017-01-11 12:58","gameEn":"shKuai3","gameName":"沪快3","periodId":"25","playTypeAndBonus":null,"resultMap":{"awardStyle1":"小","awardStyle2":"单","awardShape":"三同号","hezhi":3},"winningNumbers":"1 1 1"},{"awardStatus":1,"awardTime":"2017-01-11 13:08","gameEn":"shKuai3","gameName":"沪快3","periodId":"26","playTypeAndBonus":null,"resultMap":{"awardStyle1":"小","awardStyle2":"单","awardShape":"三同号","hezhi":3},"winningNumbers":"1 1 1"},{"awardStatus":1,"awardTime":"2017-01-11 13:18","gameEn":"shKuai3","gameName":"沪快3","periodId":"27","playTypeAndBonus":null,"resultMap":{"awardStyle1":"小","awardStyle2":"单","awardShape":"三同号","hezhi":3},"winningNumbers":"1 1 1"},{"awardStatus":0,"awardTime":"2017-01-11 13:28","gameEn":"shKuai3","gameName":"沪快3","periodId":"28","playTypeAndBonus":null,"resultMap":{"awardStatusCn":"等待开奖"},"winningNumbers":""},{"awardStatus":0,"awardTime":"2017-01-11 13:38","gameEn":"shKuai3","gameName":"沪快3","periodId":"29","playTypeAndBonus":null,"resultMap":{"awardStatusCn":"等待开奖"},"winningNumbers":""},{"awardStatus":1,"awardTime":"2017-01-11 13:48","gameEn":"shKuai3","gameName":"沪快3","periodId":"30","playTypeAndBonus":null,"resultMap":{"awardStyle1":"小","awardStyle2":"单","awardShape":"三同号","hezhi":3},"winningNumbers":"1 1 1"},{"awardStatus":1,"awardTime":"2017-01-11 13:58","gameEn":"shKuai3","gameName":"沪快3","periodId":"31","playTypeAndBonus":null,"resultMap":{"awardStyle1":"小","awardStyle2":"单","awardShape":"三同号","hezhi":3},"winningNumbers":"1 1 1"}]
     * lastSubPeriod : 31
     * periodAllTime : 600
     * currentSubPeriod : 32
     * lastAwardInfo : {"awardStatus":1,"awardTime":"2017-01-11 13:58","gameEn":"shKuai3","gameName":"沪快3","periodId":"20170111031","playTypeAndBonus":null,"resultMap":{"awardStyle1":"小","awardStyle2":"单","awardShape":"三同号","hezhi":3},"winningNumbers":"1 1 1"}
     * currentPeriod : {"gameEn":"shKuai3","gameId":1,"gameName":"沪快3","maxBetTimes":100000,"periodId":"20170111032","saleEndTime":294}
     * awardInfoMap : {"1":80,"2":40,"3":25,"4":16,"5":12,"6":10,"7":9,"8":9,"9":10,"10":12,"11":16,"12":25,"13":40,"14":80,"15":40,"16":240,"17":40,"18":10,"19":15,"20":80,"21":8}
     */

    /**
     * beiTou
     * poolBonus
     * poolBonusInfo
     * gameType
     */

    private String beiTou;
    private String poolBonus;
    private int gameType;
    private String betEndInfo;

    public String getBeiTou() {
        return beiTou;
    }

    public void setBeiTou(String beiTou) {
        this.beiTou = beiTou;
    }

    public String getPoolBonus() {
        return poolBonus;
    }

    public void setPoolBonus(String poolBonus) {
        this.poolBonus = poolBonus;
    }

    public int getGameType() {
        return gameType;
    }

    public void setGameType(int gameType) {
        this.gameType = gameType;
    }

    public String getBetEndInfo() {
        return betEndInfo;
    }

    public void setBetEndInfo(String betEndInfo) {
        this.betEndInfo = betEndInfo;
    }

    private String lastSubPeriod;
    private int periodAllTime;
    private String currentSubPeriod;
    private LastAwardInfoBean lastAwardInfo;
    private CurrentPeriodBean currentPeriod;
    private AwardInfoMapBean awardInfoMap;
    private List<AwardInfoVosBean> awardInfoVos;

    /*"gameActivity":{
                             "activityTitle":"★史无前例大加奖",
                             "activityUrl":"mz.caiqr.cn",
                             "activityTitleColor":"999999"
                             }
*/


    private GameActivity gameActivity;

    public GameActivity getGameActivity() {
        return gameActivity;
    }

    public void setGameActivity(GameActivity gameActivity) {
        this.gameActivity = gameActivity;
    }

    public static class GameActivity{
        private String activityTitle;
        private String activityUrl;
        private String activityTitleColor;

        public String getActivityTitle() {
            return activityTitle;
        }

        public void setActivityTitle(String activityTitle) {
            this.activityTitle = activityTitle;
        }

        public String getActivityUrl() {
            return activityUrl;
        }

        public void setActivityUrl(String activityUrl) {
            this.activityUrl = activityUrl;
        }

        public String getActivityTitleColor() {
            return activityTitleColor;
        }

        public void setActivityTitleColor(String activityTitleColor) {
            this.activityTitleColor = activityTitleColor;
        }
    }


    public String getLastSubPeriod() {
        return lastSubPeriod;
    }

    public void setLastSubPeriod(String lastSubPeriod) {
        this.lastSubPeriod = lastSubPeriod;
    }

    public int getPeriodAllTime() {
        return periodAllTime;
    }

    public void setPeriodAllTime(int periodAllTime) {
        this.periodAllTime = periodAllTime;
    }

    public String getCurrentSubPeriod() {
        return currentSubPeriod;
    }

    public void setCurrentSubPeriod(String currentSubPeriod) {
        this.currentSubPeriod = currentSubPeriod;
    }

    public LastAwardInfoBean getLastAwardInfo() {
        return lastAwardInfo;
    }

    public void setLastAwardInfo(LastAwardInfoBean lastAwardInfo) {
        this.lastAwardInfo = lastAwardInfo;
    }

    public CurrentPeriodBean getCurrentPeriod() {
        return currentPeriod;
    }

    public void setCurrentPeriod(CurrentPeriodBean currentPeriod) {
        this.currentPeriod = currentPeriod;
    }

    public AwardInfoMapBean getAwardInfoMap() {
        return awardInfoMap;
    }

    public void setAwardInfoMap(AwardInfoMapBean awardInfoMap) {
        this.awardInfoMap = awardInfoMap;
    }

    public List<AwardInfoVosBean> getAwardInfoVos() {
        return awardInfoVos;
    }

    public void setAwardInfoVos(List<AwardInfoVosBean> awardInfoVos) {
        this.awardInfoVos = awardInfoVos;
    }

    public MissingNumbers missingNumbers;

    @Override
    public String toString() {
        return "BetGameEnResponse{" +
                "beiTou='" + beiTou + '\'' +
                ", poolBonus='" + poolBonus + '\'' +
                ", gameType=" + gameType +
                ", betEndInfo='" + betEndInfo + '\'' +
                ", lastSubPeriod='" + lastSubPeriod + '\'' +
                ", periodAllTime=" + periodAllTime +
                ", currentSubPeriod='" + currentSubPeriod + '\'' +
                ", lastAwardInfo=" + lastAwardInfo +
                ", currentPeriod=" + currentPeriod +
                ", awardInfoMap=" + awardInfoMap +
                ", awardInfoVos=" + awardInfoVos +
                '}';
    }

    public MissingNumbers getMissingNumbers() {
        return missingNumbers;
    }

    public void setMissingNumbers(MissingNumbers missingNumbers) {
        this.missingNumbers = missingNumbers;
    }

    public static class MissingNumbers {
        private List<String> HEZHI;
        private List<String> ABC_3_ALL;
        private List<String> SAME_2_ALL;
        private List<String> SAME_3_SINGLE;
        private List<String> DIFF_3;
        private List<String> SAME_2_SINGLE;
        private List<String> DIFF_2;
        private List<String> SAME_3_ALL;
        private List<String> REN8;
        private List<String> REN7;
        private List<String> REN6;
        private List<String> REN5;
        private List<String> REN4;
        private List<String> REN3;
        private List<String> REN2;
        private List<String> QIAN_1;
        private List<String> QIAN_2_ZUXUAN;
        private List<String> QIAN_3_ZUXUAN;
        private List<String> QIAN_2_ZHIXUAN;
        private List<String> QIAN_3_ZHIXUAN;
        private List<String> AHEAD;
        private List<String> BACK;
        private List<String> RED;
        private List<String> BLUE;

        public List<String> getSAME_2_SINGLE() {
            return SAME_2_SINGLE;
        }

        public void setSAME_2_SINGLE(List<String> SAME_2_SINGLE) {
            this.SAME_2_SINGLE = SAME_2_SINGLE;
        }
        public List<String> getHEZHI() {
            return HEZHI;
        }

        public void setHEZHI(List<String> HEZHI) {
            this.HEZHI = HEZHI;
        }

        public List<String> getABC_3_ALL() {
            return ABC_3_ALL;
        }

        public void setABC_3_ALL(List<String> ABC_3_ALL) {
            this.ABC_3_ALL = ABC_3_ALL;
        }

        public List<String> getSAME_2_ALL() {
            return SAME_2_ALL;
        }

        public void setSAME_2_ALL(List<String> SAME_2_ALL) {
            this.SAME_2_ALL = SAME_2_ALL;
        }

        public List<String> getSAME_3_SINGLE() {
            return SAME_3_SINGLE;
        }

        public void setSAME_3_SINGLE(List<String> SAME_3_SINGLE) {
            this.SAME_3_SINGLE = SAME_3_SINGLE;
        }

        public List<String> getDIFF_3() {
            return DIFF_3;
        }

        public void setDIFF_3(List<String> DIFF_3) {
            this.DIFF_3 = DIFF_3;
        }

        public List<String> getDIFF_2() {
            return DIFF_2;
        }

        public void setDIFF_2(List<String> DIFF_2) {
            this.DIFF_2 = DIFF_2;
        }

        public List<String> getSAME_3_ALL() {
            return SAME_3_ALL;
        }

        public void setSAME_3_ALL(List<String> SAME_3_ALL) {
            this.SAME_3_ALL = SAME_3_ALL;
        }

        public List<String> getREN8() {
            return REN8;
        }

        public void setREN8(List<String> REN8) {
            this.REN8 = REN8;
        }

        public List<String> getREN7() {
            return REN7;
        }

        public void setREN7(List<String> REN7) {
            this.REN7 = REN7;
        }

        public List<String> getREN6() {
            return REN6;
        }

        public void setREN6(List<String> REN6) {
            this.REN6 = REN6;
        }

        public List<String> getREN5() {
            return REN5;
        }

        public void setREN5(List<String> REN5) {
            this.REN5 = REN5;
        }

        public List<String> getREN4() {
            return REN4;
        }

        public void setREN4(List<String> REN4) {
            this.REN4 = REN4;
        }

        public List<String> getREN3() {
            return REN3;
        }

        public void setREN3(List<String> REN3) {
            this.REN3 = REN3;
        }

        public List<String> getREN2() {
            return REN2;
        }

        public void setREN2(List<String> REN2) {
            this.REN2 = REN2;
        }

        public List<String> getQIAN_1() {
            return QIAN_1;
        }

        public void setQIAN_1(List<String> QIAN_1) {
            this.QIAN_1 = QIAN_1;
        }

        public List<String> getQIAN_2_ZUXUAN() {
            return QIAN_2_ZUXUAN;
        }

        public void setQIAN_2_ZUXUAN(List<String> QIAN_2_ZUXUAN) {
            this.QIAN_2_ZUXUAN = QIAN_2_ZUXUAN;
        }

        public List<String> getQIAN_3_ZUXUAN() {
            return QIAN_3_ZUXUAN;
        }

        public void setQIAN_3_ZUXUAN(List<String> QIAN_3_ZUXUAN) {
            this.QIAN_3_ZUXUAN = QIAN_3_ZUXUAN;
        }

        public List<String> getQIAN_2_ZHIXUAN() {
            return QIAN_2_ZHIXUAN;
        }

        public void setQIAN_2_ZHIXUAN(List<String> QIAN_2_ZHIXUAN) {
            this.QIAN_2_ZHIXUAN = QIAN_2_ZHIXUAN;
        }

        public List<String> getQIAN_3_ZHIXUAN() {
            return QIAN_3_ZHIXUAN;
        }

        public void setQIAN_3_ZHIXUAN(List<String> QIAN_3_ZHIXUAN) {
            this.QIAN_3_ZHIXUAN = QIAN_3_ZHIXUAN;
        }

        public List<String> getAHEAD() {
            return AHEAD;
        }

        public void setAHEAD(List<String> AHEAD) {
            this.AHEAD = AHEAD;
        }

        public List<String> getBACK() {
            return BACK;
        }

        public void setBACK(List<String> BACK) {
            this.BACK = BACK;
        }

        public List<String> getRED() {
            return RED;
        }

        public void setRED(List<String> RED) {
            this.RED = RED;
        }

        public List<String> getBLUE() {
            return BLUE;
        }

        public void setBLUE(List<String> BLUE) {
            this.BLUE = BLUE;
        }
    }


    public static class LastAwardInfoBean {
        /**
         * awardStatus : 1
         * awardTime : 2017-01-11 13:58
         * gameEn : shKuai3
         * gameName : 沪快3
         * periodId : 20170111031
         * playTypeAndBonus : null
         * resultMap : {"awardStyle1":"小","awardStyle2":"单","awardShape":"三同号","hezhi":3}
         * winningNumbers : 1 1 1
         */

        private int awardStatus;
        private String awardTime;
        private String gameEn;
        private String gameName;
        private String periodId;
        private Object playTypeAndBonus;
        private ResultMapBean resultMap;
        private String winningNumbers;

        public int getAwardStatus() {
            return awardStatus;
        }

        public void setAwardStatus(int awardStatus) {
            this.awardStatus = awardStatus;
        }

        public String getAwardTime() {
            return awardTime;
        }

        public void setAwardTime(String awardTime) {
            this.awardTime = awardTime;
        }

        public String getGameEn() {
            return gameEn;
        }

        public void setGameEn(String gameEn) {
            this.gameEn = gameEn;
        }

        public String getGameName() {
            return gameName;
        }

        public void setGameName(String gameName) {
            this.gameName = gameName;
        }

        public String getPeriodId() {
            return periodId;
        }

        public void setPeriodId(String periodId) {
            this.periodId = periodId;
        }

        public Object getPlayTypeAndBonus() {
            return playTypeAndBonus;
        }

        public void setPlayTypeAndBonus(Object playTypeAndBonus) {
            this.playTypeAndBonus = playTypeAndBonus;
        }

        public ResultMapBean getResultMap() {
            return resultMap;
        }

        public void setResultMap(ResultMapBean resultMap) {
            this.resultMap = resultMap;
        }

        public String getWinningNumbers() {
            return winningNumbers;
        }

        public void setWinningNumbers(String winningNumbers) {
            this.winningNumbers = winningNumbers;
        }

        public static class ResultMapBean {
            /**
             * awardStyle1 : 小
             * awardStyle2 : 单
             * awardShape : 三同号
             * hezhi : 3
             * "awardStatusCn":"等待开奖"
             */

            private String awardStyle1;
            private String awardStyle2;
            private String awardShape;
            private int hezhi;
            private String awardStatusCn;

            public String getAwardStatusCn() {
                return awardStatusCn;
            }

            public void setAwardStatusCn(String awardStatusCn) {
                this.awardStatusCn = awardStatusCn;
            }

            public String getAwardStyle1() {
                return awardStyle1;
            }

            public void setAwardStyle1(String awardStyle1) {
                this.awardStyle1 = awardStyle1;
            }

            public String getAwardStyle2() {
                return awardStyle2;
            }

            public void setAwardStyle2(String awardStyle2) {
                this.awardStyle2 = awardStyle2;
            }

            public String getAwardShape() {
                return awardShape;
            }

            public void setAwardShape(String awardShape) {
                this.awardShape = awardShape;
            }

            public int getHezhi() {
                return hezhi;
            }

            public void setHezhi(int hezhi) {
                this.hezhi = hezhi;
            }
        }
    }

    public static class CurrentPeriodBean {
        /**
         * gameEn : shKuai3
         * gameId : 1
         * gameName : 沪快3
         * maxBetTimes : 100000
         * periodId : 20170111032
         * saleEndTime : 294
         */

        private String gameEn;
        private int gameId;
        private String gameName;
        private int maxBetTimes;
        private String periodId;
        private int saleEndTime;

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

        public int getMaxBetTimes() {
            return maxBetTimes;
        }

        public void setMaxBetTimes(int maxBetTimes) {
            this.maxBetTimes = maxBetTimes;
        }

        public String getPeriodId() {
            return periodId;
        }

        public void setPeriodId(String periodId) {
            this.periodId = periodId;
        }

        public int getSaleEndTime() {
            return saleEndTime;
        }

        public void setSaleEndTime(int saleEndTime) {
            this.saleEndTime = saleEndTime;
        }
    }

    public static class AwardInfoMapBean {
        /**
         * 1 : 80
         * 2 : 40
         * 3 : 25
         * 4 : 16
         * 5 : 12
         * 6 : 10
         * 7 : 9
         * 8 : 9
         * 9 : 10
         * 10 : 12
         * 11 : 16
         * 12 : 25
         * 13 : 40
         * 14 : 80
         * 15 : 40
         * 16 : 240
         * 17 : 40
         * 18 : 10
         * 19 : 15
         * 20 : 80
         * 21 : 8
         */

        @SerializedName("1")
        private int value1;
        @SerializedName("2")
        private int value2;
        @SerializedName("3")
        private int value3;
        @SerializedName("4")
        private int value4;
        @SerializedName("5")
        private int value5;
        @SerializedName("6")
        private int value6;
        @SerializedName("7")
        private int value7;
        @SerializedName("8")
        private int value8;
        @SerializedName("9")
        private int value9;
        @SerializedName("10")
        private int value10;
        @SerializedName("11")
        private int value11;
        @SerializedName("12")
        private int value12;
        @SerializedName("13")
        private int value13;
        @SerializedName("14")
        private int value14;
        @SerializedName("15")
        private int value15;
        @SerializedName("16")
        private int value16;
        @SerializedName("17")
        private int value17;
        @SerializedName("18")
        private int value18;
        @SerializedName("19")
        private int value19;
        @SerializedName("20")
        private int value20;
        @SerializedName("21")
        private int value21;

        public int getValue1() {
            return value1;
        }

        public void setValue1(int value1) {
            this.value1 = value1;
        }

        public int getValue2() {
            return value2;
        }

        public void setValue2(int value2) {
            this.value2 = value2;
        }

        public int getValue3() {
            return value3;
        }

        public void setValue3(int value3) {
            this.value3 = value3;
        }

        public int getValue4() {
            return value4;
        }

        public void setValue4(int value4) {
            this.value4 = value4;
        }

        public int getValue5() {
            return value5;
        }

        public void setValue5(int value5) {
            this.value5 = value5;
        }

        public int getValue6() {
            return value6;
        }

        public void setValue6(int value6) {
            this.value6 = value6;
        }

        public int getValue7() {
            return value7;
        }

        public void setValue7(int value7) {
            this.value7 = value7;
        }

        public int getValue8() {
            return value8;
        }

        public void setValue8(int value8) {
            this.value8 = value8;
        }

        public int getValue9() {
            return value9;
        }

        public void setValue9(int value9) {
            this.value9 = value9;
        }

        public int getValue10() {
            return value10;
        }

        public void setValue10(int value10) {
            this.value10 = value10;
        }

        public int getValue11() {
            return value11;
        }

        public void setValue11(int value11) {
            this.value11 = value11;
        }

        public int getValue12() {
            return value12;
        }

        public void setValue12(int value12) {
            this.value12 = value12;
        }

        public int getValue13() {
            return value13;
        }

        public void setValue13(int value13) {
            this.value13 = value13;
        }

        public int getValue14() {
            return value14;
        }

        public void setValue14(int value14) {
            this.value14 = value14;
        }

        public int getValue15() {
            return value15;
        }

        public void setValue15(int value15) {
            this.value15 = value15;
        }

        public int getValue16() {
            return value16;
        }

        public void setValue16(int value16) {
            this.value16 = value16;
        }

        public int getValue17() {
            return value17;
        }

        public void setValue17(int value17) {
            this.value17 = value17;
        }

        public int getValue18() {
            return value18;
        }

        public void setValue18(int value18) {
            this.value18 = value18;
        }

        public int getValue19() {
            return value19;
        }

        public void setValue19(int value19) {
            this.value19 = value19;
        }

        public int getValue20() {
            return value20;
        }

        public void setValue20(int value20) {
            this.value20 = value20;
        }

        public int getValue21() {
            return value21;
        }

        public void setValue21(int value21) {
            this.value21 = value21;
        }
    }

    public static class AwardInfoVosBean {
        @Override
        public String toString() {
            return "AwardInfoVosBean{" +
                    "awardStatus=" + awardStatus +
                    ", awardTime='" + awardTime + '\'' +
                    ", gameEn='" + gameEn + '\'' +
                    ", gameName='" + gameName + '\'' +
                    ", periodId='" + periodId + '\'' +
                    ", playTypeAndBonus=" + playTypeAndBonus +
                    ", resultMap=" + resultMap +
                    ", winningNumbers='" + winningNumbers + '\'' +
                    '}';
        }

        /**
         * awardStatus : 1
         * awardTime : 2017-01-11 12:28
         * gameEn : shKuai3
         * gameName : 沪快3
         * periodId : 22
         * playTypeAndBonus : null
         * resultMap : {"awardStyle1":"小","awardStyle2":"单","awardShape":"三同号","hezhi":3}
         * winningNumbers : 1 1 1
         */

        private int awardStatus;
        private String awardTime;
        private String gameEn;
        private String gameName;
        private String periodId;
        private Object playTypeAndBonus;
        private ResultMapBeanX resultMap;
        private String winningNumbers;

        public int getAwardStatus() {
            return awardStatus;
        }

        public void setAwardStatus(int awardStatus) {
            this.awardStatus = awardStatus;
        }

        public String getAwardTime() {
            return awardTime;
        }

        public void setAwardTime(String awardTime) {
            this.awardTime = awardTime;
        }

        public String getGameEn() {
            return gameEn;
        }

        public void setGameEn(String gameEn) {
            this.gameEn = gameEn;
        }

        public String getGameName() {
            return gameName;
        }

        public void setGameName(String gameName) {
            this.gameName = gameName;
        }

        public String getPeriodId() {
            return periodId;
        }

        public void setPeriodId(String periodId) {
            this.periodId = periodId;
        }

        public Object getPlayTypeAndBonus() {
            return playTypeAndBonus;
        }

        public void setPlayTypeAndBonus(Object playTypeAndBonus) {
            this.playTypeAndBonus = playTypeAndBonus;
        }

        public ResultMapBeanX getResultMap() {
            return resultMap;
        }

        public void setResultMap(ResultMapBeanX resultMap) {
            this.resultMap = resultMap;
        }

        public String getWinningNumbers() {
            return winningNumbers;
        }

        public void setWinningNumbers(String winningNumbers) {
            this.winningNumbers = winningNumbers;
        }

        public static class ResultMapBeanX {
            /**
             * awardStyle1 : 小
             * awardStyle2 : 单
             * awardShape : 三同号
             * hezhi : 3
             */

            private String awardStyle1;
            private String awardStyle2;
            private String awardShape;
            private int hezhi;
            private int sum;

            public String getAwardStatusCn() {
                return awardStatusCn;
            }

            public void setAwardStatusCn(String awardStatusCn) {
                this.awardStatusCn = awardStatusCn;
            }

            public int getSum() {
                return sum;
            }

            public void setSum(int sum) {
                this.sum = sum;
            }

            private String awardStatusCn;

            public String getAwardStyle1() {
                return awardStyle1;
            }

            public void setAwardStyle1(String awardStyle1) {
                this.awardStyle1 = awardStyle1;
            }

            public String getAwardStyle2() {
                return awardStyle2;
            }

            public void setAwardStyle2(String awardStyle2) {
                this.awardStyle2 = awardStyle2;
            }

            public String getAwardShape() {
                return awardShape;
            }

            public void setAwardShape(String awardShape) {
                this.awardShape = awardShape;
            }

            public int getHezhi() {
                return hezhi;
            }

            public void setHezhi(int hezhi) {
                this.hezhi = hezhi;
            }
        }
    }



}
