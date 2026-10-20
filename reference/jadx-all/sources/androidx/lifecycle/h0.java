package androidx.lifecycle;

import android.app.Activity;

/* JADX INFO: loaded from: classes.dex */
public final class h0 extends j {
    final /* synthetic */ k0 this$0;

    public h0(k0 k0Var) {
        this.this$0 = k0Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
        d7.a.m(activity, "activity");
        this.this$0.a();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        d7.a.m(activity, "activity");
        k0 k0Var = this.this$0;
        int i10 = k0Var.f2150a + 1;
        k0Var.f2150a = i10;
        if (i10 == 1 && k0Var.f2153d) {
            k0Var.f2155f.f(p.ON_START);
            k0Var.f2153d = false;
        }
    }
}
