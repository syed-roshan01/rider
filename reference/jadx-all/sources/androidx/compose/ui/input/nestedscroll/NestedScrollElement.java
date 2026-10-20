package androidx.compose.ui.input.nestedscroll;

import n1.d;
import n1.g;
import t.l0;
import t1.u0;
import y0.n;

/* JADX INFO: loaded from: classes.dex */
final class NestedScrollElement extends u0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n1.a f1723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f1724c;

    public NestedScrollElement(n1.a aVar, d dVar) {
        this.f1723b = aVar;
        this.f1724c = dVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof NestedScrollElement)) {
            return false;
        }
        NestedScrollElement nestedScrollElement = (NestedScrollElement) obj;
        return d7.a.d(nestedScrollElement.f1723b, this.f1723b) && d7.a.d(nestedScrollElement.f1724c, this.f1724c);
    }

    @Override // t1.u0
    public final int hashCode() {
        int iHashCode = this.f1723b.hashCode() * 31;
        d dVar = this.f1724c;
        return iHashCode + (dVar != null ? dVar.hashCode() : 0);
    }

    @Override // t1.u0
    public final n l() {
        return new g(this.f1723b, this.f1724c);
    }

    @Override // t1.u0
    public final void m(n nVar) {
        g gVar = (g) nVar;
        gVar.f12120u = this.f1723b;
        d dVar = gVar.f12121v;
        if (dVar.f12106a == gVar) {
            dVar.f12106a = null;
        }
        d dVar2 = this.f1724c;
        if (dVar2 == null) {
            gVar.f12121v = new d();
        } else if (!d7.a.d(dVar2, dVar)) {
            gVar.f12121v = dVar2;
        }
        if (gVar.f16742t) {
            d dVar3 = gVar.f12121v;
            dVar3.f12106a = gVar;
            dVar3.f12107b = new l0(gVar, 22);
            dVar3.f12108c = gVar.v0();
        }
    }
}
