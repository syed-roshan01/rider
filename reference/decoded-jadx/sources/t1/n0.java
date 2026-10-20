package t1;

/* JADX INFO: loaded from: classes.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.compose.ui.node.a f14494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f14495b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f14497d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f14498e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f14499f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f14500g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f14501h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f14502i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f14503j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f14504k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f14505l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f14506m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f14507n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public k0 f14509p;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14496c = 5;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final l0 f14508o = new l0(this);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f14510q = o1.s.b(0, 0, 15);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final t.l0 f14511r = new t.l0(this, 27);

    public n0(androidx.compose.ui.node.a aVar) {
        this.f14494a = aVar;
    }

    public final c1 a() {
        return this.f14494a.C.f14577c;
    }

    public final void b(int i10) {
        int i11 = this.f14507n;
        this.f14507n = i10;
        if ((i11 == 0) != (i10 == 0)) {
            androidx.compose.ui.node.a aVarQ = this.f14494a.q();
            n0 n0Var = aVarQ != null ? aVarQ.D : null;
            if (n0Var != null) {
                if (i10 == 0) {
                    n0Var.b(n0Var.f14507n - 1);
                } else {
                    n0Var.b(n0Var.f14507n + 1);
                }
            }
        }
    }

    public final void c(boolean z10) {
        if (this.f14506m != z10) {
            this.f14506m = z10;
            if (z10 && !this.f14505l) {
                b(this.f14507n + 1);
            } else {
                if (z10 || this.f14505l) {
                    return;
                }
                b(this.f14507n - 1);
            }
        }
    }

    public final void d(boolean z10) {
        if (this.f14505l != z10) {
            this.f14505l = z10;
            if (z10 && !this.f14506m) {
                b(this.f14507n + 1);
            } else {
                if (z10 || this.f14506m) {
                    return;
                }
                b(this.f14507n - 1);
            }
        }
    }

    public final void e() {
        l0 l0Var = this.f14508o;
        Object obj = l0Var.f14489x;
        androidx.compose.ui.node.a aVar = this.f14494a;
        n0 n0Var = l0Var.L;
        if ((obj != null || n0Var.a().a() != null) && l0Var.f14488w) {
            l0Var.f14488w = false;
            l0Var.f14489x = n0Var.a().a();
            androidx.compose.ui.node.a aVarQ = aVar.q();
            if (aVarQ != null) {
                androidx.compose.ui.node.a.Q(aVarQ, false, 3);
            }
        }
        k0 k0Var = this.f14509p;
        if (k0Var != null) {
            Object obj2 = k0Var.B;
            n0 n0Var2 = k0Var.D;
            if (obj2 == null) {
                r0 r0VarI0 = n0Var2.a().I0();
                d7.a.j(r0VarI0);
                if (r0VarI0.f14536p.a() == null) {
                    return;
                }
            }
            if (k0Var.A) {
                k0Var.A = false;
                r0 r0VarI1 = n0Var2.a().I0();
                d7.a.j(r0VarI1);
                k0Var.B = r0VarI1.f14536p.a();
                if (g.v(aVar)) {
                    androidx.compose.ui.node.a aVarQ2 = aVar.q();
                    if (aVarQ2 != null) {
                        androidx.compose.ui.node.a.Q(aVarQ2, false, 3);
                        return;
                    }
                    return;
                }
                androidx.compose.ui.node.a aVarQ3 = aVar.q();
                if (aVarQ3 != null) {
                    androidx.compose.ui.node.a.O(aVarQ3, false, 3);
                }
            }
        }
    }
}
