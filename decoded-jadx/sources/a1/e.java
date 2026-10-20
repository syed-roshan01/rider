package a1;

import android.view.DragEvent;
import d9.q;
import d9.u;
import o0.i;
import q.w;
import t1.g;
import t1.o;
import t1.t1;
import t1.u1;
import u1.s;
import y0.n;

/* JADX INFO: loaded from: classes.dex */
public final class e extends n implements u1, c {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public c f884u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public c f885v;

    @Override // y0.n
    public final void A0() {
        this.f885v = null;
        this.f884u = null;
    }

    public final boolean G0(a aVar) {
        if (!this.f16742t) {
            return false;
        }
        if (this.f885v != null) {
            throw new IllegalStateException("DragAndDropTarget self reference must be null at the start of a drag and drop session".toString());
        }
        this.f885v = (c) s.f15268p.invoke(aVar);
        q qVar = new q();
        g.C(this, new b.g(qVar, aVar, this, 17));
        return qVar.f4948a || this.f885v != null;
    }

    public final boolean H0(a aVar) {
        c cVar = this.f884u;
        if (cVar != null) {
            return ((e) cVar).H0(aVar);
        }
        c cVar2 = this.f885v;
        if (cVar2 != null) {
            return ((e) cVar2).H0(aVar);
        }
        return false;
    }

    public final void I0(a aVar) {
        if (this.f16730a.f16742t) {
            g.C(this, new w(aVar, 28));
            c cVar = this.f885v;
            if (cVar != null) {
                ((e) cVar).I0(aVar);
            }
            this.f885v = null;
            this.f884u = null;
        }
    }

    public final void J0(a aVar) {
        c cVar = this.f885v;
        if (cVar != null) {
            ((e) cVar).J0(aVar);
            return;
        }
        c cVar2 = this.f884u;
        if (cVar2 != null) {
            ((e) cVar2).J0(aVar);
        }
    }

