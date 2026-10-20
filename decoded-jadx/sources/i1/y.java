package i1;

/* JADX INFO: loaded from: classes.dex */
public final class y extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f7909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f7910d;

    public y(float f10, float f11) {
        super(false, true, 1);
        this.f7909c = f10;
        this.f7910d = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Float.compare(this.f7909c, yVar.f7909c) == 0 && Float.compare(this.f7910d, yVar.f7910d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7910d) + (Float.hashCode(this.f7909c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeReflectiveQuadTo(dx=");
        sb.append(this.f7909c);
        sb.append(", dy=");
        return l.q.l(sb, this.f7910d, ')');
    }
}
