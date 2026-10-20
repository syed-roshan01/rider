package g8;

/* JADX INFO: loaded from: classes.dex */
public final class b1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f6658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d1 f6659c;

    public /* synthetic */ b1(d1 d1Var, boolean z10, int i10) {
        this.f6657a = i10;
        this.f6659c = d1Var;
        this.f6658b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f6657a;
        boolean z10 = this.f6658b;
        d1 d1Var = this.f6659c;
        switch (i10) {
            case 0:
                d1Var.f6716c.q(z10);
                break;
            default:
                d1Var.f6716c.c(z10);
                break;
        }
    }
}
