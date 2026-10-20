package m0;

/* JADX INFO: loaded from: classes.dex */
public abstract class u2 extends w0.h0 implements e1, w0.s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t2 f11712b;

    @Override // w0.s
    public final z2 a() {
        return o3.f11621a;
    }

    public final int d() {
        return ((t2) w0.p.r(this.f11712b, this)).f11708c;
    }

    @Override // w0.g0
    public final w0.i0 e() {
        return this.f11712b;
    }

    public final void f(int i10) {
        w0.i iVarI;
        t2 t2Var = (t2) w0.p.h(this.f11712b);
        if (t2Var.f11708c != i10) {
            t2 t2Var2 = this.f11712b;
            synchronized (w0.p.f16109b) {
                iVarI = w0.p.i();
                ((t2) w0.p.m(t2Var2, this, iVarI, t2Var)).f11708c = i10;
            }
            w0.p.l(iVarI, this);
        }
    }

    @Override // w0.g0
    public final w0.i0 i(w0.i0 i0Var, w0.i0 i0Var2, w0.i0 i0Var3) {
        if (((t2) i0Var2).f11708c == ((t2) i0Var3).f11708c) {
            return i0Var2;
        }
        return null;
    }

    @Override // w0.g0
    public final void k(w0.i0 i0Var) {
        this.f11712b = (t2) i0Var;
    }

    public final String toString() {
        return "MutableIntState(value=" + ((t2) w0.p.h(this.f11712b)).f11708c + ")@" + hashCode();
    }
}
