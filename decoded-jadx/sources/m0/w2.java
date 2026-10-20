package m0;

/* JADX INFO: loaded from: classes.dex */
public abstract class w2 extends w0.h0 implements f1, w0.s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v2 f11729b;

    @Override // w0.s
    public final z2 a() {
        return o3.f11621a;
    }

    public final long d() {
        return ((v2) w0.p.r(this.f11729b, this)).f11719c;
    }

    @Override // w0.g0
    public final w0.i0 e() {
        return this.f11729b;
    }

    public final void f(long j10) {
        w0.i iVarI;
        v2 v2Var = (v2) w0.p.h(this.f11729b);
        if (v2Var.f11719c != j10) {
            v2 v2Var2 = this.f11729b;
            synchronized (w0.p.f16109b) {
                iVarI = w0.p.i();
                ((v2) w0.p.m(v2Var2, this, iVarI, v2Var)).f11719c = j10;
            }
            w0.p.l(iVarI, this);
        }
    }

    @Override // w0.g0
    public final w0.i0 i(w0.i0 i0Var, w0.i0 i0Var2, w0.i0 i0Var3) {
        if (((v2) i0Var2).f11719c == ((v2) i0Var3).f11719c) {
            return i0Var2;
        }
        return null;
    }

    @Override // w0.g0
    public final void k(w0.i0 i0Var) {
        this.f11729b = (v2) i0Var;
    }

    public final String toString() {
        return "MutableLongState(value=" + ((v2) w0.p.h(this.f11729b)).f11719c + ")@" + hashCode();
    }
}
