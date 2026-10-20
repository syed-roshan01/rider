package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class q extends s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InputStream f4214e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f4215f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4216g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4217h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f4218i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f4219j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f4220k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4221l = Integer.MAX_VALUE;

    public q(InputStream inputStream) {
        Charset charset = y0.f4276a;
        if (inputStream == null) {
            throw new NullPointerException("input");
        }
        this.f4214e = inputStream;
        this.f4215f = new byte[4096];
        this.f4216g = 0;
        this.f4218i = 0;
        this.f4220k = 0;
    }

    @Override // com.google.protobuf.s
    public final int A() throws a1 {
        if (e()) {
            this.f4219j = 0;
            return 0;
        }
        int iJ = J();
        this.f4219j = iJ;
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
        int i12 = 0;
        if (i11 == 0) {
            int i13 = this.f4216g - this.f4218i;
            byte[] bArr = this.f4215f;
            if (i13 >= 10) {
                while (i12 < 10) {
                    int i14 = this.f4218i;
                    this.f4218i = i14 + 1;
                    if (bArr[i14] < 0) {
                        i12++;
                    }
                }
                throw a1.e();
            }
            while (i12 < 10) {
                if (this.f4218i == this.f4216g) {
                    N(1);
                }
                int i15 = this.f4218i;
                this.f4218i = i15 + 1;
                if (bArr[i15] < 0) {
                    i12++;
                }
            }
            throw a1.e();
            return true;
        }
        if (i11 == 1) {
            O(8);
            return true;
        }
        if (i11 == 2) {
            O(J());
            return true;
        }
        if (i11 != 3) {
            if (i11 == 4) {
                return false;
            }
            if (i11 != 5) {
                throw a1.d();
            }
            O(4);
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

    public final byte[] E(int i10) throws IOException {
        byte[] bArrF = F(i10);
        if (bArrF != null) {
            return bArrF;
        }
        int i11 = this.f4218i;
        int i12 = this.f4216g;
        int length = i12 - i11;
        this.f4220k += i12;
        this.f4218i = 0;
        this.f4216g = 0;
        ArrayList<byte[]> arrayListG = G(i10 - length);
        byte[] bArr = new byte[i10];
        System.arraycopy(this.f4215f, i11, bArr, 0, length);
        for (byte[] bArr2 : arrayListG) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    public final byte[] F(int i10) throws IOException {
        if (i10 == 0) {
            return y0.f4277b;
        }
        if (i10 < 0) {
            throw a1.f();
        }
        int i11 = this.f4220k;
        int i12 = this.f4218i;
        int i13 = i11 + i12 + i10;
        if (i13 - this.f4232c > 0) {
            throw new a1("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i14 = this.f4221l;
        if (i13 > i14) {
            O((i14 - i11) - i12);
            throw a1.h();
        }
        int i15 = this.f4216g - i12;
        int i16 = i10 - i15;
        InputStream inputStream = this.f4214e;
        if (i16 >= 4096) {
            try {
                if (i16 > inputStream.available()) {
                    return null;
                }
            } catch (a1 e4) {
                e4.f4055a = true;
                throw e4;
            }
        }
        byte[] bArr = new byte[i10];
        System.arraycopy(this.f4215f, this.f4218i, bArr, 0, i15);
        this.f4220k += this.f4216g;
        this.f4218i = 0;
        this.f4216g = 0;
        while (i15 < i10) {
            try {
                int i17 = inputStream.read(bArr, i15, i10 - i15);
                if (i17 == -1) {
                    throw a1.h();
                }
                this.f4220k += i17;
                i15 += i17;
            } catch (a1 e10) {
                e10.f4055a = true;
                throw e10;
            }
        }
        return bArr;
    }

    public final ArrayList G(int i10) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i10 > 0) {
            int iMin = Math.min(i10, 4096);
            byte[] bArr = new byte[iMin];
            int i11 = 0;
            while (i11 < iMin) {
                int i12 = this.f4214e.read(bArr, i11, iMin - i11);
                if (i12 == -1) {
                    throw a1.h();
                }
                this.f4220k += i12;
                i11 += i12;
            }
            i10 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int H() throws a1 {
        int i10 = this.f4218i;
        if (this.f4216g - i10 < 4) {
            N(4);
            i10 = this.f4218i;
        }
        this.f4218i = i10 + 4;
        byte[] bArr = this.f4215f;
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public final long I() throws a1 {
        int i10 = this.f4218i;
        if (this.f4216g - i10 < 8) {
            N(8);
            i10 = this.f4218i;
        }
        this.f4218i = i10 + 8;
        byte[] bArr = this.f4215f;
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }

    public final int J() {
        int i10;
        int i11 = this.f4218i;
        int i12 = this.f4216g;
        if (i12 != i11) {
            int i13 = i11 + 1;
            byte[] bArr = this.f4215f;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.f4218i = i13;
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
                this.f4218i = i14;
                return i10;
            }
        }
        return (int) L();
    }

    public final long K() {
        long j10;
        long j11;
        long j12;
        long j13;
        int i10 = this.f4218i;
        int i11 = this.f4216g;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f4215f;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f4218i = i12;
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
                this.f4218i = i13;
                return j10;
            }
        }
        return L();
    }

    public final long L() throws a1 {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            if (this.f4218i == this.f4216g) {
                N(1);
            }
            int i11 = this.f4218i;
            this.f4218i = i11 + 1;
            byte b10 = this.f4215f[i11];
            j10 |= ((long) (b10 & 127)) << i10;
            if ((b10 & 128) == 0) {
                return j10;
            }
        }
        throw a1.e();
    }

    public final void M() {
        int i10 = this.f4216g + this.f4217h;
        this.f4216g = i10;
        int i11 = this.f4220k + i10;
        int i12 = this.f4221l;
        if (i11 <= i12) {
            this.f4217h = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f4217h = i13;
        this.f4216g = i10 - i13;
    }

    public final void N(int i10) throws a1 {
        if (P(i10)) {
            return;
        }
        if (i10 <= (this.f4232c - this.f4220k) - this.f4218i) {
            throw a1.h();
        }
        throw new a1("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final void O(int i10) throws a1 {
        int i11 = this.f4216g;
        int i12 = this.f4218i;
        if (i10 <= i11 - i12 && i10 >= 0) {
            this.f4218i = i12 + i10;
            return;
        }
        InputStream inputStream = this.f4214e;
        if (i10 < 0) {
            throw a1.f();
        }
        int i13 = this.f4220k;
        int i14 = i13 + i12;
        int i15 = i14 + i10;
        int i16 = this.f4221l;
        if (i15 > i16) {
            O((i16 - i13) - i12);
            throw a1.h();
        }
        this.f4220k = i14;
        int i17 = i11 - i12;
        this.f4216g = 0;
        this.f4218i = 0;
        while (i17 < i10) {
            long j10 = i10 - i17;
            try {
                try {
                    long jSkip = inputStream.skip(j10);
                    if (jSkip < 0 || jSkip > j10) {
                        throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i17 += (int) jSkip;
                    }
                } catch (a1 e4) {
                    e4.f4055a = true;
                    throw e4;
                }
            } catch (Throwable th) {
                this.f4220k += i17;
                M();
                throw th;
            }
        }
        this.f4220k += i17;
        M();
        if (i17 >= i10) {
            return;
        }
        int i18 = this.f4216g;
        int i19 = i18 - this.f4218i;
        this.f4218i = i18;
        N(1);
        while (true) {
            int i20 = i10 - i19;
            int i21 = this.f4216g;
            if (i20 <= i21) {
                this.f4218i = i20;
                return;
            } else {
                i19 += i21;
                this.f4218i = i21;
                N(1);
            }
        }
    }

    public final boolean P(int i10) throws IOException {
        int i11 = this.f4218i;
        int i12 = i11 + i10;
        int i13 = this.f4216g;
        if (i12 <= i13) {
            throw new IllegalStateException(l.q.h("refillBuffer() called when ", i10, " bytes were already available in buffer"));
        }
        int i14 = this.f4232c;
        int i15 = this.f4220k;
        if (i10 > (i14 - i15) - i11 || i15 + i11 + i10 > this.f4221l) {
            return false;
        }
        byte[] bArr = this.f4215f;
        if (i11 > 0) {
            if (i13 > i11) {
                System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
            }
            this.f4220k += i11;
            this.f4216g -= i11;
            this.f4218i = 0;
        }
        int i16 = this.f4216g;
        int iMin = Math.min(bArr.length - i16, (this.f4232c - this.f4220k) - i16);
        InputStream inputStream = this.f4214e;
        try {
            int i17 = inputStream.read(bArr, i16, iMin);
            if (i17 == 0 || i17 < -1 || i17 > bArr.length) {
                throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + i17 + "\nThe InputStream implementation is buggy.");
            }
            if (i17 <= 0) {
                return false;
            }
            this.f4216g += i17;
            M();
            if (this.f4216g >= i10) {
                return true;
            }
            return P(i10);
        } catch (a1 e4) {
            e4.f4055a = true;
            throw e4;
        }
    }

    @Override // com.google.protobuf.s
    public final void a(int i10) throws a1 {
        if (this.f4219j != i10) {
            throw a1.a();
        }
    }

    @Override // com.google.protobuf.s
    public final int d() {
        return this.f4220k + this.f4218i;
    }

    @Override // com.google.protobuf.s
    public final boolean e() {
        return this.f4218i == this.f4216g && !P(1);
    }

    @Override // com.google.protobuf.s
    public final void i(int i10) {
        this.f4221l = i10;
        M();
    }

    @Override // com.google.protobuf.s
    public final int j(int i10) throws a1 {
        if (i10 < 0) {
            throw a1.f();
        }
        int i11 = this.f4220k + this.f4218i + i10;
        int i12 = this.f4221l;
        if (i11 > i12) {
            throw a1.h();
        }
        this.f4221l = i11;
        M();
        return i12;
    }

    @Override // com.google.protobuf.s
    public final boolean k() {
        return K() != 0;
    }

    @Override // com.google.protobuf.s
    public final m l() throws IOException {
        int iJ = J();
        int i10 = this.f4216g;
        int i11 = this.f4218i;
        int i12 = i10 - i11;
        byte[] bArr = this.f4215f;
        if (iJ <= i12 && iJ > 0) {
            m mVarO = n.o(bArr, i11, iJ);
            this.f4218i += iJ;
            return mVarO;
        }
        if (iJ == 0) {
            return n.f4181b;
        }
        byte[] bArrF = F(iJ);
        if (bArrF != null) {
            return n.o(bArrF, 0, bArrF.length);
        }
        int i13 = this.f4218i;
        int i14 = this.f4216g;
        int length = i14 - i13;
        this.f4220k += i14;
        this.f4218i = 0;
        this.f4216g = 0;
        ArrayList<byte[]> arrayListG = G(iJ - length);
        byte[] bArr2 = new byte[iJ];
        System.arraycopy(bArr, i13, bArr2, 0, length);
        for (byte[] bArr3 : arrayListG) {
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        m mVar = n.f4181b;
        return new m(bArr2);
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
        byte[] bArr = this.f4215f;
        if (iJ > 0) {
            int i10 = this.f4216g;
            int i11 = this.f4218i;
            if (iJ <= i10 - i11) {
                String str = new String(bArr, i11, iJ, y0.f4276a);
                this.f4218i += iJ;
                return str;
            }
        }
        if (iJ == 0) {
            return "";
        }
        if (iJ > this.f4216g) {
            return new String(E(iJ), y0.f4276a);
        }
        N(iJ);
        String str2 = new String(bArr, this.f4218i, iJ, y0.f4276a);
        this.f4218i += iJ;
        return str2;
    }

    @Override // com.google.protobuf.s
    public final String z() throws IOException {
        int iJ = J();
        int i10 = this.f4218i;
        int i11 = this.f4216g;
        int i12 = i11 - i10;
        byte[] bArrE = this.f4215f;
        if (iJ <= i12 && iJ > 0) {
            this.f4218i = i10 + iJ;
        } else {
            if (iJ == 0) {
                return "";
            }
            i10 = 0;
            if (iJ <= i11) {
                N(iJ);
                this.f4218i = iJ;
            } else {
                bArrE = E(iJ);
            }
        }
        return c3.f4086a.T(bArrE, i10, iJ);
    }
}
