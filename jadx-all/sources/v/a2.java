package v;

/* JADX INFO: loaded from: classes.dex */
public final class a2 extends w8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b2 f15472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f15473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f15474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b2 f15475d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15476e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(b2 b2Var, u8.e eVar) {
        super(eVar);
        this.f15475d = b2Var;
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        this.f15474c = obj;
        this.f15476e |= Integer.MIN_VALUE;
        return this.f15475d.L(0L, 0L, this);
    }
}
