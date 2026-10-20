package g8;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f6735b;

    public e(f fVar, int i10) {
        this.f6735b = fVar;
        this.f6734a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f fVar = this.f6735b;
        try {
            o8.b.d();
            try {
                o8.b.b();
                fVar.f6749a.a(this.f6734a);
                o8.b.f12664a.getClass();
            } catch (Throwable th) {
                try {
                    o8.b.f12664a.getClass();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            ((h8.k) fVar).b(th3);
        }
    }
}
