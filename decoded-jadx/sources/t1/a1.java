package t1;

/* JADX INFO: loaded from: classes.dex */
public final class a1 extends d9.j implements c9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c1 f14377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y0.n f14378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z0 f14379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f14380d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v f14381e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f14382f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f14383n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(c1 c1Var, y0.n nVar, z0 z0Var, long j10, v vVar, boolean z10, boolean z11) {
        super(0);
        this.f14377a = c1Var;
        this.f14378b = nVar;
        this.f14379c = z0Var;
        this.f14380d = j10;
        this.f14381e = vVar;
        this.f14382f = z10;
        this.f14383n = z11;
    }

    @Override // c9.a
    public final Object invoke() {
        int i10;
        c1 c1Var = this.f14377a;
        switch (((x9.v) this.f14379c).f16473a) {
            case 0:
                i10 = 16;
                break;
            default:
                i10 = 8;
                break;
        }
        y0.n nVarE = g.e(this.f14378b, i10);
        z0 z0Var = this.f14379c;
        long j10 = this.f14380d;
        v vVar = this.f14381e;
        boolean z10 = this.f14382f;
        boolean z11 = this.f14383n;
        if (nVarE == null) {
            c1Var.O0(z0Var, j10, vVar, z10, z11);
        } else {
            c1Var.getClass();
            vVar.i(nVarE, -1.0f, z11, new a1(c1Var, nVarE, z0Var, j10, vVar, z10, z11));
        }
        return q8.l.f13235a;
    }
}
