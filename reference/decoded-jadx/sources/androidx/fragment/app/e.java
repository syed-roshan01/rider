package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1894b;

    public /* synthetic */ e(Object obj, int i10) {
        this.f1893a = i10;
        this.f1894b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f1893a;
        Object obj = this.f1894b;
        switch (i10) {
            case 0:
                f fVar = (f) obj;
                fVar.f1903b.endViewTransition(fVar.f1904c);
                fVar.f1905d.a();
                break;
            case 1:
                r rVar = (r) obj;
                rVar.f2002b.onDismiss(rVar.f2010q);
                break;
            default:
                ((x0) obj).t(true);
                break;
        }
    }
}
