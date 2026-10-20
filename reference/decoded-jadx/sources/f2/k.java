package f2;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6113a;

    public static final boolean a(int i10, int i11) {
        return i10 == i11;
    }

    public static String b(int i10) {
        if (a(i10, 0)) {
            return "None";
        }
        if (a(i10, 1)) {
            return "All";
        }
        if (a(i10, 2)) {
            return "Weight";
        }
        return a(i10, 3) ? "Style" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f6113a == ((k) obj).f6113a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6113a);
    }

    public final String toString() {
        return b(this.f6113a);
    }
}
