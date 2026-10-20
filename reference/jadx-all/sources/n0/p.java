package n0;

import m0.q2;

/* JADX INFO: loaded from: classes.dex */
public final class p extends g0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p f12089c = new p(1, 2);

    @Override // n0.g0
    public final void a(h0 h0Var, m0.d dVar, q2 q2Var, m0.w wVar) {
        Object objInvoke = ((c9.a) h0Var.b(0)).invoke();
        m0.c cVar = (m0.c) h0Var.b(1);
        int iA = h0Var.a(0);
        d7.a.k(dVar, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
        cVar.getClass();
        q2Var.O(q2Var.c(cVar), objInvoke);
        dVar.c(iA, objInvoke);
        dVar.b(objInvoke);
    }

    @Override // n0.g0
    public final String b(int i10) {
        return o7.d0.t(i10, 0) ? "insertIndex" : super.b(i10);
    }

    @Override // n0.g0
    public final String c(int i10) {
        if (d9.i.o(i10, 0)) {
            return "factory";
        }
        return d9.i.o(i10, 1) ? "groupAnchor" : super.c(i10);
    }
}
