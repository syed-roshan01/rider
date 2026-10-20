package androidx.compose.foundation.layout;

import t1.u0;
import y.m0;
import y0.n;

/* JADX INFO: loaded from: classes.dex */
public final class LayoutWeightElement extends u0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f1644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f1645c;

    public LayoutWeightElement(float f10, boolean z10) {
        this.f1644b = f10;
        this.f1645c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        LayoutWeightElement layoutWeightElement = obj instanceof LayoutWeightElement ? (LayoutWeightElement) obj : null;
        if (layoutWeightElement == null) {
            return false;
        }
        return this.f1644b == layoutWeightElement.f1644b && this.f1645c == layoutWeightElement.f1645c;
    }

    @Override // t1.u0
    public final int hashCode() {
        return Boolean.hashCode(this.f1645c) + (Float.hashCode(this.f1644b) * 31);
    }

    @Override // t1.u0
    public final n l() {
        m0 m0Var = new m0();
        m0Var.f16632u = this.f1644b;
        m0Var.f16633v = this.f1645c;
        return m0Var;
    }

    @Override // t1.u0
    public final void m(n nVar) {
        m0 m0Var = (m0) nVar;
        m0Var.f16632u = this.f1644b;
        m0Var.f16633v = this.f1645c;
    }
}
