package u;

/* JADX INFO: loaded from: classes.dex */
public final class z0 extends w8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d1 f14994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public x.h f14995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f14996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d1 f14997d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14998e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(d1 d1Var, u8.e eVar) {
        super(eVar);
        this.f14997d = d1Var;
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        this.f14996c = obj;
        this.f14998e |= Integer.MIN_VALUE;
        return this.f14997d.G0(this);
    }
}
