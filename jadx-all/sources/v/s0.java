package v;

/* JADX INFO: loaded from: classes.dex */
public final class s0 extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0.l3 f15772b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0(m0.l3 l3Var, int i10) {
        super(1);
        this.f15771a = i10;
        this.f15772b = l3Var;
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        q8.l lVar = q8.l.f13235a;
        int i10 = this.f15771a;
        m0.l3 l3Var = this.f15772b;
        switch (i10) {
            case 0:
                ((c9.c) l3Var.getValue()).invoke(Float.valueOf(((Number) obj).floatValue()));
                return lVar;
            case 1:
                return (Float) ((c9.c) l3Var.getValue()).invoke(Float.valueOf(((Number) obj).floatValue()));
            case 2:
                ((c9.c) l3Var.getValue()).invoke(new d1.c(((d1.c) obj).f4330a));
                return lVar;
            default:
                g1.g gVar = (g1.g) obj;
                d7.a.m(gVar, "$this$drawBehind");
                e1.r rVar = new e1.r(e1.r.b(e5.a.f5125a, (((Number) l3Var.getValue()).floatValue() * 0.06f) + 0.08f));
                long j10 = e1.r.f5064f;
                gVar.W(a4.q.j(d7.t.e0(rVar, new e1.r(j10)), 400.0f, 10), 400.0f, d9.i.f(d1.f.d(gVar.e()) * 0.2f, ((((Number) l3Var.getValue()).floatValue() * 0.1f) + 0.2f) * d1.f.b(gVar.e())), 1.0f, g1.j.f6502a, null, 3);
                gVar.W(a4.q.j(d7.t.e0(new e1.r(e1.r.b(e5.a.f5130f, (((Number) l3Var.getValue()).floatValue() * 0.04f) + 0.05f)), new e1.r(j10)), 350.0f, 10), 350.0f, d9.i.f(d1.f.d(gVar.e()) * 0.85f, (0.65f - (((Number) l3Var.getValue()).floatValue() * 0.1f)) * d1.f.b(gVar.e())), 1.0f, g1.j.f6502a, null, 3);
                gVar.W(a4.q.j(d7.t.e0(new e1.r(e1.r.b(e5.a.f5128d, (((Number) l3Var.getValue()).floatValue() * 0.03f) + 0.04f)), new e1.r(j10)), 300.0f, 10), 300.0f, d9.i.f(d1.f.d(gVar.e()) * 0.5f, d1.f.b(gVar.e()) * 0.85f), 1.0f, g1.j.f6502a, null, 3);
                return lVar;
        }
    }
}
