package y;

import m0.o3;

/* JADX INFO: loaded from: classes.dex */
public final class g1 implements i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m0.n1 f16551b;

    public g1(k0 k0Var, String str) {
        this.f16550a = str;
        this.f16551b = d7.t.g0(k0Var, o3.f11621a);
    }

    @Override // y.i1
    public final int a(m2.b bVar, m2.l lVar) {
        return e().f16612a;
    }

    @Override // y.i1
    public final int b(m2.b bVar) {
        return e().f16615d;
    }

    @Override // y.i1
    public final int c(m2.b bVar, m2.l lVar) {
        return e().f16614c;
    }

    @Override // y.i1
    public final int d(m2.b bVar) {
        return e().f16613b;
    }

    public final k0 e() {
        return (k0) this.f16551b.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g1) {
            return d7.a.d(e(), ((g1) obj).e());
        }
        return false;
    }

    public final void f(k0 k0Var) {
        this.f16551b.setValue(k0Var);
    }

    public final int hashCode() {
        return this.f16550a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f16550a);
        sb.append("(left=");
        sb.append(e().f16612a);
        sb.append(", top=");
        sb.append(e().f16613b);
        sb.append(", right=");
        sb.append(e().f16614c);
        sb.append(", bottom=");
        return a7.a.o(sb, e().f16615d, ')');
    }
}
