package y;

import b3.u1;
import m0.o3;

/* JADX INFO: loaded from: classes.dex */
public final class c implements i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m0.n1 f16521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m0.n1 f16522d;

    public c(int i10, String str) {
        this.f16519a = i10;
        this.f16520b = str;
        u2.c cVar = u2.c.f15394e;
        o3 o3Var = o3.f11621a;
        this.f16521c = d7.t.g0(cVar, o3Var);
        this.f16522d = d7.t.g0(Boolean.TRUE, o3Var);
    }

    @Override // y.i1
    public final int a(m2.b bVar, m2.l lVar) {
        return e().f15395a;
    }

    @Override // y.i1
    public final int b(m2.b bVar) {
        return e().f15398d;
    }

    @Override // y.i1
    public final int c(m2.b bVar, m2.l lVar) {
        return e().f15397c;
    }

    @Override // y.i1
    public final int d(m2.b bVar) {
        return e().f15396b;
    }

    public final u2.c e() {
        return (u2.c) this.f16521c.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return this.f16519a == ((c) obj).f16519a;
        }
        return false;
    }

    public final void f(u1 u1Var, int i10) {
        int i11 = this.f16519a;
        if (i10 == 0 || (i10 & i11) != 0) {
            this.f16521c.setValue(u1Var.f2683a.f(i11));
            this.f16522d.setValue(Boolean.valueOf(u1Var.f2683a.p(i11)));
        }
    }

    public final int hashCode() {
        return this.f16519a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f16520b);
        sb.append('(');
        sb.append(e().f15395a);
        sb.append(", ");
        sb.append(e().f15396b);
        sb.append(", ");
        sb.append(e().f15397c);
        sb.append(", ");
        return a7.a.o(sb, e().f15398d, ')');
    }
}
