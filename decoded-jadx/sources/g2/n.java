package g2;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6582a;

    public static final boolean a(int i10, int i11) {
        return i10 == i11;
    }

    public static String b(int i10) {
        if (a(i10, 0)) {
            return "None";
        }
        if (a(i10, 1)) {
            return "Default";
        }
        if (a(i10, 2)) {
            return "Go";
        }
        if (a(i10, 3)) {
            return "Search";
        }
        if (a(i10, 4)) {
            return "Send";
        }
        if (a(i10, 5)) {
            return "Previous";
        }
        if (a(i10, 6)) {
            return "Next";
        }
        return a(i10, 7) ? "Done" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            return this.f6582a == ((n) obj).f6582a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6582a);
    }

    public final String toString() {
        return b(this.f6582a);
    }
}
