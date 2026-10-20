package r9;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import m9.v1;

/* JADX INFO: loaded from: classes.dex */
public abstract class t extends d implements v1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f13727d = AtomicIntegerFieldUpdater.newUpdater(t.class, "cleanedAndPointers");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f13728c;
    private volatile int cleanedAndPointers;

    public t(long j10, t tVar, int i10) {
        super(tVar);
        this.f13728c = j10;
        this.cleanedAndPointers = i10 << 16;
    }

    @Override // r9.d
    public final boolean c() {
        return f13727d.get(this) == f() && b() != null;
    }

    public final boolean e() {
        return f13727d.addAndGet(this, -65536) == f() && b() != null;
    }

    public abstract int f();

    public abstract void g(int i10, u8.j jVar);

    public final void h() {
        if (f13727d.incrementAndGet(this) == f()) {
            d();
        }
    }

    public final boolean i() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        do {
            atomicIntegerFieldUpdater = f13727d;
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 == f() && b() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 65536 + i10));
        return true;
    }
}
