package f2;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6112a;

    public static final boolean a(int i10, int i11) {
        return i10 == i11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f6112a == ((j) obj).f6112a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6112a);
    }

    public final String toString() {
        int i10 = this.f6112a;
        if (a(i10, 0)) {
            return "Normal";
        }
        return a(i10, 1) ? "Italic" : "Invalid";
    }
}
