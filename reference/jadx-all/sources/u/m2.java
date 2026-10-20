package u;

/* JADX INFO: loaded from: classes.dex */
public final class m2 extends d9.j implements c9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p2 f14853b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m2(p2 p2Var, int i10) {
        super(0);
        this.f14852a = i10;
        this.f14853b = p2Var;
    }

    public final Boolean a() {
        int i10 = this.f14852a;
        p2 p2Var = this.f14853b;
        switch (i10) {
            case 2:
                return Boolean.valueOf(p2Var.f14884a.d() > 0);
            default:
                return Boolean.valueOf(p2Var.f14884a.d() < p2Var.f14887d.d());
        }
    }

    @Override // c9.a
    public final Object invoke() {
        p2 p2Var = this.f14853b;
        int i10 = this.f14852a;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        return Float.valueOf(p2Var.f14884a.d());
                    default:
                        return Float.valueOf(p2Var.f14887d.d());
                }
            case 1:
                switch (i10) {
                    case 0:
                        return Float.valueOf(p2Var.f14884a.d());
                    default:
                        return Float.valueOf(p2Var.f14887d.d());
                }
            case 2:
                return a();
            default:
                return a();
        }
    }
}
