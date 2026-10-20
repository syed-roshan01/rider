package p9;

/* JADX INFO: loaded from: classes.dex */
public final class c extends q9.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c9.e f12869d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c9.e f12870e;

    public c(c9.e eVar, u8.j jVar, int i10, o9.a aVar) {
        super(jVar, i10, aVar);
        this.f12869d = eVar;
        this.f12870e = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // q9.g
    public final Object c(o9.r rVar, u8.e eVar) {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i10 = bVar.f12861d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f12861d = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, eVar);
            }
        } else {
            bVar = new b(this, eVar);
        }
        Object obj = bVar.f12859b;
        v8.a aVar = v8.a.f15963a;
        int i11 = bVar.f12861d;
        q8.l lVar = q8.l.f13235a;
        if (i11 == 0) {
            d7.t.v0(obj);
            bVar.f12858a = rVar;
            bVar.f12861d = 1;
            Object objInvoke = this.f12869d.invoke(rVar, bVar);
            if (objInvoke != aVar) {
                objInvoke = lVar;
            }
            if (objInvoke == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rVar = bVar.f12858a;
            d7.t.v0(obj);
        }
        if (((o9.q) rVar).f12722d.r()) {
            return lVar;
        }
        throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
    }

    @Override // q9.g
    public final q9.g d(u8.j jVar, int i10, o9.a aVar) {
        return new c(this.f12870e, jVar, i10, aVar);
    }

    @Override // q9.g
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        return "block[" + this.f12869d + "] -> " + super.toString();
    }
}
