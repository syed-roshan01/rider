package i4;

import d7.t;
import m9.d0;
import m9.i0;
import m9.m0;

/* JADX INFO: loaded from: classes.dex */
public final class k extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f8039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s4.j f8040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f8041d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o oVar, s4.j jVar, u8.e eVar) {
        super(2, eVar);
        this.f8040c = jVar;
        this.f8041d = oVar;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        k kVar = new k(this.f8041d, this.f8040c, eVar);
        kVar.f8039b = obj;
        return kVar;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((d0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f8038a;
        if (i10 == 0) {
            t.v0(obj);
            d0 d0Var = (d0) this.f8039b;
            t9.d dVar = m0.f11969a;
            n9.d dVar2 = ((n9.d) r9.o.f13724a).f12323f;
            o oVar = this.f8041d;
            s4.j jVar = this.f8040c;
            i0 i0VarE = z6.a.e(d0Var, dVar2, new j(oVar, jVar, null), 2);
            u4.a aVar2 = jVar.f13997c;
            this.f8038a = 1;
            obj = i0VarE.y(this);
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
