package facerec.blueberry.com.baseutils;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.view.KeyEvent;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import rx.Subscriber;

/**
 * Created by guoxiao on 16/10/24.
 * Activity 基类
 */

public class BaseActivity extends FragmentActivity {


    @Override
    protected void onDestroy() {
        Iterator<SubscriberWrapper> it = subscribers.iterator();
        while (it.hasNext()) {
            SubscriberWrapper subscriberWrapper = it.next();
            if (subscriberWrapper.unsubscribeOn == ActivityLifecycle.OnDestroy) {
                subscriberWrapper.subscriber.unsubscribe();
                it.remove();
            }
        }
        super.onDestroy();
    }

    @Override
    protected void onStop() {
        Iterator<SubscriberWrapper> it = subscribers.iterator();
        while (it.hasNext()) {
            SubscriberWrapper subscriberWrapper = it.next();
            if (subscriberWrapper.unsubscribeOn == ActivityLifecycle.OnStop) {
                subscriberWrapper.subscriber.unsubscribe();
                it.remove();
            }
        }
        super.onStop();
    }


    private List<SubscriberWrapper> subscribers = new LinkedList<>();

    public void addSubscriber(Subscriber subscriber, ActivityLifecycle unsubscribeOn) {
        subscribers.add(new SubscriberWrapper(subscriber, unsubscribeOn));
    }

    private class SubscriberWrapper {
        Subscriber subscriber;
        ActivityLifecycle unsubscribeOn;

        public SubscriberWrapper(Subscriber subscriber, ActivityLifecycle unsubscribeOn) {
            this.subscriber = subscriber;
            this.unsubscribeOn = unsubscribeOn;
        }
    }

    /**
     * 返回监听
     * @param keyCode
     * @param event
     * @return
     */
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)
    {
        if (keyCode == KeyEvent.KEYCODE_BACK ) {
        }
        return false;

    }


}
