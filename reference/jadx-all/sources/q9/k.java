package q9;

import m9.d0;

/* JADX INFO: loaded from: classes.dex */
public final class k extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f13263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p9.g f13264c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f13265d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o oVar, p9.g gVar, Object obj, u8.e eVar) {
        super(2, eVar);
        this.f13263b = oVar;
        this.f13264c = gVar;
        this.f13265d = obj;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        return new k(this.f13263b, this.f13264c, this.f13265d, eVar);
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((d0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f13262a;
        if (i10 == 0) {
            d7.t.v0(obj);
            c9.f fVar = this.f13263b.f13279e;
            this.f13262a = 1;
            if (fVar.e(this.f13264c, this.f13265d, this) == aVar) {
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
