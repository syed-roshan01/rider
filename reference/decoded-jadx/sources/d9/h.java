package d9;

/* JADX INFO: loaded from: classes.dex */
public abstract class h extends c implements g, j9.c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f4943n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f4944o;

    public h(int i10, Class cls, String str, String str2, int i11) {
        super(b.f4933a, cls, str, str2, (i11 & 1) == 1);
        this.f4943n = i10;
        this.f4944o = i11 >> 1;
    }

    @Override // d9.c
    public final j9.a a() {
        v.f4953a.getClass();
        return this;
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            return this.f4937d.equals(hVar.f4937d) && this.f4938e.equals(hVar.f4938e) && this.f4944o == hVar.f4944o && this.f4943n == hVar.f4943n && d7.a.d(this.f4935b, hVar.f4935b) && d7.a.d(b(), hVar.b());
        }
        if (!(obj instanceof j9.c)) {
            return false;
        }
        j9.a aVar = this.f4934a;
        if (aVar == null) {
            a();
            this.f4934a = this;
            aVar = this;
        }
        return obj.equals(aVar);
    }

    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final int hashCode() {
        return this.f4938e.hashCode() + a7.a.i(this.f4937d, b() == null ? 0 : b().hashCode() * 31, 31);
    }

    @Override // d9.g
    public final int getArity() {
        return this.f4943n;
    }

    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        j9.a aVar = this.f4934a;
        if (aVar == null) {
            a();
            this.f4934a = this;
            aVar = this;
        }
        if (aVar != this) {
            return aVar.toString();
        }
        String str = this.f4937d;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : l.q.k("function ", str, " (Kotlin reflection is not available)");
    }

    public h(int i10, Object obj, Class cls, String str, String str2) {
        super(obj, cls, str, str2, false);
        this.f4943n = i10;
        this.f4944o = 0;
    }
}
