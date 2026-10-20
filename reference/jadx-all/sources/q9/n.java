package q9;

import m9.d0;

/* JADX INFO: loaded from: classes.dex */
public final class n extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f13276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f13277c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p9.g f13278d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, p9.g gVar, u8.e eVar) {
        super(2, eVar);
        this.f13277c = oVar;
        this.f13278d = gVar;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        n nVar = new n(this.f13277c, this.f13278d, eVar);
        nVar.f13276b = obj;
        return nVar;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((d0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f13275a;
        if (i10 == 0) {
            d7.t.v0(obj);
            d0 d0Var = (d0) this.f13276b;
            d9.u uVar = new d9.u();
            o oVar = this.f13277c;
            p9.f fVar = oVar.f13261d;
            m mVar = new m(uVar, d0Var, oVar, this.f13278d);
            this.f13275a = 1;
            if (fVar.collect(mVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d7.t.v0(obj);
        }
        return q8.l.f13235a;
    }
}
