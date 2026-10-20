package i4;

import d7.t;
import m9.d0;

/* JADX INFO: loaded from: classes.dex */
public final class j extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f8036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s4.j f8037c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(o oVar, s4.j jVar, u8.e eVar) {
        super(2, eVar);
        this.f8036b = oVar;
        this.f8037c = jVar;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        return new j(this.f8036b, this.f8037c, eVar);
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((d0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f8035a;
        if (i10 == 0) {
            t.v0(obj);
            this.f8035a = 1;
            obj = o.a(this.f8036b, this.f8037c, 1, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.v0(obj);
        }
        return obj;
    }
}
