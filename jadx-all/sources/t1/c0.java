package t1;

/* JADX INFO: loaded from: classes.dex */
public final class c0 extends c1 {
    public static final e1.g P;
    public b0 N;
    public r0 O;

    static {
        e1.g gVarF = androidx.compose.ui.graphics.a.f();
        int i10 = e1.r.f5066h;
        gVarF.e(e1.r.f5063e);
        gVarF.k(1.0f);
        gVarF.l(1);
        P = gVarF;
    }

    public c0(androidx.compose.ui.node.a aVar, b0 b0Var) {
        super(aVar);
        this.N = b0Var;
        this.O = aVar.f1738c != null ? new w(this) : null;
    }

    @Override // t1.c1
    public final void F0() {
        if (this.O == null) {
            this.O = new w(this);
        }
    }

    @Override // t1.c1
    public final r0 I0() {
        return this.O;
    }

    @Override // t1.c1
    public final y0.n K0() {
        return ((y0.n) this.N).f16730a;
    }

    @Override // r1.p
    public final int Q(int i10) {
        b0 b0Var = this.N;
        c1 c1Var = this.f14396q;
        d7.a.j(c1Var);
        return b0Var.d(this, c1Var, i10);
    }

    @Override // t1.c1
    public final void U0(e1.p pVar) {
        c1 c1Var = this.f14396q;
        d7.a.j(c1Var);
        c1Var.C0(pVar);
        if (((u1.w) g.z(this.f14395p)).getShowLayoutBounds()) {
            D0(pVar, P);
        }
    }

    @Override // r1.p
    public final int V(int i10) {
        b0 b0Var = this.N;
        c1 c1Var = this.f14396q;
        d7.a.j(c1Var);
        return b0Var.b(this, c1Var, i10);
    }

    @Override // r1.p
    public final int X(int i10) {
        b0 b0Var = this.N;
        c1 c1Var = this.f14396q;
        d7.a.j(c1Var);
        return b0Var.h(this, c1Var, i10);
    }

    @Override // r1.x0
    public final void d0(long j10, float f10, c9.c cVar) {
        V0(j10, f10, cVar);
        if (this.f14531f) {
            return;
        }
        T0();
        s0().e();
    }

    @Override // r1.i0
    public final r1.x0 f(long j10) {
        h0(j10);
        b0 b0Var = this.N;
        c1 c1Var = this.f14396q;
        d7.a.j(c1Var);
        X0(b0Var.f(this, c1Var, j10));
        S0();
        return this;
    }

    @Override // r1.p
    public final int g(int i10) {
        b0 b0Var = this.N;
        c1 c1Var = this.f14396q;
        d7.a.j(c1Var);
        return b0Var.a(this, c1Var, i10);
    }

    @Override // t1.q0
    public final int j0(r1.a aVar) {
        r0 r0Var = this.O;
        if (r0Var == null) {
            return g.c(this, aVar);
        }
        Integer num = (Integer) r0Var.f14541u.get(aVar);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }
}
