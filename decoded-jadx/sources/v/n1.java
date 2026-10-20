package v;

/* JADX INFO: loaded from: classes.dex */
public final class n1 implements x0, k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l2 f15715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r1 f15716b;

    @Override // v.k0
    public final void a(float f10) {
        r1 r1Var = this.f15716b;
        l2 l2Var = this.f15715a;
        l2Var.a(r1Var, l2Var.d(f10), 1);
    }

    @Override // v.x0
    public final Object b(v0 v0Var, i iVar) {
        Object objC = this.f15715a.f15669a.c(u.s1.f14929b, new m1(this, v0Var, null), iVar);
        return objC == v8.a.f15963a ? objC : q8.l.f13235a;
    }
}
