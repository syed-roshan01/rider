package t;

import m0.l3;

/* JADX INFO: loaded from: classes.dex */
public final class m1 implements l3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q1 f14251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c9.c f14252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c9.c f14253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n1 f14254d;

    public m1(n1 n1Var, q1 q1Var, c9.c cVar, c9.c cVar2) {
        this.f14254d = n1Var;
        this.f14251a = q1Var;
        this.f14252b = cVar;
        this.f14253c = cVar2;
    }

    public final void b(o1 o1Var) {
        Object objInvoke = this.f14253c.invoke(o1Var.c());
        boolean zD = this.f14254d.f14262c.d();
        q1 q1Var = this.f14251a;
        if (zD) {
            q1Var.e(this.f14253c.invoke(o1Var.a()), objInvoke, (e0) this.f14252b.invoke(o1Var));
        } else {
            q1Var.f(objInvoke, (e0) this.f14252b.invoke(o1Var));
        }
    }

    @Override // m0.l3
    public final Object getValue() {
        b(this.f14254d.f14262c.c());
        return this.f14251a.f14293o.getValue();
    }
}
