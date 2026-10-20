package com.google.android.gms.common.api.internal;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class f0 implements com.google.android.gms.common.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.common.api.d f3207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f3208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.google.android.gms.common.internal.m f3209c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Set f3210d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3211e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f3212f;

    public f0(f fVar, com.google.android.gms.common.api.d dVar, a aVar) {
        this.f3212f = fVar;
        this.f3207a = dVar;
        this.f3208b = aVar;
    }

    public final void a(z5.b bVar) {
        d0 d0Var = (d0) this.f3212f.f3201j.get(this.f3208b);
        if (d0Var != null) {
            f6.a.s(d0Var.f3185m.f3205n);
            com.google.android.gms.common.api.d dVar = d0Var.f3174b;
            String name = dVar.getClass().getName();
            String strValueOf = String.valueOf(bVar);
            StringBuilder sb = new StringBuilder(name.length() + 25 + strValueOf.length());
            sb.append("onSignInFailed for ");
            sb.append(name);
            sb.append(" with ");
            sb.append(strValueOf);
            dVar.disconnect(sb.toString());
            d0Var.p(bVar, null);
        }
    }

    @Override // com.google.android.gms.common.internal.d
    public final void j(z5.b bVar) {
        this.f3212f.f3205n.post(new v0(1, this, bVar));
    }
}
