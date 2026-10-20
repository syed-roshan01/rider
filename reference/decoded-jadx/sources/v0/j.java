package v0;

import a0.g0;
import java.util.LinkedHashMap;
import java.util.Map;
import m0.s;
import m0.x1;

/* JADX INFO: loaded from: classes.dex */
public final class j implements e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p f15865d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f15866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f15867b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l f15868c;

    static {
        f fVar = f.f15855b;
        g gVar = g.f15858b;
        p pVar = q.f15881a;
        f15865d = new p(fVar, gVar);
    }

    public j(Map map) {
        this.f15866a = map;
    }

    @Override // v0.e
    public final void d(Object obj) {
        i iVar = (i) this.f15867b.get(obj);
        if (iVar != null) {
            iVar.f15863b = false;
        } else {
            this.f15866a.remove(obj);
        }
    }

    @Override // v0.e
    public final void f(Object obj, c9.e eVar, m0.m mVar, int i10) {
        m0.q qVar = (m0.q) mVar;
        qVar.a0(-1198538093);
        qVar.Z(444418301);
        qVar.b0(obj);
        qVar.Z(-492369756);
        Object objP = qVar.P();
        if (objP == m0.l.f11578a) {
            l lVar = this.f15868c;
            if (lVar != null && !lVar.a(obj)) {
                throw new IllegalArgumentException(("Type of the key " + obj + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
            }
            objP = new i(this, obj);
            qVar.l0(objP);
        }
        qVar.t(false);
        i iVar = (i) objP;
        f6.a.b(o.f15878a.b(iVar.f15864c), eVar, qVar, i10 & 112);
        s.a(q8.l.f13235a, new b.g(this, obj, iVar, 16), qVar);
        qVar.y();
        qVar.t(false);
        x1 x1VarX = qVar.x();
        if (x1VarX != null) {
            x1VarX.f11756d = new g0(i10, 5, this, obj, eVar);
        }
    }
}
