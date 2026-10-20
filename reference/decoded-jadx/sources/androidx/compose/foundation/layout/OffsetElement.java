package androidx.compose.foundation.layout;

import l.q;
import m2.e;
import t1.u0;
import y.p0;
import y0.n;

/* JADX INFO: loaded from: classes.dex */
final class OffsetElement extends u0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f1646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f1647c;

    public OffsetElement(float f10, float f11) {
        this.f1646b = f10;
        this.f1647c = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetElement offsetElement = obj instanceof OffsetElement ? (OffsetElement) obj : null;
        if (offsetElement == null) {
            return false;
        }
        return e.a(this.f1646b, offsetElement.f1646b) && e.a(this.f1647c, offsetElement.f1647c);
    }

    @Override // t1.u0
    public final int hashCode() {
        return Boolean.hashCode(true) + q.a(this.f1647c, Float.hashCode(this.f1646b) * 31, 31);
    }

    @Override // t1.u0
    public final n l() {
        p0 p0Var = new p0();
        p0Var.f16654u = this.f1646b;
        p0Var.f16655v = this.f1647c;
        p0Var.f16656w = true;
        return p0Var;
    }

    @Override // t1.u0
    public final void m(n nVar) {
        p0 p0Var = (p0) nVar;
        p0Var.f16654u = this.f1646b;
        p0Var.f16655v = this.f1647c;
        p0Var.f16656w = true;
    }

    public final String toString() {
        return "OffsetModifierElement(x=" + ((Object) e.b(this.f1646b)) + ", y=" + ((Object) e.b(this.f1647c)) + ", rtlAware=true)";
    }
}
