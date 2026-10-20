package p9;

/* JADX INFO: loaded from: classes.dex */
public final class m implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d9.q f12922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f12923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c9.e f12924c;

    public m(d9.q qVar, g gVar, c9.e eVar) {
        this.f12922a = qVar;
        this.f12923b = gVar;
        this.f12924c = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0070  */
    /* JADX WARN: Code duplicated, block: B:32:0x0083 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p9.g
    public final Object emit(Object obj, u8.e eVar) {
        l lVar;
        m mVar;
        if (eVar instanceof l) {
            lVar = (l) eVar;
            int i10 = lVar.f12917e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                lVar.f12917e = i10 - Integer.MIN_VALUE;
            } else {
                lVar = new l(this, eVar);
            }
        } else {
            lVar = new l(this, eVar);
        }
        Object objInvoke = lVar.f12915c;
        v8.a aVar = v8.a.f15963a;
        int i11 = lVar.f12917e;
        q8.l lVar2 = q8.l.f13235a;
        if (i11 == 0) {
            d7.t.v0(objInvoke);
            if (this.f12922a.f4948a) {
                lVar.f12917e = 1;
                return this.f12923b.emit(obj, lVar) == aVar ? aVar : lVar2;
            }
            lVar.f12913a = this;
            lVar.f12914b = obj;
            lVar.f12917e = 2;
            objInvoke = this.f12924c.invoke(obj, lVar);
            if (objInvoke == aVar) {
                return aVar;
            }
            mVar = this;
            if (!((Boolean) objInvoke).booleanValue()) {
                mVar.f12922a.f4948a = true;
                lVar.f12913a = null;
                lVar.f12914b = null;
                lVar.f12917e = 3;
                if (mVar.f12923b.emit(obj, lVar) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i11 == 1) {
                d7.t.v0(objInvoke);
            }
            if (i11 == 2) {
                obj = lVar.f12914b;
                mVar = lVar.f12913a;
                d7.t.v0(objInvoke);
                if (!((Boolean) objInvoke).booleanValue()) {
                    mVar.f12922a.f4948a = true;
                    lVar.f12913a = null;
                    lVar.f12914b = null;
                    lVar.f12917e = 3;
                    if (mVar.f12923b.emit(obj, lVar) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d7.t.v0(objInvoke);
            }
        }
        return lVar2;
    }
}
