package t9;

import i3.u;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import l.q;
import m9.e0;
import r9.r;
import x9.v;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Executor, Closeable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f14679o = AtomicLongFieldUpdater.newUpdater(b.class, "parkedWorkersStack");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f14680p = AtomicLongFieldUpdater.newUpdater(b.class, "controlState");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f14681q = AtomicIntegerFieldUpdater.newUpdater(b.class, "_isTerminated");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final u f14682r = new u("NOT_IN_STACK", 5);
    private volatile int _isTerminated;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f14685c;
    private volatile long controlState;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f14686d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f14687e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f14688f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final r f14689n;
    private volatile long parkedWorkersStack;

    public b(int i10, int i11, String str, long j10) {
        this.f14683a = i10;
        this.f14684b = i11;
        this.f14685c = j10;
        this.f14686d = str;
        if (i10 < 1) {
            throw new IllegalArgumentException(q.h("Core pool size ", i10, " should be at least 1").toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(q.i("Max pool size ", i11, " should be greater than or equals to core pool size ", i10).toString());
        }
        if (i11 > 2097150) {
            throw new IllegalArgumentException(q.h("Max pool size ", i11, " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j10 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j10 + " must be positive").toString());
        }
        this.f14687e = new e();
        this.f14688f = new e();
        this.f14689n = new r((i10 + 1) * 2);
        this.controlState = ((long) i10) << 42;
        this._isTerminated = 0;
    }

    public static /* synthetic */ void e(b bVar, Runnable runnable, boolean z10, int i10) {
        v vVar = (i10 & 2) != 0 ? j.f14704g : null;
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        bVar.b(runnable, vVar, z10);
    }

    public final int a() {
        synchronized (this.f14689n) {
            try {
                if (f14681q.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f14680p;
                long j10 = atomicLongFieldUpdater.get(this);
                int i10 = (int) (j10 & 2097151);
                int i11 = i10 - ((int) ((j10 & 4398044413952L) >> 21));
                if (i11 < 0) {
                    i11 = 0;
                }
                if (i11 >= this.f14683a) {
                    return 0;
                }
                if (i10 >= this.f14684b) {
                    return 0;
                }
                int i12 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i12 <= 0 || this.f14689n.b(i12) != null) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                a aVar = new a(this, i12);
                this.f14689n.c(i12, aVar);
                if (i12 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                int i13 = i11 + 1;
                aVar.start();
                return i13;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Runnable runnable, v vVar, boolean z10) {
        h iVar;
        int i10;
        j.f14703f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof h) {
            iVar = (h) runnable;
            iVar.f14695a = jNanoTime;
            iVar.f14696b = vVar;
        } else {
            iVar = new i(runnable, jNanoTime, vVar);
        }
        boolean z11 = false;
        boolean z12 = iVar.f14696b.f16473a == 1;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f14680p;
        long jAddAndGet = z12 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        a aVar = threadCurrentThread instanceof a ? (a) threadCurrentThread : null;
        if (aVar == null || !d7.a.d(aVar.f14678o, this)) {
            aVar = null;
        }
        if (aVar != null && (i10 = aVar.f14673c) != 5 && (iVar.f14696b.f16473a != 0 || i10 != 2)) {
            aVar.f14677n = true;
            l lVar = aVar.f14671a;
            if (z10) {
                iVar = lVar.a(iVar);
            } else {
                lVar.getClass();
                h hVar = (h) l.f14707b.getAndSet(lVar, iVar);
                iVar = hVar == null ? null : lVar.a(hVar);
            }
        }
        if (iVar != null) {
            if (!(iVar.f14696b.f16473a == 1 ? this.f14688f.a(iVar) : this.f14687e.a(iVar))) {
                throw new RejectedExecutionException(a7.a.p(new StringBuilder(), this.f14686d, " was terminated"));
            }
        }
        if (z10 && aVar != null) {
            z11 = true;
        }
        if (z12) {
            if (z11 || p() || g(jAddAndGet)) {
                return;
            }
            p();
            return;
        }
        if (z11 || p() || g(atomicLongFieldUpdater.get(this))) {
            return;
        }
        p();
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0089  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws InterruptedException {
        int i10;
        h hVarA;
        if (f14681q.compareAndSet(this, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            a aVar = threadCurrentThread instanceof a ? (a) threadCurrentThread : null;
            if (aVar == null || !d7.a.d(aVar.f14678o, this)) {
                aVar = null;
            }
            synchronized (this.f14689n) {
                i10 = (int) (f14680p.get(this) & 2097151);
            }
            if (1 <= i10) {
                int i11 = 1;
                while (true) {
                    Object objB = this.f14689n.b(i11);
                    d7.a.j(objB);
                    a aVar2 = (a) objB;
                    if (aVar2 != aVar) {
                        while (aVar2.isAlive()) {
                            LockSupport.unpark(aVar2);
                            aVar2.join(10000L);
                        }
                        l lVar = aVar2.f14671a;
                        e eVar = this.f14688f;
                        lVar.getClass();
                        h hVar = (h) l.f14707b.getAndSet(lVar, null);
                        if (hVar != null) {
                            eVar.a(hVar);
                        }
                        while (true) {
                            h hVarB = lVar.b();
                            if (hVarB == null) {
                                break;
                            } else {
                                eVar.a(hVarB);
                            }
                        }
                    }
                    if (i11 == i10) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            this.f14688f.b();
            this.f14687e.b();
            while (true) {
                if (aVar != null) {
                    hVarA = aVar.a(true);
                    if (hVarA == null) {
                        hVarA = (h) this.f14687e.d();
                        if (hVarA == null) {
                            break;
                            break;
                        }
                    }
                } else {
                    hVarA = (h) this.f14687e.d();
                    if (hVarA == null && (hVarA = (h) this.f14688f.d()) == null) {
                        break;
                    }
                }
                try {
                    hVarA.run();
                } catch (Throwable th) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
                }
            }
            if (aVar != null) {
                aVar.h(5);
            }
            f14679o.set(this, 0L);
            f14680p.set(this, 0L);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        e(this, runnable, false, 6);
    }

    public final void f(a aVar, int i10, int i11) {
        while (true) {
            long j10 = f14679o.get(this);
            int i12 = (int) (2097151 & j10);
            long j11 = (2097152 + j10) & (-2097152);
            if (i12 == i10) {
                if (i11 == 0) {
                    Object objC = aVar.c();
                    while (true) {
                        if (objC == f14682r) {
                            i12 = -1;
                            break;
                        }
                        if (objC == null) {
                            i12 = 0;
                            break;
                        }
                        a aVar2 = (a) objC;
                        int iB = aVar2.b();
                        if (iB != 0) {
                            i12 = iB;
                            break;
                        }
                        objC = aVar2.c();
                    }
                } else {
                    i12 = i11;
                }
            }
            if (i12 >= 0 && f14679o.compareAndSet(this, j10, ((long) i12) | j11)) {
                return;
            }
        }
    }

    public final boolean g(long j10) {
        int i10 = ((int) (2097151 & j10)) - ((int) ((j10 & 4398044413952L) >> 21));
        if (i10 < 0) {
            i10 = 0;
        }
        int i11 = this.f14683a;
        if (i10 < i11) {
            int iA = a();
            if (iA == 1 && i11 > 1) {
                a();
            }
            if (iA > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean p() {
        u uVar;
        int iB;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f14679o;
            long j10 = atomicLongFieldUpdater.get(this);
            a aVar = (a) this.f14689n.b((int) (2097151 & j10));
            if (aVar == null) {
                aVar = null;
            } else {
                long j11 = (2097152 + j10) & (-2097152);
                Object objC = aVar.c();
                while (true) {
                    uVar = f14682r;
                    if (objC == uVar) {
                        iB = -1;
                        break;
                    }
                    if (objC == null) {
                        iB = 0;
                        break;
                    }
                    a aVar2 = (a) objC;
                    iB = aVar2.b();
                    if (iB != 0) {
                        break;
                    }
                    objC = aVar2.c();
                }
                if (iB >= 0 && atomicLongFieldUpdater.compareAndSet(this, j10, j11 | ((long) iB))) {
                    aVar.g(uVar);
                }
            }
            if (aVar == null) {
                return false;
            }
            if (a.f14670p.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        r rVar = this.f14689n;
        int iA = rVar.a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 1; i15 < iA; i15++) {
            a aVar = (a) rVar.b(i15);
            if (aVar != null) {
                l lVar = aVar.f14671a;
                lVar.getClass();
                int i16 = l.f14707b.get(lVar) != null ? (l.f14708c.get(lVar) - l.f14709d.get(lVar)) + 1 : l.f14708c.get(lVar) - l.f14709d.get(lVar);
                int iE = t.k.e(aVar.f14673c);
                if (iE == 0) {
                    i10++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i16);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iE == 1) {
                    i11++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i16);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iE == 2) {
                    i12++;
                } else if (iE == 3) {
                    i13++;
                    if (i16 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i16);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (iE == 4) {
                    i14++;
                }
            }
        }
        long j10 = f14680p.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f14686d);
        sb4.append('@');
        sb4.append(e0.z(this));
        sb4.append("[Pool Size {core = ");
        int i17 = this.f14683a;
        sb4.append(i17);
        sb4.append(", max = ");
        sb4.append(this.f14684b);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i10);
        sb4.append(", blocking = ");
        sb4.append(i11);
        sb4.append(", parked = ");
        sb4.append(i12);
        sb4.append(", dormant = ");
        sb4.append(i13);
        sb4.append(", terminated = ");
        sb4.append(i14);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f14687e.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f14688f.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j10));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j10) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i17 - ((int) ((j10 & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
