package t4;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f14657c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f6.a f14658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f6.a f14659b;

    static {
        b bVar = b.f14648z;
        f14657c = new f(bVar, bVar);
    }

    public f(f6.a aVar, f6.a aVar2) {
        this.f14658a = aVar;
        this.f14659b = aVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return d7.a.d(this.f14658a, fVar.f14658a) && d7.a.d(this.f14659b, fVar.f14659b);
    }

    public final int hashCode() {
        return this.f14659b.hashCode() + (this.f14658a.hashCode() * 31);
    }

    public final String toString() {
        return "Size(width=" + this.f14658a + ", height=" + this.f14659b + ')';
    }
}
