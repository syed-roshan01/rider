package u;

import m0.o3;

/* JADX INFO: loaded from: classes.dex */
public final class k0 implements i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k0 f14833a = new k0();

    @Override // u.i1
    public final j1 a(x.l lVar, m0.m mVar) {
        m0.q qVar = (m0.q) mVar;
        qVar.Z(1683566979);
        m0.g1 g1VarO = o7.d0.o(lVar, qVar, 0);
        qVar.Z(1206586544);
        qVar.Z(-492369756);
        Object objP = qVar.P();
        k0.y0 y0Var = m0.l.f11578a;
        if (objP == y0Var) {
            objP = d7.t.g0(Boolean.FALSE, o3.f11621a);
            qVar.l0(objP);
        }
        qVar.t(false);
        m0.g1 g1Var = (m0.g1) objP;
        qVar.Z(1930394772);
        boolean zG = qVar.g(lVar) | qVar.g(g1Var);
        Object objP2 = qVar.P();
        if (zG || objP2 == y0Var) {
            objP2 = new x.j(lVar, g1Var, null);
            qVar.l0(objP2);
        }
        qVar.t(false);
        m0.s.b(lVar, (c9.e) objP2, qVar);
        qVar.t(false);
        m0.g1 g1VarU = m9.e0.u(lVar, qVar, 0);
        qVar.Z(1157296644);
        boolean zG2 = qVar.g(lVar);
        Object objP3 = qVar.P();
        if (zG2 || objP3 == y0Var) {
            objP3 = new j0(g1VarO, g1Var, g1VarU);
            qVar.l0(objP3);
        }
        qVar.t(false);
        j0 j0Var = (j0) objP3;
        qVar.t(false);
        return j0Var;
    }
}
