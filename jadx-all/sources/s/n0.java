package s;

/* JADX INFO: loaded from: classes.dex */
public final class n0 extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p0 f13841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f13842c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(p0 p0Var, long j10, int i10) {
        super(1);
        this.f13840a = i10;
        this.f13841b = p0Var;
        this.f13842c = j10;
    }

    public final long a(j0 j0Var) {
        int i10 = this.f13840a;
        p0 p0Var = this.f13841b;
        switch (i10) {
            case 1:
                if (p0Var.C == null) {
                    return m2.i.f11807b;
                }
                p0Var.G0();
                return m2.i.f11807b;
            default:
                p0Var.f13855y.f13858a.getClass();
                long j10 = m2.i.f11807b;
                p0Var.f13856z.f13861a.getClass();
                int iOrdinal = j0Var.ordinal();
                if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
                    return j10;
                }
                throw new androidx.fragment.app.a0();
        }
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        switch (this.f13840a) {
            case 0:
                p0 p0Var = this.f13841b;
                p0Var.getClass();
                int iOrdinal = ((j0) obj).ordinal();
                if (iOrdinal == 0) {
                    p0Var.f13855y.f13858a.getClass();
                } else if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        throw new androidx.fragment.app.a0();
                    }
                    p0Var.f13856z.f13861a.getClass();
                }
                return new m2.k(this.f13842c);
            case 1:
                return new m2.i(a((j0) obj));
            default:
                return new m2.i(a((j0) obj));
        }
    }
}
