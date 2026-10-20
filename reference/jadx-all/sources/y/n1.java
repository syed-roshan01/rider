package y;

/* JADX INFO: loaded from: classes.dex */
public final class n1 extends y0.n implements t1.b0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f16645u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f16646v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public c9.e f16647w;

    @Override // t1.b0
    public final r1.k0 f(r1.l0 l0Var, r1.i0 i0Var, long j10) {
        r1.x0 x0VarF = i0Var.f(o1.s.a(this.f16645u != 1 ? 0 : m2.a.k(j10), (this.f16645u == 1 || !this.f16646v) ? m2.a.i(j10) : Integer.MAX_VALUE, this.f16645u == 2 ? m2.a.j(j10) : 0, (this.f16645u == 2 || !this.f16646v) ? m2.a.h(j10) : Integer.MAX_VALUE));
        int iR = z6.a.r(x0VarF.f13423a, m2.a.k(j10), m2.a.i(j10));
        int iR2 = z6.a.r(x0VarF.f13424b, m2.a.j(j10), m2.a.h(j10));
        return l0Var.N(iR, iR2, r8.s.f13662a, new m1(this, iR, x0VarF, iR2, l0Var));
    }
}
