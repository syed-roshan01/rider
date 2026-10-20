package h8;

import com.google.firebase.analytics.FirebaseAnalytics;
import e8.c2;
import e8.d2;
import e8.k0;
import e8.l1;
import e8.o1;
import e8.p1;
import e8.q0;
import g8.e6;
import g8.h0;
import g8.i0;
import g8.k4;
import g8.o0;
import g8.o2;
import g8.p2;
import g8.q2;
import g8.r5;
import g8.s1;
import g8.t3;
import g8.w1;
import g8.x1;
import g8.y1;
import g8.y5;
import g8.z1;
import ja.z;
import java.io.EOFException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import k6.v6;
import k6.w4;
import o7.d0;

/* JADX INFO: loaded from: classes.dex */
public final class n implements o0, d, v {
    public static final Map S;
    public static final Logger T;
    public final SocketFactory A;
    public final SSLSocketFactory B;
    public final HostnameVerifier C;
    public int D;
    public final LinkedList E;
    public final i8.b F;
    public q2 G;
    public boolean H;
    public long I;
    public long J;
    public boolean K;
    public final Runnable L;
    public final int M;
    public final boolean N;
    public final e6 O;
    public final z1 P;
    public final k0 Q;
    public final int R;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InetSocketAddress f7672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Random f7675d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q6.m f7676e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f7677f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j8.m f7678g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public t3 f7679h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public e f7680i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public y5.o f7681j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f7682k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final q0 f7683l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f7684m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final HashMap f7685n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Executor f7686o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final r5 f7687p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ScheduledExecutorService f7688q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f7689r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f7690s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public v6 f7691t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public e8.c f7692u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public c2 f7693v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f7694w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public y1 f7695x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f7696y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f7697z;

    static {
        EnumMap enumMap = new EnumMap(j8.a.class);
        j8.a aVar = j8.a.NO_ERROR;
        c2 c2Var = c2.f5223l;
        enumMap.put(aVar, c2Var.g("No error: A GRPC status of OK should have been sent"));
        enumMap.put(j8.a.PROTOCOL_ERROR, c2Var.g("Protocol error"));
        enumMap.put(j8.a.INTERNAL_ERROR, c2Var.g("Internal error"));
        enumMap.put(j8.a.FLOW_CONTROL_ERROR, c2Var.g("Flow control error"));
        enumMap.put(j8.a.STREAM_CLOSED, c2Var.g("Stream closed"));
        enumMap.put(j8.a.FRAME_TOO_LARGE, c2Var.g("Frame too large"));
        enumMap.put(j8.a.REFUSED_STREAM, c2.f5224m.g("Refused stream"));
        enumMap.put(j8.a.CANCEL, c2.f5217f.g("Cancelled"));
        enumMap.put(j8.a.COMPRESSION_ERROR, c2Var.g("Compression error"));
        enumMap.put(j8.a.CONNECT_ERROR, c2Var.g("Connect error"));
        enumMap.put(j8.a.ENHANCE_YOUR_CALM, c2.f5222k.g("Enhance your calm"));
        enumMap.put(j8.a.INADEQUATE_SECURITY, c2.f5220i.g("Inadequate security"));
        S = Collections.unmodifiableMap(enumMap);
        T = Logger.getLogger(n.class.getName());
    }

    public n(h hVar, InetSocketAddress inetSocketAddress, String str, String str2, e8.c cVar, k0 k0Var, l.h hVar2) {
        x9.v vVar = s1.f7102r;
        j8.k kVar = new j8.k();
        this.f7675d = new Random();
        Object obj = new Object();
        this.f7682k = obj;
        this.f7685n = new HashMap();
        this.D = 0;
        this.E = new LinkedList();
        this.P = new z1(this, 2);
        this.R = 30000;
        y3.e.J(inetSocketAddress, "address");
        this.f7672a = inetSocketAddress;
        this.f7673b = str;
        this.f7689r = hVar.f7636q;
        this.f7677f = hVar.f7640u;
        Executor executor = hVar.f7628b;
        y3.e.J(executor, "executor");
        this.f7686o = executor;
        this.f7687p = new r5(hVar.f7628b);
        ScheduledExecutorService scheduledExecutorService = hVar.f7630d;
        y3.e.J(scheduledExecutorService, "scheduledExecutorService");
        this.f7688q = scheduledExecutorService;
        this.f7684m = 3;
        SocketFactory socketFactory = hVar.f7632f;
        this.A = socketFactory == null ? SocketFactory.getDefault() : socketFactory;
        this.B = hVar.f7633n;
        this.C = hVar.f7634o;
        i8.b bVar = hVar.f7635p;
        y3.e.J(bVar, "connectionSpec");
        this.F = bVar;
        y3.e.J(vVar, "stopwatchFactory");
        this.f7676e = vVar;
        this.f7678g = kVar;
        StringBuilder sb = new StringBuilder();
        if (str2 != null) {
            sb.append(str2);
            sb.append(' ');
        }
        sb.append("grpc-java-okhttp/1.57.2");
        this.f7674c = sb.toString();
        this.Q = k0Var;
        this.L = hVar2;
        this.M = hVar.f7642w;
        hVar.f7631e.getClass();
        this.O = new e6();
        this.f7683l = q0.a(n.class, inetSocketAddress.toString());
        e8.c cVar2 = e8.c.f5206b;
        e8.b bVar2 = g8.l.f6911b;
        IdentityHashMap identityHashMap = new IdentityHashMap(1);
        identityHashMap.put(bVar2, cVar);
        for (Map.Entry entry : cVar2.f5207a.entrySet()) {
            if (!identityHashMap.containsKey(entry.getKey())) {
                identityHashMap.put((e8.b) entry.getKey(), entry.getValue());
            }
        }
        this.f7692u = new e8.c(identityHashMap);
        this.N = hVar.f7643x;
        synchronized (obj) {
        }
    }

