package x;

import d7.t;
import java.util.ArrayList;
import m0.g1;
import m9.d0;
import p9.c0;

/* JADX INFO: loaded from: classes.dex */
public final class q extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f16282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f16283c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(l lVar, g1 g1Var, u8.e eVar) {
        super(2, eVar);
        this.f16282b = lVar;
        this.f16283c = g1Var;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        return new q(this.f16282b, this.f16283c, eVar);
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((d0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f16281a;
        if (i10 == 0) {
            t.v0(obj);
            ArrayList arrayList = new ArrayList();
            c0 c0Var = ((m) this.f16282b).f16277a;
            f fVar = new f(arrayList, this.f16283c, 2);
            this.f16281a = 1;
            c0Var.getClass();
            if (c0.k(c0Var, fVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.v0(obj);
        }
        return q8.l.f13235a;
    }
}
