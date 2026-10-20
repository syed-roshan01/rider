package l2;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11215a;

    public static final boolean a(int i10, int i11) {
        return i10 == i11;
    }

    public static String b(int i10) {
        if (a(i10, 1)) {
            return "Ltr";
        }
        if (a(i10, 2)) {
            return "Rtl";
        }
        if (a(i10, 3)) {
            return "Content";
        }
        if (a(i10, 4)) {
            return "ContentOrLtr";
        }
        if (a(i10, 5)) {
            return "ContentOrRtl";
        }
        return a(i10, Integer.MIN_VALUE) ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f11215a == ((k) obj).f11215a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f11215a);
    }

    public final String toString() {
        return b(this.f11215a);
    }
}