    public static void g(n nVar, String str) {
        j8.a aVar = j8.a.PROTOCOL_ERROR;
        nVar.getClass();
        nVar.s(0, aVar, w(aVar).a(str));
    }

    /* JADX WARN: Code duplicated, block: B:23:0x009a A[Catch: IOException -> 0x00b5, TryCatch #0 {IOException -> 0x00b5, blocks: (B:11:0x002b, B:13:0x0070, B:15:0x0078, B:21:0x008a, B:23:0x009a, B:29:0x00ac, B:26:0x00a3, B:27:0x00a8, B:18:0x0081, B:19:0x0086, B:32:0x00b9, B:33:0x00c7, B:36:0x00d4, B:40:0x00de, B:42:0x00e2, B:48:0x010c, B:49:0x0136, B:46:0x00f1, B:43:0x00e7), top: B:55:0x002b, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a3 A[Catch: IOException -> 0x00b5, TryCatch #0 {IOException -> 0x00b5, blocks: (B:11:0x002b, B:13:0x0070, B:15:0x0078, B:21:0x008a, B:23:0x009a, B:29:0x00ac, B:26:0x00a3, B:27:0x00a8, B:18:0x0081, B:19:0x0086, B:32:0x00b9, B:33:0x00c7, B:36:0x00d4, B:40:0x00de, B:42:0x00e2, B:48:0x010c, B:49:0x0136, B:46:0x00f1, B:43:0x00e7), top: B:55:0x002b, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x00a8 A[Catch: IOException -> 0x00b5, TryCatch #0 {IOException -> 0x00b5, blocks: (B:11:0x002b, B:13:0x0070, B:15:0x0078, B:21:0x008a, B:23:0x009a, B:29:0x00ac, B:26:0x00a3, B:27:0x00a8, B:18:0x0081, B:19:0x0086, B:32:0x00b9, B:33:0x00c7, B:36:0x00d4, B:40:0x00de, B:42:0x00e2, B:48:0x010c, B:49:0x0136, B:46:0x00f1, B:43:0x00e7), top: B:55:0x002b, inners: #1 }] */
    public static Socket h(n nVar, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, String str, String str2) throws d2 {
        String str3;
        w4 w4Var;
        int i10;
        String str4;
        Object obj;
        nVar.getClass();
        Socket socket = null;
        try {
            InetAddress address = inetSocketAddress2.getAddress();
            SocketFactory socketFactory = nVar.A;
            Socket socketCreateSocket = address != null ? socketFactory.createSocket(inetSocketAddress2.getAddress(), inetSocketAddress2.getPort()) : socketFactory.createSocket(inetSocketAddress2.getHostName(), inetSocketAddress2.getPort());
            try {
                socketCreateSocket.setTcpNoDelay(true);
                socketCreateSocket.setSoTimeout(nVar.R);
                ja.c cVarP = r9.a.p(socketCreateSocket);
                z zVarB = r9.a.b(r9.a.n(socketCreateSocket));
                v6.d dVarI = nVar.i(inetSocketAddress, str, str2);
                k8.a aVar = (k8.a) dVarI.f15907b;
                zVarB.V(String.format(Locale.US, "CONNECT %s:%d HTTP/1.1", aVar.f10626a, Integer.valueOf(aVar.f10627b)));
                zVarB.V("\r\n");
                int i11 = ((w4) dVarI.f15908c).i();
                for (int i12 = 0; i12 < i11; i12++) {
                    w4 w4Var2 = (w4) dVarI.f15908c;
                    int i13 = i12 * 2;
                    if (i13 >= 0) {
                        Object obj2 = w4Var2.f10455b;
                        if (i13 < ((String[]) obj2).length) {
                            str3 = ((String[]) obj2)[i13];
                        }
                        zVarB.V(str3);
                        zVarB.V(": ");
                        w4Var = (w4) dVarI.f15908c;
                        i10 = i13 + 1;
                        if (i10 >= 0) {
                            obj = w4Var.f10455b;
                            if (i10 >= ((String[]) obj).length) {
                                str4 = ((String[]) obj)[i10];
                            }
                            zVarB.V(str4);
                            zVarB.V("\r\n");
                        } else {
                            w4Var.getClass();
                        }
                        str4 = null;
                        zVarB.V(str4);
                        zVarB.V("\r\n");
                    } else {
                        w4Var2.getClass();
                    }
                    str3 = null;
                    zVarB.V(str3);
                    zVarB.V(": ");
                    w4Var = (w4) dVarI.f15908c;
                    i10 = i13 + 1;
                    if (i10 >= 0) {
                        obj = w4Var.f10455b;
                        if (i10 >= ((String[]) obj).length) {
                            str4 = ((String[]) obj)[i10];
                        }
                        zVarB.V(str4);
                        zVarB.V("\r\n");
                    } else {
                        w4Var.getClass();
                    }
                    str4 = null;
                    zVarB.V(str4);
                    zVarB.V("\r\n");
                }
                zVarB.V("\r\n");
                zVarB.flush();
                h0.i iVarB = h0.i.b(q(cVarP));
                while (!q(cVarP).equals("")) {
                }
                int i14 = iVarB.f7403b;
                if (i14 >= 200 && i14 < 300) {
                    socketCreateSocket.setSoTimeout(0);
                    return socketCreateSocket;
                }
                ja.g gVar = new ja.g();
                try {
                    socketCreateSocket.shutdownOutput();
                    cVarP.I(gVar, 1024L);
                } catch (IOException e4) {
                    gVar.n0("Unable to read body: " + e4.toString());
                }
                try {
                    socketCreateSocket.close();
                } catch (IOException unused) {
                }
                throw new d2(c2.f5224m.g(String.format(Locale.US, "Response returned from proxy was not successful (expected 2xx, got %d %s). Response body:\n%s", Integer.valueOf(iVarB.f7403b), (String) iVarB.f7405d, gVar.Q())));
            } catch (IOException e10) {
                e = e10;
                socket = socketCreateSocket;
                if (socket != null) {
                    s1.b(socket);
                }
                throw new d2(c2.f5224m.g("Failed trying to connect with proxy").f(e));
            }
        } catch (IOException e11) {
            e = e11;
        }
    }

