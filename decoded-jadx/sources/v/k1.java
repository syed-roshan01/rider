package v;

/* JADX INFO: loaded from: classes.dex */
public final class k1 extends w8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l1 f15655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f15656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1 f15657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15658d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(l1 l1Var, u8.e eVar) {
        super(eVar);
        this.f15657c = l1Var;
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        this.f15656b = obj;
        this.f15658d |= Integer.MIN_VALUE;
        return this.f15657c.b(this);
    }
}
