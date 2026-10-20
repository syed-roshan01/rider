package h0;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f7436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f7437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f7438c;

    public p(o oVar, o oVar2, boolean z10) {
        this.f7436a = oVar;
        this.f7437b = oVar2;
        this.f7438c = z10;
    }

    public static p a(p pVar, o oVar, o oVar2, boolean z10, int i10) {
        if ((i10 & 1) != 0) {
            oVar = pVar.f7436a;
        }
        if ((i10 & 2) != 0) {
            oVar2 = pVar.f7437b;
        }
        if ((i10 & 4) != 0) {
            z10 = pVar.f7438c;
        }
        pVar.getClass();
        return new p(oVar, oVar2, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return d7.a.d(this.f7436a, pVar.f7436a) && d7.a.d(this.f7437b, pVar.f7437b) && this.f7438c == pVar.f7438c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f7438c) + ((this.f7437b.hashCode() + (this.f7436a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Selection(start=" + this.f7436a + ", end=" + this.f7437b + ", handlesCrossed=" + this.f7438c + ')';
    }
}
