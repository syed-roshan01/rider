package androidx.compose.ui.input.rotary;

import c9.c;
import q1.b;
import t1.u0;
import u1.s;
import y0.n;

/* JADX INFO: loaded from: classes.dex */
final class RotaryInputElement extends u0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f1731b = s.f15262c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RotaryInputElement) {
            return d7.a.d(this.f1731b, ((RotaryInputElement) obj).f1731b) && d7.a.d(null, null);
        }
        return false;
    }

    @Override // t1.u0
    public final int hashCode() {
        c cVar = this.f1731b;
        return (cVar == null ? 0 : cVar.hashCode()) * 31;
    }

    @Override // t1.u0
    public final n l() {
        b bVar = new b();
        bVar.f13075u = this.f1731b;
        bVar.f13076v = null;
        return bVar;
    }

    @Override // t1.u0
    public final void m(n nVar) {
        b bVar = (b) nVar;
        bVar.f13075u = this.f1731b;
        bVar.f13076v = null;
    }

    public final String toString() {
        return "RotaryInputElement(onRotaryScrollEvent=" + this.f1731b + ", onPreRotaryScrollEvent=null)";
    }
}
