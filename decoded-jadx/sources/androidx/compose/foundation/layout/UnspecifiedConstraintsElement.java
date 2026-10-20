package androidx.compose.foundation.layout;

import m2.e;
import t1.u0;
import y.f1;
import y0.n;

/* JADX INFO: loaded from: classes.dex */
final class UnspecifiedConstraintsElement extends u0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f1659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f1660c;

    public UnspecifiedConstraintsElement(float f10, float f11) {
        this.f1659b = f10;
        this.f1660c = f11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UnspecifiedConstraintsElement)) {
            return false;
        }
        UnspecifiedConstraintsElement unspecifiedConstraintsElement = (UnspecifiedConstraintsElement) obj;
        return e.a(this.f1659b, unspecifiedConstraintsElement.f1659b) && e.a(this.f1660c, unspecifiedConstraintsElement.f1660c);
    }

    @Override // t1.u0
    public final int hashCode() {
        return Float.hashCode(this.f1660c) + (Float.hashCode(this.f1659b) * 31);
    }

    @Override // t1.u0
    public final n l() {
        f1 f1Var = new f1();
        f1Var.f16542u = this.f1659b;
        f1Var.f16543v = this.f1660c;
        return f1Var;
    }

    @Override // t1.u0
    public final void m(n nVar) {
        f1 f1Var = (f1) nVar;
        f1Var.f16542u = this.f1659b;
        f1Var.f16543v = this.f1660c;
    }
}
