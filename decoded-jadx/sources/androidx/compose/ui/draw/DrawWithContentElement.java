package androidx.compose.ui.draw;

import b1.h;
import c9.c;
import t1.u0;
import y0.n;

/* JADX INFO: loaded from: classes.dex */
final class DrawWithContentElement extends u0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f1694b;

    public DrawWithContentElement(c cVar) {
        this.f1694b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawWithContentElement) && d7.a.d(this.f1694b, ((DrawWithContentElement) obj).f1694b);
    }

    @Override // t1.u0
    public final int hashCode() {
        return this.f1694b.hashCode();
    }

    @Override // t1.u0
    public final n l() {
        h hVar = new h();
        hVar.f2516u = this.f1694b;
        return hVar;
    }

    @Override // t1.u0
    public final void m(n nVar) {
        ((h) nVar).f2516u = this.f1694b;
    }

    public final String toString() {
        return "DrawWithContentElement(onDraw=" + this.f1694b + ')';
    }
}
