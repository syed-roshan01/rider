package androidx.compose.foundation.layout;

import l.q;
import m2.e;
import t1.u0;
import y.s0;
import y0.n;

/* JADX INFO: loaded from: classes.dex */
final class PaddingElement extends u0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f1649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f1650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f1651d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f1652e;

    public PaddingElement(float f10, float f11, float f12, float f13) {
        this.f1649b = f10;
        this.f1650c = f11;
        this.f1651d = f12;
        this.f1652e = f13;
        if ((f10 < 0.0f && !e.a(f10, Float.NaN)) || ((f11 < 0.0f && !e.a(f11, Float.NaN)) || ((f12 < 0.0f && !e.a(f12, Float.NaN)) || (f13 < 0.0f && !e.a(f13, Float.NaN))))) {
            throw new IllegalArgumentException("Padding must be non-negative".toString());
        }
    }

    public final boolean equals(Object obj) {
        PaddingElement paddingElement = obj instanceof PaddingElement ? (PaddingElement) obj : null;
        return paddingElement != null && e.a(this.f1649b, paddingElement.f1649b) && e.a(this.f1650c, paddingElement.f1650c) && e.a(this.f1651d, paddingElement.f1651d) && e.a(this.f1652e, paddingElement.f1652e);
    }

    @Override // t1.u0
    public final int hashCode() {
        return Boolean.hashCode(true) + q.a(this.f1652e, q.a(this.f1651d, q.a(this.f1650c, Float.hashCode(this.f1649b) * 31, 31), 31), 31);
    }

    @Override // t1.u0
    public final n l() {
        s0 s0Var = new s0();
        s0Var.f16676u = this.f1649b;
        s0Var.f16677v = this.f1650c;
        s0Var.f16678w = this.f1651d;
        s0Var.f16679x = this.f1652e;
        s0Var.f16680y = true;
        return s0Var;
    }

    @Override // t1.u0
    public final void m(n nVar) {
        s0 s0Var = (s0) nVar;
        s0Var.f16676u = this.f1649b;
        s0Var.f16677v = this.f1650c;
        s0Var.f16678w = this.f1651d;
        s0Var.f16679x = this.f1652e;
        s0Var.f16680y = true;
    }
}