    public static String q(ja.c cVar) throws EOFException {
        ja.g gVar = new ja.g();
        while (cVar.I(gVar, 1L) != -1) {
            if (gVar.f(gVar.f8534b - 1) == 10) {
                return gVar.K(Long.MAX_VALUE);
            }
        }
        throw new EOFException("\\n not found: " + gVar.i(gVar.f8534b).e());
    }

    public static c2 w(j8.a aVar) {
        c2 c2Var = (c2) S.get(aVar);
        if (c2Var != null) {
            return c2Var;
        }
        return c2.f5218g.g("Unknown http2 error code: " + aVar.f8445a);
    }

    @Override // g8.k0
    public final void a(o2 o2Var) {
        long jNextLong;
        y1 y1Var;
        boolean z10;
        u6.a aVar = u6.a.f15417a;
        synchronized (this.f7682k) {
            try {
                if (this.f7680i == null) {
                    throw new IllegalStateException();
                }
                int i10 = 0;
                if (this.f7696y) {
                    d2 d2VarM = m();
                    Logger logger = y1.f7256g;
                    try {
                        aVar.execute(new x1(o2Var, d2VarM, i10));
                    } catch (Throwable th) {
                        y1.f7256g.log(Level.SEVERE, "Failed to execute PingCallback", th);
                    }
                    return;
                }
                y1 y1Var2 = this.f7695x;
                if (y1Var2 != null) {
                    jNextLong = 0;
                    y1Var = y1Var2;
                    z10 = false;
                } else {
                    jNextLong = this.f7675d.nextLong();
                    q6.l lVar = (q6.l) this.f7676e.get();
                    lVar.b();
                    y1Var = new y1(jNextLong, lVar);
                    this.f7695x = y1Var;
                    this.O.getClass();
                    z10 = true;
                }
                if (z10) {
                    this.f7680i.X((int) (jNextLong >>> 32), false, (int) jNextLong);
                }
                synchronized (y1Var) {
                    try {
                        if (!y1Var.f7260d) {
                            y1Var.f7259c.put(o2Var, aVar);
                            return;
                        }
                        Throwable th2 = y1Var.f7261e;
                        Runnable x1Var = th2 != null ? new x1(o2Var, th2, i10) : new w1(o2Var, y1Var.f7262f, 0);
                        try {
                            aVar.execute(x1Var);
                        } catch (Throwable th3) {
                            y1.f7256g.log(Level.SEVERE, "Failed to execute PingCallback", th3);
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    @Override // e8.p0
    public final q0 b() {
        return this.f7683l;
    }

    @Override // g8.u3
    public final void c(c2 c2Var) {
        f(c2Var);
        synchronized (this.f7682k) {
            try {
                Iterator it = this.f7685n.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    it.remove();
                    ((l) entry.getValue()).f7668n.h(new l1(), c2Var, false);
                    o((l) entry.getValue());
                }
                for (l lVar : this.E) {
                    lVar.f7668n.i(c2Var, i0.f6842d, true, new l1());
                    o(lVar);
                }
                this.E.clear();
                v();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // g8.k0
    public final h0 d(p1 p1Var, l1 l1Var, e8.h hVar, e8.p[] pVarArr) throws Throwable {
        y3.e.J(p1Var, FirebaseAnalytics.Param.METHOD);
        y3.e.J(l1Var, "headers");
        e8.c cVar = this.f7692u;
        y5 y5Var = new y5(pVarArr);
        for (e8.p pVar : pVarArr) {
            pVar.s0(cVar, l1Var);
        }
        synchronized (this.f7682k) {
            try {
                try {
                    return new l(p1Var, l1Var, this.f7680i, this, this.f7681j, this.f7682k, this.f7689r, this.f7677f, this.f7673b, this.f7674c, y5Var, this.O, hVar, this.N);
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // g8.u3
    public final Runnable e(t3 t3Var) {
        this.f7679h = t3Var;
        if (this.H) {
            q2 q2Var = new q2(new p2(this), this.f7688q, this.I, this.J, this.K);
            this.G = q2Var;
            synchronized (q2Var) {
                if (q2Var.f7046d) {
                    q2Var.b();
                }
            }
        }
        c cVar = new c(this.f7687p, this);
        j8.m mVar = this.f7678g;
        z zVarB = r9.a.b(cVar);
        ((j8.k) mVar).getClass();
        b bVar = new b(cVar, new j8.j(zVarB));
        synchronized (this.f7682k) {
            e eVar = new e(this, bVar);
            this.f7680i = eVar;
            this.f7681j = new y5.o(this, eVar);
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f7687p.execute(new y2.a(this, countDownLatch, cVar, 22));
        try {
            r();
            countDownLatch.countDown();
            this.f7687p.execute(new h.a(this, 12));
            return null;
        } catch (Throwable th) {
            countDownLatch.countDown();
            throw th;
        }
    }

    @Override // g8.u3
    public final void f(c2 c2Var) {
        synchronized (this.f7682k) {
            try {
                if (this.f7693v != null) {
                    return;
                }
                this.f7693v = c2Var;
                this.f7679h.d(c2Var);
                v();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0190 A[EDGE_INSN: B:106:0x0190->B:157:0x023a BREAK  A[LOOP:9: B:144:0x0217->B:155:0x0236]] */
    /* JADX WARN: Code duplicated, block: B:107:0x0193  */
    /* JADX WARN: Code duplicated, block: B:109:0x019c  */
    /* JADX WARN: Code duplicated, block: B:112:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:114:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:121:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:126:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:133:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:136:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:203:0x0092 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x005b  */
    /* JADX WARN: Code duplicated, block: B:210:0x014c A[EDGE_INSN: B:210:0x014c->B:92:0x014c BREAK  A[LOOP:3: B:87:0x0136->B:91:0x0144], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x01ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x01d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:0x01d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:0x01cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:223:0x01c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:227:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:0x010e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:80:0x0115 A[LOOP:7: B:52:0x00ce->B:80:0x0115, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:88:0x0138  */
    /* JADX WARN: Code duplicated, block: B:91:0x0144 A[LOOP:3: B:87:0x0136->B:91:0x0144, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:94:0x0150  */
    public final v6.d i(InetSocketAddress inetSocketAddress, String str, String str2) {
        String strSubstring;
        int i10;
        String strQ;
        int i11;
        InetAddress byAddress;
        byte[] address;
        int i12;
        int i13;
        int i14;
        int i15;
        ja.g gVar;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        char cCharAt;
        int i23;
        int i24;
        int i25;
        int iA;
        int i26;
        h0.i iVar = new h0.i();
        iVar.f7404c = "https";
        String hostName = inetSocketAddress.getHostName();
        if (hostName == null) {
            throw new IllegalArgumentException("host == null");
        }
        int length = hostName.length();
        int i27 = 0;
        int iCharCount = 0;
        while (true) {
            if (iCharCount >= length) {
                strSubstring = hostName.substring(0, length);
                break;
            }
            if (hostName.charAt(iCharCount) == '%') {
                ja.g gVar2 = new ja.g();
                gVar2.m0(0, iCharCount, hostName);
                while (iCharCount < length) {
                    int iCodePointAt = hostName.codePointAt(iCharCount);
                    if (iCodePointAt != 37 || (i26 = iCharCount + 2) >= length) {
                        gVar2.o0(iCodePointAt);
                    } else {
                        int iA2 = k8.a.a(hostName.charAt(iCharCount + 1));
                        int iA3 = k8.a.a(hostName.charAt(i26));
                        if (iA2 == -1 || iA3 == -1) {
                            gVar2.o0(iCodePointAt);
                        } else {
                            gVar2.h0((iA2 << 4) + iA3);
                            iCharCount = i26;
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt);
                }
                strSubstring = gVar2.Q();
                break;
            }
            iCharCount++;
        }
        if (!strSubstring.startsWith("[") || !strSubstring.endsWith("]")) {
            try {
                String lowerCase = IDN.toASCII(strSubstring).toLowerCase(Locale.US);
                if (!lowerCase.isEmpty()) {
                    while (true) {
                        if (i10 >= lowerCase.length()) {
                            strQ = lowerCase;
                            break;
                        }
                        char cCharAt2 = lowerCase.charAt(i10);
                        i10 = (cCharAt2 > 31 && cCharAt2 < 127 && " #%/:?@[\\]".indexOf(cCharAt2) == -1) ? i10 + 1 : 0;
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
            strQ = null;
            break;
        }
        int length2 = strSubstring.length() - 1;
        int i28 = 16;
        byte[] bArr = new byte[16];
        int i29 = 0;
        int i30 = -1;
        int i31 = -1;
        int i32 = 1;
        while (true) {
            try {
                if (i32 < length2) {
                    if (i29 != i28) {
                        int i33 = i32 + 2;
                        if (i33 > length2 || !strSubstring.regionMatches(i32, "::", i27, 2)) {
                            if (i29 == 0) {
                                i23 = i32;
                                i24 = 0;
                                while (i23 < length2) {
                                    iA = k8.a.a(strSubstring.charAt(i23));
                                    if (iA == -1) {
                                        break;
                                        break;
                                    }
                                    i24 = (i24 << 4) + iA;
                                    i23++;
                                }
                                i25 = i23 - i32;
                                if (i25 == 0) {
                                }
                            } else if (strSubstring.regionMatches(i32, ":", i27, 1)) {
                                i32++;
                                i23 = i32;
                                i24 = 0;
                                while (i23 < length2) {
                                    iA = k8.a.a(strSubstring.charAt(i23));
                                    if (iA == -1) {
                                        break;
                                    }
                                    i24 = (i24 << 4) + iA;
                                    i23++;
                                }
                                i25 = i23 - i32;
                                if (i25 == 0 && i25 <= 4) {
                                    int i34 = i29 + 1;
                                    bArr[i29] = (byte) (255 & (i24 >>> 8));
                                    i29 += 2;
                                    bArr[i34] = (byte) (i24 & 255);
                                    i31 = i32;
                                    i32 = i23;
                                    i27 = 0;
                                    i28 = 16;
                                }
                            } else if (strSubstring.regionMatches(i32, ".", i27, 1)) {
                                int i35 = i29 - 2;
                                int i36 = i35;
                                int i37 = i31;
                                while (true) {
                                    if (i37 >= length2) {
                                        int i38 = i30;
                                        if (i36 == i29 + 2) {
                                            i29 += 2;
                                            i30 = i38;
                                            i11 = 16;
                                        }
                                        if (byAddress == null) {
                                            strQ = null;
                                            break;
                                        }
                                        address = byAddress.getAddress();
                                        i12 = 16;
                                        if (address.length == 16) {
                                            throw new AssertionError();
                                        }
                                        i13 = 0;
                                        i14 = 0;
                                        i15 = -1;
                                        while (i13 < address.length) {
                                            i17 = i13;
                                            while (i17 < i12 && address[i17] == 0 && address[i17 + 1] == 0) {
                                                i17 += 2;
                                                i12 = 16;
                                            }
                                            i18 = i17 - i13;
                                            if (i18 > i14) {
                                                i15 = i13;
                                                i14 = i18;
                                            }
                                            i13 = i17 + 2;
                                            i12 = 16;
                                        }
                                        gVar = new ja.g();
                                        i16 = 0;
                                        while (i16 < address.length) {
                                            if (i16 == i15) {
                                                gVar.h0(58);
                                                i16 += i14;
                                                if (i16 == 16) {
                                                    gVar.h0(58);
                                                }
                                            } else {
                                                if (i16 > 0) {
                                                    gVar.h0(58);
                                                }
                                                gVar.j0(((address[i16] & 255) << 8) | (address[i16 + 1] & 255));
                                                i16 += 2;
                                            }
                                        }
                                        strQ = gVar.Q();
                                    } else if (i36 != 16) {
                                        if (i36 == i35) {
                                            i19 = i37;
                                            i20 = 0;
                                            while (true) {
                                                i21 = i35;
                                                if (i19 < length2) {
                                                    cCharAt = strSubstring.charAt(i19);
                                                    i22 = i30;
                                                    if (cCharAt < '0' && cCharAt <= '9') {
                                                        if ((i20 != 0 || i37 == i19) && (i20 = ((i20 * 10) + cCharAt) - 48) <= 255) {
                                                            i19++;
                                                            i35 = i21;
                                                            i30 = i22;
                                                        }
                                                    }
                                                } else {
                                                    i22 = i30;
                                                }
                                                if (i19 - i37 == 0) {
                                                    bArr[i36] = (byte) i20;
                                                    i37 = i19;
                                                    i36++;
                                                    i35 = i21;
                                                    i30 = i22;
                                                }
                                            }
                                        } else if (strSubstring.charAt(i37) == '.') {
                                            i37++;
                                            i19 = i37;
                                            i20 = 0;
                                            while (true) {
                                                i21 = i35;
                                                if (i19 < length2) {
                                                    cCharAt = strSubstring.charAt(i19);
                                                    i22 = i30;
                                                    if (cCharAt < '0') {
                                                    }
                                                } else {
                                                    i22 = i30;
                                                }
                                                if (i19 - i37 == 0) {
                                                    bArr[i36] = (byte) i20;
                                                    i37 = i19;
                                                    i36++;
                                                    i35 = i21;
                                                    i30 = i22;
                                                }
                                                i19++;
                                                i35 = i21;
                                                i30 = i22;
                                            }
                                        }
                                    }
                                }
                            }
                        } else if (i30 == -1) {
                            i29 += 2;
                            if (i33 == length2) {
                                i30 = i29;
                                i11 = 16;
                            } else {
                                i32 = i33;
                                i30 = i29;
                                i23 = i32;
                                i24 = 0;
                                while (i23 < length2) {
                                    iA = k8.a.a(strSubstring.charAt(i23));
                                    if (iA == -1) {
                                        break;
                                        break;
                                    }
                                    i24 = (i24 << 4) + iA;
                                    i23++;
                                }
                                i25 = i23 - i32;
                                if (i25 == 0) {
                                }
                            }
                        }
                    }
                    byAddress = null;
                    if (byAddress == null) {
                        strQ = null;
                        break;
                    }
                    address = byAddress.getAddress();
                    i12 = 16;
                    if (address.length == 16) {
                        throw new AssertionError();
                    }
                    i13 = 0;
                    i14 = 0;
                    i15 = -1;
                    while (i13 < address.length) {
                        i17 = i13;
                        while (i17 < i12) {
                            i17 += 2;
                            i12 = 16;
                        }
                        i18 = i17 - i13;
                        if (i18 > i14) {
                            i15 = i13;
                            i14 = i18;
                        }
                        i13 = i17 + 2;
                        i12 = 16;
                    }
                    gVar = new ja.g();
                    i16 = 0;
                    while (i16 < address.length) {
                        if (i16 == i15) {
                            gVar.h0(58);
                            i16 += i14;
                            if (i16 == 16) {
                                gVar.h0(58);
                            }
                        } else {
                            if (i16 > 0) {
                                gVar.h0(58);
                            }
                            gVar.j0(((address[i16] & 255) << 8) | (address[i16 + 1] & 255));
                            i16 += 2;
                        }
                    }
                    strQ = gVar.Q();
                } else {
                    i11 = i28;
                }
                if (i29 != i11) {
                    if (i30 == -1) {
                        byAddress = null;
                    } else {
                        int i39 = i29 - i30;
                        System.arraycopy(bArr, i30, bArr, 16 - i39, i39);
                        Arrays.fill(bArr, i30, (16 - i29) + i30, (byte) 0);
                    }
                    if (byAddress == null) {
                        strQ = null;
                        break;
                    }
                    address = byAddress.getAddress();
                    i12 = 16;
                    if (address.length == 16) {
                        throw new AssertionError();
                    }
                    i13 = 0;
                    i14 = 0;
                    i15 = -1;
                    while (i13 < address.length) {
                        i17 = i13;
                        while (i17 < i12) {
                            i17 += 2;
                            i12 = 16;
                        }
                        i18 = i17 - i13;
                        if (i18 > i14) {
                            i15 = i13;
                            i14 = i18;
                        }
                        i13 = i17 + 2;
                        i12 = 16;
                    }
                    gVar = new ja.g();
                    i16 = 0;
                    while (i16 < address.length) {
                        if (i16 == i15) {
                            gVar.h0(58);
                            i16 += i14;
                            if (i16 == 16) {
                                gVar.h0(58);
                            }
                        } else {
                            if (i16 > 0) {
                                gVar.h0(58);
                            }
                            gVar.j0(((address[i16] & 255) << 8) | (address[i16 + 1] & 255));
                            i16 += 2;
                        }
                    }
                    strQ = gVar.Q();
                }
                byAddress = InetAddress.getByAddress(bArr);
                if (byAddress == null) {
                    strQ = null;
                    break;
                }
                address = byAddress.getAddress();
                i12 = 16;
                if (address.length == 16) {
                    throw new AssertionError();
                }
                i13 = 0;
                i14 = 0;
                i15 = -1;
                while (i13 < address.length) {
                    i17 = i13;
                    while (i17 < i12) {
                        i17 += 2;
                        i12 = 16;
                    }
                    i18 = i17 - i13;
                    if (i18 > i14) {
                        i15 = i13;
                        i14 = i18;
                    }
                    i13 = i17 + 2;
                    i12 = 16;
                }
                gVar = new ja.g();
                i16 = 0;
                while (i16 < address.length) {
                    if (i16 == i15) {
                        gVar.h0(58);
                        i16 += i14;
                        if (i16 == 16) {
                            gVar.h0(58);
                        }
                    } else {
                        if (i16 > 0) {
                            gVar.h0(58);
                        }
                        gVar.j0(((address[i16] & 255) << 8) | (address[i16 + 1] & 255));
                        i16 += 2;
                    }
                }
                strQ = gVar.Q();
            } catch (UnknownHostException unused2) {
                throw new AssertionError();
            }
        }
        if (strQ == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(hostName));
        }
        iVar.f7405d = strQ;
        int port = inetSocketAddress.getPort();
        if (port <= 0 || port > 65535) {
            throw new IllegalArgumentException(l.q.g("unexpected port: ", port));
        }
        iVar.f7403b = port;
        if (((String) iVar.f7404c) == null) {
            throw new IllegalStateException("scheme == null");
        }
        if (((String) iVar.f7405d) == null) {
            throw new IllegalStateException("host == null");
        }
        k8.a aVar = new k8.a(iVar);
        v6.d dVar = new v6.d(13);
        dVar.f15907b = aVar;
        dVar.d("Host", aVar.f10626a + ":" + aVar.f10627b);
        dVar.d("User-Agent", this.f7674c);
        if (str != null && str2 != null) {
            try {
                dVar.d("Proxy-Authorization", "Basic " + ja.j.l((str + ":" + str2).getBytes("ISO-8859-1")).a());
            } catch (UnsupportedEncodingException unused3) {
                throw new AssertionError();
            }
        }
        if (((k8.a) dVar.f15907b) != null) {
            return new v6.d(dVar, 0);
        }
        throw new IllegalStateException("url == null");
    }

    public final void j(int i10, c2 c2Var, i0 i0Var, boolean z10, j8.a aVar, l1 l1Var) {
        synchronized (this.f7682k) {
            try {
                l lVar = (l) this.f7685n.remove(Integer.valueOf(i10));
                if (lVar != null) {
                    if (aVar != null) {
                        this.f7680i.o(i10, j8.a.CANCEL);
                    }
                    if (c2Var != null) {
                        k kVar = lVar.f7668n;
                        if (l1Var == null) {
                            l1Var = new l1();
                        }
                        kVar.i(c2Var, i0Var, z10, l1Var);
                    }
                    if (!t()) {
                        v();
                        o(lVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final i3.v[] k() {
        i3.v[] vVarArr;
        i3.v vVar;
        synchronized (this.f7682k) {
            vVarArr = new i3.v[this.f7685n.size()];
            Iterator it = this.f7685n.values().iterator();
            int i10 = 0;
            while (it.hasNext()) {
                int i11 = i10 + 1;
                k kVar = ((l) it.next()).f7668n;
                synchronized (kVar.f7660x) {
                    vVar = kVar.K;
                }
                vVarArr[i10] = vVar;
                i10 = i11;
            }
        }
        return vVarArr;
    }

    public final int l() {
        URI uriA = s1.a(this.f7673b);
        return uriA.getPort() != -1 ? uriA.getPort() : this.f7672a.getPort();
    }

    public final d2 m() {
        synchronized (this.f7682k) {
            try {
                c2 c2Var = this.f7693v;
                if (c2Var != null) {
                    return new d2(c2Var);
                }
                return new d2(c2.f5224m.g("Connection closed"));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x000c  */
    public final boolean n(int i10) {
        boolean z10;
        synchronized (this.f7682k) {
            if (i10 < this.f7684m) {
                z10 = true;
                if ((i10 & 1) != 1) {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final void o(l lVar) {
        if (this.f7697z && this.E.isEmpty() && this.f7685n.isEmpty()) {
            this.f7697z = false;
            q2 q2Var = this.G;
            if (q2Var != null) {
                synchronized (q2Var) {
                    if (!q2Var.f7046d) {
                        int i10 = q2Var.f7047e;
                        if (i10 == 2 || i10 == 3) {
                            q2Var.f7047e = 1;
                        }
                        if (q2Var.f7047e == 4) {
                            q2Var.f7047e = 5;
                        }
                    }
                }
            }
        }
        if (lVar.f6650e) {
            this.P.f(lVar, false);
        }
    }

    public final void p(Exception exc) {
        s(0, j8.a.INTERNAL_ERROR, c2.f5224m.f(exc));
    }

    public final void r() {
        synchronized (this.f7682k) {
            try {
                this.f7680i.E();
                a4.k kVar = new a4.k(1);
                kVar.b(7, this.f7677f);
                this.f7680i.v(kVar);
                int i10 = this.f7677f;
                if (i10 > 65535) {
                    this.f7680i.N(0, i10 - 65535);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void s(int i10, j8.a aVar, c2 c2Var) {
        synchronized (this.f7682k) {
            try {
                if (this.f7693v == null) {
                    this.f7693v = c2Var;
                    this.f7679h.d(c2Var);
                }
                if (aVar != null && !this.f7694w) {
                    this.f7694w = true;
                    this.f7680i.d(aVar, new byte[0]);
                }
                Iterator it = this.f7685n.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (((Integer) entry.getKey()).intValue() > i10) {
                        it.remove();
                        ((l) entry.getValue()).f7668n.i(c2Var, i0.f6840b, false, new l1());
                        o((l) entry.getValue());
                    }
                }
                for (l lVar : this.E) {
                    lVar.f7668n.i(c2Var, i0.f6842d, true, new l1());
                    o(lVar);
                }
                this.E.clear();
                v();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean t() {
        boolean z10 = false;
        while (true) {
            LinkedList linkedList = this.E;
            if (linkedList.isEmpty() || this.f7685n.size() >= this.D) {
                break;
            }
            u((l) linkedList.poll());
            z10 = true;
        }
        return z10;
    }

    public final String toString() {
        q6.g gVarJ0 = f6.a.j0(this);
        gVarJ0.b("logId", this.f7683l.f5345c);
        gVarJ0.a(this.f7672a, "address");
        return gVarJ0.toString();
    }

    public final void u(l lVar) {
        boolean zE;
        y3.e.N("StreamId already assigned", lVar.f7668n.L == -1);
        this.f7685n.put(Integer.valueOf(this.f7684m), lVar);
        if (!this.f7697z) {
            this.f7697z = true;
            q2 q2Var = this.G;
            if (q2Var != null) {
                q2Var.b();
            }
        }
        if (lVar.f6650e) {
            this.P.f(lVar, true);
        }
        k kVar = lVar.f7668n;
        int i10 = this.f7684m;
        if (!(kVar.L == -1)) {
            throw new IllegalStateException(f6.a.c0("the stream has been started with id %s", Integer.valueOf(i10)));
        }
        kVar.L = i10;
        y5.o oVar = kVar.G;
        kVar.K = new i3.v(oVar, i10, oVar.f16982a, kVar);
        k kVar2 = kVar.M.f7668n;
        if (kVar2.f6632j == null) {
            throw new IllegalStateException();
        }
        synchronized (kVar2.f6750b) {
            y3.e.N("Already allocated", !kVar2.f6754f);
            kVar2.f6754f = true;
        }
        synchronized (kVar2.f6750b) {
            zE = kVar2.e();
        }
        if (zE) {
            kVar2.f6632j.b();
        }
        e6 e6Var = kVar2.f6751c;
        e6Var.getClass();
        ((k4) e6Var.f6747a).a();
        if (kVar.I) {
            kVar.F.G(kVar.M.f7671q, kVar.L, kVar.f7661y);
            for (d0 d0Var : kVar.M.f7666l.f7292a) {
                ((e8.p) d0Var).r0();
            }
            kVar.f7661y = null;
            ja.g gVar = kVar.f7662z;
            if (gVar.f8534b > 0) {
                kVar.G.a(kVar.A, kVar.K, gVar, kVar.B);
            }
            kVar.I = false;
        }
        o1 o1Var = lVar.f7664j.f5333a;
        if ((o1Var != o1.f5328a && o1Var != o1.f5329b) || lVar.f7671q) {
            this.f7680i.flush();
        }
        int i11 = this.f7684m;
        if (i11 < 2147483645) {
            this.f7684m = i11 + 2;
        } else {
            this.f7684m = Integer.MAX_VALUE;
            s(Integer.MAX_VALUE, j8.a.NO_ERROR, c2.f5224m.g("Stream ids exhausted"));
        }
    }

    public final void v() {
        if (this.f7693v == null || !this.f7685n.isEmpty() || !this.E.isEmpty() || this.f7696y) {
            return;
        }
        this.f7696y = true;
        q2 q2Var = this.G;
        int i10 = 0;
        if (q2Var != null) {
            synchronized (q2Var) {
                try {
                    if (q2Var.f7047e != 6) {
                        q2Var.f7047e = 6;
                        ScheduledFuture scheduledFuture = q2Var.f7048f;
                        if (scheduledFuture != null) {
                            scheduledFuture.cancel(false);
                        }
                        ScheduledFuture scheduledFuture2 = q2Var.f7049g;
                        if (scheduledFuture2 != null) {
                            scheduledFuture2.cancel(false);
                            q2Var.f7049g = null;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        y1 y1Var = this.f7695x;
        if (y1Var != null) {
            d2 d2VarM = m();
            synchronized (y1Var) {
                try {
                    if (!y1Var.f7260d) {
                        y1Var.f7260d = true;
                        y1Var.f7261e = d2VarM;
                        LinkedHashMap linkedHashMap = y1Var.f7259c;
                        y1Var.f7259c = null;
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            try {
                                ((Executor) entry.getValue()).execute(new x1((o2) entry.getKey(), d2VarM, i10));
                            } catch (Throwable th2) {
                                y1.f7256g.log(Level.SEVERE, "Failed to execute PingCallback", th2);
                            }
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            this.f7695x = null;
        }
        if (!this.f7694w) {
            this.f7694w = true;
            this.f7680i.d(j8.a.NO_ERROR, new byte[0]);
        }
        this.f7680i.close();
    }
}
