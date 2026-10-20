package s;

/* JADX INFO: loaded from: classes.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f13868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f13869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f13870c;

    public t0(float f10, float f11, long j10) {
        this.f13868a = f10;
        this.f13869b = f11;
        this.f13870c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return Float.compare(this.f13868a, t0Var.f13868a) == 0 && Float.compare(this.f13869b, t0Var.f13869b) == 0 && this.f13870c == t0Var.f13870c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f13870c) + l.q.a(this.f13869b, Float.hashCode(this.f13868a) * 31, 31);
    }

    public final String toString() {
        return "FlingInfo(initialVelocity=" + this.f13868a + ", distance=" + this.f13869b + ", duration=" + this.f13870c + ')';
    }
}
