package i1;

/* JADX INFO: loaded from: classes.dex */
public final class x extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f7905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f7906d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f7907e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f7908f;

    public x(float f10, float f11, float f12, float f13) {
        super(true, false, 2);
        this.f7905c = f10;
        this.f7906d = f11;
        this.f7907e = f12;
        this.f7908f = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Float.compare(this.f7905c, xVar.f7905c) == 0 && Float.compare(this.f7906d, xVar.f7906d) == 0 && Float.compare(this.f7907e, xVar.f7907e) == 0 && Float.compare(this.f7908f, xVar.f7908f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7908f) + l.q.a(this.f7907e, l.q.a(this.f7906d, Float.hashCode(this.f7905c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeReflectiveCurveTo(dx1=");
        sb.append(this.f7905c);
        sb.append(", dy1=");
        sb.append(this.f7906d);
        sb.append(", dx2=");
        sb.append(this.f7907e);
        sb.append(", dy2=");
        return l.q.l(sb, this.f7908f, ')');
    }
}
