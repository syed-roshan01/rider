package t1;

import m0.o3;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.compose.ui.node.a f14583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m0.n1 f14584b = d7.t.g0(null, o3.f11621a);

    public y(androidx.compose.ui.node.a aVar) {
        this.f14583a = aVar;
    }

    public final r1.j0 a() {
        r1.j0 j0Var = (r1.j0) this.f14584b.getValue();
        if (j0Var != null) {
            return j0Var;
        }
        throw new IllegalStateException("Intrinsic size is queried but there is no measure policy in place.".toString());
    }
}
