package v;

/* JADX INFO: loaded from: classes.dex */
public final class j2 extends w8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l2 f15646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f15647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l2 f15648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15649d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(l2 l2Var, u8.e eVar) {
        super(eVar);
        this.f15648c = l2Var;
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        this.f15647b = obj;
        this.f15649d |= Integer.MIN_VALUE;
        return this.f15648c.c(0L, this);
    }
}
