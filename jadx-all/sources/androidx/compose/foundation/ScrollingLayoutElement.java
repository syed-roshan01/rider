package androidx.compose.foundation;

import l.q;
import t1.u0;
import u.p2;
import u.r2;
import y0.n;

/* JADX INFO: loaded from: classes.dex */
public final class ScrollingLayoutElement extends u0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p2 f1620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f1621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f1622d;

    public ScrollingLayoutElement(p2 p2Var, boolean z10, boolean z11) {
        this.f1620b = p2Var;
        this.f1621c = z10;
        this.f1622d = z11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ScrollingLayoutElement)) {
            return false;
        }
        ScrollingLayoutElement scrollingLayoutElement = (ScrollingLayoutElement) obj;
        return d7.a.d(this.f1620b, scrollingLayoutElement.f1620b) && this.f1621c == scrollingLayoutElement.f1621c && this.f1622d == scrollingLayoutElement.f1622d;
    }

    @Override // t1.u0
    public final int hashCode() {
        return Boolean.hashCode(this.f1622d) + q.c(this.f1621c, this.f1620b.hashCode() * 31, 31);
    }

    @Override // t1.u0
    public final n l() {
        r2 r2Var = new r2();
        r2Var.f14920u = this.f1620b;
        r2Var.f14921v = this.f1621c;
        r2Var.f14922w = this.f1622d;
        return r2Var;
    }

    @Override // t1.u0
    public final void m(n nVar) {
        r2 r2Var = (r2) nVar;
        r2Var.f14920u = this.f1620b;
        r2Var.f14921v = this.f1621c;
        r2Var.f14922w = this.f1622d;
    }
}
