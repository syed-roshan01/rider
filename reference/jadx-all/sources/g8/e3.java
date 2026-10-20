package g8;

import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class e3 extends e8.j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i3 f6743a;

    public e3(i3 i3Var) {
        this.f6743a = i3Var;
    }

    @Override // e8.j0
    public final String g() {
        return this.f6743a.f6851b;
    }

    @Override // e8.j0
    public final e8.k m(e8.p1 p1Var, e8.h hVar) {
        l3 l3Var = this.f6743a.f6853d;
        Logger logger = l3.f6919b0;
        l3Var.getClass();
        Executor executor = hVar.f5268b;
        Executor executor2 = executor == null ? l3Var.f6934h : executor;
        l3 l3Var2 = this.f6743a.f6853d;
        g0 g0Var = new g0(p1Var, executor2, hVar, l3Var2.Y, l3Var2.I ? null : this.f6743a.f6853d.f6932f.f7206a.L(), this.f6743a.f6853d.L);
        this.f6743a.f6853d.getClass();
        g0Var.f6786q = false;
        l3 l3Var3 = this.f6743a.f6853d;
        g0Var.f6787r = l3Var3.f6940n;
        g0Var.f6788s = l3Var3.f6941o;
        return g0Var;
    }
}
