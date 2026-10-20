package u;

/* JADX INFO: loaded from: classes.dex */
public final class y1 implements b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y1 f14988a = new y1();

    @Override // u.b2
    public final long a(long j10, int i10, q2 q2Var) {
        return ((d1.c) q2Var.invoke(new d1.c(j10))).f4330a;
    }

    @Override // u.b2
    public final boolean b() {
        return false;
    }

    @Override // u.b2
    public final y0.o c() {
        return y0.l.f16729b;
    }

    @Override // u.b2
    public final Object d(long j10, v.k2 k2Var, u8.e eVar) {
        Object objInvoke = k2Var.invoke(new m2.p(j10), eVar);
        return objInvoke == v8.a.f15963a ? objInvoke : q8.l.f13235a;
    }
}
