package androidx.activity;

import android.window.OnBackInvokedCallback;

/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e0 f1377a = new e0();

    public final OnBackInvokedCallback a(c9.c cVar, c9.c cVar2, c9.a aVar, c9.a aVar2) {
        d7.a.m(cVar, "onBackStarted");
        d7.a.m(cVar2, "onBackProgressed");
        d7.a.m(aVar, "onBackInvoked");
        d7.a.m(aVar2, "onBackCancelled");
        return new d0(cVar, cVar2, aVar, aVar2);
    }
}
