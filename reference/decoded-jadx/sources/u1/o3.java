package u1;

/* JADX INFO: loaded from: classes.dex */
public final class o3 implements p9.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15194b;

    public /* synthetic */ o3(Object obj, int i10) {
        this.f15193a = i10;
        this.f15194b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    @Override // p9.g
    public final Object emit(Object obj, u8.e eVar) {
        j4.k kVar;
        t4.f fVar;
        q8.l lVar = q8.l.f13235a;
        int i10 = this.f15193a;
        Object obj2 = this.f15194b;
        switch (i10) {
            case 0:
                ((h2) obj2).f15109a.f(((Number) obj).floatValue());
                return lVar;
            default:
                if (eVar instanceof j4.k) {
                    kVar = (j4.k) eVar;
                    int i11 = kVar.f8354b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        kVar.f8354b = i11 - Integer.MIN_VALUE;
                    } else {
                        kVar = new j4.k(this, eVar);
                    }
                } else {
                    kVar = new j4.k(this, eVar);
                }
                Object obj3 = kVar.f8353a;
                v8.a aVar = v8.a.f15963a;
                int i12 = kVar.f8354b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d7.t.v0(obj3);
                    return lVar;
                }
                d7.t.v0(obj3);
                p9.g gVar = (p9.g) obj2;
                long j10 = ((d1.f) obj).f4347a;
                if (j10 == d1.f.f4345c) {
                    fVar = t4.f.f14657c;
                } else if (d1.f.d(j10) < 0.5d || d1.f.b(j10) < 0.5d) {
                    fVar = null;
                } else {
                    float fD = d1.f.d(j10);
                    boolean zIsInfinite = Float.isInfinite(fD);
                    f6.a aVar2 = t4.b.f14648z;
                    f6.a aVar3 = (zIsInfinite || Float.isNaN(fD)) ? aVar2 : new t4.a(d7.t.p0(d1.f.d(j10)));
                    float fB = d1.f.b(j10);
                    if (!Float.isInfinite(fB) && !Float.isNaN(fB)) {
                        aVar2 = new t4.a(d7.t.p0(d1.f.b(j10)));
                    }
                    fVar = new t4.f(aVar3, aVar2);
                }
                if (fVar == null) {
                    return lVar;
                }
                kVar.f8354b = 1;
                return gVar.emit(fVar, kVar) == aVar ? aVar : lVar;
        }
    }
}
