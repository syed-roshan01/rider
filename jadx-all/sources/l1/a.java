package l1;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11192a;

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f11192a == ((a) obj).f11192a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f11192a);
    }

    public final String toString() {
        int i10 = this.f11192a;
        if (i10 == 1) {
            return "Touch";
        }
        return i10 == 2 ? "Keyboard" : "Error";
    }
}
