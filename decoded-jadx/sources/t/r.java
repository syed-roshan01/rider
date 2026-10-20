package t;

/* JADX INFO: loaded from: classes.dex */
public final class r extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f14297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f14298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f14299c;

    public r(float f10, float f11, float f12) {
        this.f14297a = f10;
        this.f14298b = f11;
        this.f14299c = f12;
    }

    @Override // t.t
    public final float a(int i10) {
        if (i10 == 0) {
            return this.f14297a;
        }
        if (i10 == 1) {
            return this.f14298b;
        }
        if (i10 != 2) {
            return 0.0f;
        }
        return this.f14299c;
    }

    @Override // t.t
    public final int b() {
        return 3;
    }

    @Override // t.t
    public final t c() {
        return new r(0.0f, 0.0f, 0.0f);
    }

    @Override // t.t
    public final void d() {
        this.f14297a = 0.0f;
        this.f14298b = 0.0f;
        this.f14299c = 0.0f;
    }

    @Override // t.t
    public final void e(int i10, float f10) {
        if (i10 == 0) {
            this.f14297a = f10;
        } else if (i10 == 1) {
            this.f14298b = f10;
        } else {
            if (i10 != 2) {
                return;
            }
            this.f14299c = f10;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (rVar.f14297a == this.f14297a && rVar.f14298b == this.f14298b && rVar.f14299c == this.f14299c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f14299c) + l.q.a(this.f14298b, Float.hashCode(this.f14297a) * 31, 31);
    }

    public final String toString() {
        return "AnimationVector3D: v1 = " + this.f14297a + ", v2 = " + this.f14298b + ", v3 = " + this.f14299c;
    }
}
