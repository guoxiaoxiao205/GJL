package com.example.app.http.response;

/**
 * Created by guoxiao on 17/1/17.
 */

public class RealTimeBetResponse {
    /**
     * periodId : 20160926004
     * winningNumbers : 1 2 3
     * gameName : 上海快3
     * gameEn : shKuai3
     * awardStatus : 1
     * awardTime : 2016-11-04 11:10
     * resultMap : {"hezhi":6,"awardShape":"三不同号","awardStyle1":"小","awardStyle2":"双"}
     */

    private String periodId;
    private String winningNumbers;
    private String gameName;
    private String gameEn;
    private int awardStatus;
    private String awardTime;
    private ResultMapBean resultMap;
    private String awardStatusCn;
    public String getAwardStatusCn() {
        return awardStatusCn;
    }

    public void setAwardStatusCn(String awardStatusCn) {
        this.awardStatusCn = awardStatusCn;
    }


    public String getPeriodId() {
        return periodId;
    }

    public void setPeriodId(String periodId) {
        this.periodId = periodId;
    }

    public String getWinningNumbers() {
        return winningNumbers;
    }

    public void setWinningNumbers(String winningNumbers) {
        this.winningNumbers = winningNumbers;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getGameEn() {
        return gameEn;
    }

    public void setGameEn(String gameEn) {
        this.gameEn = gameEn;
    }

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

    public ResultMapBean getResultMap() {
        return resultMap;
    }

    public void setResultMap(ResultMapBean resultMap) {
        this.resultMap = resultMap;
    }

    public static class ResultMapBean {
        /**
         * hezhi : 6
         * awardShape : 三不同号
         * awardStyle1 : 小
         * awardStyle2 : 双
         */

        private int hezhi;
        private String awardShape;
        private String awardStyle1;
        private String awardStyle2;

        public int getHezhi() {
            return hezhi;
        }

        public void setHezhi(int hezhi) {
            this.hezhi = hezhi;
        }

        public String getAwardShape() {
            return awardShape;
        }

        public void setAwardShape(String awardShape) {
            this.awardShape = awardShape;
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
    }
}
