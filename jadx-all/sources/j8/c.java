package j8;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ja.j f8446d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ja.j f8447e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ja.j f8448f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ja.j f8449g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ja.j f8450h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ja.j f8451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ja.j f8452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8453c;

    static {
        ja.j jVar = ja.j.f8539d;
        f8446d = fa.l.h(":status");
        f8447e = fa.l.h(":method");
        f8448f = fa.l.h(":path");
        f8449g = fa.l.h(":scheme");
        f8450h = fa.l.h(":authority");
        fa.l.h(":host");
        fa.l.h(":version");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(ja.j jVar, String str) {
        this(jVar, fa.l.h(str));
        ja.j jVar2 = ja.j.f8539d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f8451a.equals(cVar.f8451a) && this.f8452b.equals(cVar.f8452b);
    }

    public final int hashCode() {
        return this.f8452b.hashCode() + ((this.f8451a.hashCode() + 527) * 31);
    }

    public final String toString() {
        return String.format("%s: %s", this.f8451a.t(), this.f8452b.t());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(String str, String str2) {
        this(fa.l.h(str), fa.l.h(str2));
        ja.j jVar = ja.j.f8539d;
    }

    public c(ja.j jVar, ja.j jVar2) {
        this.f8451a = jVar;
        this.f8452b = jVar2;
        this.f8453c = jVar2.d() + jVar.d() + 32;
    }
}
