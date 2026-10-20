package t1;

/* JADX INFO: loaded from: classes.dex */
public final class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0.i f14449a = new o0.i(new androidx.compose.ui.node.a[16]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public androidx.compose.ui.node.a[] f14450b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
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
    /* JADX WARN: Type inference failed for: r7v5 */
    public static void a(androidx.compose.ui.node.a aVar) {
        n0 n0Var = aVar.D;
        int i10 = 0;
        if (n0Var.f14496c == 5 && !n0Var.f14498e && !n0Var.f14497d && !aVar.J && aVar.D()) {
            y0.n nVar = aVar.C.f14579e;
            if ((nVar.f16733d & 256) != 0) {
                while (nVar != null) {
                    if ((nVar.f16732c & 256) != 0) {
                        ?? F = nVar;
                        ?? iVar = 0;
                        while (F != 0) {
                            if (F instanceof t) {
                                t tVar = (t) F;
                                tVar.r0(g.x(tVar, 256));
                            } else if ((F.f16732c & 256) != 0 && (F instanceof o)) {
                                y0.n nVar2 = ((o) F).f14521v;
                                int i11 = 0;
                                while (nVar2 != null) {
                                    if ((nVar2.f16732c & 256) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            F = F;
                                            iVar = iVar;
                                            iVar = iVar;
                                            F = nVar2;
                                        } else {
                                            if (iVar == 0) {
                                                iVar = new o0.i(new y0.n[16]);
                                            }
                                            if (F != 0) {
                                                iVar.c(F);
                                                F = 0;
                                            }
                                            iVar.c(nVar2);
                                        }
                                    } else {
                                        F = F;
                                        iVar = iVar;
                                    }
                                    nVar2 = nVar2.f16735f;
                                    F = F;
                                    iVar = iVar;
                                }
                                if (i11 == 1) {
                                    F = F;
                                    iVar = iVar;
                                } else {
                                    F = F;
                                    iVar = iVar;
                                }
                            }
                            F = g.f(iVar);
                        }
                    }
                    if ((nVar.f16733d & 256) == 0) {
                        break;
                    } else {
                        nVar = nVar.f16735f;
                    }
                }
            }
        }
        aVar.I = false;
        o0.i iVarT = aVar.t();
        int i12 = iVarT.f12343c;
        if (i12 > 0) {
            Object[] objArr = iVarT.f12341a;
            do {
                a((androidx.compose.ui.node.a) objArr[i10]);
                i10++;
            } while (i10 < i12);
        }
    }
}
