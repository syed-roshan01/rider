package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class LifecycleCallback {
    protected final j mLifecycleFragment;

    public LifecycleCallback(j jVar) {
        this.mLifecycleFragment = jVar;
    }

    @Keep
    private static j getChimeraLifecycleFragmentImpl(i iVar) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    public static j getFragment(Activity activity) {
        return getFragment(new i(activity));
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public Activity getActivity() {
        Activity activityC = this.mLifecycleFragment.c();
        f6.a.x(activityC);
        return activityC;
    }

    public void onActivityResult(int i10, int i11, Intent intent) {
    }

    public void onCreate(Bundle bundle) {
    }

    public void onDestroy() {
    }

    public void onResume() {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
    }

    public void onStop() {
    }

    public static j getFragment(i iVar) {
        w0 w0Var;
        x0 x0Var;
        Activity activity = iVar.f3215a;
        if (!(activity instanceof androidx.fragment.app.g0)) {
            if (!(activity instanceof Activity)) {
                throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
            }
            WeakHashMap weakHashMap = w0.f3261d;
            WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
            if (weakReference == null || (w0Var = (w0) weakReference.get()) == null) {
                try {
                    w0Var = (w0) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                    if (w0Var == null || w0Var.isRemoving()) {
                        w0Var = new w0();
                        activity.getFragmentManager().beginTransaction().add(w0Var, "LifecycleFragmentImpl").commitAllowingStateLoss();
                    }
                    weakHashMap.put(activity, new WeakReference(w0Var));
                } catch (ClassCastException e4) {
                    throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e4);
                }
            }
            return w0Var;
        }
        androidx.fragment.app.g0 g0Var = (androidx.fragment.app.g0) activity;
        WeakHashMap weakHashMap2 = x0.f3271d;
        WeakReference weakReference2 = (WeakReference) weakHashMap2.get(g0Var);
        if (weakReference2 == null || (x0Var = (x0) weakReference2.get()) == null) {
            try {
                x0Var = (x0) g0Var.getSupportFragmentManager().w("SupportLifecycleFragmentImpl");
                if (x0Var == null || x0Var.isRemoving()) {
                    x0Var = new x0();
                    androidx.fragment.app.x0 supportFragmentManager = g0Var.getSupportFragmentManager();
                    supportFragmentManager.getClass();
                    androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
                    aVar.e(0, x0Var, "SupportLifecycleFragmentImpl");
                    aVar.d(true);
                }
                weakHashMap2.put(g0Var, new WeakReference(x0Var));
            } catch (ClassCastException e10) {
                throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e10);
            }
        }
        return x0Var;
    }

    public static j getFragment(ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }
}
