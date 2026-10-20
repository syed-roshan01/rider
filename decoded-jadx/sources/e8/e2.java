package e8;

/* JADX INFO: loaded from: classes.dex */
public final class e2 extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c2 f5238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f5239b;

    public e2(c2 c2Var) {
        super(c2.b(c2Var), c2Var.f5229c);
        this.f5238a = c2Var;
        this.f5239b = true;
        fillInStackTrace();
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this.f5239b ? super.fillInStackTrace() : this;
    }
}
