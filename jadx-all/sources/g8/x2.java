package g8;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class x2 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7217b;

    public /* synthetic */ x2(Object obj, int i10) {
        this.f7216a = i10;
        this.f7217b = obj;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        switch (this.f7216a) {
            case 0:
                Logger logger = l3.f6919b0;
                Level level = Level.SEVERE;
                StringBuilder sb = new StringBuilder("[");
                l3 l3Var = (l3) this.f7217b;
                sb.append(l3Var.f6926a);
                sb.append("] Uncaught exception in the SynchronizationContext. Panic!");
                logger.log(level, sb.toString(), th);
                if (l3Var.f6951y) {
                    return;
                }
                l3Var.f6951y = true;
                l3Var.B(true);
                l3Var.G(false);
                w2 w2Var = new w2(l3Var, th);
                l3Var.f6950x = w2Var;
                l3Var.D.i(w2Var);
                l3Var.P.t(null);
                l3Var.N.a(4, "PANIC! Entering TRANSIENT_FAILURE");
                l3Var.f6944r.c(e8.x.f5396c);
                return;
            default:
                throw new e8.e2(e8.c2.d(th).g("Uncaught exception in the SynchronizationContext. Re-thrown."));
        }
    }
}
