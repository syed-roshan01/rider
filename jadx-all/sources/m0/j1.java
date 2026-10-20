package m0;

/* JADX INFO: loaded from: classes.dex */
public final class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11573a;

    public j1(String str) {
        this.f11573a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j1) && d7.a.d(this.f11573a, ((j1) obj).f11573a);
    }

    public final int hashCode() {
        return this.f11573a.hashCode();
    }

    public final String toString() {
        return "OpaqueKey(key=" + this.f11573a + ')';
    }
}
