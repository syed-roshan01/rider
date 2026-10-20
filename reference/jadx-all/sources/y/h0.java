package y;

/* JADX INFO: loaded from: classes.dex */
public final class h0 extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16556a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r1.x0 f16558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f16559d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(int i10, r1.x0 x0Var, int i11) {
        super(1);
        this.f16557b = i10;
        this.f16558c = x0Var;
        this.f16559d = i11;
    }

    public final void a(r1.w0 w0Var) {
        int i10 = this.f16556a;
        int i11 = this.f16559d;
        int i12 = this.f16557b;
        r1.x0 x0Var = this.f16558c;
        switch (i10) {
            case 0:
                w0Var.getClass();
                r1.w0.c(x0Var, i12, i11, 0.0f);
                break;
            default:
                int iP0 = d7.t.p0((i12 - x0Var.f13423a) / 2.0f);
                int iP1 = d7.t.p0((i11 - x0Var.f13424b) / 2.0f);
                w0Var.getClass();
                r1.w0.c(x0Var, iP0, iP1, 0.0f);
                break;
        }
    }

    @Override // c9.c
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        q8.l lVar = q8.l.f13235a;
        switch (this.f16556a) {
            case 0:
                a((r1.w0) obj);
                break;
            default:
                a((r1.w0) obj);
                break;
        }
        return lVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(r1.x0 x0Var, int i10, int i11) {
        super(1);
        this.f16558c = x0Var;
        this.f16557b = i10;
        this.f16559d = i11;
    }
}
