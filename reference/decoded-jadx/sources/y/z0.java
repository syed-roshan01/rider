package y;

/* JADX INFO: loaded from: classes.dex */
public abstract class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w0 f16707a = new w0(1, k.f16605a, null, 0, new z(y0.a.f16713f));

    public static final r1.j0 a(g gVar, y0.f fVar, m0.m mVar) {
        r1.j0 j0Var;
        m0.q qVar = (m0.q) mVar;
        qVar.Z(-837807694);
        if (d7.a.d(gVar, k.f16605a) && d7.a.d(fVar, y0.a.f16713f)) {
            j0Var = f16707a;
        } else {
            qVar.Z(511388516);
            boolean zG = qVar.g(gVar) | qVar.g(fVar);
            Object objP = qVar.P();
            if (zG || objP == m0.l.f11578a) {
                objP = new w0(1, gVar, null, gVar.a(), new z(fVar));
                qVar.l0(objP);
            }
            qVar.t(false);
            j0Var = (r1.j0) objP;
        }
        qVar.t(false);
        return j0Var;
    }
}
