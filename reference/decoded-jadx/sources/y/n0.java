package y;

/* JADX INFO: loaded from: classes.dex */
public final class n0 implements i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i1 f16643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16644b;

    public n0(c cVar, int i10) {
        this.f16643a = cVar;
        this.f16644b = i10;
    }

    @Override // y.i1
    public final int a(m2.b bVar, m2.l lVar) {
        if (((lVar == m2.l.f11815a ? 8 : 2) & this.f16644b) != 0) {
            return this.f16643a.a(bVar, lVar);
        }
        return 0;
    }

    @Override // y.i1
    public final int b(m2.b bVar) {
        if ((this.f16644b & 32) != 0) {
            return this.f16643a.b(bVar);
        }
        return 0;
    }

    @Override // y.i1
    public final int c(m2.b bVar, m2.l lVar) {
        if (((lVar == m2.l.f11815a ? 4 : 1) & this.f16644b) != 0) {
            return this.f16643a.c(bVar, lVar);
        }
        return 0;
    }

    @Override // y.i1
    public final int d(m2.b bVar) {
        if ((this.f16644b & 16) != 0) {
            return this.f16643a.d(bVar);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        if (d7.a.d(this.f16643a, n0Var.f16643a)) {
            if (this.f16644b == n0Var.f16644b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f16644b) + (this.f16643a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.f16643a);
        sb.append(" only ");
        StringBuilder sb2 = new StringBuilder("WindowInsetsSides(");
        StringBuilder sb3 = new StringBuilder();
        int i10 = this.f16644b;
        int i11 = w4.g.f16168a;
        if ((i10 & i11) == i11) {
            w4.g.b("Start", sb3);
        }
        int i12 = w4.g.f16170c;
        if ((i10 & i12) == i12) {
            w4.g.b("Left", sb3);
        }
        if ((i10 & 16) == 16) {
            w4.g.b("Top", sb3);
        }
        int i13 = w4.g.f16169b;
        if ((i10 & i13) == i13) {
            w4.g.b("End", sb3);
        }
        int i14 = w4.g.f16171d;
        if ((i10 & i14) == i14) {
            w4.g.b("Right", sb3);
        }
        if ((i10 & 32) == 32) {
            w4.g.b("Bottom", sb3);
        }
        String string = sb3.toString();
        d7.a.l(string, "StringBuilder().apply(builderAction).toString()");
        sb2.append(string);
        sb2.append(')');
        sb.append((Object) sb2.toString());
        sb.append(')');
        return sb.toString();
    }
}
