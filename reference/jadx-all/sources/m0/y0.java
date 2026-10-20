package m0;

/* JADX INFO: loaded from: classes.dex */
public final class y0 implements i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c9.e f11762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r9.e f11763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m9.x1 f11764c;

    public y0(u8.j jVar, c9.e eVar) {
        this.f11762a = eVar;
        this.f11763b = d7.a.b(jVar);
    }

    @Override // m0.i2
    public final void a() {
        m9.x1 x1Var = this.f11764c;
        if (x1Var != null) {
            x1Var.a(d7.a.a("Old job was still running!", null));
        }
        this.f11764c = z6.a.Q(this.f11763b, null, 0, this.f11762a, 3);
    }

    @Override // m0.i2
    public final void b() {
        m9.x1 x1Var = this.f11764c;
        if (x1Var != null) {
            x1Var.a(new t.y0(2));
        }
        this.f11764c = null;
    }

    @Override // m0.i2
    public final void d() {
        m9.x1 x1Var = this.f11764c;
        if (x1Var != null) {
            x1Var.a(new t.y0(2));
        }
        this.f11764c = null;
    }
}
