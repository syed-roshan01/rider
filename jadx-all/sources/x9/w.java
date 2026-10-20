package x9;

import java.net.ProxySelector;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import k6.w4;

/* JADX INFO: loaded from: classes.dex */
public final class w implements Cloneable, d {
    public static final List G = y9.b.j(x.HTTP_2, x.HTTP_1_1);
    public static final List H = y9.b.j(i.f16414e, i.f16415f);
    public final f A;
    public final f6.a B;
    public final int C;
    public final int D;
    public final int E;
    public final w4 F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f16474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w4 f16475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f16476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f16477d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b.b f16478e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f16479f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final n f16480n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f16481o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f16482p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n f16483q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final n f16484r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ProxySelector f16485s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final n f16486t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final SocketFactory f16487u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final SSLSocketFactory f16488v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final X509TrustManager f16489w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final List f16490x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final List f16491y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ia.c f16492z;

    public w() throws NoSuchAlgorithmException, KeyStoreException {
        l lVar = new l();
        w4 w4Var = new w4(22);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        n nVar = n.f16439d;
        byte[] bArr = y9.b.f17000a;
        b.b bVar = new b.b(nVar, 15);
        n nVar2 = b.f16343a;
        n nVar3 = k.f16433b;
        n nVar4 = m.f16438c;
        SocketFactory socketFactory = SocketFactory.getDefault();
        d7.a.l(socketFactory, "getDefault()");
        List list = H;
        List list2 = G;
        ia.c cVar = ia.c.f8193a;
        f fVar = f.f16387c;
        this.f16474a = lVar;
        this.f16475b = w4Var;
        this.f16476c = y9.b.u(arrayList);
        this.f16477d = y9.b.u(arrayList2);
        this.f16478e = bVar;
        this.f16479f = true;
        this.f16480n = nVar2;
        this.f16481o = true;
        this.f16482p = true;
        this.f16483q = nVar3;
        this.f16484r = nVar4;
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.f16485s = proxySelector == null ? ha.a.f7721a : proxySelector;
        this.f16486t = nVar2;
        this.f16487u = socketFactory;
        this.f16490x = list;
        this.f16491y = list2;
        this.f16492z = cVar;
        this.C = 10000;
        this.D = 10000;
        this.E = 10000;
        this.F = new w4(23);
        List list3 = list;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator it = list3.iterator();
            while (true) {
                if (!it.hasNext()) {
                    this.f16488v = null;
                    this.B = null;
                    this.f16489w = null;
                    this.A = f.f16387c;
                    break;
                }
                if (((i) it.next()).f16416a) {
                    fa.m mVar = fa.m.f6417a;
                    X509TrustManager x509TrustManagerM = fa.m.f6417a.m();
                    this.f16489w = x509TrustManagerM;
                    fa.m mVar2 = fa.m.f6417a;
                    d7.a.j(x509TrustManagerM);
                    this.f16488v = mVar2.l(x509TrustManagerM);
                    f6.a aVarB = fa.m.f6417a.b(x509TrustManagerM);
                    this.B = aVarB;
                    d7.a.j(aVarB);
                    this.A = d7.a.d(fVar.f16389b, aVarB) ? fVar : new f(fVar.f16388a, aVarB);
                    break;
                }
            }
        } else {
            this.f16488v = null;
            this.B = null;
            this.f16489w = null;
            this.A = f.f16387c;
            break;
        }
        List list4 = this.f16476c;
        d7.a.k(list4, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (!(!list4.contains(null))) {
            throw new IllegalStateException(("Null interceptor: " + list4).toString());
        }
        List list5 = this.f16477d;
        d7.a.k(list5, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (!(true ^ list5.contains(null))) {
            throw new IllegalStateException(("Null network interceptor: " + list5).toString());
        }
        List list6 = this.f16490x;
        boolean z10 = list6 instanceof Collection;
        X509TrustManager x509TrustManager = this.f16489w;
        f6.a aVar = this.B;
        SSLSocketFactory sSLSocketFactory = this.f16488v;
        if (!z10 || !list6.isEmpty()) {
            Iterator it2 = list6.iterator();
            while (it2.hasNext()) {
                if (((i) it2.next()).f16416a) {
                    if (sSLSocketFactory == null) {
                        throw new IllegalStateException("sslSocketFactory == null".toString());
                    }
                    if (aVar == null) {
                        throw new IllegalStateException("certificateChainCleaner == null".toString());
                    }
                    if (x509TrustManager == null) {
                        throw new IllegalStateException("x509TrustManager == null".toString());
                    }
                    return;
                }
            }
        }
        if (sSLSocketFactory != null) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (aVar != null) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (x509TrustManager != null) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!d7.a.d(this.A, f.f16387c)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public final Object clone() {
        return super.clone();
    }
}
