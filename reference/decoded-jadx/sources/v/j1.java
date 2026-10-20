package v;

/* JADX INFO: loaded from: classes.dex */
public final class j1 extends w8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l1 f15642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f15643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1 f15644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15645d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(l1 l1Var, u8.e eVar) {
        super(eVar);
        this.f15644c = l1Var;
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        this.f15643b = obj;
        this.f15645d |= Integer.MIN_VALUE;
        return this.f15644c.a(this);
    }
}
