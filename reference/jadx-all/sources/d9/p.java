package d9;

/* JADX INFO: loaded from: classes.dex */
public abstract class p extends c implements j9.f {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f4947n;

    public p(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
        this.f4947n = (i10 & 2) == 2;
    }

    public final j9.a d() {
        if (this.f4947n) {
            return this;
        }
        j9.a aVar = this.f4934a;
        if (aVar != null) {
            return aVar;
        }
        j9.a aVarA = a();
        this.f4934a = aVarA;
        return aVarA;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            return b().equals(pVar.b()) && this.f4937d.equals(pVar.f4937d) && this.f4938e.equals(pVar.f4938e) && d7.a.d(this.f4935b, pVar.f4935b);
        }
        if (obj instanceof j9.f) {
            return obj.equals(d());
        }
        return false;
    }

    public final int hashCode() {
        return this.f4938e.hashCode() + a7.a.i(this.f4937d, b().hashCode() * 31, 31);
    }

    public final String toString() {
        j9.a aVarD = d();
        return aVarD != this ? aVarD.toString() : a7.a.p(new StringBuilder("property "), this.f4937d, " (Kotlin reflection is not available)");
    }
}
