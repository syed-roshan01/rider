package m2;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f11789b = {18, 20, 17, 15};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f11790c = {65535, 262143, 32767, 8191};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f11791d = {32767, 8191, 65535, 262143};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11792a;

    public static final long a(int i10, int i11, int i12, int i13) {
        if (i12 < 0 || i10 < 0) {
            throw new IllegalArgumentException(("minHeight(" + i12 + ") and minWidth(" + i10 + ") must be >= 0").toString());
        }
        if (i11 < i10 && i11 != Integer.MAX_VALUE) {
            throw new IllegalArgumentException(("maxWidth(" + i11 + ") must be >= minWidth(" + i10 + ')').toString());
        }
        if (i13 >= i12 || i13 == Integer.MAX_VALUE) {
            return l2.l.c(i10, i11, i12, i13);
        }
        throw new IllegalArgumentException(("maxHeight(" + i13 + ") must be >= minHeight(" + i12 + ')').toString());
    }

    public static /* synthetic */ long b(long j10, int i10, int i11, int i12, int i13, int i14) {
        if ((i14 & 1) != 0) {
            i10 = k(j10);
        }
        if ((i14 & 2) != 0) {
            i11 = i(j10);
        }
        if ((i14 & 4) != 0) {
            i12 = j(j10);
        }
        if ((i14 & 8) != 0) {
            i13 = h(j10);
        }
        return a(i10, i11, i12, i13);
    }

    public static final boolean c(long j10, long j11) {
        return j10 == j11;
    }

    public static final boolean d(long j10) {
        int i10 = (int) (3 & j10);
        return (((int) (j10 >> (f11789b[i10] + 31))) & f11791d[i10]) != 0;
    }

    public static final boolean e(long j10) {
        return (((int) (j10 >> 33)) & f11790c[(int) (3 & j10)]) != 0;
    }

    public static final boolean f(long j10) {
        return h(j10) == j(j10);
    }

    public static final boolean g(long j10) {
        return i(j10) == k(j10);
    }

    public static final int h(long j10) {
        int i10 = (int) (3 & j10);
        int i11 = ((int) (j10 >> (f11789b[i10] + 31))) & f11791d[i10];
        if (i11 == 0) {
            return Integer.MAX_VALUE;
        }
        return i11 - 1;
    }

    public static final int i(long j10) {
        int i10 = ((int) (j10 >> 33)) & f11790c[(int) (3 & j10)];
        if (i10 == 0) {
            return Integer.MAX_VALUE;
        }
        return i10 - 1;
    }

    public static final int j(long j10) {
        int i10 = (int) (3 & j10);
        return ((int) (j10 >> f11789b[i10])) & f11791d[i10];
    }

    public static final int k(long j10) {
        return ((int) (j10 >> 2)) & f11790c[(int) (3 & j10)];
    }

    public static String l(long j10) {
        int i10 = i(j10);
        String strValueOf = i10 == Integer.MAX_VALUE ? "Infinity" : String.valueOf(i10);
        int iH = h(j10);
        return "Constraints(minWidth = " + k(j10) + ", maxWidth = " + strValueOf + ", minHeight = " + j(j10) + ", maxHeight = " + (iH != Integer.MAX_VALUE ? String.valueOf(iH) : "Infinity") + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f11792a == ((a) obj).f11792a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f11792a);
    }

    public final String toString() {
        return l(this.f11792a);
    }
}
