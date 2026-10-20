package g8;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class q2 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f7042l = TimeUnit.SECONDS.toNanos(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f7043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q6.l f7044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p2 f7045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f7046d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7047e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ScheduledFuture f7048f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ScheduledFuture f7049g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r2 f7050h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final r2 f7051i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f7052j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f7053k;

    static {
        TimeUnit.MILLISECONDS.toNanos(10L);
    }

    public q2(p2 p2Var, ScheduledExecutorService scheduledExecutorService, long j10, long j11, boolean z10) {
        q6.l lVar = new q6.l();
        this.f7047e = 1;
        this.f7050h = new r2(new n2(this, 0));
        this.f7051i = new r2(new n2(this, 1));
        this.f7045c = p2Var;
        y3.e.J(scheduledExecutorService, "scheduler");
        this.f7043a = scheduledExecutorService;
        this.f7044b = lVar;
        this.f7052j = j10;
        this.f7053k = j11;
        this.f7046d = z10;
        lVar.f13212a = false;
        lVar.b();
    }

    public final synchronized void a() {
        try {
            q6.l lVar = this.f7044b;
            lVar.f13212a = false;
            lVar.b();
            int i10 = this.f7047e;
            if (i10 == 2) {
                this.f7047e = 3;
            } else if (i10 == 4 || i10 == 5) {
                ScheduledFuture scheduledFuture = this.f7048f;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                if (this.f7047e == 5) {
                    this.f7047e = 1;
                } else {
                    this.f7047e = 2;
                    y3.e.N("There should be no outstanding pingFuture", this.f7049g == null);
                    this.f7049g = this.f7043a.schedule(this.f7051i, this.f7052j, TimeUnit.NANOSECONDS);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b() {
        try {
            int i10 = this.f7047e;
            if (i10 == 1) {
                this.f7047e = 2;
                if (this.f7049g == null) {
                    ScheduledExecutorService scheduledExecutorService = this.f7043a;
                    r2 r2Var = this.f7051i;
                    long j10 = this.f7052j;
                    q6.l lVar = this.f7044b;
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    this.f7049g = scheduledExecutorService.schedule(r2Var, j10 - lVar.a(timeUnit), timeUnit);
                }
            } else if (i10 == 5) {
                this.f7047e = 4;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
