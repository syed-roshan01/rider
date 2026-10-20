package u1;

/* JADX INFO: loaded from: classes.dex */
public final class s extends d9.j implements c9.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s f15261b = new s(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s f15262c = new s(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s f15263d = new s(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final s f15264e = new s(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final s f15265f = new s(4);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final s f15266n = new s(5);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final s f15267o = new s(6);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final s f15268p = new s(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15269a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(int i10) {
        super(1);
        this.f15269a = i10;
    }

    public final Boolean a(androidx.compose.ui.node.a aVar) {
        boolean z10 = false;
        switch (this.f15269a) {
            case 2:
                y1.j jVarN = aVar.n();
                if (jVarN != null && jVarN.f16787b) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            case 3:
                return Boolean.valueOf(aVar.C.d(8));
            default:
                y1.j jVarN2 = aVar.n();
                if (jVarN2 != null && jVarN2.f16787b) {
                    if (jVarN2.f16786a.containsKey(y1.i.f16768h)) {
                        z10 = true;
                    }
                }
                return Boolean.valueOf(z10);
        }
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        q8.l lVar = q8.l.f13235a;
        switch (this.f15269a) {
            case 0:
                return lVar;
            case 1:
                return Boolean.FALSE;
            case 2:
                return a((androidx.compose.ui.node.a) obj);
            case 3:
                return a((androidx.compose.ui.node.a) obj);
            case 4:
                return a((androidx.compose.ui.node.a) obj);
            case 5:
                return (g2.v) obj;
            case 6:
                return Boolean.valueOf(x1.l(obj));
            case 7:
                return null;
            default:
                a7.a.w(obj);
                return lVar;
        }
    }
}
