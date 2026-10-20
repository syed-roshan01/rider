package e8;

/* JADX INFO: loaded from: classes.dex */
public final class f2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g2 f5244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f5245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f5246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h2 f5247d;

    public f2(h2 h2Var, g2 g2Var, y2.a aVar, long j10) {
        this.f5247d = h2Var;
        this.f5244a = g2Var;
        this.f5245b = aVar;
        this.f5246c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5247d.execute(this.f5244a);
    }

    public final String toString() {
        return this.f5245b.toString() + "(scheduled in SynchronizationContext with delay of " + this.f5246c + ")";
    }
}
