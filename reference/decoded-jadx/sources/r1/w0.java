package r1;

import t1.l1;

/* JADX INFO: loaded from: classes.dex */
public abstract class w0 {
    public static final m2.l a(w0 w0Var) {
        g0 g0Var = (g0) w0Var;
        int i10 = g0Var.f13377a;
        Object obj = g0Var.f13378b;
        switch (i10) {
            case 0:
                return ((t1.q0) obj).getLayoutDirection();
            default:
                return ((u1.w) ((l1) obj)).getLayoutDirection();
        }
    }

    public static final int b(w0 w0Var) {
        g0 g0Var = (g0) w0Var;
        int i10 = g0Var.f13377a;
        Object obj = g0Var.f13378b;
        switch (i10) {
            case 0:
                return ((t1.q0) obj).b0();
            default:
                return ((u1.w) ((l1) obj)).getRoot().D.f14508o.f13423a;
        }
    }

    public static void c(x0 x0Var, int i10, int i11, float f10) {
        long jC = i1.b.c(i10, i11);
        long j10 = x0Var.f13427e;
        int i12 = m2.i.f11808c;
        x0Var.d0(i1.b.c(((int) (jC >> 32)) + ((int) (j10 >> 32)), ((int) (jC & 4294967295L)) + ((int) (j10 & 4294967295L))), f10, null);
    }

    public static /* synthetic */ void d(w0 w0Var, x0 x0Var, int i10, int i11) {
        w0Var.getClass();
        c(x0Var, i10, i11, 0.0f);
    }

    public static void e(x0 x0Var, long j10, float f10) {
        long j11 = x0Var.f13427e;
        int i10 = m2.i.f11808c;
        x0Var.d0(i1.b.c(((int) (j10 >> 32)) + ((int) (j11 >> 32)), ((int) (j10 & 4294967295L)) + ((int) (j11 & 4294967295L))), f10, null);
    }

    public static /* synthetic */ void f(w0 w0Var, x0 x0Var, long j10) {
        w0Var.getClass();
        e(x0Var, j10, 0.0f);
    }

    public static void g(w0 w0Var, x0 x0Var, int i10, int i11) {
        w0Var.getClass();
        long jC = i1.b.c(i10, i11);
        if (a(w0Var) == m2.l.f11815a || b(w0Var) == 0) {
            long j10 = x0Var.f13427e;
            int i12 = m2.i.f11808c;
            x0Var.d0(i1.b.c(((int) (jC >> 32)) + ((int) (j10 >> 32)), ((int) (jC & 4294967295L)) + ((int) (j10 & 4294967295L))), 0.0f, null);
        } else {
            int iB = b(w0Var) - x0Var.f13423a;
            int i13 = m2.i.f11808c;
            long jC2 = i1.b.c(iB - ((int) (jC >> 32)), (int) (jC & 4294967295L));
            long j11 = x0Var.f13427e;
            x0Var.d0(i1.b.c(((int) (jC2 >> 32)) + ((int) (j11 >> 32)), ((int) (jC2 & 4294967295L)) + ((int) (j11 & 4294967295L))), 0.0f, null);
        }
    }

    public static void h(w0 w0Var, x0 x0Var, int i10, int i11) {
        int i12 = z0.f13440b;
        y0 y0Var = y0.f13430b;
        w0Var.getClass();
        long jC = i1.b.c(i10, i11);
        if (a(w0Var) == m2.l.f11815a || b(w0Var) == 0) {
            long j10 = x0Var.f13427e;
            int i13 = m2.i.f11808c;
            x0Var.d0(i1.b.c(((int) (jC >> 32)) + ((int) (j10 >> 32)), ((int) (jC & 4294967295L)) + ((int) (j10 & 4294967295L))), 0.0f, y0Var);
        } else {
            int iB = b(w0Var) - x0Var.f13423a;
            int i14 = m2.i.f11808c;
            long jC2 = i1.b.c(iB - ((int) (jC >> 32)), (int) (jC & 4294967295L));
            long j11 = x0Var.f13427e;
            x0Var.d0(i1.b.c(((int) (jC2 >> 32)) + ((int) (j11 >> 32)), ((int) (jC2 & 4294967295L)) + ((int) (j11 & 4294967295L))), 0.0f, y0Var);
        }
    }

    public static void i(w0 w0Var, x0 x0Var, long j10, a0.g gVar, int i10) {
        c9.c cVar = gVar;
        if ((i10 & 4) != 0) {
            int i11 = z0.f13440b;
            cVar = y0.f13430b;
        }
        w0Var.getClass();
        if (a(w0Var) == m2.l.f11815a || b(w0Var) == 0) {
            long j11 = x0Var.f13427e;
            int i12 = m2.i.f11808c;
            x0Var.d0(i1.b.c(((int) (j10 >> 32)) + ((int) (j11 >> 32)), ((int) (j10 & 4294967295L)) + ((int) (4294967295L & j11))), 0.0f, cVar);
        } else {
            int iB = b(w0Var) - x0Var.f13423a;
            int i13 = m2.i.f11808c;
            long jC = i1.b.c(iB - ((int) (j10 >> 32)), (int) (j10 & 4294967295L));
            long j12 = x0Var.f13427e;
            x0Var.d0(i1.b.c(((int) (jC >> 32)) + ((int) (j12 >> 32)), ((int) (jC & 4294967295L)) + ((int) (4294967295L & j12))), 0.0f, cVar);
        }
    }

    public static void j(x0 x0Var, int i10, int i11, float f10, c9.c cVar) {
        long jC = i1.b.c(i10, i11);
        long j10 = x0Var.f13427e;
        int i12 = m2.i.f11808c;
        x0Var.d0(i1.b.c(((int) (jC >> 32)) + ((int) (j10 >> 32)), ((int) (jC & 4294967295L)) + ((int) (j10 & 4294967295L))), f10, cVar);
    }

    public static /* synthetic */ void k(w0 w0Var, x0 x0Var, int i10, int i11, q.w wVar, int i12) {
        c9.c cVar = wVar;
        if ((i12 & 8) != 0) {
            int i13 = z0.f13440b;
            cVar = y0.f13430b;
        }
        w0Var.getClass();
        j(x0Var, i10, i11, 0.0f, cVar);
    }

    public static void l(x0 x0Var, long j10, float f10, c9.c cVar) {
        long j11 = x0Var.f13427e;
        int i10 = m2.i.f11808c;
        x0Var.d0(i1.b.c(((int) (j10 >> 32)) + ((int) (j11 >> 32)), ((int) (j10 & 4294967295L)) + ((int) (j11 & 4294967295L))), f10, cVar);
    }

    public static /* synthetic */ void m(w0 w0Var, x0 x0Var, long j10, a0.g gVar, int i10) {
        c9.c cVar = gVar;
        if ((i10 & 4) != 0) {
            int i11 = z0.f13440b;
            cVar = y0.f13430b;
        }
        w0Var.getClass();
        l(x0Var, j10, 0.0f, cVar);
    }
}
