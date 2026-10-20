package t;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class b extends w8.i implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o f14082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d9.q f14083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f14085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f14086e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j f14087f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f14088n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ c9.c f14089o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, Object obj, j jVar, long j10, c9.c cVar, u8.e eVar) {
        super(1, eVar);
        this.f14085d = dVar;
        this.f14086e = obj;
        this.f14087f = jVar;
        this.f14088n = j10;
        this.f14089o = cVar;
    }

    @Override // w8.a
    public final u8.e create(u8.e eVar) {
        return new b(this.f14085d, this.f14086e, this.f14087f, this.f14088n, this.f14089o, eVar);
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        return ((b) create((u8.e) obj)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        d9.q qVar;
        o oVar;
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f14084c;
        int i11 = 1;
        d dVar = this.f14085d;
        try {
            if (i10 == 0) {
                d7.t.v0(obj);
                dVar.f14110c.f14265c = (t) dVar.f14108a.f14351a.invoke(this.f14086e);
                dVar.f14112e.setValue(this.f14087f.e());
                dVar.f14111d.setValue(Boolean.TRUE);
                o oVar2 = dVar.f14110c;
                o oVar3 = new o(oVar2.f14263a, oVar2.f14264b.getValue(), e.j(oVar2.f14265c), oVar2.f14266d, Long.MIN_VALUE, oVar2.f14268f);
                d9.q qVar2 = new d9.q();
                j jVar = this.f14087f;
                long j10 = this.f14088n;
                a aVar2 = new a(this.f14085d, oVar3, this.f14089o, qVar2, 0);
                this.f14082a = oVar3;
                this.f14083b = qVar2;
                this.f14084c = 1;
                if (e.c(oVar3, jVar, j10, aVar2, this) == aVar) {
                    return aVar;
                }
                qVar = qVar2;
                oVar = oVar3;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                qVar = this.f14083b;
                oVar = this.f14082a;
                d7.t.v0(obj);
            }
            if (!qVar.f4948a) {
                i11 = 2;
            }
            d.a(dVar);
            return new l(oVar, i11);
        } catch (CancellationException e4) {
            d.a(dVar);
            throw e4;
        }
    }
}
