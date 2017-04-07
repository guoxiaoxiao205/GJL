package com.example.app.http;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;

import facerec.blueberry.com.baseutils.exception.ApiException;
import facerec.blueberry.com.baseutils.subscribers.BaseSubscriber;
import com.example.app.utils.DialogHelper;
import com.example.app.utils.NetworkUtil;


/**
 * @author YorkYu
 * @version V1.0
 * @Project: Retrofit2RxjavaDemo
 * @Package york.com.retrofit2rxjavademo.subscribers
 * @Description:
 * @time 2016/8/11 10:54
 */
public abstract class RxSubscriber<T> extends BaseSubscriber<T> {
    //是否显示 进度条
    private boolean isShowProgress = false;

    public RxSubscriber(Context context, boolean isShowProgress) {
        this.mContext = context;
        this.isShowProgress = isShowProgress;
    }

    public RxSubscriber(Context context) {
        this.mContext = context;
    }

    private static final String TAG = RxSubscriber.class.getSimpleName();
    private Context mContext;

    @Override
    public void onStart() {
        super.onStart();
        if (NetworkUtil.isNetworkAvailable(mContext)) {
            if (isShowProgress) {
                DialogHelper.showProgressDlg(mContext);
            }
        }
    }

    @Override
    public void onCompleted() {
        DialogHelper.stopProgressDlg();
    }

    @Override
    protected void onError(ApiException ex) {
        Log.d(TAG, "onError: " + ex.message + "code: " + ex.code);
        DialogHelper.stopProgressDlg();
        if (!TextUtils.isEmpty(ex.message)) {
            Toast.makeText(mContext, ex.message, Toast.LENGTH_SHORT).show();
        }

    }
    @Override
    public void onNext(T t) {
       if (null==t){
            onEmptyData();
        }else{
            onHasData(t);
        }
    }

    /***
     * 有数据
     * @param t
     */
    protected abstract void onHasData(T t);

    /**
     * 无数据
     */
    protected  void onEmptyData(){}

}
