package j0;

import h0.i0;

/* JADX INFO: loaded from: classes.dex */
public final class f extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f8265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x.l f8266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u f8267d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(x.l lVar, u uVar, u8.e eVar) {
        super(2, eVar);
        this.f8266c = lVar;
        this.f8267d = uVar;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        f fVar = new f(this.f8266c, this.f8267d, eVar);
        fVar.f8265b = obj;
        return fVar;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((m9.d0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f8264a;
        int i11 = 1;
        if (i10 == 0) {
            d7.t.v0(obj);
            m9.d0 d0Var = (m9.d0) this.f8265b;
            p9.c0 c0Var = ((x.m) this.f8266c).f16277a;
            i0 i0Var = new i0(i11, this.f8267d, d0Var);
            this.f8264a = 1;
            c0Var.getClass();
            if (p9.c0.k(c0Var, i0Var, this) == aVar) {
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
