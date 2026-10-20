package g8;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes.dex */
public final class s4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f7109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f7110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runnable f7111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q6.l f7112d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f7113e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f7114f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ScheduledFuture f7115g;

    public s4(u2 u2Var, e8.h2 h2Var, ScheduledExecutorService scheduledExecutorService, q6.l lVar) {
        this.f7111c = u2Var;
        this.f7110b = h2Var;
        this.f7109a = scheduledExecutorService;
        this.f7112d = lVar;
        lVar.b();
    }
}
