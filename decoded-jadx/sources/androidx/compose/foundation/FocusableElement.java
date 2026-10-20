package androidx.compose.foundation;

import t1.u0;
import u.o0;
import u.q0;
import x.d;
import x.e;
import x.m;
import y0.n;

/* JADX INFO: loaded from: classes.dex */
final class FocusableElement extends u0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f1608b;

    public FocusableElement(m mVar) {
        this.f1608b = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FocusableElement) {
            return d7.a.d(this.f1608b, ((FocusableElement) obj).f1608b);
        }
        return false;
    }

    @Override // t1.u0
    public final int hashCode() {
        m mVar = this.f1608b;
        if (mVar != null) {
            return mVar.hashCode();
        }
        return 0;
    }

    @Override // t1.u0
    public final n l() {
        return new q0(this.f1608b);
    }

    @Override // t1.u0
    public final void m(n nVar) {
        d dVar;
        o0 o0Var = ((q0) nVar).f14898y;
        m mVar = o0Var.f14868u;
        m mVar2 = this.f1608b;
        if (d7.a.d(mVar, mVar2)) {
            return;
        }
        m mVar3 = o0Var.f14868u;
        if (mVar3 != null && (dVar = o0Var.f14869v) != null) {
            mVar3.b(new e(dVar));
        }
        o0Var.f14869v = null;
        o0Var.f14868u = mVar2;
    }
}
