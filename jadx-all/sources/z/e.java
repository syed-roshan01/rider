package z;

import r1.a1;

/* JADX INFO: loaded from: classes.dex */
public final class e implements a0.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f17034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17035b;

    public e(g0 g0Var, int i10) {
        this.f17034a = g0Var;
        this.f17035b = i10;
    }

    @Override // a0.n
    public final int c() {
        return ((w) ((u) this.f17034a.f17048d.getValue())).f17159j;
    }

    @Override // a0.n
    public final int d() {
        return Math.min(c() - 1, ((x) ((k) r8.p.L0(((w) ((u) this.f17034a.f17048d.getValue())).f17156g))).f17161a + this.f17035b);
    }

    @Override // a0.n
    public final boolean e() {
        return !((w) ((u) this.f17034a.f17048d.getValue())).f17156g.isEmpty();
    }

    @Override // a0.n
    public final void f() {
        a1 a1Var = this.f17034a.f17057m;
        if (a1Var != null) {
            ((androidx.compose.ui.node.a) a1Var).j();
        }
    }

    @Override // a0.n
    public final int g() {
        return Math.max(0, this.f17034a.f17047c.f17180a.d() - this.f17035b);
    }
}
