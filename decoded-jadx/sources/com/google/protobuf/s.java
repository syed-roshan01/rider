package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4231b = 100;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4232c = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g2.m f4233d;

    public static int b(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long c(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public static o f(byte[] bArr, int i10, int i11, boolean z10) {
        o oVar = new o(bArr, i10, i11, z10);
        try {
            oVar.j(i11);
            return oVar;
        } catch (a1 e4) {
            throw new IllegalArgumentException(e4);
        }
    }

    public static s g(InputStream inputStream) {
        if (inputStream != null) {
            return new q(inputStream);
        }
        byte[] bArr = y0.f4277b;
        return f(bArr, 0, bArr.length, false);
    }

    public static s h(ByteBuffer byteBuffer, boolean z10) {
        if (byteBuffer.hasArray()) {
            return f(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining(), z10);
        }
        if (byteBuffer.isDirect() && z2.f4287d) {
            return new r(byteBuffer, z10);
        }
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.duplicate().get(bArr);
        return f(bArr, 0, iRemaining, true);
    }

    public static int t(InputStream inputStream, int i10) throws IOException {
        if ((i10 & 128) == 0) {
            return i10;
        }
        int i11 = i10 & 127;
        int i12 = 7;
        while (i12 < 32) {
            int i13 = inputStream.read();
            if (i13 == -1) {
                throw a1.h();
            }
            i11 |= (i13 & 127) << i12;
            if ((i13 & 128) == 0) {
                return i11;
            }
            i12 += 7;
        }
        while (i12 < 64) {
            int i14 = inputStream.read();
            if (i14 == -1) {
                throw a1.h();
            }
            if ((i14 & 128) == 0) {
                return i11;
            }
            i12 += 7;
        }
        throw a1.e();
    }

    public abstract int A();

    public abstract int B();

    public abstract long C();

    public abstract boolean D(int i10);

    public abstract void a(int i10);

    public abstract int d();

    public abstract boolean e();

    public abstract void i(int i10);

    public abstract int j(int i10);

    public abstract boolean k();

    public abstract m l();

    public abstract double m();

    public abstract int n();

    public abstract int o();

    public abstract long p();

    public abstract float q();

    public abstract int r();

    public abstract long s();

    public abstract int u();

    public abstract long v();

    public abstract int w();

    public abstract long x();

    public abstract String y();

    public abstract String z();
}
