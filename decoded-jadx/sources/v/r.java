package v;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class r extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f15755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f15756c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, u8.e eVar) {
        super(2, eVar);
        this.f15756c = sVar;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        r rVar = new r(this.f15756c, eVar);
        rVar.f15755b = obj;
        return rVar;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((m9.d0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f15754a;
        s sVar = this.f15756c;
        try {
            try {
                if (i10 == 0) {
                    d7.t.v0(obj);
                    m9.f1 f1VarG0 = h6.g.g0(((m9.d0) this.f15755b).q());
                    sVar.E = true;
                    f2 f2Var = sVar.f15766v;
                    q qVar = new q(sVar, f1VarG0, null);
                    this.f15754a = 1;
                    if (f2Var.c(u.s1.f14928a, qVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d7.t.v0(obj);
                }
                sVar.f15769y.b();
                sVar.E = false;
                sVar.f15769y.a(null);
                sVar.C = false;
                return q8.l.f13235a;
            } catch (CancellationException e4) {
                throw e4;
            }
        } catch (Throwable th) {
            sVar.E = false;
            sVar.f15769y.a(null);
            sVar.C = false;
            throw th;
        }
    }
}
