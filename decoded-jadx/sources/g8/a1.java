package g8;

/* JADX INFO: loaded from: classes.dex */
public final class a1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d1 f6641b;

    public /* synthetic */ a1(d1 d1Var, int i10) {
        this.f6640a = i10;
        this.f6641b = d1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f6640a;
        d1 d1Var = this.f6641b;
        switch (i10) {
            case 0:
                d1Var.f6716c.n();
                break;
            case 1:
                d1Var.s();
                break;
            case 2:
                d1Var.f6716c.flush();
                break;
            default:
                d1Var.f6716c.o();
                break;
        }
    }
}
