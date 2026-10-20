package h0;

import f0.c2;
import f0.d2;
import f0.k1;

/* JADX INFO: loaded from: classes.dex */
public final class t0 implements k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v0 f7463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f7464b;

    public t0(v0 v0Var, boolean z10) {
        this.f7463a = v0Var;
        this.f7464b = z10;
    }

    @Override // f0.k1
    public final void c() {
    }

    @Override // f0.k1
    public final void d() {
        v0 v0Var = this.f7463a;
        v0.b(v0Var, null);
        v0.a(v0Var, null);
        v0Var.p(true);
    }

    @Override // f0.k1
    public final void e() {
        v0 v0Var = this.f7463a;
        v0.b(v0Var, null);
        v0.a(v0Var, null);
        v0Var.p(true);
    }

    @Override // f0.k1
    public final void f(long j10) {
    }

    @Override // f0.k1
    public final void g() {
        d2 d2VarD;
        boolean z10 = this.f7464b;
        f0.n0 n0Var = z10 ? f0.n0.f5824b : f0.n0.f5825c;
        v0 v0Var = this.f7463a;
        v0.b(v0Var, n0Var);
        long j10 = v0Var.j(z10);
        float f10 = d0.f7374a;
        long jF = d9.i.f(d1.c.d(j10), d1.c.e(j10) - 1.0f);
        c2 c2Var = v0Var.f7475d;
        if (c2Var == null || (d2VarD = c2Var.d()) == null) {
            return;
        }
        long jE = d2VarD.e(jF);
        v0Var.f7483l = jE;
        v0Var.f7487p.setValue(new d1.c(jE));
        v0Var.f7485n = d1.c.f4326b;
        v0Var.f7488q = -1;
        c2 c2Var2 = v0Var.f7475d;
        if (c2Var2 != null) {
            c2Var2.f5652q.setValue(Boolean.TRUE);
        }
        v0Var.p(false);
    }

    @Override // f0.k1
    public final void h(long j10) {
        v0 v0Var = this.f7463a;
        long jG = d1.c.g(v0Var.f7485n, j10);
        v0Var.f7485n = jG;
        v0Var.f7487p.setValue(new d1.c(d1.c.g(v0Var.f7483l, jG)));
        g2.a0 a0VarK = v0Var.k();
        d1.c cVarI = v0Var.i();
        d7.a.j(cVarI);
        v0.c(v0Var, a0VarK, cVarI.f4330a, false, this.f7464b, r.f7453d, true);
        v0Var.p(false);
    }
}
