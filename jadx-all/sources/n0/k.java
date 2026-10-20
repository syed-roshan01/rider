package n0;

import m0.q2;

/* JADX INFO: loaded from: classes.dex */
public final class k extends g0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f12084c = new k(0, 2, 1);

    @Override // n0.g0
    public final void a(h0 h0Var, m0.d dVar, q2 q2Var, m0.w wVar) {
        ((c9.c) h0Var.b(0)).invoke((m0.t) h0Var.b(1));
    }

    @Override // n0.g0
    public final String c(int i10) {
        if (d9.i.o(i10, 0)) {
            return "anchor";
        }
        return d9.i.o(i10, 1) ? "composition" : super.c(i10);
    }
}
