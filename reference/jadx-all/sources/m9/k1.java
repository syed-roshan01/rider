package m9;

/* JADX INFO: loaded from: classes.dex */
public final class k1 extends l {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p1 f11957p;

    public k1(u8.e eVar, p1 p1Var) {
        super(1, eVar);
        this.f11957p = p1Var;
    }

    @Override // m9.l
    public final String B() {
        return "AwaitContinuation";
    }

    @Override // m9.l
    public final Throwable r(p1 p1Var) {
        Throwable thC;
        Object objN = this.f11957p.N();
        if (!(objN instanceof m1) || (thC = ((m1) objN).c()) == null) {
            return objN instanceof u ? ((u) objN).f12005a : p1Var.H();
        }
        return thC;
    }
}
