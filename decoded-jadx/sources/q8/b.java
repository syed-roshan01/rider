package q8;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f13222b = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13223a;

    public b() {
        if (!new i9.g(0, 255, 1).i(1) || !new i9.g(0, 255, 1).i(9) || !new i9.g(0, 255, 1).i(22)) {
            throw new IllegalArgumentException("Version components are out of range: 1.9.22".toString());
        }
        this.f13223a = 67862;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        b bVar = (b) obj;
        d7.a.m(bVar, "other");
        return this.f13223a - bVar.f13223a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        b bVar = obj instanceof b ? (b) obj : null;
        return bVar != null && this.f13223a == bVar.f13223a;
    }

    public final int hashCode() {
        return this.f13223a;
    }

    public final String toString() {
        return "1.9.22";
    }
}
