package androidx.compose.ui.draw;

import b1.d;
import c9.c;
import t1.u0;
import y0.n;

/* JADX INFO: loaded from: classes.dex */
final class DrawWithCacheElement extends u0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f1693b;

    public DrawWithCacheElement(c cVar) {
        this.f1693b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawWithCacheElement) && d7.a.d(this.f1693b, ((DrawWithCacheElement) obj).f1693b);
    }

    @Override // t1.u0
    public final int hashCode() {
        return this.f1693b.hashCode();
    }

    @Override // t1.u0
    public final n l() {
        return new b1.c(new d(), this.f1693b);
    }

    @Override // t1.u0
    public final void m(n nVar) {
        b1.c cVar = (b1.c) nVar;
        cVar.f2511w = this.f1693b;
        cVar.G0();
    }

    public final String toString() {
        return "DrawWithCacheElement(onBuildDrawCache=" + this.f1693b + ')';
    }
}
