package com.google.android.gms.common.api.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.gms.common.api.f f3160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.android.gms.common.api.b f3161c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f3162d;

    public a(com.google.android.gms.common.api.f fVar, com.google.android.gms.common.internal.u uVar, String str) {
        this.f3160b = fVar;
        this.f3161c = uVar;
        this.f3162d = str;
        this.f3159a = Arrays.hashCode(new Object[]{fVar, uVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return y3.e.g0(this.f3160b, aVar.f3160b) && y3.e.g0(this.f3161c, aVar.f3161c) && y3.e.g0(this.f3162d, aVar.f3162d);
    }

    public final int hashCode() {
        return this.f3159a;
    }
}
