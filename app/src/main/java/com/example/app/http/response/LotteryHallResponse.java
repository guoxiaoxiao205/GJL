package com.example.app.http.response;

import java.io.Serializable;
import java.util.List;

/**
 * Created by wanxin on 16/12/13.
 */

public class LotteryHallResponse implements Serializable {


    /**
     * hotTips : 任选二：猜中两个即中奖
     * hotTitle : 鲁D11加奖10%
     * gamesEntranceCn : 热门彩种
     * reports : ["恭喜【null】投注上海快三中奖30元","恭喜【null】投注上海快三中奖80元","恭喜【null】投注上海快三中奖100元"]
     * gameEntrances : [{"contentUrl":"{\"1\":\"www.caiqiu.h5\",\"2\":\"www.caiqiu.appUrl\"}","entranceId":2,"imgUrl":"http://img1.imgtn.bdimg.com/it/u=696396444,983871085&fm=21&gp=0.jpg","isDel":0,"positionType":1,"tips":"十分钟一期","title":"江西11选5","weight":3}]
     * attentionEntranceCn : 今日关注
     * banners : [{"actionType":1,"bannerId":5,"detailUrl":"http://www.caiqr.com/","imgUrl":"http://pic2.ooopic.com/12/80/79/89b1OOOPICd2.jpg","title":"天天中大奖","weight":4}]
     * attentionEntrances : [{"contentUrl":"{\"1\":\"www.caiqiu.h5\",\"2\":\"www.caiqiu.appUrl\"}","entranceId":5,"imgUrl":"www.caiqiu.com","isDel":0,"positionType":2,"tips":"加奖30%","title":"湖北11选5","weight":4}]
     */

    private String gamesEntranceCn;
    private String attentionEntranceCn;
    private List<String> reports;
    private List<GameEntrancesBean> gameEntrances;
    private List<BannersBean> banners;
    private List<AttentionEntrancesBean> attentionEntrances;
    private List<HotGamePeriodsBean> hotGamePeriods;

    public String getGamesEntranceCn() {
        return gamesEntranceCn;
    }

    public void setGamesEntranceCn(String gamesEntranceCn) {
        this.gamesEntranceCn = gamesEntranceCn;
    }


    public String getAttentionEntranceCn() {
        return attentionEntranceCn;
    }

    public void setAttentionEntranceCn(String attentionEntranceCn) {
        this.attentionEntranceCn = attentionEntranceCn;
    }

    public List<String> getReports() {
        return reports;
    }

    public void setReports(List<String> reports) {
        this.reports = reports;
    }

    public List<GameEntrancesBean> getGameEntrances() {
        return gameEntrances;
    }

    public void setGameEntrances(List<GameEntrancesBean> gameEntrances) {
        this.gameEntrances = gameEntrances;
    }

    public List<BannersBean> getBanners() {
        return banners;
    }

    public void setBanners(List<BannersBean> banners) {
        this.banners = banners;
    }

    public List<AttentionEntrancesBean> getAttentionEntrances() {
        return attentionEntrances;
    }

    public void setAttentionEntrances(List<AttentionEntrancesBean> attentionEntrances) {
        this.attentionEntrances = attentionEntrances;
    }

    public List<HotGamePeriodsBean> getHotGamePeriods() {
        return hotGamePeriods;
    }

    public void setHotGamePeriods(List<HotGamePeriodsBean> hotGamePeriods) {
        this.hotGamePeriods = hotGamePeriods;
    }


    public static class GameEntrancesBean  implements Serializable {
        /**
         * contentUrl : {"1":"www.caiqiu.h5","2":"www.caiqiu.appUrl"}
         * entranceId : 2
         * imgUrl : http://img1.imgtn.bdimg.com/it/u=696396444,983871085&fm=21&gp=0.jpg
         * isDel : 0
         * gameEn : K3
         * positionType : 1
         * tips : 十分钟一期
         * title : 江西11选5
         * weight : 3
         *
         * "icon":"http://img.001",            //角标图片地址
         　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　"ifShowBackground":1
         */

        private String contentUrl;
        private int entranceId;
        private String imgUrl;
        private int isDel;
        private int positionType;
        private String tips;
        private String gameEn;
        private String title;
        private int weight;
        private String icon;
        private int ifShowBackground;

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public int getIfShowBackground() {
            return ifShowBackground;
        }

        public void setIfShowBackground(int ifShowBackground) {
            this.ifShowBackground = ifShowBackground;
        }

        public String getContentUrl() {
            return contentUrl;
        }

        public void setContentUrl(String contentUrl) {
            this.contentUrl = contentUrl;
        }

        public int getEntranceId() {
            return entranceId;
        }

        public void setEntranceId(int entranceId) {
            this.entranceId = entranceId;
        }

        public String getImgUrl() {
            return imgUrl;
        }

        public void setImgUrl(String imgUrl) {
            this.imgUrl = imgUrl;
        }

        public int getIsDel() {
            return isDel;
        }

        public void setIsDel(int isDel) {
            this.isDel = isDel;
        }

        public int getPositionType() {
            return positionType;
        }

        public void setPositionType(int positionType) {
            this.positionType = positionType;
        }

        public String getTips() {
            return tips;
        }

