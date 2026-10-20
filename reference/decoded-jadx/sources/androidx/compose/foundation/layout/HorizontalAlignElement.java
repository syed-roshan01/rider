package androidx.compose.foundation.layout;

import t1.u0;
import y.f0;
import y0.e;
import y0.n;

/* JADX INFO: loaded from: classes.dex */
public final class HorizontalAlignElement extends u0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0.b f1643b;

    public HorizontalAlignElement(e eVar) {
        this.f1643b = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        HorizontalAlignElement horizontalAlignElement = obj instanceof HorizontalAlignElement ? (HorizontalAlignElement) obj : null;
        if (horizontalAlignElement == null) {
            return false;
        }
        return d7.a.d(this.f1643b, horizontalAlignElement.f1643b);
    }

    @Override // t1.u0
    public final int hashCode() {
        return Float.hashCode(((e) this.f1643b).f16720a);
    }

    @Override // t1.u0
    public final n l() {
        f0 f0Var = new f0();
        f0Var.f16541u = this.f1643b;
        return f0Var;
    }

    @Override // t1.u0
    public final void m(n nVar) {
        ((f0) nVar).f16541u = this.f1643b;
    }
}
