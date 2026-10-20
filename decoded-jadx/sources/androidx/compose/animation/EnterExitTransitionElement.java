package androidx.compose.animation;

import s.k0;
import s.p0;
import s.q0;
import s.r0;
import t.u1;
import t1.u0;
import y0.n;

/* JADX INFO: loaded from: classes.dex */
final class EnterExitTransitionElement extends u0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u1 f1588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q0 f1589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r0 f1590d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k0 f1591e;

    public EnterExitTransitionElement(u1 u1Var, q0 q0Var, r0 r0Var, k0 k0Var) {
        this.f1588b = u1Var;
        this.f1589c = q0Var;
        this.f1590d = r0Var;
        this.f1591e = k0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnterExitTransitionElement)) {
            return false;
        }
        EnterExitTransitionElement enterExitTransitionElement = (EnterExitTransitionElement) obj;
        return d7.a.d(this.f1588b, enterExitTransitionElement.f1588b) && d7.a.d(null, null) && d7.a.d(null, null) && d7.a.d(null, null) && d7.a.d(this.f1589c, enterExitTransitionElement.f1589c) && d7.a.d(this.f1590d, enterExitTransitionElement.f1590d) && d7.a.d(this.f1591e, enterExitTransitionElement.f1591e);
    }

    @Override // t1.u0
    public final int hashCode() {
        return this.f1591e.hashCode() + ((this.f1590d.f13861a.hashCode() + ((this.f1589c.f13858a.hashCode() + (this.f1588b.hashCode() * 923521)) * 31)) * 31);
    }

    @Override // t1.u0
    public final n l() {
        return new p0(this.f1588b, null, null, null, this.f1589c, this.f1590d, this.f1591e);
    }

    @Override // t1.u0
    public final void m(n nVar) {
        p0 p0Var = (p0) nVar;
        p0Var.f13851u = this.f1588b;
        p0Var.f13852v = null;
        p0Var.f13853w = null;
        p0Var.f13854x = null;
        p0Var.f13855y = this.f1589c;
        p0Var.f13856z = this.f1590d;
        p0Var.A = this.f1591e;
    }

    public final String toString() {
        return "EnterExitTransitionElement(transition=" + this.f1588b + ", sizeAnimation=null, offsetAnimation=null, slideAnimation=null, enter=" + this.f1589c + ", exit=" + this.f1590d + ", graphicsLayerBlock=" + this.f1591e + ')';
    }
}
