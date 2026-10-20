package g8;

import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f7085a = Logger.getLogger(s1.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f7086b = Collections.unmodifiableSet(EnumSet.of(e8.z1.OK, e8.z1.INVALID_ARGUMENT, e8.z1.NOT_FOUND, e8.z1.ALREADY_EXISTS, e8.z1.FAILED_PRECONDITION, e8.z1.ABORTED, e8.z1.OUT_OF_RANGE, e8.z1.DATA_LOSS));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e8.g1 f7087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e8.g1 f7088d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e8.j1 f7089e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e8.g1 f7090f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final e8.j1 f7091g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final e8.g1 f7092h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final e8.g1 f7093i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final e8.g1 f7094j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final e8.g1 f7095k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f7096l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final l4 f7097m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final v6.d f7098n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final q1 f7099o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final r7.e f7100p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final r7.e f7101q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final x9.v f7102r;

    static {
        Charset.forName("US-ASCII");
        f7087c = new e8.g1("grpc-timeout", new x9.v(1));
        x9.v vVar = e8.l1.f5303d;
        f7088d = new e8.g1("grpc-encoding", vVar);
        f7089e = e8.r0.a("grpc-accept-encoding", new x9.v());
        f7090f = new e8.g1("content-encoding", vVar);
        f7091g = e8.r0.a("accept-encoding", new x9.v());
        f7092h = new e8.g1("content-length", vVar);
        f7093i = new e8.g1("content-type", vVar);
        f7094j = new e8.g1("te", vVar);
        f7095k = new e8.g1("user-agent", vVar);
        q6.c.f13202v.getClass();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f7096l = timeUnit.toNanos(20L);
        TimeUnit.HOURS.toNanos(2L);
        timeUnit.toNanos(20L);
        f7097m = new l4();
        f7098n = new v6.d(8, "io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER", (Serializable) null);
        f7099o = new q1();
        int i10 = 0;
        f7100p = new r7.e(21, i10);
        f7101q = new r7.e(22, i10);
        f7102r = new x9.v(i10);
    }

    public static URI a(String str) {
        y3.e.J(str, "authority");
        try {
            return new URI(null, str, null, null, null);
        } catch (URISyntaxException e4) {
            throw new IllegalArgumentException("Invalid authority: ".concat(str), e4);
        }
    }

    public static void b(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e4) {
            f7085a.log(Level.WARNING, "exception caught in closeQuietly", (Throwable) e4);
        }
    }

    public static e8.p[] c(e8.h hVar, e8.l1 l1Var, int i10, boolean z10) {
        List list = hVar.f5273g;
        int size = list.size();
        e8.p[] pVarArr = new e8.p[size + 1];
        e8.h hVar2 = e8.h.f5266k;
        e8.o oVar = new e8.o(hVar, i10, z10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            pVarArr[i11] = ((e8.n) list.get(i11)).a(oVar, l1Var);
        }
        pVarArr[size] = f7099o;
        return pVarArr;
    }

    public static String d(InetSocketAddress inetSocketAddress) {
        try {
            return (String) InetSocketAddress.class.getMethod("getHostString", new Class[0]).invoke(inetSocketAddress, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return inetSocketAddress.getHostName();
        }
    }

    public static u6.c e(String str) {
        Boolean bool = Boolean.TRUE;
        String.format(Locale.ROOT, str, 0);
        return new u6.c(Executors.defaultThreadFactory(), str, new AtomicLong(0L), bool, null, null);
    }

    public static k0 f(e8.v0 v0Var, boolean z10) {
        u3 u3Var;
        e8.x0 x0Var = v0Var.f5379a;
        if (x0Var == null) {
            u3Var = null;
        } else {
            j2 j2Var = (j2) x0Var.e();
            u3Var = j2Var.f6886v;
            if (u3Var == null) {
                j2Var.f6875k.execute(new a2(j2Var, 1));
                u3Var = null;
            }
        }
        if (u3Var != null) {
            e8.n nVar = v0Var.f5380b;
            return nVar == null ? u3Var : new k1(nVar, u3Var);
        }
        e8.c2 c2Var = v0Var.f5381c;
        if (!c2Var.e()) {
            if (v0Var.f5382d) {
                return new k1(h(c2Var), i0.f6841c);
            }
            if (!z10) {
                return new k1(h(c2Var), i0.f6839a);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0029  */
    /* JADX WARN: Code duplicated, block: B:25:0x0035  */
    public static e8.c2 g(int i10) {
        e8.z1 z1Var;
        if ((i10 >= 100 && i10 < 200) || i10 == 400) {
            z1Var = e8.z1.INTERNAL;
        } else if (i10 == 401) {
            z1Var = e8.z1.UNAUTHENTICATED;
        } else if (i10 == 403) {
            z1Var = e8.z1.PERMISSION_DENIED;
        } else if (i10 == 404) {
            z1Var = e8.z1.UNIMPLEMENTED;
        } else if (i10 == 429) {
            z1Var = e8.z1.UNAVAILABLE;
        } else if (i10 != 431) {
            switch (i10) {
                case 502:
                case 503:
                case 504:
                    z1Var = e8.z1.UNAVAILABLE;
                    break;
                default:
                    z1Var = e8.z1.UNKNOWN;
                    break;
            }
        } else {
            z1Var = e8.z1.INTERNAL;
        }
        return z1Var.a().g("HTTP status code " + i10);
    }

    public static e8.c2 h(e8.c2 c2Var) {
        y3.e.H(c2Var != null);
        if (!f7086b.contains(c2Var.f5227a)) {
            return c2Var;
        }
        return e8.c2.f5223l.g("Inappropriate status code from control plane: " + c2Var.f5227a + " " + c2Var.f5228b).f(c2Var.f5229c);
    }
}
