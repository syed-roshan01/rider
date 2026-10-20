package y1;

/* JADX INFO: loaded from: classes.dex */
public final class n extends d9.j implements c9.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f16791b = new n(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n f16792c = new n(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n f16793d = new n(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16794a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i10) {
        super(1);
        this.f16794a = i10;
    }

    public final Boolean a(androidx.compose.ui.node.a aVar) {
        switch (this.f16794a) {
            case 0:
                j jVarN = aVar.n();
                return Boolean.valueOf(jVarN != null && jVarN.f16787b);
            case 1:
                j jVarN2 = aVar.n();
                return Boolean.valueOf(jVarN2 != null && jVarN2.f16787b);
            default:
                return Boolean.valueOf(aVar.C.d(8));
        }
    }

    @Override // c9.c
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f16794a) {
            case 0:
                break;
            case 1:
                break;
        }
        return a((androidx.compose.ui.node.a) obj);
    }
}
