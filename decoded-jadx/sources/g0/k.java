package g0;

import a2.c0;
import a2.o;
import a2.x;
import b2.v;
import d7.t;
import java.util.LinkedHashMap;
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
import s.z;
import t.l0;
import t1.b0;
import t1.r1;
import t1.s;
import y0.n;
import y1.r;
import y1.u;

/* JADX INFO: loaded from: classes.dex */
public final class k extends n implements b0, s, r1 {
    public int A;
    public Map B;
    public e C;
    public j D;
    public final n1 E = t.g0(null, o3.f11621a);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f6484u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public c0 f6485v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public f2.d f6486w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f6487x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f6488y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f6489z;

    public k(String str, c0 c0Var, f2.d dVar, int i10, boolean z10, int i11, int i12) {
        this.f6484u = str;
        this.f6485v = c0Var;
        this.f6486w = dVar;
        this.f6487x = i10;
        this.f6488y = z10;
        this.f6489z = i11;
        this.A = i12;
    }

    public final e G0() {
        if (this.C == null) {
            this.C = new e(this.f6484u, this.f6485v, this.f6486w, this.f6487x, this.f6488y, this.f6489z, this.A);
        }
        e eVar = this.C;
        d7.a.j(eVar);
        return eVar;
    }

    public final e H0(m2.b bVar) {
        e eVar;
        i iVarI0 = I0();
        if (iVarI0 != null && iVarI0.f6480c && (eVar = iVarI0.f6481d) != null) {
            eVar.c(bVar);
            return eVar;
        }
        e eVarG0 = G0();
        eVarG0.c(bVar);
        return eVarG0;
    }

    public final i I0() {
        return (i) this.E.getValue();
    }

    @Override // t1.r1
    public final void Q(y1.j jVar) {
        j jVar2 = this.D;
        if (jVar2 == null) {
            jVar2 = new j(this, 0);
            this.D = jVar2;
        }
        a2.e eVar = new a2.e(this.f6484u, null, 6);
        j9.f[] fVarArr = y1.t.f16843a;
        jVar.k(r.f16836u, t.d0(eVar));
        i iVarI0 = I0();
        if (iVarI0 != null) {
            boolean z10 = iVarI0.f6480c;
            u uVar = r.f16838w;
            j9.f[] fVarArr2 = y1.t.f16843a;
            j9.f fVar = fVarArr2[13];
            uVar.a(jVar, Boolean.valueOf(z10));
            a2.e eVar2 = new a2.e(iVarI0.f6479b, null, 6);
            u uVar2 = r.f16837v;
            j9.f fVar2 = fVarArr2[12];
            uVar2.a(jVar, eVar2);
        }
        jVar.k(y1.i.f16769i, new y1.a(null, new j(this, 1)));
        jVar.k(y1.i.f16770j, new y1.a(null, new j(this, 2)));
        jVar.k(y1.i.f16771k, new y1.a(null, new l0(this, 12)));
        y1.t.c(jVar, jVar2);
    }

    @Override // t1.b0
    public final int a(q qVar, p pVar, int i10) {
        return H0(qVar).a(i10, qVar.getLayoutDirection());
    }

    @Override // t1.b0
    public final int b(q qVar, p pVar, int i10) {
        return d9.i.n(H0(qVar).d(qVar.getLayoutDirection()).c());
    }

    @Override // t1.b0
    public final int d(q qVar, p pVar, int i10) {
        return d9.i.n(H0(qVar).d(qVar.getLayoutDirection()).a());
    }

