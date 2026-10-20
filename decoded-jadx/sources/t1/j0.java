package t1;

/* JADX INFO: loaded from: classes.dex */
public final class j0 extends d9.j implements c9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n0 f14454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1 f14455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f14456c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(n0 n0Var, l1 l1Var, long j10) {
        super(0);
        this.f14454a = n0Var;
        this.f14455b = l1Var;
        this.f14456c = j10;
    }

    @Override // c9.a
    public final Object invoke() {
        r0 r0VarI0;
        n0 n0Var = this.f14454a;
        r1.w0 placementScope = null;
        if (g.v(n0Var.f14494a)) {
            c1 c1Var = n0Var.a().f14397r;
            if (c1Var != null) {
                placementScope = c1Var.f14533o;
            }
        } else {
            c1 c1Var2 = n0Var.a().f14397r;
            if (c1Var2 != null && (r0VarI0 = c1Var2.I0()) != null) {
                placementScope = r0VarI0.f14533o;
            }
        }
        if (placementScope == null) {
            placementScope = ((u1.w) this.f14455b).getPlacementScope();
        }
        r0 r0VarI1 = n0Var.a().I0();
        d7.a.j(r0VarI1);
        r1.w0.f(placementScope, r0VarI1, this.f14456c);
        return q8.l.f13235a;
    }
}
