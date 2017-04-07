package com.example.app.http.response;

import java.util.List;

/**
 * Created by wanxin on 16/12/12.
 */

public class FreePayAmountResponse {

    /**
     * word : 单笔不超过
     * quota_list : [100,200,500,1000,2000]
     */

    private String word;
    private List<Integer> quota_list;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public List<Integer> getQuota_list() {
        return quota_list;
    }

    public void setQuota_list(List<Integer> quota_list) {
        this.quota_list = quota_list;
    }
}
