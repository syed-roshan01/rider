package u1;

import android.graphics.Canvas;
import android.os.Build;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class o2 implements t1.j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f15180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c9.c f15181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c9.a f15182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f15183d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j2 f15184e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f15185f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f15186n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public e1.g f15187o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g2 f15188p = new g2(o0.f15175d);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final k.f f15189q = new k.f(6);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f15190r = e1.p0.f5055b;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final v1 f15191s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f15192t;

    public o2(w wVar, h1.b bVar, t.l0 l0Var) {
        this.f15180a = wVar;
        this.f15181b = bVar;
        this.f15182c = l0Var;
        this.f15184e = new j2(wVar.getDensity());
        v1 m2Var = Build.VERSION.SDK_INT >= 29 ? new m2() : new k2(wVar);
        m2Var.H();
        m2Var.o(false);
        this.f15191s = m2Var;
    }

    @Override // t1.j1
    public final long a(long j10, boolean z10) {
        v1 v1Var = this.f15191s;
        g2 g2Var = this.f15188p;
        if (!z10) {
            return e1.a0.a(g2Var.b(v1Var), j10);
        }
        float[] fArrA = g2Var.a(v1Var);
        if (fArrA != null) {
            return e1.a0.a(fArrA, j10);
        }
        int i10 = d1.c.f4329e;
        return d1.c.f4327c;
    }

    @Override // t1.j1
    public final void b(long j10) {
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & 4294967295L);
        long j11 = this.f15190r;
        int i12 = e1.p0.f5056c;
        float f10 = i10;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) * f10;
        v1 v1Var = this.f15191s;
        v1Var.m(fIntBitsToFloat);
        float f11 = i11;
        v1Var.u(Float.intBitsToFloat((int) (4294967295L & this.f15190r)) * f11);
        if (v1Var.p(v1Var.getLeft(), v1Var.k(), v1Var.getLeft() + i10, v1Var.k() + i11)) {
            long j12 = d7.t.j(f10, f11);
            j2 j2Var = this.f15184e;
            if (!d1.f.a(j2Var.f15124d, j12)) {
                j2Var.f15124d = j12;
                j2Var.f15128h = true;
            }
            v1Var.E(j2Var.b());
            if (!this.f15183d && !this.f15185f) {
                this.f15180a.invalidate();
                m(true);
            }
            this.f15188p.c();
        }
    }

    @Override // t1.j1
    public final void c(float[] fArr) {
        e1.a0.d(fArr, this.f15188p.b(this.f15191s));
    }

    @Override // t1.j1
    public final void d(float[] fArr) {
        float[] fArrA = this.f15188p.a(this.f15191s);
        if (fArrA != null) {
            e1.a0.d(fArr, fArrA);
        }
    }

    @Override // t1.j1
    public final void e(e1.i0 i0Var, m2.l lVar, m2.b bVar) {
        c9.a aVar;
        int i10 = i0Var.f5017a | this.f15192t;
        int i11 = i10 & 4096;
        if (i11 != 0) {
            this.f15190r = i0Var.f5030u;
        }
        v1 v1Var = this.f15191s;
        boolean zY = v1Var.y();
        j2 j2Var = this.f15184e;
        boolean z10 = false;
        boolean z11 = zY && !(j2Var.f15129i ^ true);
        if ((i10 & 1) != 0) {
            v1Var.q(i0Var.f5018b);
        }
        if ((i10 & 2) != 0) {
            v1Var.w(i0Var.f5019c);
        }
        if ((i10 & 4) != 0) {
            v1Var.e(i0Var.f5020d);
        }
        if ((i10 & 8) != 0) {
            v1Var.v(i0Var.f5021e);
        }
        if ((i10 & 16) != 0) {
            v1Var.n(i0Var.f5022f);
        }
        if ((i10 & 32) != 0) {
            v1Var.x(i0Var.f5023n);
        }
        if ((i10 & 64) != 0) {
            v1Var.t(androidx.compose.ui.graphics.a.s(i0Var.f5024o));
        }
        if ((i10 & 128) != 0) {
            v1Var.F(androidx.compose.ui.graphics.a.s(i0Var.f5025p));
        }
        if ((i10 & 1024) != 0) {
            v1Var.l(i0Var.f5028s);
        }
        if ((i10 & 256) != 0) {
            v1Var.G(i0Var.f5026q);
        }
        if ((i10 & 512) != 0) {
            v1Var.d(i0Var.f5027r);
        }
        if ((i10 & 2048) != 0) {
            v1Var.C(i0Var.f5029t);
        }
        if (i11 != 0) {
            long j10 = this.f15190r;
            int i12 = e1.p0.f5056c;
            v1Var.m(Float.intBitsToFloat((int) (j10 >> 32)) * v1Var.b());
            v1Var.u(Float.intBitsToFloat((int) (this.f15190r & 4294967295L)) * v1Var.a());
        }
        boolean z12 = i0Var.f5032w;
        e1.f0 f0Var = e1.g0.f5008a;
        boolean z13 = z12 && i0Var.f5031v != f0Var;
        if ((i10 & 24576) != 0) {
            v1Var.A(z13);
            v1Var.o(i0Var.f5032w && i0Var.f5031v == f0Var);
        }
        if ((131072 & i10) != 0) {
            v1Var.i();
        }
        if ((32768 & i10) != 0) {
            v1Var.B(i0Var.f5033x);
        }
        boolean zD = this.f15184e.d(i0Var.f5031v, i0Var.f5020d, z13, i0Var.f5023n, lVar, bVar);
        if (j2Var.f15128h) {
            v1Var.E(j2Var.b());
        }
        if (z13 && !(!j2Var.f15129i)) {
            z10 = true;
        }
        w wVar = this.f15180a;
        if (z11 == z10 && (!z10 || !zD)) {
            y3.f15385a.a(wVar);
        } else if (!this.f15183d && !this.f15185f) {
            wVar.invalidate();
            m(true);
        }
        if (!this.f15186n && v1Var.J() > 0.0f && (aVar = this.f15182c) != null) {
            aVar.invoke();
        }
        if ((i10 & 7963) != 0) {
            this.f15188p.c();
        }
        this.f15192t = i0Var.f5017a;
    }

    @Override // t1.j1
    public final void f() {
        f3 f3Var;
        Reference referencePoll;
        o0.i iVar;
        v1 v1Var = this.f15191s;
        if (v1Var.D()) {
            v1Var.s();
        }
        this.f15181b = null;
        this.f15182c = null;
        this.f15185f = true;
        m(false);
        w wVar = this.f15180a;
        wVar.C = true;
        if (wVar.I != null) {
            z2 z2Var = b3.f15033w;
        }
        do {
            f3Var = wVar.f15346t0;
            referencePoll = f3Var.f15092b.poll();
            iVar = f3Var.f15091a;
            if (referencePoll != null) {
                iVar.m(referencePoll);
            }
        } while (referencePoll != null);
        iVar.c(new WeakReference(this, f3Var.f15092b));
    }

    @Override // t1.j1
    public final void g(long j10) {
        v1 v1Var = this.f15191s;
        int left = v1Var.getLeft();
        int iK = v1Var.k();
        int i10 = m2.i.f11808c;
        int i11 = (int) (j10 >> 32);
        int i12 = (int) (j10 & 4294967295L);
        if (left == i11 && iK == i12) {
            return;
        }
        if (left != i11) {
            v1Var.f(i11 - left);
        }
        if (iK != i12) {
            v1Var.z(i12 - iK);
        }
        y3.f15385a.a(this.f15180a);
        this.f15188p.c();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0020  */
    @Override // t1.j1
    public final void h() {
        e1.d0 d0Var;
        boolean z10 = this.f15183d;
        v1 v1Var = this.f15191s;
        if (z10 || !v1Var.D()) {
            if (v1Var.y()) {
                j2 j2Var = this.f15184e;
                if (!j2Var.f15129i) {
                    d0Var = null;
                } else {
                    j2Var.e();
                    d0Var = j2Var.f15127g;
                }
            } else {
                d0Var = null;
            }
            c9.c cVar = this.f15181b;
            if (cVar != null) {
                v1Var.r(this.f15189q, d0Var, cVar);
            }
            m(false);
        }
    }

    @Override // t1.j1
    public final void i(t.l0 l0Var, h1.b bVar) {
        m(false);
        this.f15185f = false;
        this.f15186n = false;
        this.f15190r = e1.p0.f5055b;
        this.f15181b = bVar;
        this.f15182c = l0Var;
    }

    @Override // t1.j1
    public final void invalidate() {
        if (this.f15183d || this.f15185f) {
            return;
        }
        this.f15180a.invalidate();
        m(true);
    }

    @Override // t1.j1
    public final void j(d1.b bVar, boolean z10) {
        v1 v1Var = this.f15191s;
        g2 g2Var = this.f15188p;
        if (!z10) {
            e1.a0.b(g2Var.b(v1Var), bVar);
            return;
        }
        float[] fArrA = g2Var.a(v1Var);
        if (fArrA != null) {
            e1.a0.b(fArrA, bVar);
            return;
        }
        bVar.f4322a = 0.0f;
        bVar.f4323b = 0.0f;
        bVar.f4324c = 0.0f;
        bVar.f4325d = 0.0f;
    }

    @Override // t1.j1
    public final boolean k(long j10) {
        float fD = d1.c.d(j10);
        float fE = d1.c.e(j10);
        v1 v1Var = this.f15191s;
        if (v1Var.h()) {
            return 0.0f <= fD && fD < ((float) v1Var.b()) && 0.0f <= fE && fE < ((float) v1Var.a());
        }
        if (v1Var.y()) {
            return this.f15184e.c(j10);
        }
        return true;
    }

    @Override // t1.j1
    public final void l(e1.p pVar) {
        Canvas canvasA = e1.e.a(pVar);
        boolean zIsHardwareAccelerated = canvasA.isHardwareAccelerated();
        v1 v1Var = this.f15191s;
        if (zIsHardwareAccelerated) {
            h();
            boolean z10 = v1Var.J() > 0.0f;
            this.f15186n = z10;
            if (z10) {
                pVar.r();
            }
            v1Var.j(canvasA);
            if (this.f15186n) {
                pVar.m();
                return;
            }
            return;
        }
        float left = v1Var.getLeft();
        float fK = v1Var.k();
        float right = v1Var.getRight();
        float fG = v1Var.g();
        if (v1Var.c() < 1.0f) {
            e1.g gVarF = this.f15187o;
            if (gVarF == null) {
                gVarF = androidx.compose.ui.graphics.a.f();
                this.f15187o = gVarF;
            }
            gVarF.c(v1Var.c());
            canvasA.saveLayer(left, fK, right, fG, gVarF.f5004a);
        } else {
            pVar.j();
        }
        pVar.e(left, fK);
        pVar.q(this.f15188p.b(v1Var));
        if (v1Var.y() || v1Var.h()) {
            this.f15184e.a(pVar);
        }
        c9.c cVar = this.f15181b;
        if (cVar != null) {
            cVar.invoke(pVar);
        }
        pVar.h();
        m(false);
    }

    public final void m(boolean z10) {
        if (z10 != this.f15183d) {
            this.f15183d = z10;
            this.f15180a.t(this, z10);
        }
    }
}
