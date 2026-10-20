package p6;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f12816b;

    public k(int i10, long j10) {
        this.f12815a = i10;
        this.f12816b = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f12815a == kVar.f12815a && this.f12816b == kVar.f12816b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f12815a ^ 1000003;
        long j10 = this.f12816b;
        return (i10 * 1000003) ^ ((int) ((j10 >>> 32) ^ j10));
    }

    public final String toString() {
        return "EventRecord{eventType=" + this.f12815a + ", eventTimestamp=" + this.f12816b + "}";
    }
}
