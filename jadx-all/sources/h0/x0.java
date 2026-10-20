package h0;

import f0.e1;
import f0.k1;

/* JADX INFO: loaded from: classes.dex */
public final class x0 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f7505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k1 f7506c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(k1 k1Var, u8.e eVar) {
        super(2, eVar);
        this.f7506c = k1Var;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        x0 x0Var = new x0(this.f7506c, eVar);
        x0Var.f7505b = obj;
        return x0Var;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((x0) create((o1.z) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f7504a;
        q8.l lVar = q8.l.f13235a;
        if (i10 == 0) {
            d7.t.v0(obj);
            o1.z zVar = (o1.z) this.f7505b;
            this.f7504a = 1;
            Object objQ = d7.a.q(new e1(zVar, this.f7506c, null), this);
            if (objQ != aVar) {
                objQ = lVar;
            }
            if (objQ == aVar) {
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
