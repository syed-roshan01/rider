package m2;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11814a;

    public static final boolean a(long j10, long j11) {
        return j10 == j11;
    }

    public static String b(long j10) {
        return ((int) (j10 >> 32)) + " x " + ((int) (j10 & 4294967295L));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f11814a == ((k) obj).f11814a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f11814a);
    }

    public final String toString() {
        return b(this.f11814a);
    }
}
