package g8;

/* JADX INFO: loaded from: classes.dex */
public final class h2 implements t3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0 f6824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f6825b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j2 f6826c;

    public h2(j2 j2Var, f2 f2Var) {
        this.f6826c = j2Var;
        this.f6824a = f2Var;
    }

    @Override // g8.t3
    public final void a() {
        y3.e.N("transportShutdown() must be called before transportTerminated().", this.f6825b);
        j2 j2Var = this.f6826c;
        e8.i iVar = j2Var.f6874j;
        o0 o0Var = this.f6824a;
        iVar.b(2, "{0} Terminated", o0Var.b());
        c2 c2Var = new c2(j2Var, o0Var, false);
        e8.h2 h2Var = j2Var.f6875k;
        h2Var.execute(c2Var);
        h2Var.execute(new g2(this, 1));
    }

    @Override // g8.t3
    public final void b(boolean z10) {
        j2 j2Var = this.f6826c;
        j2Var.getClass();
        j2Var.f6875k.execute(new c2(j2Var, this.f6824a, z10));
    }

    @Override // g8.t3
    public final void c() {
        j2 j2Var = this.f6826c;
        j2Var.f6874j.a(2, "READY");
        j2Var.f6875k.execute(new g2(this, 0));
    }

    @Override // g8.t3
    public final void d(e8.c2 c2Var) {
        j2 j2Var = this.f6826c;
        j2Var.f6874j.b(2, "{0} SHUTDOWN with {1}", this.f6824a.b(), j2.j(c2Var));
        this.f6825b = true;
        j2Var.f6875k.execute(new x1(19, this, c2Var));
    }
}
