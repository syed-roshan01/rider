package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class i0 extends j {
    final /* synthetic */ k0 this$0;

    public i0(k0 k0Var) {
        this.this$0 = k0Var;
    }

    @Override // androidx.lifecycle.j, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        d7.a.m(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i10 = n0.f2158b;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            d7.a.k(fragmentFindFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((n0) fragmentFindFragmentByTag).f2159a = this.this$0.f2157o;
        }
    }

    @Override // androidx.lifecycle.j, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        d7.a.m(activity, "activity");
        k0 k0Var = this.this$0;
        int i10 = k0Var.f2151b - 1;
        k0Var.f2151b = i10;
        if (i10 == 0) {
            Handler handler = k0Var.f2154e;
            d7.a.j(handler);
            handler.postDelayed(k0Var.f2156n, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        d7.a.m(activity, "activity");
        g0.a(activity, new h0(this.this$0));
    }

    @Override // androidx.lifecycle.j, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        d7.a.m(activity, "activity");
        k0 k0Var = this.this$0;
        int i10 = k0Var.f2150a - 1;
        k0Var.f2150a = i10;
        if (i10 == 0 && k0Var.f2152c) {
            k0Var.f2155f.f(p.ON_STOP);
            k0Var.f2153d = true;
        }
    }
}
