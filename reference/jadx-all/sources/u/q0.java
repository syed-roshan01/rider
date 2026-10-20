package u;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class q0 extends t1.o implements c1.c, t1.a0, t1.r1, t1.t {
    public final w0 A;
    public final c0.f B;
    public final c0.g C;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public c1.o f14896w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final t0 f14897x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final o0 f14898y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final s0 f14899z;

    public q0(x.m mVar) {
        t0 t0Var = new t0();
        new LinkedHashMap();
        G0(t0Var);
        this.f14897x = t0Var;
        o0 o0Var = new o0();
        o0Var.f14868u = mVar;
        G0(o0Var);
        this.f14898y = o0Var;
        s0 s0Var = new s0();
        G0(s0Var);
        this.f14899z = s0Var;
        w0 w0Var = new w0();
        G0(w0Var);
        this.A = w0Var;
        c0.f fVar = new c0.f();
        this.B = fVar;
        c0.g gVar = new c0.g(fVar);
        G0(gVar);
        this.C = gVar;
    }

    @Override // t1.r1
    public final void Q(y1.j jVar) {
        this.f14897x.Q(jVar);
    }

    @Override // t1.a0
    public final void R(t1.c1 c1Var) {
        this.C.f2843v = c1Var;
    }

    @Override // c1.c
    public final void a0(c1.o oVar) {
        if (d7.a.d(this.f14896w, oVar)) {
            return;
        }
        boolean zA = oVar.a();
        int i10 = 0;
        a0.z zVar = null;
        if (zA) {
            z6.a.Q(v0(), null, 0, new p0(this, null), 3);
        }
        if (this.f16742t) {
            t1.g.u(this);
        }
        o0 o0Var = this.f14898y;
        x.m mVar = o0Var.f14868u;
        if (mVar != null) {
            if (zA) {
                x.d dVar = o0Var.f14869v;
                if (dVar != null) {
                    o0Var.G0(mVar, new x.e(dVar));
                    o0Var.f14869v = null;
                }
                x.d dVar2 = new x.d();
                o0Var.G0(mVar, dVar2);
                o0Var.f14869v = dVar2;
            } else {
                x.d dVar3 = o0Var.f14869v;
                if (dVar3 != null) {
                    o0Var.G0(mVar, new x.e(dVar3));
                    o0Var.f14869v = null;
                }
            }
        }
        w0 w0Var = this.A;
        if (zA != w0Var.f14969u) {
            if (zA) {
                r1.s sVar = w0Var.f14970v;
                if (sVar != null && sVar.L()) {
                    c9.c cVar = w0Var.f16742t ? (c9.c) w0Var.g(v0.f14964a) : null;
                    if (cVar != null) {
                        cVar.invoke(w0Var.f14970v);
                    }
                }
            } else {
                c9.c cVar2 = w0Var.f16742t ? (c9.c) w0Var.g(v0.f14964a) : null;
                if (cVar2 != null) {
                    cVar2.invoke(null);
                }
            }
            w0Var.f14969u = zA;
        }
        s0 s0Var = this.f14899z;
        if (zA) {
            s0Var.getClass();
            d9.u uVar = new d9.u();
            t1.g.w(s0Var, new r0(i10, uVar, s0Var));
            a0.z zVar2 = (a0.z) uVar.f4952a;
            if (zVar2 != null) {
                zVar2.a();
                zVar = zVar2;
            }
            s0Var.f14926u = zVar;
        } else {
            a0.z zVar3 = s0Var.f14926u;
            if (zVar3 != null) {
                zVar3.b();
            }
            s0Var.f14926u = null;
        }
        s0Var.f14927v = zA;
        this.f14897x.f14935u = zA;
        this.f14896w = oVar;
    }

    @Override // t1.t
    public final void r0(t1.c1 c1Var) {
        this.A.r0(c1Var);
    }
}
