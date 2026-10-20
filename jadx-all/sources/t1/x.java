package t1;

/* JADX INFO: loaded from: classes.dex */
public final class x extends c1 {
    public static final e1.g P;
    public final s1 N;
    public r0 O;

    static {
        e1.g gVarF = androidx.compose.ui.graphics.a.f();
        int i10 = e1.r.f5066h;
        gVarF.e(e1.r.f5062d);
        gVarF.k(1.0f);
        gVarF.l(1);
        P = gVarF;
    }

    public x(androidx.compose.ui.node.a aVar) {
        super(aVar);
        s1 s1Var = new s1();
        s1Var.f16733d = 0;
        this.N = s1Var;
        s1Var.f16737o = this;
        this.O = aVar.f1738c != null ? new w(this) : null;
    }

    @Override // t1.c1
    public final void F0() {
        if (this.O == null) {
            this.O = new w(this);
        }
    }

    @Override // t1.c1
    public final r0 I0() {
        return this.O;
    }

    @Override // t1.c1
    public final y0.n K0() {
        return this.N;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0055  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [o0.i] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [o0.i] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v8 */
    @Override // t1.c1
    public final void O0(z0 z0Var, long j10, v vVar, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        j1 j1Var;
        x0 x0Var;
        v vVar2 = vVar;
        x9.v vVar3 = (x9.v) z0Var;
        int i10 = vVar3.f16473a;
        int i11 = 1;
        androidx.compose.ui.node.a aVar = this.f14395p;
        switch (i10) {
            default:
                y1.j jVarN = aVar.n();
                if (!(!(jVarN != null && jVarN.f16788c))) {
                    z13 = z11;
                    z12 = false;
                    break;
                }
            case 0:
                if (d9.i.s(j10) && ((j1Var = this.H) == null || !this.f14399t || j1Var.k(j10))) {
                    z13 = z11;
                    z12 = true;
                } else if (!z10) {
                    z13 = z11;
                    z12 = false;
                } else {
                    float fB0 = B0(j10, J0());
                    if (Float.isInfinite(fB0) || Float.isNaN(fB0)) {
                        z13 = z11;
                        z12 = false;
                    } else {
                        z12 = true;
                        z13 = false;
                    }
                }
                break;
        }
        if (z12) {
            int i12 = vVar2.f14563c;
            o0.i iVarS = aVar.s();
            int i13 = iVarS.f12343c;
            if (i13 > 0) {
                Object[] objArr = iVarS.f12341a;
                int i14 = i13 - 1;
                while (true) {
                    androidx.compose.ui.node.a aVar2 = (androidx.compose.ui.node.a) objArr[i14];
                    if (aVar2.D()) {
                        int i15 = vVar3.f16473a;
                        x0 x0Var2 = aVar2.C;
                        switch (i15) {
                            case 0:
                                x0Var = x0Var2;
                                aVar2.u(j10, vVar, z10, z13);
                                break;
                            default:
                                x0Var2.f14577c.N0(c1.M, x0Var2.f14577c.H0(j10), vVar, true, z13);
                                x0Var = x0Var2;
                                break;
                        }
                        long jE = vVar.e();
                        if (Float.intBitsToFloat((int) (jE >> 32)) < 0.0f && ((int) (jE & 4294967295L)) != 0) {
                            y0.n nVarM0 = x0Var.f14577c.M0(g.r(16));
                            if (nVarM0 != null && nVarM0.f16742t) {
                                y0.n nVar = nVarM0.f16730a;
                                if (!nVar.f16742t) {
                                    throw new IllegalStateException("visitLocalDescendants called on an unattached node".toString());
                                }
                                if ((nVar.f16733d & 16) != 0) {
                                    y0.n nVar2 = nVar.f16735f;
                                    while (true) {
                                        if (nVar2 != null) {
                                            if ((nVar2.f16732c & 16) != 0) {
                                                ?? F = nVar2;
                                                ?? iVar = 0;
                                                while (true) {
                                                    if (F != 0) {
                                                        if (F instanceof p1) {
                                                            if (((p1) F).P()) {
                                                                vVar2.f14563c = vVar2.f14564d - i11;
                                                            }
                                                        } else if ((F.f16732c & 16) != 0 && (F instanceof o)) {
                                                            y0.n nVar3 = ((o) F).f14521v;
                                                            int i16 = 0;
                                                            while (nVar3 != null) {
                                                                if ((nVar3.f16732c & 16) != 0) {
                                                                    i16++;
                                                                    if (i16 == i11) {
                                                                        F = F;
                                                                        iVar = iVar;
                                                                        iVar = iVar;
                                                                        F = nVar3;
                                                                    } else {
                                                                        if (iVar == 0) {
                                                                            iVar = new o0.i(new y0.n[16]);
                                                                        }
                                                                        if (F != 0) {
                                                                            iVar.c(F);
                                                                            F = 0;
                                                                        }
                                                                        iVar.c(nVar3);
                                                                    }
                                                                } else {
                                                                    F = F;
                                                                    iVar = iVar;
                                                                }
                                                                nVar3 = nVar3.f16735f;
                                                                F = F;
                                                                iVar = iVar;
                                                            }
                                                            if (i16 == i11) {
                                                                F = F;
                                                                iVar = iVar;
                                                            } else {
                                                                F = F;
                                                                iVar = iVar;
                                                            }
                                                        }
                                                        F = g.f(iVar);
                                                    } else {
                                                        continue;
                                                    }
                                                }
                                            }
                                            nVar2 = nVar2.f16735f;
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        objArr = objArr;
                        i12 = i12;
                        i11 = i11;
                        vVar3 = vVar3;
                        vVar2 = vVar2;
                    }
                    i14--;
                    if (i14 >= 0) {
                        objArr = objArr;
                        i12 = i12;
                        i11 = i11;
                        vVar3 = vVar3;
                        vVar2 = vVar2;
                    }
                }
            } else {
                i12 = i12;
                vVar2 = vVar2;
            }
            vVar2.f14563c = i12;
        }
    }

    @Override // r1.p
    public final int Q(int i10) {
        y yVar = this.f14395p.f1751w;
        r1.j0 j0VarA = yVar.a();
        androidx.compose.ui.node.a aVar = yVar.f14583a;
        return j0VarA.d(aVar.C.f14577c, aVar.l(), i10);
    }

    @Override // t1.c1
    public final void U0(e1.p pVar) {
        androidx.compose.ui.node.a aVar = this.f14395p;
        l1 l1VarZ = g.z(aVar);
        o0.i iVarS = aVar.s();
        int i10 = iVarS.f12343c;
        if (i10 > 0) {
            Object[] objArr = iVarS.f12341a;
            int i11 = 0;
            do {
                androidx.compose.ui.node.a aVar2 = (androidx.compose.ui.node.a) objArr[i11];
                if (aVar2.D()) {
                    aVar2.i(pVar);
                }
                i11++;
            } while (i11 < i10);
        }
        if (((u1.w) l1VarZ).getShowLayoutBounds()) {
            D0(pVar, P);
        }
    }

    @Override // r1.p
    public final int V(int i10) {
        y yVar = this.f14395p.f1751w;
        r1.j0 j0VarA = yVar.a();
        androidx.compose.ui.node.a aVar = yVar.f14583a;
        return j0VarA.b(aVar.C.f14577c, aVar.l(), i10);
    }

    @Override // r1.p
    public final int X(int i10) {
        y yVar = this.f14395p.f1751w;
        r1.j0 j0VarA = yVar.a();
        androidx.compose.ui.node.a aVar = yVar.f14583a;
        return j0VarA.c(aVar.C.f14577c, aVar.l(), i10);
    }

    @Override // r1.x0
    public final void d0(long j10, float f10, c9.c cVar) {
        V0(j10, f10, cVar);
        if (this.f14531f) {
            return;
        }
        T0();
        this.f14395p.D.f14508o.w0();
    }

    @Override // r1.i0
    public final r1.x0 f(long j10) {
        h0(j10);
        androidx.compose.ui.node.a aVar = this.f14395p;
        o0.i iVarT = aVar.t();
        int i10 = iVarT.f12343c;
        if (i10 > 0) {
            Object[] objArr = iVarT.f12341a;
            int i11 = 0;
            do {
                ((androidx.compose.ui.node.a) objArr[i11]).D.f14508o.f14483r = 3;
                i11++;
            } while (i11 < i10);
        }
        X0(aVar.f1750v.e(this, aVar.l(), j10));
        S0();
        return this;
    }

    @Override // r1.p
    public final int g(int i10) {
        y yVar = this.f14395p.f1751w;
        r1.j0 j0VarA = yVar.a();
        androidx.compose.ui.node.a aVar = yVar.f14583a;
        return j0VarA.a(aVar.C.f14577c, aVar.l(), i10);
    }

    @Override // t1.q0
    public final int j0(r1.a aVar) {
        r0 r0Var = this.O;
        if (r0Var != null) {
            return r0Var.j0(aVar);
        }
        l0 l0Var = this.f14395p.D.f14508o;
        boolean z10 = l0Var.f14484s;
        h0 h0Var = l0Var.A;
        if (!z10) {
            n0 n0Var = l0Var.L;
            if (n0Var.f14496c == 1) {
                h0Var.f14373f = true;
                if (h0Var.f14369b) {
                    n0Var.f14498e = true;
                    n0Var.f14499f = true;
                }
            } else {
                h0Var.f14374g = true;
            }
        }
        l0Var.l().f14532n = true;
        l0Var.B();
        l0Var.l().f14532n = false;
        Integer num = (Integer) h0Var.f14376i.get(aVar);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }
}
