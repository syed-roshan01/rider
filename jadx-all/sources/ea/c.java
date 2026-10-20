package ea;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ja.j f5439d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ja.j f5440e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ja.j f5441f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ja.j f5442g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ja.j f5443h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ja.j f5444i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ja.j f5445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ja.j f5446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5447c;

    static {
        ja.j jVar = ja.j.f8539d;
        f5439d = fa.l.h(":");
        f5440e = fa.l.h(":status");
        f5441f = fa.l.h(":method");
        f5442g = fa.l.h(":path");
        f5443h = fa.l.h(":scheme");
        f5444i = fa.l.h(":authority");
    }

    public c(ja.j jVar, ja.j jVar2) {
        d7.a.m(jVar, "name");
        d7.a.m(jVar2, FirebaseAnalytics.Param.VALUE);
        this.f5445a = jVar;
        this.f5446b = jVar2;
        this.f5447c = jVar2.d() + jVar.d() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return d7.a.d(this.f5445a, cVar.f5445a) && d7.a.d(this.f5446b, cVar.f5446b);
    }

    public final int hashCode() {
        return this.f5446b.hashCode() + (this.f5445a.hashCode() * 31);
    }

    public final String toString() {
        return this.f5445a.t() + ": " + this.f5446b.t();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(String str, String str2) {
        this(fa.l.h(str), fa.l.h(str2));
        d7.a.m(str, "name");
        d7.a.m(str2, FirebaseAnalytics.Param.VALUE);
        ja.j jVar = ja.j.f8539d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(ja.j jVar, String str) {
        this(jVar, fa.l.h(str));
        d7.a.m(jVar, "name");
        d7.a.m(str, FirebaseAnalytics.Param.VALUE);
        ja.j jVar2 = ja.j.f8539d;
    }
}
