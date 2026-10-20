package com.google.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class i0 implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h3 f4135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f4136c;

    public i0(t0 t0Var, int i10, h3 h3Var, boolean z10, boolean z11) {
        this.f4134a = i10;
        this.f4135b = h3Var;
        this.f4136c = z10;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f4134a - ((i0) obj).f4134a;
    }
}