    @Override // t1.b0
    public final k0 f(r1.l0 l0Var, i0 i0Var, long j10) {
        long jA;
        boolean z10;
        o oVar;
        e eVarH0 = H0(l0Var);
        l layoutDirection = l0Var.getLayoutDirection();
        if (eVarH0.f6454g > 1) {
            b bVar = eVarH0.f6460m;
            c0 c0Var = eVarH0.f6449b;
            m2.b bVar2 = eVarH0.f6456i;
            d7.a.j(bVar2);
            b bVarA = a.a.a(bVar, layoutDirection, c0Var, bVar2, eVarH0.f6450c);
            eVarH0.f6460m = bVarA;
            jA = bVarA.a(eVarH0.f6454g, j10);
        } else {
            jA = j10;
        }
        a2.a aVar = eVarH0.f6457j;
        if (aVar == null || (oVar = eVarH0.f6461n) == null || oVar.b() || layoutDirection != eVarH0.f6462o || (!m2.a.c(jA, eVarH0.f6463p) && (m2.a.i(jA) != m2.a.i(eVarH0.f6463p) || m2.a.h(jA) < aVar.b() || aVar.f889d.f2577c))) {
            a2.a aVarB = eVarH0.b(jA, layoutDirection);
            eVarH0.f6463p = jA;
            long jO = o1.s.o(jA, o1.s.e(d9.i.n(aVarB.c()), d9.i.n(aVarB.b())));
            eVarH0.f6459l = jO;
            eVarH0.f6458k = !h6.g.T(eVarH0.f6451d, 3) && (((float) ((int) (jO >> 32))) < aVarB.c() || ((float) ((int) (jO & 4294967295L))) < aVarB.b());
            eVarH0.f6457j = aVarB;
            z10 = true;
        } else {
            if (!m2.a.c(jA, eVarH0.f6463p)) {
                a2.a aVar2 = eVarH0.f6457j;
                d7.a.j(aVar2);
                long jO2 = o1.s.o(jA, o1.s.e(d9.i.n(Math.min(aVar2.f886a.f7923i.b(), aVar2.c())), d9.i.n(aVar2.b())));
                eVarH0.f6459l = jO2;
                eVarH0.f6458k = !h6.g.T(eVarH0.f6451d, 3) && (((float) ((int) (jO2 >> 32))) < aVar2.c() || ((float) ((int) (jO2 & 4294967295L))) < aVar2.b());
                eVarH0.f6463p = jA;
            }
            z10 = false;
        }
        o oVar2 = eVarH0.f6461n;
        if (oVar2 != null) {
            oVar2.b();
        }
        a2.a aVar3 = eVarH0.f6457j;
        d7.a.j(aVar3);
        long j11 = eVarH0.f6459l;
        if (z10) {
            t1.g.x(this, 2).P0();
            Map linkedHashMap = this.B;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap(2);
            }
            r1.o oVar3 = r1.d.f13352a;
            v vVar = aVar3.f889d;
            linkedHashMap.put(oVar3, Integer.valueOf(t.p0(vVar.c(0))));
            linkedHashMap.put(r1.d.f13353b, Integer.valueOf(t.p0(vVar.c(vVar.f2579e - 1))));
            this.B = linkedHashMap;
        }
        int i10 = (int) (j11 >> 32);
        int i11 = (int) (j11 & 4294967295L);
        x0 x0VarF = i0Var.f(e0.x(i10, i11));
        Map map = this.B;
        d7.a.j(map);
        return l0Var.N(i10, i11, map, new z(x0VarF, 7));
    }

    @Override // t1.b0
    public final int h(q qVar, p pVar, int i10) {
        return H0(qVar).a(i10, qVar.getLayoutDirection());
    }

    @Override // t1.s
    public final void i(g1.e eVar) {
        if (this.f16742t) {
            a2.a aVar = G0().f6457j;
            if (aVar == null) {
                throw new IllegalArgumentException("no paragraph".toString());
            }
            e1.p pVarA = ((t1.i0) eVar).f14447a.f6497b.a();
            boolean z10 = G0().f6458k;
            if (z10) {
                d1.d dVarH = e0.h(d1.c.f4326b, t.j((int) (G0().f6459l >> 32), (int) (G0().f6459l & 4294967295L)));
                pVarA.j();
                e1.p.o(pVarA, dVarH);
            }
            try {
                x xVar = this.f6485v.f911a;
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
                    aVar.f(pVarA, nVarE, this.f6485v.f911a.f1031a.c(), k0Var2, jVar2, hVar2, 3);
                } else {
                    long jB = e1.r.f5065g;
                    if (jB == jB) {
                        jB = this.f6485v.b() != jB ? this.f6485v.b() : e1.r.f5060b;
                    }
                    aVar.e(pVarA, jB, k0Var2, jVar2, hVar2, 3);
                }
            } finally {
                if (z10) {
                    pVarA.h();
                }
            }
        }
    }
}
