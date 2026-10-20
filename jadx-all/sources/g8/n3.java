package g8;

import java.lang.reflect.InvocationTargetException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes.dex */
public final class n3 extends e8.d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l1 f6985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l1 f6986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f6987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e8.u1 f6988d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f6989e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f6990f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e8.e0 f6991g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e8.w f6992h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f6993i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f6994j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f6995k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f6996l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f6997m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f6998n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final e8.n0 f6999o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f7000p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f7001q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f7002r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f7003s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f7004t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f7005u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final h8.g f7006v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final m3 f7007w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Logger f6982x = Logger.getLogger(n3.class.getName());

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final long f6983y = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final long f6984z = TimeUnit.SECONDS.toMillis(1);
    public static final l1 A = new l1(s1.f7100p);
    public static final e8.e0 B = e8.e0.f5235d;
    public static final e8.w C = e8.w.f5389b;

    public n3(String str, h8.g gVar, k6.w4 w4Var) {
        e8.v1 v1Var;
        l1 l1Var = A;
        this.f6985a = l1Var;
        this.f6986b = l1Var;
        this.f6987c = new ArrayList();
        Logger logger = e8.v1.f5383e;
        synchronized (e8.v1.class) {
            try {
                if (e8.v1.f5384f == null) {
                    ArrayList arrayList = new ArrayList();
                    try {
                        boolean z10 = h1.f6823x;
                        arrayList.add(h1.class);
                    } catch (ClassNotFoundException e4) {
                        e8.v1.f5383e.log(Level.FINE, "Unable to find DNS NameResolver", (Throwable) e4);
                    }
                    List<e8.t1> listS = z6.a.S(e8.t1.class, Collections.unmodifiableList(arrayList), e8.t1.class.getClassLoader(), new r7.e((l.q) null));
                    if (listS.isEmpty()) {
                        e8.v1.f5383e.warning("No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
                    }
                    e8.v1.f5384f = new e8.v1();
                    for (e8.t1 t1Var : listS) {
                        e8.v1.f5383e.fine("Service loader found " + t1Var);
                        e8.v1 v1Var2 = e8.v1.f5384f;
                        synchronized (v1Var2) {
                            y3.e.G("isAvailable() returned false", t1Var.P());
                            v1Var2.f5387c.add(t1Var);
                        }
                    }
                    e8.v1.f5384f.a();
                }
                v1Var = e8.v1.f5384f;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f6988d = v1Var.f5385a;
        this.f6990f = "pick_first";
        this.f6991g = B;
        this.f6992h = C;
        this.f6993i = f6983y;
        this.f6994j = 5;
        this.f6995k = 5;
        this.f6996l = 16777216L;
        this.f6997m = 1048576L;
        this.f6998n = true;
        this.f6999o = e8.n0.f5319e;
        this.f7000p = true;
        this.f7001q = true;
        this.f7002r = true;
        this.f7003s = true;
        this.f7004t = true;
        this.f7005u = true;
        y3.e.J(str, "target");
        this.f6989e = str;
        this.f7006v = gVar;
        this.f7007w = w4Var;
    }

    @Override // e8.d1
    public final e8.c1 a() {
        SSLSocketFactory sSLSocketFactory;
        h8.i iVar = this.f7006v.f7626a;
        boolean z10 = iVar.f7655h != Long.MAX_VALUE;
        l1 l1Var = iVar.f7650c;
        l1 l1Var2 = iVar.f7651d;
        int iE = t.k.e(iVar.f7654g);
        if (iE == 0) {
            try {
                if (iVar.f7652e == null) {
                    iVar.f7652e = SSLContext.getInstance("Default", i8.k.f8157d.f8158a).getSocketFactory();
                }
                sSLSocketFactory = iVar.f7652e;
            } catch (GeneralSecurityException e4) {
                throw new RuntimeException("TLS Provider failure", e4);
            }
        } else {
            if (iE != 1) {
                throw new RuntimeException("Unknown negotiation type: ".concat(a7.a.G(iVar.f7654g)));
            }
            sSLSocketFactory = null;
        }
        h8.h hVar = new h8.h(l1Var, l1Var2, sSLSocketFactory, iVar.f7653f, z10, iVar.f7655h, iVar.f7656i, iVar.f7657j, iVar.f7658k, iVar.f7649b);
        r7.e eVar = new r7.e(20, 0);
        l1 l1Var3 = new l1(s1.f7100p);
        x9.v vVar = s1.f7102r;
        ArrayList arrayList = new ArrayList(this.f6987c);
        synchronized (e8.j0.class) {
        }
        if (this.f7001q) {
            try {
                Class<?> cls = Class.forName("io.grpc.census.InternalCensusStatsAccessor");
                Class<?> cls2 = Boolean.TYPE;
                a7.a.w(cls.getDeclaredMethod("getClientInterceptor", cls2, cls2, cls2, cls2).invoke(null, Boolean.valueOf(this.f7002r), Boolean.valueOf(this.f7003s), Boolean.FALSE, Boolean.valueOf(this.f7004t)));
            } catch (ClassNotFoundException e10) {
                f6982x.log(Level.FINE, "Unable to apply census stats", (Throwable) e10);
            } catch (IllegalAccessException e11) {
                f6982x.log(Level.FINE, "Unable to apply census stats", (Throwable) e11);
            } catch (NoSuchMethodException e12) {
                f6982x.log(Level.FINE, "Unable to apply census stats", (Throwable) e12);
            } catch (InvocationTargetException e13) {
                f6982x.log(Level.FINE, "Unable to apply census stats", (Throwable) e13);
            }
        }
        if (this.f7005u) {
            try {
                a7.a.w(Class.forName("io.grpc.census.InternalCensusTracingAccessor").getDeclaredMethod("getClientInterceptor", new Class[0]).invoke(null, new Object[0]));
            } catch (ClassNotFoundException e14) {
                f6982x.log(Level.FINE, "Unable to apply census stats", (Throwable) e14);
            } catch (IllegalAccessException e15) {
                f6982x.log(Level.FINE, "Unable to apply census stats", (Throwable) e15);
            } catch (NoSuchMethodException e16) {
                f6982x.log(Level.FINE, "Unable to apply census stats", (Throwable) e16);
            } catch (InvocationTargetException e17) {
                f6982x.log(Level.FINE, "Unable to apply census stats", (Throwable) e17);
            }
        }
        return new p3(new l3(this, hVar, eVar, l1Var3, vVar, arrayList));
    }
}
