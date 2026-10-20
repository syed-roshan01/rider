package i1;

import m0.l1;
import m0.n1;
import m0.o3;
import t.l0;

/* JADX INFO: loaded from: classes.dex */
public final class j0 extends h1.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n1 f7841f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final n1 f7842n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final e0 f7843o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l1 f7844p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f7845q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public e1.l f7846r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f7847s;

    public j0(c cVar) {
        d1.f fVar = new d1.f(d1.f.f4344b);
        o3 o3Var = o3.f11621a;
        this.f7841f = d7.t.g0(fVar, o3Var);
        this.f7842n = d7.t.g0(Boolean.FALSE, o3Var);
        e0 e0Var = new e0(cVar);
        e0Var.f7779f = new l0(this, 20);
        this.f7843o = e0Var;
        this.f7844p = o7.d0.Z(0);
        this.f7845q = 1.0f;
        this.f7847s = -1;
    }

    @Override // h1.c
    public final boolean c(float f10) {
        this.f7845q = f10;
        return true;
    }

    @Override // h1.c
    public final boolean e(e1.l lVar) {
        this.f7846r = lVar;
        return true;
    }

    @Override // h1.c
    public final long h() {
        return ((d1.f) this.f7841f.getValue()).f4347a;
    }

    @Override // h1.c
    public final void i(g1.g gVar) {
        e1.l lVar = this.f7846r;
        e0 e0Var = this.f7843o;
        if (lVar == null) {
            lVar = (e1.l) e0Var.f7780g.getValue();
        }
        if (((Boolean) this.f7842n.getValue()).booleanValue() && gVar.getLayoutDirection() == m2.l.f11816b) {
            long jO = gVar.O();
            g1.b bVarA = gVar.A();
            long jB = bVarA.b();
            bVarA.a().j();
            bVarA.f6494a.b(-1.0f, 1.0f, jO);
            e0Var.e(gVar, this.f7845q, lVar);
            bVarA.a().h();
            bVarA.c(jB);
        } else {
            e0Var.e(gVar, this.f7845q, lVar);
        }
        this.f7847s = this.f7844p.d();
    }
}
