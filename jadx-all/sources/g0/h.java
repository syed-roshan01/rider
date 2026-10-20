package g0;

import a2.a0;
import a2.c0;
import a2.x;
import a2.z;
import d7.t;
import java.util.List;
import java.util.Map;
import m0.n1;
import m0.o3;
import m2.l;
import m9.e0;
import r1.i0;
import r1.k0;
import r1.p;
import r1.q;
import r1.x0;
import r8.v;
import t.l0;
import t1.b0;
import t1.r1;
import t1.s;
import y0.n;
import y1.r;
import y1.u;

/* JADX INFO: loaded from: classes.dex */
public final class h extends n implements b0, s, r1 {
    public int A;
    public int B;
    public List C;
    public c9.c D;
    public Map E;
    public d F;
    public g G;
    public final n1 H = t.g0(null, o3.f11621a);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public a2.e f6472u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public c0 f6473v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public f2.d f6474w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public c9.c f6475x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f6476y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f6477z;

    public h(a2.e eVar, c0 c0Var, f2.d dVar, c9.c cVar, int i10, boolean z10, int i11, int i12, List list, c9.c cVar2) {
        this.f6472u = eVar;
        this.f6473v = c0Var;
        this.f6474w = dVar;
        this.f6475x = cVar;
        this.f6476y = i10;
        this.f6477z = z10;
        this.A = i11;
        this.B = i12;
        this.C = list;
        this.D = cVar2;
    }

    public final void G0(boolean z10, boolean z11, boolean z12, boolean z13) {
        if (this.f16742t) {
            if (z11 || (z10 && this.G != null)) {
                t1.g.u(this);
            }
            if (z11 || z12 || z13) {
                d dVarH0 = H0();
                a2.e eVar = this.f6472u;
                c0 c0Var = this.f6473v;
                f2.d dVar = this.f6474w;
                int i10 = this.f6476y;
                boolean z14 = this.f6477z;
                int i11 = this.A;
                int i12 = this.B;
                List list = this.C;
                dVarH0.f6432a = eVar;
                dVarH0.f6433b = c0Var;
                dVarH0.f6434c = dVar;
                dVarH0.f6435d = i10;
                dVarH0.f6436e = z14;
                dVarH0.f6437f = i11;
                dVarH0.f6438g = i12;
                dVarH0.f6439h = list;
                dVarH0.f6443l = null;
                dVarH0.f6445n = null;
                dVarH0.f6447p = -1;
                dVarH0.f6446o = -1;
                t1.g.t(this);
                t1.g.s(this);
            }
            if (z10) {
                t1.g.s(this);
            }
        }
    }

    public final d H0() {
        if (this.F == null) {
            this.F = new d(this.f6472u, this.f6473v, this.f6474w, this.f6476y, this.f6477z, this.A, this.B, this.C);
        }
        d dVar = this.F;
        d7.a.j(dVar);
        return dVar;
    }

    public final d I0(m2.b bVar) {
        d dVar;
        f fVarJ0 = J0();
        if (fVarJ0 != null && fVarJ0.f6468c && (dVar = fVarJ0.f6469d) != null) {
            dVar.c(bVar);
            return dVar;
        }
        d dVarH0 = H0();
        dVarH0.c(bVar);
        return dVarH0;
    }

    public final f J0() {
        return (f) this.H.getValue();
    }

    public final boolean K0(c9.c cVar, c9.c cVar2) {
        boolean z10;
        if (d7.a.d(this.f6475x, cVar)) {
            z10 = false;
        } else {
            this.f6475x = cVar;
            z10 = true;
        }
        if (!d7.a.d(this.D, cVar2)) {
            this.D = cVar2;
            z10 = true;
        }
        if (d7.a.d(null, null)) {
            return z10;
        }
        return true;
    }

