package g8;

/* JADX INFO: loaded from: classes.dex */
public final class v4 implements y4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f7178b;

    public /* synthetic */ v4(int i10, boolean z10) {
        this.f7177a = i10;
        this.f7178b = z10;
    }

    @Override // g8.y4
    public final void a(g5 g5Var) {
        int i10 = this.f7177a;
        boolean z10 = this.f7178b;
        switch (i10) {
            case 0:
                g5Var.f6817a.q(z10);
                break;
            default:
                g5Var.f6817a.c(z10);
                break;
        }
    }
}
