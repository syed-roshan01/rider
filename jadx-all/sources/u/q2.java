package u;

/* JADX INFO: loaded from: classes.dex */
public final class q2 extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f14909d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q2(Object obj, int i10, Object obj2, int i11) {
        super(1);
        this.f14906a = i11;
        this.f14908c = obj;
        this.f14907b = i10;
        this.f14909d = obj2;
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        m0.t tVar;
        long[] jArr;
        m0.t tVar2;
        long[] jArr2;
        int i10;
        q8.l lVar = q8.l.f13235a;
        int i11 = this.f14906a;
        Object obj2 = this.f14909d;
        int i12 = this.f14907b;
        Object obj3 = this.f14908c;
        switch (i11) {
            case 0:
                r1.w0 w0Var = (r1.w0) obj;
                r2 r2Var = (r2) obj3;
                int iR = z6.a.r(r2Var.f14920u.f14884a.d(), 0, i12);
                int i13 = r2Var.f14921v ? iR - i12 : -iR;
                boolean z10 = r2Var.f14922w;
                r1.w0.h(w0Var, (r1.x0) obj2, z10 ? 0 : i13, z10 ? i13 : 0);
                return lVar;
            case 1:
                long j10 = ((d1.c) obj).f4330a;
                v.l2 l2Var = (v.l2) obj3;
                n1.g gVarC = l2Var.f15674f.c();
                long jG0 = gVarC != null ? gVarC.g0(i12, j10) : d1.c.f4326b;
                long jF = d1.c.f(j10, jG0);
                v.h1 h1Var = l2Var.f15670b;
                v.h1 h1Var2 = v.h1.f15594b;
                long jA = h1Var == h1Var2 ? d1.c.a(jF, 1) : d1.c.a(jF, 2);
                if (l2Var.f15672d) {
                    jA = d1.c.h(-1.0f, jA);
                }
                long jD = l2Var.d(((v.r1) obj2).a(l2Var.f15670b == h1Var2 ? d1.c.d(jA) : d1.c.e(jA)));
                if (l2Var.f15672d) {
                    jD = d1.c.h(-1.0f, jD);
                }
                long jF2 = d1.c.f(jF, jD);
                n1.d dVar = l2Var.f15674f;
                int i14 = this.f14907b;
                n1.g gVarC2 = dVar.c();
                return new d1.c(d1.c.g(d1.c.g(jG0, jD), gVarC2 != null ? gVarC2.V(jD, jF2, i14) : d1.c.f4326b));
            default:
                m0.t tVar3 = (m0.t) obj;
                m0.x1 x1Var = (m0.x1) obj3;
                if (x1Var.f11757e == i12) {
                    q.r rVar = (q.r) obj2;
                    if (d7.a.d(rVar, x1Var.f11758f) && (tVar3 instanceof m0.x)) {
                        long[] jArr3 = rVar.f13021a;
                        int length = jArr3.length - 2;
                        if (length >= 0) {
                            int i15 = 0;
                            while (true) {
                                long j11 = jArr3[i15];
                                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i16 = 8;
                                    int i17 = 8 - ((~(i15 - length)) >>> 31);
                                    int i18 = 0;
                                    while (i18 < i17) {
                                        if ((j11 & 255) < 128) {
                                            int i19 = (i15 << 3) + i18;
                                            Object obj4 = rVar.f13022b[i19];
                                            boolean z11 = rVar.f13023c[i19] != i12;
                                            if (z11) {
                                                jArr2 = jArr3;
                                                m0.x xVar = (m0.x) tVar3;
                                                tVar2 = tVar3;
                                                xVar.f11736n.b(obj4, x1Var);
                                                m0.k0 k0Var = obj4 instanceof m0.k0 ? (m0.k0) obj4 : null;
                                                if (k0Var != null) {
                                                    if (!xVar.f11736n.f12344a.b(k0Var)) {
                                                        xVar.f11738p.c(k0Var);
                                                    }
                                                    q.s sVar = x1Var.f11759g;
                                                    if (sVar != null) {
                                                        sVar.i(k0Var);
                                                        if (sVar.f13031e == 0) {
                                                            x1Var.f11759g = null;
                                                        }
                                                    }
                                                }
                                            } else {
                                                tVar2 = tVar3;
                                                jArr2 = jArr3;
                                            }
                                            if (z11) {
                                                rVar.g(i19);
                                            }
                                            i10 = 8;
                                        } else {
                                            tVar2 = tVar3;
                                            jArr2 = jArr3;
                                            i10 = i16;
                                        }
                                        j11 >>= i10;
                                        i18++;
                                        i16 = i10;
                                        jArr3 = jArr2;
                                        tVar3 = tVar2;
                                    }
                                    tVar = tVar3;
                                    jArr = jArr3;
                                    if (i17 == i16) {
                                    }
                                } else {
                                    tVar = tVar3;
                                    jArr = jArr3;
                                }
                                if (i15 != length) {
                                    i15++;
                                    jArr3 = jArr;
                                    tVar3 = tVar;
                                }
                            }
                        }
                        if (rVar.f13025e == 0) {
                            x1Var.f11758f = null;
                        }
                    }
                }
                return lVar;
        }
    }
}
