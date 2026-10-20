package g8;

/* JADX INFO: loaded from: classes.dex */
public final class v2 implements e8.y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f7175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7176b;

    public v2(k3 k3Var, e8.y0 y0Var) {
        this.f7176b = k3Var;
        this.f7175a = y0Var;
    }

    @Override // e8.y0
    public final void a(e8.y yVar) {
        z6.a g4Var;
        h4 h4Var = (h4) this.f7176b;
        e8.x0 x0Var = (e8.x0) this.f7175a;
        h4Var.getClass();
        e8.x xVar = yVar.f5403a;
        if (xVar == e8.x.f5398e) {
            return;
        }
        e8.x xVar2 = e8.x.f5396c;
        e8.x xVar3 = e8.x.f5397d;
        e8.j0 j0Var = h4Var.f6831c;
        if (xVar == xVar2 || xVar == xVar3) {
            j0Var.o();
        }
        if (h4Var.f6833e == xVar2) {
            if (xVar == e8.x.f5394a) {
                return;
            }
            if (xVar == xVar3) {
                h4Var.e();
                return;
            }
        }
        int iOrdinal = xVar.ordinal();
        if (iOrdinal == 0) {
            g4Var = new g4(e8.v0.f5378e);
        } else if (iOrdinal == 1) {
            g4Var = new g4(e8.v0.b(x0Var, null));
        } else if (iOrdinal == 2) {
            g4Var = new g4(e8.v0.a(yVar.f5404b));
        } else {
            if (iOrdinal != 3) {
                throw new IllegalArgumentException("Unsupported state:" + xVar);
            }
            g4Var = new w2(h4Var, x0Var);
        }
        h4Var.f6833e = xVar;
        j0Var.r(xVar, g4Var);
    }

    public /* synthetic */ v2(Object obj, Object obj2) {
        this.f7176b = obj;
        this.f7175a = obj2;
    }
}
