package androidx.compose.ui.focus;

import c9.c;
import f0.x;
import t1.u0;
import y0.n;

/* JADX INFO: loaded from: classes.dex */
final class FocusChangedElement extends u0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f1701b;

    public FocusChangedElement(x xVar) {
        this.f1701b = xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusChangedElement) && d7.a.d(this.f1701b, ((FocusChangedElement) obj).f1701b);
    }

    @Override // t1.u0
    public final int hashCode() {
        return this.f1701b.hashCode();
    }

    @Override // t1.u0
    public final n l() {
        c1.a aVar = new c1.a();
        aVar.f2873u = this.f1701b;
        return aVar;
    }

    @Override // t1.u0
    public final void m(n nVar) {
        ((c1.a) nVar).f2873u = this.f1701b;
    }

    public final String toString() {
        return "FocusChangedElement(onFocusChanged=" + this.f1701b + ')';
    }
}
