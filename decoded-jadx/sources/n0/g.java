package n0;

import com.google.firebase.messaging.Constants;
import m0.c1;
import m0.q2;

/* JADX INFO: loaded from: classes.dex */
public final class g extends g0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f12066c = new g(0, 4, 1);

    @Override // n0.g0
    public final void a(h0 h0Var, m0.d dVar, q2 q2Var, m0.w wVar) {
        c1 c1Var = (c1) h0Var.b(2);
        m0.u uVar = (m0.u) h0Var.b(1);
        uVar.j(c1Var);
        m0.s.g("Could not resolve state for movable content");
        throw null;
    }

    @Override // n0.g0
    public final String c(int i10) {
        if (d9.i.o(i10, 0)) {
            return "resolvedState";
        }
        if (d9.i.o(i10, 1)) {
            return "resolvedCompositionContext";
        }
        if (d9.i.o(i10, 2)) {
            return Constants.MessagePayloadKeys.FROM;
        }
        return d9.i.o(i10, 3) ? "to" : super.c(i10);
    }
}
