package i1;

/* JADX INFO: loaded from: classes.dex */
public final class u extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f7897c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f7898d;

    public u(float f10, float f11) {
        super(false, false, 3);
        this.f7897c = f10;
        this.f7898d = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Float.compare(this.f7897c, uVar.f7897c) == 0 && Float.compare(this.f7898d, uVar.f7898d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7898d) + (Float.hashCode(this.f7897c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeLineTo(dx=");
        sb.append(this.f7897c);
        sb.append(", dy=");
        return l.q.l(sb, this.f7898d, ')');
    }
}
