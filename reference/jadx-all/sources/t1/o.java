package t1;

/* JADX INFO: loaded from: classes.dex */
public abstract class o extends y0.n {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f14520u = g.m(this);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public y0.n f14521v;

    @Override // y0.n
    public final void C0() {
        super.C0();
        for (y0.n nVar = this.f14521v; nVar != null; nVar = nVar.f16735f) {
            nVar.C0();
        }
    }

    @Override // y0.n
    public final void D0() {
        for (y0.n nVar = this.f14521v; nVar != null; nVar = nVar.f16735f) {
            nVar.D0();
        }
        super.D0();
    }

    @Override // y0.n
    public final void E0() {
        super.E0();
        for (y0.n nVar = this.f14521v; nVar != null; nVar = nVar.f16735f) {
            nVar.E0();
        }
    }

    @Override // y0.n
    public final void F0(c1 c1Var) {
        this.f16737o = c1Var;
        for (y0.n nVar = this.f14521v; nVar != null; nVar = nVar.f16735f) {
            nVar.F0(c1Var);
        }
    }

    public final void G0(y0.n nVar) {
        y0.n nVar2;
        y0.n nVar3 = nVar.f16730a;
        if (nVar3 != nVar) {
            y0.n nVar4 = nVar.f16734e;
            if (nVar3 != this.f16730a || !d7.a.d(nVar4, this)) {
                throw new IllegalStateException("Cannot delegate to an already delegated node".toString());
            }
            return;
        }
        if (!(!nVar3.f16742t)) {
            throw new IllegalStateException("Cannot delegate to an already attached node".toString());
        }
        nVar3.f16730a = this.f16730a;
        int i10 = this.f16732c;
        int iN = g.n(nVar3);
        nVar3.f16732c = iN;
        int i11 = this.f16732c;
        int i12 = iN & 2;
        if (i12 != 0 && (i11 & 2) != 0 && !(this instanceof b0)) {
            throw new IllegalStateException(("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + nVar3).toString());
        }
        nVar3.f16735f = this.f14521v;
        this.f14521v = nVar3;
        nVar3.f16734e = this;
        int i13 = iN | i11;
        this.f16732c = i13;
        if (i11 != i13) {
            y0.n nVar5 = this.f16730a;
            if (nVar5 == this) {
                this.f16733d = i13;
            }
            if (this.f16742t) {
                y0.n nVar6 = this;
                while (nVar6 != null) {
                    i13 |= nVar6.f16732c;
                    nVar6.f16732c = i13;
                    if (nVar6 == nVar5) {
                        break;
                    } else {
                        nVar6 = nVar6.f16734e;
                    }
                }
                int i14 = i13 | ((nVar6 == null || (nVar2 = nVar6.f16735f) == null) ? 0 : nVar2.f16733d);
                while (nVar6 != null) {
                    i14 |= nVar6.f16732c;
                    nVar6.f16733d = i14;
                    nVar6 = nVar6.f16734e;
                }
            }
        }
        if (this.f16742t) {
            if (i12 == 0 || (i10 & 2) != 0) {
                F0(this.f16737o);
            } else {
                x0 x0Var = g.y(this).C;
                this.f16730a.F0(null);
                x0Var.g();
            }
            nVar3.x0();
            nVar3.D0();
            g.h(nVar3);
        }
    }

    @Override // y0.n
    public final void x0() {
        super.x0();
        for (y0.n nVar = this.f14521v; nVar != null; nVar = nVar.f16735f) {
            nVar.F0(this.f16737o);
            if (!nVar.f16742t) {
                nVar.x0();
            }
        }
    }

    @Override // y0.n
    public final void y0() {
        for (y0.n nVar = this.f14521v; nVar != null; nVar = nVar.f16735f) {
            nVar.y0();
        }
        super.y0();
    }
}
