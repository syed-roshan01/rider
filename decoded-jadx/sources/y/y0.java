package y;

/* JADX INFO: loaded from: classes.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f16703a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f16704b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a0 f16705c = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return Float.compare(this.f16703a, y0Var.f16703a) == 0 && this.f16704b == y0Var.f16704b && d7.a.d(this.f16705c, y0Var.f16705c);
    }

    public final int hashCode() {
        int iC = l.q.c(this.f16704b, Float.hashCode(this.f16703a) * 31, 31);
        a0 a0Var = this.f16705c;
        return iC + (a0Var == null ? 0 : a0Var.hashCode());
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.f16703a + ", fill=" + this.f16704b + ", crossAxisAlignment=" + this.f16705c + ')';
    }
}
