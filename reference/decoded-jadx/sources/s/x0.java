package s;

import m0.l3;
import t.d1;
import t.x1;

/* JADX INFO: loaded from: classes.dex */
public abstract class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d1 f13889a = t.e.r(0.0f, null, 7);

    public static final l3 a(long j10, t.e0 e0Var, String str, m0.m mVar, int i10, int i11) {
        m0.q qVar = (m0.q) mVar;
        qVar.Z(-451899108);
        if ((i11 & 2) != 0) {
            e0Var = f13889a;
        }
        if ((i11 & 4) != 0) {
            str = "ColorAnimation";
        }
        f1.d dVarF = e1.r.f(j10);
        qVar.Z(1157296644);
        boolean zG = qVar.g(dVarF);
        Object objP = qVar.P();
        if (zG || objP == m0.l.f11578a) {
            objP = (x1) h0.f13785c.invoke(e1.r.f(j10));
            qVar.l0(objP);
        }
        qVar.t(false);
        int i12 = i10 << 6;
        l3 l3VarB = t.i.b(new e1.r(j10), (x1) objP, e0Var, str, null, qVar, (i10 & 14) | 576 | (57344 & i12) | (i12 & 458752));
        qVar.t(false);
        return l3VarB;
    }
}
