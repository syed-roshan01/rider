package z;

import a0.r0;
import m0.x1;
import t.o0;

/* JADX INFO: loaded from: classes.dex */
public final class m implements a0.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f17091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f17092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f17093c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a0.u f17094d;

    public m(g0 g0Var, g gVar, c cVar, r0 r0Var) {
        this.f17091a = g0Var;
        this.f17092b = gVar;
        this.f17093c = cVar;
        this.f17094d = r0Var;
    }

    @Override // a0.s
    public final Object a(int i10) {
        Object objA = this.f17094d.a(i10);
        return objA == null ? this.f17092b.h0(i10) : objA;
    }

    @Override // a0.s
    public final int b(Object obj) {
        return this.f17094d.b(obj);
    }

    @Override // a0.s
    public final int c() {
        return this.f17092b.f0().f849b;
    }

    @Override // a0.s
    public final Object d(int i10) {
        a0.e eVarC = this.f17092b.f17043u.c(i10);
        return ((a0.o) eVarC.f784c).a().invoke(Integer.valueOf(i10 - eVarC.f782a));
    }

    @Override // a0.s
    public final void e(int i10, Object obj, m0.m mVar, int i11) {
        m0.q qVar = (m0.q) mVar;
        qVar.a0(-462424778);
        f6.a.g(obj, i10, this.f17091a.f17063s, d7.t.K(qVar, -824725566, new o0(this, i10, 1)), qVar, ((i11 << 3) & 112) | 3592);
        x1 x1VarX = qVar.x();
        if (x1VarX != null) {
            x1VarX.f11756d = new l(this, i10, obj, i11, 0);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        return d7.a.d(this.f17092b, ((m) obj).f17092b);
    }

    public final int hashCode() {
        return this.f17092b.hashCode();
    }
}
