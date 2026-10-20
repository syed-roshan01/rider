package i1;

/* JADX INFO: loaded from: classes.dex */
public final class w extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f7901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f7902d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f7903e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f7904f;

    public w(float f10, float f11, float f12, float f13) {
        super(false, true, 1);
        this.f7901c = f10;
        this.f7902d = f11;
        this.f7903e = f12;
        this.f7904f = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Float.compare(this.f7901c, wVar.f7901c) == 0 && Float.compare(this.f7902d, wVar.f7902d) == 0 && Float.compare(this.f7903e, wVar.f7903e) == 0 && Float.compare(this.f7904f, wVar.f7904f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7904f) + l.q.a(this.f7903e, l.q.a(this.f7902d, Float.hashCode(this.f7901c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeQuadTo(dx1=");
        sb.append(this.f7901c);
        sb.append(", dy1=");
        sb.append(this.f7902d);
        sb.append(", dx2=");
        sb.append(this.f7903e);
        sb.append(", dy2=");
        return l.q.l(sb, this.f7904f, ')');
    }
}
