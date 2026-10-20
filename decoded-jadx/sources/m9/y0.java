package m9;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class y0 extends x0 implements j0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f12023c;

    public y0(Executor executor) {
        Method method;
        this.f12023c = executor;
        Method method2 = r9.c.f13695a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = r9.c.f13695a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // m9.j0
    public final void M(long j10, l lVar) {
        Executor executor = this.f12023c;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(new l.h(this, lVar, 20), j10, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e4) {
                CancellationException cancellationExceptionA = d7.a.a("The task was rejected", e4);
                f1 f1Var = (f1) lVar.f11962e.f(a0.f11902b);
                if (f1Var != null) {
                    f1Var.a(cancellationExceptionA);
                }
            }
        }
        if (scheduledFutureSchedule != null) {
            lVar.v(new i(scheduledFutureSchedule, 0));
        } else {
            f0.f11940q.M(j10, lVar);
        }
    }

    @Override // m9.j0
    public final o0 Q(long j10, Runnable runnable, u8.j jVar) {
        Executor executor = this.f12023c;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(runnable, j10, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e4) {
                CancellationException cancellationExceptionA = d7.a.a("The task was rejected", e4);
                f1 f1Var = (f1) jVar.f(a0.f11902b);
                if (f1Var != null) {
                    f1Var.a(cancellationExceptionA);
                }
            }
        }
        return scheduledFutureSchedule != null ? new n0(scheduledFutureSchedule) : f0.f11940q.Q(j10, runnable, jVar);
    }

    @Override // m9.z
    public final void c0(u8.j jVar, Runnable runnable) {
        try {
            this.f12023c.execute(runnable);
        } catch (RejectedExecutionException e4) {
            CancellationException cancellationExceptionA = d7.a.a("The task was rejected", e4);
            f1 f1Var = (f1) jVar.f(a0.f11902b);
            if (f1Var != null) {
                f1Var.a(cancellationExceptionA);
            }
            m0.f11970b.c0(jVar, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f12023c;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof y0) && ((y0) obj).f12023c == this.f12023c;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f12023c);
    }

    @Override // m9.z
    public final String toString() {
        return this.f12023c.toString();
    }
}
