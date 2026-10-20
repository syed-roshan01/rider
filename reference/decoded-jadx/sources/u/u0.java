package u;

/* JADX INFO: loaded from: classes.dex */
public final class u0 extends d9.j implements c9.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u0 f14946b = new u0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u0 f14947c = new u0(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u0 f14948d = new u0(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14949a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(int i10) {
        super(0);
        this.f14949a = i10;
    }

    @Override // c9.a
    public final Object invoke() {
        switch (this.f14949a) {
            case 0:
                return null;
            case 1:
                return k0.f14833a;
            default:
                return new z1();
        }
    }
}
