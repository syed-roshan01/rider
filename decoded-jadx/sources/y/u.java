package y;

/* JADX INFO: loaded from: classes.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w0 f16681a = new w0(2, null, k.f16607c, 0, new y(y0.a.f16715o));

    public static final r1.j0 a(i iVar, y0.e eVar, m0.m mVar) {
        r1.j0 j0Var;
        m0.q qVar = (m0.q) mVar;
        qVar.Z(1089876336);
        if (d7.a.d(iVar, k.f16607c) && d7.a.d(eVar, y0.a.f16715o)) {
            j0Var = f16681a;
        } else {
            qVar.Z(511388516);
            boolean zG = qVar.g(iVar) | qVar.g(eVar);
            Object objP = qVar.P();
            if (zG || objP == m0.l.f11578a) {
                objP = new w0(2, null, iVar, iVar.a(), new y(eVar));
                qVar.l0(objP);
            }
            qVar.t(false);
            j0Var = (r1.j0) objP;
        }
        qVar.t(false);
        return j0Var;
    }
}
