package g8;

/* JADX INFO: loaded from: classes.dex */
public final class x0 extends d1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final j4 f7209j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final e8.b0 f7210k = e8.b0.b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e8.p[] f7211l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ y0 f7212m;

    public x0(y0 y0Var, j4 j4Var, e8.p[] pVarArr) {
        this.f7212m = y0Var;
        this.f7209j = j4Var;
        this.f7211l = pVarArr;
    }

    @Override // g8.d1, g8.h0
    public final void f(u uVar) {
        if (Boolean.TRUE.equals(this.f7209j.f6890a.f5274h)) {
            uVar.b("wait_for_ready");
        }
        super.f(uVar);
    }

    @Override // g8.d1, g8.h0
    public final void i(e8.c2 c2Var) {
        super.i(c2Var);
        synchronized (this.f7212m.f7245b) {
            try {
                y0 y0Var = this.f7212m;
                if (y0Var.f7250g != null) {
                    boolean zRemove = y0Var.f7252i.remove(this);
                    if (!this.f7212m.h() && zRemove) {
                        y0 y0Var2 = this.f7212m;
                        y0Var2.f7247d.b(y0Var2.f7249f);
                        y0 y0Var3 = this.f7212m;
                        if (y0Var3.f7253j != null) {
                            y0Var3.f7247d.b(y0Var3.f7250g);
                            this.f7212m.f7250g = null;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f7212m.f7247d.a();
    }

    @Override // g8.d1
    public final void t(e8.c2 c2Var) {
        for (e8.p pVar : this.f7211l) {
            pVar.j0(c2Var);
        }
    }
}
