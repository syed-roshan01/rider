package h0;

/* JADX INFO: loaded from: classes.dex */
public final class t extends d9.j implements c9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f7458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e0 f7461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q8.c f7462e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(n nVar, int i10, int i11, q0 q0Var, q8.c cVar) {
        super(0);
        this.f7458a = nVar;
        this.f7459b = i10;
        this.f7460c = i11;
        this.f7461d = q0Var;
        this.f7462e = cVar;
    }

    @Override // c9.a
    public final Object invoke() {
        int iIntValue = ((Number) this.f7462e.getValue()).intValue();
        q0 q0Var = (q0) this.f7461d;
        boolean z10 = q0Var.f7447a;
        boolean z11 = q0Var.f7449c.b() == 1;
        n nVar = this.f7458a;
        a2.a0 a0Var = nVar.f7430d;
        int i10 = this.f7459b;
        long jN = a0Var.n(i10);
        int i11 = a2.b0.f904c;
        int iJ = (int) (jN >> 32);
        a2.a0 a0Var2 = nVar.f7430d;
        int iF = a0Var2.f(iJ);
        a2.i iVar = a0Var2.f894b;
        if (iF != iIntValue) {
            int i12 = iVar.f937f;
            iJ = iIntValue >= i12 ? a0Var2.j(i12 - 1) : a0Var2.j(iIntValue);
        }
        int iE = (int) (jN & 4294967295L);
        if (a0Var2.f(iE) != iIntValue) {
            int i13 = iVar.f937f;
            iE = iIntValue >= i13 ? a0Var2.e(i13 - 1, false) : a0Var2.e(iIntValue, false);
        }
        int i14 = this.f7460c;
        if (iJ == i14) {
            return nVar.a(iE);
        }
        if (iE == i14) {
            return nVar.a(iJ);
        }
        if (!(z10 ^ z11) ? i10 >= iJ : i10 > iE) {
            iJ = iE;
        }
        return nVar.a(iJ);
    }
}
