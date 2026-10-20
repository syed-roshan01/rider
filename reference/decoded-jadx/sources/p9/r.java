package p9;

/* JADX INFO: loaded from: classes.dex */
public final class r implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c9.e f12949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d9.u f12950b;

    public r(c9.e eVar, d9.u uVar) {
        this.f12949a = eVar;
        this.f12950b = uVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p9.g
    public final Object emit(Object obj, u8.e eVar) {
        q qVar;
        r rVar;
        if (eVar instanceof q) {
            qVar = (q) eVar;
            int i10 = qVar.f12944c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                qVar.f12944c = i10 - Integer.MIN_VALUE;
            } else {
                qVar = new q(this, eVar);
            }
        } else {
            qVar = new q(this, eVar);
        }
        Object objInvoke = qVar.f12943b;
        v8.a aVar = v8.a.f15963a;
        int i11 = qVar.f12944c;
        if (i11 == 0) {
            d7.t.v0(objInvoke);
            qVar.f12942a = this;
            qVar.f12946e = obj;
            qVar.f12944c = 1;
            objInvoke = this.f12949a.invoke(obj, qVar);
            if (objInvoke == aVar) {
                return aVar;
            }
            rVar = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = qVar.f12946e;
            rVar = qVar.f12942a;
            d7.t.v0(objInvoke);
        }
        if (!((Boolean) objInvoke).booleanValue()) {
            return q8.l.f13235a;
        }
        rVar.f12950b.f4952a = obj;
        throw new q9.a(rVar);
    }
}
