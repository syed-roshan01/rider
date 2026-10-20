package u;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e1.y f14892a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e1.p f14893b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g1.c f14894c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e1.d0 f14895d = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return d7.a.d(this.f14892a, qVar.f14892a) && d7.a.d(this.f14893b, qVar.f14893b) && d7.a.d(this.f14894c, qVar.f14894c) && d7.a.d(this.f14895d, qVar.f14895d);
    }

    public final int hashCode() {
        e1.y yVar = this.f14892a;
        int iHashCode = (yVar == null ? 0 : yVar.hashCode()) * 31;
        e1.p pVar = this.f14893b;
        int iHashCode2 = (iHashCode + (pVar == null ? 0 : pVar.hashCode())) * 31;
        g1.c cVar = this.f14894c;
        int iHashCode3 = (iHashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        e1.d0 d0Var = this.f14895d;
        return iHashCode3 + (d0Var != null ? d0Var.hashCode() : 0);
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.f14892a + ", canvas=" + this.f14893b + ", canvasDrawScope=" + this.f14894c + ", borderPath=" + this.f14895d + ')';
    }
}
