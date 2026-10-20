package m0;

/* JADX INFO: loaded from: classes.dex */
public final class o1 extends w8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p1 f11613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c9.c f11614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f11615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1 f11616d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11617e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(p1 p1Var, u8.e eVar) {
        super(eVar);
        this.f11616d = p1Var;
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        this.f11615c = obj;
        this.f11617e |= Integer.MIN_VALUE;
        return this.f11616d.T(null, this);
    }
}
