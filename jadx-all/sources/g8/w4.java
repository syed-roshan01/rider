package g8;

/* JADX INFO: loaded from: classes.dex */
public final class w4 implements y4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7201b;

    public /* synthetic */ w4(int i10, int i11) {
        this.f7200a = i11;
        this.f7201b = i10;
    }

    @Override // g8.y4
    public final void a(g5 g5Var) {
        int i10 = this.f7200a;
        int i11 = this.f7201b;
        switch (i10) {
            case 0:
                g5Var.f6817a.b(i11);
                break;
            case 1:
                g5Var.f6817a.e(i11);
                break;
            default:
                g5Var.f6817a.a(i11);
                break;
        }
    }
}
