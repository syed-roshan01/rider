package i1;

/* JADX INFO: loaded from: classes.dex */
public final class v extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f7899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f7900d;

    public v(float f10, float f11) {
        super(false, false, 3);
        this.f7899c = f10;
        this.f7900d = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Float.compare(this.f7899c, vVar.f7899c) == 0 && Float.compare(this.f7900d, vVar.f7900d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7900d) + (Float.hashCode(this.f7899c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeMoveTo(dx=");
        sb.append(this.f7899c);
        sb.append(", dy=");
        return l.q.l(sb, this.f7900d, ')');
    }
}
