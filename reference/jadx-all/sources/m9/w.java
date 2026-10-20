package m9;

/* JADX INFO: loaded from: classes.dex */
public final class w extends d9.j implements c9.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final w f12013b = new w(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w f12014c = new w(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12015a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(int i10) {
        super(2);
        this.f12015a = i10;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f12015a) {
            case 0:
                return ((u8.j) obj).O((u8.h) obj2);
            default:
                return Boolean.valueOf(((Boolean) obj).booleanValue());
        }
    }
}
