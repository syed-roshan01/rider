package j4;

/* JADX INFO: loaded from: classes.dex */
public final class c extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h1.c f8341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s4.e f8342b;

    public c(h1.c cVar, s4.e eVar) {
        this.f8341a = cVar;
        this.f8342b = eVar;
    }

    @Override // j4.f
    public final h1.c a() {
        return this.f8341a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return d7.a.d(this.f8341a, cVar.f8341a) && d7.a.d(this.f8342b, cVar.f8342b);
    }

    public final int hashCode() {
        h1.c cVar = this.f8341a;
        return this.f8342b.hashCode() + ((cVar == null ? 0 : cVar.hashCode()) * 31);
    }

    public final String toString() {
        return "Error(painter=" + this.f8341a + ", result=" + this.f8342b + ')';
    }
}
