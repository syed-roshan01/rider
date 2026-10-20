package s1;

import java.util.HashSet;
import t.l0;
import t1.l1;
import t1.o;
import u1.w;
import y0.n;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l1 f13908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o0.i f13909b = new o0.i(new t1.d[16]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o0.i f13910c = new o0.i(new c[16]);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o0.i f13911d = new o0.i(new androidx.compose.ui.node.a[16]);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o0.i f13912e = new o0.i(new c[16]);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f13913f;

    public e(l1 l1Var) {
        this.f13908a = l1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object] */
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
    /* JADX WARN: Type inference failed for: r7v9 */
    public static void b(n nVar, c cVar, HashSet hashSet) {
        n nVar2 = nVar.f16730a;
        if (!nVar2.f16742t) {
            throw new IllegalStateException("visitSubtreeIf called on an unattached node".toString());
        }
        o0.i iVar = new o0.i(new n[16]);
        n nVar3 = nVar2.f16735f;
        if (nVar3 == null) {
            t1.g.b(iVar, nVar2);
        } else {
            iVar.c(nVar3);
        }
        while (iVar.l()) {
            n nVar4 = (n) iVar.n(iVar.f12343c - 1);
            if ((nVar4.f16733d & 32) != 0) {
                n nVar5 = nVar4;
                while (true) {
                    if (nVar5 != null) {
                        if ((nVar5.f16732c & 32) != 0) {
                            ?? F = nVar5;
                            ?? iVar2 = 0;
                            while (F != 0) {
                                if (F instanceof f) {
                                    f fVar = (f) F;
                                    if (fVar instanceof t1.d) {
                                        t1.d dVar = (t1.d) fVar;
                                        if ((dVar.f14406u instanceof d) && dVar.f14408w.contains(cVar)) {
                                            hashSet.add(fVar);
                                        }
                                    }
                                    if (!(!fVar.j().B(cVar))) {
                                        break;
                                    }
                                } else if ((F.f16732c & 32) != 0 && (F instanceof o)) {
                                    n nVar6 = ((o) F).f14521v;
                                    int i10 = 0;
                                    while (nVar6 != null) {
                                        if ((nVar6.f16732c & 32) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                F = F;
                                                iVar2 = iVar2;
                                                iVar2 = iVar2;
                                                F = nVar6;
                                            } else {
                                                if (iVar2 == 0) {
                                                    iVar2 = new o0.i(new n[16]);
                                                }
                                                if (F != 0) {
                                                    iVar2.c(F);
                                                    F = 0;
                                                }
                                                iVar2.c(nVar6);
                                            }
                                        } else {
                                            F = F;
                                            iVar2 = iVar2;
                                        }
                                        nVar6 = nVar6.f16735f;
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
                                F = t1.g.f(iVar2);
                            }
                        }
                        nVar5 = nVar5.f16735f;
                    }
                }
            }
            t1.g.b(iVar, nVar4);
        }
    }

    public final void a() {
        if (this.f13913f) {
            return;
        }
        this.f13913f = true;
        l0 l0Var = new l0(this, 24);
        o0.i iVar = ((w) this.f13908a).f15348u0;
        if (iVar.h(l0Var)) {
            return;
        }
        iVar.c(l0Var);
    }
}
