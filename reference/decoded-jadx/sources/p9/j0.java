package p9;

/* JADX INFO: loaded from: classes.dex */
public final class j0 extends w8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f12905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0.i0 f12906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12907c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(h0.i0 i0Var, u8.e eVar) {
        super(eVar);
        this.f12906b = i0Var;
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        this.f12905a = obj;
        this.f12907c |= Integer.MIN_VALUE;
        return this.f12906b.b(0, this);
    }
}
