package r9;

/* JADX INFO: loaded from: classes.dex */
public final class w extends d9.j implements c9.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final w f13731b = new w(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w f13732c = new w(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final w f13733d = new w(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13734a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(int i10) {
        super(2);
        this.f13734a = i10;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f13734a) {
            case 0:
                return obj;
            case 1:
                a7.a.w(obj);
                return null;
            default:
                return (y) obj;
        }
    }
}
