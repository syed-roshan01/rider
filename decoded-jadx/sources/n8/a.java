package n8;

import e8.c2;
import e8.w0;
import e8.z0;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends z0 {
    @Override // e8.z0
    public final boolean b() {
        return g().b();
    }

    @Override // e8.z0
    public final void c(c2 c2Var) {
        g().c(c2Var);
    }

    @Override // e8.z0
    public final void d(w0 w0Var) {
        g().d(w0Var);
    }

    @Override // e8.z0
    public final void e() {
        g().e();
    }

    public abstract z0 g();

    public final String toString() {
        q6.g gVarJ0 = f6.a.j0(this);
        gVarJ0.a(g(), "delegate");
        return gVarJ0.toString();
    }
}
