package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public abstract class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f3285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f3287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3288d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f3289e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f3290f;

    public b0(f fVar, int i10, Bundle bundle) {
        this.f3290f = fVar;
        Boolean bool = Boolean.TRUE;
        this.f3287c = fVar;
        this.f3285a = bool;
        this.f3286b = false;
        this.f3288d = i10;
        this.f3289e = bundle;
    }

    public final /* bridge */ void a() {
        f fVar = this.f3290f;
        int i10 = this.f3288d;
        if (i10 != 0) {
            fVar.c(1, null);
            Bundle bundle = this.f3289e;
            b(new z5.b(i10, bundle != null ? (PendingIntent) bundle.getParcelable(f.KEY_PENDING_INTENT) : null));
        } else {
            if (c()) {
                return;
            }
            fVar.c(1, null);
            b(new z5.b(8, null));
        }
    }

    public abstract void b(z5.b bVar);

    public abstract boolean c();

    public final void d() {
        synchronized (this) {
            this.f3285a = null;
        }
        synchronized (this.f3287c.zzt) {
            this.f3287c.zzt.remove(this);
        }
    }
}
