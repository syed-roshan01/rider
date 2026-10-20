package c0;

import r1.s;
import t1.a0;
import t1.c1;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends y0.n implements s1.f, a0, t1.m {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final n f2842u = new n(this);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public s f2843v;

    public final s G0() {
        s sVar = this.f2843v;
        if (sVar == null || !sVar.L()) {
            return null;
        }
        return sVar;
    }

    @Override // t1.a0
    public final void R(c1 c1Var) {
        this.f2843v = c1Var;
    }
}
