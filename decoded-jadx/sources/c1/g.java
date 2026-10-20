package c1;

/* JADX INFO: loaded from: classes.dex */
public final class g extends d9.j implements c9.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f2887b = new g(2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f2888c = new g(3);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f2889d = new g(4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g f2890e = new g(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2891a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i10) {
        super(1);
        this.f2891a = i10;
    }

    public final k a() {
        switch (this.f2891a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return k.f2903b;
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        int i10 = this.f2891a;
        switch (i10) {
            case 0:
                int i11 = ((b) obj).f2875a;
                return a();
            case 1:
                int i12 = ((b) obj).f2875a;
                return a();
            case 2:
                int i13 = ((b) obj).f2875a;
                return a();
            case 3:
                int i14 = ((b) obj).f2875a;
                return a();
            case 4:
                p pVar = (p) obj;
                switch (i10) {
                    case 4:
                        return Boolean.valueOf(androidx.compose.ui.focus.a.C(pVar));
                    default:
                        return Boolean.valueOf(androidx.compose.ui.focus.a.C(pVar));
                }
            default:
                p pVar2 = (p) obj;
                switch (i10) {
                    case 4:
                        return Boolean.valueOf(androidx.compose.ui.focus.a.C(pVar2));
                    default:
                        return Boolean.valueOf(androidx.compose.ui.focus.a.C(pVar2));
                }
        }
    }
}
