package g8;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class l3 extends e8.c1 implements e8.p0 {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final Logger f6919b0 = Logger.getLogger(l3.class.getName());

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final Pattern f6920c0 = Pattern.compile("[a-zA-Z][a-zA-Z0-9+.-]*:/.*");

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final e8.c2 f6921d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final e8.c2 f6922e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final e8.c2 f6923f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final s3 f6924g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final t2 f6925h0;
    public static final e8.l i0;
    public Collection A;
    public final Object B;
    public final HashSet C;
    public final y0 D;
    public final i3.a0 E;
    public final AtomicBoolean F;
    public boolean G;
    public boolean H;
    public volatile boolean I;
    public final CountDownLatch J;
    public final v2 K;
    public final y L;
    public final b0 M;
    public final z N;
    public final e8.n0 O;
    public final i3 P;
    public s3 Q;
    public boolean R;
    public final boolean S;
    public final o T;
    public final long U;
    public final long V;
    public final boolean W;
    public final z1 X;
    public final z5.k Y;
    public final s4 Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e8.q0 f6926a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f6927a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e8.u1 f6929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e8.q1 f6930d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s f6931e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final x f6932f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j3 f6933g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Executor f6934h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l1 f6935i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b3 f6936j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b3 f6937k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c6 f6938l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e8.h2 f6939m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e8.e0 f6940n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final e8.w f6941o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final q6.m f6942p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f6943q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final z5.k f6944r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final r7.e f6945s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e8.j0 f6946t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public o1 f6947u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f6948v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public c3 f6949w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public volatile z6.a f6950x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f6951y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final HashSet f6952z;

    static {
        e8.c2 c2Var = e8.c2.f5224m;
        f6921d0 = c2Var.g("Channel shutdownNow invoked");
        f6922e0 = c2Var.g("Channel shutdown invoked");
        f6923f0 = c2Var.g("Subchannel shutdown invoked");
        f6924g0 = new s3(null, new HashMap(), new HashMap(), null, null, null);
        f6925h0 = new t2();
        i0 = new e8.l();
    }

    public l3(n3 n3Var, h8.h hVar, r7.e eVar, l1 l1Var, x9.v vVar, ArrayList arrayList) {
        k4 k4Var = c6.f6709a;
        e8.h2 h2Var = new e8.h2(new x2(this, 0));
        this.f6939m = h2Var;
        z5.k kVar = new z5.k();
        kVar.f17260a = new ArrayList();
        kVar.f17261b = e8.x.f5397d;
        this.f6944r = kVar;
        this.f6952z = new HashSet(16, 0.75f);
        this.B = new Object();
        this.C = new HashSet(1, 0.75f);
        i3.a0 a0Var = new i3.a0();
        a0Var.f7944d = this;
        a0Var.f7941a = new Object();
        a0Var.f7942b = new HashSet();
        this.E = a0Var;
        this.F = new AtomicBoolean(false);
        this.J = new CountDownLatch(1);
        this.f6927a0 = 1;
        this.Q = f6924g0;
        this.R = false;
        this.T = new o(1);
        a3 a3Var = new a3(this);
        this.X = new z1(this);
        z5.k kVar2 = new z5.k();
        kVar2.f17260a = this;
        this.Y = kVar2;
        String str = n3Var.f6989e;
        y3.e.J(str, "target");
        this.f6928b = str;
        e8.q0 q0Var = new e8.q0("Channel", str, e8.q0.f5342d.incrementAndGet());
        this.f6926a = q0Var;
        this.f6938l = k4Var;
        l1 l1Var2 = n3Var.f6985a;
        y3.e.J(l1Var2, "executorPool");
        this.f6935i = l1Var2;
        int i10 = l1Var2.f6916a;
        Object objA = l1Var2.f6917b;
        switch (i10) {
            case 0:
                break;
            default:
                objA = w5.a((v5) objA);
                break;
        }
        Executor executor = (Executor) objA;
        y3.e.J(executor, "executor");
        this.f6934h = executor;
        l1 l1Var3 = n3Var.f6986b;
        y3.e.J(l1Var3, "offloadExecutorPool");
        b3 b3Var = new b3(l1Var3);
        this.f6937k = b3Var;
        this.f6932f = new x(hVar, b3Var);
        j3 j3Var = new j3(hVar.L());
        this.f6933g = j3Var;
        b0 b0Var = new b0(q0Var, k4Var.a(), l.q.k("Channel for '", str, "'"));
        this.M = b0Var;
        z zVar = new z(b0Var, k4Var);
        this.N = zVar;
        l4 l4Var = s1.f7097m;
        boolean z10 = n3Var.f6998n;
        this.W = z10;
        s sVar = new s(n3Var.f6990f);
        this.f6931e = sVar;
        n5 n5Var = new n5(z10, n3Var.f6994j, n3Var.f6995k, sVar);
        Integer numValueOf = Integer.valueOf(n3Var.f7007w.a());
        l4Var.getClass();
        e8.q1 q1Var = new e8.q1(numValueOf, l4Var, h2Var, n5Var, j3Var, zVar, b3Var, null);
        this.f6930d = q1Var;
        e8.u1 u1Var = n3Var.f6988d;
        this.f6929c = u1Var;
        this.f6947u = D(str, u1Var, q1Var);
        this.f6936j = new b3(l1Var);
        y0 y0Var = new y0(executor, h2Var);
        this.D = y0Var;
        y0Var.e(a3Var);
        this.f6945s = eVar;
        this.S = n3Var.f7000p;
        i3 i3Var = new i3(this, this.f6947u.k());
        this.P = i3Var;
        Iterator it = arrayList.iterator();
        e8.j0 mVar = i3Var;
        while (it.hasNext()) {
            a7.a.w(it.next());
            mVar = new e8.m(mVar);
        }
        this.f6946t = mVar;
        y3.e.J(vVar, "stopwatchSupplier");
        this.f6942p = vVar;
        long j10 = n3Var.f6993i;
        if (j10 == -1) {
            this.f6943q = j10;
        } else {
            y3.e.D(j10, "invalid idleTimeoutMillis %s", j10 >= n3.f6984z);
            this.f6943q = n3Var.f6993i;
        }
        this.Z = new s4(new u2(this), this.f6939m, this.f6932f.f7206a.L(), (q6.l) vVar.get());
        e8.e0 e0Var = n3Var.f6991g;
        y3.e.J(e0Var, "decompressorRegistry");
        this.f6940n = e0Var;
        e8.w wVar = n3Var.f6992h;
        y3.e.J(wVar, "compressorRegistry");
        this.f6941o = wVar;
        this.V = n3Var.f6996l;
        this.U = n3Var.f6997m;
        this.K = new v2(this, k4Var);
        this.L = new y(k4Var);
        e8.n0 n0Var = n3Var.f6999o;
        n0Var.getClass();
        this.O = n0Var;
        if (this.S) {
            return;
        }
        this.R = true;
    }

    public static void A(l3 l3Var) {
        if (!l3Var.I && l3Var.F.get() && l3Var.f6952z.isEmpty() && l3Var.C.isEmpty()) {
            l3Var.N.a(2, "Terminated");
            l1 l1Var = l3Var.f6935i;
            Executor executor = l3Var.f6934h;
            switch (l1Var.f6916a) {
                case 0:
                    break;
                default:
                    w5.b((v5) l1Var.f6917b, executor);
                    break;
            }
            l3Var.f6936j.a();
            l3Var.f6937k.a();
            l3Var.f6932f.close();
            l3Var.I = true;
            l3Var.J.countDown();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        if (r3 != null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static o1 D(String str, e8.u1 u1Var, e8.q1 q1Var) {
        URI uri;
        g1 g1VarA0;
        StringBuilder sb = new StringBuilder();
        try {
            uri = new URI(str);
        } catch (URISyntaxException e4) {
            sb.append(e4.getMessage());
            uri = null;
        }
        int i10 = 0;
        if (uri == null || (g1VarA0 = u1Var.a0(uri, q1Var)) == null) {
            String str2 = "";
            if (!f6920c0.matcher(str).matches()) {
                try {
                    g1VarA0 = u1Var.a0(new URI(u1Var.o0(), "", "/" + str, null), q1Var);
                } catch (URISyntaxException e10) {
                    throw new IllegalArgumentException(e10);
                }
            }
            Object[] objArr = new Object[2];
            objArr[0] = str;
            if (sb.length() > 0) {
                str2 = " (" + ((Object) sb) + ")";
            }
            objArr[1] = str2;
            throw new IllegalArgumentException(String.format("cannot find a NameResolver for %s%s", objArr));
        }
        r7.e eVar = new r7.e(20, i10);
        ScheduledExecutorService scheduledExecutorService = q1Var.f5350e;
        if (scheduledExecutorService == null) {
            throw new IllegalStateException("ScheduledExecutorService not set in Builder");
        }
        e8.h2 h2Var = q1Var.f5348c;
        return new m5(g1VarA0, new t(eVar, scheduledExecutorService, h2Var), h2Var);
    }

    public static void y(l3 l3Var) {
        l3Var.G(true);
        y0 y0Var = l3Var.D;
        y0Var.i(null);
        l3Var.N.a(2, "Entering IDLE state");
        l3Var.f6944r.c(e8.x.f5397d);
        Object[] objArr = {l3Var.B, y0Var};
        z1 z1Var = l3Var.X;
        z1Var.getClass();
        for (int i10 = 0; i10 < 2; i10++) {
            if (((Set) z1Var.f6226a).contains(objArr[i10])) {
                l3Var.C();
                return;
            }
        }
    }

    public static void z(l3 l3Var) {
        if (l3Var.G) {
            for (j2 j2Var : l3Var.f6952z) {
                j2Var.getClass();
                e8.c2 c2Var = f6921d0;
                b2 b2Var = new b2(j2Var, c2Var, 0);
                e8.h2 h2Var = j2Var.f6875k;
                h2Var.execute(b2Var);
                h2Var.execute(new b2(j2Var, c2Var, 1));
            }
            Iterator it = l3Var.C.iterator();
            if (it.hasNext()) {
                a7.a.w(it.next());
                throw null;
            }
        }
    }

    public final void B(boolean z10) {
        ScheduledFuture scheduledFuture;
        s4 s4Var = this.Z;
        s4Var.f7114f = false;
        if (!z10 || (scheduledFuture = s4Var.f7115g) == null) {
            return;
        }
        scheduledFuture.cancel(false);
        s4Var.f7115g = null;
    }

    public final void C() {
        this.f6939m.d();
        if (this.F.get() || this.f6951y) {
            return;
        }
        if (!((Set) this.X.f6226a).isEmpty()) {
            B(false);
        } else {
            E();
        }
        if (this.f6949w != null) {
            return;
        }
        this.N.a(2, "Exiting idle mode");
        c3 c3Var = new c3(this);
        s sVar = this.f6931e;
        sVar.getClass();
        i3.a0 a0Var = new i3.a0();
        a0Var.f7944d = sVar;
        a0Var.f7941a = c3Var;
        e8.b1 b1Var = sVar.f7082a;
        String str = sVar.f7083b;
        e8.a1 a1VarB = b1Var.b(str);
        a0Var.f7943c = a1VarB;
        if (a1VarB == null) {
            throw new IllegalStateException(l.q.k("Could not find policy '", str, "'. Make sure its implementation is either registered to LoadBalancerRegistry or included in META-INF/services/io.grpc.LoadBalancerProvider from your jar files."));
        }
        a0Var.f7942b = a1VarB.c(c3Var);
        c3Var.f6688a = a0Var;
        this.f6949w = c3Var;
        this.f6947u.q(new d3(this, c3Var, this.f6947u));
        this.f6948v = true;
    }

    public final void E() {
        long j10 = this.f6943q;
        if (j10 == -1) {
            return;
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        s4 s4Var = this.Z;
        s4Var.getClass();
        long nanos = timeUnit.toNanos(j10);
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        long jA = s4Var.f7112d.a(timeUnit2) + nanos;
        s4Var.f7114f = true;
        if (jA - s4Var.f7113e < 0 || s4Var.f7115g == null) {
            ScheduledFuture scheduledFuture = s4Var.f7115g;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            s4Var.f7115g = s4Var.f7109a.schedule(new r4(s4Var, 1, 0), nanos, timeUnit2);
        }
        s4Var.f7113e = jA;
    }

    public final void F() {
        this.N.a(1, "shutdown() called");
        int i10 = 0;
        if (this.F.compareAndSet(false, true)) {
            u2 u2Var = new u2(this, 3);
            e8.h2 h2Var = this.f6939m;
            h2Var.execute(u2Var);
            i3 i3Var = this.P;
            i3Var.f6853d.f6939m.execute(new f3(i3Var, i10));
            h2Var.execute(new u2(this, i10));
        }
    }

    public final void G(boolean z10) {
        this.f6939m.d();
        if (z10) {
            y3.e.N("nameResolver is not started", this.f6948v);
            y3.e.N("lbHelper is null", this.f6949w != null);
        }
        o1 o1Var = this.f6947u;
        if (o1Var != null) {
            o1Var.p();
            this.f6948v = false;
            if (z10) {
                this.f6947u = D(this.f6928b, this.f6929c, this.f6930d);
            } else {
                this.f6947u = null;
            }
        }
        c3 c3Var = this.f6949w;
        if (c3Var != null) {
            i3.a0 a0Var = c3Var.f6688a;
            ((e8.z0) a0Var.f7942b).f();
            a0Var.f7942b = null;
            this.f6949w = null;
        }
        this.f6950x = null;
    }

    @Override // e8.p0
    public final e8.q0 b() {
        return this.f6926a;
    }

    @Override // e8.j0
    public final String g() {
        return this.f6946t.g();
    }

    @Override // e8.j0
    public final e8.k m(e8.p1 p1Var, e8.h hVar) {
        return this.f6946t.m(p1Var, hVar);
    }

    @Override // e8.c1
    public final boolean s(long j10, TimeUnit timeUnit) {
        return this.J.await(j10, timeUnit);
    }

    @Override // e8.c1
    public final void t() {
        this.f6939m.execute(new u2(this, 1));
    }

    public final String toString() {
        q6.g gVarJ0 = f6.a.j0(this);
        gVarJ0.b("logId", this.f6926a.f5345c);
        gVarJ0.a(this.f6928b, "target");
        return gVarJ0.toString();
    }

    @Override // e8.c1
    public final e8.x u() {
        e8.x xVar = (e8.x) this.f6944r.f17261b;
        if (xVar == null) {
            throw new UnsupportedOperationException("Channel state API is not implemented");
        }
        if (xVar == e8.x.f5397d) {
            this.f6939m.execute(new u2(this, 2));
        }
        return xVar;
    }

    @Override // e8.c1
    public final void v(e8.x xVar, com.google.firebase.firestore.remote.f fVar) {
        this.f6939m.execute(new y2.a(this, fVar, xVar, 20));
    }

    @Override // e8.c1
    public final /* bridge */ /* synthetic */ e8.c1 w() {
        F();
        return this;
    }

    @Override // e8.c1
    public final e8.c1 x() {
        this.N.a(1, "shutdownNow() called");
        F();
        i3 i3Var = this.P;
        i3Var.f6853d.f6939m.execute(new f3(i3Var, 1));
        this.f6939m.execute(new u2(this, 4));
        return this;
    }
}
