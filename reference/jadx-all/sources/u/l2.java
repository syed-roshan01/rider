package u;

/* JADX INFO: loaded from: classes.dex */
public final class l2 extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14846a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f14847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m9.d0 f14848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f14849d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(m9.d0 d0Var, boolean z10, p2 p2Var) {
        super(2);
        this.f14848c = d0Var;
        this.f14847b = z10;
        this.f14849d = p2Var;
    }

    public final Boolean a(float f10, float f11) {
        m9.d0 d0Var = this.f14848c;
        int i10 = this.f14846a;
        Object obj = this.f14849d;
        switch (i10) {
            case 0:
                z6.a.Q(d0Var, null, 0, new k2(this.f14847b, (p2) obj, f11, f10, null), 3);
                break;
            default:
                if (this.f14847b) {
                    f10 = f11;
                }
                z6.a.Q(d0Var, null, 0, new a0.k0((a0.h0) obj, f10, null), 3);
                break;
        }
        return Boolean.TRUE;
    }

    @Override // c9.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f14846a) {
            case 0:
                break;
        }
        return a(((Number) obj).floatValue(), ((Number) obj2).floatValue());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(boolean z10, m9.d0 d0Var, a0.h0 h0Var) {
        super(2);
        this.f14847b = z10;
        this.f14848c = d0Var;
        this.f14849d = h0Var;
    }
}
