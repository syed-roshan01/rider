package d1;

import d7.t;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f4344b = t.j(0.0f, 0.0f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f4345c = t.j(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f4346d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4347a;

    public /* synthetic */ f(long j10) {
        this.f4347a = j10;
    }

    public static final boolean a(long j10, long j11) {
        return j10 == j11;
    }

    public static final float b(long j10) {
        if (j10 != f4345c) {
            return Float.intBitsToFloat((int) (j10 & 4294967295L));
        }
        throw new IllegalStateException("Size is unspecified".toString());
    }

    public static final float c(long j10) {
        return Math.min(Math.abs(d(j10)), Math.abs(b(j10)));
    }

    public static final float d(long j10) {
        if (j10 != f4345c) {
            return Float.intBitsToFloat((int) (j10 >> 32));
        }
        throw new IllegalStateException("Size is unspecified".toString());
    }

    public static final boolean e(long j10) {
        return d(j10) <= 0.0f || b(j10) <= 0.0f;
    }

    public static String f(long j10) {
        if (j10 == f4345c) {
            return "Size.Unspecified";
        }
        return "Size(" + t.w0(d(j10)) + ", " + t.w0(b(j10)) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f4347a == ((f) obj).f4347a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f4347a);
    }

    public final String toString() {
        return f(this.f4347a);
    }
}
