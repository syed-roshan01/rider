package g8;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class t implements j5 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f7118f = Logger.getLogger(t.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f7119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e8.h2 f7120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r7.e f7121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i1 f7122d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public v6.d f7123e;

    public t(r7.e eVar, ScheduledExecutorService scheduledExecutorService, e8.h2 h2Var) {
        this.f7121c = eVar;
        this.f7119a = scheduledExecutorService;
        this.f7120b = h2Var;
    }

    public final void a(t0 t0Var) {
        this.f7120b.d();
        if (this.f7122d == null) {
            this.f7121c.getClass();
            this.f7122d = r7.e.d();
        }
        v6.d dVar = this.f7123e;
        if (dVar != null) {
            e8.g2 g2Var = (e8.g2) dVar.f15907b;
            if (!g2Var.f5265c && !g2Var.f5264b) {
                return;
            }
        }
        long jA = this.f7122d.a();
        this.f7123e = this.f7120b.c(t0Var, jA, TimeUnit.NANOSECONDS, this.f7119a);
        f7118f.log(Level.FINE, "Scheduling DNS resolution backoff for {0}ns", Long.valueOf(jA));
    }
}
