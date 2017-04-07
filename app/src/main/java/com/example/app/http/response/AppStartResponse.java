package com.example.app.http.response;

import java.util.List;

/**
 * Created by wanxin on 17/1/12.
 */

public class AppStartResponse {


    /**
     * version : 1.0.1
     * picturePrefix : http://oiqinnnxb.bkt.clouddn.com/
     * allGame : [{"gameId":10001,"gameEn":"shKuai3","gameName":"沪快3"},{"gameId":10002,"gameEn":"hbD11","gameName":"鄂11选5"},{"gameId":10003,"gameEn":"jxD11","gameName":"赣11选5"},{"gameId":10004,"gameEn":"sdD11","gameName":"鲁11选5"}]
     */

    private String version;
    private String picturePrefix;
    private List<AllGameBean> allGame;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getPicturePrefix() {
        return picturePrefix;
    }

    public void setPicturePrefix(String picturePrefix) {
        this.picturePrefix = picturePrefix;
    }

    public List<AllGameBean> getAllGame() {
        return allGame;
    }

    public void setAllGame(List<AllGameBean> allGame) {
        this.allGame = allGame;
    }

    public static class AllGameBean {
        /**
         * gameId : 10001
         * gameEn : shKuai3
         * gameName : 沪快3
         */

        private String gameEn;
        private String gameName;


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
    }
}
