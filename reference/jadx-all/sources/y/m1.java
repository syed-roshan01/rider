package y;

/* JADX INFO: loaded from: classes.dex */
public final class m1 extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n1 f16634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r1.x0 f16636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f16637d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r1.l0 f16638e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(n1 n1Var, int i10, r1.x0 x0Var, int i11, r1.l0 l0Var) {
        super(1);
        this.f16634a = n1Var;
        this.f16635b = i10;
        this.f16636c = x0Var;
        this.f16637d = i11;
        this.f16638e = l0Var;
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        c9.e eVar = this.f16634a.f16647w;
        r1.x0 x0Var = this.f16636c;
        r1.w0.f((r1.w0) obj, x0Var, ((m2.i) eVar.invoke(new m2.k(o1.s.e(this.f16635b - x0Var.f13423a, this.f16637d - x0Var.f13424b)), this.f16638e.getLayoutDirection())).f11809a);
        return q8.l.f13235a;
    }
}
