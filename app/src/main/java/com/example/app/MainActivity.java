package com.example.app;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.app.http.ServiceFactory;

import facerec.blueberry.com.baseutils.BaseActivity;

import com.example.app.http.RxSubscriber;
import com.example.app.http.response.LotteryHallResponse;

import facerec.blueberry.com.baseutils.transformer.DefaultTransformer;


public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mains);

    }
    public void kk(View view) {
        ServiceFactory.movieApiA()
                .hall()
                .compose(new DefaultTransformer<LotteryHallResponse>())
                //.lift(new BindBaseActivity<LotteryHallResponse>((MainActivity)getActivity()))
                .subscribe(new RxSubscriber<LotteryHallResponse>(MainActivity.this) {
                    @Override
                    protected void onHasData(LotteryHallResponse lotteryHallResponse) {
                        Log.d("aaaa",lotteryHallResponse.toString());
                    }

                });
    }

}
