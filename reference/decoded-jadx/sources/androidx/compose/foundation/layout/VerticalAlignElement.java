package androidx.compose.foundation.layout;

import t1.u0;
import y.h1;
import y0.f;
import y0.n;

/* JADX INFO: loaded from: classes.dex */
public final class VerticalAlignElement extends u0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0.c f1661b = y0.a.f16714n;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        VerticalAlignElement verticalAlignElement = obj instanceof VerticalAlignElement ? (VerticalAlignElement) obj : null;
        if (verticalAlignElement == null) {
            return false;
        }
        return d7.a.d(this.f1661b, verticalAlignElement.f1661b);
    }

    @Override // t1.u0
    public final int hashCode() {
        return Float.hashCode(((f) this.f1661b).f16721a);
    }

    @Override // t1.u0
    public final n l() {
        h1 h1Var = new h1();
        h1Var.f16560u = this.f1661b;
        return h1Var;
    }

    @Override // t1.u0
    public final void m(n nVar) {
        ((h1) nVar).f16560u = this.f1661b;
    }
}
