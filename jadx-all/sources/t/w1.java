package t;

/* JADX INFO: loaded from: classes.dex */
public final class w1 implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f14341c;

    public w1(int i10, a0 a0Var, int i11) {
        this((i11 & 1) != 0 ? 300 : i10, 0, (i11 & 4) != 0 ? d0.f14120a : a0Var);
    }

    @Override // t.n
    public final z1 a(x1 x1Var) {
        return new h2(this.f14339a, this.f14340b, this.f14341c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w1)) {
            return false;
        }
        w1 w1Var = (w1) obj;
        return w1Var.f14339a == this.f14339a && w1Var.f14340b == this.f14340b && d7.a.d(w1Var.f14341c, this.f14341c);
    }

    public final int hashCode() {
        return ((this.f14341c.hashCode() + (this.f14339a * 31)) * 31) + this.f14340b;
    }

    @Override // t.z, t.n
    public final a2 a(x1 x1Var) {
        return new h2(this.f14339a, this.f14340b, this.f14341c);
    }

    public w1(int i10, int i11, a0 a0Var) {
        this.f14339a = i10;
        this.f14340b = i11;
        this.f14341c = a0Var;
    }
}
