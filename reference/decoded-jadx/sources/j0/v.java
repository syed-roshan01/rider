package j0;

import m0.g1;
import t.w1;

/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w1 f8319a = new w1(15, t.d0.f14122c, 2);

    public static final e a(boolean z10, float f10, long j10, m0.m mVar, int i10, int i11) {
        m0.q qVar = (m0.q) mVar;
        qVar.Z(1635163520);
        if ((i11 & 1) != 0) {
            z10 = true;
        }
        if ((i11 & 2) != 0) {
            f10 = Float.NaN;
        }
        if ((i11 & 4) != 0) {
            j10 = e1.r.f5065g;
        }
        g1 g1VarM0 = d7.t.m0(new e1.r(j10), qVar);
        Boolean boolValueOf = Boolean.valueOf(z10);
        m2.e eVar = new m2.e(f10);
        qVar.Z(511388516);
        boolean zG = qVar.g(boolValueOf) | qVar.g(eVar);
        Object objP = qVar.P();
        if (zG || objP == m0.l.f11578a) {
            objP = new e(z10, f10, g1VarM0);
            qVar.l0(objP);
        }
        qVar.t(false);
        e eVar2 = (e) objP;
        qVar.t(false);
        return eVar2;
    }
}
