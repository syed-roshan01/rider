package t;

import m0.o3;

/* JADX INFO: loaded from: classes.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0.i f14273a = new o0.i(new k0[16]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m0.n1 f14274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f14275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m0.n1 f14276d;

    public p0() {
        Boolean bool = Boolean.FALSE;
        o3 o3Var = o3.f11621a;
        this.f14274b = d7.t.g0(bool, o3Var);
        this.f14275c = Long.MIN_VALUE;
        this.f14276d = d7.t.g0(Boolean.TRUE, o3Var);
    }

    public final void a(m0.m mVar, int i10) {
        m0.q qVar = (m0.q) mVar;
        qVar.a0(-318043801);
        qVar.Z(-492369756);
        Object objP = qVar.P();
        if (objP == m0.l.f11578a) {
            objP = d7.t.g0(null, o3.f11621a);
            qVar.l0(objP);
        }
        int i11 = 0;
        qVar.t(false);
        m0.g1 g1Var = (m0.g1) objP;
        if (((Boolean) this.f14276d.getValue()).booleanValue() || ((Boolean) this.f14274b.getValue()).booleanValue()) {
            m0.s.b(this, new n0(g1Var, this, null), qVar);
        }
        m0.x1 x1VarX = qVar.x();
        if (x1VarX != null) {
            x1VarX.f11756d = new o0(this, i10, i11);
        }
    }
}