        public void setTips(String tips) {
            this.tips = tips;
        }

        public String getGameEn() {
            return gameEn;
        }

        public void setGameEn(String gameEn) {
            this.gameEn = gameEn;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }
    }

    public static class BannersBean  implements Serializable {
        /**
         * actionType : 1
         * bannerId : 5
         * detailUrl : http://www.caiqr.com/
         * imgUrl : http://pic2.ooopic.com/12/80/79/89b1OOOPICd2.jpg
         * title : 天天中大奖
         * weight : 4
         */

        private int actionType;
        private int bannerId;
        private String detailUrl;
        private String imgUrl;
        private String title;
        private int weight;

        public int getActionType() {
            return actionType;
        }

        public void setActionType(int actionType) {
            this.actionType = actionType;
        }

        public int getBannerId() {
            return bannerId;
        }

        public void setBannerId(int bannerId) {
            this.bannerId = bannerId;
        }

        public String getDetailUrl() {
            return detailUrl;
        }

        public void setDetailUrl(String detailUrl) {
            this.detailUrl = detailUrl;
        }

        public String getImgUrl() {
            return imgUrl;
        }

        public void setImgUrl(String imgUrl) {
            this.imgUrl = imgUrl;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }
    }

    public static class AttentionEntrancesBean  implements Serializable {
        @Override
        public String toString() {
            return "AttentionEntrancesBean{" +
                    "contentUrl='" + contentUrl + '\'' +
                    ", entranceId=" + entranceId +
                    ", imgUrl='" + imgUrl + '\'' +
                    ", isDel=" + isDel +
                    ", positionType=" + positionType +
                    ", tips='" + tips + '\'' +
                    ", title='" + title + '\'' +
                    ", weight=" + weight +
                    '}';
        }

        /**
         * contentUrl : "www.caiqiu.h5
         * entranceId : 5
         * imgUrl : www.caiqiu.com
         * isDel : 0
         * positionType : 2
         * tips : 加奖30%
         * title : 湖北11选5
         * weight : 4
         */

        private String contentUrl;
        private int entranceId;
        private String imgUrl;
        private int isDel;
        private int positionType;
        private String tips;
        private String title;
        private int weight;

        public String getContentUrl() {
            return contentUrl;
        }

        public void setContentUrl(String contentUrl) {
            this.contentUrl = contentUrl;
        }

        public int getEntranceId() {
            return entranceId;
        }

        public void setEntranceId(int entranceId) {
            this.entranceId = entranceId;
        }

        public String getImgUrl() {
            return imgUrl;
        }

        public void setImgUrl(String imgUrl) {
            this.imgUrl = imgUrl;
        }

        public int getIsDel() {
            return isDel;
        }

        public void setIsDel(int isDel) {
            this.isDel = isDel;
        }

        public int getPositionType() {
            return positionType;
        }

        public void setPositionType(int positionType) {
            this.positionType = positionType;
        }

        public String getTips() {
            return tips;
        }

        public void setTips(String tips) {
            this.tips = tips;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }
    }


    public static class HotGamePeriodsBean  implements Serializable {
        /**
         * hotTips : 任选二：猜中两个即中奖
         * hotTitle : 鲁D11加奖10%
         * periodVo : {"gameEn":"sdD11","gameId":4,"gameName":"鲁11选5","maxBetTimes":100000,"periodId":"17010932","saleEndTime":189}
         */

        private String hotTips;
        private String hotTitle;
        private PeriodVoBean periodVo;

        public String getHotTips() {
            return hotTips;
        }

        public void setHotTips(String hotTips) {
            this.hotTips = hotTips;
        }

        public String getHotTitle() {
            return hotTitle;
        }

        public void setHotTitle(String hotTitle) {
            this.hotTitle = hotTitle;
        }

        public PeriodVoBean getPeriodVo() {
            return periodVo;
        }

        public void setPeriodVo(PeriodVoBean periodVo) {
            this.periodVo = periodVo;
        }

        public static class PeriodVoBean implements Serializable {
            @Override
            public String toString() {
                return "PeriodVoBean{" +
                        "gameEn='" + gameEn + '\'' +
                        ", gameId='" + gameId + '\'' +
                        ", gameName='" + gameName + '\'' +
                        ", maxBetTimes=" + maxBetTimes +
                        ", periodId='" + periodId + '\'' +
                        ", saleEndTime=" + saleEndTime +
                        '}';
            }

            /**
             * gameEn : sdD11
             * gameId : 4
             * gameName : 鲁11选5
             * maxBetTimes : 100000
             * periodId : 17010932
             * saleEndTime : 189
             */

            private String gameEn;
            private String gameId;
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

            public String getGameId() {
                return gameId;
            }

            public void setGameId(String gameId) {
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

    @Override
    public String toString() {
        return "LotteryHallResponse{" +
                "gamesEntranceCn='" + gamesEntranceCn + '\'' +
                ", attentionEntranceCn='" + attentionEntranceCn + '\'' +
                ", reports=" + reports +
                ", gameEntrances=" + gameEntrances +
                ", banners=" + banners +
                ", attentionEntrances=" + attentionEntrances +
                ", hotGamePeriods=" + hotGamePeriods +
                '}';
    }
}
