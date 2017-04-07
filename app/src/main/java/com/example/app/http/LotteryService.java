package com.example.app.http;




import com.example.app.http.response.LotteryHallResponse;

import facerec.blueberry.com.baseutils.request.HttpResult;
import retrofit2.http.GET;
import rx.Observable;


/**
 * Created by liukun on 16/3/9.
 */
public interface LotteryService {


    //首页
    @GET("index/")
    Observable<HttpResult<LotteryHallResponse>> hall();

}
