package n0;

import m0.q2;

/* JADX INFO: loaded from: classes.dex */
public final class y extends g0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y f12098c = new y(0, 0, 3);

    @Override // n0.g0
    public final void a(h0 h0Var, m0.d dVar, q2 q2Var, m0.w wVar) {
        if (q2Var.f11677m != 0) {
            m0.s.g("Cannot reset when inserting".toString());
            throw null;
        }
        q2Var.z();
        q2Var.f11682r = 0;
        q2Var.f11683s = q2Var.m() - q2Var.f11671g;
        q2Var.f11672h = 0;
        q2Var.f11673i = 0;
        q2Var.f11678n = 0;
    }
}
