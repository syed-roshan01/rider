package com.google.android.gms.common.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class u implements com.google.android.gms.common.api.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u f3390b = new u(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3391a;

    public /* synthetic */ u(String str) {
        this.f3391a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u) {
            return y3.e.g0(this.f3391a, ((u) obj).f3391a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3391a});
    }
}
