package androidx.compose.ui.input.key;

import c9.c;
import m1.d;
import t1.u0;
import u.s;
import y0.n;

/* JADX INFO: loaded from: classes.dex */
final class KeyInputElement extends u0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f1721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f1722c;

    public KeyInputElement(c cVar, s sVar) {
        this.f1721b = cVar;
        this.f1722c = sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyInputElement)) {
            return false;
        }
        KeyInputElement keyInputElement = (KeyInputElement) obj;
        return d7.a.d(this.f1721b, keyInputElement.f1721b) && d7.a.d(this.f1722c, keyInputElement.f1722c);
    }

    @Override // t1.u0
    public final int hashCode() {
        c cVar = this.f1721b;
        int iHashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
        c cVar2 = this.f1722c;
        return iHashCode + (cVar2 != null ? cVar2.hashCode() : 0);
    }

    @Override // t1.u0
    public final n l() {
        d dVar = new d();
        dVar.f11787u = this.f1721b;
        dVar.f11788v = this.f1722c;
        return dVar;
    }

    @Override // t1.u0
    public final void m(n nVar) {
        d dVar = (d) nVar;
        dVar.f11787u = this.f1721b;
        dVar.f11788v = this.f1722c;
    }

    public final String toString() {
        return "KeyInputElement(onKeyEvent=" + this.f1721b + ", onPreKeyEvent=" + this.f1722c + ')';
    }
}
