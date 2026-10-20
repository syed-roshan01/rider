package o1;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12413a;

    public static final boolean a(long j10, long j11) {
        return j10 == j11;
    }

    public static String b(long j10) {
        return "PointerId(value=" + j10 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t) {
            return this.f12413a == ((t) obj).f12413a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f12413a);
    }

    public final String toString() {
        return b(this.f12413a);
    }
}
