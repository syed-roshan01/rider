package u;

/* JADX INFO: loaded from: classes.dex */
public final class p extends y0.n implements t1.s {
    public e1.g0 A;
    public e1.l0 B;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f14873u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public e1.n f14874v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f14875w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public e1.l0 f14876x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public d1.f f14877y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public m2.l f14878z;

    @Override // t1.s
    public final void i(g1.e eVar) {
        e1.g0 g0VarD;
        if (this.f14876x == e1.g0.f5008a) {
            if (!e1.r.c(this.f14873u, e1.r.f5065g)) {
                g1.g.U(eVar, this.f14873u, 0L, 0L, 126);
            }
            e1.n nVar = this.f14874v;
            if (nVar != null) {
                g1.g.Y(eVar, nVar, 0L, 0L, this.f14875w, null, 118);
            }
        } else {
            t1.i0 i0Var = (t1.i0) eVar;
            long jE = i0Var.f14447a.e();
            d1.f fVar = this.f14877y;
            int i10 = d1.f.f4346d;
            boolean z10 = fVar instanceof d1.f;
            g1.c cVar = i0Var.f14447a;
            if (z10 && jE == fVar.f4347a && i0Var.getLayoutDirection() == this.f14878z && d7.a.d(this.B, this.f14876x)) {
                g0VarD = this.A;
                d7.a.j(g0VarD);
            } else {
                g0VarD = this.f14876x.d(cVar.e(), i0Var.getLayoutDirection(), eVar);
            }
            boolean zC = e1.r.c(this.f14873u, e1.r.f5065g);
            g1.j jVar = g1.j.f6502a;
            if (!zC) {
                long j10 = this.f14873u;
                if (g0VarD instanceof e1.b0) {
                    d1.d dVar = ((e1.b0) g0VarD).f4990e;
                    i0Var.i0(j10, d9.i.f(dVar.f4332a, dVar.f4333b), d7.t.j(dVar.c(), dVar.b()), 1.0f, jVar, null, 3);
                } else {
                    if (!(g0VarD instanceof e1.c0)) {
                        throw new androidx.fragment.app.a0();
                    }
                    e1.c0 c0Var = (e1.c0) g0VarD;
                    e1.i iVar = c0Var.f4993f;
                    if (iVar != null) {
                        i0Var.f(iVar, j10, 1.0f, jVar, null, 3);
                    } else {
                        d1.e eVar2 = c0Var.f4992e;
                        float fB = d1.a.b(eVar2.f4343h);
                        i0Var.g(j10, d9.i.f(eVar2.f4336a, eVar2.f4337b), d7.t.j(eVar2.b(), eVar2.a()), f6.a.d(fB, fB), jVar, 1.0f, null, 3);
                    }
                }
            }
            e1.n nVar2 = this.f14874v;
            if (nVar2 != null) {
                float f10 = this.f14875w;
                if (g0VarD instanceof e1.b0) {
                    d1.d dVar2 = ((e1.b0) g0VarD).f4990e;
                    i0Var.k0(nVar2, d9.i.f(dVar2.f4332a, dVar2.f4333b), d7.t.j(dVar2.c(), dVar2.b()), f10, jVar, null, 3);
                } else {
                    if (!(g0VarD instanceof e1.c0)) {
                        throw new androidx.fragment.app.a0();
                    }
                    e1.c0 c0Var2 = (e1.c0) g0VarD;
                    e1.i iVar2 = c0Var2.f4993f;
                    if (iVar2 != null) {
                        i0Var.n0(iVar2, nVar2, f10, jVar, null, 3);
                    } else {
                        d1.e eVar3 = c0Var2.f4992e;
                        float fB2 = d1.a.b(eVar3.f4343h);
                        i0Var.s(nVar2, d9.i.f(eVar3.f4336a, eVar3.f4337b), d7.t.j(eVar3.b(), eVar3.a()), f6.a.d(fB2, fB2), f10, jVar, null, 3);
                    }
                }
            }
            this.A = g0VarD;
            this.f14877y = new d1.f(cVar.e());
            this.f14878z = i0Var.getLayoutDirection();
            this.B = this.f14876x;
        }
        ((t1.i0) eVar).a();
    }
}
