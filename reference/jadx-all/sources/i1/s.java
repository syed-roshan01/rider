package i1;

/* JADX INFO: loaded from: classes.dex */
public final class s extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f7890c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f7891d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f7892e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f7893f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f7894g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f7895h;

    public s(float f10, float f11, float f12, float f13, float f14, float f15) {
        super(true, false, 2);
        this.f7890c = f10;
        this.f7891d = f11;
        this.f7892e = f12;
        this.f7893f = f13;
        this.f7894g = f14;
        this.f7895h = f15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Float.compare(this.f7890c, sVar.f7890c) == 0 && Float.compare(this.f7891d, sVar.f7891d) == 0 && Float.compare(this.f7892e, sVar.f7892e) == 0 && Float.compare(this.f7893f, sVar.f7893f) == 0 && Float.compare(this.f7894g, sVar.f7894g) == 0 && Float.compare(this.f7895h, sVar.f7895h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7895h) + l.q.a(this.f7894g, l.q.a(this.f7893f, l.q.a(this.f7892e, l.q.a(this.f7891d, Float.hashCode(this.f7890c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeCurveTo(dx1=");
        sb.append(this.f7890c);
        sb.append(", dy1=");
        sb.append(this.f7891d);
        sb.append(", dx2=");
        sb.append(this.f7892e);
        sb.append(", dy2=");
        sb.append(this.f7893f);
        sb.append(", dx3=");
        sb.append(this.f7894g);
        sb.append(", dy3=");
        return l.q.l(sb, this.f7895h, ')');
    }
}
