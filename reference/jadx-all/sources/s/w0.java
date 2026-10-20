package s;

/* JADX INFO: loaded from: classes.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f13884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t.e0 f13886c;

    public w0(float f10, long j10, t.e0 e0Var) {
        this.f13884a = f10;
        this.f13885b = j10;
        this.f13886c = e0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        if (Float.compare(this.f13884a, w0Var.f13884a) != 0) {
            return false;
        }
        int i10 = e1.p0.f5056c;
        return this.f13885b == w0Var.f13885b && d7.a.d(this.f13886c, w0Var.f13886c);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.f13884a) * 31;
        int i10 = e1.p0.f5056c;
        return this.f13886c.hashCode() + l.q.b(this.f13885b, iHashCode, 31);
    }

    public final String toString() {
        return "Scale(scale=" + this.f13884a + ", transformOrigin=" + ((Object) e1.p0.a(this.f13885b)) + ", animationSpec=" + this.f13886c + ')';
    }
}
