package com.google.crypto.tink.shaded.protobuf;

import java.util.logging.Level;
import java.util.logging.Logger;
import k6.w4;

/* JADX INFO: loaded from: classes.dex */
public final class p extends f6.a {
    public static final Logger D = Logger.getLogger(p.class.getName());
    public static final boolean E = w1.f3635e;
    public final byte[] A;
    public final int B;
    public int C;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public w4 f3608z;

    public p(byte[] bArr, int i10) {
        if (((bArr.length - i10) | i10) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i10)));
        }
        this.A = bArr;
        this.C = 0;
        this.B = i10;
    }

    public static int A0(int i10) {
        if (i10 >= 0) {
            return K0(i10);
        }
        return 10;
    }

    public static int B0(int i10, long j10) {
        return M0(j10) + I0(i10);
    }

    public static int C0(int i10) {
        return I0(i10) + 4;
    }

    public static int D0(int i10) {
        return I0(i10) + 8;
    }

    public static int E0(int i10, int i11) {
        return K0((i11 >> 31) ^ (i11 << 1)) + I0(i10);
    }

    public static int F0(int i10, long j10) {
        return M0((j10 >> 63) ^ (j10 << 1)) + I0(i10);
    }

    public static int G0(int i10, String str) {
        return H0(str) + I0(i10);
    }

    public static int H0(String str) {
        int length;
        try {
            length = z1.b(str);
        } catch (y1 unused) {
            length = str.getBytes(f0.f3534a).length;
        }
        return K0(length) + length;
    }

    public static int I0(int i10) {
        return K0(i10 << 3);
    }

    public static int J0(int i10, int i11) {
        return K0(i11) + I0(i10);
    }

    public static int K0(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int L0(int i10, long j10) {
        return M0(j10) + I0(i10);
    }

    public static int M0(long j10) {
        int i10;
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if (((-34359738368L) & j10) != 0) {
            j10 >>>= 28;
            i10 = 6;
        } else {
            i10 = 2;
        }
        if (((-2097152) & j10) != 0) {
            i10 += 2;
            j10 >>>= 14;
        }
        return (j10 & (-16384)) != 0 ? i10 + 1 : i10;
    }

    public static int r0(int i10) {
        return I0(i10) + 1;
    }

    public static int s0(int i10, l lVar) {
        int iI0 = I0(i10);
        int size = lVar.size();
        return K0(size) + size + iI0;
    }

    public static int t0(int i10) {
        return I0(i10) + 8;
    }

    public static int u0(int i10, int i11) {
        return A0(i11) + I0(i10);
    }

    public static int v0(int i10) {
        return I0(i10) + 4;
    }

    public static int w0(int i10) {
        return I0(i10) + 8;
    }

    public static int x0(int i10) {
        return I0(i10) + 4;
    }

    public static int y0(int i10, b bVar, j1 j1Var) {
        return bVar.a(j1Var) + (I0(i10) * 2);
    }

    public static int z0(int i10, int i11) {
        return A0(i11) + I0(i10);
    }

    public final void N0(byte b10) throws q {
        try {
            byte[] bArr = this.A;
            int i10 = this.C;
            this.C = i10 + 1;
            bArr[i10] = b10;
        } catch (IndexOutOfBoundsException e4) {
            throw new q(0, String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.C), Integer.valueOf(this.B), 1), e4);
        }
    }

    public final void O0(byte[] bArr, int i10, int i11) throws q {
        try {
            System.arraycopy(bArr, i10, this.A, this.C, i11);
            this.C += i11;
        } catch (IndexOutOfBoundsException e4) {
            throw new q(0, String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.C), Integer.valueOf(this.B), Integer.valueOf(i11)), e4);
        }
    }

    public final void P0(l lVar) throws q {
        X0(lVar.size());
        k kVar = (k) lVar;
        O0(kVar.f3566d, kVar.p(), kVar.size());
    }

    public final void Q0(int i10, int i11) throws q {
        W0(i10, 5);
        R0(i11);
    }

    public final void R0(int i10) throws q {
        try {
            byte[] bArr = this.A;
            int i11 = this.C;
            bArr[i11] = (byte) (i10 & 255);
            bArr[i11 + 1] = (byte) ((i10 >> 8) & 255);
            bArr[i11 + 2] = (byte) ((i10 >> 16) & 255);
            this.C = i11 + 4;
            bArr[i11 + 3] = (byte) ((i10 >> 24) & 255);
        } catch (IndexOutOfBoundsException e4) {
            throw new q(0, String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.C), Integer.valueOf(this.B), 1), e4);
        }
    }

    public final void S0(int i10, long j10) throws q {
        W0(i10, 1);
        T0(j10);
    }

    public final void T0(long j10) throws q {
        try {
            byte[] bArr = this.A;
            int i10 = this.C;
            bArr[i10] = (byte) (((int) j10) & 255);
            bArr[i10 + 1] = (byte) (((int) (j10 >> 8)) & 255);
            bArr[i10 + 2] = (byte) (((int) (j10 >> 16)) & 255);
            bArr[i10 + 3] = (byte) (((int) (j10 >> 24)) & 255);
            bArr[i10 + 4] = (byte) (((int) (j10 >> 32)) & 255);
            bArr[i10 + 5] = (byte) (((int) (j10 >> 40)) & 255);
            bArr[i10 + 6] = (byte) (((int) (j10 >> 48)) & 255);
            this.C = i10 + 8;
            bArr[i10 + 7] = (byte) (((int) (j10 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e4) {
            throw new q(0, String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.C), Integer.valueOf(this.B), 1), e4);
        }
    }

    public final void U0(int i10) throws q {
        if (i10 >= 0) {
            X0(i10);
        } else {
            Z0(i10);
        }
    }

    public final void V0(String str) throws q {
        int i10 = this.C;
        try {
            int iK0 = K0(str.length() * 3);
            int iK1 = K0(str.length());
            int i11 = this.B;
            byte[] bArr = this.A;
            if (iK1 == iK0) {
                int i12 = i10 + iK1;
                this.C = i12;
                int iS0 = z1.f3643a.s0(str, bArr, i12, i11 - i12);
                this.C = i10;
                X0((iS0 - i10) - iK1);
                this.C = iS0;
            } else {
                X0(z1.b(str));
                int i13 = this.C;
                this.C = z1.f3643a.s0(str, bArr, i13, i11 - i13);
            }
        } catch (y1 e4) {
            this.C = i10;
            D.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e4);
            byte[] bytes = str.getBytes(f0.f3534a);
            try {
                X0(bytes.length);
                O0(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e10) {
                throw new q(e10);
            }
        } catch (IndexOutOfBoundsException e11) {
            throw new q(e11);
        }
    }

    public final void W0(int i10, int i11) throws q {
        X0((i10 << 3) | i11);
    }

    public final void X0(int i10) throws q {
        while (true) {
            int i11 = i10 & (-128);
            byte[] bArr = this.A;
            if (i11 == 0) {
                int i12 = this.C;
                this.C = i12 + 1;
                bArr[i12] = (byte) i10;
                return;
            } else {
                try {
                    int i13 = this.C;
                    this.C = i13 + 1;
                    bArr[i13] = (byte) ((i10 & 127) | 128);
                    i10 >>>= 7;
                } catch (IndexOutOfBoundsException e4) {
                    throw new q(0, String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.C), Integer.valueOf(this.B), 1), e4);
                }
            }
            throw new q(0, String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.C), Integer.valueOf(this.B), 1), e4);
        }
    }

    public final void Y0(int i10, long j10) throws q {
        W0(i10, 0);
        Z0(j10);
    }

    public final void Z0(long j10) throws q {
        boolean z10 = E;
        int i10 = this.B;
        byte[] bArr = this.A;
        if (z10 && i10 - this.C >= 10) {
            while ((j10 & (-128)) != 0) {
                int i11 = this.C;
                this.C = i11 + 1;
                w1.o(bArr, i11, (byte) ((((int) j10) & 127) | 128));
                j10 >>>= 7;
            }
            int i12 = this.C;
            this.C = i12 + 1;
            w1.o(bArr, i12, (byte) j10);
            return;
        }
        while ((j10 & (-128)) != 0) {
            try {
                int i13 = this.C;
                this.C = i13 + 1;
                bArr[i13] = (byte) ((((int) j10) & 127) | 128);
                j10 >>>= 7;
            } catch (IndexOutOfBoundsException e4) {
                throw new q(0, String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.C), Integer.valueOf(i10), 1), e4);
            }
        }
        int i14 = this.C;
        this.C = i14 + 1;
        bArr[i14] = (byte) j10;
    }
}
