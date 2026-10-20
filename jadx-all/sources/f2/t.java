package f2;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f6127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f6128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6130d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f6131e;

    public t(e eVar, l lVar, int i10, int i11, Object obj) {
        this.f6127a = eVar;
        this.f6128b = lVar;
        this.f6129c = i10;
        this.f6130d = i11;
        this.f6131e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return d7.a.d(this.f6127a, tVar.f6127a) && d7.a.d(this.f6128b, tVar.f6128b) && j.a(this.f6129c, tVar.f6129c) && k.a(this.f6130d, tVar.f6130d) && d7.a.d(this.f6131e, tVar.f6131e);
    }

    public final int hashCode() {
        e eVar = this.f6127a;
        int iU = a7.a.u(this.f6130d, a7.a.u(this.f6129c, (((eVar == null ? 0 : eVar.hashCode()) * 31) + this.f6128b.f6122a) * 31, 31), 31);
        Object obj = this.f6131e;
        return iU + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.f6127a);
        sb.append(", fontWeight=");
        sb.append(this.f6128b);
        sb.append(", fontStyle=");
        int i10 = this.f6129c;
        if (j.a(i10, 0)) {
            str = "Normal";
        } else {
            str = j.a(i10, 1) ? "Italic" : "Invalid";
        }
        sb.append((Object) str);
        sb.append(", fontSynthesis=");
        sb.append((Object) k.b(this.f6130d));
        sb.append(", resourceLoaderCacheKey=");
        sb.append(this.f6131e);
        sb.append(')');
        return sb.toString();
    }
}
