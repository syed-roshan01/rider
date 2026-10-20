package androidx.compose.ui.layout;

import r1.t;
import t1.u0;
import y0.n;

/* JADX INFO: loaded from: classes.dex */
final class LayoutIdElement extends u0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1733b;

    public LayoutIdElement(String str) {
        this.f1733b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutIdElement) && d7.a.d(this.f1733b, ((LayoutIdElement) obj).f1733b);
    }

    @Override // t1.u0
    public final int hashCode() {
        return this.f1733b.hashCode();
    }

    @Override // t1.u0
    public final n l() {
        t tVar = new t();
        tVar.f13412u = this.f1733b;
        return tVar;
    }

    @Override // t1.u0
    public final void m(n nVar) {
        ((t) nVar).f13412u = this.f1733b;
    }

    public final String toString() {
        return "LayoutIdElement(layoutId=" + this.f1733b + ')';
    }
}
