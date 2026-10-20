package androidx.compose.ui.semantics;

import c9.c;
import d7.a;
import t1.u0;
import y0.n;
import y1.j;
import y1.k;

/* JADX INFO: loaded from: classes.dex */
public final class AppendedSemanticsElement extends u0 implements k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f1758c;

    public AppendedSemanticsElement(c cVar, boolean z10) {
        this.f1757b = z10;
        this.f1758c = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppendedSemanticsElement)) {
            return false;
        }
        AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) obj;
        return this.f1757b == appendedSemanticsElement.f1757b && a.d(this.f1758c, appendedSemanticsElement.f1758c);
    }

    @Override // t1.u0
    public final int hashCode() {
        return this.f1758c.hashCode() + (Boolean.hashCode(this.f1757b) * 31);
    }

    @Override // y1.k
    public final j k() {
        j jVar = new j();
        jVar.f16787b = this.f1757b;
        this.f1758c.invoke(jVar);
        return jVar;
    }

    @Override // t1.u0
    public final n l() {
        return new y1.c(this.f1757b, false, this.f1758c);
    }

    @Override // t1.u0
    public final void m(n nVar) {
        y1.c cVar = (y1.c) nVar;
        cVar.f16749u = this.f1757b;
        cVar.f16751w = this.f1758c;
    }

    public final String toString() {
        return "AppendedSemanticsElement(mergeDescendants=" + this.f1757b + ", properties=" + this.f1758c + ')';
    }
}
