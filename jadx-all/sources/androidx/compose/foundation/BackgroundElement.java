package androidx.compose.foundation;

import e1.j0;
import e1.l0;
import e1.n;
import e1.r;
import l.q;
import t1.u0;
import u.p;

/* JADX INFO: loaded from: classes.dex */
final class BackgroundElement extends u0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f1596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f1597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f1598d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l0 f1599e;

    public BackgroundElement(long j10, j0 j0Var, float f10, l0 l0Var, int i10) {
        j10 = (i10 & 1) != 0 ? r.f5065g : j10;
        j0Var = (i10 & 2) != 0 ? null : j0Var;
        this.f1596b = j10;
        this.f1597c = j0Var;
        this.f1598d = f10;
        this.f1599e = l0Var;
    }

    public final boolean equals(Object obj) {
        BackgroundElement backgroundElement = obj instanceof BackgroundElement ? (BackgroundElement) obj : null;
        return backgroundElement != null && r.c(this.f1596b, backgroundElement.f1596b) && d7.a.d(this.f1597c, backgroundElement.f1597c) && this.f1598d == backgroundElement.f1598d && d7.a.d(this.f1599e, backgroundElement.f1599e);
    }

    @Override // t1.u0
    public final int hashCode() {
        int i10 = r.f5066h;
        int iHashCode = Long.hashCode(this.f1596b) * 31;
        n nVar = this.f1597c;
        return this.f1599e.hashCode() + q.a(this.f1598d, (iHashCode + (nVar != null ? nVar.hashCode() : 0)) * 31, 31);
    }

    @Override // t1.u0
    public final y0.n l() {
        p pVar = new p();
        pVar.f14873u = this.f1596b;
        pVar.f14874v = this.f1597c;
        pVar.f14875w = this.f1598d;
        pVar.f14876x = this.f1599e;
        return pVar;
    }

    @Override // t1.u0
    public final void m(y0.n nVar) {
        p pVar = (p) nVar;
        pVar.f14873u = this.f1596b;
        pVar.f14874v = this.f1597c;
        pVar.f14875w = this.f1598d;
        pVar.f14876x = this.f1599e;
    }
}
