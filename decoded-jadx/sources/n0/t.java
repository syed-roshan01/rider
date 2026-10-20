package n0;

import com.google.firebase.messaging.Constants;
import m0.q2;

/* JADX INFO: loaded from: classes.dex */
public final class t extends g0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t f12093c = new t(3, 0, 2);

    @Override // n0.g0
    public final void a(h0 h0Var, m0.d dVar, q2 q2Var, m0.w wVar) {
        dVar.e(h0Var.a(0), h0Var.a(1), h0Var.a(2));
    }

    @Override // n0.g0
    public final String b(int i10) {
        if (o7.d0.t(i10, 0)) {
            return Constants.MessagePayloadKeys.FROM;
        }
        if (o7.d0.t(i10, 1)) {
            return "to";
        }
        return o7.d0.t(i10, 2) ? "count" : super.b(i10);
    }
}
