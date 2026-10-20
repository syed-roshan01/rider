package u;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f14967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e1.n f14968b;

    public w(float f10, e1.n nVar) {
        this.f14967a = f10;
        this.f14968b = nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return m2.e.a(this.f14967a, wVar.f14967a) && d7.a.d(this.f14968b, wVar.f14968b);
    }

    public final int hashCode() {
        return this.f14968b.hashCode() + (Float.hashCode(this.f14967a) * 31);
    }

    public final String toString() {
        return "BorderStroke(width=" + ((Object) m2.e.b(this.f14967a)) + ", brush=" + this.f14968b + ')';
    }
}
