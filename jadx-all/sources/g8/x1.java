package g8;

import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.remoteconfig.internal.Code;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class x1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f7214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7215c;

    public /* synthetic */ x1(int i10, Object obj, Object obj2) {
        this.f7213a = i10;
        this.f7215c = obj;
        this.f7214b = obj2;
    }

    private void a() {
        Object obj = this.f7215c;
        try {
            ((x3) ((l.z2) obj).f10985d).e((m4) this.f7214b);
        } catch (Throwable th) {
            ((k) ((l.z2) obj).f10984c).b(th);
            ((x3) ((l.z2) obj).f10985d).close();
        }
    }

    private void b() {
        ((o2) this.f7214b).f7015a.f7033a.c(e8.c2.f5224m.g("Keepalive failed. The connection is likely gone"));
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00d2 A[Catch: all -> 0x00cf, TryCatch #6 {all -> 0x00cf, blocks: (B:15:0x0057, B:32:0x010a, B:18:0x0067, B:20:0x0097, B:22:0x00a4, B:24:0x00b6, B:27:0x00d2, B:31:0x00fe, B:30:0x00e8), top: B:286:0x0057 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:30:0x00e8 A[Catch: all -> 0x00cf, TryCatch #6 {all -> 0x00cf, blocks: (B:15:0x0057, B:32:0x010a, B:18:0x0067, B:20:0x0097, B:22:0x00a4, B:24:0x00b6, B:27:0x00d2, B:31:0x00fe, B:30:0x00e8), top: B:286:0x0057 }] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        e8.h2 h2Var;
        k6.m4 m4Var;
        List listSingletonList;
        e8.r1 r1Var;
        u3 u3Var;
        s3 s3Var;
        Object obj;
        c5 c5Var;
        int i10 = 3;
        i3.a0 a0Var = null;
        hVar = null;
        r7.h hVar = null;
        a0Var = null;
        i3.a0 a0Var2 = null;
        boolean z10 = false;
        objArr = 0;
        Object[] objArr = 0;
        int i11 = 0;
        z = false;
        boolean z11 = false;
        z = false;
        boolean z12 = false;
        z10 = false;
        boolean zA = true;
        switch (this.f7213a) {
            case 0:
                b();
                return;
            case 1:
                a();
                return;
            case 2:
                ((k) this.f7214b).f6894b.b((Throwable) this.f7215c);
                return;
            case 3:
                v0 v0Var = (v0) this.f7215c;
                e8.c2 c2VarG = e8.c2.f5219h.g(((StringBuilder) this.f7214b).toString());
                e8.l lVar = v0.f7160j;
                v0Var.a(c2VarG, true);
                return;
            case 4:
                e8.k kVar = ((v0) this.f7215c).f7166f;
                e8.c2 c2Var = (e8.c2) this.f7214b;
                kVar.cancel(c2Var.f5228b, c2Var.f5229c);
                return;
            case 5:
                ((v0) this.f7215c).f7166f.sendMessage(this.f7214b);
                return;
            case 6:
                ((u0) this.f7215c).f7148a.onHeaders((e8.l1) this.f7214b);
                return;
            case 7:
                ((u0) this.f7215c).f7148a.onMessage(this.f7214b);
                return;
            case 8:
                ((y0) this.f7215c).f7251h.d((e8.c2) this.f7214b);
                return;
            case 9:
                ((d1) this.f7215c).f6716c.d((e8.s) this.f7214b);
                return;
            case 10:
                ((d1) this.f7215c).f6716c.h((e8.e0) this.f7214b);
                return;
            case 11:
                ((d1) this.f7215c).f6716c.g((e8.c0) this.f7214b);
                return;
            case 12:
                ((d1) this.f7215c).f6716c.m((String) this.f7214b);
                return;
            case 13:
                ((d1) this.f7215c).f6716c.l((InputStream) this.f7214b);
                return;
            case Code.UNAVAILABLE /* 14 */:
                ((d1) this.f7215c).f6716c.i((e8.c2) this.f7214b);
                return;
            case 15:
                ((c1) this.f7215c).f6682a.a((a6) this.f7214b);
                return;
            case Code.UNAUTHENTICATED /* 16 */:
                ((c1) this.f7215c).f6682a.d((e8.l1) this.f7214b);
                return;
            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                Object obj2 = this.f7214b;
                Logger logger = g1.f6789s;
                Level level = Level.FINER;
                boolean zIsLoggable = logger.isLoggable(level);
                Object obj3 = this.f7215c;
                if (zIsLoggable) {
                    logger.finer("Attempting DNS resolution of " + ((g1) obj3).f6800f);
                }
                int i12 = 4;
                try {
                    try {
                        g1 g1Var = (g1) obj3;
                        e8.k0 k0VarA = g1Var.f6795a.a(InetSocketAddress.createUnresolved(g1Var.f6800f, g1Var.f6801g));
                        e8.g0 g0Var = k0VarA != null ? new e8.g0(k0VarA) : null;
                        List listEmptyList = Collections.emptyList();
                        e8.c cVar = e8.c.f5206b;
                        if (g0Var == null) {
                            i3.a0 a0VarS = ((g1) obj3).s();
                            try {
                                Object obj4 = a0VarS.f7941a;
                                if (((e8.c2) obj4) != null) {
                                    ((e8.i) obj2).d((e8.c2) obj4);
                                    boolean z13 = ((e8.c2) a0VarS.f7941a) == null;
                                    h2Var = ((g1) obj3).f6804j;
                                    m4Var = new k6.m4(i12, this, z13);
                                } else {
                                    Object obj5 = a0VarS.f7942b;
                                    if (((List) obj5) != null) {
                                        listEmptyList = (List) obj5;
                                    }
                                    Object obj6 = a0VarS.f7943c;
                                    e8.r1 r1Var2 = ((e8.r1) obj6) != null ? (e8.r1) obj6 : null;
                                    Object obj7 = a0VarS.f7944d;
                                    if (((e8.c) obj7) != null) {
                                        cVar = (e8.c) obj7;
                                    }
                                    listSingletonList = listEmptyList;
                                    r1Var = r1Var2;
                                    a0Var = a0VarS;
                                }
                            } catch (IOException e4) {
                                e = e4;
                                a0Var = a0VarS;
                                ((e8.i) obj2).d(e8.c2.f5224m.g("Unable to resolve host " + ((g1) obj3).f6800f).f(e));
                                if (a0Var != null && ((e8.c2) a0Var.f7941a) == null) {
                                    z12 = true;
                                }
                                h2Var = ((g1) obj3).f6804j;
                                m4Var = new k6.m4(i12, this, z12);
                            } catch (Throwable th) {
                                th = th;
                                a0Var2 = a0VarS;
                                if (a0Var2 != null && ((e8.c2) a0Var2.f7941a) == null) {
                                    z10 = true;
                                }
                                ((g1) obj3).f6804j.execute(new k6.m4(i12, this, z10));
                                throw th;
                            }
                            h2Var.execute(m4Var);
                            return;
                        }
                        if (logger.isLoggable(level)) {
                            logger.finer("Using proxy address " + g0Var);
                        }
                        listSingletonList = Collections.singletonList(g0Var);
                        r1Var = null;
                        ((e8.i) obj2).e(new e8.s1(listSingletonList, cVar, r1Var));
                        if (a0Var != null && ((e8.c2) a0Var.f7941a) == null) {
                            z11 = true;
                        }
                        h2Var = ((g1) obj3).f6804j;
                        m4Var = new k6.m4(i12, this, z11);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (IOException e10) {
                    e = e10;
                }
                h2Var.execute(m4Var);
                return;
            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                k3.b bVar = ((j2) this.f7215c).f6876l;
                SocketAddress socketAddress = (SocketAddress) ((e8.g0) ((List) bVar.f9722d).get(bVar.f9720b)).f5259a.get(bVar.f9721c);
                k3.b bVar2 = ((j2) this.f7215c).f6876l;
                bVar2.f9722d = (List) this.f7214b;
                bVar2.b();
                ((j2) this.f7215c).f6877m = (List) this.f7214b;
                e8.x xVar = ((j2) this.f7215c).f6887w.f5403a;
                e8.x xVar2 = e8.x.f5395b;
                if (xVar == xVar2 || ((j2) this.f7215c).f6887w.f5403a == e8.x.f5394a) {
                    k3.b bVar3 = ((j2) this.f7215c).f6876l;
                    while (true) {
                        if (i11 < ((List) bVar3.f9722d).size()) {
                            int iIndexOf = ((e8.g0) ((List) bVar3.f9722d).get(i11)).f5259a.indexOf(socketAddress);
                            if (iIndexOf == -1) {
                                i11++;
                            } else {
                                bVar3.f9720b = i11;
                                bVar3.f9721c = iIndexOf;
                            }
                        } else if (((j2) this.f7215c).f6887w.f5403a == xVar2) {
                            u3Var = ((j2) this.f7215c).f6886v;
                            ((j2) this.f7215c).f6886v = null;
                            ((j2) this.f7215c).f6876l.b();
                            j2.g((j2) this.f7215c, e8.x.f5397d);
                        } else {
                            ((j2) this.f7215c).f6885u.f(e8.c2.f5224m.g("InternalSubchannel closed pending transport due to address change"));
                            j2 j2Var = (j2) this.f7215c;
                            j2Var.f6885u = null;
                            j2Var.f6876l.b();
                            j2.h((j2) this.f7215c);
                        }
                        u3Var = null;
                    }
                } else {
                    u3Var = null;
                }
                if (u3Var != null) {
                    j2 j2Var2 = (j2) this.f7215c;
                    if (j2Var2.f6881q != null) {
                        j2Var2.f6882r.f(e8.c2.f5224m.g("InternalSubchannel closed transport early due to address change"));
                        ((j2) this.f7215c).f6881q.c();
                        j2 j2Var3 = (j2) this.f7215c;
                        j2Var3.f6881q = null;
                        j2Var3.f6882r = null;
                    }
                    j2 j2Var4 = (j2) this.f7215c;
                    j2Var4.f6882r = u3Var;
                    j2Var4.f6881q = j2Var4.f6875k.c(new t0(this, i10), 5L, TimeUnit.SECONDS, j2Var4.f6871g);
                    return;
                }
                return;
            case 19:
                if (((h2) this.f7215c).f6826c.f6887w.f5403a == e8.x.f5398e) {
                    return;
                }
                u3 u3Var2 = ((h2) this.f7215c).f6826c.f6886v;
                h2 h2Var2 = (h2) this.f7215c;
                o0 o0Var = h2Var2.f6824a;
                if (u3Var2 == o0Var) {
                    h2Var2.f6826c.f6886v = null;
                    ((h2) this.f7215c).f6826c.f6876l.b();
                    j2.g(((h2) this.f7215c).f6826c, e8.x.f5397d);
                    return;
                }
                j2 j2Var5 = h2Var2.f6826c;
                if (j2Var5.f6885u == o0Var) {
                    y3.e.M(((h2) this.f7215c).f6826c.f6887w.f5403a, "Expected state is CONNECTING, actual state is %s", j2Var5.f6887w.f5403a == e8.x.f5394a);
                    k3.b bVar4 = ((h2) this.f7215c).f6826c.f6876l;
                    e8.g0 g0Var2 = (e8.g0) ((List) bVar4.f9722d).get(bVar4.f9720b);
                    int i13 = bVar4.f9721c + 1;
                    bVar4.f9721c = i13;
                    if (i13 >= g0Var2.f5259a.size()) {
                        bVar4.f9720b++;
                        bVar4.f9721c = 0;
                    }
                    k3.b bVar5 = ((h2) this.f7215c).f6826c.f6876l;
                    if (bVar5.f9720b < ((List) bVar5.f9722d).size()) {
                        j2.h(((h2) this.f7215c).f6826c);
                        return;
                    }
                    j2 j2Var6 = ((h2) this.f7215c).f6826c;
                    j2Var6.f6885u = null;
                    j2Var6.f6876l.b();
                    j2 j2Var7 = ((h2) this.f7215c).f6826c;
                    e8.c2 c2Var2 = (e8.c2) this.f7214b;
                    j2Var7.f6875k.d();
                    y3.e.G("The error status must not be OK", !c2Var2.e());
                    j2Var7.i(new e8.y(e8.x.f5396c, c2Var2));
                    if (j2Var7.f6878n == null) {
                        j2Var7.f6868d.getClass();
                        j2Var7.f6878n = r7.e.d();
                    }
                    long jA = j2Var7.f6878n.a();
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    long jA2 = jA - j2Var7.f6879o.a(timeUnit);
                    j2Var7.f6874j.b(2, "TRANSIENT_FAILURE ({0}). Will reconnect after {1} ns", j2.j(c2Var2), Long.valueOf(jA2));
                    y3.e.N("previous reconnectTask is not done", j2Var7.f6880p == null);
                    j2Var7.f6880p = j2Var7.f6875k.c(new a2(j2Var7, z10 ? 1 : 0), jA2, timeUnit, j2Var7.f6871g);
                    return;
                }
                return;
            case FirestoreIndexValueWriter.INDEX_TYPE_TIMESTAMP /* 20 */:
                d3 d3Var = (d3) this.f7215c;
                e8.c2 c2Var3 = (e8.c2) this.f7214b;
                d3Var.getClass();
                Logger logger2 = l3.f6919b0;
                Level level2 = Level.WARNING;
                l3 l3Var = d3Var.f6727f;
                logger2.log(level2, "[{0}] Failed to resolve name. status={1}", new Object[]{l3Var.f6926a, c2Var3});
                i3 i3Var = l3Var.P;
                if (i3Var.f6850a.get() == l3.f6925h0) {
                    i3Var.t(null);
                }
                if (l3Var.f6927a0 != 3) {
                    l3Var.N.b(3, "Failed to resolve name: {0}", c2Var3);
                    l3Var.f6927a0 = 3;
                }
                c3 c3Var = l3Var.f6949w;
                c3 c3Var2 = d3Var.f6725d;
                if (c3Var2 != c3Var) {
                    return;
                }
                ((e8.z0) c3Var2.f6688a.f7942b).c(c2Var3);
                return;
            case 21:
                d3 d3Var2 = (d3) this.f7215c;
                l3 l3Var2 = d3Var2.f6727f;
                if (l3Var2.f6947u != d3Var2.f6726e) {
                    return;
                }
                e8.s1 s1Var = (e8.s1) this.f7214b;
                List list = s1Var.f5361a;
                l3Var2.N.b(1, "Resolved address: {0}, config={1}", list, s1Var.f5362b);
                l3 l3Var3 = ((d3) this.f7215c).f6727f;
                if (l3Var3.f6927a0 != 2) {
                    l3Var3.N.b(2, "Address resolved: {0}", list);
                    ((d3) this.f7215c).f6727f.f6927a0 = 2;
                }
                e8.s1 s1Var2 = (e8.s1) this.f7214b;
                e8.r1 r1Var3 = s1Var2.f5363c;
                k5 k5Var = (k5) s1Var2.f5362b.f5207a.get(m5.f6964d);
                e8.c cVar2 = ((e8.s1) this.f7214b).f5362b;
                e8.b bVar6 = e8.o0.f5327a;
                e8.o0 o0Var2 = (e8.o0) cVar2.f5207a.get(bVar6);
                s3 s3Var2 = (r1Var3 == null || (obj = r1Var3.f5358b) == null) ? null : (s3) obj;
                e8.c2 c2Var4 = r1Var3 != null ? r1Var3.f5357a : null;
                Object obj8 = this.f7215c;
                l3 l3Var4 = ((d3) obj8).f6727f;
                int i14 = 11;
                if (l3Var4.S) {
                    if (s3Var2 != null) {
                        if (o0Var2 != null) {
                            l3Var4.P.t(o0Var2);
                            if (s3Var2.b() != null) {
                                ((d3) this.f7215c).f6727f.N.a(1, "Method configs in service config will be discarded due to presence ofconfig-selector");
                            }
                        } else {
                            l3Var4.P.t(s3Var2.b());
                        }
                    } else if (c2Var4 != null) {
                        l3 l3Var5 = ((d3) obj8).f6727f;
                        if (!l3Var5.R) {
                            l3Var5.N.a(2, "Fallback to error due to invalid first service config without default config");
                            ((d3) this.f7215c).d(r1Var3.f5357a);
                            if (k5Var != null) {
                                m5 m5Var = k5Var.f6909a;
                                ((t) m5Var.f6965b).a(new t0(m5Var, i14));
                                return;
                            }
                            return;
                        }
                        s3Var2 = l3Var5.Q;
                    } else {
                        s3Var2 = l3.f6924g0;
                        ((d3) obj8).f6727f.P.t(null);
                    }
                    if (!s3Var2.equals(((d3) this.f7215c).f6727f.Q)) {
                        z zVar = ((d3) this.f7215c).f6727f.N;
                        Object[] objArr2 = new Object[1];
                        objArr2[0] = s3Var2 == l3.f6924g0 ? " to empty" : "";
                        zVar.b(2, "Service config changed{0}", objArr2);
                        l3 l3Var6 = ((d3) this.f7215c).f6727f;
                        l3Var6.Q = s3Var2;
                        l3Var6.Y.f17261b = s3Var2.f7106d;
                    }
                    try {
                        ((d3) this.f7215c).f6727f.R = true;
                    } catch (RuntimeException e11) {
                        l3.f6919b0.log(Level.WARNING, "[" + ((d3) this.f7215c).f6727f.f6926a + "] Unexpected exception from parsing service config", (Throwable) e11);
                    }
                    s3Var = s3Var2;
                    break;
                } else {
                    if (s3Var2 != null) {
                        l3Var4.N.a(2, "Service config from name resolver discarded by channel settings");
                    }
                    ((d3) this.f7215c).f6727f.getClass();
                    s3Var = l3.f6924g0;
                    if (o0Var2 != null) {
                        ((d3) this.f7215c).f6727f.N.a(2, "Config selector from name resolver discarded by channel settings");
                    }
                    ((d3) this.f7215c).f6727f.P.t(s3Var.b());
                }
                e8.c cVar3 = ((e8.s1) this.f7214b).f5362b;
                d3 d3Var3 = (d3) this.f7215c;
                if (d3Var3.f6725d == d3Var3.f6727f.f6949w) {
                    cVar3.getClass();
                    e8.a aVar = new e8.a(cVar3);
                    aVar.b(bVar6);
                    Map map = s3Var.f7108f;
                    if (map != null) {
                        aVar.c(e8.z0.f5406b, map);
                        aVar.a();
                    }
                    e8.c cVarA = aVar.a();
                    i3.a0 a0Var3 = ((d3) this.f7215c).f6725d.f6688a;
                    e8.c cVar4 = e8.c.f5206b;
                    e8.w0 w0Var = new e8.w0(list, cVarA, s3Var.f7107e);
                    a0Var3.getClass();
                    t5 t5Var = (t5) w0Var.f5393c;
                    if (t5Var == null) {
                        try {
                            Object obj9 = a0Var3.f7944d;
                            t5Var = new t5(s.a((s) obj9, ((s) obj9).f7083b), null);
                        } catch (r e12) {
                            ((e8.j0) a0Var3.f7941a).r(e8.x.f5396c, new g4(e8.c2.f5223l.g(e12.getMessage())));
                            ((e8.z0) a0Var3.f7942b).f();
                            a0Var3.f7943c = null;
                            a0Var3.f7942b = new q();
                        }
                    }
                    e8.a1 a1Var = (e8.a1) a0Var3.f7943c;
                    e8.a1 a1Var2 = t5Var.f7144a;
                    if (a1Var == null || !a1Var2.f().equals(((e8.a1) a0Var3.f7943c).f())) {
                        ((e8.j0) a0Var3.f7941a).r(e8.x.f5394a, new p());
                        ((e8.z0) a0Var3.f7942b).f();
                        a0Var3.f7943c = a1Var2;
                        e8.z0 z0Var = (e8.z0) a0Var3.f7942b;
                        a0Var3.f7942b = a1Var2.c((e8.j0) a0Var3.f7941a);
                        ((e8.j0) a0Var3.f7941a).i().b(2, "Load balancer changed from {0} to {1}", z0Var.getClass().getSimpleName(), ((e8.z0) a0Var3.f7942b).getClass().getSimpleName());
                    }
                    Object obj10 = t5Var.f7145b;
                    if (obj10 != null) {
                        ((e8.j0) a0Var3.f7941a).i().b(1, "Load-balancing config: {0}", obj10);
                    }
                    e8.z0 z0Var2 = (e8.z0) a0Var3.f7942b;
                    e8.c cVar5 = e8.c.f5206b;
                    zA = z0Var2.a(new e8.w0(w0Var.f5391a, w0Var.f5392b, obj10));
                    if (k5Var != null) {
                        m5 m5Var2 = k5Var.f6909a;
                        if (!zA) {
                            ((t) m5Var2.f6965b).a(new t0(m5Var2, i14));
                            return;
                        }
                        t tVar = (t) m5Var2.f6965b;
                        e8.h2 h2Var3 = tVar.f7120b;
                        h2Var3.d();
                        h2Var3.execute(new androidx.activity.d(tVar, 14));
                        return;
                    }
                    return;
                }
                return;
            case 22:
                i3 i3Var2 = (i3) this.f7215c;
                Object obj11 = i3Var2.f6850a.get();
                t2 t2Var = l3.f6925h0;
                Object obj12 = this.f7214b;
                if (obj11 != t2Var) {
                    ((h3) obj12).d();
                    return;
                }
                l3 l3Var7 = i3Var2.f6853d;
                if (l3Var7.A == null) {
                    l3Var7.A = new LinkedHashSet();
                    l3 l3Var8 = i3Var2.f6853d;
                    l3Var8.X.f(l3Var8.B, true);
                }
                i3Var2.f6853d.A.add((h3) obj12);
                return;
            case 23:
                ((Runnable) this.f7214b).run();
                h3 h3Var = (h3) this.f7215c;
                h3Var.f6830n.f6853d.f6939m.execute(new t0(h3Var, 6));
                return;
            case 24:
                synchronized (((y2) ((x1) this.f7215c).f7215c).f7271i) {
                    try {
                        Object obj13 = this.f7215c;
                        if (((r7.h) ((x1) obj13).f7214b).f13604b) {
                            objArr = 1;
                        } else {
                            ((y2) ((x1) obj13).f7215c).f7277o = ((y2) ((x1) obj13).f7215c).f7277o.a((g5) this.f7214b);
                            Object obj14 = this.f7215c;
                            if (((y2) ((x1) obj14).f7215c).x(((y2) ((x1) obj14).f7215c).f7277o)) {
                                Object obj15 = this.f7215c;
                                if (((y2) ((x1) obj15).f7215c).f7275m != null) {
                                    h5 h5Var = ((y2) ((x1) obj15).f7215c).f7275m;
                                    if (h5Var.f6837d.get() <= h5Var.f6835b) {
                                        Object obj16 = this.f7215c;
                                        y2 y2Var = (y2) ((x1) obj16).f7215c;
                                        c5Var = ((y2) ((x1) obj16).f7215c).f7277o;
                                        if (c5Var.f6708h) {
                                            c5Var = new c5(c5Var.f6702b, c5Var.f6703c, c5Var.f6704d, c5Var.f6706f, c5Var.f6707g, c5Var.f6701a, true, c5Var.f6705e);
                                        }
                                        y2Var.f7277o = c5Var;
                                        ((y2) ((x1) this.f7215c).f7215c).f7285w = null;
                                    }
                                }
                                Object obj17 = this.f7215c;
                                y2 y2Var2 = (y2) ((x1) obj17).f7215c;
                                hVar = new r7.h(((y2) ((x1) obj17).f7215c).f7271i);
                                y2Var2.f7285w = hVar;
                            } else {
                                Object obj18 = this.f7215c;
                                y2 y2Var3 = (y2) ((x1) obj18).f7215c;
                                c5Var = ((y2) ((x1) obj18).f7215c).f7277o;
                                if (c5Var.f6708h) {
                                    c5Var = new c5(c5Var.f6702b, c5Var.f6703c, c5Var.f6704d, c5Var.f6706f, c5Var.f6707g, c5Var.f6701a, true, c5Var.f6705e);
                                }
                                y2Var3.f7277o = c5Var;
                                ((y2) ((x1) this.f7215c).f7215c).f7285w = null;
                            }
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                    break;
                }
                if (objArr != 0) {
                    g5 g5Var = (g5) this.f7214b;
                    g5Var.f6817a.j(new f5((y2) ((x1) this.f7215c).f7215c, g5Var));
                    ((g5) this.f7214b).f6817a.i(e8.c2.f5217f.g("Unneeded hedging"));
                    return;
                } else {
                    if (hVar != null) {
                        y2 y2Var4 = (y2) ((x1) this.f7215c).f7215c;
                        hVar.e(y2Var4.f7266d.schedule(new x1(25, y2Var4, hVar), y2Var4.f7269g.f7152b, TimeUnit.NANOSECONDS));
                    }
                    ((y2) ((x1) this.f7215c).f7215c).v((g5) this.f7214b);
                    return;
                }
            case FirestoreIndexValueWriter.INDEX_TYPE_STRING /* 25 */:
                y2 y2Var5 = (y2) this.f7215c;
                g5 g5VarT = y2Var5.t(y2Var5.f7277o.f6705e, false);
                if (g5VarT == null) {
                    return;
                }
                ((y2) this.f7215c).f7264b.execute(new x1(24, this, g5VarT));
                return;
            case 26:
                ((f5) this.f7215c).f6765b.f7283u.d((e8.l1) this.f7214b);
                return;
            default:
                ((f5) this.f7215c).f6765b.f7283u.a((a6) this.f7214b);
                return;
        }
    }

    public /* synthetic */ x1(Object obj, Throwable th, int i10) {
        this.f7213a = i10;
        this.f7214b = obj;
        this.f7215c = th;
    }

    public x1(g1 g1Var, e8.i iVar) {
        this.f7213a = 17;
        this.f7215c = g1Var;
        y3.e.J(iVar, "savedListener");
        this.f7214b = iVar;
    }
}
