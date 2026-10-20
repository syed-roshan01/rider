package v;

/* JADX INFO: loaded from: classes.dex */
public final class w0 extends j {
    public x0 K;
    public h1 L;
    public k0 M;
    public final u0 N;
    public final d0 O;

    public w0(x0 x0Var, q0 q0Var, h1 h1Var, boolean z10, x.m mVar, c9.a aVar, c9.f fVar, c9.f fVar2, boolean z11) {
        super(q0Var, z10, mVar, aVar, fVar, fVar2, z11);
        this.K = x0Var;
        this.L = h1Var;
        this.M = t0.f15783a;
        this.N = new u0(this);
        this.O = h1Var == h1.f15593a ? j0.f15639b : j0.f15638a;
    }

    public final void L0(x0 x0Var, q0 q0Var, h1 h1Var, boolean z10, x.m mVar, c9.a aVar, c9.f fVar, c9.f fVar2, boolean z11) {
        boolean z12;
        boolean z13 = true;
        if (d7.a.d(this.K, x0Var)) {
            z12 = false;
        } else {
            this.K = x0Var;
            z12 = true;
        }
        this.f15634w = q0Var;
        if (this.L != h1Var) {
            this.L = h1Var;
            z12 = true;
        }
        if (this.f15635x != z10) {
            this.f15635x = z10;
            if (!z10) {
                K0();
            }
        } else {
            z13 = z12;
        }
        if (!d7.a.d(this.f15636y, mVar)) {
            K0();
            this.f15636y = mVar;
        }
        this.f15637z = aVar;
        this.A = fVar;
        this.B = fVar2;
        if (this.C != z11) {
            this.C = z11;
        } else if (!z13) {
            return;
        }
        ((o1.j0) this.H).I0();
    }
}
