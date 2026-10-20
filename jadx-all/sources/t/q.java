package t;

/* JADX INFO: loaded from: classes.dex */
public final class q extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f14279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f14280b;

    public q(float f10, float f11) {
        this.f14279a = f10;
        this.f14280b = f11;
    }

    @Override // t.t
    public final float a(int i10) {
        if (i10 == 0) {
            return this.f14279a;
        }
        if (i10 != 1) {
            return 0.0f;
        }
        return this.f14280b;
    }

    @Override // t.t
    public final int b() {
        return 2;
    }

    @Override // t.t
    public final t c() {
        return new q(0.0f, 0.0f);
    }

    @Override // t.t
    public final void d() {
        this.f14279a = 0.0f;
        this.f14280b = 0.0f;
    }

    @Override // t.t
    public final void e(int i10, float f10) {
        if (i10 == 0) {
            this.f14279a = f10;
        } else {
            if (i10 != 1) {
                return;
            }
            this.f14280b = f10;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (qVar.f14279a == this.f14279a && qVar.f14280b == this.f14280b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f14280b) + (Float.hashCode(this.f14279a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.f14279a + ", v2 = " + this.f14280b;
    }
}
