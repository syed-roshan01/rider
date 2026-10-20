package l2;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11210a;

    public static final boolean a(int i10, int i11) {
        return i10 == i11;
    }

    public static String b(int i10) {
        if (a(i10, 1)) {
            return "Left";
        }
        if (a(i10, 2)) {
            return "Right";
        }
        if (a(i10, 3)) {
            return "Center";
        }
        if (a(i10, 4)) {
            return "Justify";
        }
        if (a(i10, 5)) {
            return "Start";
        }
        if (a(i10, 6)) {
            return "End";
        }
        return a(i10, Integer.MIN_VALUE) ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f11210a == ((i) obj).f11210a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f11210a);
    }

    public final String toString() {
        return b(this.f11210a);
    }
}
