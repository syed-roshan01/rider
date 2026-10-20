package m2;

import l.q;

/* JADX INFO: loaded from: classes.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f11793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f11794b;

    public c(float f10, float f11) {
        this.f11793a = f10;
        this.f11794b = f11;
    }

    @Override // m2.b
    public final float c() {
        return this.f11793a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Float.compare(this.f11793a, cVar.f11793a) == 0 && Float.compare(this.f11794b, cVar.f11794b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f11794b) + (Float.hashCode(this.f11793a) * 31);
    }

    @Override // m2.b
    public final float m() {
        return this.f11794b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DensityImpl(density=");
        sb.append(this.f11793a);
        sb.append(", fontScale=");
        return q.l(sb, this.f11794b, ')');
    }
}
