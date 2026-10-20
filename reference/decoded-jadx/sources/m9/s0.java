package m9;

/* JADX INFO: loaded from: classes.dex */
public final class s0 extends t0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runnable f11996c;

    public s0(Runnable runnable, long j10) {
        super(j10);
        this.f11996c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11996c.run();
    }

    @Override // m9.t0
    public final String toString() {
        return super.toString() + this.f11996c;
    }
}
