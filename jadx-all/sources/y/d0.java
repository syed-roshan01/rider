package y;

/* JADX INFO: loaded from: classes.dex */
public final class d0 extends y0.n implements t1.b0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f16529u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f16530v;

    @Override // t1.b0
    public final r1.k0 f(r1.l0 l0Var, r1.i0 i0Var, long j10) {
        int iK;
        int i10;
        int iH;
        int iR;
        if (!m2.a.e(j10) || this.f16529u == 1) {
            iK = m2.a.k(j10);
            i10 = m2.a.i(j10);
        } else {
            iK = z6.a.r(d7.t.p0(m2.a.i(j10) * this.f16530v), m2.a.k(j10), m2.a.i(j10));
            i10 = iK;
        }
        if (!m2.a.d(j10) || this.f16529u == 2) {
            int iJ = m2.a.j(j10);
            iH = m2.a.h(j10);
            iR = iJ;
        } else {
            iR = z6.a.r(d7.t.p0(m2.a.h(j10) * this.f16530v), m2.a.j(j10), m2.a.h(j10));
            iH = iR;
        }
        r1.x0 x0VarF = i0Var.f(o1.s.a(iK, i10, iR, iH));
        return l0Var.N(x0VarF.f13423a, x0VarF.f13424b, r8.s.f13662a, new s.z(x0VarF, 2));
    }
}
