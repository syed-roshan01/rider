package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class n extends o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InputStream f3588e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f3589f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f3590g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f3591h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f3592i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f3593j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f3594k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f3595l = Integer.MAX_VALUE;

    public n(InputStream inputStream) {
        Charset charset = f0.f3534a;
        if (inputStream == null) {
            throw new NullPointerException("input");
        }
        this.f3588e = inputStream;
        this.f3589f = new byte[4096];
        this.f3590g = 0;
        this.f3592i = 0;
        this.f3594k = 0;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o
    public final boolean A(int i10) throws h0 {
        int iX;
        int i11 = i10 & 7;
        int i12 = 0;
        if (i11 == 0) {
            int i13 = this.f3590g - this.f3592i;
            byte[] bArr = this.f3589f;
            if (i13 >= 10) {
                while (i12 < 10) {
                    int i14 = this.f3592i;
                    this.f3592i = i14 + 1;
                    if (bArr[i14] < 0) {
                        i12++;
                    }
                }
                throw h0.d();
            }
            while (i12 < 10) {
                if (this.f3592i == this.f3590g) {
                    K(1);
                }
                int i15 = this.f3592i;
                this.f3592i = i15 + 1;
                if (bArr[i15] < 0) {
                    i12++;
                }
            }
            throw h0.d();
            return true;
        }
        if (i11 == 1) {
            L(8);
            return true;
        }
        if (i11 == 2) {
            L(G());
            return true;
        }
        if (i11 != 3) {
            if (i11 == 4) {
                return false;
            }
            if (i11 != 5) {
                throw h0.c();
            }
            L(4);
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

    public final byte[] B(int i10) throws IOException {
        byte[] bArrC = C(i10);
        if (bArrC != null) {
            return bArrC;
        }
        int i11 = this.f3592i;
        int i12 = this.f3590g;
        int length = i12 - i11;
        this.f3594k += i12;
        this.f3592i = 0;
        this.f3590g = 0;
        ArrayList<byte[]> arrayListD = D(i10 - length);
        byte[] bArr = new byte[i10];
        System.arraycopy(this.f3589f, i11, bArr, 0, length);
        for (byte[] bArr2 : arrayListD) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    public final byte[] C(int i10) throws IOException {
        if (i10 == 0) {
            return f0.f3535b;
        }
        if (i10 < 0) {
            throw h0.e();
        }
        int i11 = this.f3594k;
        int i12 = this.f3592i;
        int i13 = i11 + i12 + i10;
        if (i13 - this.f3600c > 0) {
            throw new h0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i14 = this.f3595l;
        if (i13 > i14) {
            L((i14 - i11) - i12);
            throw h0.g();
        }
        int i15 = this.f3590g - i12;
        int i16 = i10 - i15;
        InputStream inputStream = this.f3588e;
        if (i16 >= 4096) {
            try {
                if (i16 > inputStream.available()) {
                    return null;
                }
            } catch (h0 e4) {
                e4.f3542a = true;
                throw e4;
            }
        }
        byte[] bArr = new byte[i10];
        System.arraycopy(this.f3589f, this.f3592i, bArr, 0, i15);
        this.f3594k += this.f3590g;
        this.f3592i = 0;
        this.f3590g = 0;
        while (i15 < i10) {
            try {
                int i17 = inputStream.read(bArr, i15, i10 - i15);
                if (i17 == -1) {
                    throw h0.g();
                }
                this.f3594k += i17;
                i15 += i17;
            } catch (h0 e10) {
                e10.f3542a = true;
                throw e10;
            }
        }
        return bArr;
    }

    public final ArrayList D(int i10) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i10 > 0) {
            int iMin = Math.min(i10, 4096);
            byte[] bArr = new byte[iMin];
            int i11 = 0;
            while (i11 < iMin) {
                int i12 = this.f3588e.read(bArr, i11, iMin - i11);
                if (i12 == -1) {
                    throw h0.g();
                }
                this.f3594k += i12;
                i11 += i12;
            }
            i10 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int E() throws h0 {
        int i10 = this.f3592i;
        if (this.f3590g - i10 < 4) {
            K(4);
            i10 = this.f3592i;
        }
        this.f3592i = i10 + 4;
        byte[] bArr = this.f3589f;
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public final long F() throws h0 {
        int i10 = this.f3592i;
        if (this.f3590g - i10 < 8) {
            K(8);
            i10 = this.f3592i;
        }
        this.f3592i = i10 + 8;
        byte[] bArr = this.f3589f;
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }

    public final int G() {
        int i10;
        int i11 = this.f3592i;
        int i12 = this.f3590g;
        if (i12 != i11) {
            int i13 = i11 + 1;
            byte[] bArr = this.f3589f;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.f3592i = i13;
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
                this.f3592i = i14;
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
        int i10 = this.f3592i;
        int i11 = this.f3590g;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f3589f;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f3592i = i12;
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
                this.f3592i = i13;
                return j10;
            }
        }
        return I();
    }

    public final long I() throws h0 {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            if (this.f3592i == this.f3590g) {
                K(1);
            }
            int i11 = this.f3592i;
            this.f3592i = i11 + 1;
            byte b10 = this.f3589f[i11];
            j10 |= ((long) (b10 & 127)) << i10;
            if ((b10 & 128) == 0) {
                return j10;
            }
        }
        throw h0.d();
    }

    public final void J() {
        int i10 = this.f3590g + this.f3591h;
        this.f3590g = i10;
        int i11 = this.f3594k + i10;
        int i12 = this.f3595l;
        if (i11 <= i12) {
            this.f3591h = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f3591h = i13;
        this.f3590g = i10 - i13;
    }

    public final void K(int i10) throws h0 {
        if (M(i10)) {
            return;
        }
        if (i10 <= (this.f3600c - this.f3594k) - this.f3592i) {
            throw h0.g();
        }
        throw new h0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final void L(int i10) throws h0 {
        int i11 = this.f3590g;
        int i12 = this.f3592i;
        if (i10 <= i11 - i12 && i10 >= 0) {
            this.f3592i = i12 + i10;
            return;
        }
        InputStream inputStream = this.f3588e;
        if (i10 < 0) {
            throw h0.e();
        }
        int i13 = this.f3594k;
        int i14 = i13 + i12;
        int i15 = i14 + i10;
        int i16 = this.f3595l;
        if (i15 > i16) {
            L((i16 - i13) - i12);
            throw h0.g();
        }
        this.f3594k = i14;
        int i17 = i11 - i12;
        this.f3590g = 0;
        this.f3592i = 0;
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
                } catch (h0 e4) {
                    e4.f3542a = true;
                    throw e4;
                }
            } catch (Throwable th) {
                this.f3594k += i17;
                J();
                throw th;
            }
        }
        this.f3594k += i17;
        J();
        if (i17 >= i10) {
            return;
        }
        int i18 = this.f3590g;
        int i19 = i18 - this.f3592i;
        this.f3592i = i18;
        K(1);
        while (true) {
            int i20 = i10 - i19;
            int i21 = this.f3590g;
            if (i20 <= i21) {
                this.f3592i = i20;
                return;
            } else {
                i19 += i21;
                this.f3592i = i21;
                K(1);
            }
        }
    }

    public final boolean M(int i10) throws IOException {
        int i11 = this.f3592i;
        int i12 = i11 + i10;
        int i13 = this.f3590g;
        if (i12 <= i13) {
            throw new IllegalStateException(l.q.h("refillBuffer() called when ", i10, " bytes were already available in buffer"));
        }
        int i14 = this.f3594k;
        int i15 = this.f3600c;
        if (i10 > (i15 - i14) - i11 || i14 + i11 + i10 > this.f3595l) {
            return false;
        }
        byte[] bArr = this.f3589f;
        if (i11 > 0) {
            if (i13 > i11) {
                System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
            }
            this.f3594k += i11;
            this.f3590g -= i11;
            this.f3592i = 0;
        }
        int i16 = this.f3590g;
        int iMin = Math.min(bArr.length - i16, (i15 - this.f3594k) - i16);
        InputStream inputStream = this.f3588e;
        try {
            int i17 = inputStream.read(bArr, i16, iMin);
            if (i17 == 0 || i17 < -1 || i17 > bArr.length) {
                throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + i17 + "\nThe InputStream implementation is buggy.");
            }
            if (i17 <= 0) {
                return false;
            }
            this.f3590g += i17;
            J();
            if (this.f3590g >= i10) {
                return true;
            }
            return M(i10);
        } catch (h0 e4) {
            e4.f3542a = true;
            throw e4;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o
    public final void a(int i10) throws h0 {
        if (this.f3593j != i10) {
            throw new h0("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o
    public final int d() {
        return this.f3594k + this.f3592i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o
    public final boolean e() {
        return this.f3592i == this.f3590g && !M(1);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o
    public final void g(int i10) {
        this.f3595l = i10;
        J();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o
    public final int h(int i10) throws h0 {
        if (i10 < 0) {
            throw h0.e();
        }
        int i11 = this.f3594k + this.f3592i + i10;
        int i12 = this.f3595l;
        if (i11 > i12) {
            throw h0.g();
        }
        this.f3595l = i11;
        J();
        return i12;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o
    public final boolean i() {
        return H() != 0;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o
    public final k j() throws IOException {
        int iG = G();
        int i10 = this.f3590g;
        int i11 = this.f3592i;
        int i12 = i10 - i11;
        byte[] bArr = this.f3589f;
        if (iG <= i12 && iG > 0) {
            k kVarI = l.i(bArr, i11, iG);
            this.f3592i += iG;
            return kVarI;
        }
        if (iG == 0) {
            return l.f3571b;
        }
        byte[] bArrC = C(iG);
        if (bArrC != null) {
            return l.i(bArrC, 0, bArrC.length);
        }
        int i13 = this.f3592i;
        int i14 = this.f3590g;
        int length = i14 - i13;
        this.f3594k += i14;
        this.f3592i = 0;
        this.f3590g = 0;
        ArrayList<byte[]> arrayListD = D(iG - length);
        byte[] bArr2 = new byte[iG];
        System.arraycopy(bArr, i13, bArr2, 0, length);
        for (byte[] bArr3 : arrayListD) {
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        k kVar = l.f3571b;
        return new k(bArr2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o
    public final double k() {
        return Double.longBitsToDouble(F());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o
    public final int l() {
        return G();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o
    public final int m() {
        return E();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o
    public final long n() {
        return F();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o
    public final float o() {
        return Float.intBitsToFloat(E());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o
    public final int p() {
        return G();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o
    public final long q() {
        return H();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o
    public final int r() {
        return E();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o
    public final long s() {
        return F();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o
    public final int t() {
        return o.b(G());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o
    public final long u() {
        return o.c(H());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o
    public final String v() throws h0 {
        int iG = G();
        byte[] bArr = this.f3589f;
        if (iG > 0) {
            int i10 = this.f3590g;
            int i11 = this.f3592i;
            if (iG <= i10 - i11) {
                String str = new String(bArr, i11, iG, f0.f3534a);
                this.f3592i += iG;
                return str;
            }
        }
        if (iG == 0) {
            return "";
        }
        if (iG > this.f3590g) {
            return new String(B(iG), f0.f3534a);
        }
        K(iG);
        String str2 = new String(bArr, this.f3592i, iG, f0.f3534a);
        this.f3592i += iG;
        return str2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o
    public final String w() throws IOException {
        int iG = G();
        int i10 = this.f3592i;
        int i11 = this.f3590g;
        int i12 = i11 - i10;
        byte[] bArrB = this.f3589f;
        if (iG <= i12 && iG > 0) {
            this.f3592i = i10 + iG;
        } else {
            if (iG == 0) {
                return "";
            }
            i10 = 0;
            if (iG <= i11) {
                K(iG);
                this.f3592i = iG;
            } else {
                bArrB = B(iG);
            }
        }
        return z1.f3643a.r0(bArrB, i10, iG);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o
    public final int x() throws h0 {
        if (e()) {
            this.f3593j = 0;
            return 0;
        }
        int iG = G();
        this.f3593j = iG;
        if ((iG >>> 3) != 0) {
            return iG;
        }
        throw h0.a();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o
    public final int y() {
        return G();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o
    public final long z() {
        return H();
    }
}
