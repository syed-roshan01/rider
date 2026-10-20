package b3;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public final class q1 extends p1 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final u1 f2673q = u1.c(null, WindowInsets.CONSUMED);

    public q1(u1 u1Var, WindowInsets windowInsets) {
        super(u1Var, windowInsets);
    }

    @Override // b3.m1, b3.r1
    public final void d(View view) {
    }

    @Override // b3.m1, b3.r1
    public u2.c f(int i10) {
        return u2.c.c(this.f2652c.getInsets(t1.a(i10)));
    }

    @Override // b3.m1, b3.r1
    public u2.c g(int i10) {
        return u2.c.c(this.f2652c.getInsetsIgnoringVisibility(t1.a(i10)));
    }

    @Override // b3.m1, b3.r1
    public boolean p(int i10) {
        return this.f2652c.isVisible(t1.a(i10));
    }
}
