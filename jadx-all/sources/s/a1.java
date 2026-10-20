package s;

import android.view.ViewConfiguration;
import u1.s1;

/* JADX INFO: loaded from: classes.dex */
public abstract class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f13750a = ViewConfiguration.getScrollFriction();

    public static final t.y a(m0.m mVar) {
        m0.q qVar = (m0.q) mVar;
        qVar.Z(904445851);
        m2.b bVar = (m2.b) qVar.m(s1.f15275e);
        Float fValueOf = Float.valueOf(bVar.c());
        qVar.Z(1157296644);
        boolean zG = qVar.g(fValueOf);
        Object objP = qVar.P();
        if (zG || objP == m0.l.f11578a) {
            objP = new t.y(new z0(bVar));
            qVar.l0(objP);
        }
        qVar.t(false);
        t.y yVar = (t.y) objP;
        qVar.t(false);
        return yVar;
    }
}
