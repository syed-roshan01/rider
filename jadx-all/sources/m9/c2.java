package m9;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class c2 implements c9.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f11915c = AtomicIntegerFieldUpdater.newUpdater(c2.class, "_state");
    private volatile int _state;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Thread f11916a = Thread.currentThread();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o0 f11917b;

    public c2(f1 f1Var) {
    }

    public static void b(int i10) {
        throw new IllegalStateException(("Illegal state " + i10).toString());
    }

    public final void a() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f11915c;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        b(i10);
                        throw null;
                    }
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i10, 1)) {
                o0 o0Var = this.f11917b;
                if (o0Var != null) {
                    o0Var.a();
                    return;
                }
                return;
            }
        }
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        do {
            atomicIntegerFieldUpdater = f11915c;
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 != 1 && i10 != 2 && i10 != 3) {
                    b(i10);
                    throw null;
                }
            }
            return q8.l.f13235a;
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 2));
        this.f11916a.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
        return q8.l.f13235a;
    }
}
