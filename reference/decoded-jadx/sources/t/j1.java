package t;

/* JADX INFO: loaded from: classes.dex */
public final class j1 extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d9.u f14211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f14212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f14213c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f14214d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c9.c f14215e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(d9.u uVar, float f10, j jVar, o oVar, c9.c cVar) {
        super(1);
        this.f14211a = uVar;
        this.f14212b = f10;
        this.f14213c = jVar;
        this.f14214d = oVar;
        this.f14215e = cVar;
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        long jLongValue = ((Number) obj).longValue();
        Object obj2 = this.f14211a.f4952a;
        d7.a.j(obj2);
        e.n((m) obj2, jLongValue, this.f14212b, this.f14213c, this.f14214d, this.f14215e);
        return q8.l.f13235a;
    }
}
