package o1;

/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12346a;

    public final boolean equals(Object obj) {
        if (obj instanceof a0) {
            return this.f12346a == ((a0) obj).f12346a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f12346a);
    }

    public final String toString() {
        return "PointerKeyboardModifiers(packedValue=" + this.f12346a + ')';
    }
}
