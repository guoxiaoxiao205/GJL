package com.example.app.http.response;

import java.util.List;

/**
 * Created by wanxin on 16/12/7.
 */

public class UserInfoShowResponse {

    /**
     * mobile : 13121143026
     * nick_name : 嘎嘎
     * head_img_url : http://7vzspj.com2.z0.glb.qiniucdn.com/images/face/qiuxing4.png
     * change_nick_name_times : 1
     * change_head_img_times : 1
     * third_list : [{"third_id":"03","nick_name":"%E4%B8%87%E4%B8%80"}]
     * bound_count : 2
     */

    private String mobile;
    private String nick_name;
    private String head_img_url;
    private int change_nick_name_times;
    private int change_head_img_times;
    private int bound_count;
    private List<ThirdListBean> third_list;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getNick_name() {
        return nick_name;
    }

    public void setNick_name(String nick_name) {
        this.nick_name = nick_name;
    }

    public String getHead_img_url() {
        return head_img_url;
    }

    public void setHead_img_url(String head_img_url) {
        this.head_img_url = head_img_url;
    }

    public int getChange_nick_name_times() {
        return change_nick_name_times;
    }

    public void setChange_nick_name_times(int change_nick_name_times) {
        this.change_nick_name_times = change_nick_name_times;
    }

    public int getChange_head_img_times() {
        return change_head_img_times;
    }

    public void setChange_head_img_times(int change_head_img_times) {
        this.change_head_img_times = change_head_img_times;
    }

    public int getBound_count() {
        return bound_count;
    }

    public void setBound_count(int bound_count) {
        this.bound_count = bound_count;
    }

    public List<ThirdListBean> getThird_list() {
        return third_list;
    }

    public void setThird_list(List<ThirdListBean> third_list) {
        this.third_list = third_list;
    }

    public static class ThirdListBean {
        /**
         * third_id : 03
         * nick_name : %E4%B8%87%E4%B8%80
         */

        private String third_id;
        private String nick_name;

        public String getThird_id() {
            return third_id;
        }

        public void setThird_id(String third_id) {
            this.third_id = third_id;
        }

        public String getNick_name() {
            return nick_name;
        }

        public void setNick_name(String nick_name) {
            this.nick_name = nick_name;
        }
    }
}
