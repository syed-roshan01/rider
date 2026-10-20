package m9;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes.dex */
public final class f0 extends v0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final f0 f11940q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final long f11941r;

    static {
        Long l10;
        f0 f0Var = new f0();
        f11940q = f0Var;
        f0Var.i0(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        f11941r = timeUnit.toNanos(l10.longValue());
    }

    @Override // m9.v0, m9.j0
    public final o0 Q(long j10, Runnable runnable, u8.j jVar) {
        long j11 = 0;
        if (j10 > 0) {
            j11 = j10 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j10;
        }
        if (j11 >= 4611686018427387903L) {
            return u1.f12007a;
        }
        long jNanoTime = System.nanoTime();
        s0 s0Var = new s0(runnable, j11 + jNanoTime);
        q0(jNanoTime, s0Var);
        return s0Var;
    }

    @Override // m9.w0
    public final Thread h0() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    @Override // m9.w0
    public final void m0(long j10, t0 t0Var) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // m9.v0
    public final void n0(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.n0(runnable);
    }

    public final synchronized void r0() {
        int i10 = debugStatus;
        if (i10 == 2 || i10 == 3) {
            debugStatus = 3;
            v0.f12010n.set(this, null);
            v0.f12011o.set(this, null);
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        a2.f11904a.set(this);
        try {
            synchronized (this) {
                int i10 = debugStatus;
                if (i10 != 2 && i10 != 3) {
                    debugStatus = 1;
                    notifyAll();
                    long j10 = Long.MAX_VALUE;
                    while (true) {
                        Thread.interrupted();
                        long jK0 = k0();
                        if (jK0 == Long.MAX_VALUE) {
                            long jNanoTime = System.nanoTime();
                            if (j10 == Long.MAX_VALUE) {
                                j10 = f11941r + jNanoTime;
                            }
                            long j11 = j10 - jNanoTime;
                            if (j11 <= 0) {
                                _thread = null;
                                r0();
                                if (p0()) {
                                    return;
                                }
                                h0();
                                return;
                            }
                            if (jK0 > j11) {
                                jK0 = j11;
                            }
                        } else {
                            j10 = Long.MAX_VALUE;
                        }
                        if (jK0 > 0) {
                            int i11 = debugStatus;
                            if (i11 == 2 || i11 == 3) {
                                break;
                                break;
                            }
                            LockSupport.parkNanos(this, jK0);
                        }
                    }
                    _thread = null;
                    r0();
                    if (p0()) {
                        return;
                    }
                    h0();
                    return;
                }
                _thread = null;
                r0();
                if (p0()) {
                    return;
                }
                h0();
            }
        } catch (Throwable th) {
            _thread = null;
            r0();
            if (!p0()) {
                h0();
            }
            throw th;
        }
    }

    @Override // m9.v0, m9.w0
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
