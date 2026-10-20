package l2;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r f11225c = new r(2, false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r f11226d = new r(1, true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f11228b;

    public r(int i10, boolean z10) {
        this.f11227a = i10;
        this.f11228b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f11227a == rVar.f11227a && this.f11228b == rVar.f11228b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f11228b) + (Integer.hashCode(this.f11227a) * 31);
    }

    public final String toString() {
        if (d7.a.d(this, f11225c)) {
            return "TextMotion.Static";
        }
        return d7.a.d(this, f11226d) ? "TextMotion.Animated" : "Invalid";
    }
}
