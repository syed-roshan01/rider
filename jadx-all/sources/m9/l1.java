package m9;

/* JADX INFO: loaded from: classes.dex */
public final class l1 extends j1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p1 f11964e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m1 f11965f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p f11966n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f11967o;

    public l1(p1 p1Var, m1 m1Var, p pVar, Object obj) {
        this.f11964e = p1Var;
        this.f11965f = m1Var;
        this.f11966n = pVar;
        this.f11967o = obj;
    }

    @Override // c9.c
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        n((Throwable) obj);
        return q8.l.f13235a;
    }

    @Override // m9.j1
    public final void n(Throwable th) {
        p1 p1Var = this.f11964e;
        p1Var.getClass();
        p pVarA0 = p1.a0(this.f11966n);
        m1 m1Var = this.f11965f;
        Object obj = this.f11967o;
        if (pVarA0 != null) {
            while (z6.a.N(pVarA0.f11986e, false, new l1(p1Var, m1Var, pVarA0, obj), 1) == u1.f12007a) {
                pVarA0 = p1.a0(pVarA0);
                if (pVarA0 == null) {
                }
            }
            return;
        }
        p1Var.t(p1Var.G(m1Var, obj));
    }
}
