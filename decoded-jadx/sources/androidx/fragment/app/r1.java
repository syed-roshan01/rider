package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
public final class r1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s1 f2017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t1 f2018c;

    public /* synthetic */ r1(t1 t1Var, s1 s1Var, int i10) {
        this.f2016a = i10;
        this.f2018c = t1Var;
        this.f2017b = s1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f2016a;
        s1 s1Var = this.f2017b;
        t1 t1Var = this.f2018c;
        switch (i10) {
            case 0:
                if (t1Var.f2034b.contains(s1Var)) {
                    a7.a.a(s1Var.f2023a, s1Var.f2025c.mView);
                }
                break;
            default:
                t1Var.f2034b.remove(s1Var);
                t1Var.f2035c.remove(s1Var);
                break;
        }
    }
}
