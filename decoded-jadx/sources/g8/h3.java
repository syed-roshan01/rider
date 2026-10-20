package g8;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class h3 extends v0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final e8.b0 f6827k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e8.p1 f6828l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e8.h f6829m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ i3 f6830n;

    /* JADX WARN: Illegal instructions before constructor call */
    public h3(i3 i3Var, e8.b0 b0Var, e8.p1 p1Var, e8.h hVar) {
        this.f6830n = i3Var;
        l3 l3Var = i3Var.f6853d;
        Logger logger = l3.f6919b0;
        l3Var.getClass();
        Executor executor = hVar.f5268b;
        super(executor == null ? l3Var.f6934h : executor, i3Var.f6853d.f6933g, hVar.f5267a);
        this.f6827k = b0Var;
        this.f6828l = p1Var;
        this.f6829m = hVar;
    }

    public final void d() {
        s0 s0Var;
        e8.b0 b0VarA = this.f6827k.a();
        try {
            e8.k kVarS = this.f6830n.s(this.f6828l, this.f6829m.c(e8.p.f5332x, Boolean.TRUE));
            this.f6827k.c(b0VarA);
            synchronized (this) {
                try {
                    e8.k kVar = this.f7166f;
                    if (kVar != null) {
                        s0Var = null;
                    } else {
                        y3.e.M(kVar, "realCall already set to %s", kVar == null);
                        ScheduledFuture scheduledFuture = this.f7161a;
                        if (scheduledFuture != null) {
                            scheduledFuture.cancel(false);
                        }
                        this.f7166f = kVarS;
                        s0Var = new s0(this, this.f7163c);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (s0Var == null) {
                this.f6830n.f6853d.f6939m.execute(new t0(this, 6));
                return;
            }
            l3 l3Var = this.f6830n.f6853d;
            e8.h hVar = this.f6829m;
            Logger logger = l3.f6919b0;
            l3Var.getClass();
            Executor executor = hVar.f5268b;
            if (executor == null) {
                executor = l3Var.f6934h;
            }
            executor.execute(new x1(23, this, s0Var));
        } catch (Throwable th2) {
            this.f6827k.c(b0VarA);
            throw th2;
        }
    }
}