    public final boolean L0(c0 c0Var, List list, int i10, int i11, boolean z10, f2.d dVar, int i12) {
        boolean z11 = !this.f6473v.c(c0Var);
        this.f6473v = c0Var;
        if (!d7.a.d(this.C, list)) {
            this.C = list;
            z11 = true;
        }
        if (this.B != i10) {
            this.B = i10;
            z11 = true;
        }
        if (this.A != i11) {
            this.A = i11;
            z11 = true;
        }
        if (this.f6477z != z10) {
            this.f6477z = z10;
            z11 = true;
        }
        if (!d7.a.d(this.f6474w, dVar)) {
            this.f6474w = dVar;
            z11 = true;
        }
        if (h6.g.T(this.f6476y, i12)) {
            return z11;
        }
        this.f6476y = i12;
        return true;
    }

    @Override // t1.r1
    public final void Q(y1.j jVar) {
        g gVar = this.G;
        if (gVar == null) {
            gVar = new g(this, 0);
            this.G = gVar;
        }
        a2.e eVar = this.f6472u;
        j9.f[] fVarArr = y1.t.f16843a;
        jVar.k(r.f16836u, t.d0(eVar));
        f fVarJ0 = J0();
        if (fVarJ0 != null) {
            a2.e eVar2 = fVarJ0.f6467b;
            u uVar = r.f16837v;
            j9.f[] fVarArr2 = y1.t.f16843a;
            j9.f fVar = fVarArr2[12];
            uVar.a(jVar, eVar2);
            boolean z10 = fVarJ0.f6468c;
            u uVar2 = r.f16838w;
            j9.f fVar2 = fVarArr2[13];
            uVar2.a(jVar, Boolean.valueOf(z10));
        }
        jVar.k(y1.i.f16769i, new y1.a(null, new g(this, 1)));
        jVar.k(y1.i.f16770j, new y1.a(null, new g(this, 2)));
        jVar.k(y1.i.f16771k, new y1.a(null, new l0(this, 11)));
        y1.t.c(jVar, gVar);
    }

    @Override // t1.b0
    public final int a(q qVar, p pVar, int i10) {
        return I0(qVar).a(i10, qVar.getLayoutDirection());
    }

    @Override // t1.b0
    public final int b(q qVar, p pVar, int i10) {
        return d9.i.n(I0(qVar).d(qVar.getLayoutDirection()).c());
    }

