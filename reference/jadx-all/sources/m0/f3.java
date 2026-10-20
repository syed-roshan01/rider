package m0;

/* JADX INFO: loaded from: classes.dex */
public final class f3 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f11507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u8.j f11508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p9.f f11509d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(u8.j jVar, p9.f fVar, u8.e eVar) {
        super(2, eVar);
        this.f11508c = jVar;
        this.f11509d = fVar;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        f3 f3Var = new f3(this.f11508c, this.f11509d, eVar);
        f3Var.f11507b = obj;
        return f3Var;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((f3) create((t1) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f11506a;
        if (i10 == 0) {
            d7.t.v0(obj);
            t1 t1Var = (t1) this.f11507b;
            u8.k kVar = u8.k.f15438a;
            u8.j jVar = this.f11508c;
            boolean zD = d7.a.d(jVar, kVar);
            p9.f fVar = this.f11509d;
            if (zD) {
                d3 d3Var = new d3(t1Var, 0);
                this.f11506a = 1;
                if (fVar.collect(d3Var, this) == aVar) {
                    return aVar;
                }
            } else {
                e3 e3Var = new e3(fVar, t1Var, null);
                this.f11506a = 2;
                if (z6.a.u0(jVar, e3Var, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d7.t.v0(obj);
        }
        return q8.l.f13235a;
    }
}
