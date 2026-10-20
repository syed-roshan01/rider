package androidx.compose.foundation;

import t1.u0;
import u.d1;
import x.m;
import y0.n;

/* JADX INFO: loaded from: classes.dex */
final class HoverableElement extends u0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f1609b;

    public HoverableElement(m mVar) {
        this.f1609b = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HoverableElement) && d7.a.d(((HoverableElement) obj).f1609b, this.f1609b);
    }

    @Override // t1.u0
    public final int hashCode() {
        return this.f1609b.hashCode() * 31;
    }

    @Override // t1.u0
    public final n l() {
        d1 d1Var = new d1();
        d1Var.f14755u = this.f1609b;
        return d1Var;
    }

    @Override // t1.u0
    public final void m(n nVar) {
        d1 d1Var = (d1) nVar;
        m mVar = d1Var.f14755u;
        m mVar2 = this.f1609b;
        if (d7.a.d(mVar, mVar2)) {
            return;
        }
        d1Var.I0();
        d1Var.f14755u = mVar2;
    }
}
