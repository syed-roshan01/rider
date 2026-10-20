package m9;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes.dex */
public final class g extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Thread f11944d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w0 f11945e;

    public g(u8.j jVar, Thread thread, w0 w0Var) {
        super(jVar, true);
        this.f11944d = thread;
        this.f11945e = w0Var;
    }

    @Override // m9.p1
    public final void t(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.f11944d;
        if (d7.a.d(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
