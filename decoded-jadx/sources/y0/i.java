package y0;

/* JADX INFO: loaded from: classes.dex */
public final class i implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f16725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f16726c;

    public i(o oVar, o oVar2) {
        this.f16725b = oVar;
        this.f16726c = oVar2;
    }

    @Override // y0.o
    public final boolean c(c9.c cVar) {
        return this.f16725b.c(cVar) && this.f16726c.c(cVar);
    }

    @Override // y0.o
    public final Object e(Object obj, c9.e eVar) {
        return this.f16726c.e(this.f16725b.e(obj, eVar), eVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (d7.a.d(this.f16725b, iVar.f16725b) && d7.a.d(this.f16726c, iVar.f16726c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f16726c.hashCode() * 31) + this.f16725b.hashCode();
    }

    public final String toString() {
        return "[" + ((String) e("", h.f16724a)) + ']';
    }
}
