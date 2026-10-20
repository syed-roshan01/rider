package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class m0 implements Application.ActivityLifecycleCallbacks {
    public static final l0 Companion = new l0();

    public static final void registerIn(Activity activity) {
        Companion.getClass();
        d7.a.m(activity, "activity");
        activity.registerActivityLifecycleCallbacks(new m0());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        d7.a.m(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        d7.a.m(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        d7.a.m(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostCreated(Activity activity, Bundle bundle) {
        d7.a.m(activity, "activity");
        int i10 = n0.f2158b;
        x9.v.p(activity, p.ON_CREATE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
        d7.a.m(activity, "activity");
        int i10 = n0.f2158b;
        x9.v.p(activity, p.ON_RESUME);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        d7.a.m(activity, "activity");
        int i10 = n0.f2158b;
        x9.v.p(activity, p.ON_START);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreDestroyed(Activity activity) {
        d7.a.m(activity, "activity");
        int i10 = n0.f2158b;
        x9.v.p(activity, p.ON_DESTROY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPrePaused(Activity activity) {
        d7.a.m(activity, "activity");
        int i10 = n0.f2158b;
        x9.v.p(activity, p.ON_PAUSE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreStopped(Activity activity) {
        d7.a.m(activity, "activity");
        int i10 = n0.f2158b;
        x9.v.p(activity, p.ON_STOP);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        d7.a.m(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        d7.a.m(activity, "activity");
        d7.a.m(bundle, "bundle");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        d7.a.m(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        d7.a.m(activity, "activity");
    }
}
