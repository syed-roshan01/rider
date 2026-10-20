package t1;

/* JADX INFO: loaded from: classes.dex */
public final class m0 extends d9.j implements c9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n0 f14492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f14493b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(n0 n0Var, long j10) {
        super(0);
        this.f14492a = n0Var;
        this.f14493b = j10;
    }

    @Override // c9.a
    public final Object invoke() {
        r0 r0VarI0 = this.f14492a.a().I0();
        d7.a.j(r0VarI0);
        ((w) r0VarI0).f(this.f14493b);
        return q8.l.f13235a;
    }
}
