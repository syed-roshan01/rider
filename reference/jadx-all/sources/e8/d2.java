package e8;

/* JADX INFO: loaded from: classes.dex */
public final class d2 extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c2 f5232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f5233b;

    public d2(c2 c2Var) {
        super(c2.b(c2Var), c2Var.f5229c);
        this.f5232a = c2Var;
        this.f5233b = true;
        fillInStackTrace();
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this.f5233b ? super.fillInStackTrace() : this;
    }
}
