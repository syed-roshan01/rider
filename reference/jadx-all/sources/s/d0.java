package s;

import m0.l3;
import m0.t1;
import t.u1;

/* JADX INFO: loaded from: classes.dex */
public final class d0 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f13765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u1 f13766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l3 f13767d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(u1 u1Var, l3 l3Var, u8.e eVar) {
        super(2, eVar);
        this.f13766c = u1Var;
        this.f13767d = l3Var;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        d0 d0Var = new d0(this.f13766c, this.f13767d, eVar);
        d0Var.f13765b = obj;
        return d0Var;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((d0) create((t1) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f13764a;
        if (i10 == 0) {
            d7.t.v0(obj);
            t1 t1Var = (t1) this.f13765b;
            u1 u1Var = this.f13766c;
            a4.c0 c0VarT0 = d7.t.t0(new b0(u1Var, 0));
            c0 c0Var = new c0(t1Var, u1Var, this.f13767d, 0);
            this.f13764a = 1;
            if (c0VarT0.collect(c0Var, this) == aVar) {
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
