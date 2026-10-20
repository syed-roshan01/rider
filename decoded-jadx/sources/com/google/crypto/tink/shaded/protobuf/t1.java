package com.google.crypto.tink.shaded.protobuf;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class t1 extends v1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3620b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t1(Unsafe unsafe, int i10) {
        super(unsafe);
        this.f3620b = i10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public final boolean c(Object obj, long j10) {
        switch (this.f3620b) {
            case 0:
                if (w1.f3637g) {
                    if (w1.h(obj, j10) == 0) {
                        return false;
                    }
                } else if (w1.i(obj, j10) == 0) {
                    return false;
                }
                return true;
            default:
                if (w1.f3637g) {
                    if (w1.h(obj, j10) == 0) {
                        return false;
                    }
                } else if (w1.i(obj, j10) == 0) {
                    return false;
                }
                return true;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public final byte d(Object obj, long j10) {
        switch (this.f3620b) {
            case 0:
                return w1.f3637g ? w1.h(obj, j10) : w1.i(obj, j10);
            default:
                return w1.f3637g ? w1.h(obj, j10) : w1.i(obj, j10);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public final double e(Object obj, long j10) {
        switch (this.f3620b) {
            case 0:
                break;
        }
        return Double.longBitsToDouble(h(obj, j10));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public final float f(Object obj, long j10) {
        switch (this.f3620b) {
            case 0:
                break;
        }
        return Float.intBitsToFloat(g(obj, j10));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public final void k(Object obj, long j10, boolean z10) {
        switch (this.f3620b) {
            case 0:
                if (!w1.f3637g) {
                    w1.q(obj, j10, z10 ? (byte) 1 : (byte) 0);
                } else {
                    w1.p(obj, j10, z10 ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!w1.f3637g) {
                    w1.q(obj, j10, z10 ? (byte) 1 : (byte) 0);
                } else {
                    w1.p(obj, j10, z10 ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public final void l(Object obj, long j10, byte b10) {
        switch (this.f3620b) {
            case 0:
                if (!w1.f3637g) {
                    w1.q(obj, j10, b10);
                } else {
                    w1.p(obj, j10, b10);
                }
                break;
            default:
                if (!w1.f3637g) {
                    w1.q(obj, j10, b10);
                } else {
                    w1.p(obj, j10, b10);
                }
                break;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public final void m(Object obj, long j10, double d10) {
        switch (this.f3620b) {
            case 0:
                p(obj, j10, Double.doubleToLongBits(d10));
                break;
            default:
                p(obj, j10, Double.doubleToLongBits(d10));
                break;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public final void n(Object obj, long j10, float f10) {
        switch (this.f3620b) {
            case 0:
                o(j10, obj, Float.floatToIntBits(f10));
                break;
            default:
                o(j10, obj, Float.floatToIntBits(f10));
                break;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public final boolean s() {
        return false;
    }
}
