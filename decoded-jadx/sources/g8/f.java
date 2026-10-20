package g8;

/* JADX INFO: loaded from: classes.dex */
public abstract class f implements j, v3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r0 f6749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6750b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e6 f6751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x3 f6752d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6753e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f6754f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f6755g;

    public f(int i10, y5 y5Var, e6 e6Var) {
        y3.e.J(e6Var, "transportTracer");
        this.f6751c = e6Var;
        x3 x3Var = new x3(this, i10, y5Var, e6Var);
        this.f6752d = x3Var;
        this.f6749a = x3Var;
    }

    @Override // g8.v3
    public final void a(a6 a6Var) {
        ((a) this).f6632j.a(a6Var);
    }

    public final boolean e() {
        boolean z10;
        synchronized (this.f6750b) {
            try {
                z10 = this.f6754f && this.f6753e < 32768 && !this.f6755g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z10;
    }
}
