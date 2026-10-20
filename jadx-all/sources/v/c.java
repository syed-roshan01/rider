package v;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class c extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f15491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o1.z f15492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f15493d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(o1.z zVar, j jVar, u8.e eVar) {
        super(2, eVar);
        this.f15492c = zVar;
        this.f15493d = jVar;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        c cVar = new c(this.f15492c, this.f15493d, eVar);
        cVar.f15491b = obj;
        return cVar;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((m9.d0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        m9.d0 d0Var;
        CancellationException e4;
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f15490a;
        if (i10 == 0) {
            d7.t.v0(obj);
            m9.d0 d0Var2 = (m9.d0) this.f15491b;
            try {
                o1.z zVar = this.f15492c;
                b bVar = new b(this.f15493d, null, d0Var2);
                this.f15491b = d0Var2;
                this.f15490a = 1;
                if (((o1.j0) zVar).G0(bVar, this) == aVar) {
                    return aVar;
                }
            } catch (CancellationException e10) {
                d0Var = d0Var2;
                e4 = e10;
                if (!d7.a.x(d0Var)) {
                    throw e4;
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d0Var = (m9.d0) this.f15491b;
            try {
                d7.t.v0(obj);
            } catch (CancellationException e11) {
                e4 = e11;
                if (!d7.a.x(d0Var)) {
                    throw e4;
                }
            }
        }
        return q8.l.f13235a;
    }
}
