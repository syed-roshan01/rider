package g1;

import android.graphics.Paint;
import androidx.fragment.app.a0;
import e1.d0;
import e1.e0;
import e1.g0;
import e1.n;
import e1.p;
import e1.r;
import e1.y;
import m2.l;

/* JADX INFO: loaded from: classes.dex */
public final class c implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f6496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f6497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e1.g f6498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e1.g f6499d;

    public c() {
        m2.c cVar = f.f6501a;
        l lVar = l.f11815a;
        i iVar = new i();
        long j10 = d1.f.f4344b;
        a aVar = new a();
        aVar.f6490a = cVar;
        aVar.f6491b = lVar;
        aVar.f6492c = iVar;
        aVar.f6493d = j10;
        this.f6496a = aVar;
        this.f6497b = new b(this);
    }

    public static e1.g a(c cVar, long j10, h hVar, float f10, e1.l lVar, int i10) {
        e1.g gVarF = cVar.f(hVar);
        if (f10 != 1.0f) {
            j10 = r.b(j10, r.d(j10) * f10);
        }
        if (!r.c(androidx.compose.ui.graphics.a.b(gVarF.f5004a.getColor()), j10)) {
            gVarF.e(j10);
        }
        if (gVarF.f5006c != null) {
            gVarF.h(null);
        }
        if (!d7.a.d(gVarF.f5007d, lVar)) {
            gVarF.f(lVar);
        }
        if (!g0.b(gVarF.f5005b, i10)) {
            gVarF.d(i10);
        }
        if (!g0.d(gVarF.f5004a.isFilterBitmap() ? 1 : 0, 1)) {
            gVarF.g(1);
        }
        return gVarF;
    }

    @Override // g1.g
    public final b A() {
        return this.f6497b;
    }

    @Override // g1.g
    public final void I(y yVar, long j10, long j11, long j12, long j13, float f10, h hVar, e1.l lVar, int i10, int i11) {
        this.f6496a.f6492c.a(yVar, j10, j11, j12, j13, b(null, hVar, f10, lVar, i10, i11));
    }

    @Override // g1.g
    public final void T(y yVar, long j10, float f10, h hVar, e1.l lVar, int i10) {
        this.f6496a.f6492c.u(yVar, j10, b(null, hVar, f10, lVar, i10, 1));
    }

    @Override // g1.g
    public final void W(e0 e0Var, float f10, long j10, float f11, h hVar, e1.l lVar, int i10) {
        this.f6496a.f6492c.p(f10, j10, b(e0Var, hVar, f11, lVar, i10, 1));
    }

    public final e1.g b(n nVar, h hVar, float f10, e1.l lVar, int i10, int i11) {
        e1.g gVarF = f(hVar);
        if (nVar != null) {
            nVar.a(f10, e(), gVarF);
        } else {
            if (gVarF.f5006c != null) {
                gVarF.h(null);
            }
            long jB = androidx.compose.ui.graphics.a.b(gVarF.f5004a.getColor());
            long j10 = r.f5060b;
            if (!r.c(jB, j10)) {
                gVarF.e(j10);
            }
            if (gVarF.f5004a.getAlpha() / 255.0f != f10) {
                gVarF.c(f10);
            }
        }
        if (!d7.a.d(gVarF.f5007d, lVar)) {
            gVarF.f(lVar);
        }
        if (!g0.b(gVarF.f5005b, i10)) {
            gVarF.d(i10);
        }
        if (!g0.d(gVarF.f5004a.isFilterBitmap() ? 1 : 0, i11)) {
            gVarF.g(i11);
        }
        return gVarF;
    }

    @Override // m2.b
    public final float c() {
        return this.f6496a.f6490a.c();
    }

    public final void d(e1.i iVar, long j10, float f10, h hVar, e1.l lVar, int i10) {
        this.f6496a.f6492c.k(iVar, a(this, j10, hVar, f10, lVar, i10));
    }

    public final e1.g f(h hVar) {
        if (d7.a.d(hVar, j.f6502a)) {
            e1.g gVar = this.f6498c;
            if (gVar != null) {
                return gVar;
            }
            e1.g gVarF = androidx.compose.ui.graphics.a.f();
            gVarF.l(0);
            this.f6498c = gVarF;
            return gVarF;
        }
        if (!(hVar instanceof k)) {
            throw new a0();
        }
        e1.g gVarF2 = this.f6499d;
        if (gVarF2 == null) {
            gVarF2 = androidx.compose.ui.graphics.a.f();
            gVarF2.l(1);
            this.f6499d = gVarF2;
        }
        Paint paint = gVarF2.f5004a;
        float strokeWidth = paint.getStrokeWidth();
        k kVar = (k) hVar;
        float f10 = kVar.f6503a;
        if (strokeWidth != f10) {
            gVarF2.k(f10);
        }
        int iA = gVarF2.a();
        int i10 = kVar.f6505c;
        if (!g0.f(iA, i10)) {
            gVarF2.i(i10);
        }
        float strokeMiter = paint.getStrokeMiter();
        float f11 = kVar.f6504b;
        if (strokeMiter != f11) {
            gVarF2.f5004a.setStrokeMiter(f11);
        }
        int iB = gVarF2.b();
        int i11 = kVar.f6506d;
        if (!g0.g(iB, i11)) {
            gVarF2.j(i11);
        }
        if (!d7.a.d(null, null)) {
            gVarF2.f5004a.setPathEffect(null);
        }
        return gVarF2;
    }

    @Override // g1.g
    public final void f0(long j10, float f10, float f11, long j11, long j12, float f12, h hVar, e1.l lVar, int i10) {
        this.f6496a.f6492c.n(d1.c.d(j11), d1.c.e(j11), d1.f.d(j12) + d1.c.d(j11), d1.f.b(j12) + d1.c.e(j11), f10, f11, a(this, j10, hVar, f12, lVar, i10));
    }

    @Override // g1.g
    public final l getLayoutDirection() {
        return this.f6496a.f6491b;
    }

    @Override // g1.g
    public final void i0(long j10, long j11, long j12, float f10, h hVar, e1.l lVar, int i10) {
        this.f6496a.f6492c.s(d1.c.d(j11), d1.c.e(j11), d1.f.d(j12) + d1.c.d(j11), d1.f.b(j12) + d1.c.e(j11), a(this, j10, hVar, f10, lVar, i10));
    }

    @Override // g1.g
    public final void k0(n nVar, long j10, long j11, float f10, h hVar, e1.l lVar, int i10) {
        this.f6496a.f6492c.s(d1.c.d(j10), d1.c.e(j10), d1.f.d(j11) + d1.c.d(j10), d1.f.b(j11) + d1.c.e(j10), b(nVar, hVar, f10, lVar, i10, 1));
    }

    @Override // m2.b
    public final float m() {
        return this.f6496a.f6490a.m();
    }

    @Override // g1.g
    public final void n0(d0 d0Var, n nVar, float f10, h hVar, e1.l lVar, int i10) {
        this.f6496a.f6492c.k(d0Var, b(nVar, hVar, f10, lVar, i10, 1));
    }

    @Override // g1.g
    public final void p0(long j10, long j11, long j12, float f10, int i10, float f11, e1.l lVar, int i11) {
        p pVar = this.f6496a.f6492c;
        e1.g gVarF = this.f6499d;
        if (gVarF == null) {
            gVarF = androidx.compose.ui.graphics.a.f();
            gVarF.l(1);
            this.f6499d = gVarF;
        }
        e1.g gVar = gVarF;
        long jB = f11 == 1.0f ? j10 : r.b(j10, r.d(j10) * f11);
        if (!r.c(androidx.compose.ui.graphics.a.b(gVar.f5004a.getColor()), jB)) {
            gVar.e(jB);
        }
        if (gVar.f5006c != null) {
            gVar.h(null);
        }
        if (!d7.a.d(gVar.f5007d, lVar)) {
            gVar.f(lVar);
        }
        if (!g0.b(gVar.f5005b, i11)) {
            gVar.d(i11);
        }
        Paint paint = gVar.f5004a;
        if (paint.getStrokeWidth() != f10) {
            gVar.k(f10);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            gVar.f5004a.setStrokeMiter(4.0f);
        }
        if (!g0.f(gVar.a(), i10)) {
            gVar.i(i10);
        }
        if (!g0.g(gVar.b(), 0)) {
            gVar.j(0);
        }
        if (!d7.a.d(null, null)) {
            gVar.f5004a.setPathEffect(null);
        }
        if (!g0.d(paint.isFilterBitmap() ? 1 : 0, 1)) {
            gVar.g(1);
        }
        pVar.g(j11, j12, gVar);
    }

    @Override // g1.g
    public final void s(n nVar, long j10, long j11, long j12, float f10, h hVar, e1.l lVar, int i10) {
        this.f6496a.f6492c.l(d1.c.d(j10), d1.c.e(j10), d1.f.d(j11) + d1.c.d(j10), d1.f.b(j11) + d1.c.e(j10), d1.a.b(j12), d1.a.c(j12), b(nVar, hVar, f10, lVar, i10, 1));
    }

    @Override // g1.g
    public final void u0(long j10, float f10, long j11, float f11, h hVar, e1.l lVar, int i10) {
        this.f6496a.f6492c.p(f10, j11, a(this, j10, hVar, f11, lVar, i10));
    }
}
