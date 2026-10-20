package g8;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class o5 implements Executor {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f7027c = Logger.getLogger(o5.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f7028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayDeque f7029b;

    public final void a() {
        while (true) {
            Runnable runnable = (Runnable) this.f7029b.poll();
            if (runnable == null) {
                return;
            }
            try {
                runnable.run();
            } catch (Throwable th) {
                f7027c.log(Level.SEVERE, "Exception while executing runnable " + runnable, th);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        y3.e.J(runnable, "'task' must not be null.");
        if (this.f7028a) {
            if (this.f7029b == null) {
                this.f7029b = new ArrayDeque(4);
            }
            this.f7029b.add(runnable);
            return;
        }
        this.f7028a = true;
        try {
            runnable.run();
            if (this.f7029b != null) {
            }
        } catch (Throwable th) {
            try {
                f7027c.log(Level.SEVERE, "Exception while executing runnable " + runnable, th);
            } finally {
                if (this.f7029b != null) {
                    a();
                }
                this.f7028a = false;
            }
        }
    }
}
