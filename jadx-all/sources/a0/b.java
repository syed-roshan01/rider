package a0;

/* JADX INFO: loaded from: classes.dex */
public final class b implements r1.q0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public u8.l f777c;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(u8.e eVar) {
        a aVar;
        u8.e eVar2;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i10 = aVar.f774d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f774d = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, eVar);
            }
        } else {
            aVar = new a(this, eVar);
        }
        Object obj = aVar.f772b;
        v8.a aVar2 = v8.a.f15963a;
        int i11 = aVar.f774d;
        q8.l lVar = q8.l.f13235a;
        if (i11 == 0) {
            d7.t.v0(obj);
            if (!this.f776b) {
                u8.l lVar2 = this.f777c;
                aVar.getClass();
                aVar.f771a = lVar2;
                aVar.f774d = 1;
                u8.l lVar3 = new u8.l(v8.a.f15964b, d7.t.b0(aVar));
                this.f777c = lVar3;
                if (lVar3.a() == aVar2) {
                    return aVar2;
                }
                eVar2 = lVar2;
            }
            return lVar;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        eVar2 = aVar.f771a;
        d7.t.v0(obj);
        if (eVar2 != null) {
            eVar2.resumeWith(lVar);
        }
        return lVar;
    }
}
