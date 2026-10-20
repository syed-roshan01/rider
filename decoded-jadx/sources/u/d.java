package u;

import v.k3;
import v.u2;

/* JADX INFO: loaded from: classes.dex */
public final class d extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f14749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f14750c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, u8.e eVar2) {
        super(2, eVar2);
        this.f14750c = eVar;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        d dVar = new d(this.f14750c, eVar);
        dVar.f14749b = obj;
        return dVar;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((o1.z) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f14748a;
        q8.l lVar = q8.l.f13235a;
        if (i10 == 0) {
            d7.t.v0(obj);
            o1.z zVar = (o1.z) this.f14749b;
            this.f14748a = 1;
            e0 e0Var = (e0) this.f14750c;
            e0Var.getClass();
            long j10 = ((o1.j0) zVar).A;
            long jC = i1.b.c(((int) (j10 >> 32)) / 2, ((int) (j10 & 4294967295L)) / 2);
            int i11 = m2.i.f11808c;
            e0Var.f14760z.f14714c = d9.i.f((int) (jC >> 32), (int) (jC & 4294967295L));
            d0 d0Var = new d0(e0Var, null);
            q.w wVar = new q.w(e0Var, 6);
            v.p0 p0Var = k3.f15663a;
            Object objQ = d7.a.q(new u2(zVar, d0Var, wVar, new v.l1(zVar), null), this);
            if (objQ != aVar) {
                objQ = lVar;
            }
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
