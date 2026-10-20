package n8;

import e8.y;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import u.k1;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f12267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile v6.d f12268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v6.d f12269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Long f12270d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12271e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashSet f12272f = new HashSet();

    public g(j jVar) {
        k1 k1Var = null;
        this.f12268b = new v6.d(k1Var);
        this.f12269c = new v6.d(k1Var);
        this.f12267a = jVar;
    }

    public final void a(n nVar) {
        if (e() && !nVar.f12291c) {
            nVar.j();
        } else if (!e() && nVar.f12291c) {
            nVar.f12291c = false;
            y yVar = nVar.f12292d;
            if (yVar != null) {
                nVar.f12293e.a(yVar);
                nVar.f12294f.b(2, "Subchannel unejected: {0}", nVar);
            }
        }
        nVar.f12290b = this;
        this.f12272f.add(nVar);
    }

    public final void b(long j10) {
        this.f12270d = Long.valueOf(j10);
        this.f12271e++;
        Iterator it = this.f12272f.iterator();
        while (it.hasNext()) {
            ((n) it.next()).j();
        }
    }

    public final long c() {
        return ((AtomicLong) this.f12269c.f15908c).get() + ((AtomicLong) this.f12269c.f15907b).get();
    }

    public final void d(boolean z10) {
        j jVar = this.f12267a;
        if (jVar.f12281e == null && jVar.f12282f == null) {
            return;
        }
        if (z10) {
            ((AtomicLong) this.f12268b.f15907b).getAndIncrement();
        } else {
            ((AtomicLong) this.f12268b.f15908c).getAndIncrement();
        }
    }

    public final boolean e() {
        return this.f12270d != null;
    }

    public final double f() {
        return ((AtomicLong) this.f12269c.f15907b).get() / c();
    }

    public final void g() {
        y3.e.N("not currently ejected", this.f12270d != null);
        this.f12270d = null;
        for (n nVar : this.f12272f) {
            nVar.f12291c = false;
            y yVar = nVar.f12292d;
            if (yVar != null) {
                nVar.f12293e.a(yVar);
                nVar.f12294f.b(2, "Subchannel unejected: {0}", nVar);
            }
        }
    }

    public final String toString() {
        return "AddressTracker{subchannels=" + this.f12272f + '}';
    }
}
