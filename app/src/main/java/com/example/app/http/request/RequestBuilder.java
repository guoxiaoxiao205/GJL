package com.example.app.http.request;

import java.util.Map;

/**
 * Created by wanxin on 16/11/21.
 */

interface RequestBuilder {

    void defaultDate();
    Map<String, String> getRequestMap();
    Map<String, String> getSign();

}
