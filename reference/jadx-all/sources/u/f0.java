package u;

/* JADX INFO: loaded from: classes.dex */
public final class f0 extends d9.j implements c9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f14770b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(g0 g0Var, int i10) {
        super(0);
        this.f14769a = i10;
        this.f14770b = g0Var;
    }

    @Override // c9.a
    public final Object invoke() {
        g0 g0Var = this.f14770b;
        int i10 = this.f14769a;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        g0Var.f14779x.invoke();
                        break;
                    default:
                        c9.a aVar = g0Var.f14781z;
                        if (aVar != null) {
                            aVar.invoke();
                        }
                        break;
                }
                break;
            default:
                switch (i10) {
                    case 0:
                        g0Var.f14779x.invoke();
                        break;
                    default:
                        c9.a aVar2 = g0Var.f14781z;
                        if (aVar2 != null) {
                            aVar2.invoke();
                        }
                        break;
                }
                break;
        }
        return Boolean.TRUE;
    }
}
