package androidx.compose.foundation.layout;

import t1.u0;
import y.q0;
import y0.n;

/* JADX INFO: loaded from: classes.dex */
final class OffsetPxElement extends u0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c9.c f1648b;

    public OffsetPxElement(c9.c cVar) {
        this.f1648b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetPxElement offsetPxElement = obj instanceof OffsetPxElement ? (OffsetPxElement) obj : null;
        if (offsetPxElement == null) {
            return false;
        }
        return d7.a.d(this.f1648b, offsetPxElement.f1648b);
    }

    @Override // t1.u0
    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f1648b.hashCode() * 31);
    }

    @Override // t1.u0
    public final n l() {
        q0 q0Var = new q0();
        q0Var.f16663u = this.f1648b;
        q0Var.f16664v = true;
        return q0Var;
    }

    @Override // t1.u0
    public final void m(n nVar) {
        q0 q0Var = (q0) nVar;
        q0Var.f16663u = this.f1648b;
        q0Var.f16664v = true;
    }

    public final String toString() {
        return "OffsetPxModifier(offset=" + this.f1648b + ", rtlAware=true)";
    }
}
