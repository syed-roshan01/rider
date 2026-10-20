package t;

import m0.o3;

/* JADX INFO: loaded from: classes.dex */
public final class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x1 f14260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m0.n1 f14261b = d7.t.g0(null, o3.f11621a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u1 f14262c;

    public n1(u1 u1Var, x1 x1Var, String str) {
        this.f14262c = u1Var;
        this.f14260a = x1Var;
    }

    public final m1 a(c9.c cVar, c9.c cVar2) {
        m0.n1 n1Var = this.f14261b;
        m1 m1Var = (m1) n1Var.getValue();
        u1 u1Var = this.f14262c;
        if (m1Var == null) {
            Object objInvoke = cVar2.invoke(u1Var.b());
            Object objInvoke2 = cVar2.invoke(u1Var.b());
            x1 x1Var = this.f14260a;
            t tVar = (t) x1Var.f14351a.invoke(objInvoke2);
            tVar.d();
            q1 q1Var = new q1(u1Var, objInvoke, tVar, x1Var);
            m1Var = new m1(this, q1Var, cVar, cVar2);
            n1Var.setValue(m1Var);
            u1Var.f14326h.add(q1Var);
        }
        m1Var.f14253c = cVar2;
        m1Var.f14252b = cVar;
        m1Var.b(u1Var.c());
        return m1Var;
    }
}
