package com.google.android.gms.common.api.internal;

import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class z implements com.google.android.gms.common.internal.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3277a;

    public z(v vVar) {
        this.f3277a = new WeakReference(vVar);
    }

    public static final z a(Activity activity) {
        v vVar;
        synchronized (activity) {
            try {
                j fragment = LifecycleCallback.getFragment(activity);
                vVar = (v) fragment.b(v.class, "LifecycleObserverOnStop");
                if (vVar == null) {
                    vVar = new v(fragment);
                    vVar.f3255a = new ArrayList();
                    vVar.mLifecycleFragment.a("LifecycleObserverOnStop", vVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return new z(vVar);
    }

    public z(d0 d0Var) {
        this.f3277a = d0Var;
    }
}
