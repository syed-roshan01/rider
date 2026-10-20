package q5;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f13155c;

    public b(long j10, long j11, Set set) {
        this.f13153a = j10;
        this.f13154b = j11;
        this.f13155c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f13153a == bVar.f13153a && this.f13154b == bVar.f13154b && this.f13155c.equals(bVar.f13155c);
    }

    public final int hashCode() {
        long j10 = this.f13153a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        long j11 = this.f13154b;
        return ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f13155c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f13153a + ", maxAllowedDelay=" + this.f13154b + ", flags=" + this.f13155c + "}";
    }
}
