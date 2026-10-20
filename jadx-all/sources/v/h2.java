package v;

/* JADX INFO: loaded from: classes.dex */
public final class h2 implements r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l2 f15596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c9.c f15597b;

    public h2(l2 l2Var, u.s sVar) {
        this.f15596a = l2Var;
        this.f15597b = sVar;
    }

    @Override // v.r1
    public final float a(float f10) {
        l2 l2Var = this.f15596a;
        long j10 = ((d1.c) this.f15597b.invoke(new d1.c(l2Var.d(f10)))).f4330a;
        return l2Var.f15670b == h1.f15594b ? d1.c.d(j10) : d1.c.e(j10);
    }
}
