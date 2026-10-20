package u;

import m0.l3;

/* JADX INFO: loaded from: classes.dex */
public final class j0 implements j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l3 f14822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l3 f14823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l3 f14824c;

    public j0(m0.g1 g1Var, m0.g1 g1Var2, m0.g1 g1Var3) {
        this.f14822a = g1Var;
        this.f14823b = g1Var2;
        this.f14824c = g1Var3;
    }

    @Override // u.j1
    public final void c(g1.e eVar) {
        t1.i0 i0Var = (t1.i0) eVar;
        i0Var.a();
        boolean zBooleanValue = ((Boolean) this.f14822a.getValue()).booleanValue();
        g1.c cVar = i0Var.f14447a;
        if (zBooleanValue) {
            g1.g.U(i0Var, e1.r.b(e1.r.f5060b, 0.3f), 0L, cVar.e(), 122);
        } else if (((Boolean) this.f14823b.getValue()).booleanValue() || ((Boolean) this.f14824c.getValue()).booleanValue()) {
            g1.g.U(i0Var, e1.r.b(e1.r.f5060b, 0.1f), 0L, cVar.e(), 122);
        }
    }
}
