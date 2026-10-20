package u;

/* JADX INFO: loaded from: classes.dex */
public final class w0 extends y0.n implements s1.f, t1.t {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f14969u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public r1.s f14970v;

    @Override // t1.t
    public final void r0(t1.c1 c1Var) {
        this.f14970v = c1Var;
        if (this.f14969u) {
            if (!c1Var.K0().f16742t) {
                c9.c cVar = this.f16742t ? (c9.c) g(v0.f14964a) : null;
                if (cVar != null) {
                    cVar.invoke(null);
                    return;
                }
                return;
            }
            r1.s sVar = this.f14970v;
            if (sVar == null || !sVar.L()) {
                return;
            }
            c9.c cVar2 = this.f16742t ? (c9.c) g(v0.f14964a) : null;
            if (cVar2 != null) {
                cVar2.invoke(this.f14970v);
            }
        }
    }
}
