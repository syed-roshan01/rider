package n0;

import com.google.firebase.messaging.Constants;
import m0.n2;
import m0.q2;

/* JADX INFO: loaded from: classes.dex */
public final class q extends g0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q f12090c = new q(0, 2, 1);

    @Override // n0.g0
    public final void a(h0 h0Var, m0.d dVar, q2 q2Var, m0.w wVar) {
        n2 n2Var = (n2) h0Var.b(1);
        m0.c cVar = (m0.c) h0Var.b(0);
        q2Var.d();
        cVar.getClass();
        q2Var.u(n2Var, n2Var.e(cVar));
        q2Var.j();
    }

    @Override // n0.g0
    public final String c(int i10) {
        if (d9.i.o(i10, 0)) {
            return "anchor";
        }
        return d9.i.o(i10, 1) ? Constants.MessagePayloadKeys.FROM : super.c(i10);
    }
}
