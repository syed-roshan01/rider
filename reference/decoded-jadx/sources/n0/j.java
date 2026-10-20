package n0;

import m0.q2;

/* JADX INFO: loaded from: classes.dex */
public final class j extends g0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f12083c = new j(0, 1, 1);

    @Override // n0.g0
    public final void a(h0 h0Var, m0.d dVar, q2 q2Var, m0.w wVar) {
        d7.a.k(dVar, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
        for (Object obj : (Object[]) h0Var.b(0)) {
            dVar.b(obj);
        }
    }

    @Override // n0.g0
    public final String c(int i10) {
        return d9.i.o(i10, 0) ? "nodes" : super.c(i10);
    }
}
