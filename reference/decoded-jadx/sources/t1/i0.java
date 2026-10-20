package t1;

import android.graphics.Paint;

/* JADX INFO: loaded from: classes.dex */
public final class i0 implements g1.g, g1.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g1.c f14447a = new g1.c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s f14448b;

    @Override // g1.g
    public final g1.b A() {
        return this.f14447a.f6497b;
    }

    @Override // m2.b
    public final int E(long j10) {
        return this.f14447a.E(j10);
    }

    @Override // m2.b
    public final float F(long j10) {
        return this.f14447a.F(j10);
    }

    @Override // g1.g
    public final void I(e1.y yVar, long j10, long j11, long j12, long j13, float f10, g1.h hVar, e1.l lVar, int i10, int i11) {
        this.f14447a.I(yVar, j10, j11, j12, j13, f10, hVar, lVar, i10, i11);
    }

    @Override // m2.b
    public final int J(float f10) {
        return this.f14447a.J(f10);
    }

    @Override // g1.g
    public final long O() {
        return this.f14447a.O();
    }

    @Override // m2.b
    public final long S(long j10) {
        return this.f14447a.S(j10);
    }

    @Override // g1.g
    public final void T(e1.y yVar, long j10, float f10, g1.h hVar, e1.l lVar, int i10) {
        this.f14447a.T(yVar, j10, f10, hVar, lVar, i10);
    }

    @Override // g1.g
    public final void W(e1.e0 e0Var, float f10, long j10, float f11, g1.h hVar, e1.l lVar, int i10) {
        this.f14447a.W(e0Var, f10, j10, f11, hVar, lVar, i10);
    }

    @Override // m2.b
    public final float Z(long j10) {
        return this.f14447a.Z(j10);
    }

    public final void a() {
        e1.p pVarA = this.f14447a.f6497b.a();
        n nVar = this.f14448b;
        d7.a.j(nVar);
        y0.n nVar2 = (y0.n) nVar;
        y0.n nVarF = nVar2.f16730a.f16735f;
        if (nVarF != null && (nVarF.f16733d & 4) != 0) {
            while (true) {
                if (nVarF != null) {
                    int i10 = nVarF.f16732c;
                    if ((i10 & 2) == 0) {
                        if ((i10 & 4) != 0) {
                            break;
                        } else {
                            nVarF = nVarF.f16735f;
                        }
                    }
                }
                nVarF = null;
                break;
            }
        } else {
            nVarF = null;
            break;
        }
        if (nVarF == null) {
            c1 c1VarX = g.x(nVar, 4);
            if (c1VarX.K0() == nVar2.f16730a) {
                c1VarX = c1VarX.f14396q;
                d7.a.j(c1VarX);
            }
            c1VarX.U0(pVarA);
            return;
        }
        o0.i iVar = null;
        while (nVarF != null) {
            if (nVarF instanceof s) {
                s sVar = (s) nVarF;
                c1 c1VarX2 = g.x(sVar, 4);
                long jM0 = o1.s.m0(c1VarX2.f13425c);
                androidx.compose.ui.node.a aVar = c1VarX2.f14395p;
                aVar.getClass();
                ((u1.w) g.z(aVar)).getSharedDrawScope().b(pVarA, jM0, c1VarX2, sVar);
            } else if ((nVarF.f16732c & 4) != 0 && (nVarF instanceof o)) {
                int i11 = 0;
                for (y0.n nVar3 = ((o) nVarF).f14521v; nVar3 != null; nVar3 = nVar3.f16735f) {
                    if ((nVar3.f16732c & 4) != 0) {
                        i11++;
                        if (i11 == 1) {
                            nVarF = nVar3;
                        } else {
                            if (iVar == null) {
                                iVar = new o0.i(new y0.n[16]);
                            }
                            if (nVarF != null) {
                                iVar.c(nVarF);
                                nVarF = null;
                            }
                            iVar.c(nVar3);
                        }
                    }
                }
                if (i11 == 1) {
                }
            }
            nVarF = g.f(iVar);
        }
    }

    public final void b(e1.p pVar, long j10, c1 c1Var, s sVar) {
        s sVar2 = this.f14448b;
        this.f14448b = sVar;
        m2.l lVar = c1Var.f14395p.f1753y;
        g1.c cVar = this.f14447a;
        g1.a aVar = cVar.f6496a;
        m2.b bVar = aVar.f6490a;
        m2.l lVar2 = aVar.f6491b;
        e1.p pVar2 = aVar.f6492c;
        long j11 = aVar.f6493d;
        aVar.f6490a = c1Var;
        aVar.f6491b = lVar;
        aVar.f6492c = pVar;
        aVar.f6493d = j10;
        pVar.j();
        sVar.i(this);
        pVar.h();
        g1.a aVar2 = cVar.f6496a;
        aVar2.f6490a = bVar;
        aVar2.f6491b = lVar2;
        aVar2.f6492c = pVar2;
        aVar2.f6493d = j11;
        this.f14448b = sVar2;
    }

    @Override // m2.b
    public final float c() {
        return this.f14447a.c();
    }

    public final void d(e1.n nVar, long j10, long j11, float f10, int i10, float f11, e1.l lVar, int i11) {
        g1.c cVar = this.f14447a;
        e1.p pVar = cVar.f6496a.f6492c;
        e1.g gVarF = cVar.f6499d;
        if (gVarF == null) {
            gVarF = androidx.compose.ui.graphics.a.f();
            gVarF.l(1);
            cVar.f6499d = gVarF;
        }
        if (nVar != null) {
            nVar.a(f11, cVar.e(), gVarF);
        } else if (gVarF.f5004a.getAlpha() / 255.0f != f11) {
            gVarF.c(f11);
        }
        if (!d7.a.d(gVarF.f5007d, lVar)) {
            gVarF.f(lVar);
        }
        if (!e1.g0.b(gVarF.f5005b, i11)) {
            gVarF.d(i11);
        }
        Paint paint = gVarF.f5004a;
        if (paint.getStrokeWidth() != f10) {
            gVarF.k(f10);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            gVarF.f5004a.setStrokeMiter(4.0f);
        }
        if (!e1.g0.f(gVarF.a(), i10)) {
            gVarF.i(i10);
        }
        if (!e1.g0.g(gVarF.b(), 0)) {
            gVarF.j(0);
        }
        if (!d7.a.d(null, null)) {
            gVarF.f5004a.setPathEffect(null);
        }
        if (!e1.g0.d(paint.isFilterBitmap() ? 1 : 0, 1)) {
            gVarF.g(1);
        }
        pVar.g(j10, j11, gVarF);
    }

    @Override // g1.g
    public final long e() {
        return this.f14447a.e();
    }

    @Override // m2.b
    public final long e0(float f10) {
        return this.f14447a.e0(f10);
    }

    public final void f(e1.i iVar, long j10, float f10, g1.h hVar, e1.l lVar, int i10) {
        this.f14447a.d(iVar, j10, f10, hVar, lVar, i10);
    }

    @Override // g1.g
    public final void f0(long j10, float f10, float f11, long j11, long j12, float f12, g1.h hVar, e1.l lVar, int i10) {
        this.f14447a.f0(j10, f10, f11, j11, j12, f12, hVar, lVar, i10);
    }

    public final void g(long j10, long j11, long j12, long j13, g1.h hVar, float f10, e1.l lVar, int i10) {
        g1.c cVar = this.f14447a;
        cVar.f6496a.f6492c.l(d1.c.d(j11), d1.c.e(j11), d1.f.d(j12) + d1.c.d(j11), d1.f.b(j12) + d1.c.e(j11), d1.a.b(j13), d1.a.c(j13), g1.c.a(cVar, j10, hVar, f10, lVar, i10));
    }

    @Override // g1.g
    public final m2.l getLayoutDirection() {
        return this.f14447a.f6496a.f6491b;
    }

    @Override // g1.g
    public final void i0(long j10, long j11, long j12, float f10, g1.h hVar, e1.l lVar, int i10) {
        this.f14447a.i0(j10, j11, j12, f10, hVar, lVar, i10);
    }

    @Override // g1.g
    public final void k0(e1.n nVar, long j10, long j11, float f10, g1.h hVar, e1.l lVar, int i10) {
        this.f14447a.k0(nVar, j10, j11, f10, hVar, lVar, i10);
    }

    @Override // m2.b
    public final float m() {
        return this.f14447a.m();
    }

    @Override // g1.g
    public final void n0(e1.d0 d0Var, e1.n nVar, float f10, g1.h hVar, e1.l lVar, int i10) {
        this.f14447a.n0(d0Var, nVar, f10, hVar, lVar, i10);
    }

    @Override // m2.b
    public final float o0(int i10) {
        return this.f14447a.o0(i10);
    }

    @Override // g1.g
    public final void p0(long j10, long j11, long j12, float f10, int i10, float f11, e1.l lVar, int i11) {
        this.f14447a.p0(j10, j11, j12, f10, i10, f11, lVar, i11);
    }

    @Override // m2.b
    public final float q0(float f10) {
        return f10 / this.f14447a.c();
    }

    @Override // g1.g
    public final void s(e1.n nVar, long j10, long j11, long j12, float f10, g1.h hVar, e1.l lVar, int i10) {
        this.f14447a.s(nVar, j10, j11, j12, f10, hVar, lVar, i10);
    }

    @Override // m2.b
    public final long t(float f10) {
        return this.f14447a.t(f10);
    }

    @Override // m2.b
    public final long u(long j10) {
        return this.f14447a.u(j10);
    }

    @Override // g1.g
    public final void u0(long j10, float f10, long j11, float f11, g1.h hVar, e1.l lVar, int i10) {
        this.f14447a.u0(j10, f10, j11, f11, hVar, lVar, i10);
    }

    @Override // m2.b
    public final float v(float f10) {
        return this.f14447a.c() * f10;
    }
}
