package e8;

/* JADX INFO: loaded from: classes.dex */
public final class g2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f5263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f5264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5265c;

    public g2(Runnable runnable) {
        this.f5263a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f5264b) {
            return;
        }
        this.f5265c = true;
        this.f5263a.run();
    }
}
