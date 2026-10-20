package a0;

import v.f2;

/* JADX INFO: loaded from: classes.dex */
public final class k0 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f818c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(h0 h0Var, float f10, u8.e eVar) {
        super(2, eVar);
        this.f817b = h0Var;
        this.f818c = f10;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        return new k0(this.f817b, this.f818c, eVar);
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((k0) create((m9.d0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        Object objM;
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f816a;
        q8.l lVar = q8.l.f13235a;
        if (i10 == 0) {
            d7.t.v0(obj);
            this.f816a = 1;
            z.d dVar = (z.d) this.f817b;
            int i11 = dVar.f17028a;
            float f10 = this.f818c;
            f2 f2Var = dVar.f17030c;
            switch (i11) {
                case 0:
                    objM = f6.a.m((z.g0) f2Var, f10, t.e.r(0.0f, null, 7), this);
                    if (objM != aVar) {
                        objM = lVar;
                    }
                    break;
                default:
                    objM = f6.a.m((b0.h0) f2Var, f10, t.e.r(0.0f, null, 7), this);
                    if (objM != aVar) {
                        objM = lVar;
                    }
                    break;
            }
            if (objM == aVar) {
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
