package g8;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class y2 implements h0 {
    public static final e8.g1 E;
    public static final e8.g1 F;
    public static final e8.c2 G;
    public static final Random H;
    public final /* synthetic */ e8.p1 A;
    public final /* synthetic */ e8.h B;
    public final /* synthetic */ e8.b0 C;
    public final /* synthetic */ z5.k D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e8.p1 f7263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f7264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e8.h2 f7265c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f7266d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e8.l1 f7267e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i5 f7268f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u1 f7269g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f7270h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f7271i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o f7272j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f7273k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f7274l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final h5 f7275m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final u f7276n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile c5 f7277o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AtomicBoolean f7278p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AtomicInteger f7279q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final AtomicInteger f7280r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public l.z2 f7281s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f7282t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public j0 f7283u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public r7.h f7284v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public r7.h f7285w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f7286x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public e8.c2 f7287y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f7288z;

    static {
        x9.v vVar = e8.l1.f5303d;
        BitSet bitSet = e8.i1.f5283d;
        E = new e8.g1("grpc-previous-rpc-attempts", vVar);
        F = new e8.g1("grpc-retry-pushback-ms", vVar);
        G = e8.c2.f5217f.g("Stream thrown away because RetriableStream committed");
        H = new Random();
    }

    public y2(z5.k kVar, e8.p1 p1Var, e8.l1 l1Var, e8.h hVar, i5 i5Var, u1 u1Var, e8.b0 b0Var) {
        this.D = kVar;
        this.A = p1Var;
        this.B = hVar;
        this.C = b0Var;
        l3 l3Var = (l3) kVar.f17260a;
        o oVar = l3Var.T;
        long j10 = l3Var.U;
        long j11 = l3Var.V;
        l3Var.getClass();
        Executor executor = hVar.f5268b;
        executor = executor == null ? l3Var.f6934h : executor;
        ScheduledExecutorService scheduledExecutorServiceL = ((l3) kVar.f17260a).f6932f.f7206a.L();
        h5 h5Var = (h5) kVar.f17261b;
        this.f7265c = new e8.h2(new x2(this, 1 == true ? 1 : 0));
        this.f7271i = new Object();
        this.f7276n = new u();
        this.f7277o = new c5(new ArrayList(8), Collections.emptyList(), null, null, false, false, false, 0);
        this.f7278p = new AtomicBoolean();
        this.f7279q = new AtomicInteger();
        this.f7280r = new AtomicInteger();
        this.f7263a = p1Var;
        this.f7272j = oVar;
        this.f7273k = j10;
        this.f7274l = j11;
        this.f7264b = executor;
        this.f7266d = scheduledExecutorServiceL;
        this.f7267e = l1Var;
        this.f7268f = i5Var;
        if (i5Var != null) {
            this.f7286x = i5Var.f6856b;
        }
        this.f7269g = u1Var;
        y3.e.G("Should not provide both retryPolicy and hedgingPolicy", i5Var == null || u1Var == null);
        this.f7270h = u1Var != null;
        this.f7275m = h5Var;
    }

    public static void r(y2 y2Var, Integer num) {
        y2Var.getClass();
        if (num == null) {
            return;
        }
        if (num.intValue() < 0) {
            y2Var.w();
            return;
        }
        synchronized (y2Var.f7271i) {
            try {
                r7.h hVar = y2Var.f7285w;
                if (hVar != null) {
                    hVar.f13604b = true;
                    Future future = (Future) hVar.f13606d;
                    r7.h hVar2 = new r7.h(y2Var.f7271i);
                    y2Var.f7285w = hVar2;
                    if (future != null) {
                        future.cancel(false);
                    }
                    hVar2.e(y2Var.f7266d.schedule(new x1(25, y2Var, hVar2), num.intValue(), TimeUnit.MILLISECONDS));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // g8.z5
    public final void a(int i10) {
        c5 c5Var = this.f7277o;
        if (c5Var.f6701a) {
            c5Var.f6706f.f6817a.a(i10);
        } else {
            u(new w4(i10, 2));
        }
    }

    @Override // g8.h0
    public final void b(int i10) {
        u(new w4(i10, 0));
    }

    @Override // g8.z5
    public final void c(boolean z10) {
        u(new v4(1, z10));
    }

    @Override // g8.z5
    public final void d(e8.s sVar) {
        u(new t4(this, sVar, 1));
    }

    @Override // g8.h0
    public final void e(int i10) {
        u(new w4(i10, 1));
    }

    @Override // g8.h0
    public final void f(u uVar) {
        c5 c5Var;
        synchronized (this.f7271i) {
            uVar.c(this.f7276n, "closed");
            c5Var = this.f7277o;
        }
        if (c5Var.f6706f != null) {
            u uVar2 = new u();
            c5Var.f6706f.f6817a.f(uVar2);
            uVar.c(uVar2, "committed");
            return;
        }
        u uVar3 = new u();
        for (g5 g5Var : c5Var.f6703c) {
            u uVar4 = new u();
            g5Var.f6817a.f(uVar4);
            uVar3.b(uVar4);
        }
        uVar.c(uVar3, "open");
    }

    @Override // g8.z5
    public final void flush() {
        c5 c5Var = this.f7277o;
        if (c5Var.f6701a) {
            c5Var.f6706f.f6817a.flush();
        } else {
            u(new u4(0));
        }
    }

    @Override // g8.h0
    public final void g(e8.c0 c0Var) {
        u(new t4(this, c0Var, 2));
    }

    @Override // g8.h0
    public final void h(e8.e0 e0Var) {
        u(new t4(this, e0Var, 3));
    }

    @Override // g8.h0
    public final void i(e8.c2 c2Var) {
        g5 g5Var;
        g5 g5Var2 = new g5(0);
        g5Var2.f6817a = new d4();
        b3.a1 a1VarS = s(g5Var2);
        if (a1VarS != null) {
            synchronized (this.f7271i) {
                this.f7277o = this.f7277o.e(g5Var2);
            }
            a1VarS.run();
            y(c2Var, i0.f6839a, new e8.l1());
            return;
        }
        synchronized (this.f7271i) {
            try {
                if (this.f7277o.f6703c.contains(this.f7277o.f6706f)) {
                    g5Var = this.f7277o.f6706f;
                } else {
                    this.f7287y = c2Var;
                    g5Var = null;
                }
                c5 c5Var = this.f7277o;
                this.f7277o = new c5(c5Var.f6702b, c5Var.f6703c, c5Var.f6704d, c5Var.f6706f, true, c5Var.f6701a, c5Var.f6708h, c5Var.f6705e);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (g5Var != null) {
            g5Var.f6817a.i(c2Var);
        }
    }

    @Override // g8.h0
    public final void j(j0 j0Var) {
        r7.h hVar;
        e8.c2 c2Var;
        h5 h5Var;
        this.f7283u = j0Var;
        i3.a0 a0Var = ((l3) this.D.f17260a).E;
        synchronized (a0Var.f7941a) {
            try {
                Object obj = a0Var.f7943c;
                hVar = null;
                if (((e8.c2) obj) != null) {
                    c2Var = (e8.c2) obj;
                } else {
                    ((Collection) a0Var.f7942b).add(this);
                    c2Var = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c2Var != null) {
            i(c2Var);
            return;
        }
        synchronized (this.f7271i) {
            this.f7277o.f6702b.add(new b5(this));
        }
        g5 g5VarT = t(0, false);
        if (g5VarT == null) {
            return;
        }
        if (this.f7270h) {
            synchronized (this.f7271i) {
                try {
                    this.f7277o = this.f7277o.a(g5VarT);
                    if (x(this.f7277o) && ((h5Var = this.f7275m) == null || h5Var.f6837d.get() > h5Var.f6835b)) {
                        hVar = new r7.h(this.f7271i);
                        this.f7285w = hVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (hVar != null) {
                hVar.e(this.f7266d.schedule(new x1(25, this, hVar), this.f7269g.f7152b, TimeUnit.NANOSECONDS));
            }
        }
        v(g5VarT);
    }

    @Override // g8.z5
    public final boolean k() {
        Iterator it = this.f7277o.f6703c.iterator();
        while (it.hasNext()) {
            if (((g5) it.next()).f6817a.k()) {
                return true;
            }
        }
        return false;
    }

    @Override // g8.z5
    public final void l(InputStream inputStream) {
        throw new IllegalStateException("RetriableStream.writeMessage() should not be called directly");
    }

    @Override // g8.h0
    public final void m(String str) {
        u(new t4(this, str, 0));
    }

    @Override // g8.z5
    public final void n() {
        u(new u4(2));
    }

    @Override // g8.h0
    public final void o() {
        u(new u4(1));
    }

    @Override // g8.h0
    public final e8.c p() {
        return this.f7277o.f6706f != null ? this.f7277o.f6706f.f6817a.p() : e8.c.f5206b;
    }

    @Override // g8.h0
    public final void q(boolean z10) {
        u(new v4(0, z10));
    }

    public final b3.a1 s(g5 g5Var) {
        Collection collectionEmptyList;
        boolean z10;
        List list;
        Future future;
        Future future2;
        synchronized (this.f7271i) {
            try {
                if (this.f7277o.f6706f != null) {
                    return null;
                }
                Collection collection = this.f7277o.f6703c;
                c5 c5Var = this.f7277o;
                y3.e.N("Already committed", c5Var.f6706f == null);
                if (c5Var.f6703c.contains(g5Var)) {
                    list = null;
                    collectionEmptyList = Collections.singleton(g5Var);
                    z10 = true;
                } else {
                    collectionEmptyList = Collections.emptyList();
                    z10 = false;
                    list = c5Var.f6702b;
                }
                this.f7277o = new c5(list, collectionEmptyList, c5Var.f6704d, g5Var, c5Var.f6707g, z10, c5Var.f6708h, c5Var.f6705e);
                this.f7272j.f7013a.addAndGet(-this.f7282t);
                r7.h hVar = this.f7284v;
                if (hVar != null) {
                    hVar.f13604b = true;
                    Future future3 = (Future) hVar.f13606d;
                    this.f7284v = null;
                    future = future3;
                } else {
                    future = null;
                }
                r7.h hVar2 = this.f7285w;
                if (hVar2 != null) {
                    hVar2.f13604b = true;
                    future2 = (Future) hVar2.f13606d;
                    this.f7285w = null;
                } else {
                    future2 = null;
                }
                return new b3.a1(this, collection, g5Var, future, future2, 3);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final g5 t(int i10, boolean z10) {
        AtomicInteger atomicInteger;
        int i11;
        do {
            atomicInteger = this.f7280r;
            i11 = atomicInteger.get();
            if (i11 < 0) {
                return null;
            }
        } while (!atomicInteger.compareAndSet(i11, i11 + 1));
        g5 g5Var = new g5(i10);
        x4 x4Var = new x4(new z4(this, g5Var));
        e8.l1 l1Var = new e8.l1();
        l1Var.d(this.f7267e);
        if (i10 > 0) {
            l1Var.f(E, String.valueOf(i10));
        }
        e8.h hVar = this.B;
        hVar.getClass();
        List list = hVar.f5273g;
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.addAll(list);
        arrayList.add(x4Var);
        e8.g gVarB = e8.h.b(hVar);
        gVarB.f5254g = Collections.unmodifiableList(arrayList);
        e8.h hVar2 = new e8.h(gVarB);
        e8.p[] pVarArrC = s1.c(hVar2, l1Var, i10, z10);
        e8.p1 p1Var = this.A;
        k0 k0VarB = this.D.b(new j4(p1Var, l1Var, hVar2));
        e8.b0 b0Var = this.C;
        e8.b0 b0VarA = b0Var.a();
        try {
            h0 h0VarD = k0VarB.d(p1Var, l1Var, hVar2, pVarArrC);
            b0Var.c(b0VarA);
            g5Var.f6817a = h0VarD;
            return g5Var;
        } catch (Throwable th) {
            b0Var.c(b0VarA);
            throw th;
        }
    }

    public final void u(y4 y4Var) {
        Collection collection;
        synchronized (this.f7271i) {
            try {
                if (!this.f7277o.f6701a) {
                    this.f7277o.f6702b.add(y4Var);
                }
                collection = this.f7277o.f6703c;
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            y4Var.a((g5) it.next());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x008a, code lost:
    
        r0 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0092, code lost:
    
        if (r0.hasNext() == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0094, code lost:
    
        r4 = (g8.y4) r0.next();
        r4.a(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x009f, code lost:
    
        if ((r4 instanceof g8.b5) == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a1, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a2, code lost:
    
        r4 = r8.f7277o;
        r5 = r4.f6706f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a6, code lost:
    
        if (r5 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a8, code lost:
    
        if (r5 == r9) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ad, code lost:
    
        if (r4.f6707g == false) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(g8.g5 r9) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            r2 = r0
            r3 = r1
        L4:
            java.lang.Object r4 = r8.f7271i
            monitor-enter(r4)
            g8.c5 r5 = r8.f7277o     // Catch: java.lang.Throwable -> L11
            g8.g5 r6 = r5.f6706f     // Catch: java.lang.Throwable -> L11
            if (r6 == 0) goto L14
            if (r6 == r9) goto L14
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            goto L38
        L11:
            r9 = move-exception
            goto Lb2
        L14:
            boolean r6 = r5.f6707g     // Catch: java.lang.Throwable -> L11
            if (r6 == 0) goto L1a
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            goto L38
        L1a:
            java.util.List r6 = r5.f6702b     // Catch: java.lang.Throwable -> L11
            int r6 = r6.size()     // Catch: java.lang.Throwable -> L11
            if (r0 != r6) goto L5d
            g8.c5 r0 = r5.e(r9)     // Catch: java.lang.Throwable -> L11
            r8.f7277o = r0     // Catch: java.lang.Throwable -> L11
            boolean r0 = r8.k()     // Catch: java.lang.Throwable -> L11
            if (r0 != 0) goto L30
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            goto L62
        L30:
            g8.t0 r1 = new g8.t0     // Catch: java.lang.Throwable -> L11
            r0 = 9
            r1.<init>(r8, r0)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
        L38:
            if (r1 == 0) goto L40
            e8.h2 r9 = r8.f7265c
            r9.execute(r1)
            goto L62
        L40:
            if (r2 != 0) goto L4c
            g8.h0 r0 = r9.f6817a
            g8.f5 r1 = new g8.f5
            r1.<init>(r8, r9)
            r0.j(r1)
        L4c:
            g8.h0 r0 = r9.f6817a
            g8.c5 r1 = r8.f7277o
            g8.g5 r1 = r1.f6706f
            if (r1 != r9) goto L57
            e8.c2 r9 = r8.f7287y
            goto L59
        L57:
            e8.c2 r9 = g8.y2.G
        L59:
            r0.i(r9)
            goto L62
        L5d:
            boolean r6 = r9.f6818b     // Catch: java.lang.Throwable -> L11
            if (r6 == 0) goto L63
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
        L62:
            return
        L63:
            int r6 = r0 + 128
            java.util.List r7 = r5.f6702b     // Catch: java.lang.Throwable -> L11
            int r7 = r7.size()     // Catch: java.lang.Throwable -> L11
            int r6 = java.lang.Math.min(r6, r7)     // Catch: java.lang.Throwable -> L11
            if (r3 != 0) goto L7d
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L11
            java.util.List r5 = r5.f6702b     // Catch: java.lang.Throwable -> L11
            java.util.List r0 = r5.subList(r0, r6)     // Catch: java.lang.Throwable -> L11
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L11
            goto L89
        L7d:
            r3.clear()     // Catch: java.lang.Throwable -> L11
            java.util.List r5 = r5.f6702b     // Catch: java.lang.Throwable -> L11
            java.util.List r0 = r5.subList(r0, r6)     // Catch: java.lang.Throwable -> L11
            r3.addAll(r0)     // Catch: java.lang.Throwable -> L11
        L89:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            java.util.Iterator r0 = r3.iterator()
        L8e:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto Laf
            java.lang.Object r4 = r0.next()
            g8.y4 r4 = (g8.y4) r4
            r4.a(r9)
            boolean r4 = r4 instanceof g8.b5
            if (r4 == 0) goto La2
            r2 = 1
        La2:
            g8.c5 r4 = r8.f7277o
            g8.g5 r5 = r4.f6706f
            if (r5 == 0) goto Lab
            if (r5 == r9) goto Lab
            goto Laf
        Lab:
            boolean r4 = r4.f6707g
            if (r4 == 0) goto L8e
        Laf:
            r0 = r6
            goto L4
        Lb2:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: g8.y2.v(g8.g5):void");
    }

    public final void w() {
        Future future;
        synchronized (this.f7271i) {
            try {
                r7.h hVar = this.f7285w;
                future = null;
                if (hVar != null) {
                    hVar.f13604b = true;
                    Future future2 = (Future) hVar.f13606d;
                    this.f7285w = null;
                    future = future2;
                }
                c5 c5Var = this.f7277o;
                if (!c5Var.f6708h) {
                    c5Var = new c5(c5Var.f6702b, c5Var.f6703c, c5Var.f6704d, c5Var.f6706f, c5Var.f6707g, c5Var.f6701a, true, c5Var.f6705e);
                }
                this.f7277o = c5Var;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (future != null) {
            future.cancel(false);
        }
    }

    public final boolean x(c5 c5Var) {
        if (c5Var.f6706f == null) {
            if (c5Var.f6705e < this.f7269g.f7151a && !c5Var.f6708h) {
                return true;
            }
        }
        return false;
    }

    public final void y(e8.c2 c2Var, i0 i0Var, e8.l1 l1Var) {
        this.f7281s = new l.z2(c2Var, i0Var, l1Var, 22);
        if (this.f7280r.addAndGet(Integer.MIN_VALUE) == Integer.MIN_VALUE) {
            this.f7265c.execute(new k.e(this, c2Var, i0Var, l1Var, 8));
        }
    }

    public final void z(Object obj) {
        c5 c5Var = this.f7277o;
        if (c5Var.f6701a) {
            c5Var.f6706f.f6817a.l(this.f7263a.d(obj));
        } else {
            u(new t4(this, obj, 4));
        }
    }
}
