package m9;

/* JADX INFO: loaded from: classes.dex */
public final class x extends d9.j implements c9.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x f12020b = new x(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x f12021c = new x(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12022a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(int i10) {
        super(1);
        this.f12022a = i10;
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        switch (this.f12022a) {
            case 0:
                u8.h hVar = (u8.h) obj;
                if (hVar instanceof z) {
                    return (z) hVar;
                }
                return null;
            default:
                u8.h hVar2 = (u8.h) obj;
                if (hVar2 instanceof x0) {
                    return (x0) hVar2;
                }
                return null;
        }
    }
}
