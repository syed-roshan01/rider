package e8;

/* JADX INFO: loaded from: classes.dex */
public final class t extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f5364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l1 f5365b;

    public t(d dVar, l1 l1Var) {
        this.f5364a = dVar;
        this.f5365b = l1Var;
    }

    @Override // e8.d
    public final void a(l1 l1Var) {
        l1 l1Var2 = new l1();
        l1Var2.d(this.f5365b);
        l1Var2.d(l1Var);
        this.f5364a.a(l1Var2);
    }

    @Override // e8.d
    public final void b(c2 c2Var) {
        this.f5364a.b(c2Var);
    }
}
