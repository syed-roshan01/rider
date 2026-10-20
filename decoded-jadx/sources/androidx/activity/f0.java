package androidx.activity;

/* JADX INFO: loaded from: classes.dex */
public final class f0 implements androidx.lifecycle.u, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.r f1380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f1381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g0 f1382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i0 f1383d;

    public f0(i0 i0Var, androidx.lifecycle.r rVar, y yVar) {
        d7.a.m(yVar, "onBackPressedCallback");
        this.f1383d = i0Var;
        this.f1380a = rVar;
        this.f1381b = yVar;
        rVar.a(this);
    }

    @Override // androidx.activity.c
    public final void cancel() {
        this.f1380a.c(this);
        y yVar = this.f1381b;
        yVar.getClass();
        yVar.f1429b.remove(this);
        g0 g0Var = this.f1382c;
        if (g0Var != null) {
            g0Var.cancel();
        }
        this.f1382c = null;
    }

    @Override // androidx.lifecycle.u
    public final void onStateChanged(androidx.lifecycle.w wVar, androidx.lifecycle.p pVar) {
        if (pVar != androidx.lifecycle.p.ON_START) {
            if (pVar != androidx.lifecycle.p.ON_STOP) {
                if (pVar == androidx.lifecycle.p.ON_DESTROY) {
                    cancel();
                    return;
                }
                return;
            } else {
                g0 g0Var = this.f1382c;
                if (g0Var != null) {
                    g0Var.cancel();
                    return;
                }
                return;
            }
        }
        i0 i0Var = this.f1383d;
        i0Var.getClass();
        y yVar = this.f1381b;
        d7.a.m(yVar, "onBackPressedCallback");
        i0Var.f1395b.addLast(yVar);
        g0 g0Var2 = new g0(i0Var, yVar);
        yVar.f1429b.add(g0Var2);
        i0Var.d();
        yVar.f1430c = new h0(i0Var, 1);
        this.f1382c = g0Var2;
    }
}
