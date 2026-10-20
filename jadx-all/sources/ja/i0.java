package ja;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class i0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h0 f8535d = new h0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f8536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f8537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f8538c;

    public i0 a() {
        this.f8536a = false;
        return this;
    }

    public i0 b() {
        this.f8538c = 0L;
        return this;
    }

    public long c() {
        if (this.f8536a) {
            return this.f8537b;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    public i0 d(long j10) {
        this.f8536a = true;
        this.f8537b = j10;
        return this;
    }

    public boolean e() {
        return this.f8536a;
    }

    public void f() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f8536a && this.f8537b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public i0 g(long j10, TimeUnit timeUnit) {
        d7.a.m(timeUnit, "unit");
        if (j10 < 0) {
            throw new IllegalArgumentException(a7.a.l("timeout < 0: ", j10).toString());
        }
        this.f8538c = timeUnit.toNanos(j10);
        return this;
    }
}
