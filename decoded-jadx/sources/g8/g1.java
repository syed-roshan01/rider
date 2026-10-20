package g8;

import java.io.IOException;
import java.io.StringReader;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class g1 extends e8.j0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Logger f6789s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Set f6790t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final boolean f6791u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final boolean f6792v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final boolean f6793w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static String f6794x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e8.w1 f6795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Random f6796b = new Random();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile e1 f6797c = e1.f6739a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f6798d = new AtomicReference();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f6799e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f6800f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f6801g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v5 f6802h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f6803i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e8.h2 f6804j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final q6.l f6805k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f6806l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f6807m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Executor f6808n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f6809o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n5 f6810p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f6811q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public e8.i f6812r;

    static {
        Logger logger = Logger.getLogger(g1.class.getName());
        f6789s = logger;
        f6790t = Collections.unmodifiableSet(new HashSet(Arrays.asList("clientLanguage", "percentage", "clientHostname", "serviceConfig")));
        String property = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi", "true");
        String property2 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi_localhost", "false");
        String property3 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_service_config", "false");
        f6791u = Boolean.parseBoolean(property);
        f6792v = Boolean.parseBoolean(property2);
        f6793w = Boolean.parseBoolean(property3);
        try {
            try {
                try {
                    a7.a.w(Class.forName("g8.k2", true, g1.class.getClassLoader()).asSubclass(f1.class).getConstructor(new Class[0]).newInstance(new Object[0]));
                    throw null;
                } catch (Exception e4) {
                    logger.log(Level.FINE, "Can't construct JndiResourceResolverFactory, skipping.", (Throwable) e4);
                }
            } catch (Exception e10) {
                logger.log(Level.FINE, "Can't find JndiResourceResolverFactory ctor, skipping.", (Throwable) e10);
            }
        } catch (ClassCastException e11) {
            logger.log(Level.FINE, "Unable to cast JndiResourceResolverFactory, skipping.", (Throwable) e11);
        } catch (ClassNotFoundException e12) {
            logger.log(Level.FINE, "Unable to find JndiResourceResolverFactory, skipping.", (Throwable) e12);
        }
    }

    public g1(String str, e8.q1 q1Var, r7.e eVar, q6.l lVar, boolean z10) {
        y3.e.J(q1Var, "args");
        this.f6802h = eVar;
        y3.e.J(str, "name");
        URI uriCreate = URI.create("//".concat(str));
        y3.e.E(str, "Invalid DNS name: %s", uriCreate.getHost() != null);
        String authority = uriCreate.getAuthority();
        if (authority == null) {
            throw new NullPointerException(f6.a.c0("nameUri (%s) doesn't have an authority", uriCreate));
        }
        this.f6799e = authority;
        this.f6800f = uriCreate.getHost();
        if (uriCreate.getPort() == -1) {
            this.f6801g = q1Var.f5346a;
        } else {
            this.f6801g = uriCreate.getPort();
        }
        e8.w1 w1Var = q1Var.f5347b;
        y3.e.J(w1Var, "proxyDetector");
        this.f6795a = w1Var;
        long nanos = 0;
        if (!z10) {
            String property = System.getProperty("networkaddress.cache.ttl");
            long j10 = 30;
            if (property != null) {
                try {
                    j10 = Long.parseLong(property);
                } catch (NumberFormatException unused) {
                    f6789s.log(Level.WARNING, "Property({0}) valid is not valid number format({1}), fall back to default({2})", new Object[]{"networkaddress.cache.ttl", property, 30L});
                }
            }
            nanos = j10 > 0 ? TimeUnit.SECONDS.toNanos(j10) : j10;
        }
        this.f6803i = nanos;
        this.f6805k = lVar;
        e8.h2 h2Var = q1Var.f5348c;
        y3.e.J(h2Var, "syncContext");
        this.f6804j = h2Var;
        Executor executor = q1Var.f5352g;
        this.f6808n = executor;
        this.f6809o = executor == null;
        n5 n5Var = q1Var.f5349d;
        y3.e.J(n5Var, "serviceConfigParser");
        this.f6810p = n5Var;
    }

    public static Map t(Map map, Random random, String str) {
        for (Map.Entry entry : map.entrySet()) {
            y3.e.J0(entry, "Bad key: %s", f6790t.contains(entry.getKey()));
        }
        List listD = m2.d("clientLanguage", map);
        if (listD != null && !listD.isEmpty()) {
            Iterator it = listD.iterator();
            while (it.hasNext()) {
                if ("java".equalsIgnoreCase((String) it.next())) {
                }
            }
            return null;
        }
        Double dE = m2.e("percentage", map);
        if (dE != null) {
            int iIntValue = dE.intValue();
            y3.e.J0(dE, "Bad percentage: %s", iIntValue >= 0 && iIntValue <= 100);
            if (random.nextInt(100) >= iIntValue) {
                return null;
            }
        }
        List listD2 = m2.d("clientHostname", map);
        if (listD2 != null && !listD2.isEmpty()) {
            Iterator it2 = listD2.iterator();
            while (it2.hasNext()) {
                if (((String) it2.next()).equals(str)) {
                }
            }
            return null;
        }
        Map mapG = m2.g("serviceConfig", map);
        if (mapG != null) {
            return mapG;
        }
        throw new androidx.fragment.app.a0(String.format("key '%s' missing in '%s'", map, "serviceConfig"));
    }

    public static ArrayList u(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.startsWith("grpc_config=")) {
                String strSubstring = str.substring(12);
                Logger logger = l2.f6918a;
                v7.a aVar = new v7.a(new StringReader(strSubstring));
                try {
                    Object objA = l2.a(aVar);
                    try {
                        aVar.close();
                    } catch (IOException e4) {
                        logger.log(Level.WARNING, "Failed to close", (Throwable) e4);
                    }
                    if (!(objA instanceof List)) {
                        throw new ClassCastException("wrong type " + objA);
                    }
                    List list2 = (List) objA;
                    m2.a(list2);
                    arrayList.addAll(list2);
                } catch (Throwable th) {
                    try {
                        aVar.close();
                    } catch (IOException e10) {
                        logger.log(Level.WARNING, "Failed to close", (Throwable) e10);
                    }
                    throw th;
                }
            } else {
                f6789s.log(Level.FINE, "Ignoring non service config {0}", new Object[]{str});
            }
        }
        return arrayList;
    }

    @Override // e8.j0
    public final String k() {
        return this.f6799e;
    }

    @Override // e8.j0
    public final void n() {
        y3.e.N("not started", this.f6812r != null);
        v();
    }

    @Override // e8.j0
    public final void p() {
        if (this.f6807m) {
            return;
        }
        this.f6807m = true;
        Executor executor = this.f6808n;
        if (executor == null || !this.f6809o) {
            return;
        }
        w5.b(this.f6802h, executor);
        this.f6808n = null;
    }

    @Override // e8.j0
    public final void q(e8.i iVar) {
        y3.e.N("already started", this.f6812r == null);
        if (this.f6809o) {
            this.f6808n = (Executor) w5.a(this.f6802h);
        }
        this.f6812r = iVar;
        v();
    }

    public final i3.a0 s() {
        e8.r1 r1Var;
        e8.r1 r1Var2;
        List listZ;
        e8.r1 r1Var3;
        boolean z10;
        String str = this.f6800f;
        i3.a0 a0Var = new i3.a0();
        try {
            a0Var.f7942b = w();
            if (f6793w) {
                List listEmptyList = Collections.emptyList();
                if (f6791u) {
                    if ("localhost".equalsIgnoreCase(str)) {
                        z10 = f6792v;
                    } else if (!str.contains(":")) {
                        boolean z11 = true;
                        for (int i10 = 0; i10 < str.length(); i10++) {
                            char cCharAt = str.charAt(i10);
                            if (cCharAt != '.') {
                                z11 &= cCharAt >= '0' && cCharAt <= '9';
                            }
                        }
                        z10 = true ^ z11;
                    }
                    if (z10) {
                        a7.a.w(this.f6798d.get());
                    }
                }
                Object r1Var4 = null;
                if (listEmptyList.isEmpty()) {
                    f6789s.log(Level.FINE, "No TXT records found for {0}", new Object[]{str});
                } else {
                    Random random = this.f6796b;
                    if (f6794x == null) {
                        try {
                            f6794x = InetAddress.getLocalHost().getHostName();
                        } catch (UnknownHostException e4) {
                            throw new RuntimeException(e4);
                        }
                    }
                    String str2 = f6794x;
                    try {
                        Iterator it = u(listEmptyList).iterator();
                        Map mapT = null;
                        while (it.hasNext()) {
                            try {
                                mapT = t((Map) it.next(), random, str2);
                                if (mapT != null) {
                                    break;
                                }
                            } catch (RuntimeException e10) {
                                r1Var = new e8.r1(e8.c2.f5218g.g("failed to pick service config choice").f(e10));
                            }
                        }
                        r1Var = mapT == null ? null : new e8.r1(mapT);
                    } catch (IOException | RuntimeException e11) {
                        r1Var = new e8.r1(e8.c2.f5218g.g("failed to parse TXT records").f(e11));
                    }
                    if (r1Var != null) {
                        e8.c2 c2Var = r1Var.f5357a;
                        if (c2Var != null) {
                            r1Var4 = new e8.r1(c2Var);
                        } else {
                            Map map = (Map) r1Var.f5358b;
                            n5 n5Var = this.f6810p;
                            n5Var.getClass();
                            try {
                                s sVar = n5Var.f7012d;
                                sVar.getClass();
                                if (map != null) {
                                    try {
                                        listZ = l.z(l.u(map));
                                    } catch (RuntimeException e12) {
                                        r1Var3 = new e8.r1(e8.c2.f5218g.g("can't parse load balancer configuration").f(e12));
                                    }
                                } else {
                                    listZ = null;
                                }
                                r1Var3 = (listZ == null || listZ.isEmpty()) ? null : l.x(listZ, sVar.f7082a);
                                if (r1Var3 != null) {
                                    e8.c2 c2Var2 = r1Var3.f5357a;
                                    if (c2Var2 != null) {
                                        r1Var4 = new e8.r1(c2Var2);
                                    } else {
                                        r1Var4 = r1Var3.f5358b;
                                    }
                                }
                                r1Var2 = new e8.r1(s3.a(map, n5Var.f7009a, n5Var.f7010b, n5Var.f7011c, r1Var4));
                            } catch (RuntimeException e13) {
                                r1Var2 = new e8.r1(e8.c2.f5218g.g("failed to parse service config").f(e13));
                            }
                            r1Var4 = r1Var2;
                        }
                    }
                }
                a0Var.f7943c = r1Var4;
            }
            return a0Var;
        } catch (Exception e14) {
            a0Var.f7941a = e8.c2.f5224m.g("Unable to resolve host " + str).f(e14);
            return a0Var;
        }
    }

    public final void v() {
        if (this.f6811q || this.f6807m) {
            return;
        }
        if (this.f6806l) {
            long j10 = this.f6803i;
            if (j10 != 0 && (j10 <= 0 || this.f6805k.a(TimeUnit.NANOSECONDS) <= j10)) {
                return;
            }
        }
        this.f6811q = true;
        this.f6808n.execute(new x1(this, this.f6812r));
    }

    public final List w() {
        try {
            try {
                e1 e1Var = this.f6797c;
                String str = this.f6800f;
                e1Var.getClass();
                List listUnmodifiableList = Collections.unmodifiableList(Arrays.asList(InetAddress.getAllByName(str)));
                ArrayList arrayList = new ArrayList(listUnmodifiableList.size());
                Iterator it = listUnmodifiableList.iterator();
                while (it.hasNext()) {
                    arrayList.add(new e8.g0(new InetSocketAddress((InetAddress) it.next(), this.f6801g)));
                }
                return Collections.unmodifiableList(arrayList);
            } catch (Exception e4) {
                Object obj = q6.q.f13221a;
                if (e4 instanceof RuntimeException) {
                    throw ((RuntimeException) e4);
                }
                if (e4 instanceof Error) {
                    throw ((Error) e4);
                }
                throw new RuntimeException(e4);
            }
        } catch (Throwable th) {
            if (0 != 0) {
                f6789s.log(Level.FINE, "Address resolution failure", (Throwable) null);
            }
            throw th;
        }
    }
}
