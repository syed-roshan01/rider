package y1;

import t1.r1;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.compose.ui.node.a f16802a;

    public p(androidx.compose.ui.node.a aVar) {
        this.f16802a = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0064 A[LOOP:0: B:4:0x000e->B:35:0x0064, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:40:0x0067 A[EDGE_INSN: B:40:0x0067->B:36:0x0067 BREAK  A[LOOP:0: B:4:0x000e->B:35:0x0064], SYNTHETIC] */
    public final o a() {
        androidx.compose.ui.node.a aVar = this.f16802a;
        y0.n nVar = aVar.C.f14579e;
        t1.n nVar2 = null;
        if ((nVar.f16733d & 8) != 0) {
            loop0: while (nVar != null) {
                if ((nVar.f16732c & 8) == 0) {
                    if ((nVar.f16733d & 8) != 0) {
                        break;
                        break;
                    }
                    nVar = nVar.f16735f;
                } else {
                    y0.n nVarF = nVar;
                    o0.i iVar = null;
                    while (nVarF != null) {
                        if (nVarF instanceof r1) {
                            nVar2 = nVarF;
                            break loop0;
                        }
                        if ((nVarF.f16732c & 8) != 0 && (nVarF instanceof t1.o)) {
                            int i10 = 0;
                            for (y0.n nVar3 = ((t1.o) nVarF).f14521v; nVar3 != null; nVar3 = nVar3.f16735f) {
                                if ((nVar3.f16732c & 8) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        nVarF = nVar3;
                                    } else {
                                        if (iVar == null) {
                                            iVar = new o0.i(new y0.n[16]);
                                        }
                                        if (nVarF != null) {
                                            iVar.c(nVarF);
                                            nVarF = null;
                                        }
                                        iVar.c(nVar3);
                                    }
                                }
                            }
                            if (i10 == 1) {
                            }
                        }
                        nVarF = t1.g.f(iVar);
                    }
                    if ((nVar.f16733d & 8) != 0) {
                        break;
                    }
                    nVar = nVar.f16735f;
                }
            }
        }
        d7.a.j(nVar2);
        return new o(((y0.n) ((r1) nVar2)).f16730a, false, aVar, new j());
    }
}
