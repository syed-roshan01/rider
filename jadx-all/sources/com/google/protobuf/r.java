package com.google.protobuf;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class r extends s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ByteBuffer f4222e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f4223f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f4224g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f4225h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f4226i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f4227j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f4228k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4229l = Integer.MAX_VALUE;

    public r(ByteBuffer byteBuffer, boolean z10) {
        this.f4222e = byteBuffer;
        long j10 = z2.f4286c.j(byteBuffer, z2.f4290g);
        this.f4223f = j10;
        this.f4224g = ((long) byteBuffer.limit()) + j10;
        long jPosition = j10 + ((long) byteBuffer.position());
        this.f4225h = jPosition;
        this.f4226i = jPosition;
    }

    @Override // com.google.protobuf.s
    public final int A() throws a1 {
        if (e()) {
            this.f4228k = 0;
            return 0;
        }
        int iG = G();
        this.f4228k = iG;
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
            if (((int) (this.f4224g - this.f4225h)) >= 10) {
                while (i12 < 10) {
                    long j10 = this.f4225h;
                    this.f4225h = j10 + 1;
                    if (z2.f4286c.e(j10) < 0) {
                        i12++;
                    }
                }
                throw a1.e();
            }
            while (i12 < 10) {
                long j11 = this.f4225h;
                if (j11 == this.f4224g) {
                    throw a1.h();
                }
                this.f4225h = j11 + 1;
                if (z2.f4286c.e(j11) < 0) {
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
        long j10 = this.f4225h;
        if (this.f4224g - j10 < 4) {
            throw a1.h();
        }
        this.f4225h = 4 + j10;
        y2 y2Var = z2.f4286c;
        return ((y2Var.e(j10 + 3) & 255) << 24) | (y2Var.e(j10) & 255) | ((y2Var.e(1 + j10) & 255) << 8) | ((y2Var.e(2 + j10) & 255) << 16);
    }

    public final long F() throws a1 {
        long j10 = this.f4225h;
        if (this.f4224g - j10 < 8) {
            throw a1.h();
        }
        this.f4225h = 8 + j10;
        y2 y2Var = z2.f4286c;
        return ((((long) y2Var.e(j10 + 7)) & 255) << 56) | (((long) y2Var.e(j10)) & 255) | ((((long) y2Var.e(1 + j10)) & 255) << 8) | ((((long) y2Var.e(2 + j10)) & 255) << 16) | ((((long) y2Var.e(3 + j10)) & 255) << 24) | ((((long) y2Var.e(4 + j10)) & 255) << 32) | ((((long) y2Var.e(5 + j10)) & 255) << 40) | ((((long) y2Var.e(6 + j10)) & 255) << 48);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0099 A[PHI: r6
  0x0099: PHI (r6v7 long) = (r6v6 long), (r6v8 long), (r6v10 long) binds: [B:25:0x006d, B:29:0x0080, B:33:0x0091] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0091, code lost:
    
        if (r4.e(r8) < 0) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int G() {
        /*
            r12 = this;
            long r0 = r12.f4225h
            long r2 = r12.f4224g
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 != 0) goto La
            goto L93
        La:
            r2 = 1
            long r2 = r2 + r0
            com.google.protobuf.y2 r4 = com.google.protobuf.z2.f4286c
            byte r5 = r4.e(r0)
            if (r5 < 0) goto L18
            r12.f4225h = r2
            return r5
        L18:
            long r6 = r12.f4224g
            long r6 = r6 - r2
            r8 = 9
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 >= 0) goto L23
            goto L93
        L23:
            r6 = 2
            long r6 = r6 + r0
            byte r2 = r4.e(r2)
            int r2 = r2 << 7
            r2 = r2 ^ r5
            if (r2 >= 0) goto L33
            r0 = r2 ^ (-128(0xffffffffffffff80, float:NaN))
            goto La0
        L33:
            r10 = 3
            long r10 = r10 + r0
            byte r3 = r4.e(r6)
            int r3 = r3 << 14
            r2 = r2 ^ r3
            if (r2 < 0) goto L43
            r0 = r2 ^ 16256(0x3f80, float:2.278E-41)
        L41:
            r6 = r10
            goto La0
        L43:
            r5 = 4
            long r6 = r0 + r5
            byte r3 = r4.e(r10)
            int r3 = r3 << 21
            r2 = r2 ^ r3
            if (r2 >= 0) goto L55
            r0 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto La0
        L55:
            r10 = 5
            long r10 = r10 + r0
            byte r3 = r4.e(r6)
            int r5 = r3 << 28
            r2 = r2 ^ r5
            r5 = 266354560(0xfe03f80, float:2.2112565E-29)
            r2 = r2 ^ r5
            if (r3 >= 0) goto L9e
            r5 = 6
            long r6 = r0 + r5
            byte r3 = r4.e(r10)
            if (r3 >= 0) goto L99
            r10 = 7
            long r10 = r10 + r0
            byte r3 = r4.e(r6)
            if (r3 >= 0) goto L9e
            r5 = 8
            long r6 = r0 + r5
            byte r3 = r4.e(r10)
            if (r3 >= 0) goto L99
            long r8 = r8 + r0
            byte r3 = r4.e(r6)
            if (r3 >= 0) goto L9b
            r5 = 10
            long r6 = r0 + r5
            byte r0 = r4.e(r8)
            if (r0 >= 0) goto L99
        L93:
            long r0 = r12.I()
            int r0 = (int) r0
            return r0
        L99:
            r0 = r2
            goto La0
        L9b:
            r0 = r2
            r6 = r8
            goto La0
        L9e:
            r0 = r2
            goto L41
        La0:
            r12.f4225h = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.r.G():int");
    }

    public final long H() {
        long j10;
        long j11;
        long j12;
        int i10;
        long j13 = this.f4225h;
        if (this.f4224g != j13) {
            long j14 = 1 + j13;
            y2 y2Var = z2.f4286c;
            byte bE = y2Var.e(j13);
            if (bE >= 0) {
                this.f4225h = j14;
                return bE;
            }
            if (this.f4224g - j14 >= 9) {
                long j15 = 2 + j13;
                int iE = (y2Var.e(j14) << 7) ^ bE;
                if (iE >= 0) {
                    long j16 = 3 + j13;
                    int iE2 = iE ^ (y2Var.e(j15) << 14);
                    if (iE2 < 0) {
                        j15 = j13 + 4;
                        int iE3 = iE2 ^ (y2Var.e(j16) << 21);
                        if (iE3 < 0) {
                            i10 = (-2080896) ^ iE3;
                        } else {
                            j16 = 5 + j13;
                            long jE = ((long) iE3) ^ (((long) y2Var.e(j15)) << 28);
                            if (jE >= 0) {
                                j12 = 266354560;
                            } else {
                                long j17 = 6 + j13;
                                long jE2 = jE ^ (((long) y2Var.e(j16)) << 35);
                                if (jE2 < 0) {
                                    j11 = -34093383808L;
                                } else {
                                    j16 = 7 + j13;
                                    jE = jE2 ^ (((long) y2Var.e(j17)) << 42);
                                    if (jE >= 0) {
                                        j12 = 4363953127296L;
                                    } else {
                                        j17 = 8 + j13;
                                        jE2 = jE ^ (((long) y2Var.e(j16)) << 49);
                                        if (jE2 < 0) {
                                            j11 = -558586000294016L;
                                        } else {
                                            long j18 = j13 + 9;
                                            long jE3 = (jE2 ^ (((long) y2Var.e(j17)) << 56)) ^ 71499008037633920L;
                                            if (jE3 < 0) {
                                                long j19 = j13 + 10;
                                                if (y2Var.e(j18) >= 0) {
                                                    j15 = j19;
                                                    j10 = jE3;
                                                }
                                            } else {
                                                j10 = jE3;
                                                j15 = j18;
                                            }
                                        }
                                    }
                                }
                                j10 = j11 ^ jE2;
                                j15 = j17;
                            }
                            j10 = j12 ^ jE;
                        }
                        this.f4225h = j15;
                        return j10;
                    }
                    j10 = iE2 ^ 16256;
                    j15 = j16;
                    this.f4225h = j15;
                    return j10;
                }
                i10 = iE ^ (-128);
                j10 = i10;
                this.f4225h = j15;
                return j10;
            }
        }
        return I();
    }

    public final long I() throws a1 {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            long j11 = this.f4225h;
            if (j11 == this.f4224g) {
                throw a1.h();
            }
            this.f4225h = 1 + j11;
            byte bE = z2.f4286c.e(j11);
            j10 |= ((long) (bE & 127)) << i10;
            if ((bE & 128) == 0) {
                return j10;
            }
        }
        throw a1.e();
    }

    public final void J() {
        long j10 = this.f4224g + ((long) this.f4227j);
        this.f4224g = j10;
        int i10 = (int) (j10 - this.f4226i);
        int i11 = this.f4229l;
        if (i10 <= i11) {
            this.f4227j = 0;
            return;
        }
        int i12 = i10 - i11;
        this.f4227j = i12;
        this.f4224g = j10 - ((long) i12);
    }

    public final void K(int i10) throws a1 {
        if (i10 >= 0) {
            long j10 = this.f4224g;
            long j11 = this.f4225h;
            if (i10 <= ((int) (j10 - j11))) {
                this.f4225h = j11 + ((long) i10);
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
        if (this.f4228k != i10) {
            throw a1.a();
        }
    }

    @Override // com.google.protobuf.s
    public final int d() {
        return (int) (this.f4225h - this.f4226i);
    }

    @Override // com.google.protobuf.s
    public final boolean e() {
        return this.f4225h == this.f4224g;
    }

    @Override // com.google.protobuf.s
    public final void i(int i10) {
        this.f4229l = i10;
        J();
    }

    @Override // com.google.protobuf.s
    public final int j(int i10) throws a1 {
        if (i10 < 0) {
            throw a1.f();
        }
        int iD = d() + i10;
        int i11 = this.f4229l;
        if (iD > i11) {
            throw a1.h();
        }
        this.f4229l = iD;
        J();
        return i11;
    }

    @Override // com.google.protobuf.s
    public final boolean k() {
        return H() != 0;
    }

    @Override // com.google.protobuf.s
    public final m l() throws a1 {
        int iG = G();
        if (iG > 0) {
            long j10 = this.f4224g;
            long j11 = this.f4225h;
            if (iG <= ((int) (j10 - j11))) {
                byte[] bArr = new byte[iG];
                long j12 = iG;
                z2.f4286c.c(j11, bArr, 0L, j12);
                this.f4225h += j12;
                m mVar = n.f4181b;
                return new m(bArr);
            }
        }
        if (iG == 0) {
            return n.f4181b;
        }
        if (iG < 0) {
            throw a1.f();
        }
        throw a1.h();
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
            long j10 = this.f4224g;
            long j11 = this.f4225h;
            if (iG <= ((int) (j10 - j11))) {
                byte[] bArr = new byte[iG];
                long j12 = iG;
                z2.f4286c.c(j11, bArr, 0L, j12);
                String str = new String(bArr, y0.f4276a);
                this.f4225h += j12;
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
            long j10 = this.f4224g;
            long j11 = this.f4225h;
            if (iG <= ((int) (j10 - j11))) {
                String strB = c3.b(this.f4222e, (int) (j11 - this.f4223f), iG);
                this.f4225h += (long) iG;
                return strB;
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
