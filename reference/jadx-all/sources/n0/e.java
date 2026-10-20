package n0;

import m0.i1;
import m0.q2;

/* JADX INFO: loaded from: classes.dex */
public final class e extends g0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f12062c = new e(0, 2, 1);

    @Override // n0.g0
    public final void a(h0 h0Var, m0.d dVar, q2 q2Var, m0.w wVar) {
        u0.c cVar = (u0.c) h0Var.b(1);
        int i10 = cVar != null ? cVar.f15006a : 0;
        a aVar = (a) h0Var.b(0);
        if (i10 > 0) {
            dVar = new i1(dVar, i10);
        }
        aVar.a(dVar, q2Var, wVar);
    }

    @Override // n0.g0
    public final String c(int i10) {
        if (d9.i.o(i10, 0)) {
            return "changes";
        }
        return d9.i.o(i10, 1) ? "effectiveNodeIndex" : super.c(i10);
    }
}
