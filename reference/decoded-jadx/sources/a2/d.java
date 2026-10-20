package a2;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f916c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f917d;

    public d(Object obj, int i10, int i11, String str) {
        this.f914a = obj;
        this.f915b = i10;
        this.f916c = i11;
        this.f917d = str;
        if (i10 > i11) {
            throw new IllegalArgumentException("Reversed range is not supported".toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return d7.a.d(this.f914a, dVar.f914a) && this.f915b == dVar.f915b && this.f916c == dVar.f916c && d7.a.d(this.f917d, dVar.f917d);
    }

    public final int hashCode() {
        Object obj = this.f914a;
        return this.f917d.hashCode() + a7.a.u(this.f916c, a7.a.u(this.f915b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        return "Range(item=" + this.f914a + ", start=" + this.f915b + ", end=" + this.f916c + ", tag=" + this.f917d + ')';
    }

    public d(Object obj, int i10, int i11) {
        this(obj, i10, i11, "");
    }
}
