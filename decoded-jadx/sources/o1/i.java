package o1;

import java.util.ArrayList;
import java.util.List;
import t1.c1;
import t1.p1;

/* JADX INFO: loaded from: classes.dex */
public final class i extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0.n f12380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p1.b f12381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q.l f12382d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c1 f12383e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public k f12384f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f12385g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f12386h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f12387i;

    public i(y0.n nVar) {
        this.f12380b = nVar;
        p1.b bVar = new p1.b();
        bVar.f12744b = new long[2];
        this.f12381c = bVar;
        this.f12382d = new q.l(2);
        this.f12386h = true;
        this.f12387i = true;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x022b  */
    /* JADX WARN: Code duplicated, block: B:106:0x0233  */
    /* JADX WARN: Code duplicated, block: B:126:0x027e  */
    /* JADX WARN: Code duplicated, block: B:97:0x0218  */
    /* JADX WARN: Code duplicated, block: B:99:0x0220  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r5v1, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r5v37, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13, types: [o0.i] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16, types: [o0.i] */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    @Override // o1.j
    public final boolean a(q.l lVar, r1.s sVar, f fVar, boolean z10) {
        q.l lVar2;
        p1.b bVar;
        Object obj;
        boolean z11;
        boolean z12;
        boolean z13;
        k kVar;
        boolean z14;
        int i10;
        i iVar = this;
        boolean zA = super.a(lVar, sVar, fVar, z10);
        ?? F = iVar.f12380b;
        if (!F.f16742t) {
            return true;
        }
        ?? iVar2 = 0;
        while (F != 0) {
            if (F instanceof p1) {
                iVar.f12383e = t1.g.x((p1) F, 16);
            } else if ((F.f16732c & 16) != 0 && (F instanceof t1.o)) {
                y0.n nVar = ((t1.o) F).f14521v;
                int i11 = 0;
                while (nVar != null) {
                    if ((nVar.f16732c & 16) != 0) {
                        i11++;
                        if (i11 == 1) {
                            F = F;
                            iVar2 = iVar2;
                            iVar2 = iVar2;
                            F = nVar;
                        } else {
                            if (iVar2 == 0) {
                                iVar2 = new o0.i(new y0.n[16]);
                            }
                            if (F != 0) {
                                iVar2.c(F);
                                F = 0;
                            }
                            iVar2.c(nVar);
                        }
                    } else {
                        F = F;
                        iVar2 = iVar2;
                    }
                    nVar = nVar.f16735f;
                    F = F;
                    iVar2 = iVar2;
                }
                if (i11 == 1) {
                    F = F;
                    iVar2 = iVar2;
                } else {
                    F = F;
                    iVar2 = iVar2;
                }
            }
            F = t1.g.f(iVar2);
        }
        int iG = lVar.g();
        int i12 = 0;
        while (true) {
            lVar2 = iVar.f12382d;
            bVar = iVar.f12381c;
            if (i12 >= iG) {
                break;
            }
            long jE = lVar.e(i12);
            u uVar = (u) lVar.h(i12);
            int i13 = bVar.f12743a;
            int i14 = 0;
            while (true) {
                if (i14 >= i13) {
                    z14 = zA;
                    i10 = iG;
                    break;
                }
                if (bVar.f12744b[i14] == jE) {
                    List list = uVar.f12424k;
                    List list2 = r8.r.f13661a;
                    if (list == null) {
                        list = list2;
                    }
                    ArrayList arrayList = new ArrayList(list.size());
                    List list3 = uVar.f12424k;
                    if (list3 != null) {
                        list2 = list3;
                    }
                    int size = list2.size();
                    int i15 = 0;
                    while (i15 < size) {
                        d dVar = (d) list2.get(i15);
                        long j10 = dVar.f12351a;
                        int i16 = size;
                        c1 c1Var = iVar.f12383e;
                        d7.a.j(c1Var);
                        arrayList.add(new d(j10, c1Var.o(sVar, dVar.f12352b), dVar.f12353c));
                        i15++;
                        size = i16;
                        list2 = list2;
                        iG = iG;
                        zA = zA;
                        lVar2 = lVar2;
                    }
                    z14 = zA;
                    i10 = iG;
                    c1 c1Var2 = iVar.f12383e;
                    d7.a.j(c1Var2);
                    long jO = c1Var2.o(sVar, uVar.f12420g);
                    c1 c1Var3 = iVar.f12383e;
                    d7.a.j(c1Var3);
                    u uVar2 = new u(uVar.f12414a, uVar.f12415b, c1Var3.o(sVar, uVar.f12416c), uVar.f12417d, uVar.f12418e, uVar.f12419f, jO, uVar.f12421h, uVar.f12422i, arrayList, uVar.f12423j, uVar.f12425l);
                    uVar2.f12426m = uVar.f12426m;
                    lVar2.f(uVar2, jE);
                    break;
                }
                i14++;
                iVar = this;
                sVar = sVar;
            }
            i12++;
            iVar = this;
            iG = i10;
            zA = z14;
        }
        boolean z15 = zA;
        if (lVar2.g() == 0) {
            bVar.f12743a = 0;
            this.f12390a.g();
            return true;
        }
        for (int i17 = bVar.f12743a - 1; -1 < i17; i17--) {
            if (lVar.d(bVar.f12744b[i17]) < 0) {
                bVar.b(i17);
            }
        }
        ArrayList arrayList2 = new ArrayList(lVar2.g());
        int iG2 = lVar2.g();
        for (int i18 = 0; i18 < iG2; i18++) {
            arrayList2.add(lVar2.h(i18));
        }
        k kVar2 = new k(arrayList2, fVar);
        int size2 = arrayList2.size();
        int i19 = 0;
        while (true) {
            if (i19 >= size2) {
                obj = null;
                break;
            }
            obj = arrayList2.get(i19);
            if (fVar.a(((u) obj).f12414a)) {
                break;
            }
            i19++;
        }
        u uVar3 = (u) obj;
        if (uVar3 != null) {
            boolean z16 = uVar3.f12417d;
            if (z10) {
                z11 = false;
                if (!this.f12386h && (z16 || uVar3.f12421h)) {
                    c1 c1Var4 = this.f12383e;
                    d7.a.j(c1Var4);
                    boolean zD = m9.e0.D(uVar3, c1Var4.f13425c);
                    z12 = true;
                    this.f12386h = !zD;
                }
                if (this.f12386h == this.f12385g && (s.t(kVar2.f12399c, 3) || s.t(kVar2.f12399c, 4) || s.t(kVar2.f12399c, 5))) {
                    kVar2.f12399c = this.f12386h ? 4 : 5;
                } else if (!s.t(kVar2.f12399c, 4) && this.f12385g && !this.f12387i) {
                    kVar2.f12399c = 3;
                } else if (s.t(kVar2.f12399c, 5) && this.f12386h && z16) {
                    kVar2.f12399c = 3;
                }
            } else {
                z11 = false;
                this.f12386h = false;
            }
            z12 = true;
            if (this.f12386h == this.f12385g) {
                if (!s.t(kVar2.f12399c, 4)) {
                    if (s.t(kVar2.f12399c, 5)) {
                        kVar2.f12399c = 3;
                    }
                } else if (s.t(kVar2.f12399c, 5)) {
                    kVar2.f12399c = 3;
                }
            } else if (!s.t(kVar2.f12399c, 4)) {
                if (s.t(kVar2.f12399c, 5)) {
                    kVar2.f12399c = 3;
                }
            } else if (s.t(kVar2.f12399c, 5)) {
                kVar2.f12399c = 3;
            }
        } else {
            z11 = false;
            z12 = true;
        }
        if (!z15 && s.t(kVar2.f12399c, 3) && (kVar = this.f12384f) != null) {
            ?? r10 = kVar.f12397a;
            int size3 = r10.size();
            ?? r11 = kVar2.f12397a;
            if (size3 != r11.size()) {
                z13 = z12;
                break;
            }
            int size4 = r11.size();
            ?? r12 = z11;
            while (true) {
                if (r12 >= size4) {
                    z13 = z11;
                    break;
                }
                if (!d1.c.b(((u) r10.get(r12)).f12416c, ((u) r11.get(r12)).f12416c)) {
                    z13 = z12;
                    break;
                }
                r12++;
            }
        } else {
            z13 = z12;
            break;
        }
        this.f12384f = kVar2;
        return z13;
    }

    @Override // o1.j
    public final void b(f fVar) {
        super.b(fVar);
        k kVar = this.f12384f;
        if (kVar == null) {
            return;
        }
        this.f12385g = this.f12386h;
        List list = kVar.f12397a;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            u uVar = (u) list.get(i10);
            if (!uVar.f12417d) {
                long j10 = uVar.f12414a;
                if (!fVar.a(j10) || !this.f12386h) {
                    p1.b bVar = this.f12381c;
                    int i11 = bVar.f12743a;
                    for (int i12 = 0; i12 < i11; i12++) {
                        if (j10 == bVar.f12744b[i12]) {
                            bVar.b(i12);
                            break;
                        }
                    }
                }
            }
        }
        this.f12386h = false;
        this.f12387i = s.t(kVar.f12399c, 5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [o0.i] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [o0.i] */
    /* JADX WARN: Type inference failed for: r5v4 */
    public final void d() {
        o0.i iVar = this.f12390a;
        int i10 = iVar.f12343c;
        if (i10 > 0) {
            Object[] objArr = iVar.f12341a;
            int i11 = 0;
            do {
                ((i) objArr[i11]).d();
                i11++;
            } while (i11 < i10);
        }
        ?? F = this.f12380b;
        ?? iVar2 = 0;
        while (F != 0) {
            if (F instanceof p1) {
                ((p1) F).b0();
            } else if ((F.f16732c & 16) != 0 && (F instanceof t1.o)) {
                y0.n nVar = ((t1.o) F).f14521v;
                int i12 = 0;
                while (nVar != null) {
                    if ((nVar.f16732c & 16) != 0) {
                        i12++;
                        if (i12 == 1) {
                            F = F;
                            iVar2 = iVar2;
                            iVar2 = iVar2;
                            F = nVar;
                        } else {
                            if (iVar2 == 0) {
                                iVar2 = new o0.i(new y0.n[16]);
                            }
                            if (F != 0) {
                                iVar2.c(F);
                                F = 0;
                            }
                            iVar2.c(nVar);
                        }
                    } else {
                        F = F;
                        iVar2 = iVar2;
                    }
                    nVar = nVar.f16735f;
                    F = F;
                    iVar2 = iVar2;
                }
                if (i12 == 1) {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [o0.i] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [o0.i] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public final boolean e(f fVar) {
        o0.i iVar;
        int i10;
        q.l lVar = this.f12382d;
        boolean z10 = false;
        int i11 = 0;
        z10 = false;
        if (!(lVar.g() == 0)) {
            y0.n nVar = this.f12380b;
            if (nVar.f16742t) {
                k kVar = this.f12384f;
                d7.a.j(kVar);
                c1 c1Var = this.f12383e;
                d7.a.j(c1Var);
                long j10 = c1Var.f13425c;
                ?? F = nVar;
                ?? iVar2 = 0;
                while (F != 0) {
                    if (F instanceof p1) {
                        ((p1) F).y(kVar, l.f12402c, j10);
                    } else if ((F.f16732c & 16) != 0 && (F instanceof t1.o)) {
                        y0.n nVar2 = ((t1.o) F).f14521v;
                        int i12 = 0;
                        while (nVar2 != null) {
                            if ((nVar2.f16732c & 16) != 0) {
                                i12++;
                                if (i12 == 1) {
                                    F = F;
                                    iVar2 = iVar2;
                                    iVar2 = iVar2;
                                    F = nVar2;
                                } else {
                                    if (iVar2 == 0) {
                                        iVar2 = new o0.i(new y0.n[16]);
                                    }
                                    if (F != 0) {
                                        iVar2.c(F);
                                        F = 0;
                                    }
                                    iVar2.c(nVar2);
                                }
                            } else {
                                F = F;
                                iVar2 = iVar2;
                            }
                            nVar2 = nVar2.f16735f;
                            F = F;
                            iVar2 = iVar2;
                        }
                        if (i12 == 1) {
                            F = F;
                            iVar2 = iVar2;
                        } else {
                            F = F;
                            iVar2 = iVar2;
                        }
                    }
                    F = t1.g.f(iVar2);
                }
                if (nVar.f16742t && (i10 = (iVar = this.f12390a).f12343c) > 0) {
                    Object[] objArr = iVar.f12341a;
                    do {
                        ((i) objArr[i11]).e(fVar);
                        i11++;
                    } while (i11 < i10);
                }
                z10 = true;
            }
        }
        b(fVar);
        lVar.a();
        this.f12383e = null;
        return z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r0v5, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [o0.i] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [o0.i] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10, types: [o0.i] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [o0.i] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final boolean f(f fVar, boolean z10) {
        o0.i iVar;
        int i10;
        if (this.f12382d.g() == 0) {
            return false;
        }
        ?? F = this.f12380b;
        if (!F.f16742t) {
            return false;
        }
        k kVar = this.f12384f;
        d7.a.j(kVar);
        c1 c1Var = this.f12383e;
        d7.a.j(c1Var);
        long j10 = c1Var.f13425c;
        ?? F2 = F;
        ?? iVar2 = 0;
        while (F2 != 0) {
            if (F2 instanceof p1) {
                ((p1) F2).y(kVar, l.f12400a, j10);
            } else if ((F2.f16732c & 16) != 0 && (F2 instanceof t1.o)) {
                y0.n nVar = ((t1.o) F2).f14521v;
                int i11 = 0;
                while (nVar != null) {
                    if ((nVar.f16732c & 16) != 0) {
                        i11++;
                        if (i11 == 1) {
                            F2 = F2;
                            iVar2 = iVar2;
                            iVar2 = iVar2;
                            F2 = nVar;
                        } else {
                            if (iVar2 == 0) {
                                iVar2 = new o0.i(new y0.n[16]);
                            }
                            if (F2 != 0) {
                                iVar2.c(F2);
                                F2 = 0;
                            }
                            iVar2.c(nVar);
                        }
                    } else {
                        F2 = F2;
                        iVar2 = iVar2;
                    }
                    nVar = nVar.f16735f;
                    F2 = F2;
                    iVar2 = iVar2;
                }
                if (i11 == 1) {
                    F2 = F2;
                    iVar2 = iVar2;
                } else {
                    F2 = F2;
                    iVar2 = iVar2;
                }
            }
            F2 = t1.g.f(iVar2);
        }
        if (F.f16742t && (i10 = (iVar = this.f12390a).f12343c) > 0) {
            Object[] objArr = iVar.f12341a;
            int i12 = 0;
            do {
                i iVar3 = (i) objArr[i12];
                d7.a.j(this.f12383e);
                iVar3.f(fVar, z10);
                i12++;
            } while (i12 < i10);
        }
        if (F.f16742t) {
            ?? iVar4 = 0;
            while (F != 0) {
                if (F instanceof p1) {
                    ((p1) F).y(kVar, l.f12401b, j10);
                } else if ((F.f16732c & 16) != 0 && (F instanceof t1.o)) {
                    y0.n nVar2 = ((t1.o) F).f14521v;
                    int i13 = 0;
                    while (nVar2 != null) {
                        if ((nVar2.f16732c & 16) != 0) {
                            i13++;
                            if (i13 == 1) {
                                F = F;
                                iVar4 = iVar4;
                                iVar4 = iVar4;
                                F = nVar2;
                            } else {
                                if (iVar4 == 0) {
                                    iVar4 = new o0.i(new y0.n[16]);
                                }
                                if (F != 0) {
                                    iVar4.c(F);
                                    F = 0;
                                }
                                iVar4.c(nVar2);
                            }
                        } else {
                            F = F;
                            iVar4 = iVar4;
                        }
                        nVar2 = nVar2.f16735f;
                        F = F;
                        iVar4 = iVar4;
                    }
                    if (i13 == 1) {
                        F = F;
                        iVar4 = iVar4;
                    } else {
                        F = F;
                        iVar4 = iVar4;
                    }
                }
                F = t1.g.f(iVar4);
            }
        }
        return true;
    }

    public final String toString() {
        return "Node(pointerInputFilter=" + this.f12380b + ", children=" + this.f12390a + ", pointerIds=" + this.f12381c + ')';
    }
}
