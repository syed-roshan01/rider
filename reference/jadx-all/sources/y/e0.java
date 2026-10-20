package y;

/* JADX INFO: loaded from: classes.dex */
public final class e0 implements i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16533a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16534b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16535c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f16536d = 0;

    @Override // y.i1
    public final int a(m2.b bVar, m2.l lVar) {
        return this.f16533a;
    }

    @Override // y.i1
    public final int b(m2.b bVar) {
        return this.f16536d;
    }

    @Override // y.i1
    public final int c(m2.b bVar, m2.l lVar) {
        return this.f16535c;
    }

    @Override // y.i1
    public final int d(m2.b bVar) {
        return this.f16534b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return this.f16533a == e0Var.f16533a && this.f16534b == e0Var.f16534b && this.f16535c == e0Var.f16535c && this.f16536d == e0Var.f16536d;
    }

    public final int hashCode() {
        return (((((this.f16533a * 31) + this.f16534b) * 31) + this.f16535c) * 31) + this.f16536d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets(left=");
        sb.append(this.f16533a);
        sb.append(", top=");
        sb.append(this.f16534b);
        sb.append(", right=");
        sb.append(this.f16535c);
        sb.append(", bottom=");
        return a7.a.o(sb, this.f16536d, ')');
    }
}
