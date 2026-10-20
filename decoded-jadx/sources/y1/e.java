package y1;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16752a = 0;

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f16752a == ((e) obj).f16752a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f16752a);
    }

    public final String toString() {
        int i10 = this.f16752a;
        if (i10 == 0) {
            return "Polite";
        }
        return i10 == 1 ? "Assertive" : "Unknown";
    }
}
