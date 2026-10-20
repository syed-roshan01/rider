package g8;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l.z2 f6822b;

    public /* synthetic */ h(l.z2 z2Var, int i10) {
        this.f6821a = i10;
        this.f6822b = z2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f6821a;
        l.z2 z2Var = this.f6822b;
        switch (i10) {
            case 0:
                ((x3) z2Var.f10985d).f();
                break;
            default:
                ((x3) z2Var.f10985d).close();
                break;
        }
    }
}
