package g8;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class u0 extends e8.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e8.j f7148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f7149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f7150c = new ArrayList();

    public u0(e8.j jVar) {
        this.f7148a = jVar;
    }

    public final void a(Runnable runnable) {
        synchronized (this) {
            try {
                if (this.f7149b) {
                    runnable.run();
                } else {
                    this.f7150c.add(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // e8.j
    public final void onClose(e8.c2 c2Var, e8.l1 l1Var) {
        a(new y2.a(this, c2Var, l1Var, 19));
    }

    @Override // e8.j
    public final void onHeaders(e8.l1 l1Var) {
        if (this.f7149b) {
            this.f7148a.onHeaders(l1Var);
        } else {
            a(new x1(6, this, l1Var));
        }
    }

    @Override // e8.j
    public final void onMessage(Object obj) {
        if (this.f7149b) {
            this.f7148a.onMessage(obj);
        } else {
            a(new x1(7, this, obj));
        }
    }

    @Override // e8.j
    public final void onReady() {
        if (this.f7149b) {
            this.f7148a.onReady();
        } else {
            a(new t0(this, 1));
        }
    }
}
