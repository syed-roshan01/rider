package ja;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public class d extends i0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ReentrantLock f8520h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Condition f8521i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f8522j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final long f8523k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static d f8524l;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f8525e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f8526f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f8527g;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f8520h = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        d7.a.l(conditionNewCondition, "newCondition(...)");
        f8521i = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f8522j = millis;
        f8523k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void h() {
        d dVar;
        long j10 = this.f8538c;
        boolean z10 = this.f8536a;
        if (j10 != 0 || z10) {
            ReentrantLock reentrantLock = f8520h;
            reentrantLock.lock();
            try {
                if (!(!this.f8525e)) {
                    throw new IllegalStateException("Unbalanced enter/exit".toString());
                }
                this.f8525e = true;
                if (f8524l == null) {
                    f8524l = new d();
                    new h6.f().start();
                }
                long jNanoTime = System.nanoTime();
                if (j10 != 0 && z10) {
                    this.f8527g = Math.min(j10, c() - jNanoTime) + jNanoTime;
                } else if (j10 != 0) {
                    this.f8527g = j10 + jNanoTime;
                } else {
                    if (!z10) {
                        throw new AssertionError();
                    }
                    this.f8527g = c();
                }
                long j11 = this.f8527g - jNanoTime;
                d dVar2 = f8524l;
                d7.a.j(dVar2);
                while (true) {
                    dVar = dVar2.f8526f;
                    if (dVar == null || j11 < dVar.f8527g - jNanoTime) {
                        break;
                        break;
                    }
                    dVar2 = dVar;
                }
                this.f8526f = dVar;
                dVar2.f8526f = this;
                if (dVar2 == f8524l) {
                    f8521i.signal();
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public final boolean i() {
        ReentrantLock reentrantLock = f8520h;
        reentrantLock.lock();
        try {
            if (!this.f8525e) {
                return false;
            }
            this.f8525e = false;
            d dVar = f8524l;
            while (dVar != null) {
                d dVar2 = dVar.f8526f;
                if (dVar2 == this) {
                    dVar.f8526f = this.f8526f;
                    this.f8526f = null;
                    return false;
                }
                dVar = dVar2;
            }
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public IOException j(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public void k() {
    }
}
