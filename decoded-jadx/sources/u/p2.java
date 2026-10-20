package u;

/* JADX INFO: loaded from: classes.dex */
public final class p2 implements v.f2 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final v0.p f14883i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0.l1 f14884a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f14888e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m0.l1 f14885b = o7.d0.Z(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x.m f14886c = new x.m();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m0.l1 f14887d = o7.d0.Z(Integer.MAX_VALUE);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final v.y f14889f = new v.y(new q.w(this, 8));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m0.j0 f14890g = d7.t.R(new m2(this, 3));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m0.j0 f14891h = d7.t.R(new m2(this, 2));

    static {
        o2 o2Var = o2.f14872a;
        r rVar = r.f14914f;
        v0.p pVar = v0.q.f15881a;
        f14883i = new v0.p(o2Var, rVar);
    }

    public p2(int i10) {
        this.f14884a = o7.d0.Z(i10);
    }

    @Override // v.f2
    public final boolean a() {
        return ((Boolean) this.f14891h.getValue()).booleanValue();
    }

    @Override // v.f2
    public final boolean b() {
        return this.f14889f.b();
    }

    @Override // v.f2
    public final Object c(s1 s1Var, c9.e eVar, u8.e eVar2) {
        Object objC = this.f14889f.c(s1Var, eVar, eVar2);
        return objC == v8.a.f15963a ? objC : q8.l.f13235a;
    }

    @Override // v.f2
    public final boolean d() {
        return ((Boolean) this.f14890g.getValue()).booleanValue();
    }

    @Override // v.f2
    public final float e(float f10) {
        return this.f14889f.e(f10);
    }

    public final int f() {
        return this.f14884a.d();
    }
}
