package m0;

/* JADX INFO: loaded from: classes.dex */
public final class p implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11623b;

    public /* synthetic */ p(Object obj, int i10) {
        this.f11622a = i10;
        this.f11623b = obj;
    }

    public final void a() {
        int i10 = this.f11622a;
        Object obj = this.f11623b;
        switch (i10) {
            case 0:
                ((q) obj).f11655z--;
                break;
            default:
                ((w0.z) obj).f16142j--;
                break;
        }
    }

    public final void b() {
        int i10 = this.f11622a;
        Object obj = this.f11623b;
        switch (i10) {
            case 0:
                ((q) obj).f11655z++;
                break;
            default:
                ((w0.z) obj).f16142j++;
                break;
        }
    }
}
