package com.example.app.http.response;

import java.util.List;

/**
 * Created by wanxin on 16/11/22.
 */

public class UserHeadImageListResponse {

    /**
     * img_type : 0
     * img_type_name : 球星
     * img_list : [{"img_id":55,"img_url":"http://7vzspj.com2.z0.glb.qiniucdn.com/images/face/qiuxing1.png","is_default":0}]
     */

    private int img_type;
    private String img_type_name;
    private List<ImgListBean> img_list;

    public int getImg_type() {
        return img_type;
    }

    public void setImg_type(int img_type) {
        this.img_type = img_type;
    }

    public String getImg_type_name() {
        return img_type_name;
    }

    public void setImg_type_name(String img_type_name) {
        this.img_type_name = img_type_name;
    }

    public List<ImgListBean> getImg_list() {
        return img_list;
    }

    public void setImg_list(List<ImgListBean> img_list) {
        this.img_list = img_list;
    }

    public static class ImgListBean {
        /**
         * img_id : 55
         * img_url : http://7vzspj.com2.z0.glb.qiniucdn.com/images/face/qiuxing1.png
         * is_default : 0
         */

        private int img_id;
        private String img_url;
        private int is_default;

        public int getImg_id() {
            return img_id;
        }

        public void setImg_id(int img_id) {
            this.img_id = img_id;
        }

        public String getImg_url() {
            return img_url;
        }

        public void setImg_url(String img_url) {
            this.img_url = img_url;
        }

        public int getIs_default() {
            return is_default;
        }

        public void setIs_default(int is_default) {
            this.is_default = is_default;
        }
    }
}
