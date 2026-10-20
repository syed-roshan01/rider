package g8;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c1 implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f6682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f6683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f6684c = new ArrayList();

    public c1(j0 j0Var) {
        this.f6682a = j0Var;
    }

    @Override // g8.b6
    public final void a(a6 a6Var) {
        if (this.f6683b) {
            this.f6682a.a(a6Var);
        } else {
            e(new x1(15, this, a6Var));
        }
    }

    @Override // g8.b6
    public final void b() {
        if (this.f6683b) {
            this.f6682a.b();
        } else {
            e(new t0(this, 2));
        }
    }

    @Override // g8.j0
    public final void c(e8.c2 c2Var, i0 i0Var, e8.l1 l1Var) {
        e(new k.e(this, c2Var, i0Var, l1Var, 7));
    }

    @Override // g8.j0
    public final void d(e8.l1 l1Var) {
        e(new x1(16, this, l1Var));
    }

    public final void e(Runnable runnable) {
        synchronized (this) {
            try {
                if (this.f6683b) {
                    runnable.run();
                } else {
                    this.f6684c.add(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
