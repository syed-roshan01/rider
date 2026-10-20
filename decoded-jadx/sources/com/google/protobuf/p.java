package com.google.protobuf;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class p extends s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Iterable f4198e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Iterator f4199f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ByteBuffer f4200g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4201h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f4202i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f4204k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f4206m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f4207n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f4208o;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f4203j = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4205l = 0;

    public p(ArrayList arrayList, int i10) {
        this.f4201h = i10;
        this.f4199f = arrayList.iterator();
        if (i10 != 0) {
            O();
            return;
        }
        this.f4200g = y0.f4278c;
        this.f4206m = 0L;
        this.f4207n = 0L;
        this.f4208o = 0L;
    }

    @Override // com.google.protobuf.s
    public final int A() throws a1 {
        if (e()) {
            this.f4204k = 0;
            return 0;
        }
        int iJ = J();
        this.f4204k = iJ;
        if ((iJ >>> 3) != 0) {
            return iJ;
        }
        throw a1.b();
    }

    @Override // com.google.protobuf.s
    public final int B() {
        return J();
    }

    @Override // com.google.protobuf.s
    public final long C() {
        return K();
    }

    @Override // com.google.protobuf.s
    public final boolean D(int i10) throws a1 {
        int iA;
        int i11 = i10 & 7;
        if (i11 == 0) {
            for (int i12 = 0; i12 < 10; i12++) {
                if (F() >= 0) {
                    return true;
                }
            }
            throw a1.e();
        }
        if (i11 == 1) {
            N(8);
            return true;
        }
        if (i11 == 2) {
            N(J());
            return true;
        }
        if (i11 != 3) {
            if (i11 == 4) {
                return false;
            }
            if (i11 != 5) {
                throw a1.d();
            }
            N(4);
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

    public final long E() {
        return this.f4208o - this.f4206m;
    }

    public final byte F() throws a1 {
        if (E() == 0) {
            if (!this.f4199f.hasNext()) {
                throw a1.h();
            }
            O();
        }
        long j10 = this.f4206m;
        this.f4206m = 1 + j10;
        return z2.f4286c.e(j10);
    }

    public final void G(byte[] bArr, int i10) throws a1 {
        if (i10 < 0 || i10 > M()) {
            if (i10 > 0) {
                throw a1.h();
            }
            if (i10 != 0) {
                throw a1.f();
            }
            return;
        }
        int i11 = i10;
        while (i11 > 0) {
            if (E() == 0) {
                if (!this.f4199f.hasNext()) {
                    throw a1.h();
                }
                O();
            }
            int iMin = Math.min(i11, (int) E());
            long j10 = iMin;
            z2.f4286c.c(this.f4206m, bArr, i10 - i11, j10);
            i11 -= iMin;
            this.f4206m += j10;
        }
    }

    public final int H() {
        if (E() < 4) {
            return (F() & 255) | ((F() & 255) << 8) | ((F() & 255) << 16) | ((F() & 255) << 24);
        }
        long j10 = this.f4206m;
        this.f4206m = 4 + j10;
        y2 y2Var = z2.f4286c;
        return ((y2Var.e(j10 + 3) & 255) << 24) | (y2Var.e(j10) & 255) | ((y2Var.e(1 + j10) & 255) << 8) | ((y2Var.e(2 + j10) & 255) << 16);
    }

    public final long I() throws a1 {
        long jF;
        byte bF;
        if (E() >= 8) {
            long j10 = this.f4206m;
            this.f4206m = 8 + j10;
            y2 y2Var = z2.f4286c;
            jF = (((long) y2Var.e(j10)) & 255) | ((((long) y2Var.e(j10 + 1)) & 255) << 8) | ((((long) y2Var.e(2 + j10)) & 255) << 16) | ((((long) y2Var.e(3 + j10)) & 255) << 24) | ((((long) y2Var.e(4 + j10)) & 255) << 32) | ((((long) y2Var.e(5 + j10)) & 255) << 40) | ((((long) y2Var.e(6 + j10)) & 255) << 48);
            bF = y2Var.e(j10 + 7);
        } else {
            jF = (((long) F()) & 255) | ((((long) F()) & 255) << 8) | ((((long) F()) & 255) << 16) | ((((long) F()) & 255) << 24) | ((((long) F()) & 255) << 32) | ((((long) F()) & 255) << 40) | ((((long) F()) & 255) << 48);
            bF = F();
        }
        return ((((long) bF) & 255) << 56) | jF;
    }

    public final int J() {
        int i10;
        long j10 = this.f4206m;
        if (this.f4208o != j10) {
            long j11 = j10 + 1;
            y2 y2Var = z2.f4286c;
            byte bE = y2Var.e(j10);
            if (bE >= 0) {
                this.f4206m++;
                return bE;
            }
            if (this.f4208o - this.f4206m >= 10) {
                long j12 = 2 + j10;
                int iE = (y2Var.e(j11) << 7) ^ bE;
                if (iE < 0) {
                    i10 = iE ^ (-128);
                } else {
                    long j13 = 3 + j10;
                    int iE2 = (y2Var.e(j12) << 14) ^ iE;
                    if (iE2 >= 0) {
                        i10 = iE2 ^ 16256;
                    } else {
                        long j14 = 4 + j10;
                        int iE3 = iE2 ^ (y2Var.e(j13) << 21);
                        if (iE3 < 0) {
                            i10 = (-2080896) ^ iE3;
                        } else {
                            j13 = 5 + j10;
                            byte bE2 = y2Var.e(j14);
                            int i11 = (iE3 ^ (bE2 << 28)) ^ 266354560;
                            if (bE2 < 0) {
                                j14 = 6 + j10;
                                if (y2Var.e(j13) < 0) {
                                    j13 = 7 + j10;
                                    if (y2Var.e(j14) < 0) {
                                        j14 = 8 + j10;
                                        if (y2Var.e(j13) < 0) {
                                            j13 = 9 + j10;
                                            if (y2Var.e(j14) < 0) {
                                                long j15 = j10 + 10;
                                                if (y2Var.e(j13) >= 0) {
                                                    i10 = i11;
                                                    j12 = j15;
                                                }
                                            }
                                        }
                                    }
                                }
                                i10 = i11;
                            }
                            i10 = i11;
                        }
                        j12 = j14;
                    }
                    j12 = j13;
                }
                this.f4206m = j12;
                return i10;
            }
        }
        return (int) L();
    }

    public final long K() {
        long j10;
        long j11;
        long j12;
        long j13 = this.f4206m;
        if (this.f4208o != j13) {
            long j14 = j13 + 1;
            y2 y2Var = z2.f4286c;
            byte bE = y2Var.e(j13);
            if (bE >= 0) {
                this.f4206m++;
                return bE;
            }
            if (this.f4208o - this.f4206m >= 10) {
                long j15 = 2 + j13;
                int iE = (y2Var.e(j14) << 7) ^ bE;
                if (iE < 0) {
                    j10 = iE ^ (-128);
                } else {
                    long j16 = 3 + j13;
                    int iE2 = (y2Var.e(j15) << 14) ^ iE;
                    if (iE2 >= 0) {
                        j10 = iE2 ^ 16256;
                    } else {
                        long j17 = 4 + j13;
                        int iE3 = iE2 ^ (y2Var.e(j16) << 21);
                        if (iE3 < 0) {
                            j10 = (-2080896) ^ iE3;
                            j15 = j17;
                        } else {
                            long j18 = 5 + j13;
                            long jE = (((long) y2Var.e(j17)) << 28) ^ ((long) iE3);
                            if (jE >= 0) {
                                j12 = 266354560;
                            } else {
                                j16 = 6 + j13;
                                long jE2 = jE ^ (((long) y2Var.e(j18)) << 35);
                                if (jE2 < 0) {
                                    j11 = -34093383808L;
                                } else {
                                    j18 = 7 + j13;
                                    jE = jE2 ^ (((long) y2Var.e(j16)) << 42);
                                    if (jE >= 0) {
                                        j12 = 4363953127296L;
                                    } else {
                                        j16 = 8 + j13;
                                        jE2 = jE ^ (((long) y2Var.e(j18)) << 49);
                                        if (jE2 < 0) {
                                            j11 = -558586000294016L;
                                        } else {
                                            j18 = 9 + j13;
                                            long jE3 = (jE2 ^ (((long) y2Var.e(j16)) << 56)) ^ 71499008037633920L;
                                            if (jE3 < 0) {
                                                long j19 = j13 + 10;
                                                if (y2Var.e(j18) >= 0) {
                                                    j10 = jE3;
                                                    j15 = j19;
                                                }
                                            } else {
                                                j10 = jE3;
                                                j15 = j18;
                                            }
                                        }
                                    }
                                }
                                j10 = j11 ^ jE2;
                            }
                            j10 = j12 ^ jE;
                            j15 = j18;
                        }
                    }
                    j15 = j16;
                }
                this.f4206m = j15;
                return j10;
            }
        }
        return L();
    }

    public final long L() throws a1 {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            byte bF = F();
            j10 |= ((long) (bF & 127)) << i10;
            if ((bF & 128) == 0) {
                return j10;
            }
        }
        throw a1.e();
    }

    public final int M() {
        return (int) ((((long) (this.f4201h - this.f4205l)) - this.f4206m) + this.f4207n);
    }

    public final void N(int i10) throws a1 {
        if (i10 < 0 || i10 > (((long) (this.f4201h - this.f4205l)) - this.f4206m) + this.f4207n) {
            if (i10 >= 0) {
                throw a1.h();
            }
            throw a1.f();
        }
        while (i10 > 0) {
            if (E() == 0) {
                if (!this.f4199f.hasNext()) {
                    throw a1.h();
                }
                O();
            }
            int iMin = Math.min(i10, (int) E());
            i10 -= iMin;
            this.f4206m += (long) iMin;
        }
    }

    public final void O() {
        ByteBuffer byteBuffer = (ByteBuffer) this.f4199f.next();
        this.f4200g = byteBuffer;
        this.f4205l += (int) (this.f4206m - this.f4207n);
        long jPosition = byteBuffer.position();
        this.f4206m = jPosition;
        this.f4207n = jPosition;
        this.f4208o = this.f4200g.limit();
        long j10 = z2.f4286c.j(this.f4200g, z2.f4290g);
        this.f4206m += j10;
        this.f4207n += j10;
        this.f4208o += j10;
    }

    @Override // com.google.protobuf.s
    public final void a(int i10) throws a1 {
        if (this.f4204k != i10) {
            throw a1.a();
        }
    }

    @Override // com.google.protobuf.s
    public final int d() {
        return (int) ((((long) this.f4205l) + this.f4206m) - this.f4207n);
    }

    @Override // com.google.protobuf.s
    public final boolean e() {
        return (((long) this.f4205l) + this.f4206m) - this.f4207n == ((long) this.f4201h);
    }

    @Override // com.google.protobuf.s
    public final void i(int i10) {
        this.f4203j = i10;
        int i11 = this.f4201h + this.f4202i;
        this.f4201h = i11;
        if (i11 <= i10) {
            this.f4202i = 0;
            return;
        }
        int i12 = i11 - i10;
        this.f4202i = i12;
        this.f4201h = i11 - i12;
    }

    @Override // com.google.protobuf.s
    public final int j(int i10) throws a1 {
        if (i10 < 0) {
            throw a1.f();
        }
        int iD = d() + i10;
        int i11 = this.f4203j;
        if (iD > i11) {
            throw a1.h();
        }
        this.f4203j = iD;
        int i12 = this.f4201h + this.f4202i;
        this.f4201h = i12;
        if (i12 > iD) {
            int i13 = i12 - iD;
            this.f4202i = i13;
            this.f4201h = i12 - i13;
        } else {
            this.f4202i = 0;
        }
        return i11;
    }

    @Override // com.google.protobuf.s
    public final boolean k() {
        return K() != 0;
    }

    @Override // com.google.protobuf.s
    public final m l() throws a1 {
        int iJ = J();
        if (iJ > 0) {
            long j10 = iJ;
            long j11 = this.f4208o;
            long j12 = this.f4206m;
            if (j10 <= j11 - j12) {
                byte[] bArr = new byte[iJ];
                z2.f4286c.c(j12, bArr, 0L, j10);
                this.f4206m += j10;
                m mVar = n.f4181b;
                return new m(bArr);
            }
        }
        if (iJ > 0 && iJ <= M()) {
            byte[] bArr2 = new byte[iJ];
            G(bArr2, iJ);
            m mVar2 = n.f4181b;
            return new m(bArr2);
        }
        if (iJ == 0) {
            return n.f4181b;
        }
        if (iJ < 0) {
            throw a1.f();
        }
        throw a1.h();
    }

    @Override // com.google.protobuf.s
    public final double m() {
        return Double.longBitsToDouble(I());
    }

    @Override // com.google.protobuf.s
    public final int n() {
        return J();
    }

    @Override // com.google.protobuf.s
    public final int o() {
        return H();
    }

    @Override // com.google.protobuf.s
    public final long p() {
        return I();
    }

    @Override // com.google.protobuf.s
    public final float q() {
        return Float.intBitsToFloat(H());
    }

    @Override // com.google.protobuf.s
    public final int r() {
        return J();
    }

    @Override // com.google.protobuf.s
    public final long s() {
        return K();
    }

    @Override // com.google.protobuf.s
    public final int u() {
        return H();
    }

    @Override // com.google.protobuf.s
    public final long v() {
        return I();
    }

    @Override // com.google.protobuf.s
    public final int w() {
        return s.b(J());
    }

    @Override // com.google.protobuf.s
    public final long x() {
        return s.c(K());
    }

    @Override // com.google.protobuf.s
    public final String y() throws a1 {
        int iJ = J();
        if (iJ > 0) {
            long j10 = iJ;
            long j11 = this.f4208o;
            long j12 = this.f4206m;
            if (j10 <= j11 - j12) {
                byte[] bArr = new byte[iJ];
                z2.f4286c.c(j12, bArr, 0L, j10);
                String str = new String(bArr, y0.f4276a);
                this.f4206m += j10;
                return str;
            }
        }
        if (iJ > 0 && iJ <= M()) {
            byte[] bArr2 = new byte[iJ];
            G(bArr2, iJ);
            return new String(bArr2, y0.f4276a);
        }
        if (iJ == 0) {
            return "";
        }
        if (iJ < 0) {
            throw a1.f();
        }
        throw a1.h();
    }

    @Override // com.google.protobuf.s
    public final String z() throws a1 {
        int iJ = J();
        if (iJ > 0) {
            long j10 = iJ;
            long j11 = this.f4208o;
            long j12 = this.f4206m;
            if (j10 <= j11 - j12) {
                String strB = c3.b(this.f4200g, (int) (j12 - this.f4207n), iJ);
                this.f4206m += j10;
                return strB;
            }
        }
        if (iJ >= 0 && iJ <= M()) {
            byte[] bArr = new byte[iJ];
            G(bArr, iJ);
            return c3.f4086a.T(bArr, 0, iJ);
        }
        if (iJ == 0) {
            return "";
        }
        if (iJ <= 0) {
            throw a1.f();
        }
        throw a1.h();
    }
}
