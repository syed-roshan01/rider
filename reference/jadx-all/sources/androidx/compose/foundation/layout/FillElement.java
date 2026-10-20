package androidx.compose.foundation.layout;

import t.k;
import t1.u0;
import y.d0;
import y0.n;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public final class FillElement extends u0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f1642c;

    public FillElement(int i10, float f10) {
        this.f1641b = i10;
        this.f1642c = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FillElement)) {
            return false;
        }
        FillElement fillElement = (FillElement) obj;
        return this.f1641b == fillElement.f1641b && this.f1642c == fillElement.f1642c;
    }

    @Override // t1.u0
    public final int hashCode() {
        return Float.hashCode(this.f1642c) + (k.e(this.f1641b) * 31);
    }

    @Override // t1.u0
    public final n l() {
        d0 d0Var = new d0();
        d0Var.f16529u = this.f1641b;
        d0Var.f16530v = this.f1642c;
        return d0Var;
    }

    @Override // t1.u0
    public final void m(n nVar) {
        d0 d0Var = (d0) nVar;
        d0Var.f16529u = this.f1641b;
        d0Var.f16530v = this.f1642c;
    }
}
