package y;

/* JADX INFO: loaded from: classes.dex */
public final class b0 implements i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i1 f16516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i1 f16517b;

    public b0(i1 i1Var, i1 i1Var2) {
        this.f16516a = i1Var;
        this.f16517b = i1Var2;
    }

    @Override // y.i1
    public final int a(m2.b bVar, m2.l lVar) {
        int iA = this.f16516a.a(bVar, lVar) - this.f16517b.a(bVar, lVar);
        if (iA < 0) {
            return 0;
        }
        return iA;
    }

    @Override // y.i1
    public final int b(m2.b bVar) {
        int iB = this.f16516a.b(bVar) - this.f16517b.b(bVar);
        if (iB < 0) {
            return 0;
        }
        return iB;
    }

    @Override // y.i1
    public final int c(m2.b bVar, m2.l lVar) {
        int iC = this.f16516a.c(bVar, lVar) - this.f16517b.c(bVar, lVar);
        if (iC < 0) {
            return 0;
        }
        return iC;
    }

    @Override // y.i1
    public final int d(m2.b bVar) {
        int iD = this.f16516a.d(bVar) - this.f16517b.d(bVar);
        if (iD < 0) {
            return 0;
        }
        return iD;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return d7.a.d(b0Var.f16516a, this.f16516a) && d7.a.d(b0Var.f16517b, this.f16517b);
    }

    public final int hashCode() {
        return this.f16517b.hashCode() + (this.f16516a.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.f16516a + " - " + this.f16517b + ')';
    }
}
