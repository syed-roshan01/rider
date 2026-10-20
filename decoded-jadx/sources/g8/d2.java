package g8;

/* JADX INFO: loaded from: classes.dex */
public final class d2 implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j0 f6723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e2 f6724b;

    public d2(e2 e2Var, j0 j0Var) {
        this.f6724b = e2Var;
        this.f6723a = j0Var;
    }

    @Override // g8.b6
    public final void a(a6 a6Var) {
        this.f6723a.a(a6Var);
    }

    @Override // g8.b6
    public final void b() {
        this.f6723a.b();
    }

    @Override // g8.j0
    public final void c(e8.c2 c2Var, i0 i0Var, e8.l1 l1Var) {
        y yVar = this.f6724b.f6742b.f6760b;
        if (c2Var.e()) {
            yVar.f7242c.a();
        } else {
            yVar.f7243d.a();
        }
        this.f6723a.c(c2Var, i0Var, l1Var);
    }

    @Override // g8.j0
    public final void d(e8.l1 l1Var) {
        this.f6723a.d(l1Var);
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        q6.g gVarJ0 = f6.a.j0(this);
        gVarJ0.a(this.f6723a, "delegate");
        return gVarJ0.toString();
    }
}
