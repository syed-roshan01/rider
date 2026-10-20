package g8;

/* JADX INFO: loaded from: classes.dex */
public final class w0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t3 f7187b;

    public /* synthetic */ w0(a3 a3Var, int i10) {
        this.f7186a = i10;
        this.f7187b = a3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f7186a;
        t3 t3Var = this.f7187b;
        switch (i10) {
            case 0:
                t3Var.b(true);
                break;
            case 1:
                t3Var.b(false);
                break;
            default:
                t3Var.a();
                break;
        }
    }
}
