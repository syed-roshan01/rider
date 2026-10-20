package a2;

/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f903b = o1.s.g(0, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f904c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f905a;

    public /* synthetic */ b0(long j10) {
        this.f905a = j10;
    }

    public static final boolean a(long j10, long j11) {
        return j10 == j11;
    }

    public static final boolean b(long j10) {
        return ((int) (j10 >> 32)) == ((int) (j10 & 4294967295L));
    }

    public static final int c(long j10) {
        return d(j10) - e(j10);
    }

    public static final int d(long j10) {
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & 4294967295L);
        return i10 > i11 ? i10 : i11;
    }

    public static final int e(long j10) {
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & 4294967295L);
        return i10 > i11 ? i11 : i10;
    }

    public static final boolean f(long j10) {
        return ((int) (j10 >> 32)) > ((int) (j10 & 4294967295L));
    }

    public static String g(long j10) {
        StringBuilder sb = new StringBuilder("TextRange(");
        sb.append((int) (j10 >> 32));
        sb.append(", ");
        return a7.a.o(sb, (int) (j10 & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b0) {
            return this.f905a == ((b0) obj).f905a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f905a);
    }

    public final String toString() {
        return g(this.f905a);
    }
}
