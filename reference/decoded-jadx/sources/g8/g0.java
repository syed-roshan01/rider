package g8;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class g0 extends e8.k {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Logger f6767t = Logger.getLogger(g0.class.getName());

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final byte[] f6768u = "gzip".getBytes(Charset.forName("US-ASCII"));

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final double f6769v = TimeUnit.SECONDS.toNanos(1) * 1.0d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e8.p1 f6770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o8.c f6771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f6772c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f6773d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y f6774e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e8.b0 f6775f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile ScheduledFuture f6776g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f6777h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public e8.h f6778i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public h0 f6779j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile boolean f6780k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f6781l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f6782m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final z5.k f6783n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ScheduledExecutorService f6785p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f6786q;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final u f6784o = new u(this);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public e8.e0 f6787r = e8.e0.f5235d;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public e8.w f6788s = e8.w.f5389b;

    public g0(e8.p1 p1Var, Executor executor, e8.h hVar, z5.k kVar, ScheduledExecutorService scheduledExecutorService, y yVar) {
        this.f6770a = p1Var;
        String str = p1Var.f5334b;
        System.identityHashCode(this);
        o8.a aVar = o8.b.f12664a;
        aVar.getClass();
        this.f6771b = o8.a.f12662a;
        boolean z10 = true;
        if (executor == u6.a.f15417a) {
            this.f6772c = new o5();
            this.f6773d = true;
        } else {
            this.f6772c = new r5(executor);
            this.f6773d = false;
        }
        this.f6774e = yVar;
        this.f6775f = e8.b0.b();
        e8.o1 o1Var = e8.o1.f5328a;
        e8.o1 o1Var2 = p1Var.f5333a;
        if (o1Var2 != o1Var && o1Var2 != e8.o1.f5329b) {
            z10 = false;
        }
        this.f6777h = z10;
        this.f6778i = hVar;
        this.f6783n = kVar;
        this.f6785p = scheduledExecutorService;
        aVar.getClass();
    }

    public final void a(String str, Throwable th) {
        if (str == null && th == null) {
            th = new CancellationException("Cancelled without a message or cause");
            f6767t.log(Level.WARNING, "Cancelling without a message or cause is suboptimal", th);
        }
        if (this.f6781l) {
            return;
        }
        this.f6781l = true;
        try {
            if (this.f6779j != null) {
                e8.c2 c2Var = e8.c2.f5217f;
                e8.c2 c2VarG = str != null ? c2Var.g(str) : c2Var.g("Call cancelled without message");
                if (th != null) {
                    c2VarG = c2VarG.f(th);
                }
                this.f6779j.i(c2VarG);
            }
        } finally {
            b();
        }
    }

    public final void b() {
        this.f6775f.getClass();
        ScheduledFuture scheduledFuture = this.f6776g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    public final void c(Object obj) {
        y3.e.N("Not started", this.f6779j != null);
        y3.e.N("call was cancelled", !this.f6781l);
        y3.e.N("call was half-closed", !this.f6782m);
        try {
            h0 h0Var = this.f6779j;
            if (h0Var instanceof y2) {
                ((y2) h0Var).z(obj);
            } else {
                h0Var.l(this.f6770a.d(obj));
            }
            if (this.f6777h) {
                return;
            }
            this.f6779j.flush();
        } catch (Error e4) {
            this.f6779j.i(e8.c2.f5217f.g("Client sendMessage() failed with Error"));
            throw e4;
        } catch (RuntimeException e10) {
            this.f6779j.i(e8.c2.f5217f.f(e10).g("Failed to stream message"));
        }
    }

    @Override // e8.k
    public final void cancel(String str, Throwable th) {
        o8.b.d();
        try {
            o8.b.a();
            a(str, th);
            o8.b.f12664a.getClass();
        } catch (Throwable th2) {
            try {
                o8.b.f12664a.getClass();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0064  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r8v9, types: [byte[], java.io.Serializable] */
    public final void d(e8.j jVar, e8.l1 l1Var) {
        e8.s sVar;
        h0 y2Var;
        e8.h hVar;
        y3.e.N("Already started", this.f6779j == null);
        y3.e.N("call was cancelled", !this.f6781l);
        y3.e.J(jVar, "observer");
        y3.e.J(l1Var, "headers");
        this.f6775f.getClass();
        e8.h hVar2 = this.f6778i;
        v6.d dVar = q3.f7054g;
        q3 q3Var = (q3) hVar2.a(dVar);
        if (q3Var != null) {
            Long l10 = q3Var.f7055a;
            if (l10 != null) {
                long jLongValue = l10.longValue();
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                r7.e eVar = e8.c0.f5208d;
                if (timeUnit == null) {
                    throw new NullPointerException("units");
                }
                e8.c0 c0Var = new e8.c0(timeUnit.toNanos(jLongValue));
                e8.c0 c0Var2 = this.f6778i.f5267a;
                if (c0Var2 != null) {
                    c0Var.a(c0Var2);
                    if (c0Var.f5213b - c0Var2.f5213b < 0) {
                        e8.h hVar3 = this.f6778i;
                        hVar3.getClass();
                        e8.g gVarB = e8.h.b(hVar3);
                        gVarB.f5248a = c0Var;
                        this.f6778i = new e8.h(gVarB);
                    }
                } else {
                    e8.h hVar4 = this.f6778i;
                    hVar4.getClass();
                    e8.g gVarB2 = e8.h.b(hVar4);
                    gVarB2.f5248a = c0Var;
                    this.f6778i = new e8.h(gVarB2);
                }
            }
            Boolean bool = q3Var.f7056b;
            if (bool != null) {
                if (bool.booleanValue()) {
                    e8.h hVar5 = this.f6778i;
                    hVar5.getClass();
                    e8.g gVarB3 = e8.h.b(hVar5);
                    gVarB3.f5255h = Boolean.TRUE;
                    hVar = new e8.h(gVarB3);
                } else {
                    e8.h hVar6 = this.f6778i;
                    hVar6.getClass();
                    e8.g gVarB4 = e8.h.b(hVar6);
                    gVarB4.f5255h = Boolean.FALSE;
                    hVar = new e8.h(gVarB4);
                }
                this.f6778i = hVar;
            }
            Integer num = q3Var.f7057c;
            if (num != null) {
                e8.h hVar7 = this.f6778i;
                Integer num2 = hVar7.f5275i;
                if (num2 != null) {
                    int iMin = Math.min(num2.intValue(), num.intValue());
                    y3.e.F("invalid maxsize %s", iMin, iMin >= 0);
                    e8.g gVarB5 = e8.h.b(hVar7);
                    gVarB5.f5256i = Integer.valueOf(iMin);
                    this.f6778i = new e8.h(gVarB5);
                } else {
                    int iIntValue = num.intValue();
                    y3.e.F("invalid maxsize %s", iIntValue, iIntValue >= 0);
                    e8.g gVarB6 = e8.h.b(hVar7);
                    gVarB6.f5256i = Integer.valueOf(iIntValue);
                    this.f6778i = new e8.h(gVarB6);
                }
            }
            Integer num3 = q3Var.f7058d;
            if (num3 != null) {
                e8.h hVar8 = this.f6778i;
                Integer num4 = hVar8.f5276j;
                if (num4 != null) {
                    int iMin2 = Math.min(num4.intValue(), num3.intValue());
                    y3.e.F("invalid maxsize %s", iMin2, iMin2 >= 0);
                    e8.g gVarB7 = e8.h.b(hVar8);
                    gVarB7.f5257j = Integer.valueOf(iMin2);
                    this.f6778i = new e8.h(gVarB7);
                } else {
                    int iIntValue2 = num3.intValue();
                    y3.e.F("invalid maxsize %s", iIntValue2, iIntValue2 >= 0);
                    e8.g gVarB8 = e8.h.b(hVar8);
                    gVarB8.f5257j = Integer.valueOf(iIntValue2);
                    this.f6778i = new e8.h(gVarB8);
                }
            }
        }
        String str = this.f6778i.f5271e;
        e8.r rVar = e8.r.f5354a;
        if (str != null) {
            e8.s sVar2 = (e8.s) this.f6788s.f5390a.get(str);
            if (sVar2 == null) {
                this.f6779j = d4.f6728a;
                this.f6772c.execute(new d0(this, jVar, str));
                return;
            }
            sVar = sVar2;
        } else {
            sVar = rVar;
        }
        e8.e0 e0Var = this.f6787r;
        boolean z10 = this.f6786q;
        l1Var.a(s1.f7092h);
        e8.g1 g1Var = s1.f7088d;
        l1Var.a(g1Var);
        if (sVar != rVar) {
            l1Var.f(g1Var, sVar.c());
        }
        e8.j1 j1Var = s1.f7089e;
        l1Var.a(j1Var);
        ?? r10 = e0Var.f5237b;
        if (r10.length != 0) {
            l1Var.f(j1Var, r10);
        }
        l1Var.a(s1.f7090f);
        e8.j1 j1Var2 = s1.f7091g;
        l1Var.a(j1Var2);
        if (z10) {
            l1Var.f(j1Var2, f6768u);
        }
        e8.c0 c0Var3 = this.f6778i.f5267a;
        this.f6775f.getClass();
        e8.c0 c0Var4 = c0Var3 == null ? null : c0Var3;
        if (c0Var4 == null || !c0Var4.b()) {
            this.f6775f.getClass();
            e8.c0 c0Var5 = this.f6778i.f5267a;
            Level level = Level.FINE;
            Logger logger = f6767t;
            if (logger.isLoggable(level) && c0Var4 != null && c0Var4.equals(null)) {
                TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                long jMax = Math.max(0L, c0Var4.c(timeUnit2));
                Locale locale = Locale.US;
                StringBuilder sb = new StringBuilder(String.format(locale, "Call timeout set to '%d' ns, due to context deadline.", Long.valueOf(jMax)));
                if (c0Var5 == null) {
                    sb.append(" Explicit call timeout was not set.");
                } else {
                    sb.append(String.format(locale, " Explicit call timeout was '%d' ns.", Long.valueOf(c0Var5.c(timeUnit2))));
                }
                logger.fine(sb.toString());
            }
            z5.k kVar = this.f6783n;
            e8.p1 p1Var = this.f6770a;
            e8.h hVar9 = this.f6778i;
            e8.b0 b0Var = this.f6775f;
            if (((l3) kVar.f17260a).W) {
                q3 q3Var2 = (q3) hVar9.a(dVar);
                y2Var = new y2(kVar, p1Var, l1Var, hVar9, q3Var2 == null ? null : q3Var2.f7059e, q3Var2 == null ? null : q3Var2.f7060f, b0Var);
            } else {
                k0 k0VarB = kVar.b(new j4(p1Var, l1Var, hVar9));
                e8.b0 b0VarA = b0Var.a();
                try {
                    y2Var = k0VarB.d(p1Var, l1Var, hVar9, s1.c(hVar9, l1Var, 0, false));
                    b0Var.c(b0VarA);
                } catch (Throwable th) {
                    b0Var.c(b0VarA);
                    throw th;
                }
            }
            this.f6779j = y2Var;
        } else {
            e8.p[] pVarArrC = s1.c(this.f6778i, l1Var, 0, false);
            e8.c0 c0Var6 = this.f6778i.f5267a;
            this.f6775f.getClass();
            this.f6779j = new j1(e8.c2.f5219h.g(String.format("ClientCall started after %s deadline was exceeded .9%f seconds ago", c0Var6 == null ? "Context" : "CallOptions", Double.valueOf(c0Var4.c(TimeUnit.NANOSECONDS) / f6769v))), i0.f6839a, pVarArrC);
        }
        if (this.f6773d) {
            this.f6779j.n();
        }
        String str2 = this.f6778i.f5269c;
        if (str2 != null) {
            this.f6779j.m(str2);
        }
        Integer num5 = this.f6778i.f5275i;
        if (num5 != null) {
            this.f6779j.b(num5.intValue());
        }
        Integer num6 = this.f6778i.f5276j;
        if (num6 != null) {
            this.f6779j.e(num6.intValue());
        }
        if (c0Var4 != null) {
            this.f6779j.g(c0Var4);
        }
        this.f6779j.d(sVar);
        boolean z11 = this.f6786q;
        if (z11) {
            this.f6779j.q(z11);
        }
        this.f6779j.h(this.f6787r);
        y yVar = this.f6774e;
        yVar.f7241b.a();
        ((k4) yVar.f7240a).a();
        this.f6779j.j(new f0(this, jVar));
        e8.b0 b0Var2 = this.f6775f;
        u uVar = this.f6784o;
        b0Var2.getClass();
        if (uVar == null) {
            throw new NullPointerException("cancellationListener");
        }
        Logger logger2 = e8.b0.f5198a;
        if (c0Var4 != null) {
            this.f6775f.getClass();
            if (!c0Var4.equals(null) && this.f6785p != null) {
                TimeUnit timeUnit3 = TimeUnit.NANOSECONDS;
                long jC = c0Var4.c(timeUnit3);
                this.f6776g = this.f6785p.schedule(new r2(new w1(this, jC, 1)), jC, timeUnit3);
            }
        }
        if (this.f6780k) {
            b();
        }
    }

    @Override // e8.k
    public final e8.c getAttributes() {
        h0 h0Var = this.f6779j;
        return h0Var != null ? h0Var.p() : e8.c.f5206b;
    }

    @Override // e8.k
    public final void halfClose() {
        o8.b.d();
        try {
            o8.b.a();
            y3.e.N("Not started", this.f6779j != null);
            y3.e.N("call was cancelled", !this.f6781l);
            y3.e.N("call already half-closed", !this.f6782m);
            this.f6782m = true;
            this.f6779j.o();
            o8.b.f12664a.getClass();
        } catch (Throwable th) {
            try {
                o8.b.f12664a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // e8.k
    public final boolean isReady() {
        if (this.f6782m) {
            return false;
        }
        return this.f6779j.k();
    }

    @Override // e8.k
    public final void request(int i10) {
        o8.b.d();
        try {
            o8.b.a();
            y3.e.N("Not started", this.f6779j != null);
            y3.e.G("Number requested must be non-negative", i10 >= 0);
            this.f6779j.a(i10);
            o8.b.f12664a.getClass();
        } catch (Throwable th) {
            try {
                o8.b.f12664a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // e8.k
    public final void sendMessage(Object obj) {
        o8.b.d();
        try {
            o8.b.a();
            c(obj);
            o8.b.f12664a.getClass();
        } catch (Throwable th) {
            try {
                o8.b.f12664a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // e8.k
    public final void setMessageCompression(boolean z10) {
        y3.e.N("Not started", this.f6779j != null);
        this.f6779j.c(z10);
    }

    @Override // e8.k
    public final void start(e8.j jVar, e8.l1 l1Var) {
        o8.b.d();
        try {
            o8.b.a();
            d(jVar, l1Var);
            o8.b.f12664a.getClass();
        } catch (Throwable th) {
            try {
                o8.b.f12664a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final String toString() {
        q6.g gVarJ0 = f6.a.j0(this);
        gVarJ0.a(this.f6770a, FirebaseAnalytics.Param.METHOD);
        return gVarJ0.toString();
    }
}
