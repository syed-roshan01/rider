package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class h2 extends n {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int[] f4122p = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4123d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n f4124e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n f4125f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f4126n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f4127o;

    public h2(n nVar, n nVar2) {
        this.f4124e = nVar;
        this.f4125f = nVar2;
        int size = nVar.size();
        this.f4126n = size;
        this.f4123d = nVar2.size() + size;
        this.f4127o = Math.max(nVar.q(), nVar2.q()) + 1;
    }

    public static int D(int i10) {
        if (i10 >= 47) {
            return Integer.MAX_VALUE;
        }
        return f4122p[i10];
    }

    @Override // com.google.protobuf.n
    public final String A(Charset charset) {
        return new String(z(), charset);
    }

    @Override // com.google.protobuf.n
    public final void C(n2 n2Var) {
        this.f4124e.C(n2Var);
        this.f4125f.C(n2Var);
    }

    @Override // com.google.protobuf.n
    public final ByteBuffer e() {
        return ByteBuffer.wrap(z()).asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.n
    public final boolean equals(Object obj) {
        l lVar;
        if (obj == this) {
            return true;
        }
        int i10 = 0;
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        int size = nVar.size();
        int i11 = this.f4123d;
        if (i11 != size) {
            return false;
        }
        if (i11 == 0) {
            return true;
        }
        int i12 = this.f4183a;
        int i13 = nVar.f4183a;
        if (i12 != 0 && i13 != 0 && i12 != i13) {
            return false;
        }
        k6.u uVar = new k6.u(this, i10);
        l lVar2 = (l) uVar.next();
        k6.u uVar2 = new k6.u(nVar, i10);
        l lVar3 = (l) uVar2.next();
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            int size2 = lVar2.size() - i14;
            int size3 = lVar3.size() - i15;
            int iMin = Math.min(size2, size3);
            if (!(i14 == 0 ? lVar2.D(lVar3, i15, iMin) : lVar3.D(lVar2, i14, iMin))) {
                return false;
            }
            i16 += iMin;
            if (i16 >= i11) {
                if (i16 == i11) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == size2) {
                lVar = (l) uVar.next();
                i14 = 0;
            } else {
                i14 += iMin;
            }
            if (iMin == size3) {
                lVar2 = lVar2;
                lVar2 = lVar;
                lVar3 = (l) uVar2.next();
                i15 = 0;
            } else {
                lVar2 = lVar2;
                lVar2 = lVar;
                i15 += iMin;
            }
        }
    }

    @Override // com.google.protobuf.n
    public final byte i(int i10) {
        n.k(i10, this.f4123d);
        return r(i10);
    }

    @Override // com.google.protobuf.n, java.lang.Iterable
    public final Iterator iterator() {
        return new g2(this);
    }

    @Override // com.google.protobuf.n
    public final void p(int i10, byte[] bArr, int i11, int i12) {
        int i13 = i10 + i12;
        n nVar = this.f4124e;
        int i14 = this.f4126n;
        if (i13 <= i14) {
            nVar.p(i10, bArr, i11, i12);
            return;
        }
        n nVar2 = this.f4125f;
        if (i10 >= i14) {
            nVar2.p(i10 - i14, bArr, i11, i12);
            return;
        }
        int i15 = i14 - i10;
        nVar.p(i10, bArr, i11, i15);
        nVar2.p(0, bArr, i11 + i15, i12 - i15);
    }

    @Override // com.google.protobuf.n
    public final int q() {
        return this.f4127o;
    }

    @Override // com.google.protobuf.n
    public final byte r(int i10) {
        int i11 = this.f4126n;
        return i10 < i11 ? this.f4124e.r(i10) : this.f4125f.r(i10 - i11);
    }

    @Override // com.google.protobuf.n
    public final boolean s() {
        return this.f4123d >= D(this.f4127o);
    }

    @Override // com.google.protobuf.n
    public final int size() {
        return this.f4123d;
    }

    @Override // com.google.protobuf.n
    public final boolean t() {
        int iX = this.f4124e.x(0, 0, this.f4126n);
        n nVar = this.f4125f;
        return nVar.x(iX, 0, nVar.size()) == 0;
    }

    @Override // com.google.protobuf.n
    /* JADX INFO: renamed from: u */
    public final i iterator() {
        return new g2(this);
    }

    @Override // com.google.protobuf.n
    public final s v() {
        ArrayList<ByteBuffer> arrayList = new ArrayList();
        k6.u uVar = new k6.u(this, 0);
        while (uVar.hasNext()) {
            arrayList.add(uVar.b().e());
        }
        int i10 = 0;
        int iRemaining = 0;
        for (ByteBuffer byteBuffer : arrayList) {
            iRemaining += byteBuffer.remaining();
            i10 = byteBuffer.hasArray() ? i10 | 1 : byteBuffer.isDirect() ? i10 | 2 : i10 | 4;
        }
        if (i10 == 2) {
            return new p(arrayList, iRemaining);
        }
        b1 b1Var = new b1();
        b1Var.f4063a = arrayList.iterator();
        b1Var.f4065c = 0;
        for (ByteBuffer byteBuffer2 : arrayList) {
            b1Var.f4065c++;
        }
        b1Var.f4066d = -1;
        if (!b1Var.a()) {
            b1Var.f4064b = y0.f4278c;
            b1Var.f4066d = 0;
            b1Var.f4067e = 0;
            b1Var.f4071p = 0L;
        }
        return s.g(b1Var);
    }

    @Override // com.google.protobuf.n
    public final int w(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        n nVar = this.f4124e;
        int i14 = this.f4126n;
        if (i13 <= i14) {
            return nVar.w(i10, i11, i12);
        }
        n nVar2 = this.f4125f;
        if (i11 >= i14) {
            return nVar2.w(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return nVar2.w(nVar.w(i10, i11, i15), 0, i12 - i15);
    }

    @Override // com.google.protobuf.n
    public final int x(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        n nVar = this.f4124e;
        int i14 = this.f4126n;
        if (i13 <= i14) {
            return nVar.x(i10, i11, i12);
        }
        n nVar2 = this.f4125f;
        if (i11 >= i14) {
            return nVar2.x(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return nVar2.x(nVar.x(i10, i11, i15), 0, i12 - i15);
    }

    @Override // com.google.protobuf.n
    public final n y(int i10, int i11) {
        int i12 = this.f4123d;
        int iN = n.n(i10, i11, i12);
        if (iN == 0) {
            return n.f4181b;
        }
        if (iN == i12) {
            return this;
        }
        n nVar = this.f4124e;
        int i13 = this.f4126n;
        if (i11 <= i13) {
            return nVar.y(i10, i11);
        }
        n nVar2 = this.f4125f;
        return i10 >= i13 ? nVar2.y(i10 - i13, i11 - i13) : new h2(nVar.y(i10, nVar.size()), nVar2.y(0, i11 - i13));
    }
}
