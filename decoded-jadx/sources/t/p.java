package t;

/* JADX INFO: loaded from: classes.dex */
public final class p extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f14272a;

    public p(float f10) {
        this.f14272a = f10;
    }

    @Override // t.t
    public final float a(int i10) {
        if (i10 == 0) {
            return this.f14272a;
        }
        return 0.0f;
    }

    @Override // t.t
    public final int b() {
        return 1;
    }

    @Override // t.t
    public final t c() {
        return new p(0.0f);
    }

    @Override // t.t
    public final void d() {
        this.f14272a = 0.0f;
    }

    @Override // t.t
    public final void e(int i10, float f10) {
        if (i10 == 0) {
            this.f14272a = f10;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof p) && ((p) obj).f14272a == this.f14272a;
    }

    public final int hashCode() {
        return Float.hashCode(this.f14272a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.f14272a;
    }
}