    @Override // t1.b0
    public final int d(q qVar, p pVar, int i10) {
        return d9.i.n(I0(qVar).d(qVar.getLayoutDirection()).a());
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007e  */
    @Override // t1.b0
    public final k0 f(r1.l0 l0Var, i0 i0Var, long j10) {
        d dVarI0 = I0(l0Var);
        l layoutDirection = l0Var.getLayoutDirection();
        boolean z10 = true;
        if (dVarI0.f6438g > 1) {
            b bVar = dVarI0.f6440i;
            c0 c0Var = dVarI0.f6433b;
            m2.b bVar2 = dVarI0.f6442k;
            d7.a.j(bVar2);
            b bVarA = a.a.a(bVar, layoutDirection, c0Var, bVar2, dVarI0.f6434c);
            dVarI0.f6440i = bVarA;
            j10 = bVarA.a(dVarI0.f6438g, j10);
        }
        a0 a0Var = dVarI0.f6445n;
        if (a0Var == null) {
            dVarI0.f6445n = dVarI0.e(layoutDirection, j10, dVarI0.b(j10, layoutDirection));
        } else {
            a2.i iVar = a0Var.f894b;
            if (iVar.f932a.b()) {
                dVarI0.f6445n = dVarI0.e(layoutDirection, j10, dVarI0.b(j10, layoutDirection));
            } else {
                z zVar = a0Var.f893a;
                if (layoutDirection != zVar.f1059h) {
                    dVarI0.f6445n = dVarI0.e(layoutDirection, j10, dVarI0.b(j10, layoutDirection));
                } else {
                    long j11 = zVar.f1061j;
                    if (!m2.a.c(j10, j11) && (m2.a.i(j10) != m2.a.i(j11) || m2.a.h(j10) < iVar.f936e || iVar.f934c)) {
                        dVarI0.f6445n = dVarI0.e(layoutDirection, j10, dVarI0.b(j10, layoutDirection));
                    } else {
                        a0 a0Var2 = dVarI0.f6445n;
                        d7.a.j(a0Var2);
                        if (m2.a.c(j10, a0Var2.f893a.f1061j)) {
                            z10 = false;
                        } else {
                            a0 a0Var3 = dVarI0.f6445n;
                            d7.a.j(a0Var3);
                            dVarI0.f6445n = dVarI0.e(layoutDirection, j10, a0Var3.f894b);
                        }
                    }
                }
            }
        }
        a0 a0Var4 = dVarI0.f6445n;
        if (a0Var4 == null) {
            throw new IllegalStateException("You must call layoutWithConstraints first");
        }
        a0Var4.f894b.f932a.b();
        if (z10) {
            t1.g.x(this, 2).P0();
            c9.c cVar = this.f6475x;
            if (cVar != null) {
                cVar.invoke(a0Var4);
            }
            this.E = v.D0(new q8.f(r1.d.f13352a, Integer.valueOf(t.p0(a0Var4.f896d))), new q8.f(r1.d.f13353b, Integer.valueOf(t.p0(a0Var4.f897e))));
        }
        c9.c cVar2 = this.D;
        if (cVar2 != null) {
            cVar2.invoke(a0Var4.f898f);
        }
        long j12 = a0Var4.f895c;
        int i10 = (int) (j12 >> 32);
        int i11 = (int) (j12 & 4294967295L);
        x0 x0VarF = i0Var.f(e0.x(i10, i11));
        Map map = this.E;
        d7.a.j(map);
        return l0Var.N(i10, i11, map, new s.z(x0VarF, 6));
    }

    @Override // t1.b0
    public final int h(q qVar, p pVar, int i10) {
        return I0(qVar).a(i10, qVar.getLayoutDirection());
    }

    @Override // t1.s
    public final void i(g1.e eVar) {
        if (this.f16742t) {
            e1.p pVarA = ((t1.i0) eVar).f14447a.f6497b.a();
            a0 a0Var = I0(eVar).f6445n;
            if (a0Var == null) {
                throw new IllegalStateException("You must call layoutWithConstraints first");
            }
            a2.i iVar = a0Var.f894b;
            long j10 = a0Var.f895c;
            boolean z10 = ((((float) ((int) (j10 >> 32))) > iVar.f935d ? 1 : (((float) ((int) (j10 >> 32))) == iVar.f935d ? 0 : -1)) < 0 || iVar.f934c || (((float) ((int) (j10 & 4294967295L))) > iVar.f936e ? 1 : (((float) ((int) (j10 & 4294967295L))) == iVar.f936e ? 0 : -1)) < 0) && !h6.g.T(this.f6476y, 3);
            if (z10) {
                d1.d dVarH = e0.h(d1.c.f4326b, t.j((int) (j10 >> 32), (int) (j10 & 4294967295L)));
                pVarA.j();
                e1.p.o(pVarA, dVarH);
            }
            try {
                x xVar = this.f6473v.f911a;
                l2.j jVar = xVar.f1043m;
                if (jVar == null) {
                    jVar = l2.j.f11211b;
                }
                l2.j jVar2 = jVar;
                e1.k0 k0Var = xVar.f1044n;
                if (k0Var == null) {
                    k0Var = e1.k0.f5038d;
                }
                e1.k0 k0Var2 = k0Var;
                g1.h hVar = xVar.f1046p;
                if (hVar == null) {
                    hVar = g1.j.f6502a;
                }
                g1.h hVar2 = hVar;
                e1.n nVarE = xVar.f1031a.e();
                if (nVarE != null) {
                    a2.i.b(iVar, pVarA, nVarE, this.f6473v.f911a.f1031a.c(), k0Var2, jVar2, hVar2);
                } else {
                    long jB = e1.r.f5065g;
                    if (jB == jB) {
                        jB = this.f6473v.b() != jB ? this.f6473v.b() : e1.r.f5060b;
                    }
                    a2.i.a(iVar, pVarA, jB, k0Var2, jVar2, hVar2);
                }
                if (z10) {
                    pVarA.h();
                }
                List list = this.C;
                if (list == null || list.isEmpty()) {
                    return;
                }
                ((t1.i0) eVar).a();
            } catch (Throwable th) {
                if (z10) {
                    pVarA.h();
                }
                throw th;
            }
        }
    }
}
