package c0;

import d7.t;
import m9.d0;
import r1.s;

/* JADX INFO: loaded from: classes.dex */
public final class l extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f2865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f2866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f2867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c9.a f2868d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c9.a f2869e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, s sVar, c9.a aVar, c9.a aVar2, u8.e eVar) {
        super(2, eVar);
        this.f2866b = mVar;
        this.f2867c = sVar;
        this.f2868d = aVar;
        this.f2869e = aVar2;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        l lVar = new l(this.f2866b, this.f2867c, this.f2868d, this.f2869e, eVar);
        lVar.f2865a = obj;
        return lVar;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((d0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        t.v0(obj);
        d0 d0Var = (d0) this.f2865a;
        m mVar = this.f2866b;
        z6.a.Q(d0Var, null, 0, new j(mVar, this.f2867c, this.f2868d, null), 3);
        return z6.a.Q(d0Var, null, 0, new k(mVar, this.f2869e, null), 3);
    }
}
