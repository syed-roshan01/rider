package i1;

/* JADX INFO: loaded from: classes.dex */
public final class q extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f7881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f7882d;

    public q(float f10, float f11) {
        super(false, true, 1);
        this.f7881c = f10;
        this.f7882d = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Float.compare(this.f7881c, qVar.f7881c) == 0 && Float.compare(this.f7882d, qVar.f7882d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7882d) + (Float.hashCode(this.f7881c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReflectiveQuadTo(x=");
        sb.append(this.f7881c);
        sb.append(", y=");
        return l.q.l(sb, this.f7882d, ')');
    }
}
