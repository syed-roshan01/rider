package n8;

import e8.g0;
import e8.j0;
import e8.u0;
import e8.x;
import e8.x0;
import e8.z0;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12254a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f12255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z0 f12256c;

    public e(f fVar) {
        this.f12256c = fVar;
    }

    @Override // e8.j0
    public final x0 h(u0 u0Var) {
        switch (this.f12254a) {
            case 1:
                p pVar = (p) this.f12256c;
                n nVar = new n(pVar, ((j0) this.f12255b).h(u0Var));
                List list = u0Var.f5372b;
                if (p.g(list) && pVar.f12297c.containsKey(((g0) list.get(0)).f5259a.get(0))) {
                    g gVar = (g) pVar.f12297c.get(((g0) list.get(0)).f5259a.get(0));
                    gVar.a(nVar);
                    if (gVar.f12270d != null) {
                        nVar.j();
                    }
                }
                return nVar;
            default:
                return s().h(u0Var);
        }
    }

    @Override // e8.j0
    public final void r(x xVar, z6.a aVar) {
        switch (this.f12254a) {
            case 0:
                z0 z0Var = (z0) this.f12255b;
                f fVar = (f) this.f12256c;
                z0 z0Var2 = fVar.f12263h;
                x xVar2 = x.f5395b;
                if (z0Var == z0Var2) {
                    y3.e.N("there's pending lb while current lb has been out of READY", fVar.f12266k);
                    fVar.f12264i = xVar;
                    fVar.f12265j = aVar;
                    if (xVar == xVar2) {
                        fVar.h();
                    }
                } else if (z0Var == fVar.f12261f) {
                    boolean z10 = xVar == xVar2;
                    fVar.f12266k = z10;
                    if (z10 || z0Var2 == fVar.f12258c) {
                        fVar.f12259d.r(xVar, aVar);
                    } else {
                        fVar.h();
                    }
                }
                break;
            default:
                ((j0) this.f12255b).r(xVar, new c(aVar));
                break;
        }
    }

    @Override // n8.b
    public final j0 s() {
        switch (this.f12254a) {
            case 0:
                return ((f) this.f12256c).f12259d;
            default:
                return (j0) this.f12255b;
        }
    }

    public e(p pVar, j0 j0Var) {
        this.f12256c = pVar;
        this.f12255b = j0Var;
    }
}
