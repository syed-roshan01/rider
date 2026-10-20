package i1;

/* JADX INFO: loaded from: classes.dex */
public final class p extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f7877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f7878d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f7879e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f7880f;

    public p(float f10, float f11, float f12, float f13) {
        super(true, false, 2);
        this.f7877c = f10;
        this.f7878d = f11;
        this.f7879e = f12;
        this.f7880f = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Float.compare(this.f7877c, pVar.f7877c) == 0 && Float.compare(this.f7878d, pVar.f7878d) == 0 && Float.compare(this.f7879e, pVar.f7879e) == 0 && Float.compare(this.f7880f, pVar.f7880f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7880f) + l.q.a(this.f7879e, l.q.a(this.f7878d, Float.hashCode(this.f7877c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReflectiveCurveTo(x1=");
        sb.append(this.f7877c);
        sb.append(", y1=");
        sb.append(this.f7878d);
        sb.append(", x2=");
        sb.append(this.f7879e);
        sb.append(", y2=");
        return l.q.l(sb, this.f7880f, ')');
    }
}
