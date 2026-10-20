package g1;

import d7.t;
import e1.d0;
import e1.e0;
import e1.l;
import e1.n;
import e1.y;
import o1.s;

/* JADX INFO: loaded from: classes.dex */
public interface g extends m2.b {
    static void C(g gVar, y yVar, long j10, long j11, long j12, float f10, l lVar, int i10, int i11) {
        long jE;
        long j13 = (i11 & 2) != 0 ? m2.i.f11807b : j10;
        if ((i11 & 4) != 0) {
            e1.f fVar = (e1.f) yVar;
            jE = s.e(fVar.f5003a.getWidth(), fVar.f5003a.getHeight());
        } else {
            jE = j11;
        }
        gVar.I(yVar, j13, jE, (i11 & 8) != 0 ? m2.i.f11807b : 0L, (i11 & 16) != 0 ? jE : j12, (i11 & 32) != 0 ? 1.0f : f10, (i11 & 64) != 0 ? j.f6502a : null, (i11 & 128) != 0 ? null : lVar, (i11 & 256) != 0 ? 3 : 0, (i11 & 512) != 0 ? 1 : i10);
    }

    static /* synthetic */ void D(g gVar, d0 d0Var, n nVar, float f10, k kVar, int i10) {
        if ((i10 & 4) != 0) {
            f10 = 1.0f;
        }
        float f11 = f10;
        h hVar = kVar;
        if ((i10 & 8) != 0) {
            hVar = j.f6502a;
        }
        gVar.n0(d0Var, nVar, f11, hVar, null, (i10 & 32) != 0 ? 3 : 0);
    }

    static void U(g gVar, long j10, long j11, long j12, int i10) {
        long j13 = (i10 & 2) != 0 ? d1.c.f4326b : j11;
        gVar.i0(j10, j13, (i10 & 4) != 0 ? t0(gVar.e(), j13) : j12, (i10 & 8) != 0 ? 1.0f : 0.0f, (i10 & 16) != 0 ? j.f6502a : null, null, (i10 & 64) != 0 ? 3 : 0);
    }

    static void Y(g gVar, n nVar, long j10, long j11, float f10, h hVar, int i10) {
        long j12 = (i10 & 2) != 0 ? d1.c.f4326b : j10;
        gVar.k0(nVar, j12, (i10 & 4) != 0 ? t0(gVar.e(), j12) : j11, (i10 & 8) != 0 ? 1.0f : f10, (i10 & 16) != 0 ? j.f6502a : hVar, null, (i10 & 64) != 0 ? 3 : 0);
    }

    static void l0(g gVar, y yVar, l lVar) {
        gVar.T(yVar, d1.c.f4326b, 1.0f, j.f6502a, lVar, 3);
    }

    static void r(g gVar, n nVar, long j10, long j11, long j12, k kVar, int i10) {
        long j13 = (i10 & 2) != 0 ? d1.c.f4326b : j10;
        gVar.s(nVar, j13, (i10 & 4) != 0 ? t0(gVar.e(), j13) : j11, (i10 & 8) != 0 ? d1.a.f4320a : j12, (i10 & 16) != 0 ? 1.0f : 0.0f, (i10 & 32) != 0 ? j.f6502a : kVar, null, (i10 & 128) != 0 ? 3 : 0);
    }

    static long t0(long j10, long j11) {
        return t.j(d1.f.d(j10) - d1.c.d(j11), d1.f.b(j10) - d1.c.e(j11));
    }

    b A();

    void I(y yVar, long j10, long j11, long j12, long j13, float f10, h hVar, l lVar, int i10, int i11);

    default long O() {
        return t.V(A().b());
    }

    void T(y yVar, long j10, float f10, h hVar, l lVar, int i10);

    void W(e0 e0Var, float f10, long j10, float f11, h hVar, l lVar, int i10);

    default long e() {
        return A().b();
    }

    void f0(long j10, float f10, float f11, long j11, long j12, float f12, h hVar, l lVar, int i10);

    m2.l getLayoutDirection();

    void i0(long j10, long j11, long j12, float f10, h hVar, l lVar, int i10);

    void k0(n nVar, long j10, long j11, float f10, h hVar, l lVar, int i10);

    void n0(d0 d0Var, n nVar, float f10, h hVar, l lVar, int i10);

    void p0(long j10, long j11, long j12, float f10, int i10, float f11, l lVar, int i11);

    void s(n nVar, long j10, long j11, long j12, float f10, h hVar, l lVar, int i10);

    void u0(long j10, float f10, long j11, float f11, h hVar, l lVar, int i10);
}
