package ja;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes.dex */
public final class d0 extends j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient byte[][] f8528e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int[] f8529f;

    public d0(byte[][] bArr, int[] iArr) {
        super(j.f8539d.f8540a);
        this.f8528e = bArr;
        this.f8529f = iArr;
    }

    @Override // ja.j
    public final String a() {
        throw null;
    }

    @Override // ja.j
    public final j c(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.f8528e;
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int[] iArr = this.f8529f;
            int i12 = iArr[length + i10];
            int i13 = iArr[i10];
            messageDigest.update(bArr[i10], i12, i13 - i11);
            i10++;
            i11 = i13;
        }
        byte[] bArrDigest = messageDigest.digest();
        d7.a.j(bArrDigest);
        return new j(bArrDigest);
    }

    @Override // ja.j
    public final int d() {
        return this.f8529f[this.f8528e.length - 1];
    }

    @Override // ja.j
    public final String e() {
        return v().e();
    }

    @Override // ja.j
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (jVar.d() == d() && m(0, jVar, d())) {
                return true;
            }
        }
        return false;
    }

    @Override // ja.j
    public final int f(int i10, byte[] bArr) {
        d7.a.m(bArr, "other");
        return v().f(i10, bArr);
    }

    @Override // ja.j
    public final byte[] h() {
        return s();
    }

    @Override // ja.j
    public final int hashCode() {
        int i10 = this.f8541b;
        if (i10 != 0) {
            return i10;
        }
        byte[][] bArr = this.f8528e;
        int length = bArr.length;
        int i11 = 0;
        int i12 = 1;
        int i13 = 0;
        while (i11 < length) {
            int[] iArr = this.f8529f;
            int i14 = iArr[length + i11];
            int i15 = iArr[i11];
            byte[] bArr2 = bArr[i11];
            int i16 = (i15 - i13) + i14;
            while (i14 < i16) {
                i12 = (i12 * 31) + bArr2[i14];
                i14++;
            }
            i11++;
            i13 = i15;
        }
        this.f8541b = i12;
        return i12;
    }

    @Override // ja.j
    public final byte i(int i10) {
        byte[][] bArr = this.f8528e;
        int length = bArr.length - 1;
        int[] iArr = this.f8529f;
        o7.d0.m(iArr[length], i10, 1L);
        int iM = r9.a.m(this, i10);
        return bArr[iM][(i10 - (iM == 0 ? 0 : iArr[iM - 1])) + iArr[bArr.length + iM]];
    }

    @Override // ja.j
    public final int j(int i10, byte[] bArr) {
        d7.a.m(bArr, "other");
        return v().j(i10, bArr);
    }

    @Override // ja.j
    public final boolean m(int i10, j jVar, int i11) {
        d7.a.m(jVar, "other");
        if (i10 < 0 || i10 > d() - i11) {
            return false;
        }
        int i12 = i11 + i10;
        int iM = r9.a.m(this, i10);
        int i13 = 0;
        while (i10 < i12) {
            int[] iArr = this.f8529f;
            int i14 = iM == 0 ? 0 : iArr[iM - 1];
            int i15 = iArr[iM] - i14;
            byte[][] bArr = this.f8528e;
            int i16 = iArr[bArr.length + iM];
            int iMin = Math.min(i12, i15 + i14) - i10;
            if (!jVar.n(i13, bArr[iM], (i10 - i14) + i16, iMin)) {
                return false;
            }
            i13 += iMin;
            i10 += iMin;
            iM++;
        }
        return true;
    }

    @Override // ja.j
    public final boolean n(int i10, byte[] bArr, int i11, int i12) {
        d7.a.m(bArr, "other");
        if (i10 < 0 || i10 > d() - i12 || i11 < 0 || i11 > bArr.length - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int iM = r9.a.m(this, i10);
        while (i10 < i13) {
            int[] iArr = this.f8529f;
            int i14 = iM == 0 ? 0 : iArr[iM - 1];
            int i15 = iArr[iM] - i14;
            byte[][] bArr2 = this.f8528e;
            int i16 = iArr[bArr2.length + iM];
            int iMin = Math.min(i13, i15 + i14) - i10;
            if (!o7.d0.j(bArr2[iM], (i10 - i14) + i16, bArr, i11, iMin)) {
                return false;
            }
            i11 += iMin;
            i10 += iMin;
            iM++;
        }
        return true;
    }

    @Override // ja.j
    public final j p(int i10, int i11) {
        int iH0 = o7.d0.h0(this, i11);
        if (i10 < 0) {
            throw new IllegalArgumentException(l.q.h("beginIndex=", i10, " < 0").toString());
        }
        if (iH0 > d()) {
            StringBuilder sbQ = a7.a.q("endIndex=", iH0, " > length(");
            sbQ.append(d());
            sbQ.append(')');
            throw new IllegalArgumentException(sbQ.toString().toString());
        }
        int i12 = iH0 - i10;
        if (i12 < 0) {
            throw new IllegalArgumentException(l.q.i("endIndex=", iH0, " < beginIndex=", i10).toString());
        }
        if (i10 == 0 && iH0 == d()) {
            return this;
        }
        if (i10 == iH0) {
            return j.f8539d;
        }
        int iM = r9.a.m(this, i10);
        int iM2 = r9.a.m(this, iH0 - 1);
        byte[][] bArr = this.f8528e;
        byte[][] bArr2 = (byte[][]) b9.b.N(iM, iM2 + 1, bArr);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.f8529f;
        if (iM <= iM2) {
            int i13 = iM;
            int i14 = 0;
            while (true) {
                iArr[i14] = Math.min(iArr2[i13] - i10, i12);
                int i15 = i14 + 1;
                iArr[i14 + bArr2.length] = iArr2[bArr.length + i13];
                if (i13 == iM2) {
                    break;
                }
                i13++;
                i14 = i15;
            }
        }
        int i16 = iM != 0 ? iArr2[iM - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i10 - i16) + iArr[length];
        return new d0(bArr2, iArr);
    }

    @Override // ja.j
    public final j r() {
        return v().r();
    }

    @Override // ja.j
    public final byte[] s() {
        byte[] bArr = new byte[d()];
        byte[][] bArr2 = this.f8528e;
        int length = bArr2.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            int[] iArr = this.f8529f;
            int i13 = iArr[length + i10];
            int i14 = iArr[i10];
            int i15 = i14 - i11;
            b9.b.I(bArr2[i10], i12, bArr, i13, i13 + i15);
            i12 += i15;
            i10++;
            i11 = i14;
        }
        return bArr;
    }

    @Override // ja.j
    public final String toString() {
        return v().toString();
    }

    @Override // ja.j
    public final void u(g gVar, int i10) {
        d7.a.m(gVar, "buffer");
        int iM = r9.a.m(this, 0);
        int i11 = 0;
        while (i11 < i10) {
            int[] iArr = this.f8529f;
            int i12 = iM == 0 ? 0 : iArr[iM - 1];
            int i13 = iArr[iM] - i12;
            byte[][] bArr = this.f8528e;
            int i14 = iArr[bArr.length + iM];
            int iMin = Math.min(i10, i13 + i12) - i11;
            int i15 = (i11 - i12) + i14;
            b0 b0Var = new b0(bArr[iM], i15, i15 + iMin, true);
            b0 b0Var2 = gVar.f8533a;
            if (b0Var2 == null) {
                b0Var.f8513g = b0Var;
                b0Var.f8512f = b0Var;
                gVar.f8533a = b0Var;
            } else {
                b0 b0Var3 = b0Var2.f8513g;
                d7.a.j(b0Var3);
                b0Var3.b(b0Var);
            }
            i11 += iMin;
            iM++;
        }
        gVar.f8534b += (long) i10;
    }

    public final j v() {
        return new j(s());
    }
}
