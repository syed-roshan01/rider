package a2;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f931a;

    public static String a(int i10) {
        if (i10 == 0) {
            return "EmojiSupportMatch.Default";
        }
        if (i10 == 1) {
            return "EmojiSupportMatch.None";
        }
        return "Invalid(value=" + i10 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f931a == ((h) obj).f931a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f931a);
    }

    public final String toString() {
        return a(this.f931a);
    }
}
