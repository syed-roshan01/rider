package com.google.android.play.core.integrity;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f3488a = this;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p6.h f3489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p6.h f3490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p6.h f3491d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p6.h f3492e;

    public o(Context context, n nVar) {
        if (context == null) {
            throw new NullPointerException("instance cannot be null");
        }
        e.a aVar = new e.a(context);
        this.f3489b = aVar;
        p6.h hVarB = p6.f.b(y.f3505a);
        this.f3490c = hVarB;
        p6.h hVarB2 = p6.f.b(new af(aVar, hVarB));
        this.f3491d = hVarB2;
        this.f3492e = p6.f.b(new x(hVarB2));
    }

    public final IntegrityManager a() {
        return (IntegrityManager) this.f3492e.a();
    }
}
