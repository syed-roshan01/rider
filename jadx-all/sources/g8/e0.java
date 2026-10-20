package g8;

/* JADX INFO: loaded from: classes.dex */
public final class e0 extends q0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e8.c2 f6736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e8.l1 f6737d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f0 f6738e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(f0 f0Var, e8.c2 c2Var, e8.l1 l1Var) {
        super(f0Var.f6758c.f6775f, 0);
        this.f6738e = f0Var;
        this.f6736c = c2Var;
        this.f6737d = l1Var;
    }

    @Override // g8.q0
    public final void b() {
        o8.b.d();
        try {
            o8.c cVar = this.f6738e.f6758c.f6771b;
            o8.b.a();
            o8.a aVar = o8.b.f12664a;
            aVar.getClass();
            c();
            aVar.getClass();
        } catch (Throwable th) {
            try {
                o8.b.f12664a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void c() {
        e8.c2 c2Var = this.f6736c;
        e8.l1 l1Var = this.f6737d;
        e8.c2 c2Var2 = this.f6738e.f6757b;
        if (c2Var2 != null) {
            l1Var = new e8.l1();
            c2Var = c2Var2;
        }
        this.f6738e.f6758c.f6780k = true;
        try {
            f0 f0Var = this.f6738e;
            g0 g0Var = f0Var.f6758c;
            e8.j jVar = f0Var.f6756a;
            g0Var.getClass();
            jVar.onClose(c2Var, l1Var);
        } finally {
            this.f6738e.f6758c.b();
            y yVar = this.f6738e.f6758c.f6774e;
            if (c2Var.e()) {
                yVar.f7242c.a();
            } else {
                yVar.f7243d.a();
            }
        }
    }
}
