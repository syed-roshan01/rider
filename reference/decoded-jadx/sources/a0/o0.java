package a0;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import m0.m3;
import m0.n1;
import m0.o3;
import m0.x1;

/* JADX INFO: loaded from: classes.dex */
public final class o0 implements v0.l, v0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0.l f834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n1 f835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f836c;

    public o0(v0.l lVar, Map map) {
        m0 m0Var = new m0(lVar, 0);
        m3 m3Var = v0.o.f15878a;
        this.f834a = new v0.n(map, m0Var);
        this.f835b = d7.t.g0(null, o3.f11621a);
        this.f836c = new LinkedHashSet();
    }

    @Override // v0.l
    public final boolean a(Object obj) {
        return this.f834a.a(obj);
    }

    @Override // v0.l
    public final Map b() {
        v0.e eVar = (v0.e) this.f835b.getValue();
        if (eVar != null) {
            Iterator it = this.f836c.iterator();
            while (it.hasNext()) {
                eVar.d(it.next());
            }
        }
        return this.f834a.b();
    }

    @Override // v0.l
    public final Object c(String str) {
        return this.f834a.c(str);
    }

    @Override // v0.e
    public final void d(Object obj) {
        v0.e eVar = (v0.e) this.f835b.getValue();
        if (eVar == null) {
            throw new IllegalArgumentException("null wrappedHolder".toString());
        }
        eVar.d(obj);
    }

    @Override // v0.l
    public final v0.m e(String str, v0.c cVar) {
        return this.f834a.e(str, cVar);
    }

    @Override // v0.e
    public final void f(Object obj, c9.e eVar, m0.m mVar, int i10) {
        m0.q qVar = (m0.q) mVar;
        qVar.a0(-697180401);
        v0.e eVar2 = (v0.e) this.f835b.getValue();
        if (eVar2 == null) {
            throw new IllegalArgumentException("null wrappedHolder".toString());
        }
        eVar2.f(obj, eVar, qVar, (i10 & 112) | 520);
        m0.s.a(obj, new u.s(7, this, obj), qVar);
        x1 x1VarX = qVar.x();
        if (x1VarX != null) {
            x1VarX.f11756d = new g0(i10, 1, this, obj, eVar);
        }
    }
}
