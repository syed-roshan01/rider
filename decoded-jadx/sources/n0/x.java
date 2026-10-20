package n0;

import m0.q2;

/* JADX INFO: loaded from: classes.dex */
public final class x extends g0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x f12097c = new x(2, 0, 2);

    @Override // n0.g0
    public final void a(h0 h0Var, m0.d dVar, q2 q2Var, m0.w wVar) {
        dVar.g(h0Var.a(0), h0Var.a(1));
    }

    @Override // n0.g0
    public final String b(int i10) {
        if (o7.d0.t(i10, 0)) {
            return "removeIndex";
        }
        return o7.d0.t(i10, 1) ? "count" : super.b(i10);
    }
}
