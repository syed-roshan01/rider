package q9;

import m9.d0;

/* JADX INFO: loaded from: classes.dex */
public final class e extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f13249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p9.g f13250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f13251d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(u8.e eVar, p9.g gVar, g gVar2) {
        super(2, eVar);
        this.f13250c = gVar;
        this.f13251d = gVar2;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        e eVar2 = new e(eVar, this.f13250c, this.f13251d);
        eVar2.f13249b = obj;
        return eVar2;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((d0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f13248a;
        q8.l lVar = q8.l.f13235a;
        if (i10 == 0) {
            d7.t.v0(obj);
            d0 d0Var = (d0) this.f13249b;
            g gVar = this.f13251d;
            int i11 = gVar.f13256b;
            if (i11 == -3) {
                i11 = -2;
            }
            c9.e fVar = new f(gVar, null);
            o9.q qVar = new o9.q(z6.a.W(d0Var, gVar.f13255a), z6.a.a(i11, gVar.f13257c, 4));
            qVar.k0(3, qVar, fVar);
            this.f13248a = 1;
            Object objX = z6.a.x(this.f13250c, qVar, true, this);
            if (objX != aVar) {
                objX = lVar;
            }
            if (objX == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d7.t.v0(obj);
        }
        return lVar;
    }
}
