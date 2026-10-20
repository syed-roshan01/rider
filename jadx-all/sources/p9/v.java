package p9;

/* JADX INFO: loaded from: classes.dex */
public final class v extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f12963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f12964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x f12965d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f12966e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(f fVar, x xVar, Object obj, u8.e eVar) {
        super(2, eVar);
        this.f12964c = fVar;
        this.f12965d = xVar;
        this.f12966e = obj;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        v vVar = new v(this.f12964c, this.f12965d, this.f12966e, eVar);
        vVar.f12963b = obj;
        return vVar;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((f0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f12962a;
        if (i10 == 0) {
            d7.t.v0(obj);
            int iOrdinal = ((f0) this.f12963b).ordinal();
            x xVar = this.f12965d;
            if (iOrdinal == 0) {
                this.f12962a = 1;
                if (this.f12964c.collect(xVar, this) == aVar) {
                    return aVar;
                }
            } else if (iOrdinal == 2) {
                i3.u uVar = d0.f12882a;
                Object obj2 = this.f12966e;
                if (obj2 == uVar) {
                    xVar.a();
                } else {
                    xVar.f(obj2);
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d7.t.v0(obj);
        }
        return q8.l.f13235a;
    }
}
