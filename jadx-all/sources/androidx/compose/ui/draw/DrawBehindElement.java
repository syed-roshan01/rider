package androidx.compose.ui.draw;

import b1.e;
import c9.c;
import t1.u0;
import y0.n;

/* JADX INFO: loaded from: classes.dex */
final class DrawBehindElement extends u0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f1692b;

    public DrawBehindElement(c cVar) {
        this.f1692b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawBehindElement) && d7.a.d(this.f1692b, ((DrawBehindElement) obj).f1692b);
    }

    @Override // t1.u0
    public final int hashCode() {
        return this.f1692b.hashCode();
    }

    @Override // t1.u0
    public final n l() {
        e eVar = new e();
        eVar.f2514u = this.f1692b;
        return eVar;
    }

    @Override // t1.u0
    public final void m(n nVar) {
        ((e) nVar).f2514u = this.f1692b;
    }

    public final String toString() {
        return "DrawBehindElement(onDraw=" + this.f1692b + ')';
    }
}
