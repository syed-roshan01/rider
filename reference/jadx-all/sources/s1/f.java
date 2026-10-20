package s1;

import t1.n;
import t1.o;
import t1.x0;

/* JADX INFO: loaded from: classes.dex */
public interface f extends h, n {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [o0.i] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [o0.i] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r9v0, types: [s1.f, t1.n] */
    @Override // s1.h
    default Object g(i iVar) {
        x0 x0Var;
        y0.n nVar = ((y0.n) this).f16730a;
        boolean z10 = nVar.f16742t;
        if (!z10) {
            throw new IllegalArgumentException("ModifierLocal accessed from an unattached node".toString());
        }
        if (!z10) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        y0.n nVar2 = nVar.f16734e;
        androidx.compose.ui.node.a aVarY = t1.g.y(this);
        while (aVarY != null) {
            if ((aVarY.C.f14579e.f16733d & 32) != 0) {
                while (nVar2 != null) {
                    if ((nVar2.f16732c & 32) != 0) {
                        ?? F = nVar2;
                        ?? iVar2 = 0;
                        while (F != 0) {
                            if (F instanceof f) {
                                f fVar = (f) F;
                                if (fVar.j().B(iVar)) {
                                    return fVar.j().I(iVar);
                                }
                            } else if ((F.f16732c & 32) != 0 && (F instanceof o)) {
                                y0.n nVar3 = ((o) F).f14521v;
                                int i10 = 0;
                                F = F;
                                iVar2 = iVar2;
                                while (nVar3 != null) {
                                    if ((nVar3.f16732c & 32) != 0) {
                                        i10++;
                                        if (i10 == 1) {
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
                                    }
                                    nVar3 = nVar3.f16735f;
                                    F = F;
                                    iVar2 = iVar2;
                                }
                                if (i10 == 1) {
                                }
                            }
                            F = t1.g.f(iVar2);
                        }
                    }
                    nVar2 = nVar2.f16734e;
                }
            }
            aVarY = aVarY.q();
            nVar2 = (aVarY == null || (x0Var = aVarY.C) == null) ? null : x0Var.f14578d;
        }
        return iVar.f13907a.invoke();
    }

    default f6.a j() {
        return b.f13906z;
    }
}
