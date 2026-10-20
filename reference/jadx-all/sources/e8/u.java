package e8;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class u extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f5366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f5367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f5368c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b0 f5369d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v f5370e;

    public u(v vVar, e eVar, Executor executor, d dVar, b0 b0Var) {
        this.f5370e = vVar;
        this.f5366a = eVar;
        this.f5367b = executor;
        this.f5368c = dVar;
        y3.e.J(b0Var, "context");
        this.f5369d = b0Var;
    }

    @Override // e8.d
    public final void a(l1 l1Var) {
        b0 b0Var = this.f5369d;
        b0 b0VarA = b0Var.a();
        try {
            this.f5370e.f5377b.applyRequestMetadata(this.f5366a, this.f5367b, new t(this.f5368c, l1Var));
        } finally {
            b0Var.c(b0VarA);
        }
    }

    @Override // e8.d
    public final void b(c2 c2Var) {
        this.f5368c.b(c2Var);
    }
}
