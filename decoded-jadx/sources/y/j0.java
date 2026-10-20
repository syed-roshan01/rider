package y;

/* JADX INFO: loaded from: classes.dex */
public final class j0 implements t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i1 f16582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m2.b f16583b;

    public j0(i1 i1Var, r1.i1 i1Var2) {
        this.f16582a = i1Var;
        this.f16583b = i1Var2;
    }

    @Override // y.t0
    public final float a(m2.l lVar) {
        i1 i1Var = this.f16582a;
        m2.b bVar = this.f16583b;
        return bVar.o0(i1Var.a(bVar, lVar));
    }

    @Override // y.t0
    public final float b(m2.l lVar) {
        i1 i1Var = this.f16582a;
        m2.b bVar = this.f16583b;
        return bVar.o0(i1Var.c(bVar, lVar));
    }

    @Override // y.t0
    public final float c() {
        i1 i1Var = this.f16582a;
        m2.b bVar = this.f16583b;
        return bVar.o0(i1Var.b(bVar));
    }

    @Override // y.t0
    public final float d() {
        i1 i1Var = this.f16582a;
        m2.b bVar = this.f16583b;
        return bVar.o0(i1Var.d(bVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return d7.a.d(this.f16582a, j0Var.f16582a) && d7.a.d(this.f16583b, j0Var.f16583b);
    }

    public final int hashCode() {
        return this.f16583b.hashCode() + (this.f16582a.hashCode() * 31);
    }

    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.f16582a + ", density=" + this.f16583b + ')';
    }
}
