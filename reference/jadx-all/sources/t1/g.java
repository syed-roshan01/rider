package t1;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f14435a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m2.c f14436b = new m2.c(1.0f, 1.0f);

    public static final l1 A(n nVar) {
        l1 l1Var = y(nVar).f1744p;
        if (l1Var != null) {
            return l1Var;
        }
        throw new IllegalStateException("This node does not have an owner.".toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, t1.n, t1.u1] */
    /* JADX WARN: Type inference failed for: r11v0, types: [o1.n] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [o0.i] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [o0.i] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public static final void B(u1 u1Var, o1.n nVar) {
        x0 x0Var;
        y0.n nVar2 = ((y0.n) u1Var).f16730a;
        if (!nVar2.f16742t) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        y0.n nVar3 = nVar2.f16734e;
        androidx.compose.ui.node.a aVarY = y(u1Var);
        while (aVarY != null) {
            if ((aVarY.C.f14579e.f16733d & 262144) != 0) {
                while (nVar3 != null) {
                    if ((nVar3.f16732c & 262144) != 0) {
                        ?? F = nVar3;
                        ?? iVar = 0;
                        while (F != 0) {
                            if (F instanceof u1) {
                                u1 u1Var2 = (u1) F;
                                if (d7.a.d(u1Var.o(), u1Var2.o()) && d9.i.l(u1Var, u1Var2) && !((Boolean) nVar.invoke(u1Var2)).booleanValue()) {
                                    return;
                                }
                            } else if ((F.f16732c & 262144) != 0 && (F instanceof o)) {
                                y0.n nVar4 = ((o) F).f14521v;
                                int i10 = 0;
                                F = F;
                                iVar = iVar;
                                while (nVar4 != null) {
                                    if ((nVar4.f16732c & 262144) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            iVar = iVar;
                                            F = nVar4;
                                        } else {
                                            if (iVar == 0) {
                                                iVar = new o0.i(new y0.n[16]);
                                            }
                                            if (F != 0) {
                                                iVar.c(F);
                                                F = 0;
                                            }
                                            iVar.c(nVar4);
                                        }
                                    }
                                    nVar4 = nVar4.f16735f;
                                    F = F;
                                    iVar = iVar;
                                }
                                if (i10 == 1) {
                                }
                            }
                            F = f(iVar);
                        }
                    }
                    nVar3 = nVar3.f16734e;
                }
            }
            aVarY = aVarY.q();
            nVar3 = (aVarY == null || (x0Var = aVarY.C) == null) ? null : x0Var.f14578d;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v7, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r0v8, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r0v9, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, t1.u1] */
    /* JADX WARN: Type inference failed for: r11v0, types: [c9.c] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [o0.i] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [o0.i] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v7 */
    public static final void C(u1 u1Var, c9.c cVar) {
        y0.n nVar = ((y0.n) u1Var).f16730a;
        if (!nVar.f16742t) {
            throw new IllegalStateException("visitChildren called on an unattached node".toString());
        }
        o0.i iVar = new o0.i(new y0.n[16]);
        y0.n nVar2 = nVar.f16735f;
        if (nVar2 == null) {
            b(iVar, nVar);
        } else {
            iVar.c(nVar2);
        }
        while (iVar.l()) {
            ?? F = (y0.n) iVar.n(iVar.f12343c - 1);
            if ((F.f16733d & 262144) == 0) {
                b(iVar, F);
            } else {
                while (F != 0) {
                    if ((F.f16732c & 262144) != 0) {
                        ?? iVar2 = 0;
                        while (F != 0) {
                            if (F instanceof u1) {
                                u1 u1Var2 = (u1) F;
                                if (d7.a.d(u1Var.o(), u1Var2.o()) && d9.i.l(u1Var, u1Var2) && !((Boolean) cVar.invoke(u1Var2)).booleanValue()) {
                                    return;
                                }
                            } else if ((F.f16732c & 262144) != 0 && (F instanceof o)) {
                                y0.n nVar3 = ((o) F).f14521v;
                                int i10 = 0;
                                while (nVar3 != null) {
                                    if ((nVar3.f16732c & 262144) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            F = F;
                                            iVar2 = iVar2;
                                            iVar2 = iVar2;
                                            F = nVar3;
                                        } else {
                                            if (iVar2 == 0) {
                                                iVar2 = new o0.i(new y0.n[16]);
                                            }
                                            if (F != 0) {
                                                iVar2.c(F);
                                                F = 0;
                                            }
                                            iVar2.c(nVar3);
                                        }
                                    } else {
                                        F = F;
                                        iVar2 = iVar2;
                                    }
                                    nVar3 = nVar3.f16735f;
                                    F = F;
                                    iVar2 = iVar2;
                                }
                                if (i10 == 1) {
                                    F = F;
                                    iVar2 = iVar2;
                                } else {
                                    F = F;
                                    iVar2 = iVar2;
                                }
                            }
                            F = f(iVar2);
                        }
                        break;
                    }
                    F = F.f16735f;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, t1.u1] */
    /* JADX WARN: Type inference failed for: r13v0, types: [c9.c] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [o0.i] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [o0.i] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public static final void D(u1 u1Var, c9.c cVar) {
        y0.n nVar = ((y0.n) u1Var).f16730a;
        if (!nVar.f16742t) {
            throw new IllegalStateException("visitSubtreeIf called on an unattached node".toString());
        }
        o0.i iVar = new o0.i(new y0.n[16]);
        y0.n nVar2 = nVar.f16735f;
        if (nVar2 == null) {
            b(iVar, nVar);
        } else {
            iVar.c(nVar2);
        }
        while (iVar.l()) {
            y0.n nVar3 = (y0.n) iVar.n(iVar.f12343c - 1);
            if ((nVar3.f16733d & 262144) != 0) {
                y0.n nVar4 = nVar3;
                while (true) {
                    if (nVar4 != null) {
                        if ((nVar4.f16732c & 262144) != 0) {
                            ?? F = nVar4;
                            ?? iVar2 = 0;
                            while (F != 0) {
                                if (F instanceof u1) {
                                    u1 u1Var2 = (u1) F;
                                    t1 t1Var = (d7.a.d(u1Var.o(), u1Var2.o()) && d9.i.l(u1Var, u1Var2)) ? (t1) cVar.invoke(u1Var2) : t1.f14554a;
                                    if (t1Var != t1.f14556c) {
                                        if (t1Var == t1.f14555b) {
                                            break;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if ((F.f16732c & 262144) != 0 && (F instanceof o)) {
                                    y0.n nVar5 = ((o) F).f14521v;
                                    int i10 = 0;
                                    while (nVar5 != null) {
                                        if ((nVar5.f16732c & 262144) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                F = F;
                                                iVar2 = iVar2;
                                                iVar2 = iVar2;
                                                F = nVar5;
                                            } else {
                                                if (iVar2 == 0) {
                                                    iVar2 = new o0.i(new y0.n[16]);
                                                }
                                                if (F != 0) {
                                                    iVar2.c(F);
                                                    F = 0;
                                                }
                                                iVar2.c(nVar5);
                                            }
                                        } else {
                                            F = F;
                                            iVar2 = iVar2;
                                        }
                                        nVar5 = nVar5.f16735f;
                                        F = F;
                                        iVar2 = iVar2;
                                    }
                                    if (i10 == 1) {
                                        F = F;
                                        iVar2 = iVar2;
                                    } else {
                                        F = F;
                                        iVar2 = iVar2;
                                    }
                                }
                                F = f(iVar2);
                            }
                        }
                        nVar4 = nVar4.f16735f;
                    }
                }
            }
            b(iVar, nVar3);
        }
    }

    public static final long a(float f10, boolean z10) {
        return ((z10 ? 1L : 0L) & 4294967295L) | (((long) Float.floatToIntBits(f10)) << 32);
    }

    public static final void b(o0.i iVar, y0.n nVar) {
        o0.i iVarT = y(nVar).t();
        int i10 = iVarT.f12343c;
        if (i10 > 0) {
            int i11 = i10 - 1;
            Object[] objArr = iVarT.f12341a;
            do {
                iVar.c(((androidx.compose.ui.node.a) objArr[i11]).C.f14579e);
                i11--;
            } while (i11 >= 0);
        }
    }

    public static final int c(q0 q0Var, r1.a aVar) {
        long j10;
        q0 q0VarM0 = q0Var.m0();
        if (q0VarM0 == null) {
            throw new IllegalStateException(("Child of " + q0Var + " cannot be null when calculating alignment line").toString());
        }
        if (q0Var.s0().d().containsKey(aVar)) {
            Integer num = (Integer) q0Var.s0().d().get(aVar);
            if (num != null) {
                return num.intValue();
            }
            return Integer.MIN_VALUE;
        }
        int iP = q0VarM0.p(aVar);
        if (iP == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        q0VarM0.f14531f = true;
        q0Var.f14532n = true;
        q0Var.x0();
        q0VarM0.f14531f = false;
        q0Var.f14532n = false;
        if (aVar instanceof r1.o) {
            long jV0 = q0VarM0.v0();
            int i10 = m2.i.f11808c;
            j10 = jV0 & 4294967295L;
        } else {
            long jV1 = q0VarM0.v0();
            int i11 = m2.i.f11808c;
            j10 = jV1 >> 32;
        }
        return iP + ((int) j10);
    }

    public static final boolean d(d dVar) {
        s1 s1Var = y(dVar).C.f14578d;
        d7.a.k(s1Var, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode");
        return s1Var.f14545u;
    }

    public static final y0.n e(n nVar, int i10) {
        y0.n nVar2 = ((y0.n) nVar).f16730a.f16735f;
        if (nVar2 == null || (nVar2.f16733d & i10) == 0) {
            return null;
        }
        while (nVar2 != null) {
            int i11 = nVar2.f16732c;
            if ((i11 & 2) != 0) {
                return null;
            }
            if ((i11 & i10) != 0) {
                return nVar2;
            }
            nVar2 = nVar2.f16735f;
        }
        return null;
    }

    public static final y0.n f(o0.i iVar) {
        if (iVar == null || iVar.k()) {
            return null;
        }
        return (y0.n) iVar.n(iVar.f12343c - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final b0 g(y0.n nVar) {
        if ((nVar.f16732c & 2) != 0) {
            if (nVar instanceof b0) {
                return (b0) nVar;
            }
            if (nVar instanceof o) {
                y0.n nVar2 = ((o) nVar).f14521v;
                while (nVar2 != 0) {
                    if (nVar2 instanceof b0) {
                        return (b0) nVar2;
                    }
                    nVar2 = (!(nVar2 instanceof o) || (nVar2.f16732c & 2) == 0) ? nVar2.f16735f : ((o) nVar2).f14521v;
                }
            }
        }
        return null;
    }

    public static final void h(y0.n nVar) {
        if (!nVar.f16742t) {
            throw new IllegalStateException("autoInvalidateInsertedNode called on unattached node".toString());
        }
        i(nVar, -1, 1);
    }

    public static final void i(y0.n nVar, int i10, int i11) {
        if (!(nVar instanceof o)) {
            j(nVar, i10 & nVar.f16732c, i11);
            return;
        }
        o oVar = (o) nVar;
        j(nVar, oVar.f14520u & i10, i11);
        int i12 = (~oVar.f14520u) & i10;
        for (y0.n nVar2 = oVar.f14521v; nVar2 != null; nVar2 = nVar2.f16735f) {
            i(nVar2, i12, i11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void j(y0.n nVar, int i10, int i11) {
        if (i11 != 0 || nVar.w0()) {
            if ((i10 & 2) != 0 && (nVar instanceof b0)) {
                t((b0) nVar);
                if (i11 == 2) {
                    c1 c1VarX = x(nVar, 2);
                    c1VarX.f14398s = true;
                    c1VarX.F.invoke();
                    if (c1VarX.H != null) {
                        c1VarX.c1(null, false);
                    }
                }
            }
            if ((i10 & 256) != 0 && (nVar instanceof t)) {
                y(nVar).z();
            }
            if ((i10 & 4) != 0 && (nVar instanceof s)) {
                s((s) nVar);
            }
            if ((i10 & 8) != 0 && (nVar instanceof r1)) {
                u((r1) nVar);
            }
            if ((i10 & 64) != 0 && (nVar instanceof o1)) {
                n0 n0Var = y((o1) nVar).D;
                n0Var.f14508o.f14488w = true;
                k0 k0Var = n0Var.f14509p;
                if (k0Var != null) {
                    k0Var.A = true;
                }
            }
            if ((i10 & 1024) != 0 && (nVar instanceof c1.p)) {
                if (i11 == 2) {
                    nVar.B0();
                } else {
                    c1.d dVar = ((c1.f) ((u1.w) A(nVar)).getFocusOwner()).f2882b;
                    dVar.a(dVar.f2877b, (c1.p) nVar);
                }
            }
            if ((i10 & 2048) != 0 && (nVar instanceof c1.j)) {
                c1.j jVar = (c1.j) nVar;
                h.f14440b = null;
                jVar.s0(h.f14439a);
                if (h.f14440b != null) {
                    if (i11 == 2) {
                        y0.n nVar2 = ((y0.n) jVar).f16730a;
                        if (!nVar2.f16742t) {
                            throw new IllegalStateException("visitChildren called on an unattached node".toString());
                        }
                        o0.i iVar = new o0.i(new y0.n[16]);
                        y0.n nVar3 = nVar2.f16735f;
                        if (nVar3 == null) {
                            b(iVar, nVar2);
                        } else {
                            iVar.c(nVar3);
                        }
                        while (iVar.l()) {
                            y0.n nVarF = (y0.n) iVar.n(iVar.f12343c - 1);
                            if ((nVarF.f16733d & 1024) == 0) {
                                b(iVar, nVarF);
                            } else {
                                while (nVarF != null) {
                                    if ((nVarF.f16732c & 1024) != 0) {
                                        o0.i iVar2 = null;
                                        while (nVarF != null) {
                                            if (nVarF instanceof c1.p) {
                                                c1.p pVar = (c1.p) nVarF;
                                                c1.d dVar2 = ((c1.f) ((u1.w) A(pVar)).getFocusOwner()).f2882b;
                                                dVar2.a(dVar2.f2877b, pVar);
                                            } else if ((nVarF.f16732c & 1024) != 0 && (nVarF instanceof o)) {
                                                int i12 = 0;
                                                for (y0.n nVar4 = ((o) nVarF).f14521v; nVar4 != null; nVar4 = nVar4.f16735f) {
                                                    if ((nVar4.f16732c & 1024) != 0) {
                                                        i12++;
                                                        if (i12 == 1) {
                                                            nVarF = nVar4;
                                                        } else {
                                                            if (iVar2 == null) {
                                                                iVar2 = new o0.i(new y0.n[16]);
                                                            }
                                                            if (nVarF != null) {
                                                                iVar2.c(nVarF);
                                                                nVarF = null;
                                                            }
                                                            iVar2.c(nVar4);
                                                        }
                                                    }
                                                }
                                                if (i12 == 1) {
                                                }
                                            }
                                            nVarF = f(iVar2);
                                        }
                                        break;
                                    }
                                    nVarF = nVarF.f16735f;
                                }
                            }
                        }
                    } else {
                        c1.d dVar3 = ((c1.f) ((u1.w) A(jVar)).getFocusOwner()).f2882b;
                        dVar3.a(dVar3.f2879d, jVar);
                    }
                }
            }
            if ((i10 & 4096) == 0 || !(nVar instanceof c1.c)) {
                return;
            }
            androidx.compose.ui.focus.a.q((c1.c) nVar);
        }
    }

    public static final void k(y0.n nVar) {
        if (!nVar.f16742t) {
            throw new IllegalStateException("autoInvalidateUpdatedNode called on unattached node".toString());
        }
        i(nVar, -1, 0);
    }

    public static final int l(y0.m mVar) {
        int i10 = mVar instanceof r1.v ? 3 : 1;
        if (mVar instanceof b1.f) {
            i10 |= 4;
        }
        if (mVar instanceof y1.k) {
            i10 |= 8;
        }
        if ((mVar instanceof s1.d) || (mVar instanceof s1.g)) {
            i10 |= 32;
        }
        if (mVar instanceof r1.q0) {
            i10 |= 256;
        }
        if (mVar instanceof r1.u0) {
            i10 |= 64;
        }
        return mVar instanceof r1.s0 ? i10 | 128 : i10;
    }

    public static final int m(y0.n nVar) {
        int i10 = nVar.f16732c;
        if (i10 != 0) {
            return i10;
        }
        int i11 = nVar instanceof b0 ? 3 : 1;
        if (nVar instanceof s) {
            i11 |= 4;
        }
        if (nVar instanceof r1) {
            i11 |= 8;
        }
        if (nVar instanceof p1) {
            i11 |= 16;
        }
        if (nVar instanceof s1.f) {
            i11 |= 32;
        }
        if (nVar instanceof o1) {
            i11 |= 64;
        }
        if (nVar instanceof a0) {
            i11 |= 128;
        }
        if (nVar instanceof t) {
            i11 |= 256;
        }
        if (nVar instanceof c1.p) {
            i11 |= 1024;
        }
        if (nVar instanceof c1.j) {
            i11 |= 2048;
        }
        if (nVar instanceof c1.c) {
            i11 |= 4096;
        }
        if (nVar instanceof m1.c) {
            i11 |= 8192;
        }
        if (nVar instanceof q1.a) {
            i11 |= 16384;
        }
        if (nVar instanceof m) {
            i11 |= 32768;
        }
        return nVar instanceof u1 ? i11 | 262144 : i11;
    }

    public static final int n(y0.n nVar) {
        if (!(nVar instanceof o)) {
            return m(nVar);
        }
        o oVar = (o) nVar;
        int iN = oVar.f14520u;
        for (y0.n nVar2 = oVar.f14521v; nVar2 != null; nVar2 = nVar2.f16735f) {
            iN |= n(nVar2);
        }
        return iN;
    }

    public static final int o(long j10, long j11) {
        boolean z10 = ((int) (j10 & 4294967295L)) != 0;
        if (z10 != (((int) (4294967295L & j11)) != 0)) {
            return z10 ? -1 : 1;
        }
        return (int) Math.signum(Float.intBitsToFloat((int) (j10 >> 32)) - Float.intBitsToFloat((int) (j11 >> 32)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object p(m mVar, m0.u1 u1Var) {
        if (!((y0.n) mVar).f16730a.f16742t) {
            throw new IllegalStateException("Cannot read CompositionLocal because the Modifier node is not currently attached.".toString());
        }
        u0.e eVar = (u0.e) y(mVar).A;
        eVar.getClass();
        return d7.t.k0(eVar, u1Var);
    }

    public static final int q(int[] iArr) {
        return Math.min(iArr[2] - iArr[0], iArr[3] - iArr[1]);
    }

    public static final boolean r(int i10) {
        return (i10 & 128) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void s(s sVar) {
        if (((y0.n) sVar).f16730a.f16742t) {
            x(sVar, 1).P0();
        }
    }

    public static final void t(b0 b0Var) {
        y(b0Var).z();
    }

    public static final void u(r1 r1Var) {
        y(r1Var).A();
    }

    public static final boolean v(androidx.compose.ui.node.a aVar) {
        if (aVar.f1738c != null) {
            androidx.compose.ui.node.a aVarQ = aVar.q();
            if ((aVarQ != null ? aVarQ.f1738c : null) == null || aVar.D.f14495b) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void w(y0.n nVar, c9.a aVar) {
        g1 g1Var = nVar.f16736n;
        if (g1Var == null) {
            g1Var = new g1((f1) nVar);
            nVar.f16736n = g1Var;
        }
        ((u1.w) A(nVar)).getSnapshotObserver().a(g1Var, f.f14424r, aVar);
    }

    public static final c1 x(n nVar, int i10) {
        c1 c1Var = ((y0.n) nVar).f16730a.f16737o;
        d7.a.j(c1Var);
        if (c1Var.K0() != nVar || !r(i10)) {
            return c1Var;
        }
        c1 c1Var2 = c1Var.f14396q;
        d7.a.j(c1Var2);
        return c1Var2;
    }

    public static final androidx.compose.ui.node.a y(n nVar) {
        c1 c1Var = ((y0.n) nVar).f16730a.f16737o;
        if (c1Var != null) {
            return c1Var.f14395p;
        }
        throw new IllegalStateException("Cannot obtain node coordinator. Is the Modifier.Node attached?".toString());
    }

    public static final l1 z(androidx.compose.ui.node.a aVar) {
        l1 l1Var = aVar.f1744p;
        if (l1Var != null) {
            return l1Var;
        }
        throw new IllegalStateException("LayoutNode should be attached to an owner".toString());
    }
}
