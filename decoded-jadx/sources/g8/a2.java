package g8;

/* JADX INFO: loaded from: classes.dex */
public final class a2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j2 f6643b;

    public /* synthetic */ a2(j2 j2Var, int i10) {
        this.f6642a = i10;
        this.f6643b = j2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f6642a;
        e8.x xVar = e8.x.f5394a;
        switch (i10) {
            case 0:
                j2 j2Var = this.f6643b;
                j2Var.f6880p = null;
                j2Var.f6874j.a(2, "CONNECTING after backoff");
                j2.g(j2Var, xVar);
                j2.h(j2Var);
                break;
            case 1:
                if (this.f6643b.f6887w.f5403a == e8.x.f5397d) {
                    this.f6643b.f6874j.a(2, "CONNECTING as requested");
                    j2.g(this.f6643b, xVar);
                    j2.h(this.f6643b);
                }
                break;
            default:
                j2 j2Var2 = this.f6643b;
                j2Var2.f6874j.a(2, "Terminated");
                k3 k3Var = (k3) j2Var2.f6869e.f7176b;
                k3Var.f6908j.f6952z.remove(j2Var2);
                l3.A(k3Var.f6908j);
                break;
        }
    }
}
