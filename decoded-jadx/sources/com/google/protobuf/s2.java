package com.google.protobuf;

import java.util.Arrays;
import k6.w4;

/* JADX INFO: loaded from: classes.dex */
public final class s2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final s2 f4234f = new s2(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f4236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f4237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4238d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4239e;

    public s2() {
        this(0, new int[8], new Object[8], true);
    }

    public static s2 e(s2 s2Var, s2 s2Var2) {
        int i10 = s2Var.f4235a + s2Var2.f4235a;
        int[] iArrCopyOf = Arrays.copyOf(s2Var.f4236b, i10);
        System.arraycopy(s2Var2.f4236b, 0, iArrCopyOf, s2Var.f4235a, s2Var2.f4235a);
        Object[] objArrCopyOf = Arrays.copyOf(s2Var.f4237c, i10);
        System.arraycopy(s2Var2.f4237c, 0, objArrCopyOf, s2Var.f4235a, s2Var2.f4235a);
        return new s2(i10, iArrCopyOf, objArrCopyOf, true);
    }

    public final void a() {
        if (!this.f4239e) {
            throw new UnsupportedOperationException();
        }
    }

    public final void b(int i10) {
        int[] iArr = this.f4236b;
        if (i10 > iArr.length) {
            int i11 = this.f4235a;
            int i12 = (i11 / 2) + i11;
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f4236b = Arrays.copyOf(iArr, i10);
            this.f4237c = Arrays.copyOf(this.f4237c, i10);
        }
    }

    public final int c() {
        int iN0;
        int i10 = this.f4238d;
        if (i10 != -1) {
            return i10;
        }
        int iC = 0;
        for (int i11 = 0; i11 < this.f4235a; i11++) {
            int i12 = this.f4236b[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 == 0) {
                iN0 = v.n0(i13, ((Long) this.f4237c[i11]).longValue());
            } else if (i14 == 1) {
                ((Long) this.f4237c[i11]).longValue();
                iN0 = v.Y(i13);
            } else if (i14 != 2) {
                if (i14 == 3) {
                    iC = ((s2) this.f4237c[i11]).c() + (v.k0(i13) * 2) + iC;
                } else {
                    if (i14 != 5) {
                        throw new IllegalStateException(a1.d());
                    }
                    ((Integer) this.f4237c[i11]).intValue();
                    iN0 = v.X(i13);
                }
            } else {
                iN0 = v.U(i13, (n) this.f4237c[i11]);
            }
            iC = iN0 + iC;
        }
        this.f4238d = iC;
        return iC;
    }

    public final boolean d(int i10, s sVar) throws z0 {
        int iA;
        a();
        int i11 = i10 >>> 3;
        int i12 = i10 & 7;
        if (i12 == 0) {
            f(i10, Long.valueOf(sVar.s()));
            return true;
        }
        if (i12 == 1) {
            f(i10, Long.valueOf(sVar.p()));
            return true;
        }
        if (i12 == 2) {
            f(i10, sVar.l());
            return true;
        }
        if (i12 != 3) {
            if (i12 == 4) {
                return false;
            }
            if (i12 != 5) {
                throw a1.d();
            }
            f(i10, Integer.valueOf(sVar.o()));
            return true;
        }
        s2 s2Var = new s2();
        do {
            iA = sVar.A();
            if (iA == 0) {
                break;
            }
        } while (s2Var.d(iA, sVar));
        sVar.a((i11 << 3) | 4);
        f(i10, s2Var);
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof s2)) {
            return false;
        }
        s2 s2Var = (s2) obj;
        int i10 = this.f4235a;
        if (i10 == s2Var.f4235a) {
            int[] iArr = this.f4236b;
            int[] iArr2 = s2Var.f4236b;
            for (int i11 = 0; i11 < i10; i11++) {
                if (iArr[i11] == iArr2[i11]) {
                }
            }
            Object[] objArr = this.f4237c;
            Object[] objArr2 = s2Var.f4237c;
            int i12 = this.f4235a;
            for (int i13 = 0; i13 < i12; i13++) {
                if (objArr[i13].equals(objArr2[i13])) {
                }
            }
            return true;
        }
        return false;
    }

    public final void f(int i10, Object obj) {
        a();
        b(this.f4235a + 1);
        int[] iArr = this.f4236b;
        int i11 = this.f4235a;
        iArr[i11] = i10;
        this.f4237c[i11] = obj;
        this.f4235a = i11 + 1;
    }

    public final void g(w4 w4Var) throws com.google.crypto.tink.shaded.protobuf.q {
        if (this.f4235a == 0) {
            return;
        }
        w4Var.getClass();
        for (int i10 = 0; i10 < this.f4235a; i10++) {
            int i11 = this.f4236b[i10];
            Object obj = this.f4237c[i10];
            int i12 = i11 >>> 3;
            int i13 = i11 & 7;
            if (i13 == 0) {
                w4Var.D(i12, ((Long) obj).longValue());
            } else if (i13 == 1) {
                w4Var.u(i12, ((Long) obj).longValue());
            } else if (i13 == 2) {
                w4Var.m(i12, (n) obj);
            } else if (i13 == 3) {
                int i14 = w4Var.f10454a;
                switch (i14) {
                    case 9:
                        ((com.google.crypto.tink.shaded.protobuf.p) w4Var.f10455b).W0(i12, 3);
                        break;
                    default:
                        ((v) w4Var.f10455b).G0(i12, 3);
                        break;
                }
                ((s2) obj).g(w4Var);
                switch (i14) {
                    case 9:
                        ((com.google.crypto.tink.shaded.protobuf.p) w4Var.f10455b).W0(i12, 4);
                        break;
                    default:
                        ((v) w4Var.f10455b).G0(i12, 4);
                        break;
                }
            } else {
                if (i13 != 5) {
                    throw new RuntimeException(a1.d());
                }
                w4Var.s(i12, ((Integer) obj).intValue());
            }
        }
    }

    public final int hashCode() {
        int i10 = this.f4235a;
        int i11 = (527 + i10) * 31;
        int[] iArr = this.f4236b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i11 + i12) * 31;
        Object[] objArr = this.f4237c;
        int i15 = this.f4235a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }

    public s2(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f4238d = -1;
        this.f4235a = i10;
        this.f4236b = iArr;
        this.f4237c = objArr;
        this.f4239e = z10;
    }
}
