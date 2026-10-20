package com.google.protobuf;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class o extends s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f4188e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4189f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4190g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4191h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f4192i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f4193j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f4194k = Integer.MAX_VALUE;

    public o(byte[] bArr, int i10, int i11, boolean z10) {
        this.f4188e = bArr;
        this.f4189f = i11 + i10;
        this.f4191h = i10;
        this.f4192i = i10;
    }

    @Override // com.google.protobuf.s
    public final int A() throws a1 {
        if (e()) {
            this.f4193j = 0;
            return 0;
        }
        int iG = G();
        this.f4193j = iG;
        if ((iG >>> 3) != 0) {
            return iG;
        }
        throw a1.b();
    }

    @Override // com.google.protobuf.s
    public final int B() {
        return G();
    }

    @Override // com.google.protobuf.s
    public final long C() {
        return H();
    }

    @Override // com.google.protobuf.s
    public final boolean D(int i10) throws a1 {
        int iA;
        int i11 = i10 & 7;
        int i12 = 0;
        if (i11 == 0) {
            int i13 = this.f4189f - this.f4191h;
            byte[] bArr = this.f4188e;
            if (i13 >= 10) {
                while (i12 < 10) {
                    int i14 = this.f4191h;
                    this.f4191h = i14 + 1;
                    if (bArr[i14] < 0) {
                        i12++;
                    }
                }
                throw a1.e();
            }
            while (i12 < 10) {
                int i15 = this.f4191h;
                if (i15 == this.f4189f) {
                    throw a1.h();
                }
                this.f4191h = i15 + 1;
                if (bArr[i15] < 0) {
                    i12++;
                }
            }
            throw a1.e();
            return true;
        }
        if (i11 == 1) {
            K(8);
            return true;
        }
        if (i11 == 2) {
            K(G());
            return true;
        }
        if (i11 != 3) {
            if (i11 == 4) {
                return false;
            }
            if (i11 != 5) {
                throw a1.d();
            }
            K(4);
            return true;
        }
        do {
            iA = A();
            if (iA == 0) {
                break;
            }
        } while (D(iA));
        a(((i10 >>> 3) << 3) | 4);
        return true;
    }

    public final int E() throws a1 {
        int i10 = this.f4191h;
        if (this.f4189f - i10 < 4) {
            throw a1.h();
        }
        this.f4191h = i10 + 4;
        byte[] bArr = this.f4188e;
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public final long F() throws a1 {
        int i10 = this.f4191h;
        if (this.f4189f - i10 < 8) {
            throw a1.h();
        }
        this.f4191h = i10 + 8;
        byte[] bArr = this.f4188e;
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }

    public final int G() {
        int i10;
        int i11 = this.f4191h;
        int i12 = this.f4189f;
        if (i12 != i11) {
            int i13 = i11 + 1;
            byte[] bArr = this.f4188e;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.f4191h = i13;
                return b10;
            }
            if (i12 - i13 >= 9) {
                int i14 = i11 + 2;
                int i15 = (bArr[i13] << 7) ^ b10;
                if (i15 < 0) {
                    i10 = i15 ^ (-128);
                } else {
                    int i16 = i11 + 3;
                    int i17 = (bArr[i14] << 14) ^ i15;
                    if (i17 >= 0) {
                        i10 = i17 ^ 16256;
                    } else {
                        int i18 = i11 + 4;
                        int i19 = i17 ^ (bArr[i16] << 21);
                        if (i19 < 0) {
                            i10 = (-2080896) ^ i19;
                        } else {
                            i16 = i11 + 5;
                            byte b11 = bArr[i18];
                            int i20 = (i19 ^ (b11 << 28)) ^ 266354560;
                            if (b11 < 0) {
                                i18 = i11 + 6;
                                if (bArr[i16] < 0) {
                                    i16 = i11 + 7;
                                    if (bArr[i18] < 0) {
                                        i18 = i11 + 8;
                                        if (bArr[i16] < 0) {
                                            i16 = i11 + 9;
                                            if (bArr[i18] < 0) {
                                                int i21 = i11 + 10;
                                                if (bArr[i16] >= 0) {
                                                    i14 = i21;
                                                    i10 = i20;
                                                }
                                            }
                                        }
                                    }
                                }
                                i10 = i20;
                            }
                            i10 = i20;
                        }
                        i14 = i18;
                    }
                    i14 = i16;
                }
                this.f4191h = i14;
                return i10;
            }
        }
        return (int) I();
    }

    public final long H() {
        long j10;
        long j11;
        long j12;
        long j13;
        int i10 = this.f4191h;
        int i11 = this.f4189f;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f4188e;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f4191h = i12;
                return b10;
            }
            if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                int i14 = (bArr[i12] << 7) ^ b10;
                if (i14 < 0) {
                    j10 = i14 ^ (-128);
                } else {
                    int i15 = i10 + 3;
                    int i16 = (bArr[i13] << 14) ^ i14;
                    if (i16 >= 0) {
                        j10 = i16 ^ 16256;
                        i13 = i15;
                    } else {
                        int i17 = i10 + 4;
                        int i18 = i16 ^ (bArr[i15] << 21);
                        if (i18 < 0) {
                            j13 = (-2080896) ^ i18;
                        } else {
                            long j14 = i18;
                            i13 = i10 + 5;
                            long j15 = j14 ^ (((long) bArr[i17]) << 28);
                            if (j15 >= 0) {
                                j12 = 266354560;
                            } else {
                                i17 = i10 + 6;
                                long j16 = j15 ^ (((long) bArr[i13]) << 35);
                                if (j16 < 0) {
                                    j11 = -34093383808L;
                                } else {
                                    i13 = i10 + 7;
                                    j15 = j16 ^ (((long) bArr[i17]) << 42);
                                    if (j15 >= 0) {
                                        j12 = 4363953127296L;
                                    } else {
                                        i17 = i10 + 8;
                                        j16 = j15 ^ (((long) bArr[i13]) << 49);
                                        if (j16 < 0) {
                                            j11 = -558586000294016L;
                                        } else {
                                            i13 = i10 + 9;
                                            long j17 = (j16 ^ (((long) bArr[i17]) << 56)) ^ 71499008037633920L;
                                            if (j17 < 0) {
                                                int i19 = i10 + 10;
                                                if (bArr[i13] >= 0) {
                                                    i13 = i19;
                                                }
                                            }
                                            j10 = j17;
                                        }
                                    }
                                }
                                j13 = j11 ^ j16;
                            }
                            j10 = j12 ^ j15;
                        }
                        i13 = i17;
                        j10 = j13;
                    }
                }
                this.f4191h = i13;
                return j10;
            }
        }
        return I();
    }

    public final long I() throws a1 {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            int i11 = this.f4191h;
            if (i11 == this.f4189f) {
                throw a1.h();
            }
            this.f4191h = i11 + 1;
            byte b10 = this.f4188e[i11];
            j10 |= ((long) (b10 & 127)) << i10;
            if ((b10 & 128) == 0) {
                return j10;
            }
        }
        throw a1.e();
    }

    public final void J() {
        int i10 = this.f4189f + this.f4190g;
        this.f4189f = i10;
        int i11 = i10 - this.f4192i;
        int i12 = this.f4194k;
        if (i11 <= i12) {
            this.f4190g = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f4190g = i13;
        this.f4189f = i10 - i13;
    }

    public final void K(int i10) throws a1 {
        if (i10 >= 0) {
            int i11 = this.f4189f;
            int i12 = this.f4191h;
            if (i10 <= i11 - i12) {
                this.f4191h = i12 + i10;
                return;
            }
        }
        if (i10 >= 0) {
            throw a1.h();
        }
        throw a1.f();
    }

    @Override // com.google.protobuf.s
    public final void a(int i10) throws a1 {
        if (this.f4193j != i10) {
            throw a1.a();
        }
    }

    @Override // com.google.protobuf.s
    public final int d() {
        return this.f4191h - this.f4192i;
    }

    @Override // com.google.protobuf.s
    public final boolean e() {
        return this.f4191h == this.f4189f;
    }

    @Override // com.google.protobuf.s
    public final void i(int i10) {
        this.f4194k = i10;
        J();
    }

    @Override // com.google.protobuf.s
    public final int j(int i10) throws a1 {
        if (i10 < 0) {
            throw a1.f();
        }
        int iD = d() + i10;
        if (iD < 0) {
            throw a1.g();
        }
        int i11 = this.f4194k;
        if (iD > i11) {
            throw a1.h();
        }
        this.f4194k = iD;
        J();
        return i11;
    }

    @Override // com.google.protobuf.s
    public final boolean k() {
        return H() != 0;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0031 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0042  */
    @Override // com.google.protobuf.s
    public final m l() throws a1 {
        byte[] bArrCopyOfRange;
        int iG = G();
        byte[] bArr = this.f4188e;
        if (iG > 0) {
            int i10 = this.f4189f;
            int i11 = this.f4191h;
            if (iG <= i10 - i11) {
                m mVarO = n.o(bArr, i11, iG);
                this.f4191h += iG;
                return mVarO;
            }
        }
        if (iG == 0) {
            return n.f4181b;
        }
        if (iG > 0) {
            int i12 = this.f4189f;
            int i13 = this.f4191h;
            if (iG <= i12 - i13) {
                int i14 = iG + i13;
                this.f4191h = i14;
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i13, i14);
            } else {
                if (iG <= 0) {
                    throw a1.h();
                }
                if (iG == 0) {
                    throw a1.f();
                }
                bArrCopyOfRange = y0.f4277b;
            }
        } else {
            if (iG <= 0) {
                throw a1.h();
            }
            if (iG == 0) {
                throw a1.f();
            }
            bArrCopyOfRange = y0.f4277b;
        }
        m mVar = n.f4181b;
        return new m(bArrCopyOfRange);
    }

    @Override // com.google.protobuf.s
    public final double m() {
        return Double.longBitsToDouble(F());
    }

    @Override // com.google.protobuf.s
    public final int n() {
        return G();
    }

    @Override // com.google.protobuf.s
    public final int o() {
        return E();
    }

    @Override // com.google.protobuf.s
    public final long p() {
        return F();
    }

    @Override // com.google.protobuf.s
    public final float q() {
        return Float.intBitsToFloat(E());
    }

    @Override // com.google.protobuf.s
    public final int r() {
        return G();
    }

    @Override // com.google.protobuf.s
    public final long s() {
        return H();
    }

    @Override // com.google.protobuf.s
    public final int u() {
        return E();
    }

    @Override // com.google.protobuf.s
    public final long v() {
        return F();
    }

    @Override // com.google.protobuf.s
    public final int w() {
        return s.b(G());
    }

    @Override // com.google.protobuf.s
    public final long x() {
        return s.c(H());
    }

    @Override // com.google.protobuf.s
    public final String y() throws a1 {
        int iG = G();
        if (iG > 0) {
            int i10 = this.f4189f;
            int i11 = this.f4191h;
            if (iG <= i10 - i11) {
                String str = new String(this.f4188e, i11, iG, y0.f4276a);
                this.f4191h += iG;
                return str;
            }
        }
        if (iG == 0) {
            return "";
        }
        if (iG < 0) {
            throw a1.f();
        }
        throw a1.h();
    }

    @Override // com.google.protobuf.s
    public final String z() throws a1 {
        int iG = G();
        if (iG > 0) {
            int i10 = this.f4189f;
            int i11 = this.f4191h;
            if (iG <= i10 - i11) {
                String strT = c3.f4086a.T(this.f4188e, i11, iG);
                this.f4191h += iG;
                return strT;
            }
        }
        if (iG == 0) {
            return "";
        }
        if (iG <= 0) {
            throw a1.f();
        }
        throw a1.h();
    }
}
