package t;

/* JADX INFO: loaded from: classes.dex */
public final class r1 extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14303a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f14304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14305c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(float f10, m0.g1 g1Var) {
        super(1);
        this.f14304b = f10;
        this.f14305c = g1Var;
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        q8.l lVar = q8.l.f13235a;
        int i10 = this.f14303a;
        Object obj2 = this.f14305c;
        float f10 = this.f14304b;
        switch (i10) {
            case 0:
                long jLongValue = ((Number) obj).longValue();
                u1 u1Var = (u1) obj2;
                if (!u1Var.d()) {
                    u1Var.e(f10, jLongValue);
                }
                break;
            default:
                long j10 = ((d1.f) obj).f4347a;
                float fD = d1.f.d(j10) * f10;
                float fB = d1.f.b(j10) * f10;
                m0.g1 g1Var = (m0.g1) obj2;
                if (d1.f.d(((d1.f) g1Var.getValue()).f4347a) != fD || d1.f.b(((d1.f) g1Var.getValue()).f4347a) != fB) {
                    g1Var.setValue(new d1.f(d7.t.j(fD, fB)));
                }
                break;
        }
        return lVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(u1 u1Var, float f10) {
        super(1);
        this.f14305c = u1Var;
        this.f14304b = f10;
    }
}
