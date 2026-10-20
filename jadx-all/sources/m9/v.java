package m9;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f12008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c9.c f12009b;

    public v(c9.c cVar, Object obj) {
        this.f12008a = obj;
        this.f12009b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return d7.a.d(this.f12008a, vVar.f12008a) && d7.a.d(this.f12009b, vVar.f12009b);
    }

    public final int hashCode() {
        Object obj = this.f12008a;
        return this.f12009b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "CompletedWithCancellation(result=" + this.f12008a + ", onCancellation=" + this.f12009b + ')';
    }
}
