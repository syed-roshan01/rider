package b0;

import r1.a1;

/* JADX INFO: loaded from: classes.dex */
public final class k implements a0.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f2423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2424b;

    public k(int i10, h0 h0Var) {
        this.f2423a = h0Var;
        this.f2424b = i10;
    }

    @Override // a0.n
    public final int c() {
        return this.f2423a.k();
    }

    @Override // a0.n
    public final int d() {
        h0 h0Var = this.f2423a;
        return Math.min(h0Var.k() - 1, ((g) ((h) r8.p.L0(((x) h0Var.j()).f2493a))).f2375a + this.f2424b);
    }

    @Override // a0.n
    public final boolean e() {
        return !((x) this.f2423a.j()).f2493a.isEmpty();
    }

    @Override // a0.n
    public final void f() {
        a1 a1Var = (a1) this.f2423a.f2416x.getValue();
        if (a1Var != null) {
            ((androidx.compose.ui.node.a) a1Var).j();
        }
    }

    @Override // a0.n
    public final int g() {
        return Math.max(0, this.f2423a.f2398f - this.f2424b);
    }
}
