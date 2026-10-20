package n0;

import com.google.firebase.analytics.FirebaseAnalytics;
import m0.i2;
import m0.q2;

/* JADX INFO: loaded from: classes.dex */
public final class v extends g0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v f12095c = new v(0, 1, 1);

    @Override // n0.g0
    public final void a(h0 h0Var, m0.d dVar, q2 q2Var, m0.w wVar) {
        wVar.f11721b.add((i2) h0Var.b(0));
    }

    @Override // n0.g0
    public final String c(int i10) {
        return d9.i.o(i10, 0) ? FirebaseAnalytics.Param.VALUE : super.c(i10);
    }
}
