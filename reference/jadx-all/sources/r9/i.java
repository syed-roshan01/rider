package r9;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import m9.g0;
import m9.j0;
import m9.o0;
import m9.z;

/* JADX INFO: loaded from: classes.dex */
public final class i extends z implements j0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f13706o = AtomicIntegerFieldUpdater.newUpdater(i.class, "runningWorkers");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f13707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f13708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j0 f13709e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k f13710f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f13711n;
    private volatile int runningWorkers;

    /* JADX WARN: Multi-variable type inference failed */
    public i(z zVar, int i10) {
        this.f13707c = zVar;
        this.f13708d = i10;
        j0 j0Var = zVar instanceof j0 ? (j0) zVar : null;
        this.f13709e = j0Var == null ? g0.f11946a : j0Var;
        this.f13710f = new k();
        this.f13711n = new Object();
    }

    @Override // m9.j0
    public final void M(long j10, m9.l lVar) {
        this.f13709e.M(j10, lVar);
    }

    @Override // m9.j0
    public final o0 Q(long j10, Runnable runnable, u8.j jVar) {
        return this.f13709e.Q(j10, runnable, jVar);
    }

    @Override // m9.z
    public final void c0(u8.j jVar, Runnable runnable) {
        Runnable runnableF0;
        this.f13710f.a(runnable);
        if (f13706o.get(this) >= this.f13708d || !g0() || (runnableF0 = f0()) == null) {
            return;
        }
        this.f13707c.c0(this, new l.h(22, this, runnableF0));
    }

    public final Runnable f0() {
        while (true) {
            Runnable runnable = (Runnable) this.f13710f.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f13711n) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f13706o;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f13710f.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean g0() {
        synchronized (this.f13711n) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f13706o;
            if (atomicIntegerFieldUpdater.get(this) >= this.f13708d) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }
}
