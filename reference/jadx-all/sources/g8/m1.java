package g8;

/* JADX INFO: loaded from: classes.dex */
public abstract class m1 implements o0 {
    @Override // g8.k0
    public final void a(o2 o2Var) {
        g().a(o2Var);
    }

    @Override // e8.p0
    public final e8.q0 b() {
        return g().b();
    }

    @Override // g8.u3
    public void c(e8.c2 c2Var) {
        g().c(c2Var);
    }

    @Override // g8.u3
    public final Runnable e(t3 t3Var) {
        return g().e(t3Var);
    }

    @Override // g8.u3
    public void f(e8.c2 c2Var) {
        g().f(c2Var);
    }

    public abstract o0 g();

    public final String toString() {
        q6.g gVarJ0 = f6.a.j0(this);
        gVarJ0.a(g(), "delegate");
        return gVarJ0.toString();
    }
}
