package g8;

/* JADX INFO: loaded from: classes.dex */
public final class d5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g5 f6730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f5 f6731c;

    public /* synthetic */ d5(f5 f5Var, g5 g5Var, int i10) {
        this.f6729a = i10;
        this.f6731c = f5Var;
        this.f6730b = g5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f6729a;
        f5 f5Var = this.f6731c;
        switch (i10) {
            case 0:
                f5Var.f6765b.f7264b.execute(new t0(this, 10));
                break;
            default:
                y2 y2Var = f5Var.f6765b;
                e8.g1 g1Var = y2.E;
                y2Var.v(this.f6730b);
                break;
        }
    }
}
