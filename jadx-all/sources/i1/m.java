package i1;

/* JADX INFO: loaded from: classes.dex */
public final class m extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f7869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f7870d;

    public m(float f10, float f11) {
        super(false, false, 3);
        this.f7869c = f10;
        this.f7870d = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Float.compare(this.f7869c, mVar.f7869c) == 0 && Float.compare(this.f7870d, mVar.f7870d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7870d) + (Float.hashCode(this.f7869c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LineTo(x=");
        sb.append(this.f7869c);
        sb.append(", y=");
        return l.q.l(sb, this.f7870d, ')');
    }
}
