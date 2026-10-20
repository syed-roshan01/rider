package y;

/* JADX INFO: loaded from: classes.dex */
public final class b extends y0.n implements t1.b0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public r1.a f16513u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f16514v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f16515w;

    @Override // t1.b0
    public final r1.k0 f(r1.l0 l0Var, r1.i0 i0Var, long j10) {
        r1.a aVar = this.f16513u;
        float f10 = this.f16514v;
        float f11 = this.f16515w;
        boolean z10 = aVar instanceof r1.o;
        r1.x0 x0VarF = i0Var.f(z10 ? m2.a.b(j10, 0, 0, 0, 0, 11) : m2.a.b(j10, 0, 0, 0, 0, 14));
        int iP = x0VarF.p(aVar);
        if (iP == Integer.MIN_VALUE) {
            iP = 0;
        }
        int i10 = z10 ? x0VarF.f13424b : x0VarF.f13423a;
        int iH = (z10 ? m2.a.h(j10) : m2.a.i(j10)) - i10;
        int iR = z6.a.r((!m2.e.a(f10, Float.NaN) ? l0Var.J(f10) : 0) - iP, 0, iH);
        int iR2 = z6.a.r(((!m2.e.a(f11, Float.NaN) ? l0Var.J(f11) : 0) - i10) + iP, 0, iH - iR);
        int iMax = z10 ? x0VarF.f13423a : Math.max(x0VarF.f13423a + iR + iR2, m2.a.k(j10));
        int iMax2 = z10 ? Math.max(x0VarF.f13424b + iR + iR2, m2.a.j(j10)) : x0VarF.f13424b;
        return l0Var.N(iMax, iMax2, r8.s.f13662a, new a(aVar, f10, iR, iMax, iR2, x0VarF, iMax2));
    }
}
