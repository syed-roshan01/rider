package b0;

/* JADX INFO: loaded from: classes.dex */
public final class c0 implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2343a = 1;

    public final boolean equals(Object obj) {
        if (obj instanceof c0) {
            return this.f2343a == ((c0) obj).f2343a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2343a);
    }
}
