package n0;

import com.google.firebase.analytics.FirebaseAnalytics;
import m0.j2;
import m0.q2;
import m0.x1;
import m0.y1;

/* JADX INFO: loaded from: classes.dex */
public final class d0 extends g0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d0 f12061c = new d0(1, 1);

    @Override // n0.g0
    public final void a(h0 h0Var, m0.d dVar, q2 q2Var, m0.w wVar) {
        Object objB = h0Var.b(0);
        int iA = h0Var.a(0);
        if (objB instanceof j2) {
            wVar.f11721b.add(((j2) objB).f11574a);
        }
        Object objD = q2Var.D(objB, q2Var.f11682r, iA);
        if (objD instanceof j2) {
            wVar.f11722c.add(((j2) objD).f11574a);
        } else if (objD instanceof x1) {
            x1 x1Var = (x1) objD;
            y1 y1Var = x1Var.f11754b;
            if (y1Var != null) {
                y1Var.b();
            }
            x1Var.f11754b = null;
            x1Var.f11758f = null;
            x1Var.f11759g = null;
        }
    }

    @Override // n0.g0
    public final String b(int i10) {
        return o7.d0.t(i10, 0) ? "groupSlotIndex" : super.b(i10);
    }

    @Override // n0.g0
    public final String c(int i10) {
        return d9.i.o(i10, 0) ? FirebaseAnalytics.Param.VALUE : super.c(i10);
    }
}
