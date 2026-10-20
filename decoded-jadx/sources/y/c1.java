package y;

/* JADX INFO: loaded from: classes.dex */
public final class c1 extends y0.n implements t1.b0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f16523u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f16524v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f16525w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f16526x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f16527y;

    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    public final long G0(m2.b bVar) {
        int iJ;
        int iJ2;
        int iJ3;
        int i10 = 0;
        if (m2.e.a(this.f16525w, Float.NaN)) {
            iJ = Integer.MAX_VALUE;
        } else {
            iJ = bVar.J(this.f16525w);
            if (iJ < 0) {
                iJ = 0;
            }
        }
        if (m2.e.a(this.f16526x, Float.NaN)) {
            iJ2 = Integer.MAX_VALUE;
        } else {
            iJ2 = bVar.J(this.f16526x);
            if (iJ2 < 0) {
                iJ2 = 0;
            }
        }
        if (m2.e.a(this.f16523u, Float.NaN)) {
            iJ3 = 0;
        } else {
            iJ3 = bVar.J(this.f16523u);
            if (iJ3 > iJ) {
                iJ3 = iJ;
            }
            if (iJ3 < 0) {
                iJ3 = 0;
            }
            if (iJ3 == Integer.MAX_VALUE) {
                iJ3 = 0;
            }
        }
        if (!m2.e.a(this.f16524v, Float.NaN)) {
            int iJ4 = bVar.J(this.f16524v);
            if (iJ4 > iJ2) {
                iJ4 = iJ2;
            }
            if (iJ4 < 0) {
                iJ4 = 0;
            }
            if (iJ4 != Integer.MAX_VALUE) {
                i10 = iJ4;
            }
        }
        return o1.s.a(iJ3, iJ, i10, iJ2);
    }

    @Override // t1.b0
    public final int a(r1.q qVar, r1.p pVar, int i10) {
        long jG0 = G0(qVar);
        return m2.a.f(jG0) ? m2.a.h(jG0) : o1.s.p(pVar.g(i10), jG0);
    }

    @Override // t1.b0
    public final int b(r1.q qVar, r1.p pVar, int i10) {
        long jG0 = G0(qVar);
        return m2.a.g(jG0) ? m2.a.i(jG0) : o1.s.q(pVar.V(i10), jG0);
    }

    @Override // t1.b0
    public final int d(r1.q qVar, r1.p pVar, int i10) {
        long jG0 = G0(qVar);
        return m2.a.g(jG0) ? m2.a.i(jG0) : o1.s.q(pVar.Q(i10), jG0);
    }

    @Override // t1.b0
    public final r1.k0 f(r1.l0 l0Var, r1.i0 i0Var, long j10) {
        int iK;
        int i10;
        int iJ;
        int iH;
        long jA;
        long jG0 = G0(l0Var);
        if (this.f16527y) {
            jA = o1.s.a(z6.a.r(m2.a.k(jG0), m2.a.k(j10), m2.a.i(j10)), z6.a.r(m2.a.i(jG0), m2.a.k(j10), m2.a.i(j10)), z6.a.r(m2.a.j(jG0), m2.a.j(j10), m2.a.h(j10)), z6.a.r(m2.a.h(jG0), m2.a.j(j10), m2.a.h(j10)));
        } else {
            if (m2.e.a(this.f16523u, Float.NaN)) {
                iK = m2.a.k(j10);
                int i11 = m2.a.i(jG0);
                if (iK > i11) {
                    iK = i11;
                }
            } else {
                iK = m2.a.k(jG0);
            }
            if (m2.e.a(this.f16525w, Float.NaN)) {
                i10 = m2.a.i(j10);
                int iK2 = m2.a.k(jG0);
                if (i10 < iK2) {
                    i10 = iK2;
                }
            } else {
                i10 = m2.a.i(jG0);
            }
            if (m2.e.a(this.f16524v, Float.NaN)) {
                iJ = m2.a.j(j10);
                int iH2 = m2.a.h(jG0);
                if (iJ > iH2) {
                    iJ = iH2;
                }
            } else {
                iJ = m2.a.j(jG0);
            }
            if (m2.e.a(this.f16526x, Float.NaN)) {
                iH = m2.a.h(j10);
                int iJ2 = m2.a.j(jG0);
                if (iH < iJ2) {
                    iH = iJ2;
                }
            } else {
                iH = m2.a.h(jG0);
            }
            jA = o1.s.a(iK, i10, iJ, iH);
        }
        r1.x0 x0VarF = i0Var.f(jA);
        return l0Var.N(x0VarF.f13423a, x0VarF.f13424b, r8.s.f13662a, new s.z(x0VarF, 3));
    }

    @Override // t1.b0
    public final int h(r1.q qVar, r1.p pVar, int i10) {
        long jG0 = G0(qVar);
        return m2.a.f(jG0) ? m2.a.h(jG0) : o1.s.p(pVar.X(i10), jG0);
    }
}
