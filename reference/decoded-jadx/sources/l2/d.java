package l2;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11198a;

    public static final boolean a(int i10, int i11) {
        return i10 == i11;
    }

    public static String b(int i10) {
        if (a(i10, 1)) {
            return "Hyphens.None";
        }
        if (a(i10, 2)) {
            return "Hyphens.Auto";
        }
        return a(i10, Integer.MIN_VALUE) ? "Hyphens.Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f11198a == ((d) obj).f11198a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f11198a);
    }

    public final String toString() {
        return b(this.f11198a);
    }
}
