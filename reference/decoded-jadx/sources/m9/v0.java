package m9;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes.dex */
public abstract class v0 extends w0 implements j0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f12010n = AtomicReferenceFieldUpdater.newUpdater(v0.class, Object.class, "_queue");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f12011o = AtomicReferenceFieldUpdater.newUpdater(v0.class, Object.class, "_delayed");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f12012p = AtomicIntegerFieldUpdater.newUpdater(v0.class, "_isCompleted");
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    @Override // m9.j0
    public final void M(long j10, l lVar) {
        long j11 = 0;
        if (j10 > 0) {
            j11 = j10 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j10;
        }
        if (j11 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            r0 r0Var = new r0(this, j11 + jNanoTime, lVar);
            q0(jNanoTime, r0Var);
            lVar.v(new i(r0Var, 1));
        }
    }

    public o0 Q(long j10, Runnable runnable, u8.j jVar) {
        return g0.f11946a.Q(j10, runnable, jVar);
    }

    @Override // m9.z
    public final void c0(u8.j jVar, Runnable runnable) {
        n0(runnable);
    }

    /* JADX WARN: Code duplicated, block: B:80:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e1 A[Catch: all -> 0x00f3, TRY_LEAVE, TryCatch #0 {, blocks: (B:81:0x00dd, B:83:0x00e1), top: B:95:0x00dd }] */
    /* JADX WARN: Code duplicated, block: B:87:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:95:0x00dd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // m9.w0
    public final long k0() {
        Runnable runnable;
        u0 u0Var;
        t0 t0Var;
        t0 t0VarB;
        if (l0()) {
            return 0L;
        }
        u0 u0Var2 = (u0) f12011o.get(this);
        if (u0Var2 != null && r9.x.f13735b.get(u0Var2) != 0) {
            long jNanoTime = System.nanoTime();
            do {
                synchronized (u0Var2) {
                    t0[] t0VarArr = u0Var2.f13736a;
                    t0 t0Var2 = t0VarArr != null ? t0VarArr[0] : null;
                    if (t0Var2 == null) {
                        t0VarB = null;
                    } else {
                        t0VarB = (jNanoTime - t0Var2.f12002a < 0 || !o0(t0Var2)) ? null : u0Var2.b(0);
                    }
                }
            } while (t0VarB != null);
        }
        loop1: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12010n;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (obj instanceof r9.m) {
                    r9.m mVar = (r9.m) obj;
                    Object objD = mVar.d();
                    if (objD != r9.m.f13719g) {
                        runnable = (Runnable) objD;
                        break;
                    }
                    r9.m mVarC = mVar.c();
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mVarC) && atomicReferenceFieldUpdater.get(this) == obj) {
                    }
                } else if (obj != e0.f11926c) {
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                            runnable = (Runnable) obj;
                            break loop1;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == obj);
                }
            }
            runnable = null;
            break;
        }
        if (runnable != null) {
            runnable.run();
            return 0L;
        }
        r8.l lVar = this.f12019e;
        if (((lVar == null || lVar.isEmpty()) ? Long.MAX_VALUE : 0L) == 0) {
            return 0L;
        }
        Object obj2 = f12010n.get(this);
        if (obj2 == null) {
            u0Var = (u0) f12011o.get(this);
            if (u0Var != null) {
                synchronized (u0Var) {
                    t0[] t0VarArr2 = u0Var.f13736a;
                    t0Var = t0VarArr2 != null ? t0VarArr2[0] : null;
                }
                if (t0Var != null) {
                    return z6.a.n(t0Var.f12002a - System.nanoTime());
                }
            }
        } else if (obj2 instanceof r9.m) {
            long j10 = r9.m.f13718f.get((r9.m) obj2);
            if (((int) (1073741823 & j10)) != ((int) ((j10 & 1152921503533105152L) >> 30))) {
                return 0L;
            }
            u0Var = (u0) f12011o.get(this);
            if (u0Var != null) {
                synchronized (u0Var) {
                    t0[] t0VarArr3 = u0Var.f13736a;
                    if (t0VarArr3 != null) {
                    }
                    if (t0Var != null) {
                        return z6.a.n(t0Var.f12002a - System.nanoTime());
                    }
                }
            }
        } else if (obj2 != e0.f11926c) {
            return 0L;
        }
        return Long.MAX_VALUE;
    }

    public void n0(Runnable runnable) {
        if (!o0(runnable)) {
            f0.f11940q.n0(runnable);
            return;
        }
        Thread threadH0 = h0();
        if (Thread.currentThread() != threadH0) {
            LockSupport.unpark(threadH0);
        }
    }

    public final boolean o0(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12010n;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f12012p.get(this) != 0) {
                return false;
            }
            if (obj == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                    }
                }
                return true;
            }
            if (!(obj instanceof r9.m)) {
                if (obj == e0.f11926c) {
                    return false;
                }
                r9.m mVar = new r9.m(8, true);
                mVar.a((Runnable) obj);
                mVar.a(runnable);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return true;
            }
            r9.m mVar2 = (r9.m) obj;
            int iA = mVar2.a(runnable);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                r9.m mVarC = mVar2.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mVarC) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            } else if (iA == 2) {
                return false;
            }
        }
    }

    public final boolean p0() {
        r8.l lVar = this.f12019e;
        if (!(lVar != null ? lVar.isEmpty() : true)) {
            return false;
        }
        u0 u0Var = (u0) f12011o.get(this);
        if (u0Var != null && r9.x.f13735b.get(u0Var) != 0) {
            return false;
        }
        Object obj = f12010n.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof r9.m) {
            long j10 = r9.m.f13718f.get((r9.m) obj);
            if (((int) (1073741823 & j10)) == ((int) ((j10 & 1152921503533105152L) >> 30))) {
                return true;
            }
        } else if (obj == e0.f11926c) {
            return true;
        }
        return false;
    }

    public final void q0(long j10, t0 t0Var) {
        int iC;
        Thread threadH0;
        boolean z10 = f12012p.get(this) != 0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12011o;
        t0 t0Var2 = null;
        if (z10) {
            iC = 1;
        } else {
            u0 u0Var = (u0) atomicReferenceFieldUpdater.get(this);
            if (u0Var == null) {
                u0 u0Var2 = new u0();
                u0Var2.f12006c = j10;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, u0Var2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                d7.a.j(obj);
                u0Var = (u0) obj;
            }
            iC = t0Var.c(j10, u0Var, this);
        }
        if (iC != 0) {
            if (iC == 1) {
                m0(j10, t0Var);
                return;
            } else {
                if (iC != 2) {
                    throw new IllegalStateException("unexpected result".toString());
                }
                return;
            }
        }
        u0 u0Var3 = (u0) atomicReferenceFieldUpdater.get(this);
        if (u0Var3 != null) {
            synchronized (u0Var3) {
                t0[] t0VarArr = u0Var3.f13736a;
                t0Var2 = t0VarArr != null ? t0VarArr[0] : null;
            }
        }
        if (t0Var2 != t0Var || Thread.currentThread() == (threadH0 = h0())) {
            return;
        }
        LockSupport.unpark(threadH0);
    }

    @Override // m9.w0
    public void shutdown() {
        t0 t0VarB;
        ThreadLocal threadLocal = a2.f11904a;
        a2.f11904a.set(null);
        f12012p.set(this, 1);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12010n;
            Object obj = atomicReferenceFieldUpdater.get(this);
            i3.u uVar = e0.f11926c;
            if (obj == null) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, uVar)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == null);
            } else if (obj instanceof r9.m) {
                ((r9.m) obj).b();
                break;
            } else {
                if (obj == uVar) {
                    break;
                }
                r9.m mVar = new r9.m(8, true);
                mVar.a((Runnable) obj);
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, mVar)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj);
            }
        }
        while (k0() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            u0 u0Var = (u0) f12011o.get(this);
            if (u0Var == null) {
                return;
            }
            synchronized (u0Var) {
                t0VarB = r9.x.f13735b.get(u0Var) > 0 ? u0Var.b(0) : null;
            }
            if (t0VarB == null) {
                return;
            } else {
                m0(jNanoTime, t0VarB);
            }
        }
    }
}
