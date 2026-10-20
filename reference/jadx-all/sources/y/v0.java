package y;

/* JADX INFO: loaded from: classes.dex */
public final class v0 extends y0.n implements t1.b0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public t0 f16686u;

    @Override // t1.b0
    public final r1.k0 f(r1.l0 l0Var, r1.i0 i0Var, long j10) {
        float f10 = 0;
        if (Float.compare(this.f16686u.a(l0Var.getLayoutDirection()), f10) < 0 || Float.compare(this.f16686u.d(), f10) < 0 || Float.compare(this.f16686u.b(l0Var.getLayoutDirection()), f10) < 0 || Float.compare(this.f16686u.c(), f10) < 0) {
            throw new IllegalArgumentException("Padding must be non-negative".toString());
        }
        int iJ = l0Var.J(this.f16686u.b(l0Var.getLayoutDirection())) + l0Var.J(this.f16686u.a(l0Var.getLayoutDirection()));
        int iJ2 = l0Var.J(this.f16686u.c()) + l0Var.J(this.f16686u.d());
        r1.x0 x0VarF = i0Var.f(o1.s.a0(j10, -iJ, -iJ2));
        return l0Var.N(o1.s.q(x0VarF.f13423a + iJ, j10), o1.s.p(x0VarF.f13424b + iJ2, j10), r8.s.f13662a, new b.g(x0VarF, l0Var, this, 8));
    }
}
