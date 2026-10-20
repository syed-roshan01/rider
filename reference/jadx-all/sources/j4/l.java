package j4;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import d7.t;
import m0.i2;
import m0.k1;
import m0.n1;
import m0.o3;
import m9.e0;
import m9.m0;
import m9.y1;
import p9.d0;
import p9.q0;

/* JADX INFO: loaded from: classes.dex */
public final class l extends h1.c implements i2 {
    public static final /* synthetic */ int B = 0;
    public final n1 A;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public r9.e f8356f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final q0 f8357n = d0.a(new d1.f(d1.f.f4344b));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final n1 f8358o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k1 f8359p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n1 f8360q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public f f8361r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public h1.c f8362s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public c9.c f8363t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public c9.c f8364u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public r1.l f8365v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f8366w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f8367x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final n1 f8368y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final n1 f8369z;

    public l(s4.j jVar, i4.i iVar) {
        o3 o3Var = o3.f11621a;
        this.f8358o = t.g0(null, o3Var);
        this.f8359p = e0.H(1.0f);
        this.f8360q = t.g0(null, o3Var);
        b bVar = b.f8340a;
        this.f8361r = bVar;
        this.f8363t = a.f8339a;
        this.f8365v = r1.k.f13392b;
        this.f8366w = 1;
        this.f8368y = t.g0(bVar, o3Var);
        this.f8369z = t.g0(jVar, o3Var);
        this.A = t.g0(iVar, o3Var);
    }

    @Override // m0.i2
    public final void a() {
        if (this.f8356f != null) {
            return;
        }
        y1 y1VarK = t.k();
        t9.d dVar = m0.f11969a;
        r9.e eVarB = d7.a.b(y1VarK.O(((n9.d) r9.o.f13724a).f12323f));
        this.f8356f = eVarB;
        Object obj = this.f8362s;
        i2 i2Var = obj instanceof i2 ? (i2) obj : null;
        if (i2Var != null) {
            i2Var.a();
        }
        if (!this.f8367x) {
            z6.a.Q(eVarB, null, 0, new i(this, null), 3);
            return;
        }
        s4.h hVarA = s4.j.a((s4.j) this.f8369z.getValue());
        hVarA.f13970b = ((i4.o) ((i4.i) this.A.getValue())).f8057a;
        hVarA.O = null;
        s4.j jVarA = hVarA.a();
        Drawable drawableB = w4.d.b(jVarA, jVarA.G, jVarA.F, jVarA.M.f13943j);
        k(new d(drawableB != null ? j(drawableB) : null));
    }

    @Override // m0.i2
    public final void b() {
        r9.e eVar = this.f8356f;
        if (eVar != null) {
            d7.a.i(eVar, null);
        }
        this.f8356f = null;
        Object obj = this.f8362s;
        i2 i2Var = obj instanceof i2 ? (i2) obj : null;
        if (i2Var != null) {
            i2Var.b();
        }
    }

    @Override // h1.c
    public final boolean c(float f10) {
        this.f8359p.f(f10);
        return true;
    }

    @Override // m0.i2
    public final void d() {
        r9.e eVar = this.f8356f;
        if (eVar != null) {
            d7.a.i(eVar, null);
        }
        this.f8356f = null;
        Object obj = this.f8362s;
        i2 i2Var = obj instanceof i2 ? (i2) obj : null;
        if (i2Var != null) {
            i2Var.d();
        }
    }

    @Override // h1.c
    public final boolean e(e1.l lVar) {
        this.f8360q.setValue(lVar);
        return true;
    }

    @Override // h1.c
    public final long h() {
        h1.c cVar = (h1.c) this.f8358o.getValue();
        return cVar != null ? cVar.h() : d1.f.f4345c;
    }

    @Override // h1.c
    public final void i(g1.g gVar) {
        this.f8357n.i(new d1.f(gVar.e()));
        h1.c cVar = (h1.c) this.f8358o.getValue();
        if (cVar != null) {
            cVar.g(gVar, gVar.e(), this.f8359p.d(), (e1.l) this.f8360q.getValue());
        }
    }

    public final h1.c j(Drawable drawable) {
        return drawable instanceof BitmapDrawable ? e0.c(new e1.f(((BitmapDrawable) drawable).getBitmap()), this.f8366w) : new h5.a(drawable.mutate());
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0051  */
    /* JADX WARN: Code duplicated, block: B:16:0x0054  */
    /* JADX WARN: Code duplicated, block: B:18:0x0057  */
    /* JADX WARN: Code duplicated, block: B:21:0x0062  */
    /* JADX WARN: Code duplicated, block: B:23:0x0067  */
    /* JADX WARN: Code duplicated, block: B:26:0x006e  */
    /* JADX WARN: Code duplicated, block: B:28:? A[RETURN, SYNTHETIC] */
    public final void k(f fVar) {
        s4.k kVar;
        c9.c cVar;
        Object objA;
        i2 i2Var;
        i2 i2Var2;
        f fVar2 = this.f8361r;
        f fVar3 = (f) this.f8363t.invoke(fVar);
        this.f8361r = fVar3;
        this.f8368y.setValue(fVar3);
        if (!(fVar3 instanceof e)) {
            if (fVar3 instanceof c) {
                kVar = ((c) fVar3).f8342b;
            }
            h1.c cVarA = fVar3.a();
            this.f8362s = cVarA;
            this.f8358o.setValue(cVarA);
            if (this.f8356f != null && fVar2.a() != fVar3.a()) {
                objA = fVar2.a();
                if (objA instanceof i2) {
                    i2Var = (i2) objA;
                } else {
                    i2Var = null;
                }
                if (i2Var != null) {
                    i2Var.d();
                }
                Object objA2 = fVar3.a();
                i2Var2 = objA2 instanceof i2 ? (i2) objA2 : null;
                if (i2Var2 != null) {
                    i2Var2.a();
                }
            }
            cVar = this.f8364u;
            if (cVar != null) {
                cVar.invoke(fVar3);
            }
        }
        kVar = ((e) fVar3).f8345b;
        ((v4.a) kVar.b().f14007m).getClass();
        h1.c cVarA2 = fVar3.a();
        this.f8362s = cVarA2;
        this.f8358o.setValue(cVarA2);
        if (this.f8356f != null) {
            objA = fVar2.a();
            if (objA instanceof i2) {
                i2Var = (i2) objA;
            } else {
                i2Var = null;
            }
            if (i2Var != null) {
                i2Var.d();
            }
            Object objA3 = fVar3.a();
            if (objA3 instanceof i2) {
            }
            if (i2Var2 != null) {
                i2Var2.a();
            }
        }
        cVar = this.f8364u;
        if (cVar != null) {
            cVar.invoke(fVar3);
        }
    }
}
