package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3599b = 100;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3600c = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g2.m f3601d;

    public static int b(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long c(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public static m f(byte[] bArr, int i10, int i11, boolean z10) {
        m mVar = new m(bArr, i10, i11, z10);
        try {
            mVar.h(i11);
            return mVar;
        } catch (h0 e4) {
            throw new IllegalArgumentException(e4);
        }
    }

    public abstract boolean A(int i10);

    public abstract void a(int i10);

    public abstract int d();

    public abstract boolean e();

    public abstract void g(int i10);

    public abstract int h(int i10);

    public abstract boolean i();

    public abstract k j();

    public abstract double k();

    public abstract int l();

    public abstract int m();

    public abstract long n();

    public abstract float o();

    public abstract int p();

    public abstract long q();

    public abstract int r();

    public abstract long s();

    public abstract int t();

    public abstract long u();

    public abstract String v();

    public abstract String w();

    public abstract int x();

    public abstract int y();

    public abstract long z();
}
