package g8;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class j2 implements e8.p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e8.q0 f6865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r7.e f6868d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v2 f6869e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m0 f6870f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ScheduledExecutorService f6871g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e8.n0 f6872h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final y f6873i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e8.i f6874j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final e8.h2 f6875k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final k3.b f6876l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile List f6877m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public i1 f6878n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final q6.l f6879o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public v6.d f6880p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public v6.d f6881q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public u3 f6882r;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public o0 f6885u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public volatile u3 f6886v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public e8.c2 f6888x;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayList f6883s = new ArrayList();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final z1 f6884t = new z1(this, 0);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public volatile e8.y f6887w = e8.y.a(e8.x.f5397d);

    public j2(List list, String str, r7.e eVar, x xVar, ScheduledExecutorService scheduledExecutorService, q6.m mVar, e8.h2 h2Var, v2 v2Var, e8.n0 n0Var, y yVar, b0 b0Var, e8.q0 q0Var, z zVar) {
        y3.e.J(list, "addressGroups");
        y3.e.G("addressGroups is empty", !list.isEmpty());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            y3.e.J(it.next(), "addressGroups contains null entry");
        }
        List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        this.f6877m = listUnmodifiableList;
        this.f6876l = new k3.b(listUnmodifiableList);
        this.f6866b = str;
        this.f6867c = null;
        this.f6868d = eVar;
        this.f6870f = xVar;
        this.f6871g = scheduledExecutorService;
        this.f6879o = (q6.l) mVar.get();
        this.f6875k = h2Var;
        this.f6869e = v2Var;
        this.f6872h = n0Var;
        this.f6873i = yVar;
        y3.e.J(b0Var, "channelTracer");
        y3.e.J(q0Var, "logId");
        this.f6865a = q0Var;
        y3.e.J(zVar, "channelLogger");
        this.f6874j = zVar;
    }

    public static void g(j2 j2Var, e8.x xVar) {
        j2Var.f6875k.d();
        j2Var.i(e8.y.a(xVar));
    }

    public static void h(j2 j2Var) {
        SocketAddress socketAddress;
        e8.k0 k0Var;
        e8.h2 h2Var = j2Var.f6875k;
        h2Var.d();
        y3.e.N("Should have no reconnectTask scheduled", j2Var.f6880p == null);
        k3.b bVar = j2Var.f6876l;
        if (bVar.f9720b == 0 && bVar.f9721c == 0) {
            q6.l lVar = j2Var.f6879o;
            lVar.f13212a = false;
            lVar.b();
        }
        SocketAddress socketAddress2 = (SocketAddress) ((e8.g0) ((List) bVar.f9722d).get(bVar.f9720b)).f5259a.get(bVar.f9721c);
        if (socketAddress2 instanceof e8.k0) {
            k0Var = (e8.k0) socketAddress2;
            socketAddress = k0Var.f5295b;
        } else {
            socketAddress = socketAddress2;
            k0Var = null;
        }
        e8.c cVar = ((e8.g0) ((List) bVar.f9722d).get(bVar.f9720b)).f5260b;
        String str = (String) cVar.f5207a.get(e8.g0.f5258d);
        l0 l0Var = new l0();
        l0Var.f6912a = "unknown-authority";
        l0Var.f6913b = e8.c.f5206b;
        if (str == null) {
            str = j2Var.f6866b;
        }
        y3.e.J(str, "authority");
        l0Var.f6912a = str;
        l0Var.f6913b = cVar;
        l0Var.f6914c = j2Var.f6867c;
        l0Var.f6915d = k0Var;
        i2 i2Var = new i2();
        i2Var.f6849d = j2Var.f6865a;
        f2 f2Var = new f2(j2Var.f6870f.a0(socketAddress, l0Var, i2Var), j2Var.f6873i);
        i2Var.f6849d = f2Var.b();
        j2Var.f6885u = f2Var;
        j2Var.f6883s.add(f2Var);
        Runnable runnableE = f2Var.e(new h2(j2Var, f2Var));
        if (runnableE != null) {
            h2Var.b(runnableE);
        }
        j2Var.f6874j.b(2, "Started transport {0}", i2Var.f6849d);
    }

    public static String j(e8.c2 c2Var) {
        StringBuilder sb = new StringBuilder();
        sb.append(c2Var.f5227a);
        String str = c2Var.f5228b;
        if (str != null) {
            sb.append("(");
            sb.append(str);
            sb.append(")");
        }
        Throwable th = c2Var.f5229c;
        if (th != null) {
            sb.append("[");
            sb.append(th);
            sb.append("]");
        }
        return sb.toString();
    }

    @Override // e8.p0
    public final e8.q0 b() {
        return this.f6865a;
    }

    public final void i(e8.y yVar) {
        this.f6875k.d();
        if (this.f6887w.f5403a != yVar.f5403a) {
            y3.e.N("Cannot transition out of SHUTDOWN to " + yVar, this.f6887w.f5403a != e8.x.f5398e);
            this.f6887w = yVar;
            e8.y0 y0Var = (e8.y0) this.f6869e.f7175a;
            y3.e.N("listener is null", y0Var != null);
            y0Var.a(yVar);
        }
    }

    public final String toString() {
        q6.g gVarJ0 = f6.a.j0(this);
        gVarJ0.b("logId", this.f6865a.f5345c);
        gVarJ0.a(this.f6877m, "addressGroups");
        return gVarJ0.toString();
    }
}
