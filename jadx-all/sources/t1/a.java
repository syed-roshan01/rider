package t1;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f14368a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14370c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f14371d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f14372e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f14373f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f14374g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b f14375h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f14369b = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashMap f14376i = new HashMap();

    public a(b bVar) {
        this.f14368a = bVar;
    }

    public static final void a(a aVar, r1.a aVar2, int i10, c1 c1Var) {
        aVar.getClass();
        float f10 = i10;
        long jF = d9.i.f(f10, f10);
        while (true) {
            jF = aVar.b(c1Var, jF);
            c1Var = c1Var.f14397r;
            d7.a.j(c1Var);
            if (d7.a.d(c1Var, aVar.f14368a.l())) {
                break;
            } else if (aVar.c(c1Var).containsKey(aVar2)) {
                float fD = aVar.d(c1Var, aVar2);
                jF = d9.i.f(fD, fD);
            }
        }
        int iP0 = aVar2 instanceof r1.o ? d7.t.p0(d1.c.e(jF)) : d7.t.p0(d1.c.d(jF));
        HashMap map = aVar.f14376i;
        if (map.containsKey(aVar2)) {
            int iIntValue = ((Number) r8.v.B0(aVar2, map)).intValue();
            r1.o oVar = r1.d.f13352a;
            iP0 = ((Number) aVar2.f13337a.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iP0))).intValue();
        }
        map.put(aVar2, Integer.valueOf(iP0));
    }

    public abstract long b(c1 c1Var, long j10);

    public abstract Map c(c1 c1Var);

    public abstract int d(c1 c1Var, r1.a aVar);

    public final boolean e() {
        return this.f14370c || this.f14372e || this.f14373f || this.f14374g;
    }

    public final boolean f() {
        i();
        return this.f14375h != null;
    }

    public final void g() {
        this.f14369b = true;
        b bVar = this.f14368a;
        b bVarY = bVar.y();
        if (bVarY == null) {
            return;
        }
        if (this.f14370c) {
            bVarY.R();
        } else if (this.f14372e || this.f14371d) {
            bVarY.requestLayout();
        }
        if (this.f14373f) {
            bVar.R();
        }
        if (this.f14374g) {
            bVar.requestLayout();
        }
        bVarY.d().g();
    }

    public final void h() {
        HashMap map = this.f14376i;
        map.clear();
        h1.b bVar = new h1.b(this, 4);
        b bVar2 = this.f14368a;
        bVar2.k(bVar);
        map.putAll(c(bVar2.l()));
        this.f14369b = false;
    }

    public final void i() {
        a aVarD;
        a aVarD2;
        boolean zE = e();
        b bVar = this.f14368a;
        if (!zE) {
            b bVarY = bVar.y();
            if (bVarY == null) {
                return;
            }
            bVar = bVarY.d().f14375h;
            if (bVar == null || !bVar.d().e()) {
                b bVar2 = this.f14375h;
                if (bVar2 == null || bVar2.d().e()) {
                    return;
                }
                b bVarY2 = bVar2.y();
                if (bVarY2 != null && (aVarD2 = bVarY2.d()) != null) {
                    aVarD2.i();
                }
                b bVarY3 = bVar2.y();
                bVar = (bVarY3 == null || (aVarD = bVarY3.d()) == null) ? null : aVarD.f14375h;
            }
        }
        this.f14375h = bVar;
    }
}
