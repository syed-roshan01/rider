package u;

/* JADX INFO: loaded from: classes.dex */
public final class s0 extends y0.n implements t1.m, t1.f1 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public a0.z f14926u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f14927v;

    @Override // y0.n
    public final void B0() {
        a0.z zVar = this.f14926u;
        if (zVar != null) {
            zVar.b();
        }
        this.f14926u = null;
    }

    @Override // t1.f1
    public final void G() {
        d9.u uVar = new d9.u();
        t1.g.w(this, new r0(0, uVar, this));
        a0.z zVar = (a0.z) uVar.f4952a;
        if (this.f14927v) {
            a0.z zVar2 = this.f14926u;
            if (zVar2 != null) {
                zVar2.b();
            }
            if (zVar != null) {
                zVar.a();
            } else {
                zVar = null;
            }
            this.f14926u = zVar;
        }
    }
}
