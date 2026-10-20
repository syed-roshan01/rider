package y;

/* JADX INFO: loaded from: classes.dex */
public final class x implements s1.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c9.c f16693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i1 f16694c;

    public x(c9.c cVar) {
        this.f16693b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x) {
            return d7.a.d(((x) obj).f16693b, this.f16693b);
        }
        return false;
    }

    @Override // s1.d
    public final void g(s1.h hVar) {
        i1 i1Var = (i1) hVar.g(l1.f16628a);
        if (d7.a.d(i1Var, this.f16694c)) {
            return;
        }
        this.f16694c = i1Var;
        this.f16693b.invoke(i1Var);
    }

    public final int hashCode() {
        return this.f16693b.hashCode();
    }
}
