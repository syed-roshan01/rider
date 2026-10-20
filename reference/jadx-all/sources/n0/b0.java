package n0;

import com.google.firebase.messaging.Constants;
import m0.q2;

/* JADX INFO: loaded from: classes.dex */
public final class b0 extends g0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b0 f12056c = new b0(0, 1, 1);

    @Override // n0.g0
    public final void a(h0 h0Var, m0.d dVar, q2 q2Var, m0.w wVar) {
        q2Var.M(h0Var.b(0));
    }

    @Override // n0.g0
    public final String c(int i10) {
        return d9.i.o(i10, 0) ? Constants.ScionAnalytics.MessageType.DATA_MESSAGE : super.c(i10);
    }
}
