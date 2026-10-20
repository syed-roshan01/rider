package s;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f13739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f13740b;

    public a(float f10, float f11) {
        this.f13739a = f10;
        this.f13740b = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.compare(this.f13739a, aVar.f13739a) == 0 && Float.compare(this.f13740b, aVar.f13740b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f13740b) + (Float.hashCode(this.f13739a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlingResult(distanceCoefficient=");
        sb.append(this.f13739a);
        sb.append(", velocityCoefficient=");
        return l.q.l(sb, this.f13740b, ')');
    }
}
