package y;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class w0 implements r1.j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f16689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f16690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f16691d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a0 f16692e;

    public w0(int i10, g gVar, i iVar, float f10, a0 a0Var) {
        this.f16688a = i10;
        this.f16689b = gVar;
        this.f16690c = iVar;
        this.f16691d = f10;
        this.f16692e = a0Var;
    }

    @Override // r1.j0
    public final int a(t1.c1 c1Var, List list, int i10) {
        return ((Number) (this.f16688a == 1 ? l0.f16619b : l0.f16623f).e(list, Integer.valueOf(i10), Integer.valueOf(c1Var.J(this.f16691d)))).intValue();
    }

    @Override // r1.j0
    public final int b(t1.c1 c1Var, List list, int i10) {
        return ((Number) (this.f16688a == 1 ? l0.f16620c : l0.f16624n).e(list, Integer.valueOf(i10), Integer.valueOf(c1Var.J(this.f16691d)))).intValue();
    }

    @Override // r1.j0
    public final int c(t1.c1 c1Var, List list, int i10) {
        return ((Number) (this.f16688a == 1 ? l0.f16621d : l0.f16625o).e(list, Integer.valueOf(i10), Integer.valueOf(c1Var.J(this.f16691d)))).intValue();
    }

    @Override // r1.j0
    public final int d(t1.c1 c1Var, List list, int i10) {
        return ((Number) (this.f16688a == 1 ? l0.f16622e : l0.f16626p).e(list, Integer.valueOf(i10), Integer.valueOf(c1Var.J(this.f16691d)))).intValue();
    }

    @Override // r1.j0
    public final r1.k0 e(r1.l0 l0Var, List list, long j10) {
        int i10;
        List list2;
        y0[] y0VarArr;
        r1.x0[] x0VarArr;
        int iS;
        r1.l0 l0Var2;
        r1.x0[] x0VarArr2 = new r1.x0[list.size()];
        int i11 = this.f16688a;
        g gVar = this.f16689b;
        i iVar = this.f16690c;
        float f10 = this.f16691d;
        x0 x0Var = new x0(i11, gVar, iVar, f10, this.f16692e, list, x0VarArr2);
        int size = list.size();
        long jA = o1.s.a(i11 == 1 ? m2.a.k(j10) : m2.a.j(j10), i11 == 1 ? m2.a.i(j10) : m2.a.h(j10), i11 == 1 ? m2.a.j(j10) : m2.a.k(j10), i11 == 1 ? m2.a.h(j10) : m2.a.i(j10));
        long J = l0Var.J(f10);
        int i12 = 0;
        int iMax = 0;
        int i13 = 0;
        int i14 = 0;
        float f11 = 0.0f;
        long jA2 = 0;
        while (true) {
            i10 = x0Var.f16695a;
            list2 = x0Var.f16699e;
            y0VarArr = x0Var.f16701g;
            x0VarArr = x0Var.f16700f;
            if (i13 >= size) {
                break;
            }
            r1.i0 i0Var = (r1.i0) list2.get(i13);
            float fH = androidx.compose.foundation.layout.a.h(y0VarArr[i13]);
            if (fH > 0.0f) {
                f11 += fH;
                i14++;
                size = size;
            } else {
                int i15 = m2.a.i(jA);
                r1.x0 x0VarF = x0VarArr[i13];
                if (x0VarF == null) {
                    x0VarF = i0Var.f(androidx.compose.foundation.layout.a.r(o1.s.a(0, i15 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) z6.a.n(((long) i15) - jA2), 0, m2.a.h(jA)), i11));
                } else {
                    size = size;
                }
                int iMin = Math.min((int) J, (int) z6.a.n((((long) i15) - jA2) - ((long) x0Var.a(x0VarF))));
                jA2 += (long) (x0Var.a(x0VarF) + iMin);
                iMax = Math.max(iMax, i10 == 1 ? x0VarF.f13424b : x0VarF.f13423a);
                x0VarArr[i13] = x0VarF;
                i12 = iMin;
            }
            i13++;
            size = size;
            J = J;
        }
        int i16 = size;
        long j11 = J;
        if (i14 == 0) {
            jA2 -= (long) i12;
            i16 = i16;
            iS = 0;
        } else {
            long j12 = ((long) (i14 - 1)) * j11;
            long jN = z6.a.n((((long) ((f11 <= 0.0f || m2.a.i(jA) == Integer.MAX_VALUE) ? m2.a.k(jA) : m2.a.i(jA))) - jA2) - j12);
            float f12 = f11 > 0.0f ? jN / f11 : 0.0f;
            i9.f it = z6.a.s0(0, i16).iterator();
            int i17 = iMax;
            int iP0 = 0;
            while (it.f8188c) {
                iP0 += d7.t.p0(androidx.compose.foundation.layout.a.h(y0VarArr[it.b()]) * f12);
            }
            long j13 = jN - ((long) iP0);
            iMax = i17;
            int i18 = 0;
            int i19 = 0;
            while (i19 < i16) {
                if (x0VarArr[i19] == null) {
                    r1.i0 i0Var2 = (r1.i0) list2.get(i19);
                    y0 y0Var = y0VarArr[i19];
                    float fH2 = androidx.compose.foundation.layout.a.h(y0Var);
                    if (fH2 <= 0.0f) {
                        throw new IllegalStateException("All weights <= 0 should have placeables".toString());
                    }
                    int i20 = j13 < 0 ? -1 : j13 > 0 ? 1 : 0;
                    j13 -= (long) i20;
                    int iMax2 = Math.max(0, d7.t.p0(fH2 * f12) + i20);
                    r1.x0 x0VarF2 = i0Var2.f(androidx.compose.foundation.layout.a.r(o1.s.a(((y0Var == null || y0Var.f16704b) && iMax2 != Integer.MAX_VALUE) ? iMax2 : 0, iMax2, 0, m2.a.h(jA)), i11));
                    int iA = x0Var.a(x0VarF2) + i18;
                    int iMax3 = Math.max(iMax, i10 == 1 ? x0VarF2.f13424b : x0VarF2.f13423a);
                    x0VarArr[i19] = x0VarF2;
                    iMax = iMax3;
                    i18 = iA;
                } else {
                    y0VarArr = y0VarArr;
                    i19 = i19;
                }
                i19++;
                list2 = list2;
                y0VarArr = y0VarArr;
            }
            iS = (int) z6.a.s(((long) i18) + j12, 0L, ((long) m2.a.i(jA)) - jA2);
        }
        int iMax4 = Math.max((int) z6.a.n(jA2 + ((long) iS)), m2.a.k(jA));
        m2.a.h(jA);
        int iMax5 = Math.max(iMax, Math.max(m2.a.j(jA), 0));
        int[] iArr = new int[i16];
        for (int i21 = 0; i21 < i16; i21++) {
            iArr[i21] = 0;
        }
        int[] iArr2 = new int[i16];
        for (int i22 = 0; i22 < i16; i22++) {
            r1.x0 x0Var2 = x0VarArr[i22];
            d7.a.j(x0Var2);
            iArr2[i22] = x0Var.a(x0Var2);
        }
        if (i11 == 2) {
            i iVar2 = x0Var.f16697c;
            if (iVar2 == null) {
                throw new IllegalArgumentException("null verticalArrangement in Column".toString());
            }
            l0Var2 = l0Var;
            iVar2.c(l0Var2, iMax4, iArr2, iArr);
        } else {
            l0Var2 = l0Var;
            g gVar2 = x0Var.f16696b;
            if (gVar2 == null) {
                throw new IllegalArgumentException("null horizontalArrangement in Row".toString());
            }
            gVar2.b(l0Var, iMax4, iArr2, l0Var.getLayoutDirection(), iArr);
        }
        a4.k kVar = new a4.k(iMax5, iMax4, i16, iArr);
        if (this.f16688a != 1) {
            iMax5 = iMax4;
            iMax4 = iMax5;
        }
        return l0Var2.N(iMax4, iMax5, r8.s.f13662a, new b.g(x0Var, kVar, l0Var2, 9));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return this.f16688a == w0Var.f16688a && d7.a.d(this.f16689b, w0Var.f16689b) && d7.a.d(this.f16690c, w0Var.f16690c) && m2.e.a(this.f16691d, w0Var.f16691d) && d7.a.d(this.f16692e, w0Var.f16692e);
    }

    public final int hashCode() {
        int iE = t.k.e(this.f16688a) * 31;
        g gVar = this.f16689b;
        int iHashCode = (iE + (gVar == null ? 0 : gVar.hashCode())) * 31;
        i iVar = this.f16690c;
        return this.f16692e.hashCode() + ((t.k.e(1) + l.q.a(this.f16691d, (iHashCode + (iVar != null ? iVar.hashCode() : 0)) * 31, 31)) * 31);
    }

    public final String toString() {
        return "RowColumnMeasurePolicy(orientation=" + u.k1.f(this.f16688a) + ", horizontalArrangement=" + this.f16689b + ", verticalArrangement=" + this.f16690c + ", arrangementSpacing=" + ((Object) m2.e.b(this.f16691d)) + ", crossAxisSize=" + u.k1.g(1) + ", crossAxisAlignment=" + this.f16692e + ')';
    }
}
