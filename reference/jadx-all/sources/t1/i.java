package t1;

import m0.m3;
import u1.y2;

/* JADX INFO: loaded from: classes.dex */
public final class i extends d9.j implements c9.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f14442b = new i(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f14443c = new i(3);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f14444d = new i(4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i f14445e = new i(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14446a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i10) {
        super(2);
        this.f14446a = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v2, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [o0.i] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [o0.i] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v5 */
    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        q8.l lVar = q8.l.f13235a;
        switch (this.f14446a) {
            case 0:
                ((Number) obj2).intValue();
                ((l) obj).getClass();
                break;
            case 1:
                ((androidx.compose.ui.node.a) ((l) obj)).U((m2.b) obj2);
                break;
            case 2:
                m2.l lVar2 = (m2.l) obj2;
                androidx.compose.ui.node.a aVar = (androidx.compose.ui.node.a) ((l) obj);
                if (aVar.f1753y != lVar2) {
                    aVar.f1753y = lVar2;
                    aVar.z();
                    androidx.compose.ui.node.a aVarQ = aVar.q();
                    if (aVarQ != null) {
                        aVarQ.x();
                    }
                    aVar.y();
                }
                break;
            case 3:
                ((androidx.compose.ui.node.a) ((l) obj)).W((r1.j0) obj2);
                break;
            case 4:
                ((androidx.compose.ui.node.a) ((l) obj)).X((y0.o) obj2);
                break;
            case 5:
                m0.b0 b0Var = (m0.b0) obj2;
                androidx.compose.ui.node.a aVar2 = (androidx.compose.ui.node.a) ((l) obj);
                aVar2.A = b0Var;
                m3 m3Var = u1.s1.f15275e;
                u0.e eVar = (u0.e) b0Var;
                eVar.getClass();
                aVar2.U((m2.b) d7.t.k0(eVar, m3Var));
                m2.l lVar3 = (m2.l) d7.t.k0(eVar, u1.s1.f15281k);
                if (aVar2.f1753y != lVar3) {
                    aVar2.f1753y = lVar3;
                    aVar2.z();
                    androidx.compose.ui.node.a aVarQ2 = aVar2.q();
                    if (aVarQ2 != null) {
                        aVarQ2.x();
                    }
                    aVar2.y();
                }
                aVar2.Y((y2) d7.t.k0(eVar, u1.s1.f15286p));
                y0.n nVar = aVar2.C.f14579e;
                if ((nVar.f16733d & 32768) != 0) {
                    while (nVar != null) {
                        if ((nVar.f16732c & 32768) != 0) {
                            ?? F = nVar;
                            ?? iVar = 0;
                            while (F != 0) {
                                if (F instanceof m) {
                                    y0.n nVar2 = ((y0.n) ((m) F)).f16730a;
                                    if (nVar2.f16742t) {
                                        g.k(nVar2);
                                    } else {
                                        nVar2.f16739q = true;
                                    }
                                } else if ((F.f16732c & 32768) != 0 && (F instanceof o)) {
                                    y0.n nVar3 = ((o) F).f14521v;
                                    int i10 = 0;
                                    while (nVar3 != null) {
                                        if ((nVar3.f16732c & 32768) != 0) {
                                            i10++;
                                            if (i10 == 1) {
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
                                    if (i10 == 1) {
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
                        if ((nVar.f16733d & 32768) != 0) {
                            nVar = nVar.f16735f;
                        }
                    }
                }
                break;
            default:
                ((androidx.compose.ui.node.a) ((l) obj)).Y((y2) obj2);
                break;
        }
        return lVar;
    }
}
