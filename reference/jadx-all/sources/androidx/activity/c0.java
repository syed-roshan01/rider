package androidx.activity;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c0 f1369a = new c0();

    public final OnBackInvokedCallback a(c9.a aVar) {
        d7.a.m(aVar, "onBackInvoked");
        return new b0(aVar, 0);
    }

    public final void b(Object obj, int i10, Object obj2) {
        d7.a.m(obj, "dispatcher");
        d7.a.m(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i10, (OnBackInvokedCallback) obj2);
    }

    public final void c(Object obj, Object obj2) {
        d7.a.m(obj, "dispatcher");
        d7.a.m(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
