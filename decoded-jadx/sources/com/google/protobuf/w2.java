package com.google.protobuf;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class w2 extends y2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4271b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w2(Unsafe unsafe, int i10) {
        super(unsafe);
        this.f4271b = i10;
    }

    @Override // com.google.protobuf.y2
    public final void c(long j10, byte[] bArr, long j11, long j12) {
        switch (this.f4271b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.protobuf.y2
    public final boolean d(Object obj, long j10) {
        switch (this.f4271b) {
            case 0:
                if (z2.f4291h) {
                    if (z2.h(obj, j10) == 0) {
                        return false;
                    }
                } else if (z2.i(obj, j10) == 0) {
                    return false;
                }
                return true;
            default:
                if (z2.f4291h) {
                    if (z2.h(obj, j10) == 0) {
                        return false;
                    }
                } else if (z2.i(obj, j10) == 0) {
                    return false;
                }
                return true;
        }
    }

    @Override // com.google.protobuf.y2
    public final byte e(long j10) {
        switch (this.f4271b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.protobuf.y2
    public final byte f(Object obj, long j10) {
        switch (this.f4271b) {
            case 0:
                return z2.f4291h ? z2.h(obj, j10) : z2.i(obj, j10);
            default:
                return z2.f4291h ? z2.h(obj, j10) : z2.i(obj, j10);
        }
    }

    @Override // com.google.protobuf.y2
    public final double g(Object obj, long j10) {
        switch (this.f4271b) {
            case 0:
                break;
        }
        return Double.longBitsToDouble(j(obj, j10));
    }

    @Override // com.google.protobuf.y2
    public final float h(Object obj, long j10) {
        switch (this.f4271b) {
            case 0:
                break;
        }
        return Float.intBitsToFloat(i(obj, j10));
    }

    @Override // com.google.protobuf.y2
    public final void m(Object obj, long j10, boolean z10) {
        switch (this.f4271b) {
            case 0:
                if (!z2.f4291h) {
                    z2.q(obj, j10, z10 ? (byte) 1 : (byte) 0);
                } else {
                    z2.p(obj, j10, z10 ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!z2.f4291h) {
                    z2.q(obj, j10, z10 ? (byte) 1 : (byte) 0);
                } else {
                    z2.p(obj, j10, z10 ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override // com.google.protobuf.y2
    public final void n(Object obj, long j10, byte b10) {
        switch (this.f4271b) {
            case 0:
                if (!z2.f4291h) {
                    z2.q(obj, j10, b10);
                } else {
                    z2.p(obj, j10, b10);
                }
                break;
            default:
                if (!z2.f4291h) {
                    z2.q(obj, j10, b10);
                } else {
                    z2.p(obj, j10, b10);
                }
                break;
        }
    }

    @Override // com.google.protobuf.y2
    public final void o(Object obj, long j10, double d10) {
        switch (this.f4271b) {
            case 0:
                r(obj, j10, Double.doubleToLongBits(d10));
                break;
            default:
                r(obj, j10, Double.doubleToLongBits(d10));
                break;
        }
    }

    @Override // com.google.protobuf.y2
    public final void p(Object obj, long j10, float f10) {
        switch (this.f4271b) {
            case 0:
                q(j10, obj, Float.floatToIntBits(f10));
                break;
            default:
                q(j10, obj, Float.floatToIntBits(f10));
                break;
        }
    }

    @Override // com.google.protobuf.y2
    public final boolean u() {
        return false;
    }
}
