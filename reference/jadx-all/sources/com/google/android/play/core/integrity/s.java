package com.google.android.play.core.integrity;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f3494a = this;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p6.h f3495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p6.h f3496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p6.h f3497d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p6.h f3498e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p6.h f3499f;

    public s(Context context, r rVar) {
        if (context == null) {
            throw new NullPointerException("instance cannot be null");
        }
        e.a aVar = new e.a(context);
        this.f3495b = aVar;
        p6.h hVarB = p6.f.b(an.f3440a);
        this.f3496c = hVarB;
        p6.h hVarB2 = p6.f.b(new az(aVar, hVarB));
        this.f3497d = hVarB2;
        p6.h hVarB3 = p6.f.b(new be(hVarB2));
        this.f3498e = hVarB3;
        this.f3499f = p6.f.b(new am(hVarB2, hVarB3));
    }

    public final StandardIntegrityManager a() {
        return (StandardIntegrityManager) this.f3499f.a();
    }
}
