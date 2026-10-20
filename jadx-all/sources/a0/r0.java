package a0;

/* JADX INFO: loaded from: classes.dex */
public final class r0 implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q.r f857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f859c;

    public r0(i9.g gVar, h6.g gVar2) {
        q0 q0VarF0 = gVar2.f0();
        int i10 = gVar.f8183a;
        if (i10 < 0) {
            throw new IllegalStateException("negative nearestRange.first".toString());
        }
        int iMin = Math.min(gVar.f8184b, q0VarF0.f849b - 1);
        if (iMin < i10) {
            q.r rVar = q.u.f13034a;
            d7.a.k(rVar, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
            this.f857a = rVar;
            this.f858b = new Object[0];
            this.f859c = 0;
            return;
        }
        int i11 = (iMin - i10) + 1;
        this.f858b = new Object[i11];
        this.f859c = i10;
        q.r rVar2 = new q.r(i11);
        s.o oVar = new s.o(i10, iMin, rVar2, this);
        q0VarF0.b(i10);
        q0VarF0.b(iMin);
        if (iMin < i10) {
            throw new IllegalArgumentException(("toIndex (" + iMin + ") should be not smaller than fromIndex (" + i10 + ')').toString());
        }
        o0.i iVar = q0VarF0.f848a;
        int iL = f6.a.l(i10, iVar);
        int i12 = ((e) iVar.f12341a[iL]).f782a;
        while (i12 <= iMin) {
            e eVar = (e) iVar.f12341a[iL];
            oVar.invoke(eVar);
            i12 += eVar.f783b;
            iL++;
        }
        this.f857a = rVar2;
    }

    @Override // a0.u
    public final Object a(int i10) {
        int i11 = i10 - this.f859c;
        if (i11 >= 0) {
            Object[] objArr = this.f858b;
            d7.a.m(objArr, "<this>");
            if (i11 <= objArr.length - 1) {
                return objArr[i11];
            }
        }
        return null;
    }

    @Override // a0.u
    public final int b(Object obj) {
        q.r rVar = this.f857a;
        int iD = rVar.d(obj);
        if (iD >= 0) {
            return rVar.f13023c[iD];
        }
        return -1;
    }
}
