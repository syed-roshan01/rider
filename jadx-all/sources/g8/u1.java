package g8;

import java.util.Arrays;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f7152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r6.t f7153c;

    public u1(int i10, long j10, Set set) {
        this.f7151a = i10;
        this.f7152b = j10;
        this.f7153c = r6.t.q(set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u1.class != obj.getClass()) {
            return false;
        }
        u1 u1Var = (u1) obj;
        return this.f7151a == u1Var.f7151a && this.f7152b == u1Var.f7152b && y3.e.f0(this.f7153c, u1Var.f7153c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f7151a), Long.valueOf(this.f7152b), this.f7153c});
    }

    public final String toString() {
        q6.g gVarJ0 = f6.a.j0(this);
        gVarJ0.d(String.valueOf(this.f7151a), "maxAttempts");
        gVarJ0.b("hedgingDelayNanos", this.f7152b);
        gVarJ0.a(this.f7153c, "nonFatalStatusCodes");
        return gVarJ0.toString();
    }
}
