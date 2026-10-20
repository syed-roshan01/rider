package m0;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n2 f11583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f11584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object[] f11586d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f11587e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f11588f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f11589g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f11590h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f11591i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f11592j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f11593k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f11594l;

    public m2(n2 n2Var) {
        this.f11583a = n2Var;
        this.f11584b = n2Var.f11596a;
        int i10 = n2Var.f11597b;
        this.f11585c = i10;
        this.f11586d = n2Var.f11598c;
        this.f11587e = n2Var.f11599d;
        this.f11590h = i10;
        this.f11591i = -1;
    }

    public final c a(int i10) {
        ArrayList arrayList = this.f11583a.f11603o;
        int iQ0 = d7.t.q0(arrayList, i10, this.f11585c);
        if (iQ0 >= 0) {
            return (c) arrayList.get(iQ0);
        }
        c cVar = new c(i10);
        arrayList.add(-(iQ0 + 1), cVar);
        return cVar;
    }

    public final Object b(int[] iArr, int i10) {
        int iL;
        if (!d7.t.t(iArr, i10)) {
            return l.f11578a;
        }
        int i11 = i10 * 5;
        if (i11 >= iArr.length) {
            iL = iArr.length;
        } else {
            iL = d7.t.L(iArr[i11 + 1] >> 29) + iArr[i11 + 4];
        }
        return this.f11586d[iL];
    }

    public final void c() {
        int i10;
        this.f11588f = true;
        n2 n2Var = this.f11583a;
        n2Var.getClass();
        if (this.f11583a != n2Var || (i10 = n2Var.f11600e) <= 0) {
            s.g("Unexpected reader close()".toString());
            throw null;
        }
        n2Var.f11600e = i10 - 1;
    }

    public final void d() {
        if (this.f11592j == 0) {
            if (this.f11589g != this.f11590h) {
                s.g("endGroup() not called at the end of a group".toString());
                throw null;
            }
            int i10 = this.f11591i;
            int[] iArr = this.f11584b;
            int iY = d7.t.y(iArr, i10);
            this.f11591i = iY;
            this.f11590h = iY < 0 ? this.f11585c : iY + iArr[(iY * 5) + 3];
        }
    }

    public final Object e() {
        int i10 = this.f11589g;
        if (i10 < this.f11590h) {
            return b(this.f11584b, i10);
        }
        return 0;
    }

    public final int f() {
        int i10 = this.f11589g;
        if (i10 >= this.f11590h) {
            return 0;
        }
        return this.f11584b[i10 * 5];
    }

    public final Object g(int i10, int i11) {
        int[] iArr = this.f11584b;
        int iZ = d7.t.z(iArr, i10);
        int i12 = i10 + 1;
        int i13 = iZ + i11;
        return i13 < (i12 < this.f11585c ? iArr[(i12 * 5) + 4] : this.f11587e) ? this.f11586d[i13] : l.f11578a;
    }

    public final Object h() {
        int i10;
        if (this.f11592j > 0 || (i10 = this.f11593k) >= this.f11594l) {
            return l.f11578a;
        }
        this.f11593k = i10 + 1;
        return this.f11586d[i10];
    }

    public final Object i(int i10) {
        int[] iArr = this.f11584b;
        if (!d7.t.v(iArr, i10)) {
            return null;
        }
        if (!d7.t.v(iArr, i10)) {
            return l.f11578a;
        }
        return this.f11586d[iArr[(i10 * 5) + 4]];
    }

    public final Object j(int[] iArr, int i10) {
        if (!d7.t.u(iArr, i10)) {
            return null;
        }
        int i11 = i10 * 5;
        return this.f11586d[d7.t.L(iArr[i11 + 1] >> 30) + iArr[i11 + 4]];
    }

    public final void k(int i10) {
        if (this.f11592j != 0) {
            s.g("Cannot reposition while in an empty region".toString());
            throw null;
        }
        this.f11589g = i10;
        int[] iArr = this.f11584b;
        int i11 = this.f11585c;
        int iY = i10 < i11 ? d7.t.y(iArr, i10) : -1;
        this.f11591i = iY;
        if (iY < 0) {
            this.f11590h = i11;
        } else {
            this.f11590h = d7.t.s(iArr, iY) + iY;
        }
        this.f11593k = 0;
        this.f11594l = 0;
    }

    public final int l() {
        if (this.f11592j != 0) {
            s.g("Cannot skip while in an empty region".toString());
            throw null;
        }
        int i10 = this.f11589g;
        int[] iArr = this.f11584b;
        int iX = d7.t.v(iArr, i10) ? 1 : d7.t.x(iArr, this.f11589g);
        int i11 = this.f11589g;
        this.f11589g = iArr[(i11 * 5) + 3] + i11;
        return iX;
    }

    public final void m() {
        if (this.f11592j == 0) {
            this.f11589g = this.f11590h;
        } else {
            s.g("Cannot skip the enclosing group while in an empty region".toString());
            throw null;
        }
    }

    public final void n() {
        if (this.f11592j <= 0) {
            int i10 = this.f11591i;
            int i11 = this.f11589g;
            int[] iArr = this.f11584b;
            if (d7.t.y(iArr, i11) != i10) {
                throw new IllegalArgumentException("Invalid slot table detected".toString());
            }
            this.f11591i = i11;
            this.f11590h = iArr[(i11 * 5) + 3] + i11;
            int i12 = i11 + 1;
            this.f11589g = i12;
            this.f11593k = d7.t.z(iArr, i11);
            this.f11594l = i11 >= this.f11585c + (-1) ? this.f11587e : iArr[(i12 * 5) + 4];
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SlotReader(current=");
        sb.append(this.f11589g);
        sb.append(", key=");
        sb.append(f());
        sb.append(", parent=");
        sb.append(this.f11591i);
        sb.append(", end=");
        return a7.a.o(sb, this.f11590h, ')');
    }
}
