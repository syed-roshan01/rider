package m0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n2 f11665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f11666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f11667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f11668d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public HashMap f11669e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11670f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f11671g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f11672h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f11673i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f11674j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f11675k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f11676l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f11677m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f11678n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t0 f11679o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t0 f11680p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final t0 f11681q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f11682r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f11683s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f11684t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f11685u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public s1 f11686v;

    public q2(n2 n2Var) {
        this.f11665a = n2Var;
        int[] iArr = n2Var.f11596a;
        this.f11666b = iArr;
        Object[] objArr = n2Var.f11598c;
        this.f11667c = objArr;
        this.f11668d = n2Var.f11603o;
        this.f11669e = n2Var.f11604p;
        int i10 = n2Var.f11597b;
        this.f11670f = i10;
        this.f11671g = (iArr.length / 5) - i10;
        int i11 = n2Var.f11599d;
        this.f11674j = i11;
        this.f11675k = objArr.length - i11;
        this.f11676l = i10;
        this.f11679o = new t0();
        this.f11680p = new t0();
        this.f11681q = new t0();
        this.f11683s = i10;
        this.f11684t = -1;
    }

    public static int h(int i10, int i11, int i12, int i13) {
        return i10 > i11 ? -(((i13 - i12) - i10) + 1) : i10;
    }

    public static void t(q2 q2Var) {
        int i10 = q2Var.f11684t;
        int iO = q2Var.o(i10);
        int[] iArr = q2Var.f11666b;
        int i11 = (iO * 5) + 1;
        int i12 = iArr[i11];
        if ((i12 & 134217728) != 0) {
            return;
        }
        iArr[i11] = i12 | 134217728;
        if (d7.t.q(iArr, iO)) {
            return;
        }
        q2Var.N(q2Var.y(q2Var.f11666b, i10));
    }

    public final boolean A() {
        if (this.f11677m != 0) {
            s.g("Cannot remove group while inserting".toString());
            throw null;
        }
        int i10 = this.f11682r;
        int i11 = this.f11672h;
        int iE = E();
        H(this.f11684t);
        s1 s1Var = this.f11686v;
        if (s1Var != null) {
            while (true) {
                List list = s1Var.f11702a;
                if (!(!list.isEmpty()) || ((Number) r8.p.F0(list)).intValue() < i10) {
                    break;
                }
                s1Var.b();
            }
        }
        boolean zB = B(i10, this.f11682r - i10);
        C(i11, this.f11672h - i11, i10 - 1);
        this.f11682r = i10;
        this.f11672h = i11;
        this.f11678n -= iE;
        return zB;
    }

    public final boolean B(int i10, int i11) {
        boolean z10 = false;
        if (i11 > 0) {
            ArrayList arrayList = this.f11668d;
            v(i10);
            if (!arrayList.isEmpty()) {
                HashMap map = this.f11669e;
                int i12 = i10 + i11;
                int iW = d7.t.w(this.f11668d, i12, m() - this.f11671g);
                if (iW >= this.f11668d.size()) {
                    iW--;
                }
                int i13 = iW + 1;
                int i14 = 0;
                while (iW >= 0) {
                    c cVar = (c) this.f11668d.get(iW);
                    int iC = c(cVar);
                    if (iC < i10) {
                        break;
                    }
                    if (iC < i12) {
                        cVar.f11464a = Integer.MIN_VALUE;
                        if (map != null) {
                        }
                        if (i14 == 0) {
                            i14 = iW + 1;
                        }
                        i13 = iW;
                    }
                    iW--;
                }
                z10 = i13 < i14;
                if (z10) {
                    this.f11668d.subList(i13, i14).clear();
                }
            }
            this.f11670f = i10;
            this.f11671g += i11;
            int i15 = this.f11676l;
            if (i15 > i10) {
                this.f11676l = Math.max(i10, i15 - i11);
            }
            int i16 = this.f11683s;
            if (i16 >= this.f11670f) {
                this.f11683s = i16 - i11;
            }
            int i17 = this.f11684t;
            if (i17 >= 0 && d7.t.q(this.f11666b, o(i17))) {
                N(i17);
            }
        }
        return z10;
    }

    public final void C(int i10, int i11, int i12) {
        if (i11 > 0) {
            int i13 = this.f11675k;
            int i14 = i10 + i11;
            w(i14, i12);
            this.f11674j = i10;
            this.f11675k = i13 + i11;
            b9.b.O(i10, i14, this.f11667c);
            int i15 = this.f11673i;
            if (i15 >= i10) {
                this.f11673i = i15 - i11;
            }
        }
    }

    public final Object D(Object obj, int i10, int i11) {
        int iG = G(this.f11666b, o(i10));
        int iF = f(this.f11666b, o(i10 + 1));
        int i12 = iG + i11;
        if (i12 >= iG && i12 < iF) {
            int iG2 = g(i12);
            Object[] objArr = this.f11667c;
            Object obj2 = objArr[iG2];
            objArr[iG2] = obj;
            return obj2;
        }
        s.g(("Write to an invalid slot index " + i11 + " for group " + i10).toString());
        throw null;
    }

    public final int E() {
        int iO = o(this.f11682r);
        int iS = d7.t.s(this.f11666b, iO) + this.f11682r;
        this.f11682r = iS;
        this.f11672h = f(this.f11666b, o(iS));
        if (d7.t.v(this.f11666b, iO)) {
            return 1;
        }
        return d7.t.x(this.f11666b, iO);
    }

    public final void F() {
        int i10 = this.f11683s;
        this.f11682r = i10;
        this.f11672h = f(this.f11666b, o(i10));
    }

    public final int G(int[] iArr, int i10) {
        if (i10 >= m()) {
            return this.f11667c.length - this.f11675k;
        }
        int iZ = d7.t.z(iArr, i10);
        return iZ < 0 ? (this.f11667c.length - this.f11675k) + iZ + 1 : iZ;
    }

    public final s0 H(int i10) {
        c cVarK;
        HashMap map = this.f11669e;
        if (map == null || (cVarK = K(i10)) == null) {
            return null;
        }
        return (s0) map.get(cVarK);
    }

    public final void I() {
        if (this.f11677m != 0) {
            s.g("Key must be supplied when inserting".toString());
            throw null;
        }
        k0.y0 y0Var = l.f11578a;
        J(0, y0Var, y0Var, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void J(int i10, Object obj, Object obj2, boolean z10) {
        int iS;
        int i11 = this.f11684t;
        Object[] objArr = this.f11677m > 0;
        this.f11681q.b(this.f11678n);
        k0.y0 y0Var = l.f11578a;
        if (objArr == true) {
            r(1);
            int i12 = this.f11682r;
            int iO = o(i12);
            int i13 = obj != y0Var ? 1 : 0;
            int i14 = (z10 || obj2 == y0Var) ? 0 : 1;
            int[] iArr = this.f11666b;
            int i15 = this.f11684t;
            int i16 = this.f11672h;
            int i17 = z10 ? 1073741824 : 0;
            int i18 = i13 != 0 ? 536870912 : 0;
            int i19 = i14 != 0 ? 268435456 : 0;
            int i20 = iO * 5;
            iArr[i20] = i10;
            iArr[i20 + 1] = i17 | i18 | i19;
            iArr[i20 + 2] = i15;
            iArr[i20 + 3] = 0;
            iArr[i20 + 4] = i16;
            this.f11673i = i16;
            int i21 = (z10 ? 1 : 0) + i13 + i14;
            if (i21 > 0) {
                s(i21, i12);
                Object[] objArr2 = this.f11667c;
                int i22 = this.f11672h;
                if (z10) {
                    objArr2[i22] = obj2;
                    i22++;
                }
                if (i13 != 0) {
                    objArr2[i22] = obj;
                    i22++;
                }
                if (i14 != 0) {
                    objArr2[i22] = obj2;
                    i22++;
                }
                this.f11672h = i22;
            }
            this.f11678n = 0;
            iS = i12 + 1;
            this.f11684t = i12;
            this.f11682r = iS;
            if (i11 >= 0) {
                H(i11);
            }
        } else {
            this.f11679o.b(i11);
            this.f11680p.b((m() - this.f11671g) - this.f11683s);
            int i23 = this.f11682r;
            int iO2 = o(i23);
            if (!d7.a.d(obj2, y0Var)) {
                if (z10) {
                    O(this.f11682r, obj2);
                } else {
                    M(obj2);
                }
            }
            this.f11672h = G(this.f11666b, iO2);
            this.f11673i = f(this.f11666b, o(this.f11682r + 1));
            this.f11678n = d7.t.x(this.f11666b, iO2);
            this.f11684t = i23;
            this.f11682r = i23 + 1;
            iS = i23 + d7.t.s(this.f11666b, iO2);
        }
        this.f11683s = iS;
    }

    public final c K(int i10) {
        ArrayList arrayList;
        int iQ0;
        if (i10 < 0 || i10 >= n() || (iQ0 = d7.t.q0((arrayList = this.f11668d), i10, n())) < 0) {
            return null;
        }
        return (c) arrayList.get(iQ0);
    }

    public final void L(Object obj) {
        if (this.f11677m > 0) {
            s(1, this.f11684t);
        }
        Object[] objArr = this.f11667c;
        int i10 = this.f11672h;
        this.f11672h = i10 + 1;
        Object obj2 = objArr[g(i10)];
        int i11 = this.f11672h;
        if (i11 <= this.f11673i) {
            this.f11667c[g(i11 - 1)] = obj;
        } else {
            s.g("Writing to an invalid slot".toString());
            throw null;
        }
    }

    public final void M(Object obj) {
        int iO = o(this.f11682r);
        if (!d7.t.t(this.f11666b, iO)) {
            s.g("Updating the data of a group that was not created with a data slot".toString());
            throw null;
        }
        Object[] objArr = this.f11667c;
        int[] iArr = this.f11666b;
        objArr[g(d7.t.L(iArr[(iO * 5) + 1] >> 29) + f(iArr, iO))] = obj;
    }

    public final void N(int i10) {
        if (i10 >= 0) {
            s1 s1Var = this.f11686v;
            if (s1Var == null) {
                s1Var = new s1();
                this.f11686v = s1Var;
            }
            s1Var.a(i10);
        }
    }

    public final void O(int i10, Object obj) {
        int iO = o(i10);
        int[] iArr = this.f11666b;
        if (iO < iArr.length && d7.t.v(iArr, iO)) {
            this.f11667c[g(f(this.f11666b, iO))] = obj;
            return;
        }
        s.g(("Updating the node of a group at " + i10 + " that was not created with as a node group").toString());
        throw null;
    }

    public final void a(int i10) {
        if (!(i10 >= 0)) {
            s.g("Cannot seek backwards".toString());
            throw null;
        }
        if (this.f11677m > 0) {
            throw new IllegalStateException("Cannot call seek() while inserting".toString());
        }
        if (i10 == 0) {
            return;
        }
        int i11 = this.f11682r + i10;
        if (i11 >= this.f11684t && i11 <= this.f11683s) {
            this.f11682r = i11;
            int iF = f(this.f11666b, o(i11));
            this.f11672h = iF;
            this.f11673i = iF;
            return;
        }
        s.g(("Cannot seek outside the current group (" + this.f11684t + '-' + this.f11683s + ')').toString());
        throw null;
    }

    public final c b(int i10) {
        ArrayList arrayList = this.f11668d;
        int iQ0 = d7.t.q0(arrayList, i10, n());
        if (iQ0 >= 0) {
            return (c) arrayList.get(iQ0);
        }
        if (i10 > this.f11670f) {
            i10 = -(n() - i10);
        }
        c cVar = new c(i10);
        arrayList.add(-(iQ0 + 1), cVar);
        return cVar;
    }

    public final int c(c cVar) {
        int i10 = cVar.f11464a;
        return i10 < 0 ? i10 + n() : i10;
    }

    public final void d() {
        int i10 = this.f11677m;
        this.f11677m = i10 + 1;
        if (i10 == 0) {
            this.f11680p.b((m() - this.f11671g) - this.f11683s);
        }
    }

    public final void e() {
        this.f11685u = true;
        if (this.f11679o.f11705b == 0) {
            v(n());
            w(this.f11667c.length - this.f11675k, this.f11670f);
            int i10 = this.f11674j;
            b9.b.O(i10, this.f11675k + i10, this.f11667c);
            z();
        }
        int[] iArr = this.f11666b;
        int i11 = this.f11670f;
        Object[] objArr = this.f11667c;
        int i12 = this.f11674j;
        ArrayList arrayList = this.f11668d;
        HashMap map = this.f11669e;
        n2 n2Var = this.f11665a;
        n2Var.getClass();
        if (!n2Var.f11601f) {
            throw new IllegalArgumentException("Unexpected writer close()".toString());
        }
        n2Var.f11601f = false;
        n2Var.f11596a = iArr;
        n2Var.f11597b = i11;
        n2Var.f11598c = objArr;
        n2Var.f11599d = i12;
        n2Var.f11603o = arrayList;
        n2Var.f11604p = map;
    }

    public final int f(int[] iArr, int i10) {
        if (i10 >= m()) {
            return this.f11667c.length - this.f11675k;
        }
        int i11 = iArr[(i10 * 5) + 4];
        return i11 < 0 ? (this.f11667c.length - this.f11675k) + i11 + 1 : i11;
    }

    public final int g(int i10) {
        return i10 < this.f11674j ? i10 : i10 + this.f11675k;
    }

    public final void i() {
        boolean z10 = this.f11677m > 0;
        int i10 = this.f11682r;
        int i11 = this.f11683s;
        int i12 = this.f11684t;
        int iO = o(i12);
        int i13 = this.f11678n;
        int i14 = i10 - i12;
        boolean zV = d7.t.v(this.f11666b, iO);
        t0 t0Var = this.f11681q;
        if (z10) {
            d7.t.A(iO, i14, this.f11666b);
            d7.t.B(iO, i13, this.f11666b);
            this.f11678n = t0Var.a() + (zV ? 1 : i13);
            this.f11684t = y(this.f11666b, i12);
            return;
        }
        if (i10 != i11) {
            s.g("Expected to be at the end of a group".toString());
            throw null;
        }
        int iS = d7.t.s(this.f11666b, iO);
        int iX = d7.t.x(this.f11666b, iO);
        d7.t.A(iO, i14, this.f11666b);
        d7.t.B(iO, i13, this.f11666b);
        int iA = this.f11679o.a();
        this.f11683s = (m() - this.f11671g) - this.f11680p.a();
        this.f11684t = iA;
        int iY = y(this.f11666b, i12);
        int iA2 = t0Var.a();
        this.f11678n = iA2;
        if (iY == iA) {
            this.f11678n = iA2 + (zV ? 0 : i13 - iX);
            return;
        }
        int i15 = i14 - iS;
        int i16 = zV ? 0 : i13 - iX;
        if (i15 != 0 || i16 != 0) {
            while (iY != 0 && iY != iA && (i16 != 0 || i15 != 0)) {
                int iO2 = o(iY);
                if (i15 != 0) {
                    d7.t.A(iO2, d7.t.s(this.f11666b, iO2) + i15, this.f11666b);
                }
                if (i16 != 0) {
                    int[] iArr = this.f11666b;
                    d7.t.B(iO2, d7.t.x(iArr, iO2) + i16, iArr);
                }
                if (d7.t.v(this.f11666b, iO2)) {
                    i16 = 0;
                }
                iY = y(this.f11666b, iY);
            }
        }
        this.f11678n += i16;
    }

    public final void j() {
        int i10 = this.f11677m;
        if (i10 <= 0) {
            throw new IllegalStateException("Unbalanced begin/end insert".toString());
        }
        int i11 = i10 - 1;
        this.f11677m = i11;
        if (i11 == 0) {
            if (this.f11681q.f11705b == this.f11679o.f11705b) {
                this.f11683s = (m() - this.f11671g) - this.f11680p.a();
            } else {
                s.g("startGroup/endGroup mismatch while inserting".toString());
                throw null;
            }
        }
    }

    public final void k(int i10) {
        if (!(this.f11677m <= 0)) {
            s.g("Cannot call ensureStarted() while inserting".toString());
            throw null;
        }
        int i11 = this.f11684t;
        if (i11 != i10) {
            if (i10 < i11 || i10 >= this.f11683s) {
                s.g(("Started group at " + i10 + " must be a subgroup of the group at " + i11).toString());
                throw null;
            }
            int i12 = this.f11682r;
            int i13 = this.f11672h;
            int i14 = this.f11673i;
            this.f11682r = i10;
            I();
            this.f11682r = i12;
            this.f11672h = i13;
            this.f11673i = i14;
        }
    }

    public final void l(int i10, int i11, int i12) {
        if (i10 >= this.f11670f) {
            i10 = -((n() - i10) + 2);
        }
        while (i12 < i11) {
            this.f11666b[(o(i12) * 5) + 2] = i10;
            int iS = d7.t.s(this.f11666b, o(i12)) + i12;
            l(i12, iS, i12 + 1);
            i12 = iS;
        }
    }

    public final int m() {
        return this.f11666b.length / 5;
    }

    public final int n() {
        return m() - this.f11671g;
    }

    public final int o(int i10) {
        return i10 < this.f11670f ? i10 : i10 + this.f11671g;
    }

    public final int p(int i10) {
        return d7.t.s(this.f11666b, o(i10));
    }

    public final boolean q(int i10, int i11) {
        int iM;
        int iP;
        if (i11 == this.f11684t) {
            iM = this.f11683s;
        } else {
            t0 t0Var = this.f11679o;
            int i12 = t0Var.f11705b;
            if (i11 > (i12 > 0 ? t0Var.f11704a[i12 - 1] : 0)) {
                iP = p(i11);
            } else {
                int i13 = 0;
                while (true) {
                    if (i13 >= i12) {
                        i13 = -1;
                        break;
                    }
                    if (t0Var.f11704a[i13] == i11) {
                        break;
                    }
                    i13++;
                }
                if (i13 < 0) {
                    iP = p(i11);
                } else {
                    iM = (m() - this.f11671g) - this.f11680p.f11704a[i13];
                }
            }
            iM = iP + i11;
        }
        return i10 > i11 && i10 < iM;
    }

    public final void r(int i10) {
        if (i10 > 0) {
            int i11 = this.f11682r;
            v(i11);
            int i12 = this.f11670f;
            int i13 = this.f11671g;
            int[] iArr = this.f11666b;
            int length = iArr.length / 5;
            int i14 = length - i13;
            if (i13 < i10) {
                int iMax = Math.max(Math.max(length * 2, i14 + i10), 32);
                int[] iArr2 = new int[iMax * 5];
                int i15 = iMax - i14;
                b9.b.G(0, 0, i12 * 5, iArr, iArr2);
                b9.b.G((i12 + i15) * 5, (i13 + i12) * 5, length * 5, iArr, iArr2);
                this.f11666b = iArr2;
                i13 = i15;
            }
            int i16 = this.f11683s;
            if (i16 >= i12) {
                this.f11683s = i16 + i10;
            }
            int i17 = i12 + i10;
            this.f11670f = i17;
            this.f11671g = i13 - i10;
            int iH = h(i14 > 0 ? f(this.f11666b, o(i11 + i10)) : 0, this.f11676l >= i12 ? this.f11674j : 0, this.f11675k, this.f11667c.length);
            for (int i18 = i12; i18 < i17; i18++) {
                this.f11666b[(i18 * 5) + 4] = iH;
            }
            int i19 = this.f11676l;
            if (i19 >= i12) {
                this.f11676l = i19 + i10;
            }
        }
    }

    public final void s(int i10, int i11) {
        if (i10 > 0) {
            w(this.f11672h, i11);
            int i12 = this.f11674j;
            int i13 = this.f11675k;
            if (i13 < i10) {
                Object[] objArr = this.f11667c;
                int length = objArr.length;
                int i14 = length - i13;
                int iMax = Math.max(Math.max(length * 2, i14 + i10), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i15 = 0; i15 < iMax; i15++) {
                    objArr2[i15] = null;
                }
                int i16 = iMax - i14;
                b9.b.H(0, 0, i12, objArr, objArr2);
                b9.b.H(i12 + i16, i13 + i12, length, objArr, objArr2);
                this.f11667c = objArr2;
                i13 = i16;
            }
            int i17 = this.f11673i;
            if (i17 >= i12) {
                this.f11673i = i17 + i10;
            }
            this.f11674j = i12 + i10;
            this.f11675k = i13 - i10;
        }
    }

    public final String toString() {
        return "SlotWriter(current = " + this.f11682r + " end=" + this.f11683s + " size = " + n() + " gap=" + this.f11670f + '-' + (this.f11670f + this.f11671g) + ')';
    }

    public final void u(n2 n2Var, int i10) {
        s.l(this.f11677m > 0);
        if (i10 == 0 && this.f11682r == 0 && this.f11665a.f11597b == 0) {
            int iS = d7.t.s(n2Var.f11596a, i10);
            int i11 = n2Var.f11597b;
            if (iS == i11) {
                int[] iArr = this.f11666b;
                Object[] objArr = this.f11667c;
                ArrayList arrayList = this.f11668d;
                HashMap map = this.f11669e;
                int[] iArr2 = n2Var.f11596a;
                Object[] objArr2 = n2Var.f11598c;
                int i12 = n2Var.f11599d;
                HashMap map2 = n2Var.f11604p;
                this.f11666b = iArr2;
                this.f11667c = objArr2;
                this.f11668d = n2Var.f11603o;
                this.f11670f = i11;
                this.f11671g = (iArr2.length / 5) - i11;
                this.f11674j = i12;
                this.f11675k = objArr2.length - i12;
                this.f11676l = i11;
                this.f11669e = map2;
                n2Var.f11596a = iArr;
                n2Var.f11597b = 0;
                n2Var.f11598c = objArr;
                n2Var.f11599d = 0;
                n2Var.f11603o = arrayList;
                n2Var.f11604p = map;
                return;
            }
        }
        q2 q2VarK = n2Var.k();
        try {
            k0.y0.d(q2VarK, i10, this, true, true, false);
        } finally {
            q2VarK.e();
        }
    }

    public final void v(int i10) {
        c cVar;
        int i11;
        c cVar2;
        int i12;
        int i13;
        int i14 = this.f11671g;
        int i15 = this.f11670f;
        if (i15 != i10) {
            if (!this.f11668d.isEmpty()) {
                int iM = m() - this.f11671g;
                if (i15 < i10) {
                    for (int iW = d7.t.w(this.f11668d, i15, iM); iW < this.f11668d.size() && (i12 = (cVar2 = (c) this.f11668d.get(iW)).f11464a) < 0 && (i13 = i12 + iM) < i10; iW++) {
                        cVar2.f11464a = i13;
                    }
                } else {
                    for (int iW2 = d7.t.w(this.f11668d, i10, iM); iW2 < this.f11668d.size() && (i11 = (cVar = (c) this.f11668d.get(iW2)).f11464a) >= 0; iW2++) {
                        cVar.f11464a = -(iM - i11);
                    }
                }
            }
            if (i14 > 0) {
                int[] iArr = this.f11666b;
                int i16 = i10 * 5;
                int i17 = i14 * 5;
                int i18 = i15 * 5;
                if (i10 < i15) {
                    b9.b.G(i17 + i16, i16, i18, iArr, iArr);
                } else {
                    b9.b.G(i18, i18 + i17, i16 + i17, iArr, iArr);
                }
            }
            if (i10 < i15) {
                i15 = i10 + i14;
            }
            int iM2 = m();
            s.l(i15 < iM2);
            while (i15 < iM2) {
                int iY = d7.t.y(this.f11666b, i15);
                int iN = iY > -2 ? iY : (n() + iY) - (-2);
                if (iN >= i10) {
                    iN = -((n() - iN) - (-2));
                }
                if (iN != iY) {
                    this.f11666b[(i15 * 5) + 2] = iN;
                }
                i15++;
                if (i15 == i10) {
                    i15 += i14;
                }
            }
        }
        this.f11670f = i10;
    }

    public final void w(int i10, int i11) {
        int i12 = this.f11675k;
        int i13 = this.f11674j;
        int i14 = this.f11676l;
        if (i13 != i10) {
            Object[] objArr = this.f11667c;
            if (i10 < i13) {
                b9.b.H(i10 + i12, i10, i13, objArr, objArr);
            } else {
                b9.b.H(i13, i13 + i12, i10 + i12, objArr, objArr);
            }
        }
        int iMin = Math.min(i11 + 1, n());
        if (i14 != iMin) {
            int length = this.f11667c.length - i12;
            if (iMin < i14) {
                int iO = o(iMin);
                int iO2 = o(i14);
                int i15 = this.f11670f;
                while (iO < iO2) {
                    int[] iArr = this.f11666b;
                    int i16 = (iO * 5) + 4;
                    int i17 = iArr[i16];
                    if (i17 < 0) {
                        s.g("Unexpected anchor value, expected a positive anchor".toString());
                        throw null;
                    }
                    iArr[i16] = -((length - i17) + 1);
                    iO++;
                    if (iO == i15) {
                        iO += this.f11671g;
                    }
                }
            } else {
                int iO3 = o(i14);
                int iO4 = o(iMin);
                while (iO3 < iO4) {
                    int[] iArr2 = this.f11666b;
                    int i18 = (iO3 * 5) + 4;
                    int i19 = iArr2[i18];
                    if (i19 >= 0) {
                        s.g("Unexpected anchor value, expected a negative anchor".toString());
                        throw null;
                    }
                    iArr2[i18] = i19 + length + 1;
                    iO3++;
                    if (iO3 == this.f11670f) {
                        iO3 += this.f11671g;
                    }
                }
            }
            this.f11676l = iMin;
        }
        this.f11674j = i10;
    }

    public final Object x(int i10) {
        int iO = o(i10);
        if (d7.t.v(this.f11666b, iO)) {
            return this.f11667c[g(f(this.f11666b, iO))];
        }
        return null;
    }

    public final int y(int[] iArr, int i10) {
        int i11 = iArr[(o(i10) * 5) + 2];
        return i11 > -2 ? i11 : n() + i11 + 2;
    }

    public final void z() {
        boolean z10;
        s1 s1Var = this.f11686v;
        if (s1Var != null) {
            while (!s1Var.f11702a.isEmpty()) {
                int iB = s1Var.b();
                int iO = o(iB);
                int iP = iB + 1;
                int iP2 = p(iB) + iB;
                while (true) {
                    if (iP >= iP2) {
                        z10 = false;
                        break;
                    } else {
                        if ((this.f11666b[(o(iP) * 5) + 1] & 201326592) != 0) {
                            z10 = true;
                            break;
                        }
                        iP += p(iP);
                    }
                }
                if (d7.t.q(this.f11666b, iO) != z10) {
                    int[] iArr = this.f11666b;
                    int i10 = (iO * 5) + 1;
                    if (z10) {
                        iArr[i10] = iArr[i10] | 67108864;
                    } else {
                        iArr[i10] = iArr[i10] & (-67108865);
                    }
                    int iY = y(iArr, iB);
                    if (iY >= 0) {
                        s1Var.a(iY);
                    }
                }
            }
        }
    }
}
