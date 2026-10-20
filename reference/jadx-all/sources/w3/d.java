package w3;

import android.net.Uri;
import android.view.InputEvent;
import m9.m0;
import o1.s;
import x3.e;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x3.c f16155a;

    public d(x3.b bVar) {
        this.f16155a = bVar;
    }

    public u6.b a(x3.a aVar) {
        d7.a.m(aVar, "deletionRequest");
        throw null;
    }

    public u6.b b() {
        return s.j(z6.a.e(d7.a.b(m0.f11969a), null, new a(this, null), 3));
    }

    public u6.b c(Uri uri, InputEvent inputEvent) {
        d7.a.m(uri, "attributionSource");
        return s.j(z6.a.e(d7.a.b(m0.f11969a), null, new b(this, uri, inputEvent, null), 3));
    }

    public u6.b d(Uri uri) {
        d7.a.m(uri, "trigger");
        return s.j(z6.a.e(d7.a.b(m0.f11969a), null, new c(this, uri, null), 3));
    }

    public u6.b e(x3.d dVar) {
        d7.a.m(dVar, "request");
        throw null;
    }

    public u6.b f(e eVar) {
        d7.a.m(eVar, "request");
        throw null;
    }
}
