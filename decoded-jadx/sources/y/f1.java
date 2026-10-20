package y;

/* JADX INFO: loaded from: classes.dex */
public final class f1 extends y0.n implements t1.b0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f16542u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f16543v;

    @Override // t1.b0
    public final int a(r1.q qVar, r1.p pVar, int i10) {
        int iG = pVar.g(i10);
        int iJ = !m2.e.a(this.f16543v, Float.NaN) ? qVar.J(this.f16543v) : 0;
        return iG < iJ ? iJ : iG;
    }

    @Override // t1.b0
    public final int b(r1.q qVar, r1.p pVar, int i10) {
        int iV = pVar.V(i10);
        int iJ = !m2.e.a(this.f16542u, Float.NaN) ? qVar.J(this.f16542u) : 0;
        return iV < iJ ? iJ : iV;
    }

    @Override // t1.b0
    public final int d(r1.q qVar, r1.p pVar, int i10) {
        int iQ = pVar.Q(i10);
        int iJ = !m2.e.a(this.f16542u, Float.NaN) ? qVar.J(this.f16542u) : 0;
        return iQ < iJ ? iJ : iQ;
    }

    @Override // t1.b0
    public final r1.k0 f(r1.l0 l0Var, r1.i0 i0Var, long j10) {
        int iK;
        int iJ = 0;
        if (m2.e.a(this.f16542u, Float.NaN) || m2.a.k(j10) != 0) {
            iK = m2.a.k(j10);
        } else {
            iK = l0Var.J(this.f16542u);
            int i10 = m2.a.i(j10);
            if (iK > i10) {
                iK = i10;
            }
            if (iK < 0) {
                iK = 0;
            }
        }
        int i11 = m2.a.i(j10);
        if (m2.e.a(this.f16543v, Float.NaN) || m2.a.j(j10) != 0) {
            iJ = m2.a.j(j10);
        } else {
            int iJ2 = l0Var.J(this.f16543v);
            int iH = m2.a.h(j10);
            if (iJ2 > iH) {
                iJ2 = iH;
            }
            if (iJ2 >= 0) {
                iJ = iJ2;
            }
        }
        r1.x0 x0VarF = i0Var.f(o1.s.a(iK, i11, iJ, m2.a.h(j10)));
        return l0Var.N(x0VarF.f13423a, x0VarF.f13424b, r8.s.f13662a, new s.z(x0VarF, 4));
    }

    @Override // t1.b0
    public final int h(r1.q qVar, r1.p pVar, int i10) {
        int iX = pVar.X(i10);
        int iJ = !m2.e.a(this.f16543v, Float.NaN) ? qVar.J(this.f16543v) : 0;
        return iX < iJ ? iJ : iX;
    }
}
