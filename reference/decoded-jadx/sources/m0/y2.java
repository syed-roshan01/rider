package m0;

/* JADX INFO: loaded from: classes.dex */
public abstract class y2 extends w0.h0 implements w0.s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z2 f11765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public x2 f11766c;

    public y2(Object obj, z2 z2Var) {
        this.f11765b = z2Var;
        this.f11766c = new x2(obj);
    }

    @Override // w0.s
    public final z2 a() {
        return this.f11765b;
    }

    @Override // w0.g0
    public final w0.i0 e() {
        return this.f11766c;
    }

    @Override // m0.l3
    public final Object getValue() {
        return ((x2) w0.p.r(this.f11766c, this)).f11760c;
    }

    @Override // w0.g0
    public final w0.i0 i(w0.i0 i0Var, w0.i0 i0Var2, w0.i0 i0Var3) {
        if (this.f11765b.a(((x2) i0Var2).f11760c, ((x2) i0Var3).f11760c)) {
            return i0Var2;
        }
        return null;
    }

    @Override // w0.g0
    public final void k(w0.i0 i0Var) {
        this.f11766c = (x2) i0Var;
    }

    @Override // m0.g1
    public final void setValue(Object obj) {
        w0.i iVarI;
        x2 x2Var = (x2) w0.p.h(this.f11766c);
        if (this.f11765b.a(x2Var.f11760c, obj)) {
            return;
        }
        x2 x2Var2 = this.f11766c;
        synchronized (w0.p.f16109b) {
            iVarI = w0.p.i();
            ((x2) w0.p.m(x2Var2, this, iVarI, x2Var)).f11760c = obj;
        }
        w0.p.l(iVarI, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((x2) w0.p.h(this.f11766c)).f11760c + ")@" + hashCode();
    }
}
