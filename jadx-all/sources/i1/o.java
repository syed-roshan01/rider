package i1;

/* JADX INFO: loaded from: classes.dex */
public final class o extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f7873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f7874d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f7875e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f7876f;

    public o(float f10, float f11, float f12, float f13) {
        super(false, true, 1);
        this.f7873c = f10;
        this.f7874d = f11;
        this.f7875e = f12;
        this.f7876f = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Float.compare(this.f7873c, oVar.f7873c) == 0 && Float.compare(this.f7874d, oVar.f7874d) == 0 && Float.compare(this.f7875e, oVar.f7875e) == 0 && Float.compare(this.f7876f, oVar.f7876f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7876f) + l.q.a(this.f7875e, l.q.a(this.f7874d, Float.hashCode(this.f7873c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QuadTo(x1=");
        sb.append(this.f7873c);
        sb.append(", y1=");
        sb.append(this.f7874d);
        sb.append(", x2=");
        sb.append(this.f7875e);
        sb.append(", y2=");
        return l.q.l(sb, this.f7876f, ')');
    }
}
