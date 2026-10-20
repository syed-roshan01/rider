package androidx.compose.ui.semantics;

import c9.c;
import d7.a;
import k0.t;
import t1.u0;
import y0.n;
import y1.j;
import y1.k;

/* JADX INFO: loaded from: classes.dex */
public final class ClearAndSetSemanticsElement extends u0 implements k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f1759b = t.f9463b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ClearAndSetSemanticsElement) && a.d(this.f1759b, ((ClearAndSetSemanticsElement) obj).f1759b);
    }

    @Override // t1.u0
    public final int hashCode() {
        return this.f1759b.hashCode();
    }

    @Override // y1.k
    public final j k() {
        j jVar = new j();
        jVar.f16787b = false;
        jVar.f16788c = true;
        this.f1759b.invoke(jVar);
        return jVar;
    }

    @Override // t1.u0
    public final n l() {
        return new y1.c(false, true, this.f1759b);
    }

    @Override // t1.u0
    public final void m(n nVar) {
        ((y1.c) nVar).f16751w = this.f1759b;
    }

    public final String toString() {
        return "ClearAndSetSemanticsElement(properties=" + this.f1759b + ')';
    }
}
