package r1;

/* JADX INFO: loaded from: classes.dex */
public final class h0 implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t1.r0 f13382a;

    public h0(t1.r0 r0Var) {
        this.f13382a = r0Var;
    }

    @Override // r1.s
    public final boolean L() {
        return this.f13382a.f14536p.K0().f16742t;
    }

    @Override // r1.s
    public final long M() {
        t1.r0 r0Var = this.f13382a;
        return o1.s.e(r0Var.f13423a, r0Var.f13424b);
    }

    @Override // r1.s
    public final long P(long j10) {
        return this.f13382a.f14536p.P(d1.c.g(j10, a()));
    }

    public final long a() {
        t1.r0 r0Var = this.f13382a;
        t1.r0 r0VarF = androidx.compose.ui.layout.a.f(r0Var);
        int i10 = d1.c.f4329e;
        long j10 = d1.c.f4326b;
        return d1.c.f(o(r0VarF.f14539s, j10), r0Var.f14536p.o(r0VarF.f14536p, j10));
    }

    @Override // r1.s
    public final d1.d b(s sVar, boolean z10) {
        return this.f13382a.f14536p.b(sVar, z10);
    }

    @Override // r1.s
    public final long h(long j10) {
        return d1.c.g(this.f13382a.f14536p.h(j10), a());
    }

    @Override // r1.s
    public final long i(long j10) {
        return this.f13382a.f14536p.i(d1.c.g(j10, a()));
    }

    @Override // r1.s
    public final s j() {
        t1.r0 r0VarI0;
        if (!L()) {
            throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
        }
        t1.c1 c1Var = this.f13382a.f14536p.f14395p.C.f14577c.f14397r;
        if (c1Var == null || (r0VarI0 = c1Var.I0()) == null) {
            return null;
        }
        return r0VarI0.f14539s;
    }

    @Override // r1.s
    public final long o(s sVar, long j10) {
        boolean z10 = sVar instanceof h0;
        t1.r0 r0Var = this.f13382a;
        if (!z10) {
            t1.r0 r0VarF = androidx.compose.ui.layout.a.f(r0Var);
            long jO = o(r0VarF.f14539s, j10);
            t1.c1 c1Var = r0VarF.f14536p;
            c1Var.getClass();
            int i10 = d1.c.f4329e;
            return d1.c.g(jO, c1Var.o(sVar, d1.c.f4326b));
        }
        t1.r0 r0Var2 = ((h0) sVar).f13382a;
        r0Var2.f14536p.R0();
        t1.r0 r0VarI0 = r0Var.f14536p.G0(r0Var2.f14536p).I0();
        if (r0VarI0 != null) {
            long jZ0 = r0Var2.z0(r0VarI0);
            long jC = i1.b.c(d7.t.p0(d1.c.d(j10)), d7.t.p0(d1.c.e(j10)));
            long jC2 = i1.b.c(((int) (jZ0 >> 32)) + ((int) (jC >> 32)), ((int) (jZ0 & 4294967295L)) + ((int) (jC & 4294967295L)));
            long jZ1 = r0Var.z0(r0VarI0);
            long jC3 = i1.b.c(((int) (jC2 >> 32)) - ((int) (jZ1 >> 32)), ((int) (jC2 & 4294967295L)) - ((int) (jZ1 & 4294967295L)));
            return d9.i.f((int) (jC3 >> 32), (int) (jC3 & 4294967295L));
        }
        t1.r0 r0VarF2 = androidx.compose.ui.layout.a.f(r0Var2);
        long jZ2 = r0Var2.z0(r0VarF2);
        long j11 = r0VarF2.f14537q;
        long jC4 = i1.b.c(((int) (jZ2 >> 32)) + ((int) (j11 >> 32)), ((int) (jZ2 & 4294967295L)) + ((int) (j11 & 4294967295L)));
        long jC5 = i1.b.c(d7.t.p0(d1.c.d(j10)), d7.t.p0(d1.c.e(j10)));
        long jC6 = i1.b.c(((int) (jC4 >> 32)) + ((int) (jC5 >> 32)), ((int) (jC4 & 4294967295L)) + ((int) (jC5 & 4294967295L)));
        long jZ3 = r0Var.z0(androidx.compose.ui.layout.a.f(r0Var));
        long j12 = androidx.compose.ui.layout.a.f(r0Var).f14537q;
        long jC7 = i1.b.c(((int) (jZ3 >> 32)) + ((int) (j12 >> 32)), ((int) (jZ3 & 4294967295L)) + ((int) (j12 & 4294967295L)));
        long jC8 = i1.b.c(((int) (jC6 >> 32)) - ((int) (jC7 >> 32)), ((int) (jC6 & 4294967295L)) - ((int) (jC7 & 4294967295L)));
        t1.c1 c1Var2 = androidx.compose.ui.layout.a.f(r0Var).f14536p.f14397r;
        d7.a.j(c1Var2);
        t1.c1 c1Var3 = r0VarF2.f14536p.f14397r;
        d7.a.j(c1Var3);
        return c1Var2.o(c1Var3, d9.i.f((int) (jC8 >> 32), (int) (jC8 & 4294967295L)));
    }

    @Override // r1.s
    public final void x(s sVar, float[] fArr) {
        this.f13382a.f14536p.x(sVar, fArr);
    }
}
