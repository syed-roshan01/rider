package com.google.android.gms.common.api.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f3186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z5.d f3187b;

    public /* synthetic */ e0(a aVar, z5.d dVar) {
        this.f3186a = aVar;
        this.f3187b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof e0)) {
            e0 e0Var = (e0) obj;
            if (y3.e.g0(this.f3186a, e0Var.f3186a) && y3.e.g0(this.f3187b, e0Var.f3187b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3186a, this.f3187b});
    }

    public final String toString() {
        l.t tVar = new l.t(this);
        tVar.b(this.f3186a, "key");
        tVar.b(this.f3187b, "feature");
        return tVar.toString();
    }
}
