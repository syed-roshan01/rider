package a0;

import u.s1;
import v.f2;

/* JADX INFO: loaded from: classes.dex */
public final class l0 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f824c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(h0 h0Var, int i10, u8.e eVar) {
        super(2, eVar);
        this.f823b = h0Var;
        this.f824c = i10;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        return new l0(this.f823b, this.f824c, eVar);
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((l0) create((m9.d0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0042  */
    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        Object objC;
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f822a;
        q8.l lVar = q8.l.f13235a;
        if (i10 == 0) {
            d7.t.v0(obj);
            this.f822a = 1;
            z.d dVar = (z.d) this.f823b;
            int i11 = dVar.f17028a;
            s1 s1Var = s1.f14928a;
            int i12 = this.f824c;
            f2 f2Var = dVar.f17030c;
            switch (i11) {
                case 0:
                    z.g0 g0Var = (z.g0) f2Var;
                    a.a aVar2 = z.g0.f17044z;
                    g0Var.getClass();
                    objC = g0Var.c(s1Var, new z.d0(g0Var, i12, 0, null), this);
                    if (objC != aVar) {
                        objC = lVar;
                    }
                    if (objC != aVar) {
                        objC = lVar;
                    }
                    break;
                default:
                    b0.h0 h0Var = (b0.h0) f2Var;
                    h0Var.getClass();
                    objC = h0Var.c(s1Var, new b0.g0(h0Var, 0.0f, i12, null), this);
                    if (objC != aVar) {
                        objC = lVar;
                    }
                    if (objC != aVar) {
                        objC = lVar;
                    }
                    break;
            }
            if (objC == aVar) {
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
