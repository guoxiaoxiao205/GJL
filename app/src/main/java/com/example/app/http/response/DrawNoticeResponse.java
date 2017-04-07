package com.example.app.http.response;

import java.io.Serializable;
import java.util.List;

/**
 * Created by guoxiao on 16/12/13.
 */

public class DrawNoticeResponse implements Serializable {

    /**
     * awardStatus : 1
     * awardTime : 2016-12-26 09:28
     * gameEn : shKuai3
     * gameName : 沪快3
     * periodId : 20161226004
     * playTypeAndBonus : ["和值,9-240","三同号通选,40","三同号单选,240","三不同号,40","三连号通选,10","二同号复选,15","二同号单选,80","二不同号,8"]
     * resultMap : {"awardShape":"三连号","hezhi":6}
     * winningNumbers : 1 2 3
     */

    private int awardStatus;
    private String awardTime;
    private String gameEn;
    private String gameName;
    private String periodId;
    private ResultMapBean resultMap;
    private String winningNumbers;
    private List<String> playTypeAndBonus;
    private String periodSale;
    private String poolBonus;

    public String getPeriodSale() {
        return periodSale;
    }

    public void setPeriodSale(String periodSale) {
        this.periodSale = periodSale;
    }

    public String getPoolBonus() {
        return poolBonus;
    }

    public void setPoolBonus(String poolBonus) {
        this.poolBonus = poolBonus;
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

    public List<String> getPlayTypeAndBonus() {
        return playTypeAndBonus;
    }

    public void setPlayTypeAndBonus(List<String> playTypeAndBonus) {
        this.playTypeAndBonus = playTypeAndBonus;
    }

    public static class ResultMapBean  implements Serializable {
        /**
         * awardShape : 三连号
         * hezhi : 6
         */

        private String awardShape;
        private int hezhi;

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
