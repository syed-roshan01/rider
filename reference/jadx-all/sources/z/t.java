package z;

import java.util.ArrayList;
import java.util.List;
import k0.y0;
import r1.i1;
import r1.k0;
import v.h1;
import y.t0;

/* JADX INFO: loaded from: classes.dex */
public final class t extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0 f17137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f17138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t0 f17139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f17140d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c9.a f17141e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y.i f17142f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ y.g f17143n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f17144o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ y0.b f17145p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ y0.c f17146q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(g0 g0Var, boolean z10, t0 t0Var, boolean z11, j9.e eVar, y.i iVar, y.g gVar, int i10, y0.b bVar, y0.c cVar) {
        super(2);
        this.f17137a = g0Var;
        this.f17138b = z10;
        this.f17139c = t0Var;
        this.f17140d = z11;
        this.f17141e = eVar;
        this.f17142f = iVar;
        this.f17143n = gVar;
        this.f17144o = i10;
        this.f17145p = bVar;
        this.f17146q = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:278:0x05df  */
    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        int iJ;
        int iJ2;
        float fA;
        long jC;
        int i10;
        int i11;
        int i12;
        x xVar;
        int i13;
        int i14;
        List arrayList;
        int i15;
        int i16;
        ArrayList arrayList2;
        List arrayList3;
        r8.l lVar;
        int i17;
        g0 g0Var;
        ArrayList arrayList4;
        w wVar;
        int[] iArr;
        k kVar;
        float f10;
        x xVar2;
        Object obj3;
        int i18;
        Object obj4;
        int iMin;
        int i19;
        x xVar3;
        Object obj5;
        int i20;
        a0.w wVar2 = (a0.w) obj;
        long j10 = ((m2.a) obj2).f11792a;
        g0 g0Var2 = this.f17137a;
        boolean z10 = g0Var2.f17045a;
        z zVar = g0Var2.f17047c;
        boolean z11 = true;
        boolean z12 = z10 || ((a0.x) wVar2).f870b.q();
        h1 h1Var = h1.f15594b;
        h1 h1Var2 = h1.f15593a;
        boolean z13 = this.f17138b;
        if (z13) {
            h1Var = h1Var2;
        }
        androidx.compose.foundation.a.h(j10, h1Var);
        t0 t0Var = this.f17139c;
        if (z13) {
            a0.x xVar4 = (a0.x) wVar2;
            iJ = xVar4.f870b.J(t0Var.a(xVar4.f870b.getLayoutDirection()));
        } else {
            a0.x xVar5 = (a0.x) wVar2;
            iJ = xVar5.f870b.J(androidx.compose.foundation.layout.a.f(t0Var, xVar5.f870b.getLayoutDirection()));
        }
        if (z13) {
            a0.x xVar6 = (a0.x) wVar2;
            iJ2 = xVar6.f870b.J(t0Var.b(xVar6.f870b.getLayoutDirection()));
        } else {
            a0.x xVar7 = (a0.x) wVar2;
            iJ2 = xVar7.f870b.J(androidx.compose.foundation.layout.a.e(t0Var, xVar7.f870b.getLayoutDirection()));
        }
        a0.x xVar8 = (a0.x) wVar2;
        int iJ3 = xVar8.f870b.J(t0Var.d());
        float fC = t0Var.c();
        i1 i1Var = xVar8.f870b;
        int iJ4 = i1Var.J(fC);
        int i21 = iJ3 + iJ4;
        int i22 = iJ + iJ2;
        int i23 = z13 ? i21 : i22;
        boolean z14 = this.f17140d;
        if (z13 && !z14) {
            iJ2 = iJ3;
        } else if (z13 && z14) {
            iJ2 = iJ4;
        } else if (!z13 && !z14) {
            iJ2 = iJ;
        }
        int i24 = i23 - iJ2;
        int i25 = iJ2;
        long jA0 = o1.s.a0(j10, -i22, -i21);
        g0Var2.f17051g = wVar2;
        m mVar = (m) this.f17141e.invoke();
        c cVar = mVar.f17093c;
        int i26 = m2.a.i(jA0);
        int iH = m2.a.h(jA0);
        cVar.f17020a.f(i26);
        cVar.f17021b.f(iH);
        y.g gVar = this.f17143n;
        y.i iVar = this.f17142f;
        if (z13) {
            if (iVar == null) {
                throw new IllegalArgumentException("null verticalArrangement when isVertical == true".toString());
            }
            fA = iVar.a();
        } else {
            if (gVar == null) {
                throw new IllegalArgumentException("null horizontalAlignment when isVertical == false".toString());
            }
            fA = gVar.a();
        }
        int iJ5 = i1Var.J(fA);
        int i27 = mVar.f17092b.f0().f849b;
        int iH2 = z13 ? m2.a.h(j10) - i21 : m2.a.i(j10) - i22;
        if (!z14 || iH2 > 0) {
            jC = i1.b.c(iJ, iJ3);
        } else {
            if (!z13) {
                iJ += iH2;
            }
            jC = i1.b.c(iJ, z13 ? iJ3 + iH2 : iJ3);
        }
        int i28 = iH2;
        s sVar = new s(jA0, this.f17138b, mVar, wVar2, i27, iJ5, this.f17145p, this.f17146q, this.f17140d, i25, i24, jC, this.f17137a);
        g0 g0Var3 = g0Var2;
        g0Var3.f17062r = sVar.f17125c;
        w0.i iVarC = y0.c();
        try {
            w0.i iVarJ = iVarC.j();
            try {
                int iD = zVar.f17180a.d();
                int iF = f6.a.F(mVar, zVar.f17183d, iD);
                if (iD != iF) {
                    zVar.f17180a.f(iF);
                    zVar.f17184e.b(iD);
                }
                int iD2 = zVar.f17181b.d();
                w0.i.p(iVarJ);
                iVarC.c();
                List listP = f6.a.p(mVar, g0Var3.f17063s, g0Var3.f17061q);
                float fFloatValue = (i1Var.q() || !z12) ? g0Var3.f17050f : ((Number) g0Var3.f17069y.f14264b.getValue()).floatValue();
                boolean z15 = this.f17138b;
                r8.r rVar = r8.r.f13661a;
                j jVar = g0Var3.f17060p;
                boolean zQ = i1Var.q();
                w wVar3 = g0Var3.f17046b;
                if (g0Var3.f17068x == null) {
                    throw new IllegalArgumentException("coroutineScope should be not null".toString());
                }
                int i29 = iD2;
                r rVar2 = new r(wVar2, j10, i22, i21, 0);
                if (i25 < 0) {
                    throw new IllegalArgumentException("invalid beforeContentPadding".toString());
                }
                if (i24 < 0) {
                    throw new IllegalArgumentException("invalid afterContentPadding".toString());
                }
                if (i27 <= 0) {
                    int iK = m2.a.k(jA0);
                    int iJ6 = m2.a.j(jA0);
                    jVar.a(0, iK, iJ6, new ArrayList(), sVar, z15, zQ, z12);
                    wVar = new w(null, 0, false, 0.0f, (k0) rVar2.e(Integer.valueOf(iK), Integer.valueOf(iJ6), v.f17147b), 0.0f, false, rVar, -i25, i28 + i24, 0, iJ5);
                    g0Var = g0Var3;
                } else {
                    if (iF >= i27) {
                        iF = i27 - 1;
                        i29 = 0;
                    }
                    int iP0 = d7.t.p0(fFloatValue);
                    int i30 = i29 - iP0;
                    if (iF == 0 && i30 < 0) {
                        iP0 += i30;
                        i30 = 0;
                    }
                    r8.l lVar2 = new r8.l();
                    int i31 = iF;
                    int i32 = -i25;
                    r rVar3 = rVar2;
                    int i33 = i32 + (iJ5 < 0 ? iJ5 : 0);
                    int i34 = i30 + i33;
                    int iMax = 0;
                    while (i34 < 0 && i31 > 0) {
                        g0 g0Var4 = g0Var3;
                        int i35 = i31 - 1;
                        j jVar2 = jVar;
                        x xVarA = sVar.a(i35);
                        i31 = i35;
                        lVar2.add(0, xVarA);
                        iMax = Math.max(iMax, xVarA.f17176p);
                        i34 += xVarA.f17175o;
                        jVar = jVar2;
                        g0Var3 = g0Var4;
                    }
                    g0 g0Var5 = g0Var3;
                    j jVar3 = jVar;
                    if (i34 < i33) {
                        iP0 += i34;
                        i34 = i33;
                    }
                    int i36 = i34 - i33;
                    int i37 = i28 + i24;
                    int i38 = i37 < 0 ? 0 : i37;
                    int i39 = i36;
                    int i40 = iMax;
                    int i41 = -i36;
                    int i42 = i31;
                    int i43 = 0;
                    boolean z16 = false;
                    while (i43 < lVar2.f13657c) {
                        if (i41 >= i38) {
                            lVar2.i(i43);
                            z16 = true;
                        } else {
                            i42++;
                            i41 += ((x) lVar2.get(i43)).f17175o;
                            i43++;
                        }
                    }
                    boolean z17 = z16;
                    int i44 = i42;
                    int iMax2 = i40;
                    while (i44 < i27 && (i41 < i38 || i41 <= 0 || lVar2.isEmpty())) {
                        int i45 = i38;
                        x xVarA2 = sVar.a(i44);
                        boolean z18 = z15;
                        int i46 = xVarA2.f17175o;
                        int i47 = i41 + i46;
                        if (i47 <= i33) {
                            i20 = i47;
                            if (i44 != i27 - 1) {
                                i39 -= i46;
                                i31 = i44 + 1;
                                z17 = true;
                            }
                            i44++;
                            i38 = i45;
                            z15 = z18;
                            i41 = i20;
                        } else {
                            i20 = i47;
                        }
                        int iMax3 = Math.max(iMax2, xVarA2.f17176p);
                        lVar2.addLast(xVarA2);
                        iMax2 = iMax3;
                        i44++;
                        i38 = i45;
                        z15 = z18;
                        i41 = i20;
                    }
                    boolean z19 = z15;
                    if (i41 < i28) {
                        int i48 = i28 - i41;
                        i41 += i48;
                        i12 = i39 - i48;
                        while (i12 < i25 && i31 > 0) {
                            int i49 = i31 - 1;
                            int i50 = i44;
                            x xVarA3 = sVar.a(i49);
                            i31 = i49;
                            lVar2.add(0, xVarA3);
                            iMax2 = Math.max(iMax2, xVarA3.f17176p);
                            i12 += xVarA3.f17175o;
                            i44 = i50;
                        }
                        i10 = i44;
                        i11 = i48 + iP0;
                        if (i12 < 0) {
                            i11 += i12;
                            i41 += i12;
                            i12 = 0;
                        }
                    } else {
                        i10 = i44;
                        i11 = iP0;
                        i12 = i39;
                    }
                    int i51 = iMax2;
                    int i52 = i41;
                    int i53 = i51;
                    int iP1 = d7.t.p0(fFloatValue);
                    float f11 = ((iP1 < 0 ? (byte) -1 : iP1 > 0 ? (byte) 1 : (byte) 0) != (i11 < 0 ? (byte) -1 : i11 > 0 ? (byte) 1 : (byte) 0) || Math.abs(d7.t.p0(fFloatValue)) < Math.abs(i11)) ? fFloatValue : i11;
                    float f12 = fFloatValue - f11;
                    boolean z20 = zQ;
                    float f13 = (!z20 || i11 <= iP0 || f12 > 0.0f) ? 0.0f : (i11 - iP0) + f12;
                    if (i12 < 0) {
                        throw new IllegalArgumentException("negative currentFirstItemScrollOffset".toString());
                    }
                    int i54 = -i12;
                    x xVar9 = (x) lVar2.first();
                    if (i25 > 0 || iJ5 < 0) {
                        int i55 = lVar2.f13657c;
                        int i56 = 0;
                        while (true) {
                            if (i56 >= i55) {
                                xVar = xVar9;
                                break;
                            }
                            xVar = xVar9;
                            int i57 = ((x) lVar2.get(i56)).f17175o;
                            if (i12 == 0 || i57 > i12) {
                                break;
                            }
                            int i58 = i55;
                            if (i56 == d7.t.Y(lVar2)) {
                                break;
                            }
                            i12 -= i57;
                            i56++;
                            xVar9 = (x) lVar2.get(i56);
                            i55 = i58;
                        }
                        i13 = i12;
                        xVar9 = xVar;
                    } else {
                        i13 = i12;
                    }
                    int i59 = this.f17144o;
                    int iMax4 = Math.max(0, i31 - i59);
                    int i60 = i31 - 1;
                    if (iMax4 <= i60) {
                        List arrayList5 = null;
                        while (true) {
                            if (arrayList5 == null) {
                                arrayList5 = new ArrayList();
                            }
                            arrayList = arrayList5;
                            i14 = i53;
                            arrayList.add(sVar.a(i60));
                            if (i60 == iMax4) {
                                break;
                            }
                            i60--;
                            i53 = i14;
                            arrayList5 = arrayList;
                        }
                    } else {
                        i14 = i53;
                        arrayList = null;
                    }
                    int size = listP.size() - 1;
                    if (size >= 0) {
                        while (true) {
                            int i61 = size - 1;
                            int iIntValue = ((Number) listP.get(size)).intValue();
                            if (iIntValue < iMax4) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                arrayList.add(sVar.a(iIntValue));
                            }
                            if (i61 < 0) {
                                break;
                            }
                            size = i61;
                        }
                    }
                    if (arrayList == null) {
                        arrayList = rVar;
                    }
                    int iMax5 = i14;
                    int i62 = 0;
                    for (int size2 = arrayList.size(); i62 < size2; size2 = size2) {
                        iMax5 = Math.max(iMax5, ((x) arrayList.get(i62)).f17176p);
                        i62++;
                    }
                    int i63 = ((x) r8.p.L0(lVar2)).f17161a + i59;
                    int i64 = i27 - 1;
                    int iMin2 = Math.min(i63, i64);
                    int i65 = ((x) r8.p.L0(lVar2)).f17161a + 1;
                    if (i65 <= iMin2) {
                        ArrayList arrayList6 = null;
                        while (true) {
                            if (arrayList6 == null) {
                                arrayList6 = new ArrayList();
                            }
                            i16 = iMax5;
                            arrayList2 = arrayList6;
                            i15 = i54;
                            arrayList2.add(sVar.a(i65));
                            if (i65 == iMin2) {
                                break;
                            }
                            i65++;
                            i54 = i15;
                            arrayList6 = arrayList2;
                            iMax5 = i16;
                        }
                    } else {
                        i15 = i54;
                        i16 = iMax5;
                        arrayList2 = null;
                    }
                    if (!z20 || wVar3 == null) {
                        i52 = i52;
                        z20 = z20;
                        arrayList3 = arrayList2;
                    } else {
                        List list = wVar3.f17156g;
                        if (!list.isEmpty()) {
                            int size3 = list.size() - 1;
                            ArrayList arrayList7 = arrayList2;
                            while (true) {
                                if (-1 >= size3) {
                                    kVar = null;
                                    break;
                                }
                                if (((x) ((k) list.get(size3))).f17161a > iMin2 && (size3 == 0 || ((x) ((k) list.get(size3 - 1))).f17161a <= iMin2)) {
                                    kVar = (k) list.get(size3);
                                    break;
                                }
                                size3--;
                            }
                            k kVar2 = (k) r8.p.L0(list);
                            if (kVar != null && (i19 = ((x) kVar).f17161a) <= (iMin = Math.min(((x) kVar2).f17161a, i64))) {
                                int i66 = i19;
                                arrayList3 = arrayList7;
                                while (true) {
                                    if (arrayList3 != null) {
                                        int size4 = arrayList3.size();
                                        int i67 = 0;
                                        while (true) {
                                            if (i67 >= size4) {
                                                obj5 = null;
                                                break;
                                            }
                                            obj5 = arrayList3.get(i67);
                                            int i68 = size4;
                                            if (((x) obj5).f17161a == i66) {
                                                break;
                                            }
                                            i67++;
                                            size4 = i68;
                                        }
                                        xVar3 = (x) obj5;
                                    } else {
                                        xVar3 = null;
                                    }
                                    if (xVar3 == null) {
                                        if (arrayList3 == null) {
                                            arrayList3 = new ArrayList();
                                        }
                                        arrayList3.add(sVar.a(i66));
                                    }
                                    if (i66 == iMin) {
                                        break;
                                    }
                                    i66++;
                                    z20 = z20;
                                    i52 = i52;
                                }
                            } else {
                                i52 = i52;
                                z20 = z20;
                                arrayList3 = arrayList7;
                            }
                            x xVar10 = (x) kVar2;
                            float f14 = ((wVar3.f17158i - xVar10.f17173m) - xVar10.f17174n) - f11;
                            if (f14 > 0.0f) {
                                int i69 = xVar10.f17161a + 1;
                                int i70 = 0;
                                while (i69 < i27 && i70 < f14) {
                                    if (i69 <= iMin2) {
                                        int iE = lVar2.e();
                                        int i71 = 0;
                                        while (true) {
                                            if (i71 >= iE) {
                                                f10 = f14;
                                                obj4 = null;
                                                break;
                                            }
                                            obj4 = lVar2.get(i71);
                                            f10 = f14;
                                            if (((x) obj4).f17161a == i69) {
                                                break;
                                            }
                                            i71++;
                                            f14 = f10;
                                        }
                                        xVar2 = (x) obj4;
                                    } else {
                                        f10 = f14;
                                        if (arrayList3 != null) {
                                            int size5 = arrayList3.size();
                                            int i72 = 0;
                                            while (true) {
                                                if (i72 >= size5) {
                                                    obj3 = null;
                                                    break;
                                                }
                                                obj3 = arrayList3.get(i72);
                                                if (((x) obj3).f17161a == i69) {
                                                    break;
                                                }
                                                i72++;
                                            }
                                            xVar2 = (x) obj3;
                                        } else {
                                            xVar2 = null;
                                        }
                                    }
                                    if (xVar2 != null) {
                                        i69++;
                                        i18 = xVar2.f17175o;
                                    } else {
                                        if (arrayList3 == null) {
                                            arrayList3 = new ArrayList();
                                        }
                                        arrayList3.add(sVar.a(i69));
                                        i69++;
                                        i18 = ((x) r8.p.L0(arrayList3)).f17175o;
                                    }
                                    i70 += i18;
                                    f14 = f10;
                                }
                            }
                        } else {
                            i52 = i52;
                            z20 = z20;
                            arrayList3 = arrayList2;
                        }
                    }
                    if (arrayList3 != null && ((x) r8.p.L0(arrayList3)).f17161a > iMin2) {
                        iMin2 = ((x) r8.p.L0(arrayList3)).f17161a;
                    }
                    int size6 = listP.size();
                    for (int i73 = 0; i73 < size6; i73++) {
                        int iIntValue2 = ((Number) listP.get(i73)).intValue();
                        if (iIntValue2 > iMin2) {
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                            }
                            arrayList3.add(sVar.a(iIntValue2));
                        }
                    }
                    if (arrayList3 == null) {
                        arrayList3 = rVar;
                    }
                    int size7 = arrayList3.size();
                    int iMax6 = i16;
                    for (int i74 = 0; i74 < size7; i74++) {
                        iMax6 = Math.max(iMax6, ((x) arrayList3.get(i74)).f17176p);
                    }
                    boolean z21 = d7.a.d(xVar9, lVar2.first()) && arrayList.isEmpty() && arrayList3.isEmpty();
                    int iQ = o1.s.q(z19 ? iMax6 : i52, jA0);
                    if (z19) {
                        iMax6 = i52;
                    }
                    int iP = o1.s.p(iMax6, jA0);
                    int i75 = z19 ? iP : iQ;
                    int i76 = i52;
                    boolean z22 = i76 < Math.min(i75, i28);
                    if (z22 && i15 != 0) {
                        throw new IllegalStateException("non-zero itemsScrollOffset".toString());
                    }
                    ArrayList arrayList8 = new ArrayList(arrayList3.size() + arrayList.size() + lVar2.e());
                    if (!z22) {
                        xVar9 = xVar9;
                        lVar = lVar2;
                        z21 = z21;
                        rVar3 = rVar3;
                        arrayList8 = arrayList8;
                        int size8 = arrayList.size();
                        int i77 = i15;
                        for (int i78 = 0; i78 < size8; i78++) {
                            i17 = i28;
                            x xVar11 = (x) arrayList.get(i78);
                            i77 -= xVar11.f17175o;
                            xVar11.c(i77, iQ, iP);
                            arrayList8.add(xVar11);
                        }
                        i17 = i28;
                        int iE2 = lVar.e();
                        int i79 = i15;
                        for (int i80 = 0; i80 < iE2; i80++) {
                            x xVar12 = (x) lVar.get(i80);
                            xVar12.c(i79, iQ, iP);
                            arrayList8.add(xVar12);
                            i79 += xVar12.f17175o;
                        }
                        int size9 = arrayList3.size();
                        for (int i81 = 0; i81 < size9; i81++) {
                            x xVar13 = (x) arrayList3.get(i81);
                            xVar13.c(i79, iQ, iP);
                            arrayList8.add(xVar13);
                            i79 += xVar13.f17175o;
                        }
                    } else {
                        if (!arrayList.isEmpty() || !arrayList3.isEmpty()) {
                            throw new IllegalArgumentException("no extra items".toString());
                        }
                        int iE3 = lVar2.e();
                        int[] iArr2 = new int[iE3];
                        for (int i82 = 0; i82 < iE3; i82++) {
                            iArr2[i82] = ((x) lVar2.get(!z14 ? i82 : (iE3 - i82) - 1)).f17174n;
                        }
                        int[] iArr3 = new int[iE3];
                        for (int i83 = 0; i83 < iE3; i83++) {
                            iArr3[i83] = 0;
                        }
                        if (z19) {
                            if (iVar == null) {
                                throw new IllegalArgumentException("null verticalArrangement when isVertical == true".toString());
                            }
                            iVar.c(wVar2, i75, iArr2, iArr3);
                            iArr = iArr3;
                            i17 = i28;
                            lVar = lVar2;
                        } else {
                            if (gVar == null) {
                                throw new IllegalArgumentException("null horizontalArrangement when isVertical == false".toString());
                            }
                            iArr = iArr3;
                            lVar = lVar2;
                            i17 = i28;
                            gVar.b(wVar2, i75, iArr2, m2.l.f11815a, iArr);
                        }
                        i9.e eVarS = b9.b.S(iArr);
                        if (z14) {
                            eVarS = new i9.e(eVarS.f8184b, eVarS.f8183a, -eVarS.f8185c);
                        }
                        int i84 = eVarS.f8183a;
                        int i85 = eVarS.f8184b;
                        int i86 = eVarS.f8185c;
                        if ((i86 > 0 && i84 <= i85) || (i86 < 0 && i85 <= i84)) {
                            while (true) {
                                int i87 = iArr[i84];
                                x xVar14 = (x) lVar.get(!z14 ? i84 : (iE3 - i84) - 1);
                                if (z14) {
                                    i87 = (i75 - i87) - xVar14.f17174n;
                                }
                                xVar14.c(i87, iQ, iP);
                                arrayList8.add(xVar14);
                                if (i84 == i85) {
                                    break;
                                }
                                i84 += i86;
                            }
                        }
                    }
                    jVar3.a((int) f11, iQ, iP, arrayList8, sVar, z19, z20, z12);
                    if (i10 >= i27 && i76 <= i17) {
                        z11 = false;
                    }
                    g0Var = g0Var5;
                    k0 k0Var = (k0) rVar3.e(Integer.valueOf(iQ), Integer.valueOf(iP), new u.z(arrayList8, (x) null, z20, g0Var.f17066v));
                    if (z21) {
                        arrayList4 = arrayList8;
                    } else {
                        ArrayList arrayList9 = new ArrayList(arrayList8.size());
                        int size10 = arrayList8.size();
                        for (int i88 = 0; i88 < size10; i88++) {
                            Object obj6 = arrayList8.get(i88);
                            x xVar15 = (x) obj6;
                            if (xVar15.f17161a >= ((x) lVar.first()).f17161a) {
                                if (xVar15.f17161a <= ((x) lVar.last()).f17161a) {
                                    arrayList9.add(obj6);
                                }
                            }
                        }
                        arrayList4 = arrayList9;
                    }
                    wVar = new w(xVar9, i13, z11, f11, k0Var, f13, z17, arrayList4, i32, i37, i27, iJ5);
                }
                g0Var.f(wVar, i1Var.q(), false);
                return wVar;
            } catch (Throwable th) {
                w0.i.p(iVarJ);
                throw th;
            }
        } catch (Throwable th2) {
            iVarC.c();
            throw th2;
        }
    }
}
