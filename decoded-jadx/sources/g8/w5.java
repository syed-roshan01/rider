package g8;

import java.util.IdentityHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class w5 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final w5 f7202d = new w5(new r7.e(24, 0));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IdentityHashMap f7203a = new IdentityHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r7.e f7204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ScheduledExecutorService f7205c;

    public w5(r7.e eVar) {
        this.f7204b = eVar;
    }

    public static Object a(v5 v5Var) {
        Object obj;
        w5 w5Var = f7202d;
        synchronized (w5Var) {
            try {
                u5 u5Var = (u5) w5Var.f7203a.get(v5Var);
                if (u5Var == null) {
                    r7.e eVar = (r7.e) v5Var;
                    u5Var = new u5(eVar.b());
                    w5Var.f7203a.put(eVar, u5Var);
                }
                ScheduledFuture scheduledFuture = u5Var.f7159c;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    u5Var.f7159c = null;
                }
                u5Var.f7158b++;
                obj = u5Var.f7157a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public static void b(v5 v5Var, Executor executor) {
        w5 w5Var = f7202d;
        synchronized (w5Var) {
            try {
                u5 u5Var = (u5) w5Var.f7203a.get(v5Var);
                if (u5Var == null) {
                    throw new IllegalArgumentException("No cached instance found for " + v5Var);
                }
                y3.e.G("Releasing the wrong instance", executor == u5Var.f7157a);
                y3.e.N("Refcount has already reached zero", u5Var.f7158b > 0);
                int i10 = u5Var.f7158b - 1;
                u5Var.f7158b = i10;
                if (i10 == 0) {
                    y3.e.N("Destroy task already scheduled", u5Var.f7159c == null);
                    if (w5Var.f7205c == null) {
                        w5Var.f7204b.getClass();
                        w5Var.f7205c = Executors.newSingleThreadScheduledExecutor(s1.e("grpc-shared-destroyer-%d"));
                    }
                    u5Var.f7159c = w5Var.f7205c.schedule(new r2(new k.e(w5Var, u5Var, v5Var, executor, 9)), 1L, TimeUnit.SECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
