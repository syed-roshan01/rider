package n0;

import java.util.List;
import m0.q2;

/* JADX INFO: loaded from: classes.dex */
public final class f extends g0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f12064c = new f(0, 2, 1);

    @Override // n0.g0
    public final void a(h0 h0Var, m0.d dVar, q2 q2Var, m0.w wVar) {
        int i10 = ((u0.c) h0Var.b(0)).f15006a;
        List list = (List) h0Var.b(1);
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            d7.a.k(dVar, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            int i12 = i10 + i11;
            dVar.a(i12, obj);
            dVar.c(i12, obj);
        }
    }

    @Override // n0.g0
    public final String c(int i10) {
        if (d9.i.o(i10, 0)) {
            return "effectiveNodeIndex";
        }
        return d9.i.o(i10, 1) ? "nodes" : super.c(i10);
    }
}
