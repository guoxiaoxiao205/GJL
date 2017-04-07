package com.example.app.http.response;

/**
 * Created by wanxin on 17/2/17.
 */

public class UpgradeAppResponse {

    /**
     * versionType : caiqr
     * versionName : v3.5
     * vNum : 1
     * systemType : 1
     * downloadAddress : xxxxxx
     * channelDownloadAddress :
     * versionDescribe : xxxxx
     * isPopUp : 0
     * forceUpgrade : 0
     * isUpgrade : 1
     * isPatch : 0
     * patchDownloadAddress : http://7xoiug.com1.z0.glb.clouddn.com/patch_signed%281%29%281%29.apk
     */

    private String versionType;
    private String versionName;
    private int vNum;
    private int systemType;
    private String downloadAddress;
    private String channelDownloadAddress;
    private String versionDescribe;
    private int isPopUp;
    private int forceUpgrade;
    private int isUpgrade;
    private int isPatch;
    private String patchDownloadAddress;

    public String getVersionType() {
        return versionType;
    }

    public void setVersionType(String versionType) {
        this.versionType = versionType;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public int getVNum() {
        return vNum;
    }

    public void setVNum(int vNum) {
        this.vNum = vNum;
    }

    public int getSystemType() {
        return systemType;
    }

    public void setSystemType(int systemType) {
        this.systemType = systemType;
    }

    public String getDownloadAddress() {
        return downloadAddress;
    }

    public void setDownloadAddress(String downloadAddress) {
        this.downloadAddress = downloadAddress;
    }

    public String getChannelDownloadAddress() {
        return channelDownloadAddress;
    }

    public void setChannelDownloadAddress(String channelDownloadAddress) {
        this.channelDownloadAddress = channelDownloadAddress;
    }

    public String getVersionDescribe() {
        return versionDescribe;
    }

    public void setVersionDescribe(String versionDescribe) {
        this.versionDescribe = versionDescribe;
    }

    public int getIsPopUp() {
        return isPopUp;
    }

    public void setIsPopUp(int isPopUp) {
        this.isPopUp = isPopUp;
    }

    public int getForceUpgrade() {
        return forceUpgrade;
    }

    public void setForceUpgrade(int forceUpgrade) {
        this.forceUpgrade = forceUpgrade;
    }

    public int getIsUpgrade() {
        return isUpgrade;
    }

    public void setIsUpgrade(int isUpgrade) {
        this.isUpgrade = isUpgrade;
    }

    public int getIsPatch() {
        return isPatch;
    }

    public void setIsPatch(int isPatch) {
        this.isPatch = isPatch;
    }

    public String getPatchDownloadAddress() {
        return patchDownloadAddress;
    }

    public void setPatchDownloadAddress(String patchDownloadAddress) {
        this.patchDownloadAddress = patchDownloadAddress;
    }
}
