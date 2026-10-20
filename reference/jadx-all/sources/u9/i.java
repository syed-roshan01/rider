package u9;

import i3.u;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import l.q;
import m9.i2;
import q8.l;
import r9.t;

/* JADX INFO: loaded from: classes.dex */
public class i implements f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f15451c = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "head");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f15452d = AtomicLongFieldUpdater.newUpdater(i.class, "deqIdx");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f15453e = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "tail");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f15454f = AtomicLongFieldUpdater.newUpdater(i.class, "enqIdx");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f15455g = AtomicIntegerFieldUpdater.newUpdater(i.class, "_availablePermits");
    private volatile int _availablePermits;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h1.b f15457b;
    private volatile long deqIdx;
    private volatile long enqIdx;
    private volatile Object head;
    private volatile Object tail;

    public i(int i10, int i11) {
        this.f15456a = i10;
        if (i10 <= 0) {
            throw new IllegalArgumentException(q.g("Semaphore should have at least 1 permit, but had ", i10).toString());
        }
        if (i11 < 0 || i11 > i10) {
            throw new IllegalArgumentException(q.g("The number of acquired permits should be in 0..", i10).toString());
        }
        k kVar = new k(0L, null, 2);
        this.head = kVar;
        this.tail = kVar;
        this._availablePermits = i10 - i11;
        this.f15457b = new h1.b(this, 18);
    }

    public final boolean a(i2 i2Var) {
        Object objE;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15453e;
        k kVar = (k) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f15454f.getAndIncrement(this);
        g gVar = g.f15449p;
        long j10 = andIncrement / ((long) j.f15463f);
        loop0: while (true) {
            objE = r9.a.e(kVar, j10, gVar);
            if (!z6.a.P(objE)) {
                t tVarJ = z6.a.J(objE);
                while (true) {
                    t tVar = (t) atomicReferenceFieldUpdater.get(this);
                    if (tVar.f13728c >= tVarJ.f13728c) {
                        break loop0;
                    }
                    if (!tVarJ.i()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, tVar, tVarJ)) {
                            if (!tVar.e()) {
                                break loop0;
                            }
                            tVar.d();
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == tVar);
                    if (tVarJ.e()) {
                        tVarJ.d();
                    }
                }
            } else {
                break;
            }
        }
        k kVar2 = (k) z6.a.J(objE);
        int i10 = (int) (andIncrement % ((long) j.f15463f));
        AtomicReferenceArray atomicReferenceArray = kVar2.f15464e;
        while (!atomicReferenceArray.compareAndSet(i10, null, i2Var)) {
            if (atomicReferenceArray.get(i10) != null) {
                u uVar = j.f15459b;
                u uVar2 = j.f15460c;
                while (!atomicReferenceArray.compareAndSet(i10, uVar, uVar2)) {
                    if (atomicReferenceArray.get(i10) != uVar) {
                        return false;
                    }
                }
                ((m9.k) i2Var).o(this.f15457b, l.f13235a);
                return true;
            }
        }
        i2Var.a(kVar2, i10);
        return true;
    }

    public final void b() {
        int i10;
        Object objE;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f15455g;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i11 = this.f15456a;
            if (andIncrement >= i11) {
                do {
                    i10 = atomicIntegerFieldUpdater.get(this);
                    if (i10 <= i11) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, i11));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i11).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15451c;
            k kVar = (k) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f15452d.getAndIncrement(this);
            long j10 = andIncrement2 / ((long) j.f15463f);
            h hVar = h.f15450p;
            while (true) {
                objE = r9.a.e(kVar, j10, hVar);
                if (z6.a.P(objE)) {
                    break;
                }
                t tVarJ = z6.a.J(objE);
                while (true) {
                    t tVar = (t) atomicReferenceFieldUpdater.get(this);
                    if (tVar.f13728c >= tVarJ.f13728c) {
                        break;
                    }
                    if (!tVarJ.i()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, tVar, tVarJ)) {
                            if (!tVar.e()) {
                                break;
                            }
                            tVar.d();
                            break;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == tVar);
                    if (tVarJ.e()) {
                        tVarJ.d();
                    }
                }
            }
            k kVar2 = (k) z6.a.J(objE);
            kVar2.a();
            if (kVar2.f13728c <= j10) {
                int i12 = (int) (andIncrement2 % ((long) j.f15463f));
                u uVar = j.f15459b;
                AtomicReferenceArray atomicReferenceArray = kVar2.f15464e;
                Object andSet = atomicReferenceArray.getAndSet(i12, uVar);
                if (andSet == null) {
                    int i13 = j.f15458a;
                    boolean z10 = false;
                    for (int i14 = 0; i14 < i13; i14++) {
                        if (atomicReferenceArray.get(i12) == j.f15460c) {
                            return;
                        }
                    }
                    u uVar2 = j.f15459b;
                    u uVar3 = j.f15461d;
                    do {
                        if (atomicReferenceArray.compareAndSet(i12, uVar2, uVar3)) {
                            z10 = true;
                            break;
                        }
                    } while (atomicReferenceArray.get(i12) == uVar2);
                    if (!z10) {
                        return;
                    }
                } else if (andSet == j.f15462e) {
                    continue;
                } else {
                    if (!(andSet instanceof m9.k)) {
                        throw new IllegalStateException(("unexpected: " + andSet).toString());
                    }
                    m9.k kVar3 = (m9.k) andSet;
                    u uVarK = kVar3.k(l.f13235a, this.f15457b);
                    if (uVarK != null) {
                        kVar3.x(uVarK);
                        return;
                    }
                }
            }
        }
    }
}
