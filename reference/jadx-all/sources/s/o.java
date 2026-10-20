package s;

/* JADX INFO: loaded from: classes.dex */
public final class o extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13843a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f13846d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f13847e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(int i10, int i11, q.r rVar, a0.r0 r0Var) {
        super(1);
        this.f13844b = i10;
        this.f13845c = i11;
        this.f13846d = rVar;
        this.f13847e = r0Var;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x003c  */
    @Override // c9.c
    public final Object invoke(Object obj) {
        Object cVar;
        q8.l lVar = q8.l.f13235a;
        int i10 = this.f13843a;
        Object obj2 = this.f13847e;
        Object obj3 = this.f13846d;
        int i11 = this.f13845c;
        int i12 = this.f13844b;
        switch (i10) {
            case 0:
                r1.w0 w0Var = (r1.w0) obj;
                p pVar = (p) obj2;
                for (r1.x0 x0Var : (r1.x0[]) obj3) {
                    if (x0Var != null) {
                        long jA = ((y0.g) pVar.f13850a.f13881b).a(o1.s.e(x0Var.f13423a, x0Var.f13424b), o1.s.e(i12, i11), m2.l.f11815a);
                        int i13 = m2.i.f11808c;
                        r1.w0.d(w0Var, x0Var, (int) (jA >> 32), (int) (jA & 4294967295L));
                    }
                }
                break;
            default:
                a0.e eVar = (a0.e) obj;
                c9.c key = ((a0.o) eVar.f784c).getKey();
                int i14 = eVar.f782a;
                int iMax = Math.max(i12, i14);
                int iMin = Math.min(i11, (eVar.f783b + i14) - 1);
                if (iMax <= iMin) {
                    while (true) {
                        if (key == null) {
                            cVar = new a0.c(iMax);
                        } else {
                            cVar = key.invoke(Integer.valueOf(iMax - i14));
                            if (cVar == null) {
                                cVar = new a0.c(iMax);
                            }
                        }
                        q.r rVar = (q.r) obj3;
                        int iC = rVar.c(cVar);
                        if (iC < 0) {
                            iC = ~iC;
                        }
                        rVar.f13022b[iC] = cVar;
                        rVar.f13023c[iC] = iMax;
                        a0.r0 r0Var = (a0.r0) obj2;
                        r0Var.f858b[iMax - r0Var.f859c] = cVar;
                        if (iMax != iMin) {
                            iMax++;
                        }
                    }
                }
                break;
        }
        return lVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(r1.x0[] x0VarArr, p pVar, int i10, int i11) {
        super(1);
        this.f13846d = x0VarArr;
        this.f13847e = pVar;
        this.f13844b = i10;
        this.f13845c = i11;
    }
}
