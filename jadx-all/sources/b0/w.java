package b0;

import java.util.ArrayList;
import java.util.List;
import k0.y0;
import r1.i1;
import v.h1;
import y.t0;

/* JADX INFO: loaded from: classes.dex */
public final class w extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h1 f2481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t0 f2482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f2483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h0 f2484d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f2485e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j f2486f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ c9.a f2487n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ c9.a f2488o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ y0.c f2489p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ y0.b f2490q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2491r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l0 f2492s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(h1 h1Var, t0 t0Var, boolean z10, h0 h0Var, float f10, j jVar, j9.e eVar, c9.a aVar, y0.c cVar, y0.b bVar, int i10) {
        super(2);
        l0 l0Var = o0.f2453d;
        this.f2481a = h1Var;
        this.f2482b = t0Var;
        this.f2483c = z10;
        this.f2484d = h0Var;
        this.f2485e = f10;
        this.f2486f = jVar;
        this.f2487n = eVar;
        this.f2488o = aVar;
        this.f2489p = cVar;
        this.f2490q = bVar;
        this.f2491r = i10;
        this.f2492s = l0Var;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int iJ;
        int iJ2;
        long jC;
        int i10;
        int i11;
        r8.l lVar;
        int i12;
        int i13;
        int i14;
        int i15;
        g gVar;
        int i16;
        v vVar;
        ArrayList arrayList;
        v vVar2;
        List arrayList2;
        int i17;
        int i18;
        ArrayList arrayList3;
        ArrayList arrayList4;
        Object obj3;
        h0 h0Var;
        x xVar;
        int i19;
        int i20;
        r8.l lVar2;
        a0.w wVar = (a0.w) obj;
        long j10 = ((m2.a) obj2).f11792a;
        h1 h1Var = h1.f15593a;
        h1 h1Var2 = this.f2481a;
        boolean z10 = h1Var2 == h1Var;
        androidx.compose.foundation.a.h(j10, z10 ? h1Var : h1.f15594b);
        t0 t0Var = this.f2482b;
        if (z10) {
            a0.x xVar2 = (a0.x) wVar;
            iJ = xVar2.f870b.J(t0Var.a(xVar2.f870b.getLayoutDirection()));
        } else {
            a0.x xVar3 = (a0.x) wVar;
            iJ = xVar3.f870b.J(androidx.compose.foundation.layout.a.f(t0Var, xVar3.f870b.getLayoutDirection()));
        }
        if (z10) {
            a0.x xVar4 = (a0.x) wVar;
            iJ2 = xVar4.f870b.J(t0Var.b(xVar4.f870b.getLayoutDirection()));
        } else {
            a0.x xVar5 = (a0.x) wVar;
            iJ2 = xVar5.f870b.J(androidx.compose.foundation.layout.a.e(t0Var, xVar5.f870b.getLayoutDirection()));
        }
        a0.x xVar6 = (a0.x) wVar;
        int iJ3 = xVar6.f870b.J(t0Var.d());
        float fC = t0Var.c();
        i1 i1Var = xVar6.f870b;
        int iJ4 = i1Var.J(fC);
        int i21 = iJ3 + iJ4;
        int i22 = iJ + iJ2;
        int i23 = z10 ? i21 : i22;
        boolean z11 = this.f2483c;
        if (z10 && !z11) {
            iJ2 = iJ3;
        } else if (z10 && z11) {
            iJ2 = iJ4;
        } else if (!z10 && !z11) {
            iJ2 = iJ;
        }
        int i24 = i23 - iJ2;
        int i25 = iJ2;
        long jA0 = o1.s.a0(j10, -i22, -i21);
        h0 h0Var2 = this.f2484d;
        h0Var2.f2409q = wVar;
        a0 a0Var = h0Var2.f2397e;
        int iJ5 = i1Var.J(this.f2485e);
        int iH = z10 ? m2.a.h(j10) - i21 : m2.a.i(j10) - i22;
        if (!z11 || iH > 0) {
            jC = i1.b.c(iJ, iJ3);
        } else {
            if (!z10) {
                iJ += iH;
            }
            jC = i1.b.c(iJ, z10 ? iJ3 + iH : iJ3);
        }
        ((i) this.f2486f).getClass();
        h0Var2.f2418z = o1.s.b(h1Var2 == h1Var ? m2.a.i(jA0) : iH, h1Var2 != h1Var ? m2.a.h(jA0) : iH, 5);
        t tVar = (t) this.f2487n.invoke();
        int i26 = iH + iJ5;
        w0.i iVarC = y0.c();
        try {
            w0.i iVarJ = iVarC.j();
            try {
                int iD = a0Var.f2318b.d();
                int iF = f6.a.F(tVar, a0Var.f2321e, iD);
                if (iD != iF) {
                    a0Var.f2318b.f(iF);
                    a0Var.f2322f.b(iD);
                }
                int iM = d9.i.m(i26, h0Var2);
                w0.i.p(iVarJ);
                iVarC.c();
                List listP = f6.a.p(tVar, h0Var2.A, h0Var2.f2414v);
                int iIntValue = ((Number) this.f2488o.invoke()).intValue();
                h1 h1Var3 = this.f2481a;
                y0.c cVar = this.f2489p;
                y0.b bVar = this.f2490q;
                boolean z12 = this.f2483c;
                int i27 = this.f2491r;
                z.r rVar = rVar;
                List list = listP;
                int i28 = i25;
                z.r rVar2 = new z.r(wVar, j10, i22, i21, 1);
                if (i28 < 0) {
                    throw new IllegalArgumentException("negative beforeContentPadding".toString());
                }
                if (i24 < 0) {
                    throw new IllegalArgumentException("negative afterContentPadding".toString());
                }
                int i29 = i26 < 0 ? 0 : i26;
                r8.r rVar3 = r8.r.f13661a;
                int i30 = iIntValue;
                if (i30 <= 0) {
                    xVar = new x(rVar3, iH, iJ5, i24, h1Var3, -i28, iH + i24, i27, null, null, 0.0f, 0, false, (r1.k0) rVar.e(Integer.valueOf(m2.a.k(jA0)), Integer.valueOf(m2.a.j(jA0)), u.f2468b), false);
                    h0Var = h0Var2;
                } else {
                    h1 h1Var4 = h1Var3;
                    long jB = o1.s.b(h1Var4 == h1Var ? m2.a.i(jA0) : iH, h1Var4 != h1Var ? m2.a.h(jA0) : iH, 5);
                    while (iF > 0 && iM > 0) {
                        iF--;
                        iM -= i29;
                    }
                    int i31 = iM * (-1);
                    if (iF >= i30) {
                        iF = i30 - 1;
                        i31 = 0;
                    }
                    r8.l lVar3 = new r8.l();
                    int i32 = -i28;
                    int i33 = i32 + (iJ5 < 0 ? iJ5 : 0);
                    int i34 = i31 + i33;
                    int iMax = 0;
                    while (i34 < 0 && iF > 0) {
                        int i35 = iF - 1;
                        int i36 = iMax;
                        h1 h1Var5 = h1Var;
                        r8.l lVar4 = lVar3;
                        h1 h1Var6 = h1Var4;
                        int i37 = iJ5;
                        int i38 = i29;
                        int i39 = iH;
                        g gVarY = o7.d0.y(wVar, i35, jB, tVar, jC, h1Var6, bVar, cVar, i1Var.getLayoutDirection(), z12, i39);
                        lVar4.add(0, gVarY);
                        iMax = Math.max(i36, gVarY.f2385k);
                        i34 += i38;
                        i29 = i38;
                        lVar3 = lVar4;
                        iF = i35;
                        rVar = rVar;
                        h1Var = h1Var5;
                        i32 = i32;
                        h1Var4 = h1Var6;
                        iJ5 = i37;
                        i30 = i30;
                        i33 = i33;
                        list = list;
                        i28 = i28;
                        iH = i39;
                        h0Var2 = h0Var2;
                    }
                    int i40 = iJ5;
                    z.r rVar4 = rVar;
                    int i41 = iMax;
                    int i42 = i32;
                    h1 h1Var7 = h1Var4;
                    int i43 = i29;
                    int i44 = i30;
                    List list2 = list;
                    int i45 = i28;
                    int i46 = iH;
                    h0 h0Var3 = h0Var2;
                    h1 h1Var8 = h1Var;
                    r8.l lVar5 = lVar3;
                    int i47 = i33;
                    int i48 = (i34 < i47 ? i47 : i34) - i47;
                    int i49 = i46;
                    int i50 = i49 + i24;
                    int i51 = i50 < 0 ? 0 : i50;
                    int i52 = -i48;
                    int i53 = 0;
                    boolean z13 = false;
                    int i54 = iF;
                    while (i53 < lVar5.f13657c) {
                        if (i52 >= i51) {
                            lVar5.i(i53);
                            z13 = true;
                        } else {
                            i54++;
                            i52 += i43;
                            i53++;
                        }
                    }
                    int i55 = i41;
                    int i56 = i52;
                    boolean z14 = z13;
                    int i57 = i54;
                    int i58 = iF;
                    int i59 = i44;
                    int i60 = i48;
                    while (i57 < i59 && (i56 < i51 || i56 <= 0 || lVar5.isEmpty())) {
                        int i61 = i59;
                        r8.l lVar6 = lVar5;
                        int i62 = i57;
                        int i63 = i55;
                        int i64 = i51;
                        int i65 = i49;
                        int i66 = i47;
                        g gVarY2 = o7.d0.y(wVar, i57, jB, tVar, jC, h1Var7, bVar, cVar, i1Var.getLayoutDirection(), z12, i65);
                        int i67 = i61 - 1;
                        i56 += i62 == i67 ? i65 : i43;
                        if (i56 > i66 || i62 == i67) {
                            int iMax2 = Math.max(i63, gVarY2.f2385k);
                            lVar2 = lVar6;
                            lVar2.addLast(gVarY2);
                            i55 = iMax2;
                        } else {
                            i60 -= i43;
                            i58 = i62 + 1;
                            lVar2 = lVar6;
                            i55 = i63;
                            z14 = true;
                        }
                        i57 = i62 + 1;
                        i59 = i61;
                        lVar5 = lVar2;
                        i49 = i65;
                        i51 = i64;
                        i47 = i66;
                    }
                    int i68 = i59;
                    int i69 = i55;
                    r8.l lVar7 = lVar5;
                    int i70 = i57;
                    if (i56 < i49) {
                        int i71 = i49 - i56;
                        int i72 = i60 - i71;
                        i56 += i71;
                        int iMax3 = i69;
                        int i73 = i72;
                        int i74 = i45;
                        while (i73 < i74 && i58 > 0) {
                            i58--;
                            int i75 = i49;
                            int i76 = i68;
                            r8.l lVar8 = lVar7;
                            g gVarY3 = o7.d0.y(wVar, i58, jB, tVar, jC, h1Var7, bVar, cVar, i1Var.getLayoutDirection(), z12, i75);
                            lVar8.add(0, gVarY3);
                            iMax3 = Math.max(iMax3, gVarY3.f2385k);
                            i73 += i43;
                            lVar7 = lVar8;
                            i74 = i74;
                            i70 = i70;
                            i49 = i75;
                            i68 = i76;
                        }
                        i10 = i68;
                        i45 = i74;
                        int i77 = i73;
                        i11 = i49;
                        lVar = lVar7;
                        i12 = i70;
                        i13 = iMax3;
                        if (i77 < 0) {
                            i56 += i77;
                            i14 = 0;
                        } else {
                            i14 = i77;
                        }
                    } else {
                        i10 = i68;
                        i11 = i49;
                        lVar = lVar7;
                        i12 = i70;
                        i13 = i69;
                        i14 = i60;
                    }
                    if (i14 < 0) {
                        throw new IllegalArgumentException("invalid currentFirstPageScrollOffset".toString());
                    }
                    int i78 = -i14;
                    g gVar2 = (g) lVar.first();
                    if (i45 > 0 || i40 < 0) {
                        int i79 = lVar.f13657c;
                        int i80 = i14;
                        int i81 = 0;
                        while (true) {
                            if (i81 >= i79 || i80 == 0) {
                                i15 = i43;
                                break;
                            }
                            i15 = i43;
                            if (i15 > i80 || i81 == d7.t.Y(lVar)) {
                                break;
                            }
                            i80 -= i15;
                            i81++;
                            gVar2 = (g) lVar.get(i81);
                            i43 = i15;
                        }
                        gVar = gVar2;
                        i16 = i80;
                    } else {
                        i15 = i43;
                        i16 = i14;
                        gVar = gVar2;
                    }
                    v vVar3 = vVar;
                    int i82 = i15;
                    int i83 = i13;
                    g gVar3 = gVar;
                    v vVar4 = new v(wVar, jB, tVar, jC, h1Var7, bVar, cVar, z12, i11, 1);
                    int iMax4 = Math.max(0, i58 - i27);
                    int i84 = i58 - 1;
                    if (iMax4 <= i84) {
                        arrayList = null;
                        while (true) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            vVar = vVar3;
                            arrayList.add(vVar.invoke(Integer.valueOf(i84)));
                            if (i84 == iMax4) {
                                break;
                            }
                            i84--;
                            vVar3 = vVar;
                        }
                    } else {
                        vVar = vVar3;
                        arrayList = null;
                    }
                    int size = list2.size();
                    int i85 = 0;
                    while (i85 < size) {
                        List list3 = list2;
                        int iIntValue2 = ((Number) list3.get(i85)).intValue();
                        if (iIntValue2 < iMax4) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(vVar.invoke(Integer.valueOf(iIntValue2)));
                        }
                        i85++;
                        list2 = list3;
                    }
                    List list4 = list2;
                    List list5 = arrayList == null ? rVar3 : arrayList;
                    int size2 = list5.size();
                    int iMax5 = i83;
                    for (int i86 = 0; i86 < size2; i86++) {
                        iMax5 = Math.max(iMax5, ((g) list5.get(i86)).f2385k);
                    }
                    int i87 = ((g) lVar.last()).f2375a;
                    v vVar5 = vVar;
                    int i88 = iMax5;
                    List list6 = list5;
                    List list7 = list4;
                    int i89 = i56;
                    v vVar6 = new v(wVar, jB, tVar, jC, h1Var7, bVar, cVar, z12, i11, 0);
                    int iMin = Math.min(i87 + i27, i10 - 1);
                    int i90 = i87 + 1;
                    if (i90 <= iMin) {
                        arrayList2 = null;
                        while (true) {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            vVar2 = vVar5;
                            arrayList2.add(vVar2.invoke(Integer.valueOf(i90)));
                            if (i90 == iMin) {
                                break;
                            }
                            i90++;
                            vVar5 = vVar2;
                        }
                    } else {
                        vVar2 = vVar5;
                        arrayList2 = null;
                    }
                    int size3 = list7.size();
                    int i91 = 0;
                    while (i91 < size3) {
                        List list8 = list7;
                        int iIntValue3 = ((Number) list8.get(i91)).intValue();
                        int i92 = i10;
                        if (iMin + 1 <= iIntValue3 && iIntValue3 < i92) {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(vVar2.invoke(Integer.valueOf(iIntValue3)));
                        }
                        i91++;
                        list7 = list8;
                        i10 = i92;
                    }
                    int i93 = i10;
                    if (arrayList2 == null) {
                        arrayList2 = rVar3;
                    }
                    int size4 = arrayList2.size();
                    int iMax6 = i88;
                    for (int i94 = 0; i94 < size4; i94++) {
                        iMax6 = Math.max(iMax6, ((g) arrayList2.get(i94)).f2385k);
                    }
                    boolean z15 = d7.a.d(gVar3, lVar.first()) && list6.isEmpty() && arrayList2.isEmpty();
                    int iQ = o1.s.q(h1Var7 == h1Var8 ? iMax6 : i89, jA0);
                    if (h1Var7 == h1Var8) {
                        iMax6 = i89;
                    }
                    int iP = o1.s.p(iMax6, jA0);
                    int i95 = h1Var7 == h1Var8 ? iP : iQ;
                    int i96 = i11;
                    boolean z16 = i89 < Math.min(i95, i96);
                    if (z16 && i78 != 0) {
                        throw new IllegalStateException(l.q.g("non-zero pagesScrollOffset=", i78).toString());
                    }
                    int i97 = i78;
                    ArrayList arrayList5 = new ArrayList(arrayList2.size() + list6.size() + lVar.e());
                    if (!z16) {
                        i17 = i89;
                        i18 = i40;
                        arrayList3 = arrayList5;
                        int size5 = list6.size();
                        int i98 = i97;
                        for (int i99 = 0; i99 < size5; i99++) {
                            g gVar4 = (g) list6.get(i99);
                            i98 -= i26;
                            gVar4.a(i98, iQ, iP);
                            arrayList3.add(gVar4);
                        }
                        int iE = lVar.e();
                        for (int i100 = 0; i100 < iE; i100++) {
                            g gVar5 = (g) lVar.get(i100);
                            gVar5.a(i97, iQ, iP);
                            arrayList3.add(gVar5);
                            i97 += i26;
                        }
                        int size6 = arrayList2.size();
                        for (int i101 = 0; i101 < size6; i101++) {
                            g gVar6 = (g) arrayList2.get(i101);
                            gVar6.a(i97, iQ, iP);
                            arrayList3.add(gVar6);
                            i97 += i26;
                        }
                    } else {
                        if (!list6.isEmpty() || !arrayList2.isEmpty()) {
                            throw new IllegalArgumentException("No extra pages".toString());
                        }
                        int iE2 = lVar.e();
                        int[] iArr = new int[iE2];
                        for (int i102 = 0; i102 < iE2; i102++) {
                            iArr[i102] = i96;
                        }
                        int[] iArr2 = new int[iE2];
                        int i103 = 0;
                        while (i103 < iE2) {
                            iArr2[i103] = 0;
                            i103++;
                            arrayList5 = arrayList5;
                        }
                        arrayList3 = arrayList5;
                        float fO0 = i1Var.o0(i40);
                        i18 = i40;
                        y.h hVar = new y.h(fO0, false, null);
                        m2.l lVar9 = m2.l.f11815a;
                        if (h1Var7 == h1Var8) {
                            i20 = i89;
                            i19 = i95;
                            hVar.b(wVar, i95, iArr, lVar9, iArr2);
                        } else {
                            i19 = i95;
                            i20 = i89;
                            hVar.b(wVar, i19, iArr, lVar9, iArr2);
                        }
                        i9.e eVarS = b9.b.S(iArr2);
                        if (z12) {
                            eVarS = new i9.e(eVarS.f8184b, eVarS.f8183a, -eVarS.f8185c);
                        }
                        int i104 = eVarS.f8183a;
                        int i105 = eVarS.f8184b;
                        int i106 = eVarS.f8185c;
                        if ((i106 > 0 && i104 <= i105) || (i106 < 0 && i105 <= i104)) {
                            while (true) {
                                int i107 = iArr2[i104];
                                g gVar7 = (g) lVar.get(!z12 ? i104 : (iE2 - i104) - 1);
                                if (z12) {
                                    i107 = (i19 - i107) - gVar7.f2376b;
                                }
                                gVar7.a(i107, iQ, iP);
                                arrayList3.add(gVar7);
                                if (i104 == i105) {
                                    break;
                                }
                                i104 += i106;
                            }
                        }
                        i17 = i20;
                    }
                    if (z15) {
                        arrayList4 = arrayList3;
                    } else {
                        arrayList4 = new ArrayList(arrayList3.size());
                        int size7 = arrayList3.size();
                        for (int i108 = 0; i108 < size7; i108++) {
                            Object obj4 = arrayList3.get(i108);
                            g gVar8 = (g) obj4;
                            if (gVar8.f2375a >= ((g) lVar.first()).f2375a) {
                                if (gVar8.f2375a <= ((g) lVar.last()).f2375a) {
                                    arrayList4.add(obj4);
                                }
                            }
                        }
                    }
                    if (arrayList4.isEmpty()) {
                        obj3 = null;
                    } else {
                        Object obj5 = arrayList4.get(0);
                        int i109 = ((g) obj5).f2387m;
                        this.f2492s.getClass();
                        float f10 = o0.f2450a;
                        float f11 = 0;
                        float f12 = -Math.abs(i109 - f11);
                        int iY = d7.t.Y(arrayList4);
                        if (1 <= iY) {
                            int i110 = 1;
                            while (true) {
                                Object obj6 = arrayList4.get(i110);
                                int i111 = ((g) obj6).f2387m;
                                float f13 = o0.f2450a;
                                float f14 = -Math.abs(i111 - f11);
                                if (Float.compare(f12, f14) < 0) {
                                    f12 = f14;
                                    obj5 = obj6;
                                }
                                if (i110 == iY) {
                                    break;
                                }
                                i110++;
                            }
                        }
                        obj3 = obj5;
                    }
                    g gVar9 = (g) obj3;
                    h0Var = h0Var3;
                    xVar = new x(arrayList4, i96, i18, i24, h1Var7, i42, i50, i27, gVar3, gVar9, i82 == 0 ? 0.0f : z6.a.q((-(gVar9 != null ? gVar9.f2387m : 0)) / i82, -0.5f, 0.5f), i16, i12 < i93 || i17 > i96, (r1.k0) rVar4.e(Integer.valueOf(iQ), Integer.valueOf(iP), new u.s(8, arrayList3, h0Var.B)), z14);
                }
                h0Var.h(xVar, false);
                return xVar;
            } catch (Throwable th) {
                try {
                    w0.i.p(iVarJ);
                    throw th;
                } catch (Throwable th2) {
                    th = th2;
                    iVarC.c();
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
