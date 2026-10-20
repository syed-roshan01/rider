package b2;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f2537c;

    public f(int i10, boolean z10, int i11) {
        this.f2535a = i10;
        this.f2536b = i11;
        this.f2537c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f2535a == fVar.f2535a && this.f2536b == fVar.f2536b && this.f2537c == fVar.f2537c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f2537c) + a7.a.u(this.f2536b, Integer.hashCode(this.f2535a) * 31, 31);
    }

    public final String toString() {
        return "BidiRun(start=" + this.f2535a + ", end=" + this.f2536b + ", isRtl=" + this.f2537c + ')';
    }
}
