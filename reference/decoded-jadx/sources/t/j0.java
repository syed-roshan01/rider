package t;

/* JADX INFO: loaded from: classes.dex */
public final class j0 implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f14208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f14210c;

    public j0(z zVar, int i10, long j10) {
        this.f14208a = zVar;
        this.f14209b = i10;
        this.f14210c = j10;
    }

    @Override // t.n
    public final z1 a(x1 x1Var) {
        return new e2(this.f14208a.a(x1Var), this.f14209b, this.f14210c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        if (d7.a.d(j0Var.f14208a, this.f14208a) && j0Var.f14209b == this.f14209b) {
            return j0Var.f14210c == this.f14210c;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f14210c) + ((k.e(this.f14209b) + (this.f14208a.hashCode() * 31)) * 31);
    }
}
