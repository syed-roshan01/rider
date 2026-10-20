package m9;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class k0 extends r9.s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f11956e = AtomicIntegerFieldUpdater.newUpdater(k0.class, "_decision");
    private volatile int _decision;

    @Override // r9.s, m9.p1
    public final void t(Object obj) {
        v(obj);
    }

    @Override // r9.s, m9.p1
    public final void v(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f11956e;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("Already resumed".toString());
                }
                r9.a.l(d7.t.b0(this.f13726d), d7.t.l0(obj), null);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