    public final void K0(a aVar) {
        c cVar = this.f885v;
        if (cVar != null) {
            ((e) cVar).K0(aVar);
        }
        c cVar2 = this.f884u;
        if (cVar2 != null) {
            ((e) cVar2).K0(aVar);
        }
        this.f884u = null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:12:0x0039  */
    /* JADX WARN: Code duplicated, block: B:14:0x0046  */
    /* JADX WARN: Code duplicated, block: B:15:0x004a  */
    /* JADX WARN: Code duplicated, block: B:18:0x0053  */
    /* JADX WARN: Code duplicated, block: B:20:0x0063  */
    /* JADX WARN: Code duplicated, block: B:22:0x0066  */
    /* JADX WARN: Code duplicated, block: B:24:0x006b  */
    /* JADX WARN: Code duplicated, block: B:26:0x006f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0073  */
    /* JADX WARN: Code duplicated, block: B:30:0x007f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0086  */
    /* JADX WARN: Code duplicated, block: B:35:0x008d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0092  */
    /* JADX WARN: Code duplicated, block: B:7:0x0020  */
    /* JADX WARN: Code duplicated, block: B:87:0x0143  */
    /* JADX WARN: Code duplicated, block: B:90:0x00de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x00de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x00e3 A[EDGE_INSN: B:92:0x00e3->B:62:0x00e3 BREAK  A[LOOP:0: B:16:0x004d->B:93:0x004d, LOOP_LABEL: LOOP:0: B:16:0x004d->B:93:0x004d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x004d A[EDGE_INSN: B:94:0x004d->B:93:0x004d BREAK  A[LOOP:1: B:21:0x0064->B:60:0x00d9], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0026  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v3, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [o0.i] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [o0.i] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r15v4 */
    public final void L0(a aVar) {
        n nVar;
        boolean z10;
        u uVar;
        d dVar;
        b.g gVar;
        i iVar;
        n nVar2;
        c cVar;
        n nVar3;
        int i10;
        n nVar4;
        ?? r13;
        ?? iVar2;
        ?? F;
        u1 u1Var;
        t1 t1Var;
        c cVar2 = this.f884u;
        if (cVar2 != null) {
            DragEvent dragEvent = aVar.f882a;
            if (d9.i.i(cVar2, d9.i.f(dragEvent.getX(), dragEvent.getY()))) {
                cVar = cVar2;
            } else {
                nVar = this.f16730a;
                z10 = nVar.f16742t;
                if (z10) {
                    uVar = new u();
                    dVar = d.f883a;
                    gVar = new b.g(uVar, this, aVar, 18);
                    if (z10) {
                        throw new IllegalStateException("visitSubtreeIf called on an unattached node".toString());
                    }
                    iVar = new i(new n[16]);
                    nVar2 = nVar.f16735f;
                    if (nVar2 == null) {
                        g.b(iVar, nVar);
                    } else {
                        iVar.c(nVar2);
                    }
                    loop0: while (iVar.l()) {
                        nVar3 = (n) iVar.n(iVar.f12343c - 1);
                        i10 = 262144;
                        if ((nVar3.f16733d & 262144) != 0) {
                            nVar4 = nVar3;
                            while (true) {
                                if (nVar4 != null) {
                                    if ((nVar4.f16732c & i10) != 0) {
                                        r13 = nVar4;
                                        iVar2 = 0;
                                        while (r13 != 0) {
                                            if (r13 instanceof u1) {
                                                u1Var = (u1) r13;
                                                if (d7.a.d(dVar, u1Var.o())) {
                                                    t1Var = (t1) gVar.invoke(u1Var);
                                                } else {
                                                    t1Var = t1.f14554a;
                                                }
                                                if (t1Var == t1.f14556c) {
                                                    if (t1Var == t1.f14555b) {
                                                        break;
                                                    }
                                                } else {
                                                    break loop0;
                                                }
                                            } else {
                                                if ((r13.f16732c & i10) == 0 && (r13 instanceof o)) {
                                                    n nVar5 = ((o) r13).f14521v;
                                                    int i11 = 0;
                                                    while (nVar5 != null) {
                                                        if ((nVar5.f16732c & i10) == 0) {
                                                            F = r13;
                                                            iVar2 = iVar2;
                                                            F = F;
                                                        } else {
                                                            i11++;
                                                            if (i11 == 1) {
                                                                F = r13;
                                                                iVar2 = iVar2;
                                                                F = F;
                                                                F = nVar5;
                                                                F = r13;
                                                                iVar2 = iVar2;
                                                                F = F;
                                                            } else {
                                                                iVar2 = iVar2 == 0 ? new i(new n[16]) : iVar2;
                                                                if (F != 0) {
                                                                    iVar2.c(F);
                                                                    F = 0;
                                                                }
                                                                iVar2.c(nVar5);
                                                            }
                                                        }
                                                        nVar5 = nVar5.f16735f;
                                                        i10 = 262144;
                                                        F = F;
                                                        iVar2 = iVar2;
                                                    }
                                                    if (i11 == 1) {
                                                        F = r13;
                                                        iVar2 = iVar2;
                                                    }
                                                }
                                                i10 = 262144;
                                                r13 = F;
                                                iVar2 = iVar2;
                                            }
                                            F = r13;
                                            iVar2 = iVar2;
                                            F = g.f(iVar2);
                                            i10 = 262144;
                                            r13 = F;
                                            iVar2 = iVar2;
                                        }
                                    }
                                    nVar4 = nVar4.f16735f;
                                    i10 = 262144;
                                }
                            }
                        }
                        g.b(iVar, nVar3);
                    }
                    cVar = (c) uVar.f4952a;
                } else {
                    cVar = null;
                }
            }
        } else {
            nVar = this.f16730a;
            z10 = nVar.f16742t;
            if (z10) {
                cVar = null;
            } else {
                uVar = new u();
                dVar = d.f883a;
                gVar = new b.g(uVar, this, aVar, 18);
                if (z10) {
                    throw new IllegalStateException("visitSubtreeIf called on an unattached node".toString());
                }
                iVar = new i(new n[16]);
                nVar2 = nVar.f16735f;
                if (nVar2 == null) {
                    g.b(iVar, nVar);
                } else {
                    iVar.c(nVar2);
                }
                loop0: while (iVar.l()) {
                    nVar3 = (n) iVar.n(iVar.f12343c - 1);
                    i10 = 262144;
                    if ((nVar3.f16733d & 262144) != 0) {
                        nVar4 = nVar3;
                        while (true) {
                            if (nVar4 != null) {
                                if ((nVar4.f16732c & i10) != 0) {
                                    r13 = nVar4;
                                    iVar2 = 0;
                                    while (r13 != 0) {
                                        if (r13 instanceof u1) {
                                            u1Var = (u1) r13;
                                            if (d7.a.d(dVar, u1Var.o())) {
                                                t1Var = (t1) gVar.invoke(u1Var);
                                            } else {
                                                t1Var = t1.f14554a;
                                            }
                                            if (t1Var == t1.f14556c) {
                                                if (t1Var == t1.f14555b) {
                                                    break;
                                                    break;
                                                }
                                            } else {
                                                break loop0;
                                                break loop0;
                                            }
                                        } else {
                                            if ((r13.f16732c & i10) == 0) {
                                            }
                                            i10 = 262144;
                                            r13 = F;
                                            iVar2 = iVar2;
                                        }
                                        F = r13;
                                        iVar2 = iVar2;
                                        F = g.f(iVar2);
                                        i10 = 262144;
                                        r13 = F;
                                        iVar2 = iVar2;
                                    }
                                }
                                nVar4 = nVar4.f16735f;
                                i10 = 262144;
                            }
                        }
                    }
                    g.b(iVar, nVar3);
                }
                cVar = (c) uVar.f4952a;
            }
        }
        if (cVar != null && cVar2 == null) {
            c cVar3 = this.f885v;
            if (cVar3 != null) {
                ((e) cVar3).K0(aVar);
            }
            e eVar = (e) cVar;
            eVar.J0(aVar);
            eVar.L0(aVar);
        } else if (cVar == null && cVar2 != null) {
            ((e) cVar2).K0(aVar);
            c cVar4 = this.f885v;
            if (cVar4 != null) {
                e eVar2 = (e) cVar4;
                eVar2.J0(aVar);
                eVar2.L0(aVar);
            }
        } else if (!d7.a.d(cVar, cVar2)) {
            if (cVar2 != null) {
                ((e) cVar2).K0(aVar);
            }
            if (cVar != null) {
                e eVar3 = (e) cVar;
                eVar3.J0(aVar);
                eVar3.L0(aVar);
            }
        } else if (cVar != null) {
            ((e) cVar).L0(aVar);
        } else {
            c cVar5 = this.f885v;
            if (cVar5 != null) {
                ((e) cVar5).L0(aVar);
            }
        }
        this.f884u = cVar;
    }

    public final void M0(a aVar) {
        c cVar = this.f885v;
        if (cVar != null) {
            ((e) cVar).M0(aVar);
            return;
        }
        c cVar2 = this.f884u;
        if (cVar2 != null) {
            ((e) cVar2).M0(aVar);
        }
    }

    @Override // t1.u1
    public final Object o() {
        return d.f883a;
    }
}
