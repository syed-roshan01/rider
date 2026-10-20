package g8;

/* JADX INFO: loaded from: classes.dex */
public final class f0 implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e8.j f6756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e8.c2 f6757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g0 f6758c;

    public f0(g0 g0Var, e8.j jVar) {
        this.f6758c = g0Var;
        y3.e.J(jVar, "observer");
        this.f6756a = jVar;
    }

    @Override // g8.b6
    public final void a(a6 a6Var) {
        g0 g0Var = this.f6758c;
        o8.b.d();
        try {
            o8.c cVar = g0Var.f6771b;
            o8.b.a();
            o8.b.c();
            g0Var.f6772c.execute(new d0(this, a6Var));
            o8.b.f12664a.getClass();
        } catch (Throwable th) {
            try {
                o8.b.f12664a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // g8.b6
    public final void b() {
        g0 g0Var = this.f6758c;
        e8.o1 o1Var = g0Var.f6770a.f5333a;
        o1Var.getClass();
        if (o1Var == e8.o1.f5328a || o1Var == e8.o1.f5329b) {
            return;
        }
        o8.b.d();
        try {
            o8.b.a();
            o8.b.c();
            g0Var.f6772c.execute(new c0(this));
            o8.b.f12664a.getClass();
        } catch (Throwable th) {
            try {
                o8.b.f12664a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // g8.j0
    public final void c(e8.c2 c2Var, i0 i0Var, e8.l1 l1Var) {
        o8.b.d();
        try {
            o8.c cVar = this.f6758c.f6771b;
            o8.b.a();
            e(c2Var, l1Var);
            o8.b.f12664a.getClass();
        } catch (Throwable th) {
            try {
                o8.b.f12664a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // g8.j0
    public final void d(e8.l1 l1Var) {
        g0 g0Var = this.f6758c;
        o8.b.d();
        try {
            o8.c cVar = g0Var.f6771b;
            o8.b.a();
            o8.b.c();
            g0Var.f6772c.execute(new d0(this, l1Var));
            o8.b.f12664a.getClass();
        } catch (Throwable th) {
            try {
                o8.b.f12664a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void e(e8.c2 c2Var, e8.l1 l1Var) {
        g0 g0Var = this.f6758c;
        e8.c0 c0Var = g0Var.f6778i.f5267a;
        g0Var.f6775f.getClass();
        if (c0Var == null) {
            c0Var = null;
        }
        if (c2Var.f5227a == e8.z1.CANCELLED && c0Var != null && c0Var.b()) {
            u uVar = new u();
            g0Var.f6779j.f(uVar);
            c2Var = e8.c2.f5219h.a("ClientCall was cancelled at or after deadline. " + uVar);
            l1Var = new e8.l1();
        }
        o8.b.c();
        g0Var.f6772c.execute(new e0(this, c2Var, l1Var));
    }
}
