package com.google.crypto.tink.shaded.protobuf;

import java.util.Arrays;
import k6.w4;

/* JADX INFO: loaded from: classes.dex */
public final class o1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final o1 f3602f = new o1(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f3604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f3605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3606d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3607e;

    public o1(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f3603a = i10;
        this.f3604b = iArr;
        this.f3605c = objArr;
        this.f3607e = z10;
    }

    public static o1 c() {
        return new o1(0, new int[8], new Object[8], true);
    }

    public final void a(int i10) {
        int[] iArr = this.f3604b;
        if (i10 > iArr.length) {
            int i11 = this.f3603a;
            int i12 = (i11 / 2) + i11;
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f3604b = Arrays.copyOf(iArr, i10);
            this.f3605c = Arrays.copyOf(this.f3605c, i10);
        }
    }

    public final int b() {
        int iL0;
        int i10 = this.f3606d;
        if (i10 != -1) {
            return i10;
        }
        int iB = 0;
        for (int i11 = 0; i11 < this.f3603a; i11++) {
            int i12 = this.f3604b[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 == 0) {
                iL0 = p.L0(i13, ((Long) this.f3605c[i11]).longValue());
            } else if (i14 == 1) {
                ((Long) this.f3605c[i11]).longValue();
                iL0 = p.w0(i13);
            } else if (i14 != 2) {
                if (i14 == 3) {
                    iB = ((o1) this.f3605c[i11]).b() + (p.I0(i13) * 2) + iB;
                } else {
                    if (i14 != 5) {
                        throw new IllegalStateException(h0.c());
                    }
                    ((Integer) this.f3605c[i11]).intValue();
                    iL0 = p.v0(i13);
                }
            } else {
                iL0 = p.s0(i13, (l) this.f3605c[i11]);
            }
            iB = iL0 + iB;
        }
        this.f3606d = iB;
        return iB;
    }

    public final void d(int i10, Object obj) {
        if (!this.f3607e) {
            throw new UnsupportedOperationException();
        }
        a(this.f3603a + 1);
        int[] iArr = this.f3604b;
        int i11 = this.f3603a;
        iArr[i11] = i10;
        this.f3605c[i11] = obj;
        this.f3603a = i11 + 1;
    }

    public final void e(w4 w4Var) throws q {
        if (this.f3603a == 0) {
            return;
        }
        w4Var.getClass();
        for (int i10 = 0; i10 < this.f3603a; i10++) {
            int i11 = this.f3604b[i10];
            Object obj = this.f3605c[i10];
            int i12 = i11 >>> 3;
            int i13 = i11 & 7;
            if (i13 == 0) {
                w4Var.D(i12, ((Long) obj).longValue());
            } else if (i13 == 1) {
                w4Var.u(i12, ((Long) obj).longValue());
            } else if (i13 == 2) {
                w4Var.l(i12, (l) obj);
            } else if (i13 == 3) {
                int i14 = w4Var.f10454a;
                switch (i14) {
                    case 9:
                        ((p) w4Var.f10455b).W0(i12, 3);
                        break;
                    default:
                        ((com.google.protobuf.v) w4Var.f10455b).G0(i12, 3);
                        break;
                }
                ((o1) obj).e(w4Var);
                switch (i14) {
                    case 9:
                        ((p) w4Var.f10455b).W0(i12, 4);
                        break;
                    default:
                        ((com.google.protobuf.v) w4Var.f10455b).G0(i12, 4);
                        break;
                }
            } else {
                if (i13 != 5) {
                    throw new RuntimeException(h0.c());
                }
                w4Var.s(i12, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        int i10 = this.f3603a;
        if (i10 == o1Var.f3603a) {
            int[] iArr = this.f3604b;
            int[] iArr2 = o1Var.f3604b;
            for (int i11 = 0; i11 < i10; i11++) {
                if (iArr[i11] == iArr2[i11]) {
                }
            }
            Object[] objArr = this.f3605c;
            Object[] objArr2 = o1Var.f3605c;
            int i12 = this.f3603a;
            for (int i13 = 0; i13 < i12; i13++) {
                if (objArr[i13].equals(objArr2[i13])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f3603a;
        int i11 = (527 + i10) * 31;
        int[] iArr = this.f3604b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i11 + i12) * 31;
        Object[] objArr = this.f3605c;
        int i15 = this.f3603a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }
}
