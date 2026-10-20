package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Handler;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class o0 extends n6.c implements com.google.android.gms.common.api.j, com.google.android.gms.common.api.k {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final w5.b f3231h = m6.b.f11882a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f3233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w5.b f3234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f3235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.google.android.gms.common.internal.h f3236e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public m6.c f3237f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f0 f3238g;

    public o0(Context context, Handler handler, com.google.android.gms.common.internal.h hVar) {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
        this.f3232a = context;
        this.f3233b = handler;
        this.f3236e = hVar;
        this.f3235d = hVar.f3301b;
        this.f3234c = f3231h;
    }

    @Override // com.google.android.gms.common.api.internal.e
    public final void a(int i10) {
        this.f3237f.disconnect();
    }

    @Override // com.google.android.gms.common.api.internal.n
    public final void b(z5.b bVar) {
        this.f3238g.a(bVar);
    }

    @Override // com.google.android.gms.common.api.internal.e
    public final void j() {
        this.f3237f.a(this);
    }
}
