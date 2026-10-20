package t;

import m0.l3;

/* JADX INFO: loaded from: classes.dex */
public final class a extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f14072d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f14073e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        super(1);
        this.f14069a = i10;
        this.f14070b = obj;
        this.f14071c = obj2;
        this.f14072d = obj3;
        this.f14073e = obj4;
    }

    public final void a(m mVar) {
        int i10 = this.f14069a;
        Object obj = this.f14073e;
        Object obj2 = this.f14072d;
        Object obj3 = this.f14071c;
        Object obj4 = this.f14070b;
        switch (i10) {
            case 0:
                d dVar = (d) obj4;
                e.t(mVar, dVar.f14110c);
                m0.n1 n1Var = mVar.f14245e;
                Object objC = dVar.c(n1Var.getValue());
                if (!d7.a.d(objC, n1Var.getValue())) {
                    dVar.f14110c.f14264b.setValue(objC);
                    ((o) obj3).f14264b.setValue(objC);
                    c9.c cVar = (c9.c) obj2;
                    if (cVar != null) {
                        cVar.invoke(dVar);
                    }
                    mVar.f14249i.setValue(Boolean.FALSE);
                    mVar.f14244d.invoke();
                    ((d9.q) obj).f4948a = true;
                } else {
                    c9.c cVar2 = (c9.c) obj2;
                    if (cVar2 != null) {
                        cVar2.invoke(dVar);
                    }
                }
                break;
            default:
                d9.r rVar = (d9.r) obj4;
                float fFloatValue = ((Number) mVar.f14245e.getValue()).floatValue() - rVar.f4949a;
                float fA = ((v.r1) obj3).a(fFloatValue);
                rVar.f4949a = ((Number) mVar.f14245e.getValue()).floatValue();
                ((d9.r) obj2).f4949a = ((Number) mVar.f14241a.f14352b.invoke(mVar.f14246f)).floatValue();
                if (Math.abs(fFloatValue - fA) > 0.5f) {
                    mVar.f14249i.setValue(Boolean.FALSE);
                    mVar.f14244d.invoke();
                }
                ((v.u) obj).getClass();
                break;
        }
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        boolean z10;
        q8.l lVar = q8.l.f13235a;
        int i10 = this.f14069a;
        Object obj2 = this.f14073e;
        Object obj3 = this.f14072d;
        Object obj4 = this.f14071c;
        Object obj5 = this.f14070b;
        switch (i10) {
            case 0:
                a((m) obj);
                return lVar;
            case 1:
                long jLongValue = ((Number) obj).longValue();
                l3 l3Var = (l3) ((m0.g1) obj5).getValue();
                long jLongValue2 = l3Var != null ? ((Number) l3Var.getValue()).longValue() : jLongValue;
                p0 p0Var = (p0) obj4;
                long j10 = p0Var.f14275c;
                int i11 = 0;
                o0.i iVar = p0Var.f14273a;
                if (j10 == Long.MIN_VALUE || ((d9.r) obj3).f4949a != e.o(((m9.d0) obj2).q())) {
                    p0Var.f14275c = jLongValue;
                    int i12 = iVar.f12343c;
                    if (i12 > 0) {
                        Object[] objArr = iVar.f12341a;
                        int i13 = 0;
                        do {
                            ((k0) objArr[i13]).f14223n = true;
                            i13++;
                        } while (i13 < i12);
                    }
                    ((d9.r) obj3).f4949a = e.o(((m9.d0) obj2).q());
                }
                float f10 = ((d9.r) obj3).f4949a;
                if (f10 == 0.0f) {
                    int i14 = iVar.f12343c;
                    if (i14 > 0) {
                        Object[] objArr2 = iVar.f12341a;
                        do {
                            k0 k0Var = (k0) objArr2[i11];
                            k0Var.f14220d.setValue(k0Var.f14221e.f14235d);
                            k0Var.f14223n = true;
                            i11++;
                        } while (i11 < i14);
                    }
                } else {
                    long j11 = (long) ((jLongValue2 - p0Var.f14275c) / f10);
                    int i15 = iVar.f12343c;
                    if (i15 > 0) {
                        Object[] objArr3 = iVar.f12341a;
                        z10 = true;
                        int i16 = 0;
                        do {
                            k0 k0Var2 = (k0) objArr3[i16];
                            if (!k0Var2.f14222f) {
                                k0Var2.f14225p.f14274b.setValue(Boolean.FALSE);
                                if (k0Var2.f14223n) {
                                    k0Var2.f14223n = false;
                                    k0Var2.f14224o = j11;
                                }
                                long j12 = j11 - k0Var2.f14224o;
                                k0Var2.f14220d.setValue(k0Var2.f14221e.b(j12));
                                k0Var2.f14222f = k0Var2.f14221e.g(j12);
                            }
                            if (!k0Var2.f14222f) {
                                z10 = false;
                            }
                            i16++;
                        } while (i16 < i15);
                    } else {
                        z10 = true;
                    }
                    p0Var.f14276d.setValue(Boolean.valueOf(!z10));
                }
                return lVar;
            case 2:
                a((m) obj);
                return lVar;
            default:
                g2.b0 b0Var = (g2.b0) obj5;
                if (b0Var != null) {
                    f0.c2 c2Var = (f0.c2) obj4;
                    if (c2Var.b()) {
                        c2Var.f5640e = a.a.d(b0Var, (g2.a0) obj3, c2Var.f5639d, (g2.o) obj2, c2Var.f5655t, c2Var.f5656u);
                    }
                }
                return new f0.q();
        }
    }
}
