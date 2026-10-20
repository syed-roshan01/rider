package h0;

import f0.c2;
import f0.d2;
import f0.k1;

/* JADX INFO: loaded from: classes.dex */
public final class s0 implements k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v0 f7457b;

    public /* synthetic */ s0(v0 v0Var, int i10) {
        this.f7456a = i10;
        this.f7457b = v0Var;
    }

    @Override // f0.k1
    public final void c() {
    }

    @Override // f0.k1
    public final void d() {
        int i10 = this.f7456a;
        v0 v0Var = this.f7457b;
        switch (i10) {
            case 0:
                v0.b(v0Var, null);
                v0Var.f7487p.setValue(null);
                break;
            default:
                v0.b(v0Var, null);
                v0Var.f7487p.setValue(null);
                v0Var.p(true);
                v0Var.f7484m = null;
                break;
        }
    }

    @Override // f0.k1
    public final void e() {
        switch (this.f7456a) {
            case 0:
                v0 v0Var = this.f7457b;
                v0.b(v0Var, null);
                v0Var.f7487p.setValue(null);
                break;
        }
    }

    @Override // f0.k1
    public final void f(long j10) {
        d2 d2VarD;
        d2 d2VarD2;
        d2 d2VarD3;
        int i10 = this.f7456a;
        v0 v0Var = this.f7457b;
        switch (i10) {
            case 0:
                long j11 = v0Var.j(true);
                float f10 = d0.f7374a;
                long jF = d9.i.f(d1.c.d(j11), d1.c.e(j11) - 1.0f);
                c2 c2Var = v0Var.f7475d;
                if (c2Var != null && (d2VarD = c2Var.d()) != null) {
                    long jE = d2VarD.e(jF);
                    v0Var.f7483l = jE;
                    v0Var.f7487p.setValue(new d1.c(jE));
                    v0Var.f7485n = d1.c.f4326b;
                    v0Var.f7486o.setValue(f0.n0.f5823a);
                    v0Var.p(false);
                    break;
                }
                break;
            default:
                if (((f0.n0) v0Var.f7486o.getValue()) == null) {
                    v0Var.f7486o.setValue(f0.n0.f5825c);
                    v0Var.f7488q = -1;
                    v0Var.l();
                    c2 c2Var2 = v0Var.f7475d;
                    if (c2Var2 == null || (d2VarD3 = c2Var2.d()) == null || !d2VarD3.c(j10)) {
                        c2 c2Var3 = v0Var.f7475d;
                        if (c2Var3 != null && (d2VarD2 = c2Var3.d()) != null) {
                            int iA = v0Var.f7473b.a(d2VarD2.b(j10, true));
                            g2.a0 a0VarE = v0.e(v0Var.k().f6509a, o1.s.g(iA, iA));
                            v0Var.h(false);
                            v0Var.n(f0.o0.f5838c);
                            k1.a aVar = v0Var.f7480i;
                            if (aVar != null) {
                                ((k1.c) aVar).a(f6.a.f6375x);
                            }
                            v0Var.f7474c.invoke(a0VarE);
                        }
                    } else if (v0Var.k().f6509a.f918a.length() != 0) {
                        v0Var.h(false);
                        v0Var.f7484m = Integer.valueOf((int) (v0.c(v0Var, g2.a0.a(v0Var.k(), null, a2.b0.f903b, 5), j10, true, false, r.f7453d, true) >> 32));
                    }
                    v0Var.f7483l = j10;
                    v0Var.f7487p.setValue(new d1.c(j10));
                    v0Var.f7485n = d1.c.f4326b;
                    break;
                }
                break;
        }
    }

    @Override // f0.k1
    public final void g() {
    }

    /* JADX WARN: Code duplicated, block: B:19:0x008b  */
    /* JADX WARN: Code duplicated, block: B:21:0x008f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0094  */
    @Override // f0.k1
    public final void h(long j10) {
        d2 d2VarD;
        k1.a aVar;
        d2 d2VarD2;
        Integer num;
        int iB;
        int i10 = this.f7456a;
        v0 v0Var = this.f7457b;
        switch (i10) {
            case 0:
                v0Var.f7485n = d1.c.g(v0Var.f7485n, j10);
                c2 c2Var = v0Var.f7475d;
                if (c2Var != null && (d2VarD = c2Var.d()) != null) {
                    v0Var.f7487p.setValue(new d1.c(d1.c.g(v0Var.f7483l, v0Var.f7485n)));
                    g2.s sVar = v0Var.f7473b;
                    d1.c cVarI = v0Var.i();
                    d7.a.j(cVarI);
                    int iA = sVar.a(d2VarD.b(cVarI.f4330a, true));
                    long jG = o1.s.g(iA, iA);
                    if (!a2.b0.a(jG, v0Var.k().f6510b)) {
                        c2 c2Var2 = v0Var.f7475d;
                        if ((c2Var2 == null || ((Boolean) c2Var2.f5652q.getValue()).booleanValue()) && (aVar = v0Var.f7480i) != null) {
                            ((k1.c) aVar).a(f6.a.f6375x);
                        }
                        v0Var.f7474c.invoke(v0.e(v0Var.k().f6509a, jG));
                        break;
                    }
                }
                break;
            default:
                if (v0Var.k().f6509a.f918a.length() != 0) {
                    v0Var.f7485n = d1.c.g(v0Var.f7485n, j10);
                    c2 c2Var3 = v0Var.f7475d;
                    if (c2Var3 != null && (d2VarD2 = c2Var3.d()) != null) {
                        v0Var.f7487p.setValue(new d1.c(d1.c.g(v0Var.f7483l, v0Var.f7485n)));
                        Integer num2 = v0Var.f7484m;
                        b0.l0 l0Var = r.f7453d;
                        if (num2 == null) {
                            d1.c cVarI2 = v0Var.i();
                            d7.a.j(cVarI2);
                            if (d2VarD2.c(cVarI2.f4330a)) {
                                num = v0Var.f7484m;
                                if (num != null) {
                                    iB = num.intValue();
                                } else {
                                    iB = d2VarD2.b(v0Var.f7483l, false);
                                }
                                d1.c cVarI3 = v0Var.i();
                                d7.a.j(cVarI3);
                                int iB2 = d2VarD2.b(cVarI3.f4330a, false);
                                if (v0Var.f7484m == null || iB != iB2) {
                                    g2.a0 a0VarK = v0Var.k();
                                    d1.c cVarI4 = v0Var.i();
                                    d7.a.j(cVarI4);
                                    v0.c(v0Var, a0VarK, cVarI4.f4330a, false, false, l0Var, true);
                                }
                            } else {
                                int iA2 = v0Var.f7473b.a(d2VarD2.b(v0Var.f7483l, true));
                                g2.s sVar2 = v0Var.f7473b;
                                d1.c cVarI5 = v0Var.i();
                                d7.a.j(cVarI5);
                                if (iA2 == sVar2.a(d2VarD2.b(cVarI5.f4330a, true))) {
                                    l0Var = r.f7450a;
                                }
                                g2.a0 a0VarK2 = v0Var.k();
                                d1.c cVarI6 = v0Var.i();
                                d7.a.j(cVarI6);
                                v0.c(v0Var, a0VarK2, cVarI6.f4330a, false, false, l0Var, true);
                            }
                        } else {
                            num = v0Var.f7484m;
                            if (num != null) {
                                iB = num.intValue();
                            } else {
                                iB = d2VarD2.b(v0Var.f7483l, false);
                            }
                            d1.c cVarI7 = v0Var.i();
                            d7.a.j(cVarI7);
                            int iB3 = d2VarD2.b(cVarI7.f4330a, false);
                            if (v0Var.f7484m == null) {
                            }
                            g2.a0 a0VarK3 = v0Var.k();
                            d1.c cVarI8 = v0Var.i();
                            d7.a.j(cVarI8);
                            v0.c(v0Var, a0VarK3, cVarI8.f4330a, false, false, l0Var, true);
                        }
                        int i11 = a2.b0.f904c;
                    }
                    v0Var.p(false);
                    break;
                }
                break;
        }
    }
}
