package y;

/* JADX INFO: loaded from: classes.dex */
public final class e1 implements i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i1 f16537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i1 f16538b;

    public e1(i1 i1Var, i1 i1Var2) {
        this.f16537a = i1Var;
        this.f16538b = i1Var2;
    }

    @Override // y.i1
    public final int a(m2.b bVar, m2.l lVar) {
        return Math.max(this.f16537a.a(bVar, lVar), this.f16538b.a(bVar, lVar));
    }

    @Override // y.i1
    public final int b(m2.b bVar) {
        return Math.max(this.f16537a.b(bVar), this.f16538b.b(bVar));
    }

    @Override // y.i1
    public final int c(m2.b bVar, m2.l lVar) {
        return Math.max(this.f16537a.c(bVar, lVar), this.f16538b.c(bVar, lVar));
    }

    @Override // y.i1
    public final int d(m2.b bVar) {
        return Math.max(this.f16537a.d(bVar), this.f16538b.d(bVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        return d7.a.d(e1Var.f16537a, this.f16537a) && d7.a.d(e1Var.f16538b, this.f16538b);
    }

    public final int hashCode() {
        return (this.f16538b.hashCode() * 31) + this.f16537a.hashCode();
    }

    public final String toString() {
        return "(" + this.f16537a + " \u222a " + this.f16538b + ')';
    }
}
