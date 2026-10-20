package com.google.protobuf;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class u extends v {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f4243f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f4244g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4245h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final OutputStream f4246i;

    public u(OutputStream outputStream, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int iMax = Math.max(i10, 20);
        this.f4243f = new byte[iMax];
        this.f4244g = iMax;
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.f4246i = outputStream;
    }

    @Override // com.google.protobuf.v
    public final void A0(int i10, int i11) {
        R0(20);
        N0(i10, 0);
        if (i11 >= 0) {
            O0(i11);
        } else {
            P0(i11);
        }
    }

    @Override // com.google.protobuf.v
    public final void B0(int i10) {
        if (i10 >= 0) {
            I0(i10);
        } else {
            K0(i10);
        }
    }

    @Override // com.google.protobuf.v
    public final void C0(int i10, t1 t1Var, i2 i2Var) {
        G0(i10, 2);
        I0(((c) t1Var).getSerializedSize(i2Var));
        i2Var.j(t1Var, this.f4250c);
    }

    @Override // com.google.protobuf.v
    public final void D0(t1 t1Var) {
        I0(t1Var.getSerializedSize());
        t1Var.writeTo(this);
    }

    @Override // com.google.protobuf.v
    public final void E0(int i10, String str) throws IOException {
        G0(i10, 2);
        F0(str);
    }

    @Override // com.google.protobuf.v
    public final void F0(String str) throws IOException {
        try {
            int length = str.length() * 3;
            int iM0 = v.m0(length);
            int i10 = iM0 + length;
            int i11 = this.f4244g;
            if (i10 > i11) {
                byte[] bArr = new byte[length];
                int iV = c3.f4086a.V(str, bArr, 0, length);
                I0(iV);
                S0(bArr, 0, iV);
                return;
            }
            if (i10 > i11 - this.f4245h) {
                Q0();
            }
            int iM1 = v.m0(str.length());
            int i12 = this.f4245h;
            byte[] bArr2 = this.f4243f;
            try {
                if (iM1 == iM0) {
                    int i13 = i12 + iM1;
                    this.f4245h = i13;
                    int iV2 = c3.f4086a.V(str, bArr2, i13, i11 - i13);
                    this.f4245h = i12;
                    O0((iV2 - i12) - iM1);
                    this.f4245h = iV2;
                } else {
                    int iC = c3.c(str);
                    O0(iC);
                    this.f4245h = c3.f4086a.V(str, bArr2, this.f4245h, iC);
                }
            } catch (b3 e4) {
                this.f4245h = i12;
                throw e4;
            } catch (ArrayIndexOutOfBoundsException e10) {
                throw new com.google.crypto.tink.shaded.protobuf.q(e10);
            }
        } catch (b3 e11) {
            p0(str, e11);
        }
    }

    @Override // com.google.protobuf.v
    public final void G0(int i10, int i11) {
        I0((i10 << 3) | i11);
    }

    @Override // com.google.protobuf.v
    public final void H0(int i10, int i11) {
        R0(20);
        N0(i10, 0);
        O0(i11);
    }

    @Override // com.google.protobuf.v
    public final void I0(int i10) {
        R0(5);
        O0(i10);
    }

    @Override // com.google.protobuf.v
    public final void J0(int i10, long j10) {
        R0(20);
        N0(i10, 0);
        P0(j10);
    }

    @Override // com.google.protobuf.v
    public final void K0(long j10) {
        R0(10);
        P0(j10);
    }

    public final void L0(int i10) {
        int i11 = this.f4245h;
        byte[] bArr = this.f4243f;
        bArr[i11] = (byte) (i10 & 255);
        bArr[i11 + 1] = (byte) ((i10 >> 8) & 255);
        bArr[i11 + 2] = (byte) ((i10 >> 16) & 255);
        this.f4245h = i11 + 4;
        bArr[i11 + 3] = (byte) ((i10 >> 24) & 255);
    }

    public final void M0(long j10) {
        int i10 = this.f4245h;
        byte[] bArr = this.f4243f;
        bArr[i10] = (byte) (j10 & 255);
        bArr[i10 + 1] = (byte) ((j10 >> 8) & 255);
        bArr[i10 + 2] = (byte) ((j10 >> 16) & 255);
        bArr[i10 + 3] = (byte) (255 & (j10 >> 24));
        bArr[i10 + 4] = (byte) (((int) (j10 >> 32)) & 255);
        bArr[i10 + 5] = (byte) (((int) (j10 >> 40)) & 255);
        bArr[i10 + 6] = (byte) (((int) (j10 >> 48)) & 255);
        this.f4245h = i10 + 8;
        bArr[i10 + 7] = (byte) (((int) (j10 >> 56)) & 255);
    }

    public final void N0(int i10, int i11) {
        O0((i10 << 3) | i11);
    }

    public final void O0(int i10) {
        boolean z10 = v.f4249e;
        byte[] bArr = this.f4243f;
        if (z10) {
            while ((i10 & (-128)) != 0) {
                int i11 = this.f4245h;
                this.f4245h = i11 + 1;
                z2.o(bArr, i11, (byte) ((i10 & 127) | 128));
                i10 >>>= 7;
            }
            int i12 = this.f4245h;
            this.f4245h = i12 + 1;
            z2.o(bArr, i12, (byte) i10);
            return;
        }
        while ((i10 & (-128)) != 0) {
            int i13 = this.f4245h;
            this.f4245h = i13 + 1;
            bArr[i13] = (byte) ((i10 & 127) | 128);
            i10 >>>= 7;
        }
        int i14 = this.f4245h;
        this.f4245h = i14 + 1;
        bArr[i14] = (byte) i10;
    }

    public final void P0(long j10) {
        boolean z10 = v.f4249e;
        byte[] bArr = this.f4243f;
        if (z10) {
            while ((j10 & (-128)) != 0) {
                int i10 = this.f4245h;
                this.f4245h = i10 + 1;
                z2.o(bArr, i10, (byte) ((((int) j10) & 127) | 128));
                j10 >>>= 7;
            }
            int i11 = this.f4245h;
            this.f4245h = i11 + 1;
            z2.o(bArr, i11, (byte) j10);
            return;
        }
        while ((j10 & (-128)) != 0) {
            int i12 = this.f4245h;
            this.f4245h = i12 + 1;
            bArr[i12] = (byte) ((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        int i13 = this.f4245h;
        this.f4245h = i13 + 1;
        bArr[i13] = (byte) j10;
    }

    public final void Q0() {
        this.f4246i.write(this.f4243f, 0, this.f4245h);
        this.f4245h = 0;
    }

    public final void R0(int i10) {
        if (this.f4244g - this.f4245h < i10) {
            Q0();
        }
    }

    @Override // com.google.protobuf.n2
    public final void S(byte[] bArr, int i10, int i11) throws IOException {
        S0(bArr, i10, i11);
    }

    public final void S0(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f4245h;
        int i13 = this.f4244g;
        int i14 = i13 - i12;
        byte[] bArr2 = this.f4243f;
        if (i14 >= i11) {
            System.arraycopy(bArr, i10, bArr2, i12, i11);
            this.f4245h += i11;
            return;
        }
        System.arraycopy(bArr, i10, bArr2, i12, i14);
        int i15 = i10 + i14;
        int i16 = i11 - i14;
        this.f4245h = i13;
        Q0();
        if (i16 > i13) {
            this.f4246i.write(bArr, i15, i16);
        } else {
            System.arraycopy(bArr, i15, bArr2, 0, i16);
            this.f4245h = i16;
        }
    }

    @Override // com.google.protobuf.v
    public final int q0() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    @Override // com.google.protobuf.v
    public final void r0(byte b10) {
        if (this.f4245h == this.f4244g) {
            Q0();
        }
        int i10 = this.f4245h;
        this.f4245h = i10 + 1;
        this.f4243f[i10] = b10;
    }

    @Override // com.google.protobuf.v
    public final void s0(int i10, boolean z10) {
        R0(11);
        N0(i10, 0);
        byte b10 = z10 ? (byte) 1 : (byte) 0;
        int i11 = this.f4245h;
        this.f4245h = i11 + 1;
        this.f4243f[i11] = b10;
    }

    @Override // com.google.protobuf.v
    public final void t0(byte[] bArr, int i10) throws IOException {
        I0(i10);
        S0(bArr, 0, i10);
    }

    @Override // com.google.protobuf.v
    public final void u0(int i10, n nVar) {
        G0(i10, 2);
        v0(nVar);
    }

    @Override // com.google.protobuf.v
    public final void v0(n nVar) {
        I0(nVar.size());
        nVar.C(this);
    }

    @Override // com.google.protobuf.v
    public final void w0(int i10, int i11) {
        R0(14);
        N0(i10, 5);
        L0(i11);
    }

    @Override // com.google.protobuf.v
    public final void x0(int i10) {
        R0(4);
        L0(i10);
    }

    @Override // com.google.protobuf.v
    public final void y0(int i10, long j10) {
        R0(18);
        N0(i10, 1);
        M0(j10);
    }

    @Override // com.google.protobuf.v
    public final void z0(long j10) {
        R0(8);
        M0(j10);
    }
}
