package t9;

import d9.u;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Thread {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f14670p = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f14671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f14672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f14674d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f14675e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f14676f;
    private volatile int indexInArray;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f14677n;
    private volatile Object nextParkedWorker;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ b f14678o;
    private volatile int workerCtl;

    public a(b bVar, int i10) {
        this.f14678o = bVar;
        setDaemon(true);
        this.f14671a = new l();
        this.f14672b = new u();
        this.f14673c = 4;
        this.nextParkedWorker = b.f14682r;
        g9.d.f7313a.getClass();
        this.f14676f = g9.d.f7314b.a();
        f(i10);
    }

    public final h a(boolean z10) {
        h hVarE;
        h hVarE2;
        long j10;
        int i10 = this.f14673c;
        b bVar = this.f14678o;
        h hVar = null;
        l lVar = this.f14671a;
        if (i10 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = b.f14680p;
            do {
                j10 = atomicLongFieldUpdater.get(bVar);
                if (((int) ((9223367638808264704L & j10) >> 42)) == 0) {
                    lVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l.f14707b;
                        h hVar2 = (h) atomicReferenceFieldUpdater.get(lVar);
                        if (hVar2 == null || hVar2.f14696b.f16473a != 1) {
                            int i11 = l.f14709d.get(lVar);
                            int i12 = l.f14708c.get(lVar);
                            while (i11 != i12 && l.f14710e.get(lVar) != 0) {
                                i12--;
                                h hVarC = lVar.c(i12, true);
                                if (hVarC != null) {
                                    hVar = hVarC;
                                    break;
                                }
                            }
                            break;
                        }
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(lVar, hVar2, null)) {
                                hVar = hVar2;
                                break loop1;
                            }
                        } while (atomicReferenceFieldUpdater.get(lVar) == hVar2);
                    }
                    if (hVar != null) {
                        return hVar;
                    }
                    h hVar3 = (h) bVar.f14688f.d();
                    return hVar3 == null ? i(1) : hVar3;
                }
            } while (!b.f14680p.compareAndSet(bVar, j10, j10 - 4398046511104L));
            this.f14673c = 1;
        }
        if (z10) {
            boolean z11 = d(bVar.f14683a * 2) == 0;
            if (z11 && (hVarE2 = e()) != null) {
                return hVarE2;
            }
            lVar.getClass();
            h hVarB = (h) l.f14707b.getAndSet(lVar, null);
            if (hVarB == null) {
                hVarB = lVar.b();
            }
            if (hVarB != null) {
                return hVarB;
            }
            if (!z11 && (hVarE = e()) != null) {
                return hVarE;
            }
        } else {
            h hVarE3 = e();
            if (hVarE3 != null) {
                return hVarE3;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i10) {
        int i11 = this.f14676f;
        int i12 = i11 ^ (i11 << 13);
        int i13 = i12 ^ (i12 >> 17);
        int i14 = i13 ^ (i13 << 5);
        this.f14676f = i14;
        int i15 = i10 - 1;
        return (i15 & i10) == 0 ? i14 & i15 : (i14 & Integer.MAX_VALUE) % i10;
    }

    public final h e() {
        int iD = d(2);
        b bVar = this.f14678o;
        if (iD == 0) {
            h hVar = (h) bVar.f14687e.d();
            return hVar != null ? hVar : (h) bVar.f14688f.d();
        }
        h hVar2 = (h) bVar.f14688f.d();
        return hVar2 != null ? hVar2 : (h) bVar.f14687e.d();
    }

    public final void f(int i10) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f14678o.f14686d);
        sb.append("-worker-");
        sb.append(i10 == 0 ? "TERMINATED" : String.valueOf(i10));
        setName(sb.toString());
        this.indexInArray = i10;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(int i10) {
        int i11 = this.f14673c;
        boolean z10 = i11 == 1;
        if (z10) {
            b.f14680p.addAndGet(this.f14678o, 4398046511104L);
        }
        if (i11 != i10) {
            this.f14673c = i10;
        }
        return z10;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00df A[SYNTHETIC] */
    public final h i(int i10) {
        int i11;
        h hVarC;
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = b.f14680p;
        b bVar = this.f14678o;
        int i12 = (int) (atomicLongFieldUpdater.get(bVar) & 2097151);
        h hVar = null;
        if (i12 < 2) {
            return null;
        }
        int iD = d(i12);
        int i13 = 0;
        long jMin = Long.MAX_VALUE;
        while (i13 < i12) {
            int i14 = iD + 1;
            if (i14 > i12) {
                i14 = 1;
            }
            a aVar = (a) bVar.f14689n.b(i14);
            if (aVar == null || aVar == this) {
                i11 = i14;
            } else {
                l lVar = aVar.f14671a;
                if (i10 != 3) {
                    lVar.getClass();
                    int i15 = l.f14709d.get(lVar);
                    int i16 = l.f14708c.get(lVar);
                    boolean z10 = i10 == 1;
                    while (true) {
                        if (i15 != i16 && (!z10 || l.f14710e.get(lVar) != 0)) {
                            int i17 = i15 + 1;
                            hVarC = lVar.c(i15, z10);
                            if (hVarC != null) {
                                break;
                            }
                            i15 = i17;
                        } else {
                            hVarC = hVar;
                            break;
                        }
                    }
                } else {
                    hVarC = lVar.b();
                }
                u uVar = this.f14672b;
                if (hVarC != null) {
                    uVar.f4952a = hVarC;
                    i11 = i14;
                } else {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l.f14707b;
                        h hVar2 = (h) atomicReferenceFieldUpdater.get(lVar);
                        if (hVar2 != null) {
                            if (((hVar2.f14696b.f16473a == 1 ? 1 : 2) & i10) != 0) {
                                j.f14703f.getClass();
                                i11 = i14;
                                long jNanoTime = System.nanoTime() - hVar2.f14695a;
                                long j11 = j.f14699b;
                                if (jNanoTime < j11) {
                                    j10 = j11 - jNanoTime;
                                    hVar = null;
                                    break;
                                }
                                while (true) {
                                    hVar = null;
                                    if (atomicReferenceFieldUpdater.compareAndSet(lVar, hVar2, null)) {
                                        uVar.f4952a = hVar2;
                                    } else if (atomicReferenceFieldUpdater.get(lVar) != hVar2) {
                                        i14 = i11;
                                        hVar = null;
                                    }
                                }
                            }
                        }
                        i11 = i14;
                        j10 = -2;
                        break;
                    }
                    if (j10 == -1) {
                        h hVar3 = (h) uVar.f4952a;
                        uVar.f4952a = hVar;
                        return hVar3;
                    }
                    if (j10 > 0) {
                        jMin = Math.min(jMin, j10);
                    }
                }
                j10 = -1;
                if (j10 == -1) {
                    h hVar4 = (h) uVar.f4952a;
                    uVar.f4952a = hVar;
                    return hVar4;
                }
                if (j10 > 0) {
                    jMin = Math.min(jMin, j10);
                }
            }
            i13++;
            iD = i11;
            hVar = null;
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = 0;
        }
        this.f14675e = jMin;
        return null;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j10;
        int i10;
        loop0: while (true) {
            boolean z10 = false;
            while (true) {
                b bVar = this.f14678o;
                bVar.getClass();
                int i11 = 5;
                if (b.f14681q.get(bVar) != 0 || this.f14673c == 5) {
                    break loop0;
                }
                h hVarA = a(this.f14677n);
                int i12 = 3;
                if (hVarA == null) {
                    this.f14677n = false;
                    if (this.f14675e == 0) {
                        Object obj = this.nextParkedWorker;
                        i3.u uVar = b.f14682r;
                        if (obj != uVar) {
                            f14670p.set(this, -1);
                            while (this.nextParkedWorker != b.f14682r) {
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f14670p;
                                if (atomicIntegerFieldUpdater.get(this) != -1) {
                                    break;
                                }
                                b bVar2 = this.f14678o;
                                bVar2.getClass();
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = b.f14681q;
                                if (atomicIntegerFieldUpdater2.get(bVar2) != 0 || this.f14673c == i11) {
                                    break;
                                }
                                h(i12);
                                Thread.interrupted();
                                if (this.f14674d == 0) {
                                    this.f14674d = System.nanoTime() + this.f14678o.f14685c;
                                }
                                LockSupport.parkNanos(this.f14678o.f14685c);
                                if (System.nanoTime() - this.f14674d >= 0) {
                                    this.f14674d = 0L;
                                    b bVar3 = this.f14678o;
                                    synchronized (bVar3.f14689n) {
                                        try {
                                            if (!(atomicIntegerFieldUpdater2.get(bVar3) != 0)) {
                                                AtomicLongFieldUpdater atomicLongFieldUpdater2 = b.f14680p;
                                                if (((int) (atomicLongFieldUpdater2.get(bVar3) & 2097151)) > bVar3.f14683a) {
                                                    if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                        int i13 = this.indexInArray;
                                                        f(0);
                                                        bVar3.f(this, i13, 0);
                                                        int andDecrement = (int) (atomicLongFieldUpdater2.getAndDecrement(bVar3) & 2097151);
                                                        if (andDecrement != i13) {
                                                            Object objB = bVar3.f14689n.b(andDecrement);
                                                            d7.a.j(objB);
                                                            a aVar = (a) objB;
                                                            bVar3.f14689n.c(i13, aVar);
                                                            aVar.f(i13);
                                                            bVar3.f(aVar, andDecrement, i13);
                                                        }
                                                        bVar3.f14689n.c(andDecrement, null);
                                                        this.f14673c = 5;
                                                    }
                                                }
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                }
                                i11 = 5;
                                i12 = 3;
                            }
                        } else {
                            b bVar4 = this.f14678o;
                            bVar4.getClass();
                            if (this.nextParkedWorker == uVar) {
                                do {
                                    atomicLongFieldUpdater = b.f14679o;
                                    j10 = atomicLongFieldUpdater.get(bVar4);
                                    i10 = this.indexInArray;
                                    this.nextParkedWorker = bVar4.f14689n.b((int) (j10 & 2097151));
                                } while (!atomicLongFieldUpdater.compareAndSet(bVar4, j10, ((j10 + 2097152) & (-2097152)) | ((long) i10)));
                            }
                        }
                    } else {
                        if (z10) {
                            h(3);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f14675e);
                            this.f14675e = 0L;
                            break;
                        }
                        z10 = true;
                    }
                } else {
                    this.f14675e = 0L;
                    int i14 = hVarA.f14696b.f16473a;
                    this.f14674d = 0L;
                    if (this.f14673c == 3) {
                        this.f14673c = 2;
                    }
                    b bVar5 = this.f14678o;
                    if (i14 != 0 && h(2) && !bVar5.p() && !bVar5.g(b.f14680p.get(bVar5))) {
                        bVar5.p();
                    }
                    bVar5.getClass();
                    try {
                        hVarA.run();
                    } catch (Throwable th2) {
                        Thread threadCurrentThread = Thread.currentThread();
                        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th2);
                    }
                    if (i14 != 0) {
                        b.f14680p.addAndGet(bVar5, -2097152L);
                        if (this.f14673c == 5) {
                            break;
                        }
                        this.f14673c = 4;
                        break;
                    }
                    break;
                }
            }
        }
        h(5);
    }
}
