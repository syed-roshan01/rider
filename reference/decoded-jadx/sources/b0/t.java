package b0;

import a0.r0;
import m0.x1;

/* JADX INFO: loaded from: classes.dex */
public final class t implements a0.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f2465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h6.g f2466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0.u f2467c;

    public t(h0 h0Var, r rVar, r0 r0Var) {
        this.f2465a = h0Var;
        this.f2466b = rVar;
        this.f2467c = r0Var;
    }

    @Override // a0.s
    public final Object a(int i10) {
        Object objA = this.f2467c.a(i10);
        return objA == null ? this.f2466b.h0(i10) : objA;
    }

    @Override // a0.s
    public final int b(Object obj) {
        return this.f2467c.b(obj);
    }

    @Override // a0.s
    public final int c() {
        return this.f2466b.f0().f849b;
    }

    @Override // a0.s
    public final void e(int i10, Object obj, m0.m mVar, int i11) {
        m0.q qVar = (m0.q) mVar;
        qVar.a0(-1201380429);
        f6.a.g(obj, i10, this.f2465a.A, d7.t.K(qVar, 1142237095, new t.o0(this, i10, 2)), qVar, ((i11 << 3) & 112) | 3592);
        x1 x1VarX = qVar.x();
        if (x1VarX != null) {
            x1VarX.f11756d = new z.l(this, i10, obj, i11, 1);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        return d7.a.d(this.f2466b, ((t) obj).f2466b);
    }

    public final int hashCode() {
        return this.f2466b.hashCode();
    }
}
