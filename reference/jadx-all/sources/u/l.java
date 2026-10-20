package u;

/* JADX INFO: loaded from: classes.dex */
public final class l extends d9.j implements c9.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f14839b = new l(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f14840c = new l(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14841a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i10) {
        super(3);
        this.f14841a = i10;
    }

    public final r1.k0 a(r1.l0 l0Var, r1.i0 i0Var, long j10) {
        r8.s sVar = r8.s.f13662a;
        switch (this.f14841a) {
            case 0:
                r1.x0 x0VarF = i0Var.f(j10);
                int iJ = l0Var.J(i0.f14800a * 2);
                int iB0 = x0VarF.b0() - iJ;
                int i10 = 0;
                if (iB0 < 0) {
                    iB0 = 0;
                }
                int iA0 = x0VarF.a0() - iJ;
                if (iA0 < 0) {
                    iA0 = 0;
                }
                return l0Var.N(iB0, iA0, sVar, new k(x0VarF, iJ, i10));
            default:
                r1.x0 x0VarF2 = i0Var.f(j10);
                int iJ2 = l0Var.J(i0.f14800a * 2);
                return l0Var.N(x0VarF2.f13423a + iJ2, x0VarF2.f13424b + iJ2, sVar, new k(x0VarF2, iJ2, 1));
        }
    }

    @Override // c9.f
    public final /* synthetic */ Object e(Object obj, Object obj2, Object obj3) {
        switch (this.f14841a) {
            case 0:
                break;
        }
        return a((r1.l0) obj, (r1.i0) obj2, ((m2.a) obj3).f11792a);
    }
}
