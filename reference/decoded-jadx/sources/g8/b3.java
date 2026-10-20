package g8;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class b3 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e4 f6663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Executor f6664b;

    public b3(l1 l1Var) {
        this.f6663a = l1Var;
    }

    public final synchronized void a() {
        Executor executor = this.f6664b;
        if (executor != null) {
            l1 l1Var = (l1) this.f6663a;
            switch (l1Var.f6916a) {
                case 0:
                    break;
                default:
                    w5.b((v5) l1Var.f6917b, executor);
                    break;
            }
            this.f6664b = null;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Executor executor;
        synchronized (this) {
            try {
                if (this.f6664b == null) {
                    l1 l1Var = (l1) this.f6663a;
                    int i10 = l1Var.f6916a;
                    Object objA = l1Var.f6917b;
                    switch (i10) {
                        case 0:
                            break;
                        default:
                            objA = w5.a((v5) objA);
                            break;
                    }
                    Executor executor2 = (Executor) objA;
                    Executor executor3 = this.f6664b;
                    if (executor2 == null) {
                        throw new NullPointerException(f6.a.c0("%s.getObject()", executor3));
                    }
                    this.f6664b = executor2;
                }
                executor = this.f6664b;
            } catch (Throwable th) {
                throw th;
            }
        }
        executor.execute(runnable);
    }
}
