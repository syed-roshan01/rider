package u;

/* JADX INFO: loaded from: classes.dex */
public final class g0 extends y0.n implements t1.r1 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f14776u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f14777v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public y1.g f14778w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public c9.a f14779x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f14780y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public c9.a f14781z;

    @Override // t1.r1
    public final void Q(y1.j jVar) {
        y1.g gVar = this.f14778w;
        if (gVar != null) {
            y1.t.d(jVar, gVar.f16757a);
        }
        String str = this.f14777v;
        f0 f0Var = new f0(this, 0);
        j9.f[] fVarArr = y1.t.f16843a;
        jVar.k(y1.i.f16762b, new y1.a(str, f0Var));
        if (this.f14781z != null) {
            jVar.k(y1.i.f16763c, new y1.a(this.f14780y, new f0(this, 1)));
        }
        if (this.f14776u) {
            return;
        }
        jVar.k(y1.r.f16824i, q8.l.f13235a);
    }

    @Override // t1.r1
    public final boolean d0() {
        return true;
    }
}
