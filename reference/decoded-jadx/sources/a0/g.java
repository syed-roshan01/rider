package a0;

/* JADX INFO: loaded from: classes.dex */
public final class g extends d9.j implements c9.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f800b = new g(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f801c = new g(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f802a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i10) {
        super(1);
        this.f802a = i10;
    }

    @Override // c9.c
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f802a) {
            case 0:
                return q8.l.f13235a;
            default:
                ((Number) obj).intValue();
                return null;
        }
    }
}
