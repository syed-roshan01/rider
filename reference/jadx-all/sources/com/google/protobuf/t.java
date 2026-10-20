package com.google.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class t extends v {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f4240f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f4241g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4242h;

    public t(byte[] bArr, int i10, int i11) {
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        int i12 = i10 + i11;
        if ((i10 | i11 | (bArr.length - i12)) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        this.f4240f = bArr;
        this.f4242h = i10;
        this.f4241g = i12;
    }

    @Override // com.google.protobuf.v
    public final void A0(int i10, int i11) throws com.google.crypto.tink.shaded.protobuf.q {
        G0(i10, 0);
        B0(i11);
    }

    @Override // com.google.protobuf.v
    public final void B0(int i10) throws com.google.crypto.tink.shaded.protobuf.q {
        if (i10 >= 0) {
            I0(i10);
        } else {
            K0(i10);
        }
    }

    @Override // com.google.protobuf.v
    public final void C0(int i10, t1 t1Var, i2 i2Var) throws com.google.crypto.tink.shaded.protobuf.q {
        G0(i10, 2);
        I0(((c) t1Var).getSerializedSize(i2Var));
        i2Var.j(t1Var, this.f4250c);
    }

    @Override // com.google.protobuf.v
    public final void D0(t1 t1Var) throws com.google.crypto.tink.shaded.protobuf.q {
        I0(t1Var.getSerializedSize());
        t1Var.writeTo(this);
    }

    @Override // com.google.protobuf.v
    public final void E0(int i10, String str) throws com.google.crypto.tink.shaded.protobuf.q {
        G0(i10, 2);
        F0(str);
    }

    @Override // com.google.protobuf.v
    public final void F0(String str) throws com.google.crypto.tink.shaded.protobuf.q {
        int i10 = this.f4242h;
        try {
            int iM0 = v.m0(str.length() * 3);
            int iM1 = v.m0(str.length());
            byte[] bArr = this.f4240f;
            if (iM1 == iM0) {
                int i11 = i10 + iM1;
                this.f4242h = i11;
                int iV = c3.f4086a.V(str, bArr, i11, q0());
                this.f4242h = i10;
                I0((iV - i10) - iM1);
                this.f4242h = iV;
            } else {
                I0(c3.c(str));
                this.f4242h = c3.f4086a.V(str, bArr, this.f4242h, q0());
            }
        } catch (b3 e4) {
            this.f4242h = i10;
            p0(str, e4);
        } catch (IndexOutOfBoundsException e10) {
            throw new com.google.crypto.tink.shaded.protobuf.q(e10);
        }
    }

    @Override // com.google.protobuf.v
    public final void G0(int i10, int i11) throws com.google.crypto.tink.shaded.protobuf.q {
        I0((i10 << 3) | i11);
    }

    @Override // com.google.protobuf.v
    public final void H0(int i10, int i11) throws com.google.crypto.tink.shaded.protobuf.q {
        G0(i10, 0);
        I0(i11);
    }

    @Override // com.google.protobuf.v
    public final void I0(int i10) throws com.google.crypto.tink.shaded.protobuf.q {
        while (true) {
            int i11 = i10 & (-128);
            byte[] bArr = this.f4240f;
            if (i11 == 0) {
                int i12 = this.f4242h;
                this.f4242h = i12 + 1;
                bArr[i12] = (byte) i10;
                return;
            } else {
                try {
                    int i13 = this.f4242h;
                    this.f4242h = i13 + 1;
                    bArr[i13] = (byte) ((i10 & 127) | 128);
                    i10 >>>= 7;
                } catch (IndexOutOfBoundsException e4) {
                    throw new com.google.crypto.tink.shaded.protobuf.q(1, String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f4242h), Integer.valueOf(this.f4241g), 1), e4);
                }
            }
            throw new com.google.crypto.tink.shaded.protobuf.q(1, String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f4242h), Integer.valueOf(this.f4241g), 1), e4);
        }
    }

    @Override // com.google.protobuf.v
    public final void J0(int i10, long j10) throws com.google.crypto.tink.shaded.protobuf.q {
        G0(i10, 0);
        K0(j10);
    }

    @Override // com.google.protobuf.v
    public final void K0(long j10) throws com.google.crypto.tink.shaded.protobuf.q {
        boolean z10 = v.f4249e;
        byte[] bArr = this.f4240f;
        if (z10 && q0() >= 10) {
            while ((j10 & (-128)) != 0) {
                int i10 = this.f4242h;
                this.f4242h = i10 + 1;
                z2.o(bArr, i10, (byte) ((((int) j10) & 127) | 128));
                j10 >>>= 7;
            }
            int i11 = this.f4242h;
            this.f4242h = i11 + 1;
            z2.o(bArr, i11, (byte) j10);
            return;
        }
        while ((j10 & (-128)) != 0) {
            try {
                int i12 = this.f4242h;
                this.f4242h = i12 + 1;
                bArr[i12] = (byte) ((((int) j10) & 127) | 128);
                j10 >>>= 7;
            } catch (IndexOutOfBoundsException e4) {
                throw new com.google.crypto.tink.shaded.protobuf.q(1, String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f4242h), Integer.valueOf(this.f4241g), 1), e4);
            }
        }
        int i13 = this.f4242h;
        this.f4242h = i13 + 1;
        bArr[i13] = (byte) j10;
    }

    public final void L0(byte[] bArr, int i10, int i11) throws com.google.crypto.tink.shaded.protobuf.q {
        try {
            System.arraycopy(bArr, i10, this.f4240f, this.f4242h, i11);
            this.f4242h += i11;
        } catch (IndexOutOfBoundsException e4) {
            throw new com.google.crypto.tink.shaded.protobuf.q(1, String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f4242h), Integer.valueOf(this.f4241g), Integer.valueOf(i11)), e4);
        }
    }

    @Override // com.google.protobuf.n2
    public final void S(byte[] bArr, int i10, int i11) throws com.google.crypto.tink.shaded.protobuf.q {
        L0(bArr, i10, i11);
    }

    @Override // com.google.protobuf.v
    public final int q0() {
        return this.f4241g - this.f4242h;
    }

    @Override // com.google.protobuf.v
    public final void r0(byte b10) throws com.google.crypto.tink.shaded.protobuf.q {
        try {
            byte[] bArr = this.f4240f;
            int i10 = this.f4242h;
            this.f4242h = i10 + 1;
            bArr[i10] = b10;
        } catch (IndexOutOfBoundsException e4) {
            throw new com.google.crypto.tink.shaded.protobuf.q(1, String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f4242h), Integer.valueOf(this.f4241g), 1), e4);
        }
    }

    @Override // com.google.protobuf.v
    public final void s0(int i10, boolean z10) throws com.google.crypto.tink.shaded.protobuf.q {
        G0(i10, 0);
        r0(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.protobuf.v
    public final void t0(byte[] bArr, int i10) throws com.google.crypto.tink.shaded.protobuf.q {
        I0(i10);
        L0(bArr, 0, i10);
    }

    @Override // com.google.protobuf.v
    public final void u0(int i10, n nVar) throws com.google.crypto.tink.shaded.protobuf.q {
        G0(i10, 2);
        v0(nVar);
    }

    @Override // com.google.protobuf.v
    public final void v0(n nVar) throws com.google.crypto.tink.shaded.protobuf.q {
        I0(nVar.size());
        nVar.C(this);
    }

    @Override // com.google.protobuf.v
    public final void w0(int i10, int i11) throws com.google.crypto.tink.shaded.protobuf.q {
        G0(i10, 5);
        x0(i11);
    }

    @Override // com.google.protobuf.v
    public final void x0(int i10) throws com.google.crypto.tink.shaded.protobuf.q {
        try {
            byte[] bArr = this.f4240f;
            int i11 = this.f4242h;
            bArr[i11] = (byte) (i10 & 255);
            bArr[i11 + 1] = (byte) ((i10 >> 8) & 255);
            bArr[i11 + 2] = (byte) ((i10 >> 16) & 255);
            this.f4242h = i11 + 4;
            bArr[i11 + 3] = (byte) ((i10 >> 24) & 255);
        } catch (IndexOutOfBoundsException e4) {
            throw new com.google.crypto.tink.shaded.protobuf.q(1, String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f4242h), Integer.valueOf(this.f4241g), 1), e4);
        }
    }

    @Override // com.google.protobuf.v
    public final void y0(int i10, long j10) throws com.google.crypto.tink.shaded.protobuf.q {
        G0(i10, 1);
        z0(j10);
    }

    @Override // com.google.protobuf.v
    public final void z0(long j10) throws com.google.crypto.tink.shaded.protobuf.q {
        try {
            byte[] bArr = this.f4240f;
            int i10 = this.f4242h;
            bArr[i10] = (byte) (((int) j10) & 255);
            bArr[i10 + 1] = (byte) (((int) (j10 >> 8)) & 255);
            bArr[i10 + 2] = (byte) (((int) (j10 >> 16)) & 255);
            bArr[i10 + 3] = (byte) (((int) (j10 >> 24)) & 255);
            bArr[i10 + 4] = (byte) (((int) (j10 >> 32)) & 255);
            bArr[i10 + 5] = (byte) (((int) (j10 >> 40)) & 255);
            bArr[i10 + 6] = (byte) (((int) (j10 >> 48)) & 255);
            this.f4242h = i10 + 8;
            bArr[i10 + 7] = (byte) (((int) (j10 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e4) {
            throw new com.google.crypto.tink.shaded.protobuf.q(1, String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f4242h), Integer.valueOf(this.f4241g), 1), e4);
        }
    }
}
