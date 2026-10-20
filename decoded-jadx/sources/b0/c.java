package b0;

import m0.k1;
import m0.l1;

/* JADX INFO: loaded from: classes.dex */
public final class c extends d9.j implements c9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f2342b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i10, h0 h0Var) {
        super(0);
        this.f2341a = i10;
        this.f2342b = h0Var;
    }

    public final Integer a() {
        int iP0;
        int i10 = this.f2341a;
        h0 h0Var = this.f2342b;
        switch (i10) {
            case 0:
                return Integer.valueOf(h0Var.k());
            case 1:
                return Integer.valueOf(h0Var.k());
            case 2:
                return Integer.valueOf(h0Var.f2403k.b() ? h0Var.f2412t.d() : h0Var.f2397e.f2318b.d());
            default:
                boolean zB = h0Var.f2403k.b();
                a0 a0Var = h0Var.f2397e;
                if (zB) {
                    l1 l1Var = h0Var.f2411s;
                    if (l1Var.d() != -1) {
                        iP0 = l1Var.d();
                    } else {
                        k1 k1Var = h0Var.f2394b;
                        if (k1Var.d() != 0.0f) {
                            iP0 = d7.t.p0(k1Var.d() / h0Var.m()) + a0Var.f2318b.d();
                        } else if (Math.abs(a0Var.f2319c.d()) >= Math.abs(Math.min(h0Var.f2409q.v(o0.f2450a), h0Var.l() / 2.0f) / h0Var.l())) {
                            iP0 = ((Boolean) h0Var.f2396d.getValue()).booleanValue() ? h0Var.f2398f + 1 : h0Var.f2398f;
                        } else {
                            iP0 = a0Var.f2318b.d();
                        }
                    }
                } else {
                    iP0 = a0Var.f2318b.d();
                }
                return Integer.valueOf(h0Var.i(iP0));
        }
    }

    @Override // c9.a
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f2341a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return a();
    }
}
