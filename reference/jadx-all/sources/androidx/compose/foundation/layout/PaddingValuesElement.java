package androidx.compose.foundation.layout;

import t1.u0;
import y.t0;
import y.v0;
import y0.n;

/* JADX INFO: loaded from: classes.dex */
final class PaddingValuesElement extends u0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t0 f1653b;

    public PaddingValuesElement(t0 t0Var) {
        this.f1653b = t0Var;
    }

    public final boolean equals(Object obj) {
        PaddingValuesElement paddingValuesElement = obj instanceof PaddingValuesElement ? (PaddingValuesElement) obj : null;
        if (paddingValuesElement == null) {
            return false;
        }
        return d7.a.d(this.f1653b, paddingValuesElement.f1653b);
    }

    @Override // t1.u0
    public final int hashCode() {
        return this.f1653b.hashCode();
    }

    @Override // t1.u0
    public final n l() {
        v0 v0Var = new v0();
        v0Var.f16686u = this.f1653b;
        return v0Var;
    }

    @Override // t1.u0
    public final void m(n nVar) {
        ((v0) nVar).f16686u = this.f1653b;
    }
}
