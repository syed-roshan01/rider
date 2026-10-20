package y;

/* JADX INFO: loaded from: classes.dex */
public final class s0 extends y0.n implements t1.b0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f16676u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f16677v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f16678w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f16679x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f16680y;

    @Override // t1.b0
    public final r1.k0 f(r1.l0 l0Var, r1.i0 i0Var, long j10) {
        int iJ = l0Var.J(this.f16678w) + l0Var.J(this.f16676u);
        int iJ2 = l0Var.J(this.f16679x) + l0Var.J(this.f16677v);
        r1.x0 x0VarF = i0Var.f(o1.s.a0(j10, -iJ, -iJ2));
        return l0Var.N(o1.s.q(x0VarF.f13423a + iJ, j10), o1.s.p(x0VarF.f13424b + iJ2, j10), r8.s.f13662a, new b.g(this, x0VarF, l0Var, 7));
    }
}
