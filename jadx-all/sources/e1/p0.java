package e1;

/* JADX INFO: loaded from: classes.dex */
public final class p0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f5055b = (((long) Float.floatToRawIntBits(0.5f)) << 32) | (((long) Float.floatToRawIntBits(0.5f)) & 4294967295L);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f5056c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5057a;

    public static String a(long j10) {
        return "TransformOrigin(packedValue=" + j10 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p0) {
            return this.f5057a == ((p0) obj).f5057a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f5057a);
    }

    public final String toString() {
        return a(this.f5057a);
    }
}
