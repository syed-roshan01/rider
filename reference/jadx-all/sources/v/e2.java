package v;

import android.view.KeyEvent;

/* JADX INFO: loaded from: classes.dex */
public final class e2 extends t1.o implements t1.f1, t1.m, c1.j, m1.c {
    public boolean A;
    public y0 B;
    public x.m C;
    public final n1.d D;
    public final u E;
    public final l2 F;
    public final b2 G;
    public final s H;
    public final b1 I;
    public final u1 J;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public f2 f15529w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public h1 f15530x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public u.b2 f15531y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f15532z;

    public e2(f2 f2Var, h1 h1Var, u.b2 b2Var, boolean z10, boolean z11, y0 y0Var, x.m mVar, o oVar) {
        this.f15529w = f2Var;
        this.f15530x = h1Var;
        this.f15531y = b2Var;
        this.f15532z = z10;
        this.A = z11;
        this.B = y0Var;
        this.C = mVar;
        n1.d dVar = new n1.d();
        this.D = dVar;
        u uVar = new u(new t.y(new s.z0(androidx.compose.foundation.gestures.a.f1636e)));
        this.E = uVar;
        f2 f2Var2 = this.f15529w;
        h1 h1Var2 = this.f15530x;
        u.b2 b2Var2 = this.f15531y;
        boolean z12 = this.A;
        y0 y0Var2 = this.B;
        l2 l2Var = new l2(f2Var2, h1Var2, b2Var2, z12, y0Var2 == null ? uVar : y0Var2, dVar);
        this.F = l2Var;
        b2 b2Var3 = new b2(l2Var, this.f15532z);
        this.G = b2Var3;
        s sVar = new s(this.f15530x, this.f15529w, this.A, oVar);
        G0(sVar);
        this.H = sVar;
        b1 b1Var = new b1(this.f15532z);
        G0(b1Var);
        this.I = b1Var;
        s1.i iVar = n1.i.f12124a;
        G0(new n1.g(b2Var3, dVar));
        G0(new c1.p());
        G0(new c0.m(sVar));
        G0(new u.x0(new q.w(this, 10)));
        u1 u1Var = new u1(l2Var, this.f15530x, this.f15532z, dVar, this.C);
        G0(u1Var);
        this.J = u1Var;
    }

    @Override // t1.f1
    public final void G() {
        this.E.f15792a = new t.y(new s.z0((m2.b) t1.g.p(this, u1.s1.f15275e)));
    }

    @Override // m1.c
    public final boolean M(KeyEvent keyEvent) {
        long jF;
        if (!this.f15532z) {
            return false;
        }
        if ((!m1.a.a(androidx.compose.ui.input.key.a.a(keyEvent.getKeyCode()), m1.a.f11782l) && !m1.a.a(androidx.compose.ui.input.key.a.a(keyEvent.getKeyCode()), m1.a.f11781k)) || !z6.a.B(androidx.compose.ui.input.key.a.b(keyEvent), 2) || keyEvent.isCtrlPressed()) {
            return false;
        }
        h1 h1Var = this.f15530x;
        h1 h1Var2 = h1.f15593a;
        s sVar = this.H;
        if (h1Var == h1Var2) {
            int i10 = (int) (sVar.D & 4294967295L);
            jF = d9.i.f(0.0f, m1.a.a(androidx.compose.ui.input.key.a.a(keyEvent.getKeyCode()), m1.a.f11781k) ? i10 : -i10);
        } else {
            int i11 = (int) (sVar.D >> 32);
            jF = d9.i.f(m1.a.a(androidx.compose.ui.input.key.a.a(keyEvent.getKeyCode()), m1.a.f11781k) ? i11 : -i11, 0.0f);
        }
        z6.a.Q(v0(), null, 0, new d2(this.F, jF, null), 3);
        return true;
    }

    @Override // m1.c
    public final boolean l(KeyEvent keyEvent) {
        return false;
    }

    @Override // c1.j
    public final void s0(c1.h hVar) {
        hVar.b(false);
    }

    @Override // y0.n
    public final void z0() {
        this.E.f15792a = new t.y(new s.z0((m2.b) t1.g.p(this, u1.s1.f15275e)));
        t1.g.w(this, new t.l0(this, 6));
    }
}
