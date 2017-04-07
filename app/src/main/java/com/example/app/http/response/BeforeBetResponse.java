package com.example.app.http.response;

/**
 * Created by guoxiao on 17/1/17.
 */

public class BeforeBetResponse {


    /**
     * nextPeriod : {"gameEn":"shKuai3","gameId":1,"gameName":"沪快3","maxBetTimes":100000,"periodId":"20170117054","saleEndTime":976}
     * subPeriod : 53
     * currentPeriod : {"gameEn":"shKuai3","gameId":1,"gameName":"沪快3","maxBetTimes":100000,"periodId":"20170117053","saleEndTime":376}
     */

    private NextPeriodBean nextPeriod;
    private String subPeriod;
    private CurrentPeriodBean currentPeriod;

    public NextPeriodBean getNextPeriod() {
        return nextPeriod;
    }

    public void setNextPeriod(NextPeriodBean nextPeriod) {
        this.nextPeriod = nextPeriod;
    }

    public String getSubPeriod() {
        return subPeriod;
    }

    public void setSubPeriod(String subPeriod) {
        this.subPeriod = subPeriod;
    }

    public CurrentPeriodBean getCurrentPeriod() {
        return currentPeriod;
    }

    public void setCurrentPeriod(CurrentPeriodBean currentPeriod) {
        this.currentPeriod = currentPeriod;
    }

    public static class NextPeriodBean {
        /**
         * gameEn : shKuai3
         * gameId : 1
         * gameName : 沪快3
         * maxBetTimes : 100000
         * periodId : 20170117054
         * saleEndTime : 976
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

    public static class CurrentPeriodBean {
        /**
         * gameEn : shKuai3
         * gameId : 1
         * gameName : 沪快3
         * maxBetTimes : 100000
         * periodId : 20170117053
         * saleEndTime : 376
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
}
