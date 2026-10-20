package g8;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class n2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q2 f6981b;

    public /* synthetic */ n2(q2 q2Var, int i10) {
        this.f6980a = i10;
        this.f6981b = q2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q2 q2Var;
        boolean z10 = false;
        switch (this.f6980a) {
            case 0:
                synchronized (this.f6981b) {
                    q2Var = this.f6981b;
                    if (q2Var.f7047e != 6) {
                        q2Var.f7047e = 6;
                        z10 = true;
                    }
                    break;
                }
                if (z10) {
                    p2 p2Var = q2Var.f7045c;
                    p2Var.getClass();
                    p2Var.f7033a.c(e8.c2.f5224m.g("Keepalive failed. The connection is likely gone"));
                    return;
                }
                return;
            default:
                synchronized (this.f6981b) {
                    try {
                        q2 q2Var2 = this.f6981b;
                        q2Var2.f7049g = null;
                        int i10 = q2Var2.f7047e;
                        if (i10 == 2) {
                            q2Var2.f7047e = 4;
                            q2Var2.f7048f = q2Var2.f7043a.schedule(q2Var2.f7050h, q2Var2.f7053k, TimeUnit.NANOSECONDS);
                            z10 = true;
                        } else if (i10 == 3) {
                            ScheduledExecutorService scheduledExecutorService = q2Var2.f7043a;
                            r2 r2Var = q2Var2.f7051i;
                            long j10 = q2Var2.f7052j;
                            q6.l lVar = q2Var2.f7044b;
                            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                            q2Var2.f7049g = scheduledExecutorService.schedule(r2Var, j10 - lVar.a(timeUnit), timeUnit);
                            this.f6981b.f7047e = 2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                if (z10) {
                    p2 p2Var2 = this.f6981b.f7045c;
                    p2Var2.getClass();
                    p2Var2.f7033a.a(new o2(p2Var2));
                    return;
                }
                return;
        }
    }
}
