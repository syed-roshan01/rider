package ba;

import ea.c0;
import ea.r;
import ea.y;
import ja.a0;
import ja.z;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import k6.f4;
import k6.w4;
import l.q;
import u1.z0;
import x9.b0;
import x9.d0;
import x9.o;
import x9.p;
import x9.s;
import x9.v;
import x9.w;
import x9.x;

/* JADX INFO: loaded from: classes.dex */
public final class k extends ea.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f2809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Socket f2810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Socket f2811d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public o f2812e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public x f2813f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public r f2814g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a0 f2815h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public z f2816i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f2817j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f2818k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2819l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f2820m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f2821n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2822o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f2823p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f2824q;

    public k(l lVar, d0 d0Var) {
        d7.a.m(lVar, "connectionPool");
        d7.a.m(d0Var, "route");
        this.f2809b = d0Var;
        this.f2822o = 1;
        this.f2823p = new ArrayList();
        this.f2824q = Long.MAX_VALUE;
    }

    public static void d(w wVar, d0 d0Var, IOException iOException) {
        d7.a.m(wVar, "client");
        d7.a.m(d0Var, "failedRoute");
        d7.a.m(iOException, "failure");
        if (d0Var.f16378b.type() != Proxy.Type.DIRECT) {
            x9.a aVar = d0Var.f16377a;
            aVar.f16326h.connectFailed(aVar.f16327i.g(), d0Var.f16378b.address(), iOException);
        }
        w4 w4Var = wVar.F;
        synchronized (w4Var) {
            ((Set) w4Var.f10455b).add(d0Var);
        }
    }

    @Override // ea.h
    public final synchronized void a(r rVar, c0 c0Var) {
        d7.a.m(rVar, "connection");
        d7.a.m(c0Var, "settings");
        this.f2822o = (c0Var.f5448a & 16) != 0 ? c0Var.f5449b[4] : Integer.MAX_VALUE;
    }

    @Override // ea.h
    public final void b(y yVar) {
        d7.a.m(yVar, "stream");
        yVar.c(ea.b.REFUSED_STREAM, null);
    }

    public final void c(int i10, int i11, int i12, boolean z10, i iVar, x9.n nVar) throws Throwable {
        d7.a.m(iVar, "call");
        d7.a.m(nVar, "eventListener");
        if (this.f2813f != null) {
            throw new IllegalStateException("already connected".toString());
        }
        List list = this.f2809b.f16377a.f16329k;
        f4 f4Var = new f4(list);
        x9.a aVar = this.f2809b.f16377a;
        if (aVar.f16321c == null) {
            if (!list.contains(x9.i.f16415f)) {
                throw new m(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.f2809b.f16377a.f16327i.f16458d;
            fa.m mVar = fa.m.f6417a;
            if (!fa.m.f6417a.h(str)) {
                throw new m(new UnknownServiceException(q.k("CLEARTEXT communication to ", str, " not permitted by network security policy")));
            }
        } else if (aVar.f16328j.contains(x.H2_PRIOR_KNOWLEDGE)) {
            throw new m(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        m mVar2 = null;
        while (true) {
            try {
                d0 d0Var = this.f2809b;
                if (d0Var.f16377a.f16321c == null || d0Var.f16378b.type() != Proxy.Type.HTTP) {
                    try {
                        e(i10, i11, iVar, nVar);
                    } catch (IOException e4) {
                        e = e4;
                        Socket socket = this.f2811d;
                        if (socket != null) {
                            y9.b.c(socket);
                        }
                        Socket socket2 = this.f2810c;
                        if (socket2 != null) {
                            y9.b.c(socket2);
                        }
                        this.f2811d = null;
                        this.f2810c = null;
                        this.f2815h = null;
                        this.f2816i = null;
                        this.f2812e = null;
                        this.f2813f = null;
                        this.f2814g = null;
                        this.f2822o = 1;
                        d0 d0Var2 = this.f2809b;
                        InetSocketAddress inetSocketAddress = d0Var2.f16379c;
                        Proxy proxy = d0Var2.f16378b;
                        d7.a.m(inetSocketAddress, "inetSocketAddress");
                        d7.a.m(proxy, "proxy");
                        if (mVar2 == null) {
                            mVar2 = new m(e);
                        } else {
                            d7.a.c(mVar2.f2830a, e);
                            mVar2.f2831b = e;
                        }
                        if (!z10) {
                            throw mVar2;
                        }
                        f4Var.f10022c = true;
                        if (!f4Var.f10021b) {
                            throw mVar2;
                        }
                        if (e instanceof ProtocolException) {
                            throw mVar2;
                        }
                        if (e instanceof InterruptedIOException) {
                            throw mVar2;
                        }
                        if ((e instanceof SSLHandshakeException) && (e.getCause() instanceof CertificateException)) {
                            throw mVar2;
                        }
                        if (e instanceof SSLPeerUnverifiedException) {
                            throw mVar2;
                        }
                        if (!(e instanceof SSLException)) {
                            throw mVar2;
                        }
                    }
                } else {
                    f(i10, i11, i12, iVar, nVar);
                    if (this.f2810c == null) {
                        break;
                    }
                }
                g(f4Var, iVar, nVar);
                d0 d0Var3 = this.f2809b;
                InetSocketAddress inetSocketAddress2 = d0Var3.f16379c;
                Proxy proxy2 = d0Var3.f16378b;
                d7.a.m(inetSocketAddress2, "inetSocketAddress");
                d7.a.m(proxy2, "proxy");
                break;
            } catch (IOException e10) {
                e = e10;
            }
        }
        d0 d0Var4 = this.f2809b;
        if (d0Var4.f16377a.f16321c != null && d0Var4.f16378b.type() == Proxy.Type.HTTP && this.f2810c == null) {
            throw new m(new ProtocolException("Too many tunnel connections attempted: 21"));
        }
        this.f2824q = System.nanoTime();
    }

    public final void e(int i10, int i11, i iVar, x9.n nVar) throws IOException {
        Socket socketCreateSocket;
        d0 d0Var = this.f2809b;
        Proxy proxy = d0Var.f16378b;
        x9.a aVar = d0Var.f16377a;
        Proxy.Type type = proxy.type();
        int i12 = type == null ? -1 : j.f2808a[type.ordinal()];
        if (i12 == 1 || i12 == 2) {
            socketCreateSocket = aVar.f16320b.createSocket();
            d7.a.j(socketCreateSocket);
        } else {
            socketCreateSocket = new Socket(proxy);
        }
        this.f2810c = socketCreateSocket;
        InetSocketAddress inetSocketAddress = this.f2809b.f16379c;
        nVar.getClass();
        d7.a.m(iVar, "call");
        d7.a.m(inetSocketAddress, "inetSocketAddress");
        socketCreateSocket.setSoTimeout(i11);
        try {
            fa.m mVar = fa.m.f6417a;
            fa.m.f6417a.e(socketCreateSocket, this.f2809b.f16379c, i10);
            try {
                this.f2815h = r9.a.c(r9.a.p(socketCreateSocket));
                this.f2816i = r9.a.b(r9.a.n(socketCreateSocket));
            } catch (NullPointerException e4) {
                if (d7.a.d(e4.getMessage(), "throw with null exception")) {
                    throw new IOException(e4);
                }
            }
        } catch (ConnectException e10) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f2809b.f16379c);
            connectException.initCause(e10);
            throw connectException;
        }
    }

    public final void f(int i10, int i11, int i12, i iVar, x9.n nVar) throws IOException {
        x9.y yVar = new x9.y();
        d0 d0Var = this.f2809b;
        s sVar = d0Var.f16377a.f16327i;
        d7.a.m(sVar, "url");
        yVar.f16501a = sVar;
        yVar.d("CONNECT", null);
        x9.a aVar = d0Var.f16377a;
        yVar.c("Host", y9.b.t(aVar.f16327i, true));
        yVar.c("Proxy-Connection", "Keep-Alive");
        yVar.c("User-Agent", "okhttp/4.12.0");
        l.r rVarA = yVar.a();
        x9.a0 a0Var = new x9.a0();
        a0Var.f16330a = rVarA;
        a0Var.f16331b = x.HTTP_1_1;
        a0Var.f16332c = 407;
        a0Var.f16333d = "Preemptive Authenticate";
        a0Var.f16336g = y9.b.f17002c;
        a0Var.f16340k = -1L;
        a0Var.f16341l = -1L;
        p pVar = a0Var.f16335f;
        pVar.getClass();
        q8.k.c("Proxy-Authenticate");
        q8.k.e("OkHttp-Preemptive", "Proxy-Authenticate");
        pVar.d("Proxy-Authenticate");
        pVar.a("Proxy-Authenticate", "OkHttp-Preemptive");
        a0Var.a();
        ((x9.n) aVar.f16324f).getClass();
        s sVar2 = (s) rVarA.f10910b;
        e(i10, i11, iVar, nVar);
        String str = "CONNECT " + y9.b.t(sVar2, true) + " HTTP/1.1";
        a0 a0Var2 = this.f2815h;
        d7.a.j(a0Var2);
        z zVar = this.f2816i;
        d7.a.j(zVar);
        da.h hVar = new da.h(null, this, a0Var2, zVar);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        a0Var2.f8501a.c().g(i11, timeUnit);
        zVar.f8585a.c().g(i12, timeUnit);
        hVar.j((x9.q) rVarA.f10912d, str);
        hVar.c();
        x9.a0 a0VarG = hVar.g(false);
        d7.a.j(a0VarG);
        a0VarG.f16330a = rVarA;
        b0 b0VarA = a0VarG.a();
        long jI = y9.b.i(b0VarA);
        if (jI != -1) {
            da.e eVarI = hVar.i(jI);
            y9.b.r(eVarI, Integer.MAX_VALUE, timeUnit);
            eVarI.close();
        }
        int i13 = b0VarA.f16347d;
        if (i13 != 200) {
            if (i13 != 407) {
                throw new IOException(q.g("Unexpected response code for CONNECT: ", i13));
            }
            ((x9.n) aVar.f16324f).getClass();
            throw new IOException("Failed to authenticate with proxy");
        }
        if (!a0Var2.f8502b.B() || !zVar.f8586b.B()) {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void g(f4 f4Var, i iVar, x9.n nVar) throws Throwable {
        x9.a aVar = this.f2809b.f16377a;
        SSLSocketFactory sSLSocketFactory = aVar.f16321c;
        x xVarR = x.HTTP_1_1;
        if (sSLSocketFactory == null) {
            List list = aVar.f16328j;
            x xVar = x.H2_PRIOR_KNOWLEDGE;
            if (!list.contains(xVar)) {
                this.f2811d = this.f2810c;
                this.f2813f = xVarR;
                return;
            } else {
                this.f2811d = this.f2810c;
                this.f2813f = xVar;
                l();
                return;
            }
        }
        nVar.getClass();
        d7.a.m(iVar, "call");
        x9.a aVar2 = this.f2809b.f16377a;
        SSLSocketFactory sSLSocketFactory2 = aVar2.f16321c;
        SSLSocket sSLSocket = null;
        String strF = null;
        try {
            d7.a.j(sSLSocketFactory2);
            Socket socket = this.f2810c;
            s sVar = aVar2.f16327i;
            Socket socketCreateSocket = sSLSocketFactory2.createSocket(socket, sVar.f16458d, sVar.f16459e, true);
            d7.a.k(socketCreateSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            SSLSocket sSLSocket2 = (SSLSocket) socketCreateSocket;
            try {
                x9.i iVarA = f4Var.a(sSLSocket2);
                if (iVarA.f16417b) {
                    fa.m mVar = fa.m.f6417a;
                    fa.m.f6417a.d(sSLSocket2, aVar2.f16327i.f16458d, aVar2.f16328j);
                }
                sSLSocket2.startHandshake();
                SSLSession session = sSLSocket2.getSession();
                d7.a.l(session, "sslSocketSession");
                o oVarH = q8.k.h(session);
                HostnameVerifier hostnameVerifier = aVar2.f16322d;
                d7.a.j(hostnameVerifier);
                if (hostnameVerifier.verify(aVar2.f16327i.f16458d, session)) {
                    x9.f fVar = aVar2.f16323e;
                    d7.a.j(fVar);
                    this.f2812e = new o(oVarH.f16440a, oVarH.f16441b, oVarH.f16442c, new z.p(fVar, oVarH, aVar2, 9));
                    fVar.a(aVar2.f16327i.f16458d, new z0(this, 15));
                    if (iVarA.f16417b) {
                        fa.m mVar2 = fa.m.f6417a;
                        strF = fa.m.f6417a.f(sSLSocket2);
                    }
                    this.f2811d = sSLSocket2;
                    this.f2815h = r9.a.c(r9.a.p(sSLSocket2));
                    this.f2816i = r9.a.b(r9.a.n(sSLSocket2));
                    if (strF != null) {
                        xVarR = v.r(strF);
                    }
                    this.f2813f = xVarR;
                    fa.m mVar3 = fa.m.f6417a;
                    fa.m.f6417a.a(sSLSocket2);
                    if (this.f2813f == x.HTTP_2) {
                        l();
                        return;
                    }
                    return;
                }
                List listA = oVarH.a();
                if (!(!listA.isEmpty())) {
                    throw new SSLPeerUnverifiedException("Hostname " + aVar2.f16327i.f16458d + " not verified (no certificates)");
                }
                Object obj = listA.get(0);
                d7.a.k(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                X509Certificate x509Certificate = (X509Certificate) obj;
                StringBuilder sb = new StringBuilder("\n              |Hostname ");
                sb.append(aVar2.f16327i.f16458d);
                sb.append(" not verified:\n              |    certificate: ");
                x9.f fVar2 = x9.f.f16387c;
                StringBuilder sb2 = new StringBuilder("sha256/");
                ja.j jVar = ja.j.f8539d;
                byte[] encoded = x509Certificate.getPublicKey().getEncoded();
                d7.a.l(encoded, "publicKey.encoded");
                sb2.append(fa.l.k(encoded).c("SHA-256").a());
                sb.append(sb2.toString());
                sb.append("\n              |    DN: ");
                sb.append(x509Certificate.getSubjectDN().getName());
                sb.append("\n              |    subjectAltNames: ");
                sb.append(r8.p.P0(ia.c.a(x509Certificate, 2), ia.c.a(x509Certificate, 7)));
                sb.append("\n              ");
                throw new SSLPeerUnverifiedException(z6.a.r0(sb.toString()));
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    fa.m mVar4 = fa.m.f6417a;
                    fa.m.f6417a.a(sSLSocket);
                }
                if (sSLSocket != null) {
                    y9.b.c(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final boolean h(x9.a aVar, List list) {
        o oVar;
        d7.a.m(aVar, "address");
        byte[] bArr = y9.b.f17000a;
        if (this.f2823p.size() < this.f2822o && !this.f2817j) {
            d0 d0Var = this.f2809b;
            if (!d0Var.f16377a.a(aVar)) {
                return false;
            }
            s sVar = aVar.f16327i;
            String str = sVar.f16458d;
            x9.a aVar2 = d0Var.f16377a;
            if (d7.a.d(str, aVar2.f16327i.f16458d)) {
                return true;
            }
            if (this.f2814g != null && list != null) {
                List<d0> list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    for (d0 d0Var2 : list2) {
                        Proxy.Type type = d0Var2.f16378b.type();
                        Proxy.Type type2 = Proxy.Type.DIRECT;
                        if (type == type2 && d0Var.f16378b.type() == type2) {
                            if (d7.a.d(d0Var.f16379c, d0Var2.f16379c)) {
                                if (aVar.f16322d == ia.c.f8193a) {
                                    byte[] bArr2 = y9.b.f17000a;
                                    s sVar2 = aVar2.f16327i;
                                    if (sVar.f16459e != sVar2.f16459e) {
                                        break;
                                    }
                                    String str2 = sVar2.f16458d;
                                    String str3 = sVar.f16458d;
                                    if (!d7.a.d(str3, str2)) {
                                        if (!this.f2818k && (oVar = this.f2812e) != null) {
                                            List listA = oVar.a();
                                            if (!(!listA.isEmpty())) {
                                                break;
                                            }
                                            Object obj = listA.get(0);
                                            d7.a.k(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                                            if (!ia.c.c(str3, (X509Certificate) obj)) {
                                                break;
                                            }
                                        } else {
                                            break;
                                            break;
                                        }
                                    }
                                    try {
                                        x9.f fVar = aVar.f16323e;
                                        d7.a.j(fVar);
                                        o oVar2 = this.f2812e;
                                        d7.a.j(oVar2);
                                        List listA2 = oVar2.a();
                                        d7.a.m(str3, "hostname");
                                        d7.a.m(listA2, "peerCertificates");
                                        fVar.a(str3, new z.p(fVar, listA2, str3, 8));
                                        return true;
                                    } catch (SSLPeerUnverifiedException unused) {
                                        break;
                                    }
                                }
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean i(boolean z10) {
        long j10;
        byte[] bArr = y9.b.f17000a;
        long jNanoTime = System.nanoTime();
        Socket socket = this.f2810c;
        d7.a.j(socket);
        Socket socket2 = this.f2811d;
        d7.a.j(socket2);
        a0 a0Var = this.f2815h;
        d7.a.j(a0Var);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        r rVar = this.f2814g;
        if (rVar != null) {
            synchronized (rVar) {
                if (rVar.f5500n) {
                    return false;
                }
                return rVar.f5509w >= rVar.f5508v || jNanoTime < rVar.f5510x;
            }
        }
        synchronized (this) {
            j10 = jNanoTime - this.f2824q;
        }
        if (j10 < 10000000000L || !z10) {
            return true;
        }
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                return !a0Var.B();
            } finally {
                socket2.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public final ca.d j(w wVar, ca.f fVar) {
        Socket socket = this.f2811d;
        d7.a.j(socket);
        a0 a0Var = this.f2815h;
        d7.a.j(a0Var);
        z zVar = this.f2816i;
        d7.a.j(zVar);
        r rVar = this.f2814g;
        if (rVar != null) {
            return new ea.s(wVar, this, fVar, rVar);
        }
        int i10 = fVar.f3069g;
        socket.setSoTimeout(i10);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        a0Var.f8501a.c().g(i10, timeUnit);
        zVar.f8585a.c().g(fVar.f3070h, timeUnit);
        return new da.h(wVar, this, a0Var, zVar);
    }

    public final synchronized void k() {
        this.f2817j = true;
    }

    public final void l() throws SocketException {
        String strConcat;
        int i10;
        Socket socket = this.f2811d;
        d7.a.j(socket);
        a0 a0Var = this.f2815h;
        d7.a.j(a0Var);
        z zVar = this.f2816i;
        d7.a.j(zVar);
        int i11 = 0;
        socket.setSoTimeout(0);
        aa.f fVar = aa.f.f1351i;
        ea.f fVar2 = new ea.f(fVar);
        String str = this.f2809b.f16377a.f16327i.f16458d;
        d7.a.m(str, "peerName");
        fVar2.f5459c = socket;
        if (fVar2.f5457a) {
            strConcat = y9.b.f17005f + ' ' + str;
        } else {
            strConcat = "MockWebServer ".concat(str);
        }
        d7.a.m(strConcat, "<set-?>");
        fVar2.f5460d = strConcat;
        fVar2.f5461e = a0Var;
        fVar2.f5462f = zVar;
        fVar2.f5463g = this;
        fVar2.f5465i = 0;
        r rVar = new r(fVar2);
        this.f2814g = rVar;
        c0 c0Var = r.I;
        this.f2822o = (c0Var.f5448a & 16) != 0 ? c0Var.f5449b[4] : Integer.MAX_VALUE;
        ea.z zVar2 = rVar.F;
        synchronized (zVar2) {
            try {
                if (zVar2.f5563e) {
                    throw new IOException("closed");
                }
                if (zVar2.f5560b) {
                    Logger logger = ea.z.f5558n;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(y9.b.g(">> CONNECTION " + ea.e.f5453a.e(), new Object[0]));
                    }
                    zVar2.f5559a.z(ea.e.f5453a);
                    zVar2.f5559a.flush();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ea.z zVar3 = rVar.F;
        c0 c0Var2 = rVar.f5511y;
        synchronized (zVar3) {
            try {
                d7.a.m(c0Var2, "settings");
                if (zVar3.f5563e) {
                    throw new IOException("closed");
                }
                zVar3.b(0, Integer.bitCount(c0Var2.f5448a) * 6, 4, 0);
                int i12 = 0;
                while (i12 < 10) {
                    if (((1 << i12) & c0Var2.f5448a) != 0) {
                        if (i12 != 4) {
                            i10 = i12 != 7 ? i12 : 4;
                        } else {
                            i10 = 3;
                        }
                        zVar3.f5559a.m(i10);
                        zVar3.f5559a.s(c0Var2.f5449b[i12]);
                    }
                    i12++;
                }
                zVar3.f5559a.flush();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int iA = rVar.f5511y.a();
        if (iA != 65535) {
            rVar.F.N(0, iA - 65535);
        }
        fVar.f().c(new aa.b(i11, rVar.G, rVar.f5497d), 0L);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        d0 d0Var = this.f2809b;
        sb.append(d0Var.f16377a.f16327i.f16458d);
        sb.append(':');
        sb.append(d0Var.f16377a.f16327i.f16459e);
        sb.append(", proxy=");
        sb.append(d0Var.f16378b);
        sb.append(" hostAddress=");
        sb.append(d0Var.f16379c);
        sb.append(" cipherSuite=");
        o oVar = this.f2812e;
        if (oVar == null || (obj = oVar.f16441b) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f2813f);
        sb.append('}');
        return sb.toString();
    }
}
