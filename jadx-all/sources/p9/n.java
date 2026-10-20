package p9;

/* JADX INFO: loaded from: classes.dex */
public final class n extends w8.i implements c9.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ g f12927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f12928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c9.e f12929d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(c9.e eVar, u8.e eVar2) {
        super(3, eVar2);
        this.f12929d = eVar;
    }

    @Override // c9.f
    public final Object e(Object obj, Object obj2, Object obj3) {
        n nVar = new n(this.f12929d, (u8.e) obj3);
        nVar.f12927b = (g) obj;
        nVar.f12928c = obj2;
        return nVar.invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        g gVar;
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f12926a;
        if (i10 != 0) {
            if (i10 == 1) {
                gVar = this.f12927b;
                d7.t.v0(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d7.t.v0(obj);
            }
            return q8.l.f13235a;
        }
        d7.t.v0(obj);
        gVar = this.f12927b;
        Object obj2 = this.f12928c;
        this.f12927b = gVar;
        this.f12926a = 1;
        obj = this.f12929d.invoke(obj2, this);
        if (obj == aVar) {
            return aVar;
        }
        this.f12927b = null;
        this.f12926a = 2;
        if (gVar.emit(obj, this) == aVar) {
            return aVar;
        }
        return q8.l.f13235a;
    }
}
