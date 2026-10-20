package i1;

/* JADX INFO: loaded from: classes.dex */
public final class n extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f7871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f7872d;

    public n(float f10, float f11) {
        super(false, false, 3);
        this.f7871c = f10;
        this.f7872d = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Float.compare(this.f7871c, nVar.f7871c) == 0 && Float.compare(this.f7872d, nVar.f7872d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7872d) + (Float.hashCode(this.f7871c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MoveTo(x=");
        sb.append(this.f7871c);
        sb.append(", y=");
        return l.q.l(sb, this.f7872d, ')');
    }
}
