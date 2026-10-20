package c1;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2875a;

    public static final boolean a(int i10, int i11) {
        return i10 == i11;
    }

    public static String b(int i10) {
        if (a(i10, 1)) {
            return "Next";
        }
        if (a(i10, 2)) {
            return "Previous";
        }
        if (a(i10, 3)) {
            return "Left";
        }
        if (a(i10, 4)) {
            return "Right";
        }
        if (a(i10, 5)) {
            return "Up";
        }
        if (a(i10, 6)) {
            return "Down";
        }
        if (a(i10, 7)) {
            return "Enter";
        }
        return a(i10, 8) ? "Exit" : "Invalid FocusDirection";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f2875a == ((b) obj).f2875a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2875a);
    }

    public final String toString() {
        return b(this.f2875a);
    }
}
