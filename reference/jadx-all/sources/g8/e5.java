package g8;

/* JADX INFO: loaded from: classes.dex */
public final class e5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f5 f6745b;

    public /* synthetic */ e5(f5 f5Var, int i10) {
        this.f6744a = i10;
        this.f6745b = f5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f6744a;
        f5 f5Var = this.f6745b;
        switch (i10) {
            case 0:
                y2 y2Var = f5Var.f6765b;
                y2Var.f7288z = true;
                j0 j0Var = y2Var.f7283u;
                l.z2 z2Var = y2Var.f7281s;
                j0Var.c((e8.c2) z2Var.f10983b, (i0) z2Var.f10984c, (e8.l1) z2Var.f10985d);
                break;
            default:
                y2 y2Var2 = f5Var.f6765b;
                if (!y2Var2.f7288z) {
                    y2Var2.f7283u.b();
                }
                break;
        }
    }
}
