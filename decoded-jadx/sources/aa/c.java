package aa;

import h6.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f1342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f1345d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f1346e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1347f;

    public c(f fVar, String str) {
        d7.a.m(fVar, "taskRunner");
        d7.a.m(str, "name");
        this.f1342a = fVar;
        this.f1343b = str;
        this.f1346e = new ArrayList();
    }

    public final void a() {
        byte[] bArr = y9.b.f17000a;
        synchronized (this.f1342a) {
            if (b()) {
                this.f1342a.e(this);
            }
        }
    }

    public final boolean b() {
        a aVar = this.f1345d;
        if (aVar != null && aVar.f1337b) {
            this.f1347f = true;
        }
        ArrayList arrayList = this.f1346e;
        boolean z10 = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((a) arrayList.get(size)).f1337b) {
                a aVar2 = (a) arrayList.get(size);
                if (f.f1350h.v().isLoggable(Level.FINE)) {
                    g.a(aVar2, this, "canceled");
                }
                arrayList.remove(size);
                z10 = true;
            }
        }
        return z10;
    }

    public final void c(a aVar, long j10) {
        d7.a.m(aVar, "task");
        synchronized (this.f1342a) {
            if (!this.f1344c) {
                if (d(aVar, j10, false)) {
                    this.f1342a.e(this);
                }
            } else if (aVar.f1337b) {
                if (f.f1350h.v().isLoggable(Level.FINE)) {
                    g.a(aVar, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (f.f1350h.v().isLoggable(Level.FINE)) {
                    g.a(aVar, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean d(a aVar, long j10, boolean z10) {
        d7.a.m(aVar, "task");
        c cVar = aVar.f1338c;
        if (cVar != this) {
            if (cVar != null) {
                throw new IllegalStateException("task is in multiple queues".toString());
            }
            aVar.f1338c = this;
        }
        this.f1342a.f1353a.getClass();
        long jNanoTime = System.nanoTime();
        long j11 = jNanoTime + j10;
        ArrayList arrayList = this.f1346e;
        int iIndexOf = arrayList.indexOf(aVar);
        if (iIndexOf != -1) {
            if (aVar.f1339d <= j11) {
                if (f.f1350h.v().isLoggable(Level.FINE)) {
                    g.a(aVar, this, "already scheduled");
                }
                return false;
            }
            arrayList.remove(iIndexOf);
        }
        aVar.f1339d = j11;
        if (f.f1350h.v().isLoggable(Level.FINE)) {
            g.a(aVar, this, z10 ? "run again after ".concat(g.X(j11 - jNanoTime)) : "scheduled after ".concat(g.X(j11 - jNanoTime)));
        }
        Iterator it = arrayList.iterator();
        int size = 0;
        while (true) {
            if (!it.hasNext()) {
                size = -1;
                break;
            }
            if (((a) it.next()).f1339d - jNanoTime > j10) {
                break;
            }
            size++;
        }
        if (size == -1) {
            size = arrayList.size();
        }
        arrayList.add(size, aVar);
        return size == 0;
    }

    public final void e() {
        byte[] bArr = y9.b.f17000a;
        synchronized (this.f1342a) {
            this.f1344c = true;
            if (b()) {
                this.f1342a.e(this);
            }
        }
    }

    public final String toString() {
        return this.f1343b;
    }
}
