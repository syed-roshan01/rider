package y;

import t1.o1;

/* JADX INFO: loaded from: classes.dex */
public final class h1 extends y0.n implements o1 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public y0.c f16560u;

    @Override // t1.o1
    public final Object h0(Object obj) {
        y0 y0Var = obj instanceof y0 ? (y0) obj : null;
        if (y0Var == null) {
            y0Var = new y0();
        }
        y0Var.f16705c = new z(this.f16560u);
        return y0Var;
    }
}
