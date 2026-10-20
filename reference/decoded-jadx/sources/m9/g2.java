package m9;

/* JADX INFO: loaded from: classes.dex */
public final class g2 extends r9.s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ThreadLocal f11948e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public g2(u8.e eVar, u8.j jVar) {
        h2 h2Var = h2.f11950a;
        super(eVar, jVar.f(h2Var) == null ? jVar.O(h2Var) : jVar);
        this.f11948e = new ThreadLocal();
        if (eVar.getContext().f(u8.f.f15436a) instanceof z) {
            return;
        }
        Object objT = r9.a.t(jVar, null);
        r9.a.k(jVar, objT);
        m0(jVar, objT);
    }

    public final boolean l0() {
        boolean z10 = this.threadLocalIsSet && this.f11948e.get() == null;
        this.f11948e.remove();
        return !z10;
    }

    public final void m0(u8.j jVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f11948e.set(new q8.f(jVar, obj));
    }

    @Override // r9.s, m9.p1
    public final void v(Object obj) {
        if (this.threadLocalIsSet) {
            q8.f fVar = (q8.f) this.f11948e.get();
            if (fVar != null) {
                r9.a.k((u8.j) fVar.f13225a, fVar.f13226b);
            }
            this.f11948e.remove();
        }
        Object objL0 = d7.t.l0(obj);
        u8.e eVar = this.f13726d;
        u8.j context = eVar.getContext();
        Object objT = r9.a.t(context, null);
        g2 g2VarT0 = objT != r9.a.f13693f ? z6.a.t0(eVar, context, objT) : null;
        try {
            this.f13726d.resumeWith(objL0);
        } finally {
            if (g2VarT0 == null || g2VarT0.l0()) {
                r9.a.k(context, objT);
            }
        }
    }
}
