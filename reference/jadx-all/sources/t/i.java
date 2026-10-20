package t;

import java.util.Map;
import m0.l3;
import m0.o3;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f14196a = 0;

    static {
        Map map = i2.f14207a;
        int i10 = d1.f.f4346d;
        d7.t.j(0.5f, 0.5f);
        int i11 = d1.c.f4329e;
        d9.i.f(0.5f, 0.5f);
        int i12 = m2.i.f11808c;
        i1.b.c(1, 1);
    }

    public static final l3 a(float f10, w1 w1Var, m0.m mVar, int i10) {
        m0.q qVar = (m0.q) mVar;
        qVar.Z(-1407150062);
        int i11 = (i10 & 14) | ((i10 << 3) & 896);
        int i12 = i10 << 6;
        l3 l3VarB = b(new m2.e(f10), y1.f14357c, w1Var, "DpAnimation", null, qVar, i11 | (57344 & i12) | (i12 & 458752));
        qVar.t(false);
        return l3VarB;
    }

    public static final l3 b(Object obj, x1 x1Var, n nVar, String str, c9.c cVar, m0.m mVar, int i10) {
        m0.q qVar = (m0.q) mVar;
        qVar.Z(-1994373980);
        k0.y0 y0Var = m0.l.f11578a;
        qVar.Z(-492369756);
        Object objP = qVar.P();
        if (objP == y0Var) {
            objP = d7.t.g0(null, o3.f11621a);
            qVar.l0(objP);
        }
        qVar.t(false);
        m0.g1 g1Var = (m0.g1) objP;
        qVar.Z(-492369756);
        Object objP2 = qVar.P();
        if (objP2 == y0Var) {
            objP2 = new d(obj, x1Var, null);
            qVar.l0(objP2);
        }
        qVar.t(false);
        d dVar = (d) objP2;
        m0.g1 g1VarM0 = d7.t.m0(cVar, qVar);
        m0.g1 g1VarM1 = d7.t.m0(nVar, qVar);
        qVar.Z(-492369756);
        Object objP3 = qVar.P();
        if (objP3 == y0Var) {
            objP3 = z6.a.a(-1, null, 6);
            qVar.l0(objP3);
        }
        qVar.t(false);
        o9.g gVar = (o9.g) objP3;
        m0.s.d(new f(gVar, obj), qVar);
        m0.s.b(gVar, new h(gVar, dVar, g1VarM1, g1VarM0, null), qVar);
        l3 l3Var = (l3) g1Var.getValue();
        if (l3Var == null) {
            l3Var = dVar.f14110c;
        }
        qVar.t(false);
        return l3Var;
    }
}
