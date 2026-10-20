package j0;

import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.Map;
import m0.g1;
import m0.i2;
import m0.l3;
import t1.i0;
import w0.e0;
import w0.f0;

/* JADX INFO: loaded from: classes.dex */
public final class c extends u implements i2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f8253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f8254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l3 f8255d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l3 f8256e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w0.x f8257f;

    public c(boolean z10, float f10, g1 g1Var, g1 g1Var2) {
        super(z10, g1Var2);
        this.f8253b = z10;
        this.f8254c = f10;
        this.f8255d = g1Var;
        this.f8256e = g1Var2;
        this.f8257f = new w0.x();
    }

    @Override // m0.i2
    public final void a() {
    }

    @Override // m0.i2
    public final void b() {
        this.f8257f.clear();
    }

    @Override // u.j1
    public final void c(g1.e eVar) {
        long j10;
        c cVar = this;
        long j11 = ((e1.r) cVar.f8255d.getValue()).f5067a;
        i0 i0Var = (i0) eVar;
        i0Var.a();
        cVar.f(i0Var, cVar.f8254c, j11);
        Object it = cVar.f8257f.f16129b.iterator();
        while (((f0) it).hasNext()) {
            p pVar = (p) ((Map.Entry) ((e0) it).next()).getValue();
            float f10 = ((h) cVar.f8256e.getValue()).f8274d;
            if (f10 == 0.0f) {
                j10 = j11;
            } else {
                long jB = e1.r.b(j11, f10);
                Float f11 = pVar.f8294d;
                g1.c cVar2 = i0Var.f14447a;
                if (f11 == null) {
                    long jE = cVar2.e();
                    float f12 = q.f8303a;
                    pVar.f8294d = Float.valueOf(Math.max(d1.f.d(jE), d1.f.b(jE)) * 0.3f);
                }
                Float f13 = pVar.f8295e;
                boolean z10 = pVar.f8293c;
                if (f13 == null) {
                    float f14 = pVar.f8292b;
                    pVar.f8295e = Float.isNaN(f14) ? Float.valueOf(q.a(i0Var, z10, cVar2.e())) : Float.valueOf(i0Var.v(f14));
                }
                if (pVar.f8291a == null) {
                    pVar.f8291a = new d1.c(cVar2.O());
                }
                if (pVar.f8296f == null) {
                    pVar.f8296f = new d1.c(d9.i.f(d1.f.d(cVar2.e()) / 2.0f, d1.f.b(cVar2.e()) / 2.0f));
                }
                float fFloatValue = (!((Boolean) pVar.f8302l.getValue()).booleanValue() || ((Boolean) pVar.f8301k.getValue()).booleanValue()) ? ((Number) pVar.f8297g.d()).floatValue() : 1.0f;
                Float f15 = pVar.f8294d;
                d7.a.j(f15);
                float fFloatValue2 = f15.floatValue();
                Float f16 = pVar.f8295e;
                d7.a.j(f16);
                float fW = o1.s.W(fFloatValue2, f16.floatValue(), ((Number) pVar.f8298h.d()).floatValue());
                d1.c cVar3 = pVar.f8291a;
                d7.a.j(cVar3);
                float fD = d1.c.d(cVar3.f4330a);
                d1.c cVar4 = pVar.f8296f;
                d7.a.j(cVar4);
                float fD2 = d1.c.d(cVar4.f4330a);
                t.d dVar = pVar.f8299i;
                float fW2 = o1.s.W(fD, fD2, ((Number) dVar.d()).floatValue());
                d1.c cVar5 = pVar.f8291a;
                d7.a.j(cVar5);
                j10 = j11;
                float fE = d1.c.e(cVar5.f4330a);
                d1.c cVar6 = pVar.f8296f;
                d7.a.j(cVar6);
                long jF = d9.i.f(fW2, o1.s.W(fE, d1.c.e(cVar6.f4330a), ((Number) dVar.d()).floatValue()));
                long jB2 = e1.r.b(jB, e1.r.d(jB) * fFloatValue);
                if (z10) {
                    float fD3 = d1.f.d(cVar2.e());
                    float fB = d1.f.b(cVar2.e());
                    g1.b bVar = cVar2.f6497b;
                    long jB3 = bVar.b();
                    bVar.a().j();
                    bVar.f6494a.f6500a.a().d(0.0f, 0.0f, fD3, fB, 1);
                    i0Var.u0(jB2, (120 & 2) != 0 ? d1.f.c(i0Var.e()) / 2.0f : fW, (120 & 4) != 0 ? i0Var.O() : jF, (120 & 8) != 0 ? 1.0f : 0.0f, (120 & 16) != 0 ? g1.j.f6502a : null, null, (120 & 64) != 0 ? 3 : 0);
                    bVar.a().h();
                    bVar.c(jB3);
                } else {
                    i0Var.u0(jB2, (120 & 2) != 0 ? d1.f.c(i0Var.e()) / 2.0f : fW, (120 & 4) != 0 ? i0Var.O() : jF, (120 & 8) != 0 ? 1.0f : 0.0f, (120 & 16) != 0 ? g1.j.f6502a : null, null, (120 & 64) != 0 ? 3 : 0);
                }
            }
            cVar = this;
            j11 = j10;
        }
    }

    @Override // m0.i2
    public final void d() {
        this.f8257f.clear();
    }

    @Override // j0.u
    public final void e(x.o oVar, m9.d0 d0Var) throws IllegalAccessException, InvocationTargetException {
        w0.x xVar = this.f8257f;
        Iterator it = xVar.f16129b.iterator();
        while (it.hasNext()) {
            p pVar = (p) ((Map.Entry) it.next()).getValue();
            pVar.f8302l.setValue(Boolean.TRUE);
            pVar.f8300j.X(q8.l.f13235a);
        }
        boolean z10 = this.f8253b;
        p pVar2 = new p(z10 ? new d1.c(oVar.f16279a) : null, this.f8254c, z10);
        xVar.put(oVar, pVar2);
        z6.a.Q(d0Var, null, 0, new b(pVar2, this, oVar, null), 3);
    }

    @Override // j0.u
    public final void g(x.o oVar) throws IllegalAccessException, InvocationTargetException {
        p pVar = (p) this.f8257f.get(oVar);
        if (pVar != null) {
            pVar.f8302l.setValue(Boolean.TRUE);
            pVar.f8300j.X(q8.l.f13235a);
        }
    }
}
