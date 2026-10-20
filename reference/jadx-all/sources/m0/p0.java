package m0;

/* JADX INFO: loaded from: classes.dex */
public final class p0 extends u1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z2 f11624b;

    public p0(z2 z2Var, c9.a aVar) {
        super(aVar);
        this.f11624b = z2Var;
    }

    @Override // m0.z
    public final l3 a(l3 l3Var, Object obj) {
        if (l3Var == null || !(l3Var instanceof g1)) {
            return d7.t.g0(obj, this.f11624b);
        }
        ((g1) l3Var).setValue(obj);
        return l3Var;
    }
}
