package v;

/* JADX INFO: loaded from: classes.dex */
public final class e extends w8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f15517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m9.d0 f15518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f15519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f15520d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15521e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(j jVar, u8.e eVar) {
        super(eVar);
        this.f15520d = jVar;
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        this.f15519c = obj;
        this.f15521e |= Integer.MIN_VALUE;
        return j.H0(this.f15520d, this, null);
    }
}
