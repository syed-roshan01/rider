package n8;

import e8.a1;
import e8.c2;
import e8.f2;
import e8.g0;
import e8.g2;
import e8.h2;
import e8.j0;
import e8.w0;
import e8.x;
import e8.z0;
import g8.c6;
import g8.k4;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class p extends z0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final e8.b f12296k = new e8.b("addressTrackerKey");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f12297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h2 f12298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f12299e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c6 f12300f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ScheduledExecutorService f12301g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public v6.d f12302h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Long f12303i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e8.i f12304j;

    public p(j0 j0Var) {
        k4 k4Var = c6.f6709a;
        e8.i iVarI = j0Var.i();
        this.f12304j = iVarI;
        this.f12299e = new f(new e(this, j0Var));
        this.f12297c = new h();
        h2 h2VarL = j0Var.l();
        y3.e.J(h2VarL, "syncContext");
        this.f12298d = h2VarL;
        ScheduledExecutorService scheduledExecutorServiceJ = j0Var.j();
        y3.e.J(scheduledExecutorServiceJ, "timeService");
        this.f12301g = scheduledExecutorServiceJ;
        this.f12300f = k4Var;
        iVarI.a(1, "OutlierDetection lb created.");
    }

    public static boolean g(List list) {
        Iterator it = list.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((g0) it.next()).f5259a.size();
            if (size > 1) {
                return false;
            }
        }
        return true;
    }

    public static ArrayList h(h hVar, int i10) {
        ArrayList arrayList = new ArrayList();
        for (g gVar : hVar.values()) {
            if (gVar.c() >= i10) {
                arrayList.add(gVar);
            }
        }
        return arrayList;
    }

    @Override // e8.z0
    public final boolean a(w0 w0Var) {
        e8.i iVar = this.f12304j;
        iVar.b(1, "Received resolution result: {0}", w0Var);
        j jVar = (j) w0Var.f5393c;
        ArrayList<SocketAddress> arrayList = new ArrayList();
        List list = w0Var.f5391a;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.addAll(((g0) it.next()).f5259a);
        }
        h hVar = this.f12297c;
        hVar.keySet().retainAll(arrayList);
        Iterator it2 = hVar.f12273a.values().iterator();
        while (it2.hasNext()) {
            ((g) it2.next()).f12267a = jVar;
        }
        for (SocketAddress socketAddress : arrayList) {
            HashMap map = hVar.f12273a;
            if (!map.containsKey(socketAddress)) {
                map.put(socketAddress, new g(jVar));
            }
        }
        a1 a1Var = jVar.f12283g.f7144a;
        f fVar = this.f12299e;
        fVar.getClass();
        y3.e.J(a1Var, "newBalancerFactory");
        if (!a1Var.equals(fVar.f12262g)) {
            fVar.f12263h.f();
            fVar.f12263h = fVar.f12258c;
            fVar.f12262g = null;
            fVar.f12264i = x.f5394a;
            fVar.f12265j = f.f12257l;
            if (!a1Var.equals(fVar.f12260e)) {
                e eVar = new e(fVar);
                z0 z0VarC = a1Var.c(eVar);
                eVar.f12255b = z0VarC;
                fVar.f12263h = z0VarC;
                fVar.f12262g = a1Var;
                if (!fVar.f12266k) {
                    fVar.h();
                }
            }
        }
        if (jVar.f12281e == null && jVar.f12282f == null) {
            v6.d dVar = this.f12302h;
            if (dVar != null) {
                dVar.c();
                this.f12303i = null;
                for (g gVar : hVar.f12273a.values()) {
                    if (gVar.e()) {
                        gVar.g();
                    }
                    gVar.f12271e = 0;
                }
            }
        } else {
            Long l10 = this.f12303i;
            Long l11 = jVar.f12277a;
            Long lValueOf = l10 == null ? l11 : Long.valueOf(Math.max(0L, l11.longValue() - (((k4) this.f12300f).a() - this.f12303i.longValue())));
            v6.d dVar2 = this.f12302h;
            if (dVar2 != null) {
                dVar2.c();
                for (g gVar2 : hVar.f12273a.values()) {
                    gVar2.f12268b.n();
                    gVar2.f12269c.n();
                }
            }
            y2.a aVar = new y2.a(this, jVar, iVar, 23);
            long jLongValue = lValueOf.longValue();
            long jLongValue2 = l11.longValue();
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            ScheduledExecutorService scheduledExecutorService = this.f12301g;
            h2 h2Var = this.f12298d;
            h2Var.getClass();
            g2 g2Var = new g2(aVar);
            this.f12302h = new v6.d(g2Var, (ScheduledFuture) scheduledExecutorService.scheduleWithFixedDelay(new f2(h2Var, g2Var, aVar, jLongValue2), jLongValue, jLongValue2, timeUnit), 0);
        }
        e8.c cVar = e8.c.f5206b;
        fVar.d(new w0(list, w0Var.f5392b, jVar.f12283g.f7145b));
        return true;
    }

    @Override // e8.z0
    public final void c(c2 c2Var) {
        this.f12299e.c(c2Var);
    }

    @Override // e8.z0
    public final void f() {
        this.f12299e.f();
    }
}
