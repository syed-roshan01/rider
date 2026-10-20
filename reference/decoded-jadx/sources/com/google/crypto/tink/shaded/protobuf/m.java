package com.google.crypto.tink.shaded.protobuf;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class m extends o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f3576e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3577f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f3578g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f3579h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f3580i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f3581j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f3582k = Integer.MAX_VALUE;

    public m(byte[] bArr, int i10, int i11, boolean z10) {
        this.f3576e = bArr;
        this.f3577f = i11 + i10;
        this.f3579h = i10;
        this.f3580i = i10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o
    public final boolean A(int i10) throws h0 {
        int iX;
        int i11 = i10 & 7;
        int i12 = 0;
        if (i11 == 0) {
            int i13 = this.f3577f - this.f3579h;
            byte[] bArr = this.f3576e;
            if (i13 >= 10) {
                while (i12 < 10) {
                    int i14 = this.f3579h;
                    this.f3579h = i14 + 1;
                    if (bArr[i14] < 0) {
                        i12++;
                    }
                }
                throw h0.d();
            }
            while (i12 < 10) {
                int i15 = this.f3579h;
                if (i15 == this.f3577f) {
                    throw h0.g();
                }
                this.f3579h = i15 + 1;
                if (bArr[i15] < 0) {
                    i12++;
                }
            }
            throw h0.d();
            return true;
        }
        if (i11 == 1) {
            H(8);
            return true;
        }
        if (i11 == 2) {
            H(D());
            return true;
        }
        if (i11 != 3) {
            if (i11 == 4) {
                return false;
            }
            if (i11 != 5) {
                throw h0.c();
            }
            H(4);
            return true;
        }
        do {
            iX = x();
            if (iX == 0) {
                break;
            }
        } while (A(iX));
        a(((i10 >>> 3) << 3) | 4);
        return true;
    }

    public final int B() throws h0 {
        int i10 = this.f3579h;
        if (this.f3577f - i10 < 4) {
            throw h0.g();
        }
        this.f3579h = i10 + 4;
        byte[] bArr = this.f3576e;
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public final long C() throws h0 {
        int i10 = this.f3579h;
        if (this.f3577f - i10 < 8) {
            throw h0.g();
        }
        this.f3579h = i10 + 8;
        byte[] bArr = this.f3576e;
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }

    public final int D() {
        int i10;
        int i11 = this.f3579h;
        int i12 = this.f3577f;
        if (i12 != i11) {
            int i13 = i11 + 1;
            byte[] bArr = this.f3576e;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.f3579h = i13;
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
                this.f3579h = i14;
                return i10;
            }
        }
        return (int) F();
    }

    public final long E() {
        long j10;
        long j11;
        long j12;
        long j13;
        int i10 = this.f3579h;
        int i11 = this.f3577f;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f3576e;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f3579h = i12;
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
                this.f3579h = i13;
                return j10;
            }
        }
        return F();
    }

    public final long F() throws h0 {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            int i11 = this.f3579h;
            if (i11 == this.f3577f) {
                throw h0.g();
            }
            this.f3579h = i11 + 1;
            byte b10 = this.f3576e[i11];
            j10 |= ((long) (b10 & 127)) << i10;
            if ((b10 & 128) == 0) {
                return j10;
            }
        }
        throw h0.d();
    }

    public final void G() {
        int i10 = this.f3577f + this.f3578g;
        this.f3577f = i10;
        int i11 = i10 - this.f3580i;
        int i12 = this.f3582k;
        if (i11 <= i12) {
            this.f3578g = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f3578g = i13;
        this.f3577f = i10 - i13;
    }

    public final void H(int i10) throws h0 {
        if (i10 >= 0) {
            int i11 = this.f3577f;
            int i12 = this.f3579h;
            if (i10 <= i11 - i12) {
                this.f3579h = i12 + i10;
                return;
            }
        }
        if (i10 >= 0) {
            throw h0.g();
        }
        throw h0.e();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o
    public final void a(int i10) {
        if (this.f3581j != i10) {
            throw new h0("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o
    public final int d() {
        return this.f3579h - this.f3580i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o
    public final boolean e() {
        return this.f3579h == this.f3577f;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o
    public final void g(int i10) {
        this.f3582k = i10;
        G();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o
    public final int h(int i10) throws h0 {
        if (i10 < 0) {
            throw h0.e();
        }
        int iD = d() + i10;
        if (iD < 0) {
            throw h0.f();
        }
        int i11 = this.f3582k;
        if (iD > i11) {
            throw h0.g();
        }
        this.f3582k = iD;
        G();
        return i11;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o
    public final boolean i() {
        return E() != 0;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0031 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0042  */
    @Override // com.google.crypto.tink.shaded.protobuf.o
    public final k j() throws h0 {
        byte[] bArrCopyOfRange;
        int iD = D();
        byte[] bArr = this.f3576e;
        if (iD > 0) {
            int i10 = this.f3577f;
            int i11 = this.f3579h;
            if (iD <= i10 - i11) {
                k kVarI = l.i(bArr, i11, iD);
                this.f3579h += iD;
                return kVarI;
            }
        }
        if (iD == 0) {
            return l.f3571b;
        }
        if (iD > 0) {
            int i12 = this.f3577f;
            int i13 = this.f3579h;
            if (iD <= i12 - i13) {
                int i14 = iD + i13;
                this.f3579h = i14;
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i13, i14);
            } else {
                if (iD <= 0) {
                    throw h0.g();
                }
                if (iD == 0) {
                    throw h0.e();
                }
                bArrCopyOfRange = f0.f3535b;
            }
        } else {
            if (iD <= 0) {
                throw h0.g();
            }
            if (iD == 0) {
                throw h0.e();
            }
            bArrCopyOfRange = f0.f3535b;
        }
        k kVar = l.f3571b;
        return new k(bArrCopyOfRange);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o
    public final double k() {
        return Double.longBitsToDouble(C());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o
    public final int l() {
        return D();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o
    public final int m() {
        return B();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o
    public final long n() {
        return C();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o
    public final float o() {
        return Float.intBitsToFloat(B());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o
    public final int p() {
        return D();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o
    public final long q() {
        return E();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o
    public final int r() {
        return B();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o
    public final long s() {
        return C();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o
    public final int t() {
        return o.b(D());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o
    public final long u() {
        return o.c(E());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o
    public final String v() throws h0 {
        int iD = D();
        if (iD > 0) {
            int i10 = this.f3577f;
            int i11 = this.f3579h;
            if (iD <= i10 - i11) {
                String str = new String(this.f3576e, i11, iD, f0.f3534a);
                this.f3579h += iD;
                return str;
            }
        }
        if (iD == 0) {
            return "";
        }
        if (iD < 0) {
            throw h0.e();
        }
        throw h0.g();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o
    public final String w() throws h0 {
        int iD = D();
        if (iD > 0) {
            int i10 = this.f3577f;
            int i11 = this.f3579h;
            if (iD <= i10 - i11) {
                String strR0 = z1.f3643a.r0(this.f3576e, i11, iD);
                this.f3579h += iD;
                return strR0;
            }
        }
        if (iD == 0) {
            return "";
        }
        if (iD <= 0) {
            throw h0.e();
        }
        throw h0.g();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o
    public final int x() throws h0 {
        if (e()) {
            this.f3581j = 0;
            return 0;
        }
        int iD = D();
        this.f3581j = iD;
        if ((iD >>> 3) != 0) {
            return iD;
        }
        throw h0.a();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o
    public final int y() {
        return D();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o
    public final long z() {
        return E();
    }
}
