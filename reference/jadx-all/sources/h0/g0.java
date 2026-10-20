package h0;

/* JADX INFO: loaded from: classes.dex */
public final class g0 extends d9.j implements c9.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g0 f7388b = new g0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g0 f7389c = new g0(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g0 f7390d = new g0(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7391a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(int i10) {
        super(1);
        this.f7391a = i10;
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        switch (this.f7391a) {
            case 0:
                long j10 = ((d1.c) obj).f4330a;
                return d9.i.u(j10) ? new t.q(d1.c.d(j10), d1.c.e(j10)) : k0.f7420a;
            case 1:
                t.q qVar = (t.q) obj;
                return new d1.c(d9.i.f(qVar.f14279a, qVar.f14280b));
            default:
                return q8.l.f13235a;
        }
    }
}
