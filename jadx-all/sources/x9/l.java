package x9;

import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ThreadPoolExecutor f16434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f16435b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayDeque f16436c = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayDeque f16437d = new ArrayDeque();

    public final void a(ArrayDeque arrayDeque, Object obj) {
        synchronized (this) {
            if (!arrayDeque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        c();
    }

    public final void b(ba.f fVar) {
        d7.a.m(fVar, "call");
        fVar.f2786b.decrementAndGet();
        a(this.f16436c, fVar);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0066 A[Catch: all -> 0x0099, TryCatch #2 {all -> 0x0099, blocks: (B:22:0x0062, B:24:0x0066, B:27:0x009b), top: B:50:0x0062 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:24:0x0066, please report this as an issue */
    public final void c() {
        int size;
        int i10;
        ba.f fVar;
        byte[] bArr = y9.b.f17000a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = this.f16435b.iterator();
                d7.a.l(it, "readyAsyncCalls.iterator()");
                while (it.hasNext()) {
                    ba.f fVar2 = (ba.f) it.next();
                    if (this.f16436c.size() >= 64) {
                        break;
                    }
                    if (fVar2.f2786b.get() < 5) {
                        it.remove();
                        fVar2.f2786b.incrementAndGet();
                        arrayList.add(fVar2);
                        this.f16436c.add(fVar2);
                    }
                }
                synchronized (this) {
                    this.f16436c.size();
                    this.f16437d.size();
                }
                size = arrayList.size();
                for (i10 = 0; i10 < size; i10++) {
                    fVar = (ba.f) arrayList.get(i10);
                    synchronized (this) {
                        try {
                            if (this.f16434a == null) {
                                TimeUnit timeUnit = TimeUnit.SECONDS;
                                SynchronousQueue synchronousQueue = new SynchronousQueue();
                                String str = y9.b.f17005f + " Dispatcher";
                                d7.a.m(str, "name");
                                this.f16434a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new y9.a(str, false));
                            }
                            ThreadPoolExecutor threadPoolExecutor = this.f16434a;
                            d7.a.j(threadPoolExecutor);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    fVar.getClass();
                    ba.i iVar = fVar.f2787c;
                    l lVar = iVar.f2790a.f16474a;
                    byte[] bArr2 = y9.b.f17000a;
                    try {
                        try {
                            threadPoolExecutor.execute(fVar);
                        } catch (RejectedExecutionException e4) {
                            InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                            interruptedIOException.initCause(e4);
                            iVar.h(interruptedIOException);
                            fVar.f2785a.a(iVar, interruptedIOException);
                            iVar.f2790a.f16474a.b(fVar);
                        }
                    } catch (Throwable th2) {
                        iVar.f2790a.f16474a.b(fVar);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        size = arrayList.size();
        while (i10 < size) {
            fVar = (ba.f) arrayList.get(i10);
            synchronized (this) {
                if (this.f16434a == null) {
                    TimeUnit timeUnit2 = TimeUnit.SECONDS;
                    SynchronousQueue synchronousQueue2 = new SynchronousQueue();
                    String str2 = y9.b.f17005f + " Dispatcher";
                    d7.a.m(str2, "name");
                    this.f16434a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit2, synchronousQueue2, new y9.a(str2, false));
                }
                ThreadPoolExecutor threadPoolExecutor2 = this.f16434a;
                d7.a.j(threadPoolExecutor2);
                fVar.getClass();
                ba.i iVar2 = fVar.f2787c;
                l lVar2 = iVar2.f2790a.f16474a;
                byte[] bArr3 = y9.b.f17000a;
                threadPoolExecutor2.execute(fVar);
            }
        }
    }
}
