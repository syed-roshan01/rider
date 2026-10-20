package g8;

/* JADX INFO: loaded from: classes.dex */
public final class a3 implements t3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l3 f6644a;

    public a3(l3 l3Var) {
        this.f6644a = l3Var;
    }

    @Override // g8.t3
    public final void a() {
        l3 l3Var = this.f6644a;
        y3.e.N("Channel must have been shut down", l3Var.F.get());
        l3Var.H = true;
        l3Var.G(false);
        l3.z(l3Var);
        l3.A(l3Var);
    }

    @Override // g8.t3
    public final void b(boolean z10) {
        l3 l3Var = this.f6644a;
        l3Var.X.f(l3Var.D, z10);
    }

    @Override // g8.t3
    public final void c() {
    }

    @Override // g8.t3
    public final void d(e8.c2 c2Var) {
        y3.e.N("Channel must have been shut down", this.f6644a.F.get());
    }
}
