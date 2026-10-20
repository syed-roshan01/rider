package h0;

import f0.c2;

/* JADX INFO: loaded from: classes.dex */
public final class u0 implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v0 f7468a;

    public u0(v0 v0Var) {
        this.f7468a = v0Var;
    }

    @Override // h0.l
    public final void a() {
    }

    @Override // h0.l
    public final boolean b(long j10) {
        c2 c2Var;
        v0 v0Var = this.f7468a;
        if (v0Var.k().f6509a.f918a.length() == 0 || (c2Var = v0Var.f7475d) == null || c2Var.d() == null) {
            return false;
        }
        v0.c(v0Var, v0Var.k(), j10, false, false, r.f7450a, false);
        return true;
    }

    @Override // h0.l
    public final boolean c(long j10, s sVar) {
        c2 c2Var;
        v0 v0Var = this.f7468a;
        if (v0Var.k().f6509a.f918a.length() == 0 || (c2Var = v0Var.f7475d) == null || c2Var.d() == null) {
            return false;
        }
        v0.c(v0Var, v0Var.k(), j10, false, false, sVar, false);
        return true;
    }

    @Override // h0.l
    public final boolean d(long j10, b0.l0 l0Var) {
        c2 c2Var;
        v0 v0Var = this.f7468a;
        if (v0Var.k().f6509a.f918a.length() == 0 || (c2Var = v0Var.f7475d) == null || c2Var.d() == null) {
            return false;
        }
        c1.k kVar = v0Var.f7481j;
        if (kVar != null) {
            kVar.a();
        }
        v0Var.f7483l = j10;
        v0Var.f7488q = -1;
        v0Var.h(true);
        v0.c(v0Var, v0Var.k(), v0Var.f7483l, true, false, l0Var, false);
        return true;
    }
}
