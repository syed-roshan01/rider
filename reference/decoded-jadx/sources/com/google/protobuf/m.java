package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public class m extends l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f4177d;

    public m(byte[] bArr) {
        bArr.getClass();
        this.f4177d = bArr;
    }

    @Override // com.google.protobuf.n
    public final String A(Charset charset) {
        return new String(this.f4177d, E(), size(), charset);
    }

    @Override // com.google.protobuf.n
    public final void C(n2 n2Var) {
        n2Var.S(this.f4177d, E(), size());
    }

    @Override // com.google.protobuf.l
    public final boolean D(n nVar, int i10, int i11) {
        if (i11 > nVar.size()) {
            throw new IllegalArgumentException("Length too large: " + i11 + size());
        }
        int i12 = i10 + i11;
        if (i12 > nVar.size()) {
            throw new IllegalArgumentException("Ran off end of other: " + i10 + ", " + i11 + ", " + nVar.size());
        }
        if (!(nVar instanceof m)) {
            return nVar.y(i10, i12).equals(y(0, i11));
        }
        m mVar = (m) nVar;
        int iE = E() + i11;
        int iE2 = E();
        int iE3 = mVar.E() + i10;
        while (iE2 < iE) {
            if (this.f4177d[iE2] != mVar.f4177d[iE3]) {
                return false;
            }
            iE2++;
            iE3++;
        }
        return true;
    }

    public int E() {
        return 0;
    }

    @Override // com.google.protobuf.n
    public final ByteBuffer e() {
        return ByteBuffer.wrap(this.f4177d, E(), size()).asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.n
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n) || size() != ((n) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof m)) {
            return obj.equals(this);
        }
        m mVar = (m) obj;
        int i10 = this.f4183a;
        int i11 = mVar.f4183a;
        if (i10 == 0 || i11 == 0 || i10 == i11) {
            return D(mVar, 0, size());
        }
        return false;
    }

    @Override // com.google.protobuf.n
    public byte i(int i10) {
        return this.f4177d[i10];
    }

    @Override // com.google.protobuf.n
    public void p(int i10, byte[] bArr, int i11, int i12) {
        System.arraycopy(this.f4177d, i10, bArr, i11, i12);
    }

    @Override // com.google.protobuf.n
    public byte r(int i10) {
        return this.f4177d[i10];
    }

    @Override // com.google.protobuf.n
    public int size() {
        return this.f4177d.length;
    }

    @Override // com.google.protobuf.n
    public final boolean t() {
        int iE = E();
        return c3.f4086a.W(0, this.f4177d, iE, size() + iE) == 0;
    }

    @Override // com.google.protobuf.n
    public final s v() {
        return s.f(this.f4177d, E(), size(), true);
    }

    @Override // com.google.protobuf.n
    public final int w(int i10, int i11, int i12) {
        int iE = E() + i11;
        Charset charset = y0.f4276a;
        for (int i13 = iE; i13 < iE + i12; i13++) {
            i10 = (i10 * 31) + this.f4177d[i13];
        }
        return i10;
    }

    @Override // com.google.protobuf.n
    public final int x(int i10, int i11, int i12) {
        int iE = E() + i11;
        return c3.f4086a.W(i10, this.f4177d, iE, i12 + iE);
    }

    @Override // com.google.protobuf.n
    public final n y(int i10, int i11) {
        int iN = n.n(i10, i11, size());
        if (iN == 0) {
            return n.f4181b;
        }
        return new k(this.f4177d, E() + i10, iN);
    }
}
