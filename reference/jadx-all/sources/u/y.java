package u;

/* JADX INFO: loaded from: classes.dex */
public final class y extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f14980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14981c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f14982d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f14983e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f14984f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f14985n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(Object obj, boolean z10, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        super(1);
        this.f14979a = i10;
        this.f14981c = obj;
        this.f14980b = z10;
        this.f14982d = obj2;
        this.f14983e = obj3;
        this.f14984f = obj4;
        this.f14985n = obj5;
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        g2.h0 h0Var;
        r1.s sVar;
        r1.s sVar2;
        q8.l lVar = q8.l.f13235a;
        int i10 = this.f14979a;
        Object obj2 = this.f14985n;
        Object obj3 = this.f14983e;
        Object obj4 = this.f14984f;
        boolean z10 = this.f14980b;
        Object obj5 = this.f14981c;
        switch (i10) {
            case 1:
                y1.v vVar = (y1.v) obj;
                j9.f[] fVarArr = y1.t.f16843a;
                y1.u uVar = y1.r.f16827l;
                j9.f[] fVarArr2 = y1.t.f16843a;
                j9.f fVar = fVarArr2[6];
                uVar.a(vVar, Boolean.TRUE);
                y1.j jVar = (y1.j) vVar;
                jVar.k(y1.r.E, (c9.c) obj5);
                Object obj6 = this.f14982d;
                if (z10) {
                    y1.u uVar2 = y1.r.f16831p;
                    j9.f fVar2 = fVarArr2[9];
                    uVar2.a(vVar, (y1.h) obj6);
                } else {
                    y1.u uVar3 = y1.r.f16830o;
                    j9.f fVar3 = fVarArr2[8];
                    uVar3.a(vVar, (y1.h) obj6);
                }
                c9.e eVar = (c9.e) obj3;
                if (eVar != null) {
                    jVar.k(y1.i.f16764d, new y1.a(null, eVar));
                }
                c9.c cVar = (c9.c) obj4;
                if (cVar != null) {
                    jVar.k(y1.i.f16765e, new y1.a(null, cVar));
                }
                y1.u uVar4 = y1.r.f16821f;
                j9.f fVar4 = fVarArr2[18];
                uVar4.a(vVar, (y1.b) obj2);
                break;
            default:
                r1.s sVar3 = (r1.s) obj;
                f0.c2 c2Var = (f0.c2) obj5;
                c2Var.f5643h = sVar3;
                f0.d2 d2VarD = c2Var.d();
                if (d2VarD != null) {
                    d2VarD.f5668b = sVar3;
                }
                if (z10) {
                    f0.o0 o0VarA = c2Var.a();
                    f0.o0 o0Var = f0.o0.f5837b;
                    m0.n1 n1Var = c2Var.f5650o;
                    if (o0VarA == o0Var) {
                        if (((Boolean) c2Var.f5647l.getValue()).booleanValue()) {
                            ((h0.v0) obj3).o();
                        } else {
                            ((h0.v0) obj3).l();
                        }
                        h0.v0 v0Var = (h0.v0) obj3;
                        c2Var.f5648m.setValue(Boolean.valueOf(d7.t.c0(v0Var, true)));
                        c2Var.f5649n.setValue(Boolean.valueOf(d7.t.c0(v0Var, false)));
                        n1Var.setValue(Boolean.valueOf(a2.b0.b(((g2.a0) obj4).f6510b)));
                    } else if (c2Var.a() == f0.o0.f5838c) {
                        n1Var.setValue(Boolean.valueOf(d7.t.c0((h0.v0) obj3, true)));
                    }
                    g2.a0 a0Var = (g2.a0) obj4;
                    g2.s sVar4 = (g2.s) obj2;
                    d7.t.i0(c2Var, a0Var, sVar4);
                    f0.d2 d2VarD2 = c2Var.d();
                    if (d2VarD2 != null && (h0Var = c2Var.f5640e) != null && c2Var.b() && (sVar = d2VarD2.f5668b) != null && sVar.L() && (sVar2 = d2VarD2.f5669c) != null) {
                        q.w wVar = new q.w(sVar, 20);
                        d1.d dVarA = h0.l0.a(sVar);
                        d1.d dVarB = sVar.b(sVar2, false);
                        if (d7.a.d((g2.h0) h0Var.f6565a.f6513b.get(), h0Var)) {
                            g2.e eVar2 = ((g2.e0) h0Var.f6566b).f6555l;
                            eVar2.f6535i = a0Var;
                            eVar2.f6537k = sVar4;
                            eVar2.f6536j = d2VarD2.f5667a;
                            eVar2.f6538l = wVar;
                            eVar2.f6539m = dVarA;
                            eVar2.f6540n = dVarB;
                            if (eVar2.f6530d || eVar2.f6529c) {
                                eVar2.a();
                            }
                        }
                    }
                }
                break;
        }
        return lVar;
    }
}
