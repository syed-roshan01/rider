package y;

import t1.o1;

/* JADX INFO: loaded from: classes.dex */
public final class m0 extends y0.n implements o1 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f16632u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f16633v;

    @Override // t1.o1
    public final Object h0(Object obj) {
        y0 y0Var = obj instanceof y0 ? (y0) obj : null;
        if (y0Var == null) {
            y0Var = new y0();
        }
        y0Var.f16703a = this.f16632u;
        y0Var.f16704b = this.f16633v;
        return y0Var;
    }
}
