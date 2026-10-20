package i1;

/* JADX INFO: loaded from: classes.dex */
public final class i extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f7833c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f7834d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f7835e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f7836f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f7837g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f7838h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f7839i;

    public i(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
        super(false, false, 3);
        this.f7833c = f10;
        this.f7834d = f11;
        this.f7835e = f12;
        this.f7836f = z10;
        this.f7837g = z11;
        this.f7838h = f13;
        this.f7839i = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Float.compare(this.f7833c, iVar.f7833c) == 0 && Float.compare(this.f7834d, iVar.f7834d) == 0 && Float.compare(this.f7835e, iVar.f7835e) == 0 && this.f7836f == iVar.f7836f && this.f7837g == iVar.f7837g && Float.compare(this.f7838h, iVar.f7838h) == 0 && Float.compare(this.f7839i, iVar.f7839i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7839i) + l.q.a(this.f7838h, l.q.c(this.f7837g, l.q.c(this.f7836f, l.q.a(this.f7835e, l.q.a(this.f7834d, Float.hashCode(this.f7833c) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArcTo(horizontalEllipseRadius=");
        sb.append(this.f7833c);
        sb.append(", verticalEllipseRadius=");
        sb.append(this.f7834d);
        sb.append(", theta=");
        sb.append(this.f7835e);
        sb.append(", isMoreThanHalf=");
        sb.append(this.f7836f);
        sb.append(", isPositiveArc=");
        sb.append(this.f7837g);
        sb.append(", arcStartX=");
        sb.append(this.f7838h);
        sb.append(", arcStartY=");
        return l.q.l(sb, this.f7839i, ')');
    }
}
