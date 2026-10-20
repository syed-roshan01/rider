package b3;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class j1 extends l1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WindowInsets.Builder f2636c;

    public j1() {
        this.f2636c = androidx.activity.u.b();
    }

    @Override // b3.l1
    public u1 b() {
        a();
        u1 u1VarC = u1.c(null, this.f2636c.build());
        u1VarC.f2683a.q(this.f2643b);
        return u1VarC;
    }

    @Override // b3.l1
    public void d(u2.c cVar) {
        this.f2636c.setMandatorySystemGestureInsets(cVar.d());
    }

    @Override // b3.l1
    public void e(u2.c cVar) {
        this.f2636c.setStableInsets(cVar.d());
    }

    @Override // b3.l1
    public void f(u2.c cVar) {
        this.f2636c.setSystemGestureInsets(cVar.d());
    }

    @Override // b3.l1
    public void g(u2.c cVar) {
        this.f2636c.setSystemWindowInsets(cVar.d());
    }

    @Override // b3.l1
    public void h(u2.c cVar) {
        this.f2636c.setTappableElementInsets(cVar.d());
    }

    public j1(u1 u1Var) {
        WindowInsets.Builder builderB;
        super(u1Var);
        WindowInsets windowInsetsB = u1Var.b();
        if (windowInsetsB != null) {
            builderB = androidx.activity.u.c(windowInsetsB);
        } else {
            builderB = androidx.activity.u.b();
        }
        this.f2636c = builderB;
    }
}
