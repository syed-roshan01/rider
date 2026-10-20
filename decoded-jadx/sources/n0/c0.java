package n0;

import com.google.firebase.analytics.FirebaseAnalytics;
import m0.q2;

/* JADX INFO: loaded from: classes.dex */
public final class c0 extends g0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c0 f12059c = new c0(0, 2, 1);

    @Override // n0.g0
    public final void a(h0 h0Var, m0.d dVar, q2 q2Var, m0.w wVar) {
        ((c9.e) h0Var.b(1)).invoke(dVar.f(), h0Var.b(0));
    }

    @Override // n0.g0
    public final String c(int i10) {
        if (d9.i.o(i10, 0)) {
            return FirebaseAnalytics.Param.VALUE;
        }
        return d9.i.o(i10, 1) ? "block" : super.c(i10);
    }
}
