package c0;

import v.s;
import z.p;

/* JADX INFO: loaded from: classes.dex */
public final class m extends a implements d {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final h f2870w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final s1.j f2871x;

    public m(s sVar) {
        this.f2870w = sVar;
        s1.j jVar = new s1.j(c.f2845a);
        jVar.A.setValue(this);
        this.f2871x = jVar;
    }

    public static final d1.d H0(m mVar, r1.s sVar, c9.a aVar) {
        d1.d dVar;
        r1.s sVarG0 = mVar.G0();
        if (sVarG0 == null) {
            return null;
        }
        if (!sVar.L()) {
            sVar = null;
        }
        if (sVar == null || (dVar = (d1.d) aVar.invoke()) == null) {
            return null;
        }
        d1.d dVarB = sVarG0.b(sVar, false);
        return dVar.g(d9.i.f(dVarB.f4332a, dVarB.f4333b));
    }

    @Override // s1.f
    public final f6.a j() {
        return this.f2871x;
    }

    @Override // c0.d
    public final Object x(r1.s sVar, c9.a aVar, u8.e eVar) {
        Object objQ = d7.a.q(new l(this, sVar, aVar, new p(this, sVar, aVar, 2), null), eVar);
        return objQ == v8.a.f15963a ? objQ : q8.l.f13235a;
    }
}
