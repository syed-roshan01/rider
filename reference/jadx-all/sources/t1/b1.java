package t1;

/* JADX INFO: loaded from: classes.dex */
public final class b1 extends d9.j implements c9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c1 f14385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y0.n f14386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z0 f14387d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f14388e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v f14389f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f14390n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f14391o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f14392p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b1(c1 c1Var, y0.n nVar, z0 z0Var, long j10, v vVar, boolean z10, boolean z11, float f10, int i10) {
        super(0);
        this.f14384a = i10;
        this.f14385b = c1Var;
        this.f14386c = nVar;
        this.f14387d = z0Var;
        this.f14388e = j10;
        this.f14389f = vVar;
        this.f14390n = z10;
        this.f14391o = z11;
        this.f14392p = f10;
    }

    @Override // c9.a
    public final /* bridge */ /* synthetic */ Object invoke() {
        q8.l lVar = q8.l.f13235a;
        switch (this.f14384a) {
            case 0:
                m8233invoke();
                break;
            default:
                m8233invoke();
                break;
        }
        return lVar;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m8233invoke() {
        int i10 = 16;
        int i11 = this.f14384a;
        y0.n nVar = this.f14386c;
        z0 z0Var = this.f14387d;
        switch (i11) {
            case 0:
                c1 c1Var = this.f14385b;
                switch (((x9.v) z0Var).f16473a) {
                    case 0:
                        break;
                    default:
                        i10 = 8;
                        break;
                }
                y0.n nVarE = g.e(nVar, i10);
                z0 z0Var2 = this.f14387d;
                long j10 = this.f14388e;
                v vVar = this.f14389f;
                boolean z10 = this.f14390n;
                boolean z11 = this.f14391o;
                float f10 = this.f14392p;
                if (nVarE == null) {
                    c1Var.O0(z0Var2, j10, vVar, z10, z11);
                } else {
                    c1Var.getClass();
                    vVar.i(nVarE, f10, z11, new b1(c1Var, nVarE, z0Var2, j10, vVar, z10, z11, f10, 0));
                }
                break;
            default:
                c1 c1Var2 = this.f14385b;
                switch (((x9.v) z0Var).f16473a) {
                    case 0:
                        break;
                    default:
                        i10 = 8;
                        break;
                }
                c1Var2.Y0(g.e(nVar, i10), this.f14387d, this.f14388e, this.f14389f, this.f14390n, this.f14391o, this.f14392p);
                break;
        }
    }
}
