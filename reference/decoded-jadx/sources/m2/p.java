package m2;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f11823b = i1.b.e(0.0f, 0.0f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f11824c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11825a;

    public static long a(long j10, float f10, float f11, int i10) {
        if ((i10 & 1) != 0) {
            f10 = b(j10);
        }
        if ((i10 & 2) != 0) {
            f11 = c(j10);
        }
        return i1.b.e(f10, f11);
    }

    public static final float b(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final float c(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    public static final long d(long j10, long j11) {
        return i1.b.e(b(j10) - b(j11), c(j10) - c(j11));
    }

    public static final long e(long j10, long j11) {
        return i1.b.e(b(j11) + b(j10), c(j11) + c(j10));
    }

    public static String f(long j10) {
        return "(" + b(j10) + ", " + c(j10) + ") px/sec";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            return this.f11825a == ((p) obj).f11825a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f11825a);
    }

    public final String toString() {
        return f(this.f11825a);
    }
}
