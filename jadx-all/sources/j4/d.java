package j4;

/* JADX INFO: loaded from: classes.dex */
public final class d extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h1.c f8343a;

    public d(h1.c cVar) {
        this.f8343a = cVar;
    }

    @Override // j4.f
    public final h1.c a() {
        return this.f8343a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && d7.a.d(this.f8343a, ((d) obj).f8343a);
    }

    public final int hashCode() {
        h1.c cVar = this.f8343a;
        if (cVar == null) {
            return 0;
        }
        return cVar.hashCode();
    }

    public final String toString() {
        return "Loading(painter=" + this.f8343a + ')';
    }
}
