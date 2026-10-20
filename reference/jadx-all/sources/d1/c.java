package d1;

import d7.t;
import d9.i;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f4326b = i.f(0.0f, 0.0f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f4327c = i.f(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f4328d = i.f(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f4329e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4330a;

    public /* synthetic */ c(long j10) {
        this.f4330a = j10;
    }

    public static long a(long j10, int i10) {
        return i.f((i10 & 1) != 0 ? d(j10) : 0.0f, (i10 & 2) != 0 ? e(j10) : 0.0f);
    }

    public static final boolean b(long j10, long j11) {
        return j10 == j11;
    }

    public static final float c(long j10) {
        return (float) Math.sqrt((e(j10) * e(j10)) + (d(j10) * d(j10)));
    }

    public static final float d(long j10) {
        if (j10 != f4328d) {
            return Float.intBitsToFloat((int) (j10 >> 32));
        }
        throw new IllegalStateException("Offset is unspecified".toString());
    }

    public static final float e(long j10) {
        if (j10 != f4328d) {
            return Float.intBitsToFloat((int) (j10 & 4294967295L));
        }
        throw new IllegalStateException("Offset is unspecified".toString());
    }

    public static final long f(long j10, long j11) {
        return i.f(d(j10) - d(j11), e(j10) - e(j11));
    }

    public static final long g(long j10, long j11) {
        return i.f(d(j11) + d(j10), e(j11) + e(j10));
    }

    public static final long h(float f10, long j10) {
        return i.f(d(j10) * f10, e(j10) * f10);
    }

    public static String i(long j10) {
        if (!i.u(j10)) {
            return "Offset.Unspecified";
        }
        return "Offset(" + t.w0(d(j10)) + ", " + t.w0(e(j10)) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return this.f4330a == ((c) obj).f4330a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f4330a);
    }

    public final String toString() {
        return i(this.f4330a);
    }
}
