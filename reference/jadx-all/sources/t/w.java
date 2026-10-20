package t;

/* JADX INFO: loaded from: classes.dex */
public final class w implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f14335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f14336b;

    public w(float f10, float f11) {
        this.f14335a = f10;
        this.f14336b = f11;
        if (Float.isNaN(f10) || Float.isNaN(0.0f) || Float.isNaN(f11) || Float.isNaN(1.0f)) {
            throw new IllegalArgumentException(("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f10 + ", 0.0, " + f11 + ", 1.0.").toString());
        }
    }

    public static float b(float f10, float f11, float f12) {
        float f13 = 3;
        float f14 = 1 - f12;
        return (f12 * f12 * f12) + (f13 * f11 * f14 * f12 * f12) + (f10 * f13 * f14 * f14 * f12);
    }

    @Override // t.a0
    public final float a(float f10) {
        if (f10 <= 0.0f || f10 >= 1.0f) {
            return f10;
        }
        float f11 = 0.0f;
        float f12 = 1.0f;
        while (true) {
            float f13 = (f11 + f12) / 2;
            float fB = b(this.f14335a, this.f14336b, f13);
            if (Math.abs(f10 - fB) < 0.001f) {
                return b(0.0f, 1.0f, f13);
            }
            if (fB < f10) {
                f11 = f13;
            } else {
                f12 = f13;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            w wVar = (w) obj;
            if (this.f14335a == wVar.f14335a && this.f14336b == wVar.f14336b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(1.0f) + l.q.a(this.f14336b, l.q.a(0.0f, Float.hashCode(this.f14335a) * 31, 31), 31);
    }
}
