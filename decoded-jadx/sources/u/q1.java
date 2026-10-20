package u;

import android.view.View;
import m0.o3;

/* JADX INFO: loaded from: classes.dex */
public final class q1 extends y0.n implements t1.m, t1.t, t1.s, t1.r1, t1.f1 {
    public float A;
    public float B;
    public boolean C;
    public d2 D;
    public View E;
    public m2.b F;
    public c2 G;
    public final m0.n1 H;
    public long I;
    public m2.k J;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public c9.c f14900u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public c9.c f14901v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public c9.c f14902w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f14903x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f14904y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f14905z;

    public q1(c9.c cVar, c9.c cVar2, c9.c cVar3, float f10, boolean z10, long j10, float f11, float f12, boolean z11, d2 d2Var) {
        this.f14900u = cVar;
        this.f14901v = cVar2;
        this.f14902w = cVar3;
        this.f14903x = f10;
        this.f14904y = z10;
        this.f14905z = j10;
        this.A = f11;
        this.B = f12;
        this.C = z11;
        this.D = d2Var;
        long j11 = d1.c.f4328d;
        this.H = d7.t.g0(new d1.c(j11), o3.f11621a);
        this.I = j11;
    }

    @Override // y0.n
    public final void A0() {
        c2 c2Var = this.G;
        if (c2Var != null) {
            ((e2) c2Var).b();
        }
        this.G = null;
    }

    @Override // t1.f1
    public final void G() {
        t1.g.w(this, new o1(this, 1));
    }

    public final void G0() {
        m2.b bVar;
        c2 c2Var = this.G;
        if (c2Var != null) {
            ((e2) c2Var).b();
        }
        View view = this.E;
        if (view == null || (bVar = this.F) == null) {
            return;
        }
        this.G = this.D.b(view, this.f14904y, this.f14905z, this.A, this.B, this.C, bVar, this.f14903x);
        I0();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006c  */
    public final void H0() {
        m2.b bVar;
        long jG;
        c2 c2Var = this.G;
        if (c2Var == null || (bVar = this.F) == null) {
            return;
        }
        long j10 = ((d1.c) this.f14900u.invoke(bVar)).f4330a;
        m0.n1 n1Var = this.H;
        long jG2 = (d9.i.u(((d1.c) n1Var.getValue()).f4330a) && d9.i.u(j10)) ? d1.c.g(((d1.c) n1Var.getValue()).f4330a, j10) : d1.c.f4328d;
        this.I = jG2;
        if (!d9.i.u(jG2)) {
            ((e2) c2Var).b();
            return;
        }
        c9.c cVar = this.f14901v;
        if (cVar != null) {
            long j11 = ((d1.c) cVar.invoke(bVar)).f4330a;
            d1.c cVar2 = new d1.c(j11);
            if (!d9.i.u(j11)) {
                cVar2 = null;
            }
            if (cVar2 != null) {
                jG = d1.c.g(((d1.c) n1Var.getValue()).f4330a, cVar2.f4330a);
            } else {
                jG = d1.c.f4328d;
            }
        } else {
            jG = d1.c.f4328d;
        }
        c2Var.a(this.I, jG, this.f14903x);
        I0();
    }

    public final void I0() {
        m2.b bVar;
        c2 c2Var = this.G;
        if (c2Var == null || (bVar = this.F) == null) {
            return;
        }
        e2 e2Var = (e2) c2Var;
        long jC = e2Var.c();
        m2.k kVar = this.J;
        if ((kVar instanceof m2.k) && jC == kVar.f11814a) {
            return;
        }
        c9.c cVar = this.f14902w;
        if (cVar != null) {
            cVar.invoke(new m2.g(bVar.u(o1.s.m0(e2Var.c()))));
        }
        this.J = new m2.k(e2Var.c());
    }

    @Override // t1.r1
    public final void Q(y1.j jVar) {
        jVar.k(r1.f14919a, new o1(this, 0));
    }

    @Override // t1.s
    public final void i(g1.e eVar) {
        ((t1.i0) eVar).a();
        z6.a.Q(v0(), null, 0, new p1(this, null), 3);
    }

    @Override // t1.t
    public final void r0(t1.c1 c1Var) {
        this.H.setValue(new d1.c(c1Var.P(d1.c.f4326b)));
    }

    @Override // y0.n
    public final void z0() {
        G();
    }
}
