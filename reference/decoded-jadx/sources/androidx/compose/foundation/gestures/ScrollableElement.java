package androidx.compose.foundation.gestures;

import l.q;
import t1.u0;
import u.b2;
import v.e2;
import v.f2;
import v.h1;
import v.l2;
import v.o;
import v.q0;
import v.s;
import v.u1;
import v.y0;
import x.m;
import y0.n;

/* JADX INFO: loaded from: classes.dex */
final class ScrollableElement extends u0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f2 f1624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h1 f1625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b2 f1626d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f1627e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f1628f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final y0 f1629g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m f1630h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final o f1631i;

    public ScrollableElement(f2 f2Var, h1 h1Var, b2 b2Var, boolean z10, boolean z11, y0 y0Var, m mVar, o oVar) {
        this.f1624b = f2Var;
        this.f1625c = h1Var;
        this.f1626d = b2Var;
        this.f1627e = z10;
        this.f1628f = z11;
        this.f1629g = y0Var;
        this.f1630h = mVar;
        this.f1631i = oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScrollableElement)) {
            return false;
        }
        ScrollableElement scrollableElement = (ScrollableElement) obj;
        return d7.a.d(this.f1624b, scrollableElement.f1624b) && this.f1625c == scrollableElement.f1625c && d7.a.d(this.f1626d, scrollableElement.f1626d) && this.f1627e == scrollableElement.f1627e && this.f1628f == scrollableElement.f1628f && d7.a.d(this.f1629g, scrollableElement.f1629g) && d7.a.d(this.f1630h, scrollableElement.f1630h) && d7.a.d(this.f1631i, scrollableElement.f1631i);
    }

    @Override // t1.u0
    public final int hashCode() {
        int iHashCode = (this.f1625c.hashCode() + (this.f1624b.hashCode() * 31)) * 31;
        b2 b2Var = this.f1626d;
        int iC = q.c(this.f1628f, q.c(this.f1627e, (iHashCode + (b2Var != null ? b2Var.hashCode() : 0)) * 31, 31), 31);
        y0 y0Var = this.f1629g;
        int iHashCode2 = (iC + (y0Var != null ? y0Var.hashCode() : 0)) * 31;
        m mVar = this.f1630h;
        return this.f1631i.hashCode() + ((iHashCode2 + (mVar != null ? mVar.hashCode() : 0)) * 31);
    }

    @Override // t1.u0
    public final n l() {
        return new e2(this.f1624b, this.f1625c, this.f1626d, this.f1627e, this.f1628f, this.f1629g, this.f1630h, this.f1631i);
    }

    @Override // t1.u0
    public final void m(n nVar) {
        e2 e2Var = (e2) nVar;
        h1 h1Var = this.f1625c;
        boolean z10 = this.f1627e;
        m mVar = this.f1630h;
        if (e2Var.f15532z != z10) {
            e2Var.G.f15488b = z10;
            e2Var.I.f15485u = z10;
        }
        y0 y0Var = this.f1629g;
        y0 y0Var2 = y0Var == null ? e2Var.E : y0Var;
        l2 l2Var = e2Var.F;
        f2 f2Var = this.f1624b;
        l2Var.f15669a = f2Var;
        l2Var.f15670b = h1Var;
        b2 b2Var = this.f1626d;
        l2Var.f15671c = b2Var;
        boolean z11 = this.f1628f;
        l2Var.f15672d = z11;
        l2Var.f15673e = y0Var2;
        l2Var.f15674f = e2Var.D;
        u1 u1Var = e2Var.J;
        u1Var.B.L0(u1Var.f15797y, q0.f15743b, h1Var, z10, mVar, u1Var.f15798z, a.f1632a, u1Var.A, false);
        s sVar = e2Var.H;
        sVar.f15765u = h1Var;
        sVar.f15766v = f2Var;
        sVar.f15767w = z11;
        sVar.f15768x = this.f1631i;
        e2Var.f15529w = f2Var;
        e2Var.f15530x = h1Var;
        e2Var.f15531y = b2Var;
        e2Var.f15532z = z10;
        e2Var.A = z11;
        e2Var.B = y0Var;
        e2Var.C = mVar;
    }
}
