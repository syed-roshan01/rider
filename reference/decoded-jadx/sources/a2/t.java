package a2;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f973b;

    public t(s sVar, r rVar) {
        this.f972a = sVar;
        this.f973b = rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return d7.a.d(this.f973b, tVar.f973b) && d7.a.d(this.f972a, tVar.f972a);
    }

    public final int hashCode() {
        s sVar = this.f972a;
        int iHashCode = (sVar != null ? sVar.hashCode() : 0) * 31;
        r rVar = this.f973b;
        return iHashCode + (rVar != null ? rVar.hashCode() : 0);
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.f972a + ", paragraphSyle=" + this.f973b + ')';
    }
}
