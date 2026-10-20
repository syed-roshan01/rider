package g8;

/* JADX INFO: loaded from: classes.dex */
public final class c4 extends e8.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k0 f6690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e8.p1 f6691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e8.l1 f6692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e8.h f6693d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u f6695f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e8.p[] f6696g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public h0 f6698i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f6699j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public d1 f6700k;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f6697h = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e8.b0 f6694e = e8.b0.b();

    public c4(o0 o0Var, e8.p1 p1Var, e8.l1 l1Var, e8.h hVar, u uVar, e8.p[] pVarArr) {
        this.f6690a = o0Var;
        this.f6691b = p1Var;
        this.f6692c = l1Var;
        this.f6693d = hVar;
        this.f6695f = uVar;
        this.f6696g = pVarArr;
    }

    @Override // e8.d
    public final void a(e8.l1 l1Var) {
        y3.e.N("apply() or fail() already called", !this.f6699j);
        e8.l1 l1Var2 = this.f6692c;
        l1Var2.d(l1Var);
        e8.b0 b0Var = this.f6694e;
        e8.b0 b0VarA = b0Var.a();
        try {
            h0 h0VarD = this.f6690a.d(this.f6691b, l1Var2, this.f6693d, this.f6696g);
            b0Var.c(b0VarA);
            c(h0VarD);
        } catch (Throwable th) {
            b0Var.c(b0VarA);
            throw th;
        }
    }

    @Override // e8.d
    public final void b(e8.c2 c2Var) {
        y3.e.G("Cannot fail with OK status", !c2Var.e());
        y3.e.N("apply() or fail() already called", !this.f6699j);
        c(new j1(s1.h(c2Var), i0.f6839a, this.f6696g));
    }

    public final void c(h0 h0Var) {
        boolean z10;
        y3.e.N("already finalized", !this.f6699j);
        this.f6699j = true;
        synchronized (this.f6697h) {
            try {
                if (this.f6698i == null) {
                    this.f6698i = h0Var;
                    z10 = true;
                } else {
                    z10 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z10) {
            this.f6695f.d();
            return;
        }
        y3.e.N("delayedStream is null", this.f6700k != null);
        a1 a1VarU = this.f6700k.u(h0Var);
        if (a1VarU != null) {
            a1VarU.run();
        }
        this.f6695f.d();
    }
}
