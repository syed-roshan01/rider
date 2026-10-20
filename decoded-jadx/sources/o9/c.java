package o9;

import androidx.fragment.app.a0;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m9.i2;

/* JADX INFO: loaded from: classes.dex */
public class c implements g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f12675c = AtomicLongFieldUpdater.newUpdater(c.class, "sendersAndCloseStatus");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f12676d = AtomicLongFieldUpdater.newUpdater(c.class, "receivers");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f12677e = AtomicLongFieldUpdater.newUpdater(c.class, "bufferEnd");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f12678f = AtomicLongFieldUpdater.newUpdater(c.class, "completedExpandBuffersAndPauseFlag");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f12679n = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "sendSegment");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f12680o = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "receiveSegment");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f12681p = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "bufferEndSegment");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f12682q = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_closeCause");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f12683r = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "closeHandler");
    private volatile Object _closeCause;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c9.c f12685b;
    private volatile long bufferEnd;
    private volatile Object bufferEndSegment;
    private volatile Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;
    private volatile Object receiveSegment;
    private volatile long receivers;
    private volatile Object sendSegment;
    private volatile long sendersAndCloseStatus;

    public c(int i10, c9.c cVar) {
        this.f12684a = i10;
        this.f12685b = cVar;
        if (i10 < 0) {
            throw new IllegalArgumentException(l.q.h("Invalid channel capacity: ", i10, ", should be >=0").toString());
        }
        k kVar = e.f12687a;
        this.bufferEnd = i10 != 0 ? i10 != Integer.MAX_VALUE ? i10 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag = f12677e.get(this);
        k kVar2 = new k(0L, null, this, 3);
        this.sendSegment = kVar2;
        this.receiveSegment = kVar2;
        if (y()) {
            kVar2 = e.f12687a;
            d7.a.k(kVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment = kVar2;
        this._closeCause = e.f12705s;
    }

    public static boolean D(Object obj) {
        if (obj instanceof m9.k) {
            d7.a.k(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return e.a((m9.k) obj, q8.l.f13235a, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    public static final k b(c cVar, long j10, k kVar) {
        Object objE;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j11;
        long j12;
        cVar.getClass();
        k kVar2 = e.f12687a;
        d dVar = d.f12686p;
        loop0: while (true) {
            objE = r9.a.e(kVar, j10, dVar);
            if (!z6.a.P(objE)) {
                r9.t tVarJ = z6.a.J(objE);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12679n;
                    r9.t tVar = (r9.t) atomicReferenceFieldUpdater.get(cVar);
                    if (tVar.f13728c >= tVarJ.f13728c) {
                        break loop0;
                    }
                    if (!tVarJ.i()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(cVar, tVar, tVarJ)) {
                            if (!tVar.e()) {
                                break loop0;
                            }
                            tVar.d();
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(cVar) == tVar);
                    if (tVarJ.e()) {
                        tVarJ.d();
                    }
                }
            } else {
                break;
            }
        }
        boolean zP = z6.a.P(objE);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f12676d;
        if (zP) {
            cVar.r();
            if (kVar.f13728c * ((long) e.f12688b) >= atomicLongFieldUpdater2.get(cVar)) {
                return null;
            }
            kVar.a();
            return null;
        }
        k kVar3 = (k) z6.a.J(objE);
        long j13 = kVar3.f13728c;
        if (j13 <= j10) {
            return kVar3;
        }
        long j14 = ((long) e.f12688b) * j13;
        do {
            atomicLongFieldUpdater = f12675c;
            j11 = atomicLongFieldUpdater.get(cVar);
            j12 = 1152921504606846975L & j11;
            if (j12 >= j14) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(cVar, j11, j12 + (((long) ((int) (j11 >> 60))) << 60)));
        if (j13 * ((long) e.f12688b) >= atomicLongFieldUpdater2.get(cVar)) {
            return null;
        }
        kVar3.a();
        return null;
    }

    public static final void d(c cVar, Object obj, m9.l lVar) throws IllegalAccessException, InvocationTargetException {
        a0 a0VarG;
        c9.c cVar2 = cVar.f12685b;
        if (cVar2 != null && (a0VarG = d7.a.g(cVar2, obj, null)) != null) {
            h6.g.n0(lVar.f11962e, a0VarG);
        }
        lVar.resumeWith(d7.t.N(cVar.t()));
    }

    public static final int e(c cVar, k kVar, int i10, Object obj, long j10, Object obj2, boolean z10) {
        cVar.getClass();
        kVar.m(i10, obj);
        if (z10) {
            return cVar.F(kVar, i10, obj, j10, obj2, z10);
        }
        Object objK = kVar.k(i10);
        if (objK == null) {
            if (cVar.f(j10)) {
                if (kVar.j(i10, null, e.f12690d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (kVar.j(i10, null, obj2)) {
                    return 2;
                }
            }
        } else if (objK instanceof i2) {
            kVar.m(i10, null);
            if (cVar.C(objK, obj)) {
                kVar.n(i10, e.f12695i);
                return 0;
            }
            i3.u uVar = e.f12697k;
            if (kVar.f12713f.getAndSet((i10 * 2) + 1, uVar) != uVar) {
                kVar.l(i10, true);
            }
            return 5;
        }
        return cVar.F(kVar, i10, obj, j10, obj2, z10);
    }

    public static void v(c cVar) {
        cVar.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater = f12678f;
        if ((atomicLongFieldUpdater.addAndGet(cVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(cVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public final Object A(Object obj, u8.e eVar) throws IllegalAccessException, InvocationTargetException {
        a0 a0VarG;
        m9.l lVar = new m9.l(1, d7.t.b0(eVar));
        lVar.t();
        c9.c cVar = this.f12685b;
        if (cVar == null || (a0VarG = d7.a.g(cVar, obj, null)) == null) {
            lVar.resumeWith(d7.t.N(t()));
        } else {
            d7.a.c(a0VarG, t());
            lVar.resumeWith(d7.t.N(a0VarG));
        }
        Object objS = lVar.s();
        return objS == v8.a.f15963a ? objS : q8.l.f13235a;
    }

    public final void B(i2 i2Var, boolean z10) throws IllegalAccessException, InvocationTargetException {
        if (i2Var instanceof m9.k) {
            ((u8.e) i2Var).resumeWith(d7.t.N(z10 ? s() : t()));
            return;
        }
        if (!(i2Var instanceof b)) {
            throw new IllegalStateException(("Unexpected waiter: " + i2Var).toString());
        }
        b bVar = (b) i2Var;
        m9.l lVar = bVar.f12673b;
        d7.a.j(lVar);
        bVar.f12673b = null;
        bVar.f12672a = e.f12698l;
        Throwable thQ = bVar.f12674c.q();
        if (thQ == null) {
            lVar.resumeWith(Boolean.FALSE);
        } else {
            lVar.resumeWith(d7.t.N(thQ));
        }
    }

    public final boolean C(Object obj, Object obj2) {
        if (!(obj instanceof b)) {
            if (!(obj instanceof m9.k)) {
                throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
            }
            d7.a.k(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            m9.k kVar = (m9.k) obj;
            c9.c cVar = this.f12685b;
            return e.a(kVar, obj2, cVar != null ? d7.a.f(cVar, obj2, kVar.getContext()) : null);
        }
        d7.a.k(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
        b bVar = (b) obj;
        m9.l lVar = bVar.f12673b;
        d7.a.j(lVar);
        bVar.f12673b = null;
        bVar.f12672a = obj2;
        Boolean bool = Boolean.TRUE;
        c9.c cVar2 = bVar.f12674c.f12685b;
        return e.a(lVar, bool, cVar2 != null ? d7.a.f(cVar2, obj2, lVar.f11962e) : null);
    }

    public final Object E(k kVar, int i10, long j10, Object obj) {
        Object objK = kVar.k(i10);
        AtomicReferenceArray atomicReferenceArray = kVar.f12713f;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f12675c;
        if (objK == null) {
            if (j10 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return e.f12700n;
                }
                if (kVar.j(i10, objK, obj)) {
                    o();
                    return e.f12699m;
                }
            }
        } else if (objK == e.f12690d && kVar.j(i10, objK, e.f12695i)) {
            o();
            Object obj2 = atomicReferenceArray.get(i10 * 2);
            kVar.m(i10, null);
            return obj2;
        }
        while (true) {
            Object objK2 = kVar.k(i10);
            if (objK2 == null || objK2 == e.f12691e) {
                if (j10 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (kVar.j(i10, objK2, e.f12694h)) {
                        o();
                        return e.f12701o;
                    }
                } else {
                    if (obj == null) {
                        return e.f12700n;
                    }
                    if (kVar.j(i10, objK2, obj)) {
                        o();
                        return e.f12699m;
                    }
                }
            } else {
                if (objK2 != e.f12690d) {
                    i3.u uVar = e.f12696j;
                    if (objK2 != uVar && objK2 != e.f12694h) {
                        if (objK2 == e.f12698l) {
                            o();
                            return e.f12701o;
                        }
                        if (objK2 != e.f12693g && kVar.j(i10, objK2, e.f12692f)) {
                            boolean z10 = objK2 instanceof u;
                            if (z10) {
                                objK2 = ((u) objK2).f12723a;
                            }
                            if (D(objK2)) {
                                kVar.n(i10, e.f12695i);
                                o();
                                Object obj3 = atomicReferenceArray.get(i10 * 2);
                                kVar.m(i10, null);
                                return obj3;
                            }
                            kVar.n(i10, uVar);
                            kVar.l(i10, false);
                            if (z10) {
                                o();
                            }
                            return e.f12701o;
                        }
                    }
                    return e.f12701o;
                }
                if (kVar.j(i10, objK2, e.f12695i)) {
                    o();
                    Object obj4 = atomicReferenceArray.get(i10 * 2);
                    kVar.m(i10, null);
                    return obj4;
                }
            }
        }
    }

    public final int F(k kVar, int i10, Object obj, long j10, Object obj2, boolean z10) {
        while (true) {
            Object objK = kVar.k(i10);
            if (objK == null) {
                if (!f(j10) || z10) {
                    if (z10) {
                        if (kVar.j(i10, null, e.f12696j)) {
                            kVar.l(i10, false);
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (kVar.j(i10, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (kVar.j(i10, null, e.f12690d)) {
                    return 1;
                }
            } else {
                if (objK != e.f12691e) {
                    i3.u uVar = e.f12697k;
                    if (objK == uVar) {
                        kVar.m(i10, null);
                        return 5;
                    }
                    if (objK == e.f12694h) {
                        kVar.m(i10, null);
                        return 5;
                    }
                    if (objK == e.f12698l) {
                        kVar.m(i10, null);
                        r();
                        return 4;
                    }
                    kVar.m(i10, null);
                    if (objK instanceof u) {
                        objK = ((u) objK).f12723a;
                    }
                    if (C(objK, obj)) {
                        kVar.n(i10, e.f12695i);
                        return 0;
                    }
                    if (kVar.f12713f.getAndSet((i10 * 2) + 1, uVar) != uVar) {
                        kVar.l(i10, true);
                    }
                    return 5;
                }
                if (kVar.j(i10, objK, e.f12690d)) {
                    return 1;
                }
            }
        }
    }

    public final void G(long j10) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j11;
        long j12;
        if (y()) {
            return;
        }
        do {
            atomicLongFieldUpdater = f12677e;
        } while (atomicLongFieldUpdater.get(this) <= j10);
        int i10 = e.f12689c;
        int i11 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f12678f;
            if (i11 >= i10) {
                do {
                    j11 = atomicLongFieldUpdater2.get(this);
                } while (!atomicLongFieldUpdater2.compareAndSet(this, j11, 4611686018427387904L + (j11 & 4611686018427387903L)));
                while (true) {
                    long j13 = atomicLongFieldUpdater.get(this);
                    long j14 = atomicLongFieldUpdater2.get(this);
                    long j15 = j14 & 4611686018427387903L;
                    boolean z10 = (j14 & 4611686018427387904L) != 0;
                    if (j13 == j15 && j13 == atomicLongFieldUpdater.get(this)) {
                        break;
                    } else if (!z10) {
                        atomicLongFieldUpdater2.compareAndSet(this, j14, j15 + 4611686018427387904L);
                    }
                }
                do {
                    j12 = atomicLongFieldUpdater2.get(this);
                } while (!atomicLongFieldUpdater2.compareAndSet(this, j12, j12 & 4611686018427387903L));
                return;
            }
            long j16 = atomicLongFieldUpdater.get(this);
            if (j16 == (atomicLongFieldUpdater2.get(this) & 4611686018427387903L) && j16 == atomicLongFieldUpdater.get(this)) {
                return;
            } else {
                i11++;
            }
        }
    }

    @Override // o9.s
    public final void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        g(cancellationException, true);
    }

    @Override // o9.t
    public final void c(h1.b bVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f12683r;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, bVar)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            i3.u uVar = e.f12703q;
            if (obj != uVar) {
                if (obj == e.f12704r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked".toString());
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
            i3.u uVar2 = e.f12704r;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, uVar, uVar2)) {
                    bVar.invoke(q());
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == uVar);
        }
    }

    public final boolean f(long j10) {
        return j10 < f12677e.get(this) || j10 < f12676d.get(this) + ((long) this.f12684a);
    }

    public final boolean g(Throwable th, boolean z10) {
        boolean z11;
        long j10;
        long j11;
        long j12;
        Object obj;
        long j13;
        long j14;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f12675c;
        if (z10) {
            do {
                j14 = atomicLongFieldUpdater.get(this);
                if (((int) (j14 >> 60)) != 0) {
                    break;
                }
                k kVar = e.f12687a;
            } while (!atomicLongFieldUpdater.compareAndSet(this, j14, (((long) 1) << 60) + (j14 & 1152921504606846975L)));
        }
        i3.u uVar = e.f12705s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12682q;
            if (atomicReferenceFieldUpdater.compareAndSet(this, uVar, th)) {
                z11 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != uVar) {
                z11 = false;
                break;
            }
        }
        if (z10) {
            do {
                j13 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(this, j13, (((long) 3) << 60) + (j13 & 1152921504606846975L)));
        } else {
            do {
                j10 = atomicLongFieldUpdater.get(this);
                int i10 = (int) (j10 >> 60);
                if (i10 == 0) {
                    j11 = j10 & 1152921504606846975L;
                    j12 = 2;
                } else {
                    if (i10 != 1) {
                        break;
                    }
                    j11 = j10 & 1152921504606846975L;
                    j12 = 3;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(this, j10, (j12 << 60) + j11));
        }
        r();
        if (z11) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f12683r;
                obj = atomicReferenceFieldUpdater2.get(this);
                i3.u uVar2 = obj == null ? e.f12703q : e.f12704r;
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, uVar2)) {
                        break loop3;
                    }
                } while (atomicReferenceFieldUpdater2.get(this) == obj);
            }
            if (obj != null) {
                z6.a.f(1, obj);
                ((c9.c) obj).invoke(q());
            }
        }
        return z11;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [m9.l] */
    @Override // o9.t
    public Object h(Object obj, u8.e eVar) throws Throwable {
        k kVar;
        Object objA;
        ?? r10;
        m9.l lVar;
        v8.a aVar;
        k kVar2;
        m9.l lVar2;
        Object obj2 = null;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12679n;
        k kVar3 = (k) atomicReferenceFieldUpdater.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f12675c;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j10 = andIncrement & 1152921504606846975L;
            boolean zW = w(andIncrement, false);
            int i10 = e.f12688b;
            long j11 = i10;
            long j12 = j10 / j11;
            int i11 = (int) (j10 % j11);
            long j13 = kVar3.f13728c;
            q8.l lVar3 = q8.l.f13235a;
            if (j13 != j12) {
                k kVarB = b(this, j12, kVar3);
                if (kVarB != null) {
                    kVar = kVarB;
                } else if (zW) {
                    objA = A(obj, eVar);
                    if (objA == v8.a.f15963a) {
                        break;
                    }
                    return lVar3;
                }
            } else {
                kVar = kVar3;
            }
            q8.l lVar4 = lVar3;
            k kVar4 = kVar;
            int iE = e(this, kVar, i11, obj, j10, obj2, zW);
            if (iE == 0) {
                kVar4.a();
                return lVar4;
            }
            if (iE != 1) {
                if (iE == 2) {
                    if (!zW) {
                        return lVar4;
                    }
                    kVar4.h();
                    objA = A(obj, eVar);
                    if (objA == v8.a.f15963a) {
                        break;
                    }
                    return lVar4;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f12676d;
                if (iE == 3) {
                    m9.l lVarW = d7.a.w(d7.t.b0(eVar));
                    k kVar5 = kVar4;
                    try {
                        int iE2 = e(this, kVar5, i11, obj, j10, lVarW, false);
                        try {
                            if (iE2 != 0) {
                                if (iE2 == 1) {
                                    lVar = lVarW;
                                    lVar4 = lVar4;
                                    lVar.resumeWith(lVar4);
                                } else if (iE2 == 2) {
                                    lVar = lVarW;
                                    lVar4 = lVar4;
                                    lVar.a(kVar4, i11 + i10);
                                } else {
                                    if (iE2 != 4) {
                                        if (iE2 != 5) {
                                            throw new IllegalStateException("unexpected".toString());
                                        }
                                        kVar4.a();
                                        k kVar6 = (k) atomicReferenceFieldUpdater.get(this);
                                        while (true) {
                                            long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                            long j14 = andIncrement2 & 1152921504606846975L;
                                            boolean zW2 = w(andIncrement2, false);
                                            int i12 = e.f12688b;
                                            long j15 = i12;
                                            long j16 = j14 / j15;
                                            int i13 = (int) (j14 % j15);
                                            if (kVar6.f13728c != j16) {
                                                try {
                                                    k kVarB2 = b(this, j16, kVar6);
                                                    if (kVarB2 != null) {
                                                        kVar2 = kVarB2;
                                                    } else if (zW2) {
                                                        lVar2 = lVarW;
                                                        try {
                                                            d(this, obj, lVar2);
                                                            lVar = lVar2;
                                                            lVar4 = lVar4;
                                                        } catch (Throwable th) {
                                                            th = th;
                                                            r10 = lVar2;
                                                            r10.C();
                                                            throw th;
                                                        }
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    lVar2 = lVarW;
                                                }
                                            } else {
                                                kVar2 = kVar6;
                                            }
                                            lVarW = lVarW;
                                            k kVar7 = kVar2;
                                            int iE3 = e(this, kVar2, i13, obj, j14, lVarW, zW2);
                                            if (iE3 == 0) {
                                                lVar = lVarW;
                                                kVar7.a();
                                            } else if (iE3 != 1) {
                                                if (iE3 == 2) {
                                                    lVar = lVarW;
                                                    if (zW2) {
                                                        kVar7.h();
                                                    } else {
                                                        lVar.a(kVar7, i13 + i12);
                                                    }
                                                    lVar4 = lVar4;
                                                } else {
                                                    if (iE3 == 3) {
                                                        throw new IllegalStateException("unexpected".toString());
                                                    }
                                                    if (iE3 != 4) {
                                                        if (iE3 == 5) {
                                                            kVar7.a();
                                                        }
                                                        kVar6 = kVar7;
                                                    } else {
                                                        if (j14 < atomicLongFieldUpdater2.get(this)) {
                                                            kVar7.a();
                                                        }
                                                        lVar = lVarW;
                                                    }
                                                }
                                                d(this, obj, lVar);
                                                lVar4 = lVar4;
                                            } else {
                                                lVar = lVarW;
                                                lVar4 = lVar4;
                                                lVar.resumeWith(lVar4);
                                            }
                                        }
                                        r10.C();
                                        throw th;
                                    }
                                    lVar = lVarW;
                                    lVar4 = lVar4;
                                    if (j10 < atomicLongFieldUpdater2.get(this)) {
                                        kVar4.a();
                                    }
                                    d(this, obj, lVar);
                                }
                                objA = lVar.s();
                                aVar = v8.a.f15963a;
                                if (objA != aVar) {
                                    objA = lVar4;
                                }
                                if (objA != aVar) {
                                    break;
                                }
                                return lVar4;
                            }
                            lVar = lVarW;
                            kVar4.a();
                            lVar.resumeWith(lVar4);
                            objA = lVar.s();
                            aVar = v8.a.f15963a;
                            if (objA != aVar) {
                                objA = lVar4;
                            }
                            if (objA != aVar) {
                                break;
                            }
                            return lVar4;
                        } catch (Throwable th3) {
                            th = th3;
                            r10 = kVar5;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        r10 = lVarW;
                    }
                } else if (iE != 4) {
                    if (iE == 5) {
                        kVar4.a();
                    }
                    kVar3 = kVar4;
                    obj2 = null;
                } else {
                    if (j10 < atomicLongFieldUpdater2.get(this)) {
                        kVar4.a();
                    }
                    Object objA2 = A(obj, eVar);
                    if (objA2 == v8.a.f15963a) {
                        return objA2;
                    }
                }
            }
            return lVar4;
        }
        return objA;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00e3 A[Catch: all -> 0x008f, TryCatch #1 {all -> 0x008f, blocks: (B:26:0x0076, B:30:0x0083, B:32:0x008b, B:35:0x0092, B:36:0x0098, B:38:0x00a3, B:39:0x00b0, B:41:0x00c4, B:45:0x00ce, B:47:0x00df, B:48:0x00e3, B:50:0x00e7, B:52:0x00ef, B:54:0x00f5, B:56:0x00f9, B:58:0x00fe, B:60:0x0104, B:61:0x0108, B:62:0x0111, B:63:0x0112, B:65:0x0119), top: B:81:0x0072 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00e7 A[Catch: all -> 0x008f, TryCatch #1 {all -> 0x008f, blocks: (B:26:0x0076, B:30:0x0083, B:32:0x008b, B:35:0x0092, B:36:0x0098, B:38:0x00a3, B:39:0x00b0, B:41:0x00c4, B:45:0x00ce, B:47:0x00df, B:48:0x00e3, B:50:0x00e7, B:52:0x00ef, B:54:0x00f5, B:56:0x00f9, B:58:0x00fe, B:60:0x0104, B:61:0x0108, B:62:0x0111, B:63:0x0112, B:65:0x0119), top: B:81:0x0072 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00ef A[Catch: all -> 0x008f, TryCatch #1 {all -> 0x008f, blocks: (B:26:0x0076, B:30:0x0083, B:32:0x008b, B:35:0x0092, B:36:0x0098, B:38:0x00a3, B:39:0x00b0, B:41:0x00c4, B:45:0x00ce, B:47:0x00df, B:48:0x00e3, B:50:0x00e7, B:52:0x00ef, B:54:0x00f5, B:56:0x00f9, B:58:0x00fe, B:60:0x0104, B:61:0x0108, B:62:0x0111, B:63:0x0112, B:65:0x0119), top: B:81:0x0072 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00f9 A[Catch: all -> 0x008f, TryCatch #1 {all -> 0x008f, blocks: (B:26:0x0076, B:30:0x0083, B:32:0x008b, B:35:0x0092, B:36:0x0098, B:38:0x00a3, B:39:0x00b0, B:41:0x00c4, B:45:0x00ce, B:47:0x00df, B:48:0x00e3, B:50:0x00e7, B:52:0x00ef, B:54:0x00f5, B:56:0x00f9, B:58:0x00fe, B:60:0x0104, B:61:0x0108, B:62:0x0111, B:63:0x0112, B:65:0x0119), top: B:81:0x0072 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00fe A[Catch: all -> 0x008f, TryCatch #1 {all -> 0x008f, blocks: (B:26:0x0076, B:30:0x0083, B:32:0x008b, B:35:0x0092, B:36:0x0098, B:38:0x00a3, B:39:0x00b0, B:41:0x00c4, B:45:0x00ce, B:47:0x00df, B:48:0x00e3, B:50:0x00e7, B:52:0x00ef, B:54:0x00f5, B:56:0x00f9, B:58:0x00fe, B:60:0x0104, B:61:0x0108, B:62:0x0111, B:63:0x0112, B:65:0x0119), top: B:81:0x0072 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0103  */
    /* JADX WARN: Code duplicated, block: B:61:0x0108 A[Catch: all -> 0x008f, TryCatch #1 {all -> 0x008f, blocks: (B:26:0x0076, B:30:0x0083, B:32:0x008b, B:35:0x0092, B:36:0x0098, B:38:0x00a3, B:39:0x00b0, B:41:0x00c4, B:45:0x00ce, B:47:0x00df, B:48:0x00e3, B:50:0x00e7, B:52:0x00ef, B:54:0x00f5, B:56:0x00f9, B:58:0x00fe, B:60:0x0104, B:61:0x0108, B:62:0x0111, B:63:0x0112, B:65:0x0119), top: B:81:0x0072 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x00df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x00f5 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [m9.l] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r18v0, types: [java.lang.Object, o9.c] */
    @Override // o9.s
    public final Object i(w8.i iVar) throws Throwable {
        k kVar;
        ?? r10;
        m9.l lVar;
        b.g gVarF;
        u8.j jVar;
        c9.c cVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12680o;
        k kVar2 = (k) atomicReferenceFieldUpdater.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f12675c;
            if (w(atomicLongFieldUpdater.get(this), true)) {
                Throwable thS = s();
                int i10 = r9.u.f13729a;
                throw thS;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f12676d;
            long andIncrement = atomicLongFieldUpdater2.getAndIncrement(this);
            long j10 = e.f12688b;
            long j11 = andIncrement / j10;
            int i11 = (int) (andIncrement % j10);
            if (kVar2.f13728c != j11) {
                k kVarP = p(j11, kVar2);
                if (kVarP == null) {
                    continue;
                } else {
                    kVar = kVarP;
                }
            } else {
                kVar = kVar2;
            }
            Object objE = E(kVar, i11, andIncrement, null);
            i3.u uVar = e.f12699m;
            if (objE == uVar) {
                throw new IllegalStateException("unexpected".toString());
            }
            i3.u uVar2 = e.f12701o;
            if (objE == uVar2) {
                if (andIncrement < u()) {
                    kVar.a();
                }
                kVar2 = kVar;
            } else {
                if (objE != e.f12700n) {
                    kVar.a();
                    return objE;
                }
                m9.l lVarW = d7.a.w(d7.t.b0(iVar));
                i3.u uVar3 = uVar;
                try {
                    Object objE2 = E(kVar, i11, andIncrement, lVarW);
                    try {
                        if (objE2 != uVar3) {
                            lVar = lVarW;
                            c9.c cVar2 = this.f12685b;
                            u8.j jVar2 = lVar.f11962e;
                            if (objE2 == uVar2) {
                                if (andIncrement < u()) {
                                    kVar.a();
                                }
                                k kVar3 = (k) atomicReferenceFieldUpdater.get(this);
                                while (true) {
                                    if (w(atomicLongFieldUpdater.get(this), true)) {
                                        lVar.resumeWith(d7.t.N(s()));
                                        break;
                                    }
                                    long andIncrement2 = atomicLongFieldUpdater2.getAndIncrement(this);
                                    long j12 = e.f12688b;
                                    AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater;
                                    long j13 = andIncrement2 / j12;
                                    int i12 = (int) (andIncrement2 % j12);
                                    if (kVar3.f13728c == j13) {
                                        jVar = jVar2;
                                        cVar = cVar2;
                                        objE2 = E(kVar3, i12, andIncrement2, lVar);
                                        if (objE2 == e.f12699m) {
                                            lVar.a(kVar3, i12);
                                            break;
                                        }
                                        if (objE2 == e.f12701o) {
                                            if (andIncrement2 < u()) {
                                                kVar3.a();
                                            }
                                            jVar2 = jVar;
                                            cVar2 = cVar;
                                            atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                        } else {
                                            if (objE2 != e.f12700n) {
                                                throw new IllegalStateException("unexpected".toString());
                                            }
                                            kVar3.a();
                                            if (cVar != null) {
                                                gVarF = d7.a.f(cVar, objE2, jVar);
                                            } else {
                                                gVarF = null;
                                            }
                                        }
                                    } else {
                                        k kVarP2 = p(j13, kVar3);
                                        if (kVarP2 == null) {
                                            continue;
                                        } else {
                                            kVar3 = kVarP2;
                                            jVar = jVar2;
                                            cVar = cVar2;
                                            objE2 = E(kVar3, i12, andIncrement2, lVar);
                                            if (objE2 == e.f12699m) {
                                                lVar.a(kVar3, i12);
                                                break;
                                            }
                                            if (objE2 == e.f12701o) {
                                                if (andIncrement2 < u()) {
                                                    kVar3.a();
                                                }
                                                jVar2 = jVar;
                                                cVar2 = cVar;
                                            } else {
                                                if (objE2 != e.f12700n) {
                                                    throw new IllegalStateException("unexpected".toString());
                                                }
                                                kVar3.a();
                                                if (cVar != null) {
                                                    gVarF = d7.a.f(cVar, objE2, jVar);
                                                } else {
                                                    gVarF = null;
                                                }
                                            }
                                        }
                                        atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                    }
                                }
                            } else {
                                kVar.a();
                                gVarF = cVar2 != null ? d7.a.f(cVar2, objE2, jVar2) : null;
                            }
                            lVar.o(gVarF, objE2);
                            break;
                        }
                        lVar = lVarW;
                        lVar.a(kVar, i11);
                        Object objS = lVar.s();
                        v8.a aVar = v8.a.f15963a;
                        return objS;
                    } catch (Throwable th) {
                        th = th;
                        r10 = uVar3;
                        r10.C();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    r10 = lVarW;
                }
            }
        }
    }

    @Override // o9.s
    public final b iterator() {
        return new b(this);
    }

    @Override // o9.t
    public final boolean j(Throwable th) {
        return g(th, false);
    }

    public final k k(long j10) throws IllegalAccessException, InvocationTargetException {
        Object objZ;
        long j11;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj = f12681p.get(this);
        k kVar = (k) f12679n.get(this);
        if (kVar.f13728c > ((k) obj).f13728c) {
            obj = kVar;
        }
        k kVar2 = (k) f12680o.get(this);
        if (kVar2.f13728c > ((k) obj).f13728c) {
            obj = kVar2;
        }
        r9.d dVar = (r9.d) obj;
        loop0: while (true) {
            dVar.getClass();
            Object obj2 = r9.d.f13696a.get(dVar);
            i3.u uVar = r9.a.f13689b;
            objZ = null;
            if (obj2 == uVar) {
                break;
            }
            r9.d dVar2 = (r9.d) obj2;
            if (dVar2 == null) {
                do {
                    atomicReferenceFieldUpdater = r9.d.f13696a;
                    if (atomicReferenceFieldUpdater.compareAndSet(dVar, null, uVar)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(dVar) == null);
            } else {
                dVar = dVar2;
            }
        }
        k kVar3 = (k) dVar;
        if (x()) {
            k kVar4 = kVar3;
            loop2: while (true) {
                int i10 = e.f12688b - 1;
                while (true) {
                    if (-1 < i10) {
                        j11 = (kVar4.f13728c * ((long) e.f12688b)) + ((long) i10);
                        if (j11 >= f12676d.get(this)) {
                            while (true) {
                                Object objK = kVar4.k(i10);
                                if (objK != null && objK != e.f12691e) {
                                    if (objK != e.f12690d) {
                                        break;
                                    }
                                    break loop2;
                                }
                                if (kVar4.j(i10, objK, e.f12698l)) {
                                    kVar4.h();
                                    break;
                                }
                            }
                            i10--;
                        }
                    } else {
                        kVar4 = (k) ((r9.d) r9.d.f13697b.get(kVar4));
                        if (kVar4 == null) {
                        }
                    }
                    j11 = -1;
                    break;
                }
            }
            if (j11 != -1) {
                l(j11);
            }
        }
        loop5: for (k kVar5 = kVar3; kVar5 != null; kVar5 = (k) ((r9.d) r9.d.f13697b.get(kVar5))) {
            for (int i11 = e.f12688b - 1; -1 < i11; i11--) {
                if ((kVar5.f13728c * ((long) e.f12688b)) + ((long) i11) < j10) {
                    break loop5;
                }
                while (true) {
                    Object objK2 = kVar5.k(i11);
                    if (objK2 != null && objK2 != e.f12691e) {
                        if (!(objK2 instanceof u)) {
                            if (!(objK2 instanceof i2)) {
                                break;
                            }
                            if (kVar5.j(i11, objK2, e.f12698l)) {
                                objZ = z6.a.Z(objZ, objK2);
                                kVar5.l(i11, true);
                                break;
                            }
                        } else {
                            if (kVar5.j(i11, objK2, e.f12698l)) {
                                objZ = z6.a.Z(objZ, ((u) objK2).f12723a);
                                kVar5.l(i11, true);
                                break;
                            }
                        }
                    } else {
                        if (kVar5.j(i11, objK2, e.f12698l)) {
                            kVar5.h();
                            break;
                        }
                    }
                }
            }
        }
        if (objZ != null) {
            if (objZ instanceof ArrayList) {
                ArrayList arrayList = (ArrayList) objZ;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    B((i2) arrayList.get(size), true);
                }
            } else {
                B((i2) objZ, true);
            }
        }
        return kVar3;
    }

    public final void l(long j10) {
        a0 a0VarG;
        k kVar = (k) f12680o.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f12676d;
            long j11 = atomicLongFieldUpdater.get(this);
            if (j10 < Math.max(((long) this.f12684a) + j11, f12677e.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j11, j11 + 1)) {
                long j12 = e.f12688b;
                long j13 = j11 / j12;
                int i10 = (int) (j11 % j12);
                if (kVar.f13728c != j13) {
                    k kVarP = p(j13, kVar);
                    if (kVarP == null) {
                        continue;
                    } else {
                        kVar = kVarP;
                    }
                }
                Object objE = E(kVar, i10, j11, null);
                if (objE != e.f12701o) {
                    kVar.a();
                    c9.c cVar = this.f12685b;
                    if (cVar != null && (a0VarG = d7.a.g(cVar, objE, null)) != null) {
                        throw a0VarG;
                    }
                } else if (j11 < u()) {
                    kVar.a();
                }
            }
        }
    }

    @Override // o9.s
    public final Object m() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f12676d;
        long j10 = atomicLongFieldUpdater.get(this);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f12675c;
        long j11 = atomicLongFieldUpdater2.get(this);
        if (w(j11, true)) {
            return new h(q());
        }
        long j12 = j11 & 1152921504606846975L;
        Object obj = j.f12710b;
        if (j10 >= j12) {
            return obj;
        }
        Object obj2 = e.f12697k;
        k kVar = (k) f12680o.get(this);
        while (!w(atomicLongFieldUpdater2.get(this), true)) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j13 = e.f12688b;
            long j14 = andIncrement / j13;
            int i10 = (int) (andIncrement % j13);
            if (kVar.f13728c != j14) {
                k kVarP = p(j14, kVar);
                if (kVarP == null) {
                    continue;
                } else {
                    kVar = kVarP;
                }
            }
            Object objE = E(kVar, i10, andIncrement, obj2);
            if (objE == e.f12699m) {
                i2 i2Var = obj2 instanceof i2 ? (i2) obj2 : null;
                if (i2Var != null) {
                    i2Var.a(kVar, i10);
                }
                G(andIncrement);
                kVar.h();
            } else if (objE == e.f12701o) {
                if (andIncrement < u()) {
                    kVar.a();
                }
            } else {
                if (objE == e.f12700n) {
                    throw new IllegalStateException("unexpected".toString());
                }
                kVar.a();
                obj = objE;
            }
            return obj;
        }
        return new h(q());
    }

    @Override // o9.t
    public Object n(Object obj) throws IllegalAccessException, InvocationTargetException {
        k kVar;
        k kVar2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f12675c;
        long j10 = atomicLongFieldUpdater.get(this);
        boolean zW = w(j10, false);
        i iVar = j.f12710b;
        if (!zW && (!f(j10 & 1152921504606846975L))) {
            return iVar;
        }
        Object obj2 = e.f12696j;
        k kVar3 = (k) f12679n.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j11 = andIncrement & 1152921504606846975L;
            boolean zW2 = w(andIncrement, false);
            int i10 = e.f12688b;
            long j12 = i10;
            long j13 = j11 / j12;
            int i11 = (int) (j11 % j12);
            if (kVar3.f13728c != j13) {
                k kVarB = b(this, j13, kVar3);
                if (kVarB != null) {
                    kVar = kVarB;
                } else if (zW2) {
                    return new h(t());
                }
            } else {
                kVar = kVar3;
            }
            k kVar4 = kVar;
            int iE = e(this, kVar, i11, obj, j11, obj2, zW2);
            q8.l lVar = q8.l.f13235a;
            if (iE == 0) {
                kVar4.a();
            } else if (iE != 1) {
                if (iE == 2) {
                    if (zW2) {
                        kVar4.h();
                        return new h(t());
                    }
                    i2 i2Var = obj2 instanceof i2 ? (i2) obj2 : null;
                    if (i2Var != null) {
                        kVar2 = kVar4;
                        i2Var.a(kVar2, i11 + i10);
                    } else {
                        kVar2 = kVar4;
                    }
                    kVar2.h();
                    return iVar;
                }
                if (iE == 3) {
                    throw new IllegalStateException("unexpected".toString());
                }
                if (iE == 4) {
                    if (j11 < f12676d.get(this)) {
                        kVar4.a();
                    }
                    return new h(t());
                }
                if (iE == 5) {
                    kVar4.a();
                }
                kVar3 = kVar4;
            }
            return lVar;
        }
    }

    public final void o() {
        Object objE;
        if (y()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12681p;
        k kVar = (k) atomicReferenceFieldUpdater.get(this);
        while (true) {
            long andIncrement = f12677e.getAndIncrement(this);
            long j10 = andIncrement / ((long) e.f12688b);
            if (u() <= andIncrement) {
                if (kVar.f13728c < j10 && kVar.b() != null) {
                    z(j10, kVar);
                }
                v(this);
                return;
            }
            if (kVar.f13728c != j10) {
                d dVar = d.f12686p;
                while (true) {
                    objE = r9.a.e(kVar, j10, dVar);
                    if (!z6.a.P(objE)) {
                        r9.t tVarJ = z6.a.J(objE);
                        while (true) {
                            r9.t tVar = (r9.t) atomicReferenceFieldUpdater.get(this);
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
                    } else {
                        break;
                    }
                }
                k kVar2 = null;
                if (z6.a.P(objE)) {
                    r();
                    z(j10, kVar);
                    v(this);
                } else {
                    k kVar3 = (k) z6.a.J(objE);
                    long j11 = kVar3.f13728c;
                    if (j11 > j10) {
                        long j12 = j11 * ((long) e.f12688b);
                        if (f12677e.compareAndSet(this, andIncrement + 1, j12)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f12678f;
                            if ((atomicLongFieldUpdater.addAndGet(this, j12 - andIncrement) & 4611686018427387904L) != 0) {
                                while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
                                }
                            }
                        } else {
                            v(this);
                        }
                    } else {
                        kVar2 = kVar3;
                    }
                }
                if (kVar2 == null) {
                    continue;
                } else {
                    kVar = kVar2;
                }
            }
            int i10 = (int) (andIncrement % ((long) e.f12688b));
            Object objK = kVar.k(i10);
            boolean z10 = objK instanceof i2;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f12676d;
            if (!z10 || andIncrement < atomicLongFieldUpdater2.get(this) || !kVar.j(i10, objK, e.f12693g)) {
                while (true) {
                    Object objK2 = kVar.k(i10);
                    if (objK2 instanceof i2) {
                        if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                            if (kVar.j(i10, objK2, new u((i2) objK2))) {
                                v(this);
                                return;
                            }
                        } else if (kVar.j(i10, objK2, e.f12693g)) {
                            if (!D(objK2)) {
                                kVar.n(i10, e.f12696j);
                                kVar.l(i10, false);
                                break;
                            } else {
                                kVar.n(i10, e.f12690d);
                                v(this);
                                return;
                            }
                        }
                    } else {
                        if (objK2 == e.f12696j) {
                            break;
                        }
                        if (objK2 == null) {
                            if (kVar.j(i10, objK2, e.f12691e)) {
                                v(this);
                                return;
                            }
                        } else if (objK2 == e.f12690d || objK2 == e.f12694h || objK2 == e.f12695i || objK2 == e.f12697k || objK2 == e.f12698l) {
                            v(this);
                            return;
                        } else if (objK2 != e.f12692f) {
                            throw new IllegalStateException(("Unexpected cell state: " + objK2).toString());
                        }
                    }
                }
                v(this);
            } else if (D(objK)) {
                kVar.n(i10, e.f12690d);
                v(this);
                return;
            } else {
                kVar.n(i10, e.f12696j);
                kVar.l(i10, false);
                v(this);
            }
        }
    }

    public final k p(long j10, k kVar) {
        Object objE;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j11;
        k kVar2 = e.f12687a;
        d dVar = d.f12686p;
        loop0: while (true) {
            objE = r9.a.e(kVar, j10, dVar);
            if (!z6.a.P(objE)) {
                r9.t tVarJ = z6.a.J(objE);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12680o;
                    r9.t tVar = (r9.t) atomicReferenceFieldUpdater.get(this);
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
        if (z6.a.P(objE)) {
            r();
            if (kVar.f13728c * ((long) e.f12688b) >= u()) {
                return null;
            }
            kVar.a();
            return null;
        }
        k kVar3 = (k) z6.a.J(objE);
        boolean zY = y();
        long j12 = kVar3.f13728c;
        if (!zY && j10 <= f12677e.get(this) / ((long) e.f12688b)) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f12681p;
                r9.t tVar2 = (r9.t) atomicReferenceFieldUpdater2.get(this);
                if (tVar2.f13728c >= j12 || !kVar3.i()) {
                    break;
                }
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, tVar2, kVar3)) {
                        if (!tVar2.e()) {
                            break loop3;
                        }
                        tVar2.d();
                        break loop3;
                    }
                } while (atomicReferenceFieldUpdater2.get(this) == tVar2);
                if (kVar3.e()) {
                    kVar3.d();
                }
            }
        }
        if (j12 <= j10) {
            return kVar3;
        }
        long j13 = ((long) e.f12688b) * j12;
        do {
            atomicLongFieldUpdater = f12676d;
            j11 = atomicLongFieldUpdater.get(this);
            if (j11 >= j13) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j11, j13));
        if (j12 * ((long) e.f12688b) >= u()) {
            return null;
        }
        kVar3.a();
        return null;
    }

    public final Throwable q() {
        return (Throwable) f12682q.get(this);
    }

    @Override // o9.t
    public final boolean r() {
        return w(f12675c.get(this), false);
    }

    public final Throwable s() {
        Throwable thQ = q();
        return thQ == null ? new m("Channel was closed") : thQ;
    }

    public final Throwable t() {
        Throwable thQ = q();
        return thQ == null ? new n("Channel was closed") : thQ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String string;
        StringBuilder sb = new StringBuilder();
        int i10 = (int) (f12675c.get(this) >> 60);
        if (i10 == 2) {
            sb.append("closed,");
        } else if (i10 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.f12684a + ',');
        sb.append("data=[");
        int i11 = 0;
        List listE0 = d7.t.e0(f12680o.get(this), f12679n.get(this), f12681p.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listE0) {
            if (((k) obj) != e.f12687a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j10 = ((k) next).f13728c;
            do {
                Object next2 = it.next();
                long j11 = ((k) next2).f13728c;
                if (j10 > j11) {
                    next = next2;
                    j10 = j11;
                }
            } while (it.hasNext());
        }
        k kVar = (k) next;
        long j12 = f12676d.get(this);
        long jU = u();
        loop2: while (true) {
            int i12 = e.f12688b;
            for (int i13 = i11; i13 < i12; i13++) {
                long j13 = (kVar.f13728c * ((long) e.f12688b)) + ((long) i13);
                if (j13 >= jU && j13 >= j12) {
                    break loop2;
                }
                Object objK = kVar.k(i13);
                Object obj2 = kVar.f12713f.get(i13 * 2);
                if (objK instanceof m9.k) {
                    string = (j13 >= j12 || j13 < jU) ? (j13 >= jU || j13 < j12) ? "cont" : "send" : "receive";
                } else if (objK instanceof u) {
                    string = "EB(" + objK + ')';
                } else if (d7.a.d(objK, e.f12692f) || d7.a.d(objK, e.f12693g)) {
                    string = "resuming_sender";
                } else {
                    if (objK != null && !d7.a.d(objK, e.f12691e) && !d7.a.d(objK, e.f12695i) && !d7.a.d(objK, e.f12694h) && !d7.a.d(objK, e.f12697k) && !d7.a.d(objK, e.f12696j) && !d7.a.d(objK, e.f12698l)) {
                        string = objK.toString();
                    }
                }
                if (obj2 != null) {
                    sb.append("(" + string + ',' + obj2 + "),");
                } else {
                    sb.append(string + ',');
                }
            }
            kVar = (k) kVar.b();
            if (kVar == null) {
                break;
            }
            i11 = 0;
        }
        if (sb.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (sb.charAt(l9.i.L0(sb)) == ',') {
            d7.a.l(sb.deleteCharAt(sb.length() - 1), "this.deleteCharAt(index)");
        }
        sb.append("]");
        return sb.toString();
    }

    public final long u() {
        return f12675c.get(this) & 1152921504606846975L;
    }

    public final boolean w(long j10, boolean z10) throws IllegalAccessException, InvocationTargetException {
        int i10 = (int) (j10 >> 60);
        if (i10 == 0 || i10 == 1) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f12676d;
        if (i10 == 2) {
            k(j10 & 1152921504606846975L);
            if (z10) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12680o;
                    k kVarP = (k) atomicReferenceFieldUpdater.get(this);
                    long j11 = atomicLongFieldUpdater.get(this);
                    if (u() <= j11) {
                        break;
                    }
                    long j12 = e.f12688b;
                    long j13 = j11 / j12;
                    if (kVarP.f13728c != j13 && (kVarP = p(j13, kVarP)) == null) {
                        if (((k) atomicReferenceFieldUpdater.get(this)).f13728c < j13) {
                            break;
                        }
                    } else {
                        kVarP.a();
                        int i11 = (int) (j11 % j12);
                        while (true) {
                            Object objK = kVarP.k(i11);
                            if (objK != null && objK != e.f12691e) {
                                if (objK != e.f12690d) {
                                    if (objK != e.f12696j && objK != e.f12698l && objK != e.f12695i && objK != e.f12694h) {
                                        if (objK != e.f12693g) {
                                            if (objK == e.f12692f || j11 != atomicLongFieldUpdater.get(this)) {
                                                break;
                                                break;
                                            }
                                            return false;
                                        }
                                        return false;
                                    }
                                    break;
                                    break;
                                    break;
                                    break;
                                }
                                return false;
                            }
                            if (kVarP.j(i11, objK, e.f12694h)) {
                                o();
                                break;
                            }
                        }
                        f12676d.compareAndSet(this, j11, 1 + j11);
                    }
                }
            }
        } else {
            if (i10 != 3) {
                throw new IllegalStateException(l.q.g("unexpected close status: ", i10).toString());
            }
            k kVarK = k(j10 & 1152921504606846975L);
            a0 a0VarG = null;
            Object objZ = null;
            loop0: do {
                for (int i12 = e.f12688b - 1; -1 < i12; i12--) {
                    long j14 = (kVarK.f13728c * ((long) e.f12688b)) + ((long) i12);
                    while (true) {
                        Object objK2 = kVarK.k(i12);
                        if (objK2 == e.f12695i) {
                            break loop0;
                        }
                        i3.u uVar = e.f12690d;
                        AtomicReferenceArray atomicReferenceArray = kVarK.f12713f;
                        c9.c cVar = this.f12685b;
                        if (objK2 != uVar) {
                            if (objK2 != e.f12691e && objK2 != null) {
                                if (!(objK2 instanceof i2) && !(objK2 instanceof u)) {
                                    i3.u uVar2 = e.f12693g;
                                    if (objK2 == uVar2 || objK2 == e.f12692f) {
                                        break loop0;
                                    }
                                    if (objK2 != uVar2) {
                                        break;
                                    }
                                } else {
                                    if (j14 < atomicLongFieldUpdater.get(this)) {
                                        break loop0;
                                    }
                                    i2 i2Var = objK2 instanceof u ? ((u) objK2).f12723a : (i2) objK2;
                                    if (kVarK.j(i12, objK2, e.f12698l)) {
                                        if (cVar != null) {
                                            a0VarG = d7.a.g(cVar, atomicReferenceArray.get(i12 * 2), a0VarG);
                                        }
                                        objZ = z6.a.Z(objZ, i2Var);
                                        kVarK.m(i12, null);
                                        kVarK.h();
                                        break;
                                    }
                                }
                            } else if (kVarK.j(i12, objK2, e.f12698l)) {
                                kVarK.h();
                                break;
                            }
                        } else {
                            if (j14 < atomicLongFieldUpdater.get(this)) {
                                break loop0;
                            }
                            if (kVarK.j(i12, objK2, e.f12698l)) {
                                if (cVar != null) {
                                    a0VarG = d7.a.g(cVar, atomicReferenceArray.get(i12 * 2), a0VarG);
                                }
                                kVarK.m(i12, null);
                                kVarK.h();
                                break;
                            }
                        }
                    }
                }
                kVarK = (k) ((r9.d) r9.d.f13697b.get(kVarK));
            } while (kVarK != null);
            if (objZ != null) {
                if (objZ instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) objZ;
                    for (int size = arrayList.size() - 1; -1 < size; size--) {
                        B((i2) arrayList.get(size), false);
                    }
                } else {
                    B((i2) objZ, false);
                }
            }
            if (a0VarG != null) {
                throw a0VarG;
            }
        }
        return true;
    }

    public boolean x() {
        return false;
    }

    public final boolean y() {
        long j10 = f12677e.get(this);
        return j10 == 0 || j10 == Long.MAX_VALUE;
    }

    public final void z(long j10, k kVar) {
        k kVar2;
        k kVar3;
        while (kVar.f13728c < j10 && (kVar3 = (k) kVar.b()) != null) {
            kVar = kVar3;
        }
        while (true) {
            if (!kVar.c() || (kVar2 = (k) kVar.b()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12681p;
                    r9.t tVar = (r9.t) atomicReferenceFieldUpdater.get(this);
                    if (tVar.f13728c >= kVar.f13728c) {
                        return;
                    }
                    if (!kVar.i()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, tVar, kVar)) {
                            if (tVar.e()) {
                                tVar.d();
                                return;
                            }
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == tVar);
                    if (kVar.e()) {
                        kVar.d();
                    }
                }
            } else {
                kVar = kVar2;
            }
        }
    }
}
