package e8;

import g8.n5;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1 f5347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h2 f5348c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n5 f5349d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ScheduledExecutorService f5350e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i f5351f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Executor f5352g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f5353h;

    public q1(Integer num, w1 w1Var, h2 h2Var, n5 n5Var, ScheduledExecutorService scheduledExecutorService, i iVar, Executor executor, String str) {
        y3.e.J(num, "defaultPort not set");
        this.f5346a = num.intValue();
        y3.e.J(w1Var, "proxyDetector not set");
        this.f5347b = w1Var;
        y3.e.J(h2Var, "syncContext not set");
        this.f5348c = h2Var;
        y3.e.J(n5Var, "serviceConfigParser not set");
        this.f5349d = n5Var;
        this.f5350e = scheduledExecutorService;
        this.f5351f = iVar;
        this.f5352g = executor;
        this.f5353h = str;
    }

    public final String toString() {
        q6.g gVarJ0 = f6.a.j0(this);
        gVarJ0.d(String.valueOf(this.f5346a), "defaultPort");
        gVarJ0.a(this.f5347b, "proxyDetector");
        gVarJ0.a(this.f5348c, "syncContext");
        gVarJ0.a(this.f5349d, "serviceConfigParser");
        gVarJ0.a(this.f5350e, "scheduledExecutorService");
        gVarJ0.a(this.f5351f, "channelLogger");
        gVarJ0.a(this.f5352g, "executor");
        gVarJ0.a(this.f5353h, "overrideAuthority");
        return gVarJ0.toString();
    }
}
