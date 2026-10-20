package d9;

/* JADX INFO: loaded from: classes.dex */
public final class m implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f4946a;

    public m(Class cls) {
        d7.a.m(cls, "jClass");
        this.f4946a = cls;
    }

    @Override // d9.d
    public final Class a() {
        return this.f4946a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            if (d7.a.d(this.f4946a, ((m) obj).f4946a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f4946a.hashCode();
    }

    public final String toString() {
        return this.f4946a.toString() + " (Kotlin reflection is not available)";
    }
}
