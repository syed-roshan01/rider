package y1;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16757a;

    public static final boolean a(int i10, int i11) {
        return i10 == i11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f16757a == ((g) obj).f16757a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f16757a);
    }

    public final String toString() {
        int i10 = this.f16757a;
        if (a(i10, 0)) {
            return "Button";
        }
        if (a(i10, 1)) {
            return "Checkbox";
        }
        if (a(i10, 2)) {
            return "Switch";
        }
        if (a(i10, 3)) {
            return "RadioButton";
        }
        if (a(i10, 4)) {
            return "Tab";
        }
        if (a(i10, 5)) {
            return "Image";
        }
        return a(i10, 6) ? "DropdownList" : "Unknown";
    }
}
