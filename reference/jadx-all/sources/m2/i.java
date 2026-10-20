package m2;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f11807b = i1.b.c(0, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f11808c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11809a;

    public static final boolean a(long j10, long j11) {
        return j10 == j11;
    }

    public static String b(long j10) {
        StringBuilder sb = new StringBuilder("(");
        sb.append((int) (j10 >> 32));
        sb.append(", ");
        return a7.a.o(sb, (int) (j10 & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f11809a == ((i) obj).f11809a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f11809a);
    }

    public final String toString() {
        return b(this.f11809a);
    }
}
