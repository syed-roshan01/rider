package androidx.compose.foundation;

import l.q;
import t1.u0;
import u.c0;
import u.e0;
import u.g0;
import x.m;
import y0.n;
import y1.g;

/* JADX INFO: loaded from: classes.dex */
final class ClickableElement extends u0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f1603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f1604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f1605d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f1606e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c9.a f1607f;

    public ClickableElement(m mVar, boolean z10, String str, g gVar, c9.a aVar) {
        this.f1603b = mVar;
        this.f1604c = z10;
        this.f1605d = str;
        this.f1606e = gVar;
        this.f1607f = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ClickableElement.class != obj.getClass()) {
            return false;
        }
        ClickableElement clickableElement = (ClickableElement) obj;
        return d7.a.d(this.f1603b, clickableElement.f1603b) && this.f1604c == clickableElement.f1604c && d7.a.d(this.f1605d, clickableElement.f1605d) && d7.a.d(this.f1606e, clickableElement.f1606e) && d7.a.d(this.f1607f, clickableElement.f1607f);
    }

    @Override // t1.u0
    public final int hashCode() {
        int iC = q.c(this.f1604c, this.f1603b.hashCode() * 31, 31);
        String str = this.f1605d;
        int iHashCode = (iC + (str != null ? str.hashCode() : 0)) * 31;
        g gVar = this.f1606e;
        return this.f1607f.hashCode() + ((iHashCode + (gVar != null ? Integer.hashCode(gVar.f16757a) : 0)) * 31);
    }

    @Override // t1.u0
    public final n l() {
        return new c0(this.f1603b, this.f1604c, this.f1605d, this.f1606e, this.f1607f);
    }

    @Override // t1.u0
    public final void m(n nVar) {
        c0 c0Var = (c0) nVar;
        m mVar = c0Var.f14742w;
        m mVar2 = this.f1603b;
        if (!d7.a.d(mVar, mVar2)) {
            c0Var.H0();
            c0Var.f14742w = mVar2;
        }
        boolean z10 = c0Var.f14743x;
        boolean z11 = this.f1604c;
        if (z10 != z11) {
            if (!z11) {
                c0Var.H0();
            }
            c0Var.f14743x = z11;
        }
        c9.a aVar = this.f1607f;
        c0Var.f14744y = aVar;
        g0 g0Var = c0Var.A;
        g0Var.f14776u = z11;
        g0Var.f14777v = this.f1605d;
        g0Var.f14778w = this.f1606e;
        g0Var.f14779x = aVar;
        g0Var.f14780y = null;
        g0Var.f14781z = null;
        e0 e0Var = c0Var.B;
        e0Var.f14757w = z11;
        e0Var.f14759y = aVar;
        e0Var.f14758x = mVar2;
    }
}
