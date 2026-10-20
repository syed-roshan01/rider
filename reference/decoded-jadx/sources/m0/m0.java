package m0;

/* JADX INFO: loaded from: classes.dex */
public final class m0 implements i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c9.c f11581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n0 f11582b;

    public m0(c9.c cVar) {
        this.f11581a = cVar;
    }

    @Override // m0.i2
    public final void a() {
        this.f11582b = (n0) this.f11581a.invoke(s.f11699g);
    }

    @Override // m0.i2
    public final void b() {
    }

    @Override // m0.i2
    public final void d() {
        n0 n0Var = this.f11582b;
        if (n0Var != null) {
            n0Var.a();
        }
        this.f11582b = null;
    }
}
