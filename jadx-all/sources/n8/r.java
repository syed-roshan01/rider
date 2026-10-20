package n8;

import e8.c2;
import e8.v0;
import g8.j4;

/* JADX INFO: loaded from: classes.dex */
public final class r extends u {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c2 f12305s;

    public r(c2 c2Var) {
        y3.e.J(c2Var, "status");
        this.f12305s = c2Var;
    }

    @Override // n8.u
    public final boolean B0(u uVar) {
        if (uVar instanceof r) {
            r rVar = (r) uVar;
            c2 c2Var = rVar.f12305s;
            c2 c2Var2 = this.f12305s;
            if (y3.e.f0(c2Var2, c2Var) || (c2Var2.e() && rVar.f12305s.e())) {
                return true;
            }
        }
        return false;
    }

    @Override // z6.a
    public final v0 Y(j4 j4Var) {
        c2 c2Var = this.f12305s;
        return c2Var.e() ? v0.f5378e : v0.a(c2Var);
    }

    public final String toString() {
        q6.g gVar = new q6.g(r.class.getSimpleName());
        gVar.a(this.f12305s, "status");
        return gVar.toString();
    }
}
