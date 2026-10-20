package j0;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import m0.g1;
import m0.i2;
import m0.l3;
import m0.n1;
import m0.o3;
import t.l0;
import t1.i0;

/* JADX INFO: loaded from: classes.dex */
public final class a extends u implements i2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f8230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f8231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l3 f8232d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l3 f8233e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ViewGroup f8234f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public r f8235n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final n1 f8236o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n1 f8237p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f8238q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f8239r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final l0 f8240s;

    public a(boolean z10, float f10, g1 g1Var, g1 g1Var2, ViewGroup viewGroup) {
        super(z10, g1Var2);
        this.f8230b = z10;
        this.f8231c = f10;
        this.f8232d = g1Var;
        this.f8233e = g1Var2;
        this.f8234f = viewGroup;
        o3 o3Var = o3.f11621a;
        this.f8236o = d7.t.g0(null, o3Var);
        this.f8237p = d7.t.g0(Boolean.TRUE, o3Var);
        this.f8238q = d1.f.f4344b;
        this.f8239r = -1;
        this.f8240s = new l0(this, 14);
    }

    @Override // m0.i2
    public final void a() {
    }

    @Override // m0.i2
    public final void b() {
        h();
    }

    @Override // u.j1
    public final void c(g1.e eVar) {
        int iJ;
        i0 i0Var = (i0) eVar;
        this.f8238q = i0Var.f14447a.e();
        float f10 = this.f8231c;
        if (Float.isNaN(f10)) {
            iJ = d7.t.p0(q.a(eVar, this.f8230b, i0Var.f14447a.e()));
        } else {
            iJ = i0Var.f14447a.J(f10);
        }
        this.f8239r = iJ;
        long j10 = ((e1.r) this.f8232d.getValue()).f5067a;
        float f11 = ((h) this.f8233e.getValue()).f8274d;
        i0Var.a();
        f(eVar, f10, j10);
        e1.p pVarA = ((i0) eVar).f14447a.f6497b.a();
        ((Boolean) this.f8237p.getValue()).booleanValue();
        t tVar = (t) this.f8236o.getValue();
        if (tVar != null) {
            tVar.e(i0Var.f14447a.e(), this.f8239r, j10, f11);
            tVar.draw(e1.e.a(pVarA));
        }
    }

    @Override // m0.i2
    public final void d() {
        h();
    }

    @Override // j0.u
    public final void e(x.o oVar, m9.d0 d0Var) {
        r rVar = this.f8235n;
        if (rVar == null) {
            ViewGroup viewGroup = this.f8234f;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt instanceof r) {
                    this.f8235n = (r) childAt;
                    break;
                }
            }
            if (this.f8235n == null) {
                r rVar2 = new r(viewGroup.getContext());
                viewGroup.addView(rVar2);
                this.f8235n = rVar2;
            }
            rVar = this.f8235n;
            d7.a.j(rVar);
        }
        s sVar = rVar.f8307d;
        t tVar = (t) sVar.f8309a.get(this);
        if (tVar == null) {
            ArrayList arrayList = rVar.f8306c;
            d7.a.m(arrayList, "<this>");
            tVar = (t) (arrayList.isEmpty() ? null : arrayList.remove(0));
            HashMap map = sVar.f8310b;
            HashMap map2 = sVar.f8309a;
            if (tVar == null) {
                int i11 = rVar.f8308e;
                ArrayList arrayList2 = rVar.f8305b;
                if (i11 > d7.t.Y(arrayList2)) {
                    tVar = new t(rVar.getContext());
                    rVar.addView(tVar);
                    arrayList2.add(tVar);
                } else {
                    tVar = (t) arrayList2.get(rVar.f8308e);
                    a aVar = (a) map.get(tVar);
                    if (aVar != null) {
                        aVar.f8236o.setValue(null);
                        t tVar2 = (t) map2.get(aVar);
                        if (tVar2 != null) {
                        }
                        map2.remove(aVar);
                        tVar.c();
                    }
                }
                int i12 = rVar.f8308e;
                if (i12 < rVar.f8304a - 1) {
                    rVar.f8308e = i12 + 1;
                } else {
                    rVar.f8308e = 0;
                }
            }
            map2.put(this, tVar);
            map.put(tVar, this);
        }
        tVar.b(oVar, this.f8230b, this.f8238q, this.f8239r, ((e1.r) this.f8232d.getValue()).f5067a, ((h) this.f8233e.getValue()).f8274d, this.f8240s);
        this.f8236o.setValue(tVar);
    }

    @Override // j0.u
    public final void g(x.o oVar) {
        t tVar = (t) this.f8236o.getValue();
        if (tVar != null) {
            tVar.d();
        }
    }

    public final void h() {
        r rVar = this.f8235n;
        if (rVar != null) {
            this.f8236o.setValue(null);
            s sVar = rVar.f8307d;
            t tVar = (t) sVar.f8309a.get(this);
            if (tVar != null) {
                tVar.c();
                HashMap map = sVar.f8309a;
                t tVar2 = (t) map.get(this);
                if (tVar2 != null) {
                }
                map.remove(this);
                rVar.f8306c.add(tVar);
            }
        }
    }
}
