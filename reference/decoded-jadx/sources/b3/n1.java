package b3;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class n1 extends m1 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public u2.c f2657m;

    public n1(u1 u1Var, WindowInsets windowInsets) {
        super(u1Var, windowInsets);
        this.f2657m = null;
    }

    @Override // b3.r1
    public u1 b() {
        return u1.c(null, this.f2652c.consumeStableInsets());
    }

    @Override // b3.r1
    public u1 c() {
        return u1.c(null, this.f2652c.consumeSystemWindowInsets());
    }

    @Override // b3.r1
    public final u2.c i() {
        if (this.f2657m == null) {
            WindowInsets windowInsets = this.f2652c;
            this.f2657m = u2.c.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f2657m;
    }

    @Override // b3.r1
    public boolean n() {
        return this.f2652c.isConsumed();
    }

    @Override // b3.r1
    public void s(u2.c cVar) {
        this.f2657m = cVar;
    }
}
