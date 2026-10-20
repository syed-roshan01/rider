package t;

/* JADX INFO: loaded from: classes.dex */
public final class s extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f14306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f14307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f14308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f14309d;

    public s(float f10, float f11, float f12, float f13) {
        this.f14306a = f10;
        this.f14307b = f11;
        this.f14308c = f12;
        this.f14309d = f13;
    }

    @Override // t.t
    public final float a(int i10) {
        if (i10 == 0) {
            return this.f14306a;
        }
        if (i10 == 1) {
            return this.f14307b;
        }
        if (i10 == 2) {
            return this.f14308c;
        }
        if (i10 != 3) {
            return 0.0f;
        }
        return this.f14309d;
    }

    @Override // t.t
    public final int b() {
        return 4;
    }

    @Override // t.t
    public final t c() {
        return new s(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // t.t
    public final void d() {
        this.f14306a = 0.0f;
        this.f14307b = 0.0f;
        this.f14308c = 0.0f;
        this.f14309d = 0.0f;
    }

    @Override // t.t
    public final void e(int i10, float f10) {
        if (i10 == 0) {
            this.f14306a = f10;
            return;
        }
        if (i10 == 1) {
            this.f14307b = f10;
        } else if (i10 == 2) {
            this.f14308c = f10;
        } else {
            if (i10 != 3) {
                return;
            }
            this.f14309d = f10;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            s sVar = (s) obj;
            if (sVar.f14306a == this.f14306a && sVar.f14307b == this.f14307b && sVar.f14308c == this.f14308c && sVar.f14309d == this.f14309d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f14309d) + l.q.a(this.f14308c, l.q.a(this.f14307b, Float.hashCode(this.f14306a) * 31, 31), 31);
    }

    public final String toString() {
        return "AnimationVector4D: v1 = " + this.f14306a + ", v2 = " + this.f14307b + ", v3 = " + this.f14308c + ", v4 = " + this.f14309d;
    }
}
