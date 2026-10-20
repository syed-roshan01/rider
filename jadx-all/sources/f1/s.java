package f1;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f6098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f6099b;

    public s(float f10, float f11) {
        this.f6098a = f10;
        this.f6099b = f11;
    }

    public final float[] a() {
        float f10 = this.f6098a;
        float f11 = this.f6099b;
        return new float[]{f10 / f11, 1.0f, ((1.0f - f10) - f11) / f11};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Float.compare(this.f6098a, sVar.f6098a) == 0 && Float.compare(this.f6099b, sVar.f6099b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6099b) + (Float.hashCode(this.f6098a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WhitePoint(x=");
        sb.append(this.f6098a);
        sb.append(", y=");
        return l.q.l(sb, this.f6099b, ')');
    }
}
