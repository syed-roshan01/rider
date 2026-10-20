package m2;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f11802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f11803c = i1.b.b(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f11804d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11805a;

    static {
        float f10 = 0;
        f11802b = i1.b.b(f10, f10);
    }

    public static final float a(long j10) {
        if (j10 != f11803c) {
            return Float.intBitsToFloat((int) (j10 & 4294967295L));
        }
        throw new IllegalStateException("DpSize is unspecified".toString());
    }

    public static final float b(long j10) {
        if (j10 != f11803c) {
            return Float.intBitsToFloat((int) (j10 >> 32));
        }
        throw new IllegalStateException("DpSize is unspecified".toString());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f11805a == ((g) obj).f11805a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f11805a);
    }

    public final String toString() {
        long j10 = f11803c;
        long j11 = this.f11805a;
        if (j11 == j10) {
            return "DpSize.Unspecified";
        }
        return ((Object) e.b(b(j11))) + " x " + ((Object) e.b(a(j11)));
    }
}
