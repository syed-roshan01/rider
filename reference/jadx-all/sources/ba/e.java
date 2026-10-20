package ba;

import a4.c0;
import d7.t;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import k6.w4;
import x9.d0;
import x9.s;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f2775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x9.a f2776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f2777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x9.n f2778d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c0 f2779e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public n f2780f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2781g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2782h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f2783i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public d0 f2784j;

    public e(l lVar, x9.a aVar, i iVar, x9.n nVar) {
        d7.a.m(lVar, "connectionPool");
        d7.a.m(nVar, "eventListener");
        this.f2775a = lVar;
        this.f2776b = aVar;
        this.f2777c = iVar;
        this.f2778d = nVar;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x0266  */
    /* JADX WARN: Code duplicated, block: B:117:0x027f  */
    /* JADX WARN: Code duplicated, block: B:119:0x028b  */
    /* JADX WARN: Code duplicated, block: B:120:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:122:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:131:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:132:0x0317  */
    /* JADX WARN: Code duplicated, block: B:169:0x02de A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x0318 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x0388 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x0240 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x0380 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x037a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x006a  */
    /* JADX WARN: Code duplicated, block: B:32:0x007e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0083  */
    /* JADX WARN: Code duplicated, block: B:36:0x0088  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00df  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:56:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:73:0x0161  */
    public final k a(int i10, int i11, int i12, boolean z10, boolean z11) throws IOException {
        d0 d0Var;
        c0 c0Var;
        n nVar;
        ArrayList arrayList;
        c0 c0Var2;
        boolean z12;
        x9.a aVar;
        Proxy proxy;
        String hostAddress;
        int port;
        List listD0;
        boolean zContains;
        k kVar;
        w4 w4Var;
        d0 d0Var2;
        c0 c0Var3;
        n nVar2;
        Socket socketI;
        while (!this.f2777c.f2805w) {
            k kVar2 = this.f2777c.f2799q;
            if (kVar2 != null) {
                synchronized (kVar2) {
                    try {
                        socketI = (kVar2.f2817j || !b(kVar2.f2809b.f16377a.f16327i)) ? this.f2777c.i() : null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (this.f2777c.f2799q == null) {
                    if (socketI != null) {
                        y9.b.c(socketI);
                    }
                    x9.n nVar3 = this.f2778d;
                    i iVar = this.f2777c;
                    nVar3.getClass();
                    d7.a.m(iVar, "call");
                    this.f2781g = 0;
                    this.f2782h = 0;
                    this.f2783i = 0;
                    if (this.f2775a.a(this.f2776b, this.f2777c, null, false)) {
                        kVar2 = this.f2777c.f2799q;
                        d7.a.j(kVar2);
                        x9.n nVar4 = this.f2778d;
                        i iVar2 = this.f2777c;
                        nVar4.getClass();
                        d7.a.m(iVar2, "call");
                    } else {
                        d0Var = this.f2784j;
                        try {
                            if (d0Var != null) {
                                this.f2784j = null;
                            } else {
                                c0Var = this.f2779e;
                                if (c0Var == null && c0Var.j()) {
                                    c0 c0Var4 = this.f2779e;
                                    d7.a.j(c0Var4);
                                    if (!c0Var4.j()) {
                                        throw new NoSuchElementException();
                                    }
                                    List list = (List) c0Var4.f1080b;
                                    int i13 = c0Var4.f1079a;
                                    c0Var4.f1079a = i13 + 1;
                                    d0Var = (d0) list.get(i13);
                                } else {
                                    nVar = this.f2780f;
                                    if (nVar == null) {
                                        x9.a aVar2 = this.f2776b;
                                        i iVar3 = this.f2777c;
                                        nVar = new n(aVar2, iVar3.f2790a.F, iVar3, this.f2778d);
                                        this.f2780f = nVar;
                                    }
                                    if (nVar.a()) {
                                        throw new NoSuchElementException();
                                    }
                                    arrayList = new ArrayList();
                                    while (nVar.f2837f < nVar.f2836e.size()) {
                                        if (nVar.f2837f < nVar.f2836e.size()) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        aVar = nVar.f2832a;
                                        if (z12) {
                                            throw new SocketException("No route to " + aVar.f16327i.f16458d + "; exhausted proxy configurations: " + nVar.f2836e);
                                        }
                                        List list2 = nVar.f2836e;
                                        int i14 = nVar.f2837f;
                                        nVar.f2837f = i14 + 1;
                                        proxy = (Proxy) list2.get(i14);
                                        ArrayList arrayList2 = new ArrayList();
                                        nVar.f2838g = arrayList2;
                                        if (proxy.type() != Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                                            s sVar = aVar.f16327i;
                                            hostAddress = sVar.f16458d;
                                            port = sVar.f16459e;
                                        } else {
                                            SocketAddress socketAddressAddress = proxy.address();
                                            if (!(socketAddressAddress instanceof InetSocketAddress)) {
                                                throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + socketAddressAddress.getClass()).toString());
                                            }
                                            d7.a.l(socketAddressAddress, "proxyAddress");
                                            InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                                            InetAddress address = inetSocketAddress.getAddress();
                                            if (address == null) {
                                                hostAddress = inetSocketAddress.getHostName();
                                                d7.a.l(hostAddress, "hostName");
                                            } else {
                                                hostAddress = address.getHostAddress();
                                                d7.a.l(hostAddress, "address.hostAddress");
                                            }
                                            port = inetSocketAddress.getPort();
                                        }
                                        if (1 <= port || port >= 65536) {
                                            throw new SocketException("No route to " + hostAddress + ':' + port + "; port is out of range");
                                        }
                                        if (proxy.type() == Proxy.Type.SOCKS) {
                                            arrayList2.add(InetSocketAddress.createUnresolved(hostAddress, port));
                                        } else {
                                            byte[] bArr = y9.b.f17000a;
                                            d7.a.m(hostAddress, "<this>");
                                            if (y9.b.f17004e.a(hostAddress)) {
                                                listD0 = t.d0(InetAddress.getByName(hostAddress));
                                            } else {
                                                nVar.f2835d.getClass();
                                                d7.a.m(nVar.f2834c, "call");
                                                List listA = ((x9.n) aVar.f16319a).a(hostAddress);
                                                if (listA.isEmpty()) {
                                                    throw new UnknownHostException(aVar.f16319a + " returned no addresses for " + hostAddress);
                                                }
                                                listD0 = listA;
                                            }
                                            Iterator it = listD0.iterator();
                                            while (it.hasNext()) {
                                                arrayList2.add(new InetSocketAddress((InetAddress) it.next(), port));
                                            }
                                        }
                                        Iterator it2 = nVar.f2838g.iterator();
                                        while (it2.hasNext()) {
                                            d0 d0Var3 = new d0(nVar.f2832a, proxy, (InetSocketAddress) it2.next());
                                            w4 w4Var2 = nVar.f2833b;
                                            synchronized (w4Var2) {
                                                zContains = ((Set) w4Var2.f10455b).contains(d0Var3);
                                            }
                                            if (zContains) {
                                                nVar.f2839h.add(d0Var3);
                                            } else {
                                                arrayList.add(d0Var3);
                                            }
                                        }
                                        if (!arrayList.isEmpty()) {
                                            break;
                                        }
                                    }
                                    if (arrayList.isEmpty()) {
                                        r8.n.A0(nVar.f2839h, arrayList);
                                        nVar.f2839h.clear();
                                    }
                                    c0Var2 = new c0();
                                    c0Var2.f1080b = arrayList;
                                    this.f2779e = c0Var2;
                                    if (!this.f2777c.f2805w) {
                                        throw new IOException("Canceled");
                                    }
                                    if (this.f2775a.a(this.f2776b, this.f2777c, arrayList, false)) {
                                        kVar2 = this.f2777c.f2799q;
                                        d7.a.j(kVar2);
                                        x9.n nVar5 = this.f2778d;
                                        i iVar4 = this.f2777c;
                                        nVar5.getClass();
                                        d7.a.m(iVar4, "call");
                                    } else {
                                        if (c0Var2.j()) {
                                            throw new NoSuchElementException();
                                        }
                                        List list3 = (List) c0Var2.f1080b;
                                        int i15 = c0Var2.f1079a;
                                        c0Var2.f1079a = i15 + 1;
                                        d0Var = (d0) list3.get(i15);
                                        kVar = new k(this.f2775a, d0Var);
                                        this.f2777c.f2807y = kVar;
                                        kVar.c(i10, i11, i12, z10, this.f2777c, this.f2778d);
                                        this.f2777c.f2807y = null;
                                        w4Var = this.f2777c.f2790a.F;
                                        d0Var2 = kVar.f2809b;
                                        synchronized (w4Var) {
                                            d7.a.m(d0Var2, "route");
                                            ((Set) w4Var.f10455b).remove(d0Var2);
                                        }
                                        if (this.f2775a.a(this.f2776b, this.f2777c, arrayList, true)) {
                                            k kVar3 = this.f2777c.f2799q;
                                            d7.a.j(kVar3);
                                            this.f2784j = d0Var;
                                            Socket socket = kVar.f2811d;
                                            d7.a.j(socket);
                                            y9.b.c(socket);
                                            x9.n nVar6 = this.f2778d;
                                            i iVar5 = this.f2777c;
                                            nVar6.getClass();
                                            d7.a.m(iVar5, "call");
                                            kVar2 = kVar3;
                                        } else {
                                            synchronized (kVar) {
                                                l lVar = this.f2775a;
                                                lVar.getClass();
                                                byte[] bArr2 = y9.b.f17000a;
                                                lVar.f2829e.add(kVar);
                                                lVar.f2827c.c(lVar.f2828d, 0L);
                                                this.f2777c.b(kVar);
                                            }
                                            x9.n nVar7 = this.f2778d;
                                            i iVar6 = this.f2777c;
                                            nVar7.getClass();
                                            d7.a.m(iVar6, "call");
                                            kVar2 = kVar;
                                        }
                                    }
                                }
                            }
                            kVar.c(i10, i11, i12, z10, this.f2777c, this.f2778d);
                            this.f2777c.f2807y = null;
                            w4Var = this.f2777c.f2790a.F;
                            d0Var2 = kVar.f2809b;
                            synchronized (w4Var) {
                                d7.a.m(d0Var2, "route");
                                ((Set) w4Var.f10455b).remove(d0Var2);
                                if (this.f2775a.a(this.f2776b, this.f2777c, arrayList, true)) {
                                    k kVar4 = this.f2777c.f2799q;
                                    d7.a.j(kVar4);
                                    this.f2784j = d0Var;
                                    Socket socket2 = kVar.f2811d;
                                    d7.a.j(socket2);
                                    y9.b.c(socket2);
                                    x9.n nVar8 = this.f2778d;
                                    i iVar7 = this.f2777c;
                                    nVar8.getClass();
                                    d7.a.m(iVar7, "call");
                                    kVar2 = kVar4;
                                } else {
                                    synchronized (kVar) {
                                        l lVar2 = this.f2775a;
                                        lVar2.getClass();
                                        byte[] bArr3 = y9.b.f17000a;
                                        lVar2.f2829e.add(kVar);
                                        lVar2.f2827c.c(lVar2.f2828d, 0L);
                                        this.f2777c.b(kVar);
                                        x9.n nVar9 = this.f2778d;
                                        i iVar8 = this.f2777c;
                                        nVar9.getClass();
                                        d7.a.m(iVar8, "call");
                                        kVar2 = kVar;
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            this.f2777c.f2807y = null;
                            throw th2;
                        }
                        arrayList = null;
                        kVar = new k(this.f2775a, d0Var);
                        this.f2777c.f2807y = kVar;
                    }
                } else if (socketI != null) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            } else {
                this.f2781g = 0;
                this.f2782h = 0;
                this.f2783i = 0;
                if (this.f2775a.a(this.f2776b, this.f2777c, null, false)) {
                    kVar2 = this.f2777c.f2799q;
                    d7.a.j(kVar2);
                    x9.n nVar10 = this.f2778d;
                    i iVar9 = this.f2777c;
                    nVar10.getClass();
                    d7.a.m(iVar9, "call");
                } else {
                    d0Var = this.f2784j;
                    if (d0Var != null) {
                        this.f2784j = null;
                    } else {
                        c0Var = this.f2779e;
                        if (c0Var == null) {
                        }
                        nVar = this.f2780f;
                        if (nVar == null) {
                            x9.a aVar3 = this.f2776b;
                            i iVar10 = this.f2777c;
                            nVar = new n(aVar3, iVar10.f2790a.F, iVar10, this.f2778d);
                            this.f2780f = nVar;
                        }
                        if (nVar.a()) {
                            throw new NoSuchElementException();
                        }
                        arrayList = new ArrayList();
                        while (nVar.f2837f < nVar.f2836e.size()) {
                            if (nVar.f2837f < nVar.f2836e.size()) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            aVar = nVar.f2832a;
                            if (z12) {
                                throw new SocketException("No route to " + aVar.f16327i.f16458d + "; exhausted proxy configurations: " + nVar.f2836e);
                            }
                            List list4 = nVar.f2836e;
                            int i16 = nVar.f2837f;
                            nVar.f2837f = i16 + 1;
                            proxy = (Proxy) list4.get(i16);
                            ArrayList arrayList3 = new ArrayList();
                            nVar.f2838g = arrayList3;
                            if (proxy.type() != Proxy.Type.DIRECT) {
                                s sVar2 = aVar.f16327i;
                                hostAddress = sVar2.f16458d;
                                port = sVar2.f16459e;
                            } else {
                                s sVar3 = aVar.f16327i;
                                hostAddress = sVar3.f16458d;
                                port = sVar3.f16459e;
                            }
                            if (1 <= port) {
                            }
                            throw new SocketException("No route to " + hostAddress + ':' + port + "; port is out of range");
                        }
                        if (arrayList.isEmpty()) {
                            r8.n.A0(nVar.f2839h, arrayList);
                            nVar.f2839h.clear();
                        }
                        c0Var2 = new c0();
                        c0Var2.f1080b = arrayList;
                        this.f2779e = c0Var2;
                        if (!this.f2777c.f2805w) {
                            throw new IOException("Canceled");
                        }
                        if (this.f2775a.a(this.f2776b, this.f2777c, arrayList, false)) {
                            kVar2 = this.f2777c.f2799q;
                            d7.a.j(kVar2);
                            x9.n nVar11 = this.f2778d;
                            i iVar11 = this.f2777c;
                            nVar11.getClass();
                            d7.a.m(iVar11, "call");
                        } else {
                            if (c0Var2.j()) {
                                throw new NoSuchElementException();
                            }
                            List list5 = (List) c0Var2.f1080b;
                            int i17 = c0Var2.f1079a;
                            c0Var2.f1079a = i17 + 1;
                            d0Var = (d0) list5.get(i17);
                            kVar = new k(this.f2775a, d0Var);
                            this.f2777c.f2807y = kVar;
                            kVar.c(i10, i11, i12, z10, this.f2777c, this.f2778d);
                            this.f2777c.f2807y = null;
                            w4Var = this.f2777c.f2790a.F;
                            d0Var2 = kVar.f2809b;
                            synchronized (w4Var) {
                                d7.a.m(d0Var2, "route");
                                ((Set) w4Var.f10455b).remove(d0Var2);
                                if (this.f2775a.a(this.f2776b, this.f2777c, arrayList, true)) {
                                    k kVar5 = this.f2777c.f2799q;
                                    d7.a.j(kVar5);
                                    this.f2784j = d0Var;
                                    Socket socket3 = kVar.f2811d;
                                    d7.a.j(socket3);
                                    y9.b.c(socket3);
                                    x9.n nVar12 = this.f2778d;
                                    i iVar12 = this.f2777c;
                                    nVar12.getClass();
                                    d7.a.m(iVar12, "call");
                                    kVar2 = kVar5;
                                } else {
                                    synchronized (kVar) {
                                        l lVar3 = this.f2775a;
                                        lVar3.getClass();
                                        byte[] bArr4 = y9.b.f17000a;
                                        lVar3.f2829e.add(kVar);
                                        lVar3.f2827c.c(lVar3.f2828d, 0L);
                                        this.f2777c.b(kVar);
                                        x9.n nVar13 = this.f2778d;
                                        i iVar13 = this.f2777c;
                                        nVar13.getClass();
                                        d7.a.m(iVar13, "call");
                                        kVar2 = kVar;
                                    }
                                }
                            }
                        }
                    }
                    arrayList = null;
                    kVar = new k(this.f2775a, d0Var);
                    this.f2777c.f2807y = kVar;
                    kVar.c(i10, i11, i12, z10, this.f2777c, this.f2778d);
                    this.f2777c.f2807y = null;
                    w4Var = this.f2777c.f2790a.F;
                    d0Var2 = kVar.f2809b;
                    synchronized (w4Var) {
                        d7.a.m(d0Var2, "route");
                        ((Set) w4Var.f10455b).remove(d0Var2);
                        if (this.f2775a.a(this.f2776b, this.f2777c, arrayList, true)) {
                            k kVar6 = this.f2777c.f2799q;
                            d7.a.j(kVar6);
                            this.f2784j = d0Var;
                            Socket socket4 = kVar.f2811d;
                            d7.a.j(socket4);
                            y9.b.c(socket4);
                            x9.n nVar14 = this.f2778d;
                            i iVar14 = this.f2777c;
                            nVar14.getClass();
                            d7.a.m(iVar14, "call");
                            kVar2 = kVar6;
                        } else {
                            synchronized (kVar) {
                                l lVar4 = this.f2775a;
                                lVar4.getClass();
                                byte[] bArr5 = y9.b.f17000a;
                                lVar4.f2829e.add(kVar);
                                lVar4.f2827c.c(lVar4.f2828d, 0L);
                                this.f2777c.b(kVar);
                                x9.n nVar15 = this.f2778d;
                                i iVar15 = this.f2777c;
                                nVar15.getClass();
                                d7.a.m(iVar15, "call");
                                kVar2 = kVar;
                            }
                        }
                    }
                }
            }
            if (kVar2.i(z11)) {
                return kVar2;
            }
            kVar2.k();
            if (this.f2784j == null && (c0Var3 = this.f2779e) != null && !c0Var3.j() && (nVar2 = this.f2780f) != null && !nVar2.a()) {
                throw new IOException("exhausted all routes");
            }
        }
        throw new IOException("Canceled");
    }

    public final boolean b(s sVar) {
        d7.a.m(sVar, "url");
        s sVar2 = this.f2776b.f16327i;
        return sVar.f16459e == sVar2.f16459e && d7.a.d(sVar.f16458d, sVar2.f16458d);
    }

    public final void c(IOException iOException) {
        d7.a.m(iOException, "e");
        this.f2784j = null;
        if (iOException instanceof ea.d0) {
            if (((ea.d0) iOException).f5452a == ea.b.REFUSED_STREAM) {
                this.f2781g++;
                return;
            }
        }
        if (iOException instanceof ea.a) {
            this.f2782h++;
        } else {
            this.f2783i++;
        }
    }
}
