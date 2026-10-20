package m2;

import o1.s;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o[] f11819b = {new o(0), new o(4294967296L), new o(8589934592L)};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f11820c = s.c0(Float.NaN, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11821a;

    public /* synthetic */ n(long j10) {
        this.f11821a = j10;
    }

    public static final boolean a(long j10, long j11) {
        return j10 == j11;
    }

    public static final long b(long j10) {
        return f11819b[(int) ((j10 & 1095216660480L) >>> 32)].f11822a;
    }

    public static final float c(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    public static String d(long j10) {
        long jB = b(j10);
        if (o.a(jB, 0L)) {
            return "Unspecified";
        }
        if (o.a(jB, 4294967296L)) {
            return c(j10) + ".sp";
        }
        if (!o.a(jB, 8589934592L)) {
            return "Invalid";
        }
        return c(j10) + ".em";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            return this.f11821a == ((n) obj).f11821a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f11821a);
    }

    public final String toString() {
        return d(this.f11821a);
    }
}
