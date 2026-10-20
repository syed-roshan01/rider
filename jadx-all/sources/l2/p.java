package l2;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p f11219c = new p(1.0f, 0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f11220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f11221b;

    public p(float f10, float f11) {
        this.f11220a = f10;
        this.f11221b = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f11220a == pVar.f11220a && this.f11221b == pVar.f11221b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f11221b) + (Float.hashCode(this.f11220a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextGeometricTransform(scaleX=");
        sb.append(this.f11220a);
        sb.append(", skewX=");
        return l.q.l(sb, this.f11221b, ')');
    }
}
