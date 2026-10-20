package androidx.compose.ui.layout;

import c9.c;
import r1.r0;
import t1.u0;
import y0.n;

/* JADX INFO: loaded from: classes.dex */
final class OnGloballyPositionedElement extends u0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f1734b;

    public OnGloballyPositionedElement(c cVar) {
        this.f1734b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnGloballyPositionedElement)) {
            return false;
        }
        return d7.a.d(this.f1734b, ((OnGloballyPositionedElement) obj).f1734b);
    }

    @Override // t1.u0
    public final int hashCode() {
        return this.f1734b.hashCode();
    }

    @Override // t1.u0
    public final n l() {
        r0 r0Var = new r0();
        r0Var.f13411u = this.f1734b;
        return r0Var;
    }

    @Override // t1.u0
    public final void m(n nVar) {
        ((r0) nVar).f13411u = this.f1734b;
    }
}
