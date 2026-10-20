package g8;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class r2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f7072b = Logger.getLogger(r2.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f7073a;

    public r2(Runnable runnable) {
        this.f7073a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable = this.f7073a;
        try {
            runnable.run();
        } catch (Throwable th) {
            f7072b.log(Level.SEVERE, "Exception while executing runnable " + runnable, th);
            Object obj = q6.q.f13221a;
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (!(th instanceof Error)) {
                throw new AssertionError(th);
            }
            throw ((Error) th);
        }
    }

    public final String toString() {
        return "LogExceptionRunnable(" + this.f7073a + ")";
    }
}
