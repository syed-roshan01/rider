package h8;

import e8.j2;
import g8.e6;
import g8.k4;
import g8.l1;
import g8.n3;
import g8.q2;
import g8.s1;
import java.util.EnumSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocketFactory;
import k6.w4;
import l.t2;

/* JADX INFO: loaded from: classes.dex */
public final class i extends g8.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final i8.b f7645l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final long f7646m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final l1 f7647n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n3 f7648a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SSLSocketFactory f7652e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k4 f7649b = e6.f6746c;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l1 f7650c = f7647n;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l1 f7651d = new l1(s1.f7101q);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i8.b f7653f = f7645l;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f7654g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f7655h = Long.MAX_VALUE;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f7656i = s1.f7096l;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f7657j = 65535;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f7658k = Integer.MAX_VALUE;

    static {
        Logger.getLogger(i.class.getName());
        t2 t2Var = new t2(i8.b.f8124e);
        t2Var.a(i8.a.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, i8.a.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, i8.a.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, i8.a.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, i8.a.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, i8.a.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256);
        t2Var.b(i8.m.TLS_1_2);
        if (!t2Var.f10940a) {
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        t2Var.f10941b = true;
        f7645l = new i8.b(t2Var);
        f7646m = TimeUnit.DAYS.toNanos(1000L);
        f7647n = new l1(new r7.e(25, 0));
        EnumSet.of(j2.f5290a, j2.f5291b);
    }

    public i(String str) {
        this.f7648a = new n3(str, new g(this), new w4(this));
    }

    public static i forTarget(String str) {
        return new i(str);
    }

    @Override // e8.d1
    public final void b(TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(30L);
        this.f7655h = nanos;
        long jMax = Math.max(nanos, q2.f7042l);
        this.f7655h = jMax;
        if (jMax >= f7646m) {
            this.f7655h = Long.MAX_VALUE;
        }
    }

    @Override // e8.d1
    public final void c() {
        this.f7654g = 2;
    }

    public i scheduledExecutorService(ScheduledExecutorService scheduledExecutorService) {
        y3.e.J(scheduledExecutorService, "scheduledExecutorService");
        this.f7651d = new l1(scheduledExecutorService);
        return this;
    }

    public i sslSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.f7652e = sSLSocketFactory;
        this.f7654g = 1;
        return this;
    }

    public i transportExecutor(Executor executor) {
        if (executor == null) {
            this.f7650c = f7647n;
        } else {
            this.f7650c = new l1(executor);
        }
        return this;
    }
}
