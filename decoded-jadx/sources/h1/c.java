package h1;

import d1.d;
import d1.f;
import d7.t;
import e1.g;
import e1.l;
import e1.p;
import m9.e0;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f7529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f7530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l f7531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f7532d = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m2.l f7533e = m2.l.f11815a;

    public abstract boolean c(float f10);

    public abstract boolean e(l lVar);

    public void f(m2.l lVar) {
    }

    public final void g(g1.g gVar, long j10, float f10, l lVar) {
        if (this.f7532d != f10) {
            if (!c(f10)) {
                if (f10 == 1.0f) {
                    g gVar2 = this.f7529a;
                    if (gVar2 != null) {
                        gVar2.c(f10);
                    }
                    this.f7530b = false;
                } else {
                    g gVarF = this.f7529a;
                    if (gVarF == null) {
                        gVarF = androidx.compose.ui.graphics.a.f();
                        this.f7529a = gVarF;
                    }
                    gVarF.c(f10);
                    this.f7530b = true;
                }
            }
            this.f7532d = f10;
        }
        if (!d7.a.d(this.f7531c, lVar)) {
            if (!e(lVar)) {
                if (lVar == null) {
                    g gVar3 = this.f7529a;
                    if (gVar3 != null) {
                        gVar3.f(null);
                    }
                    this.f7530b = false;
                } else {
                    g gVarF2 = this.f7529a;
                    if (gVarF2 == null) {
                        gVarF2 = androidx.compose.ui.graphics.a.f();
                        this.f7529a = gVarF2;
                    }
                    gVarF2.f(lVar);
                    this.f7530b = true;
                }
            }
            this.f7531c = lVar;
        }
        m2.l layoutDirection = gVar.getLayoutDirection();
        if (this.f7533e != layoutDirection) {
            f(layoutDirection);
            this.f7533e = layoutDirection;
        }
        float fD = f.d(gVar.e()) - f.d(j10);
        float fB = f.b(gVar.e()) - f.b(j10);
        gVar.A().f6494a.a(0.0f, 0.0f, fD, fB);
        if (f10 > 0.0f && f.d(j10) > 0.0f && f.b(j10) > 0.0f) {
            if (this.f7530b) {
                d dVarH = e0.h(d1.c.f4326b, t.j(f.d(j10), f.b(j10)));
                p pVarA = gVar.A().a();
                g gVarF3 = this.f7529a;
                if (gVarF3 == null) {
                    gVarF3 = androidx.compose.ui.graphics.a.f();
                    this.f7529a = gVarF3;
                }
                try {
                    pVarA.i(dVarH, gVarF3);
                    i(gVar);
                    pVarA.h();
                } catch (Throwable th) {
                    pVarA.h();
                    throw th;
                }
            } else {
                i(gVar);
            }
        }
        gVar.A().f6494a.a(-0.0f, -0.0f, -fD, -fB);
    }

    public abstract long h();

    public abstract void i(g1.g gVar);
}
