package g8;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class p5 extends l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicIntegerFieldUpdater f7039c;

    public p5(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.f7039c = atomicIntegerFieldUpdater;
    }

    @Override // g8.l
    public final boolean v(r5 r5Var) {
        return this.f7039c.compareAndSet(r5Var, 0, -1);
    }

    @Override // g8.l
    public final void w(r5 r5Var) {
        this.f7039c.set(r5Var, 0);
    }
}
