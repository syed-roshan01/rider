package c0;

import d7.t;
import m9.d0;
import r1.s;

/* JADX INFO: loaded from: classes.dex */
public final class k extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f2863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c9.a f2864c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, c9.a aVar, u8.e eVar) {
        super(2, eVar);
        this.f2863b = mVar;
        this.f2864c = aVar;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        return new k(this.f2863b, this.f2864c, eVar);
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((d0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f2862a;
        q8.l lVar = q8.l.f13235a;
        if (i10 == 0) {
            t.v0(obj);
            m mVar = this.f2863b;
            mVar.getClass();
            d dVar = (d) mVar.g(c.f2845a);
            if (dVar == null) {
                dVar = mVar.f2842u;
            }
            s sVarG0 = mVar.G0();
            if (sVarG0 == null) {
                return lVar;
            }
            this.f2862a = 1;
            if (dVar.x(sVarG0, this.f2864c, this) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.v0(obj);
        }
        return lVar;
    }
}
