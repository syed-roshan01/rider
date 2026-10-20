package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z5.d[] f3249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f3250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3251c;

    public t(z5.d[] dVarArr, boolean z10, int i10) {
        this.f3249a = dVarArr;
        boolean z11 = false;
        if (dVarArr != null && z10) {
            z11 = true;
        }
        this.f3250b = z11;
        this.f3251c = i10;
    }

    public static s a() {
        s sVar = new s();
        sVar.f3242a = true;
        sVar.f3243b = 0;
        return sVar;
    }
}
