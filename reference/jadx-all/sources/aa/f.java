package aa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Logger;
import l.q;
import x9.v;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final v f1350h = new v(7, 0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final f f1351i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Logger f1352j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f1353a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f1356d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1354b = 10000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f1357e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f1358f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f1359g = new e(this);

    static {
        String str = y9.b.f17005f + " TaskRunner";
        d7.a.m(str, "name");
        f1351i = new f(new d(new y9.a(str, true)));
        Logger logger = Logger.getLogger(f.class.getName());
        d7.a.l(logger, "getLogger(TaskRunner::class.java.name)");
        f1352j = logger;
    }

    public f(d dVar) {
        this.f1353a = dVar;
    }

    public static final void a(f fVar, a aVar) {
        fVar.getClass();
        byte[] bArr = y9.b.f17000a;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(aVar.f1336a);
        try {
            long jA = aVar.a();
            synchronized (fVar) {
                fVar.b(aVar, jA);
            }
        } finally {
            synchronized (fVar) {
                fVar.b(aVar, -1L);
                threadCurrentThread.setName(name);
            }
        }
    }

    public final void b(a aVar, long j10) {
        byte[] bArr = y9.b.f17000a;
        c cVar = aVar.f1338c;
        d7.a.j(cVar);
        if (cVar.f1345d != aVar) {
            throw new IllegalStateException("Check failed.".toString());
        }
        boolean z10 = cVar.f1347f;
        cVar.f1347f = false;
        cVar.f1345d = null;
        this.f1357e.remove(cVar);
        if (j10 != -1 && !z10 && !cVar.f1344c) {
            cVar.d(aVar, j10, true);
        }
        if (!cVar.f1346e.isEmpty()) {
            this.f1358f.add(cVar);
        }
    }

    public final a c() {
        boolean z10;
        boolean z11;
        byte[] bArr = y9.b.f17000a;
        while (true) {
            ArrayList arrayList = this.f1358f;
            if (arrayList.isEmpty()) {
                return null;
            }
            d dVar = this.f1353a;
            dVar.getClass();
            long jNanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long jMin = Long.MAX_VALUE;
            a aVar = null;
            while (true) {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                }
                a aVar2 = (a) ((c) it.next()).f1346e.get(0);
                long jMax = Math.max(0L, aVar2.f1339d - jNanoTime);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (aVar != null) {
                        z10 = true;
                        break;
                    }
                    aVar = aVar2;
                }
            }
            if (aVar != null) {
                byte[] bArr2 = y9.b.f17000a;
                aVar.f1339d = -1L;
                c cVar = aVar.f1338c;
                d7.a.j(cVar);
                cVar.f1346e.remove(aVar);
                arrayList.remove(cVar);
                cVar.f1345d = aVar;
                this.f1357e.add(cVar);
                if (z10 || (!this.f1355c && (!arrayList.isEmpty()))) {
                    e eVar = this.f1359g;
                    d7.a.m(eVar, "runnable");
                    dVar.f1348a.execute(eVar);
                }
                return aVar;
            }
            if (this.f1355c) {
                if (jMin < this.f1356d - jNanoTime) {
                    notify();
                }
                return null;
            }
            this.f1355c = true;
            this.f1356d = jNanoTime + jMin;
            try {
                try {
                    long j10 = jMin / 1000000;
                    long j11 = jMin - (1000000 * j10);
                    if (j10 > 0 || jMin > 0) {
                        wait(j10, (int) j11);
                    }
                    z11 = false;
                } catch (InterruptedException unused) {
                    d();
                    z11 = false;
                }
                this.f1355c = z11;
            } catch (Throwable th) {
                this.f1355c = false;
                throw th;
            }
        }
    }

    public final void d() {
        ArrayList arrayList = this.f1357e;
        int size = arrayList.size();
        while (true) {
            size--;
            if (-1 >= size) {
                break;
            } else {
                ((c) arrayList.get(size)).b();
            }
        }
        ArrayList arrayList2 = this.f1358f;
        for (int size2 = arrayList2.size() - 1; -1 < size2; size2--) {
            c cVar = (c) arrayList2.get(size2);
            cVar.b();
            if (cVar.f1346e.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
    }

    public final void e(c cVar) {
        d7.a.m(cVar, "taskQueue");
        byte[] bArr = y9.b.f17000a;
        if (cVar.f1345d == null) {
            boolean z10 = !cVar.f1346e.isEmpty();
            ArrayList arrayList = this.f1358f;
            if (z10) {
                d7.a.m(arrayList, "<this>");
                if (!arrayList.contains(cVar)) {
                    arrayList.add(cVar);
                }
            } else {
                arrayList.remove(cVar);
            }
        }
        boolean z11 = this.f1355c;
        d dVar = this.f1353a;
        if (z11) {
            dVar.getClass();
            notify();
        } else {
            dVar.getClass();
            e eVar = this.f1359g;
            d7.a.m(eVar, "runnable");
            dVar.f1348a.execute(eVar);
        }
    }

    public final c f() {
        int i10;
        synchronized (this) {
            i10 = this.f1354b;
            this.f1354b = i10 + 1;
        }
        return new c(this, q.g("Q", i10));
    }
}
