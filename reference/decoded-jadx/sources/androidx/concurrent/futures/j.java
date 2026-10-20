package androidx.concurrent.futures;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class j implements u6.b {
    static final a ATOMIC_HELPER;
    private static final Object NULL;
    private static final long SPIN_THRESHOLD_NANOS = 1000;
    volatile e listeners;
    volatile Object value;
    volatile i waiters;
    static final boolean GENERATE_CANCELLATION_CAUSES = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    private static final Logger log = Logger.getLogger(j.class.getName());

    static {
        a hVar;
        try {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(j.class, i.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(j.class, e.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, FirebaseAnalytics.Param.VALUE));
            th = null;
        } catch (Throwable th) {
            th = th;
            hVar = new h();
        }
        ATOMIC_HELPER = hVar;
        if (th != null) {
            log.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        NULL = new Object();
    }

    public static void b(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e4) {
            log.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e4);
        }
    }

    public static Object c(Object obj) throws ExecutionException {
        if (obj instanceof b) {
            Throwable th = ((b) obj).f1764b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f1767a);
        }
        if (obj == NULL) {
            return null;
        }
        return obj;
    }

    public static <T> T checkNotNull(T t10) {
        t10.getClass();
        return t10;
    }

    public static void complete(j jVar) {
        e eVar;
        e eVar2;
        e eVar3 = null;
        while (true) {
            i iVar = jVar.waiters;
            if (ATOMIC_HELPER.c(jVar, iVar, i.f1779c)) {
                while (iVar != null) {
                    Thread thread = iVar.f1780a;
                    if (thread != null) {
                        iVar.f1780a = null;
                        LockSupport.unpark(thread);
                    }
                    iVar = iVar.f1781b;
                }
                jVar.afterDone();
                do {
                    eVar = jVar.listeners;
                } while (!ATOMIC_HELPER.a(jVar, eVar, e.f1768d));
                while (true) {
                    eVar2 = eVar3;
                    eVar3 = eVar;
                    if (eVar3 == null) {
                        break;
                    }
                    eVar = eVar3.f1771c;
                    eVar3.f1771c = eVar2;
                }
                while (eVar2 != null) {
                    eVar3 = eVar2.f1771c;
                    Runnable runnable = eVar2.f1769a;
                    if (runnable instanceof g) {
                        g gVar = (g) runnable;
                        jVar = gVar.f1777a;
                        if (jVar.value == gVar) {
                            if (ATOMIC_HELPER.b(jVar, gVar, getFutureValue(gVar.f1778b))) {
                            }
                        } else {
                            continue;
                        }
                    } else {
                        b(runnable, eVar2.f1770b);
                    }
                    eVar2 = eVar3;
                }
                return;
            }
        }
    }

    public static Object getFutureValue(u6.b bVar) {
        if (bVar instanceof j) {
            Object obj = ((j) bVar).value;
            if (!(obj instanceof b)) {
                return obj;
            }
            b bVar2 = (b) obj;
            if (bVar2.f1763a) {
                return bVar2.f1764b != null ? new b(bVar2.f1764b, false) : b.f1762d;
            }
            return obj;
        }
        boolean zIsCancelled = bVar.isCancelled();
        if ((!GENERATE_CANCELLATION_CAUSES) && zIsCancelled) {
            return b.f1762d;
        }
        try {
            Object uninterruptibly = getUninterruptibly(bVar);
            return uninterruptibly == null ? NULL : uninterruptibly;
        } catch (CancellationException e4) {
            if (zIsCancelled) {
                return new b(e4, false);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + bVar, e4));
        } catch (ExecutionException e10) {
            return new d(e10.getCause());
        } catch (Throwable th) {
            return new d(th);
        }
    }

    public static <V> V getUninterruptibly(Future<V> future) {
        V v10;
        boolean z10 = false;
        while (true) {
            try {
                v10 = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return v10;
    }

    public final void a(StringBuilder sb) {
        try {
            Object uninterruptibly = getUninterruptibly(this);
            sb.append("SUCCESS, result=[");
            sb.append(uninterruptibly == this ? "this future" : String.valueOf(uninterruptibly));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e4) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e4.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e10) {
            sb.append("FAILURE, cause=[");
            sb.append(e10.getCause());
            sb.append("]");
        }
    }

    @Override // u6.b
    public final void addListener(Runnable runnable, Executor executor) {
        checkNotNull(runnable);
        checkNotNull(executor);
        e eVar = this.listeners;
        e eVar2 = e.f1768d;
        if (eVar != eVar2) {
            e eVar3 = new e(runnable, executor);
            do {
                eVar3.f1771c = eVar;
                if (ATOMIC_HELPER.a(this, eVar, eVar3)) {
                    return;
                } else {
                    eVar = this.listeners;
                }
            } while (eVar != eVar2);
        }
        b(runnable, executor);
    }

    public void afterDone() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        b bVar;
        Object obj = this.value;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        if (GENERATE_CANCELLATION_CAUSES) {
            bVar = new b(new CancellationException("Future.cancel() was called."), z10);
        } else {
            bVar = z10 ? b.f1761c : b.f1762d;
        }
        j jVar = this;
        boolean z11 = false;
        while (true) {
            if (ATOMIC_HELPER.b(jVar, obj, bVar)) {
                if (z10) {
                    jVar.interruptTask();
                }
                complete(jVar);
                if (!(obj instanceof g)) {
                    return true;
                }
                u6.b bVar2 = ((g) obj).f1778b;
                if (!(bVar2 instanceof j)) {
                    bVar2.cancel(z10);
                    return true;
                }
                jVar = (j) bVar2;
                obj = jVar.value;
                if (!(obj == null) && !(obj instanceof g)) {
                    return true;
                }
                z11 = true;
            } else {
                obj = jVar.value;
                if (!(obj instanceof g)) {
                    return z11;
                }
            }
        }
    }

    public final void d(i iVar) {
        iVar.f1780a = null;
        while (true) {
            i iVar2 = this.waiters;
            if (iVar2 == i.f1779c) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.f1781b;
                if (iVar2.f1780a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.f1781b = iVar4;
                    if (iVar3.f1780a == null) {
                    }
                } else if (!ATOMIC_HELPER.c(this, iVar2, iVar4)) {
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0090  */
    /* JADX WARN: Code duplicated, block: B:48:0x0094  */
    /* JADX WARN: Code duplicated, block: B:49:0x0096  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a8 A[EDGE_INSN: B:56:0x00a8->B:36:0x0074 BREAK  A[LOOP:0: B:21:0x0041->B:86:?]] */
    /* JADX WARN: Code duplicated, block: B:59:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:63:0x0100  */
    /* JADX WARN: Code duplicated, block: B:67:0x0108  */
    /* JADX WARN: Code duplicated, block: B:69:0x010c  */
    /* JADX WARN: Code duplicated, block: B:71:0x0123  */
    /* JADX WARN: Code duplicated, block: B:74:0x012f  */
    /* JADX WARN: Code duplicated, block: B:78:0x014f  */
    /* JADX WARN: Code duplicated, block: B:80:0x015b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x00a8 -> B:36:0x0074). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    @Override // java.util.concurrent.Future
    public final java.lang.Object get(long r20, java.util.concurrent.TimeUnit r22) {
        /*
            Method dump skipped, instruction units count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.concurrent.futures.j.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    public void interruptTask() {
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.value instanceof b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.value;
        return (!(obj instanceof g)) & (obj != null);
    }

    public final void maybePropagateCancellationTo(Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(wasInterrupted());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String pendingToString() {
        Object obj = this.value;
        if (obj instanceof g) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            u6.b bVar = ((g) obj).f1778b;
            return a7.a.p(sb, bVar == this ? "this future" : String.valueOf(bVar), "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public boolean set(Object obj) {
        if (obj == null) {
            obj = NULL;
        }
        if (!ATOMIC_HELPER.b(this, null, obj)) {
            return false;
        }
        complete(this);
        return true;
    }

    public boolean setException(Throwable th) {
        if (!ATOMIC_HELPER.b(this, null, new d((Throwable) checkNotNull(th)))) {
            return false;
        }
        complete(this);
        return true;
    }

    public boolean setFuture(u6.b bVar) {
        d dVar;
        checkNotNull(bVar);
        Object obj = this.value;
        if (obj == null) {
            if (bVar.isDone()) {
                if (!ATOMIC_HELPER.b(this, null, getFutureValue(bVar))) {
                    return false;
                }
                complete(this);
                return true;
            }
            g gVar = new g(this, bVar);
            if (ATOMIC_HELPER.b(this, null, gVar)) {
                try {
                    bVar.addListener(gVar, n.f1789a);
                } catch (Throwable th) {
                    try {
                        dVar = new d(th);
                    } catch (Throwable unused) {
                        dVar = d.f1766b;
                    }
                    ATOMIC_HELPER.b(this, gVar, dVar);
                }
                return true;
            }
            obj = this.value;
        }
        if (obj instanceof b) {
            bVar.cancel(((b) obj).f1763a);
        }
        return false;
    }

    public String toString() {
        String strPendingToString;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                strPendingToString = pendingToString();
            } catch (RuntimeException e4) {
                strPendingToString = "Exception thrown from implementation: " + e4.getClass();
            }
            if (strPendingToString != null && !strPendingToString.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strPendingToString);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final boolean wasInterrupted() {
        Object obj = this.value;
        return (obj instanceof b) && ((b) obj).f1763a;
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.value;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return c(obj2);
            }
            i iVar = this.waiters;
            i iVar2 = i.f1779c;
            if (iVar != iVar2) {
                i iVar3 = new i();
                do {
                    a aVar = ATOMIC_HELPER;
                    aVar.d(iVar3, iVar);
                    if (aVar.c(this, iVar, iVar3)) {
                        do {
                            LockSupport.park(this);
                            if (Thread.interrupted()) {
                                d(iVar3);
                                throw new InterruptedException();
                            }
                            obj = this.value;
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return c(obj);
                    }
                    iVar = this.waiters;
                } while (iVar != iVar2);
            }
            return c(this.value);
        }
        throw new InterruptedException();
    }
}
