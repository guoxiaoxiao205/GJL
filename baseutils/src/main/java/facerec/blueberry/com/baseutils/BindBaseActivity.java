package facerec.blueberry.com.baseutils;

import rx.Observable;
import rx.Subscriber;

/**
 * Created by guoxiao on 17/1/5.
 */

public class BindBaseActivity<T> implements Observable.Operator<T, T> {

    private BaseActivity activity;
    private ActivityLifecycle unsubscribeOn;

    public BindBaseActivity(BaseActivity activity) {
        this(activity, ActivityLifecycle.OnStop);
    }

    public BindBaseActivity(BaseActivity activity, ActivityLifecycle unsubscribeOn) {
        this.activity = activity;
        this.unsubscribeOn = unsubscribeOn;
    }

    @Override
    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        activity.addSubscriber(subscriber, unsubscribeOn);
        return subscriber;
    }


}
