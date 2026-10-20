package g8;

/* JADX INFO: loaded from: classes.dex */
public final class z0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d1 f7298c;

    public /* synthetic */ z0(d1 d1Var, int i10, int i11) {
        this.f7296a = i11;
        this.f7298c = d1Var;
        this.f7297b = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f7296a;
        int i11 = this.f7297b;
        d1 d1Var = this.f7298c;
        switch (i10) {
            case 0:
                d1Var.f6716c.a(i11);
                break;
            case 1:
                d1Var.f6716c.b(i11);
                break;
            default:
                d1Var.f6716c.e(i11);
                break;
        }
    }
}
