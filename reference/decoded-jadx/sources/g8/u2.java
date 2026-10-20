package g8;

/* JADX INFO: loaded from: classes.dex */
public final class u2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l3 f7155b;

    public /* synthetic */ u2(l3 l3Var, int i10) {
        this.f7154a = i10;
        this.f7155b = l3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7154a) {
            case 0:
                this.f7155b.B(true);
                break;
            case 1:
                l3 l3Var = this.f7155b;
                if (!l3Var.F.get() && l3Var.f6949w != null) {
                    l3Var.B(false);
                    l3.y(l3Var);
                    break;
                }
                break;
            case 2:
                this.f7155b.C();
                if (this.f7155b.f6950x != null) {
                    this.f7155b.f6950x.getClass();
                }
                c3 c3Var = this.f7155b.f6949w;
                if (c3Var != null) {
                    ((e8.z0) c3Var.f6688a.f7942b).e();
                }
                break;
            case 3:
                l3 l3Var2 = this.f7155b;
                l3Var2.N.a(2, "Entering SHUTDOWN state");
                l3Var2.f6944r.c(e8.x.f5398e);
                break;
            case 4:
                l3 l3Var3 = this.f7155b;
                if (!l3Var3.G) {
                    l3Var3.G = true;
                    l3.z(l3Var3);
                    break;
                }
                break;
            default:
                l3 l3Var4 = this.f7155b;
                if (l3Var4.f6949w != null) {
                    l3.y(l3Var4);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u2(l3 l3Var) {
        this(l3Var, 5);
        this.f7154a = 5;
    }
}
