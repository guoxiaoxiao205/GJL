package com.example.app.http.response;

/**
 * Created by wanxin on 16/12/24.
 */

public class OrderTypeResponse {
    /**
     * "orderType":1,      //订单类型
     * "ifSkipDetail":1,   //是否可跳转订单/方案详情页面
     * "downloadUrl":"http://downloadUrl/caiqr.1.0.1.apk", //渠道下载地址
     * "bulletTips":"当前版本不支持此彩种，请更新客户端查看。",        //弹窗提示
     * "ifSkipDownload":1      //是否有新版本可下载更新
     */
    private int orderType;
    private int ifSkipDetail;
    private String downloadUrl;
    private String bulletTips;
    private int ifSkipDownload;

    public int getIfSkipDetail() {
        return ifSkipDetail;
    }

    public void setIfSkipDetail(int ifSkipDetail) {
        this.ifSkipDetail = ifSkipDetail;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public String getBulletTips() {
        return bulletTips;
    }

    public void setBulletTips(String bulletTips) {
        this.bulletTips = bulletTips;
    }

    public int getIfSkipDownload() {
        return ifSkipDownload;
    }

    public void setIfSkipDownload(int ifSkipDownload) {
        this.ifSkipDownload = ifSkipDownload;
    }

    public int getOrderType() {
        return orderType;
    }

    public void setOrderType(int orderType) {
        this.orderType = orderType;
    }
}
