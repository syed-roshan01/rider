package o9;

import m9.d0;

/* JADX INFO: loaded from: classes.dex */
public final class l extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f12715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f12716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f12717d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(t tVar, Object obj, u8.e eVar) {
        super(2, eVar);
        this.f12716c = tVar;
        this.f12717d = obj;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        l lVar = new l(this.f12716c, this.f12717d, eVar);
        lVar.f12715b = obj;
        return lVar;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((d0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        Object objN;
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f12714a;
        Object hVar = q8.l.f13235a;
        try {
            if (i10 == 0) {
                d7.t.v0(obj);
                t tVar = this.f12716c;
                Object obj2 = this.f12717d;
                this.f12714a = 1;
                if (tVar.h(obj2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d7.t.v0(obj);
            }
            objN = hVar;
        } catch (Throwable th) {
            objN = d7.t.N(th);
        }
        if (!(!(objN instanceof q8.g))) {
            hVar = new h(q8.h.a(objN));
        }
        return new j(hVar);
    }
}
