package u1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c9.a f15310b;

    public /* synthetic */ v(c9.a aVar, int i10) {
        this.f15309a = i10;
        this.f15310b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f15309a;
        c9.a aVar = this.f15310b;
        switch (i10) {
            case 0:
                aVar.invoke();
                break;
            default:
                aVar.invoke();
                break;
        }
    }
}
