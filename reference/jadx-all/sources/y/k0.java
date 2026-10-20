package y;

/* JADX INFO: loaded from: classes.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f16615d;

    public k0(int i10, int i11, int i12, int i13) {
        this.f16612a = i10;
        this.f16613b = i11;
        this.f16614c = i12;
        this.f16615d = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return this.f16612a == k0Var.f16612a && this.f16613b == k0Var.f16613b && this.f16614c == k0Var.f16614c && this.f16615d == k0Var.f16615d;
    }

    public final int hashCode() {
        return (((((this.f16612a * 31) + this.f16613b) * 31) + this.f16614c) * 31) + this.f16615d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InsetsValues(left=");
        sb.append(this.f16612a);
        sb.append(", top=");
        sb.append(this.f16613b);
        sb.append(", right=");
        sb.append(this.f16614c);
        sb.append(", bottom=");
        return a7.a.o(sb, this.f16615d, ')');
    }
}
