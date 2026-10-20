package h0;

/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0.n0 f7362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f7363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f7365d;

    public c0(f0.n0 n0Var, long j10, int i10, boolean z10) {
        this.f7362a = n0Var;
        this.f7363b = j10;
        this.f7364c = i10;
        this.f7365d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.f7362a == c0Var.f7362a && d1.c.b(this.f7363b, c0Var.f7363b) && this.f7364c == c0Var.f7364c && this.f7365d == c0Var.f7365d;
    }

    public final int hashCode() {
        int iHashCode = this.f7362a.hashCode() * 31;
        int i10 = d1.c.f4329e;
        return Boolean.hashCode(this.f7365d) + ((t.k.e(this.f7364c) + l.q.b(this.f7363b, iHashCode, 31)) * 31);
    }

    public final String toString() {
        return "SelectionHandleInfo(handle=" + this.f7362a + ", position=" + ((Object) d1.c.i(this.f7363b)) + ", anchor=" + a7.a.F(this.f7364c) + ", visible=" + this.f7365d + ')';
    }
}
