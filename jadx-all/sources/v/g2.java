package v;

/* JADX INFO: loaded from: classes.dex */
public final class g2 extends w8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d9.t f15563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f15564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l2 f15565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15566d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(l2 l2Var, u8.e eVar) {
        super(eVar);
        this.f15565c = l2Var;
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        this.f15564b = obj;
        this.f15566d |= Integer.MIN_VALUE;
        return this.f15565c.b(0L, this);
    }
}
