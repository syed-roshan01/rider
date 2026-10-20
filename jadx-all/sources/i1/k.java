package i1;

/* JADX INFO: loaded from: classes.dex */
public final class k extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f7848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f7849d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f7850e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f7851f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f7852g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f7853h;

    public k(float f10, float f11, float f12, float f13, float f14, float f15) {
        super(true, false, 2);
        this.f7848c = f10;
        this.f7849d = f11;
        this.f7850e = f12;
        this.f7851f = f13;
        this.f7852g = f14;
        this.f7853h = f15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Float.compare(this.f7848c, kVar.f7848c) == 0 && Float.compare(this.f7849d, kVar.f7849d) == 0 && Float.compare(this.f7850e, kVar.f7850e) == 0 && Float.compare(this.f7851f, kVar.f7851f) == 0 && Float.compare(this.f7852g, kVar.f7852g) == 0 && Float.compare(this.f7853h, kVar.f7853h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7853h) + l.q.a(this.f7852g, l.q.a(this.f7851f, l.q.a(this.f7850e, l.q.a(this.f7849d, Float.hashCode(this.f7848c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CurveTo(x1=");
        sb.append(this.f7848c);
        sb.append(", y1=");
        sb.append(this.f7849d);
        sb.append(", x2=");
        sb.append(this.f7850e);
        sb.append(", y2=");
        sb.append(this.f7851f);
        sb.append(", x3=");
        sb.append(this.f7852g);
        sb.append(", y3=");
        return l.q.l(sb, this.f7853h, ')');
    }
}
