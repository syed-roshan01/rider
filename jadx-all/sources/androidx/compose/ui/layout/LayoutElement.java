package androidx.compose.ui.layout;

import c9.f;
import r1.w;
import t1.u0;
import y0.n;

/* JADX INFO: loaded from: classes.dex */
final class LayoutElement extends u0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f1732b;

    public LayoutElement(f fVar) {
        this.f1732b = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutElement) && d7.a.d(this.f1732b, ((LayoutElement) obj).f1732b);
    }

    @Override // t1.u0
    public final int hashCode() {
        return this.f1732b.hashCode();
    }

    @Override // t1.u0
    public final n l() {
        w wVar = new w();
        wVar.f13416u = this.f1732b;
        return wVar;
    }

    @Override // t1.u0
    public final void m(n nVar) {
        ((w) nVar).f13416u = this.f1732b;
    }

    public final String toString() {
        return "LayoutElement(measure=" + this.f1732b + ')';
    }
}
