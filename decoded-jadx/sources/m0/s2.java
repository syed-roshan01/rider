package m0;

/* JADX INFO: loaded from: classes.dex */
public abstract class s2 extends w0.h0 implements d1, w0.s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r2 f11703b;

    @Override // w0.s
    public final z2 a() {
        return o3.f11621a;
    }

    public final float d() {
        return ((r2) w0.p.r(this.f11703b, this)).f11692c;
    }

    @Override // w0.g0
    public final w0.i0 e() {
        return this.f11703b;
    }

    public final void f(float f10) {
        w0.i iVarI;
        r2 r2Var = (r2) w0.p.h(this.f11703b);
        if (r2Var.f11692c == f10) {
            return;
        }
        r2 r2Var2 = this.f11703b;
        synchronized (w0.p.f16109b) {
            iVarI = w0.p.i();
            ((r2) w0.p.m(r2Var2, this, iVarI, r2Var)).f11692c = f10;
        }
        w0.p.l(iVarI, this);
    }

    @Override // w0.g0
    public final w0.i0 i(w0.i0 i0Var, w0.i0 i0Var2, w0.i0 i0Var3) {
        if (((r2) i0Var2).f11692c == ((r2) i0Var3).f11692c) {
            return i0Var2;
        }
        return null;
    }

    @Override // w0.g0
    public final void k(w0.i0 i0Var) {
        this.f11703b = (r2) i0Var;
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((r2) w0.p.h(this.f11703b)).f11692c + ")@" + hashCode();
    }
}
