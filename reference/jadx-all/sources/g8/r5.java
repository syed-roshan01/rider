package g8;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class r5 implements Executor, Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Logger f7077d = Logger.getLogger(r5.class.getName());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l f7078e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f7079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentLinkedQueue f7080b = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f7081c = 0;

    static {
        l q5Var;
        try {
            q5Var = new p5(AtomicIntegerFieldUpdater.newUpdater(r5.class, "c"));
        } catch (Throwable th) {
            f7077d.log(Level.SEVERE, "FieldUpdaterAtomicHelper failed", th);
            q5Var = new q5();
        }
        f7078e = q5Var;
    }

    public r5(Executor executor) {
        y3.e.J(executor, "'executor' must not be null.");
        this.f7079a = executor;
    }

    public final void a(Runnable runnable) {
        l lVar = f7078e;
        if (lVar.v(this)) {
            try {
                this.f7079a.execute(this);
            } catch (Throwable th) {
                if (runnable != null) {
                    this.f7080b.remove(runnable);
                }
                lVar.w(this);
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        ConcurrentLinkedQueue concurrentLinkedQueue = this.f7080b;
        y3.e.J(runnable, "'r' must not be null.");
        concurrentLinkedQueue.add(runnable);
        a(runnable);
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        l lVar = f7078e;
        while (true) {
            concurrentLinkedQueue = this.f7080b;
            try {
                Runnable runnable = (Runnable) concurrentLinkedQueue.poll();
                if (runnable == null) {
                    break;
                }
                try {
                    runnable.run();
                } catch (RuntimeException e4) {
                    f7077d.log(Level.SEVERE, "Exception while executing runnable " + runnable, (Throwable) e4);
                }
            } catch (Throwable th) {
                lVar.w(this);
                throw th;
            }
        }
        lVar.w(this);
        if (concurrentLinkedQueue.isEmpty()) {
            return;
        }
        a(null);
    }
}
