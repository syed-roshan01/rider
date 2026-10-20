package g8;

/* JADX INFO: loaded from: classes.dex */
public abstract class o1 extends e8.j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e8.j0 f7014a;

    public o1(e8.j0 j0Var) {
        this.f7014a = j0Var;
    }

    @Override // e8.j0
    public String k() {
        return this.f7014a.k();
    }

    @Override // e8.j0
    public final void n() {
        this.f7014a.n();
    }

    @Override // e8.j0
    public void p() {
        this.f7014a.p();
    }

    @Override // e8.j0
    public void q(e8.i iVar) {
        this.f7014a.q(iVar);
    }

    public final String toString() {
        q6.g gVarJ0 = f6.a.j0(this);
        gVarJ0.a(this.f7014a, "delegate");
        return gVarJ0.toString();
    }
}
