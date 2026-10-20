package g8;

import java.util.Arrays;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class i5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f6856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f6857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f6858d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f6859e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r6.t f6860f;

    public i5(int i10, long j10, long j11, double d10, Long l10, Set set) {
        this.f6855a = i10;
        this.f6856b = j10;
        this.f6857c = j11;
        this.f6858d = d10;
        this.f6859e = l10;
        this.f6860f = r6.t.q(set);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i5)) {
            return false;
        }
        i5 i5Var = (i5) obj;
        return this.f6855a == i5Var.f6855a && this.f6856b == i5Var.f6856b && this.f6857c == i5Var.f6857c && Double.compare(this.f6858d, i5Var.f6858d) == 0 && y3.e.f0(this.f6859e, i5Var.f6859e) && y3.e.f0(this.f6860f, i5Var.f6860f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f6855a), Long.valueOf(this.f6856b), Long.valueOf(this.f6857c), Double.valueOf(this.f6858d), this.f6859e, this.f6860f});
    }

    public final String toString() {
        q6.g gVarJ0 = f6.a.j0(this);
        gVarJ0.d(String.valueOf(this.f6855a), "maxAttempts");
        gVarJ0.b("initialBackoffNanos", this.f6856b);
        gVarJ0.b("maxBackoffNanos", this.f6857c);
        gVarJ0.d(String.valueOf(this.f6858d), "backoffMultiplier");
        gVarJ0.a(this.f6859e, "perAttemptRecvTimeoutNanos");
        gVarJ0.a(this.f6860f, "retryableStatusCodes");
        return gVarJ0.toString();
    }
}
