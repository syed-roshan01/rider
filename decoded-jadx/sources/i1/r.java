package i1;

/* JADX INFO: loaded from: classes.dex */
public final class r extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f7883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f7884d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f7885e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f7886f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f7887g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f7888h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f7889i;

    public r(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
        super(false, false, 3);
        this.f7883c = f10;
        this.f7884d = f11;
        this.f7885e = f12;
        this.f7886f = z10;
        this.f7887g = z11;
        this.f7888h = f13;
        this.f7889i = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Float.compare(this.f7883c, rVar.f7883c) == 0 && Float.compare(this.f7884d, rVar.f7884d) == 0 && Float.compare(this.f7885e, rVar.f7885e) == 0 && this.f7886f == rVar.f7886f && this.f7887g == rVar.f7887g && Float.compare(this.f7888h, rVar.f7888h) == 0 && Float.compare(this.f7889i, rVar.f7889i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7889i) + l.q.a(this.f7888h, l.q.c(this.f7887g, l.q.c(this.f7886f, l.q.a(this.f7885e, l.q.a(this.f7884d, Float.hashCode(this.f7883c) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeArcTo(horizontalEllipseRadius=");
        sb.append(this.f7883c);
        sb.append(", verticalEllipseRadius=");
        sb.append(this.f7884d);
        sb.append(", theta=");
        sb.append(this.f7885e);
        sb.append(", isMoreThanHalf=");
        sb.append(this.f7886f);
        sb.append(", isPositiveArc=");
        sb.append(this.f7887g);
        sb.append(", arcStartDx=");
        sb.append(this.f7888h);
        sb.append(", arcStartDy=");
        return l.q.l(sb, this.f7889i, ')');
    }
}
