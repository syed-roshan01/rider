package m2;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f11799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f11800c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11801a;

    static {
        float f10 = 0;
        i1.b.a(f10, f10);
        f11799b = i1.b.a(Float.NaN, Float.NaN);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f11801a == ((f) obj).f11801a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f11801a);
    }

    public final String toString() {
        long j10 = this.f11801a;
        long j11 = f11799b;
        if (j10 == j11) {
            return "DpOffset.Unspecified";
        }
        StringBuilder sb = new StringBuilder("(");
        if (j10 == j11) {
            throw new IllegalStateException("DpOffset is unspecified".toString());
        }
        sb.append((Object) e.b(Float.intBitsToFloat((int) (j10 >> 32))));
        sb.append(", ");
        if (j10 == j11) {
            throw new IllegalStateException("DpOffset is unspecified".toString());
        }
        sb.append((Object) e.b(Float.intBitsToFloat((int) (j10 & 4294967295L))));
        sb.append(')');
        return sb.toString();
    }
}
