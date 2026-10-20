package e8;

import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class c0 implements Comparable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r7.e f5208d = new r7.e();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f5209e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f5210f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f5211n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r7.e f5212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f5213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f5214c;

    static {
        long nanos = TimeUnit.DAYS.toNanos(36500L);
        f5209e = nanos;
        f5210f = -nanos;
        f5211n = TimeUnit.SECONDS.toNanos(1L);
    }

    public c0(long j10) {
        r7.e eVar = f5208d;
        long jNanoTime = System.nanoTime();
        this.f5212a = eVar;
        long jMin = Math.min(f5209e, Math.max(f5210f, j10));
        this.f5213b = jNanoTime + jMin;
        this.f5214c = jMin <= 0;
    }

    public final void a(c0 c0Var) {
        r7.e eVar = c0Var.f5212a;
        r7.e eVar2 = this.f5212a;
        if (eVar2 == eVar) {
            return;
        }
        throw new AssertionError("Tickers (" + eVar2 + " and " + c0Var.f5212a + ") don't match. Custom Ticker should only be used in tests!");
    }

    public final boolean b() {
        if (!this.f5214c) {
            long j10 = this.f5213b;
            this.f5212a.getClass();
            if (j10 - System.nanoTime() > 0) {
                return false;
            }
            this.f5214c = true;
        }
        return true;
    }

    public final long c(TimeUnit timeUnit) {
        this.f5212a.getClass();
        long jNanoTime = System.nanoTime();
        if (!this.f5214c && this.f5213b - jNanoTime <= 0) {
            this.f5214c = true;
        }
        return timeUnit.convert(this.f5213b - jNanoTime, TimeUnit.NANOSECONDS);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        c0 c0Var = (c0) obj;
        a(c0Var);
        long j10 = this.f5213b - c0Var.f5213b;
        if (j10 < 0) {
            return -1;
        }
        return j10 > 0 ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        r7.e eVar = this.f5212a;
        if (eVar != null ? eVar == c0Var.f5212a : c0Var.f5212a == null) {
            return this.f5213b == c0Var.f5213b;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.asList(this.f5212a, Long.valueOf(this.f5213b)).hashCode();
    }

    public final String toString() {
        long jC = c(TimeUnit.NANOSECONDS);
        long jAbs = Math.abs(jC);
        long j10 = f5211n;
        long j11 = jAbs / j10;
        long jAbs2 = Math.abs(jC) % j10;
        StringBuilder sb = new StringBuilder();
        if (jC < 0) {
            sb.append('-');
        }
        sb.append(j11);
        if (jAbs2 > 0) {
            sb.append(String.format(Locale.US, ".%09d", Long.valueOf(jAbs2)));
        }
        sb.append("s from now");
        r7.e eVar = f5208d;
        r7.e eVar2 = this.f5212a;
        if (eVar2 != eVar) {
            sb.append(" (ticker=" + eVar2 + ")");
        }
        return sb.toString();
    }
}
