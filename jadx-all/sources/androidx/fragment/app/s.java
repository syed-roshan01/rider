package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
public final class s implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f2020b;

    public /* synthetic */ s(d0 d0Var, int i10) {
        this.f2019a = i10;
        this.f2020b = d0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f2019a;
        d0 d0Var = this.f2020b;
        switch (i10) {
            case 0:
                d0Var.startPostponedEnterTransition();
                break;
            default:
                d0Var.callStartTransitionListener(false);
                break;
        }
    }
}
