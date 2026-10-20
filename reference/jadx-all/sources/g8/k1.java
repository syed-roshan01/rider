package g8;

/* JADX INFO: loaded from: classes.dex */
public final class k1 implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6896a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f6898c;

    public k1(e8.c2 c2Var, i0 i0Var) {
        y3.e.G("error must not be OK", !c2Var.e());
        this.f6897b = c2Var;
        this.f6898c = i0Var;
    }

    @Override // e8.p0
    public final e8.q0 b() {
        switch (this.f6896a) {
            case 0:
                throw new UnsupportedOperationException("Not a real transport");
            default:
                return ((k0) this.f6898c).b();
        }
    }

    @Override // g8.k0
    public final h0 d(e8.p1 p1Var, e8.l1 l1Var, e8.h hVar, e8.p[] pVarArr) {
        int i10 = this.f6896a;
        Object obj = this.f6898c;
        Object obj2 = this.f6897b;
        switch (i10) {
            case 0:
                return new j1((e8.c2) obj2, (i0) obj, pVarArr);
            default:
                e8.h hVar2 = e8.h.f5266k;
                y3.e.J(hVar, "callOptions cannot be null");
                e8.p pVarA = ((e8.n) obj2).a(new e8.o(hVar, 0, false), l1Var);
                y3.e.N("lb tracer already assigned", pVarArr[pVarArr.length - 1] == s1.f7099o);
                pVarArr[pVarArr.length - 1] = pVarA;
                return ((k0) obj).d(p1Var, l1Var, hVar, pVarArr);
        }
    }

    public k1(e8.n nVar, u3 u3Var) {
        this.f6897b = nVar;
        this.f6898c = u3Var;
    }
}
