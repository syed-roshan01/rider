package u;

/* JADX INFO: loaded from: classes.dex */
public final class d0 extends w8.i implements c9.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ v.l1 f14752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ long f14753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e0 f14754d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(e0 e0Var, u8.e eVar) {
        super(3, eVar);
        this.f14754d = e0Var;
    }

    @Override // c9.f
    public final Object e(Object obj, Object obj2, Object obj3) {
        long j10 = ((d1.c) obj2).f4330a;
        d0 d0Var = new d0(this.f14754d, (u8.e) obj3);
        d0Var.f14752b = (v.l1) obj;
        d0Var.f14753c = j10;
        return d0Var.invokeSuspend(q8.l.f13235a);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0040  */
    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        Object objQ;
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f14751a;
        q8.l lVar = q8.l.f13235a;
        if (i10 == 0) {
            d7.t.v0(obj);
            v.l1 l1Var = this.f14752b;
            long j10 = this.f14753c;
            e0 e0Var = this.f14754d;
            if (e0Var.f14757w) {
                this.f14751a = 1;
                x.m mVar = e0Var.f14758x;
                if (mVar == null) {
                    objQ = lVar;
                } else {
                    objQ = d7.a.q(new b0(l1Var, j10, mVar, e0Var.f14760z, e0Var.A, null), this);
                    if (objQ != aVar) {
                        objQ = lVar;
                    }
                    if (objQ != aVar) {
                        objQ = lVar;
                    }
                }
                if (objQ == aVar) {
                    return aVar;
                }
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
