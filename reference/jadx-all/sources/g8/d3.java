package g8;

/* JADX INFO: loaded from: classes.dex */
public final class d3 extends e8.i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c3 f6725d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e8.j0 f6726e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l3 f6727f;

    public d3(l3 l3Var, c3 c3Var, e8.j0 j0Var) {
        this.f6727f = l3Var;
        this.f6725d = c3Var;
        y3.e.J(j0Var, "resolver");
        this.f6726e = j0Var;
    }

    @Override // e8.i
    public final void d(e8.c2 c2Var) {
        y3.e.G("the error status must not be OK", !c2Var.e());
        this.f6727f.f6939m.execute(new x1(20, this, c2Var));
    }

    @Override // e8.i
    public final void e(e8.s1 s1Var) {
        this.f6727f.f6939m.execute(new x1(21, this, s1Var));
    }
}
