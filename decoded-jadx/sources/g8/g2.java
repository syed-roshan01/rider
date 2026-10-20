package g8;

/* JADX INFO: loaded from: classes.dex */
public final class g2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h2 f6814b;

    public /* synthetic */ g2(h2 h2Var, int i10) {
        this.f6813a = i10;
        this.f6814b = h2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6813a) {
            case 0:
                h2 h2Var = this.f6814b;
                j2 j2Var = h2Var.f6826c;
                j2Var.f6878n = null;
                if (j2Var.f6888x == null) {
                    o0 o0Var = j2Var.f6885u;
                    o0 o0Var2 = h2Var.f6824a;
                    if (o0Var == o0Var2) {
                        j2Var.f6886v = o0Var2;
                        j2 j2Var2 = this.f6814b.f6826c;
                        j2Var2.f6885u = null;
                        j2.g(j2Var2, e8.x.f5395b);
                    }
                } else {
                    y3.e.N("Unexpected non-null activeTransport", j2Var.f6886v == null);
                    h2 h2Var2 = this.f6814b;
                    h2Var2.f6824a.f(h2Var2.f6826c.f6888x);
                }
                break;
            default:
                h2 h2Var3 = this.f6814b;
                h2Var3.f6826c.f6883s.remove(h2Var3.f6824a);
                if (this.f6814b.f6826c.f6887w.f5403a == e8.x.f5398e && this.f6814b.f6826c.f6883s.isEmpty()) {
                    j2 j2Var3 = this.f6814b.f6826c;
                    j2Var3.getClass();
                    j2Var3.f6875k.execute(new a2(j2Var3, 2));
                    break;
                }
                break;
        }
    }
}
