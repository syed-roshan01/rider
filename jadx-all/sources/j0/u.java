package j0;

import java.util.ArrayList;
import m0.g1;
import u.j1;

/* JADX INFO: loaded from: classes.dex */
public abstract class u implements j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f8318a;

    public u(boolean z10, g1 g1Var) {
        b0 b0Var = new b0();
        b0Var.f8248a = z10;
        b0Var.f8249b = g1Var;
        b0Var.f8250c = t.e.a(0.0f);
        b0Var.f8251d = new ArrayList();
        this.f8318a = b0Var;
    }

    public abstract void e(x.o oVar, m9.d0 d0Var);

    public final void f(g1.g gVar, float f10, long j10) {
        b0 b0Var = this.f8318a;
        b0Var.getClass();
        float fA = Float.isNaN(f10) ? q.a(gVar, b0Var.f8248a, gVar.e()) : gVar.v(f10);
        float fFloatValue = ((Number) ((t.d) b0Var.f8250c).d()).floatValue();
        if (fFloatValue > 0.0f) {
            long jB = e1.r.b(j10, fFloatValue);
            if (!b0Var.f8248a) {
                gVar.u0(jB, (120 & 2) != 0 ? d1.f.c(gVar.e()) / 2.0f : fA, (120 & 4) != 0 ? gVar.O() : 0L, (120 & 8) != 0 ? 1.0f : 0.0f, (120 & 16) != 0 ? g1.j.f6502a : null, null, (120 & 64) != 0 ? 3 : 0);
                return;
            }
            float fD = d1.f.d(gVar.e());
            float fB = d1.f.b(gVar.e());
            g1.b bVarA = gVar.A();
            long jB2 = bVarA.b();
            bVarA.a().j();
            bVarA.f6494a.f6500a.a().d(0.0f, 0.0f, fD, fB, 1);
            gVar.u0(jB, (120 & 2) != 0 ? d1.f.c(gVar.e()) / 2.0f : fA, (120 & 4) != 0 ? gVar.O() : 0L, (120 & 8) != 0 ? 1.0f : 0.0f, (120 & 16) != 0 ? g1.j.f6502a : null, null, (120 & 64) != 0 ? 3 : 0);
            bVarA.a().h();
            bVarA.c(jB2);
        }
    }

    public abstract void g(x.o oVar);
}
