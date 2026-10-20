package s;

/* JADX INFO: loaded from: classes.dex */
public final class s implements r1.u0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f13862b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && this.f13862b == ((s) obj).f13862b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f13862b);
    }

    public final String toString() {
        return "ChildData(isTarget=" + this.f13862b + ')';
    }
}
