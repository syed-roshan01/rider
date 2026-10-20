package androidx.compose.foundation.layout;

import c9.e;
import l.q;
import s.i;
import t.k;
import t1.u0;
import y.n1;
import y0.n;

/* JADX INFO: loaded from: classes.dex */
final class WrapContentElement extends u0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f1663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f1664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f1665e;

    public WrapContentElement(int i10, boolean z10, i iVar, Object obj) {
        this.f1662b = i10;
        this.f1663c = z10;
        this.f1664d = iVar;
        this.f1665e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WrapContentElement.class != obj.getClass()) {
            return false;
        }
        WrapContentElement wrapContentElement = (WrapContentElement) obj;
        return this.f1662b == wrapContentElement.f1662b && this.f1663c == wrapContentElement.f1663c && d7.a.d(this.f1665e, wrapContentElement.f1665e);
    }

    @Override // t1.u0
    public final int hashCode() {
        return this.f1665e.hashCode() + q.c(this.f1663c, k.e(this.f1662b) * 31, 31);
    }

    @Override // t1.u0
    public final n l() {
        n1 n1Var = new n1();
        n1Var.f16645u = this.f1662b;
        n1Var.f16646v = this.f1663c;
        n1Var.f16647w = this.f1664d;
        return n1Var;
    }

    @Override // t1.u0
    public final void m(n nVar) {
        n1 n1Var = (n1) nVar;
        n1Var.f16645u = this.f1662b;
        n1Var.f16646v = this.f1663c;
        n1Var.f16647w = this.f1664d;
    }
}
