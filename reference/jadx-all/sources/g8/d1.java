package g8;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class d1 implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f6714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j0 f6715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h0 f6716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e8.c2 f6717d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c1 f6719f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f6720g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f6721h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f6718e = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList f6722i = new ArrayList();

    @Override // g8.z5
    public final void a(int i10) {
        y3.e.N("May only be called after start", this.f6715b != null);
        if (this.f6714a) {
            this.f6716c.a(i10);
        } else {
            r(new z0(this, i10, 0));
        }
    }

    @Override // g8.h0
    public final void b(int i10) {
        y3.e.N("May only be called before start", this.f6715b == null);
        this.f6722i.add(new z0(this, i10, 1));
    }

    @Override // g8.z5
    public final void c(boolean z10) {
        y3.e.N("May only be called after start", this.f6715b != null);
        if (this.f6714a) {
            this.f6716c.c(z10);
        } else {
            r(new b1(this, z10, 1));
        }
    }

    @Override // g8.z5
    public final void d(e8.s sVar) {
        y3.e.N("May only be called before start", this.f6715b == null);
        y3.e.J(sVar, "compressor");
        this.f6722i.add(new x1(9, this, sVar));
    }

    @Override // g8.h0
    public final void e(int i10) {
        y3.e.N("May only be called before start", this.f6715b == null);
        this.f6722i.add(new z0(this, i10, 2));
    }

    @Override // g8.h0
    public void f(u uVar) {
        synchronized (this) {
            try {
                if (this.f6715b == null) {
                    return;
                }
                if (this.f6716c != null) {
                    uVar.c(Long.valueOf(this.f6721h - this.f6720g), "buffered_nanos");
                    this.f6716c.f(uVar);
                } else {
                    uVar.c(Long.valueOf(System.nanoTime() - this.f6720g), "buffered_nanos");
                    uVar.b("waiting_for_connection");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // g8.z5
    public final void flush() {
        y3.e.N("May only be called after start", this.f6715b != null);
        if (this.f6714a) {
            this.f6716c.flush();
        } else {
            r(new a1(this, 2));
        }
    }

    @Override // g8.h0
    public final void g(e8.c0 c0Var) {
        y3.e.N("May only be called before start", this.f6715b == null);
        this.f6722i.add(new x1(11, this, c0Var));
    }

    @Override // g8.h0
    public final void h(e8.e0 e0Var) {
        y3.e.N("May only be called before start", this.f6715b == null);
        y3.e.J(e0Var, "decompressorRegistry");
        this.f6722i.add(new x1(10, this, e0Var));
    }

    @Override // g8.h0
    public void i(e8.c2 c2Var) {
        boolean z10 = false;
        boolean z11 = true;
        y3.e.N("May only be called after start", this.f6715b != null);
        y3.e.J(c2Var, "reason");
        synchronized (this) {
            try {
                h0 h0Var = this.f6716c;
                if (h0Var == null) {
                    d4 d4Var = d4.f6728a;
                    if (h0Var != null) {
                        z11 = false;
                    }
                    y3.e.M(h0Var, "realStream already set to %s", z11);
                    this.f6716c = d4Var;
                    this.f6721h = System.nanoTime();
                    this.f6717d = c2Var;
                } else {
                    z10 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z10) {
            r(new x1(14, this, c2Var));
            return;
        }
        s();
        t(c2Var);
        this.f6715b.c(c2Var, i0.f6839a, new e8.l1());
    }

    @Override // g8.h0
    public final void j(j0 j0Var) {
        e8.c2 c2Var;
        boolean z10;
        y3.e.N("already started", this.f6715b == null);
        synchronized (this) {
            try {
                c2Var = this.f6717d;
                z10 = this.f6714a;
                if (!z10) {
                    c1 c1Var = new c1(j0Var);
                    this.f6719f = c1Var;
                    j0Var = c1Var;
                }
                this.f6715b = j0Var;
                this.f6720g = System.nanoTime();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c2Var != null) {
            j0Var.c(c2Var, i0.f6839a, new e8.l1());
            return;
        }
        if (z10) {
            Iterator it = this.f6722i.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            this.f6722i = null;
            this.f6716c.j(j0Var);
        }
    }

    @Override // g8.z5
    public final boolean k() {
        if (this.f6714a) {
            return this.f6716c.k();
        }
        return false;
    }

    @Override // g8.z5
    public final void l(InputStream inputStream) {
        y3.e.N("May only be called after start", this.f6715b != null);
        y3.e.J(inputStream, "message");
        if (this.f6714a) {
            this.f6716c.l(inputStream);
        } else {
            r(new x1(13, this, inputStream));
        }
    }

    @Override // g8.h0
    public final void m(String str) {
        y3.e.N("May only be called before start", this.f6715b == null);
        y3.e.J(str, "authority");
        this.f6722i.add(new x1(12, this, str));
    }

    @Override // g8.z5
    public final void n() {
        y3.e.N("May only be called before start", this.f6715b == null);
        this.f6722i.add(new a1(this, 0));
    }

    @Override // g8.h0
    public final void o() {
        y3.e.N("May only be called after start", this.f6715b != null);
        r(new a1(this, 3));
    }

    @Override // g8.h0
    public final e8.c p() {
        h0 h0Var;
        synchronized (this) {
            h0Var = this.f6716c;
        }
        return h0Var != null ? h0Var.p() : e8.c.f5206b;
    }

    @Override // g8.h0
    public final void q(boolean z10) {
        y3.e.N("May only be called before start", this.f6715b == null);
        this.f6722i.add(new b1(this, z10, 0));
    }

    public final void r(Runnable runnable) {
        y3.e.N("May only be called after start", this.f6715b != null);
        synchronized (this) {
            try {
                if (this.f6714a) {
                    runnable.run();
                } else {
                    this.f6718e.add(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002f A[Catch: all -> 0x002d, TryCatch #1 {all -> 0x002d, blocks: (B:11:0x001f, B:13:0x0027, B:14:0x002b, B:18:0x002f, B:19:0x0033), top: B:41:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:23:0x003e A[LOOP:3: B:21:0x0038->B:23:0x003e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x004f A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x001f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x0027 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0057, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005f, code lost:
    
        if (r0.hasNext() == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0061, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s() {
        /*
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r6)
            java.util.List r1 = r6.f6718e     // Catch: java.lang.Throwable -> L50
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L50
            if (r1 == 0) goto L52
            r0 = 0
            r6.f6718e = r0     // Catch: java.lang.Throwable -> L50
            r1 = 1
            r6.f6714a = r1     // Catch: java.lang.Throwable -> L50
            g8.c1 r2 = r6.f6719f     // Catch: java.lang.Throwable -> L50
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L50
            if (r2 == 0) goto L4f
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L1e:
            monitor-enter(r2)
            java.util.List r4 = r2.f6684c     // Catch: java.lang.Throwable -> L2d
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L2d
            if (r4 == 0) goto L2f
            r2.f6684c = r0     // Catch: java.lang.Throwable -> L2d
            r2.f6683b = r1     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r0 = move-exception
            goto L4d
        L2f:
            java.util.List r4 = r2.f6684c     // Catch: java.lang.Throwable -> L2d
            r2.f6684c = r3     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2d
            java.util.Iterator r3 = r4.iterator()
        L38:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L48
            java.lang.Object r5 = r3.next()
            java.lang.Runnable r5 = (java.lang.Runnable) r5
            r5.run()
            goto L38
        L48:
            r4.clear()
            r3 = r4
            goto L1e
        L4d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2d
            throw r0
        L4f:
            return
        L50:
            r0 = move-exception
            goto L70
        L52:
            java.util.List r1 = r6.f6718e     // Catch: java.lang.Throwable -> L50
            r6.f6718e = r0     // Catch: java.lang.Throwable -> L50
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L50
            java.util.Iterator r0 = r1.iterator()
        L5b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L6b
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L5b
        L6b:
            r1.clear()
            r0 = r1
            goto L5
        L70:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L50
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g8.d1.s():void");
    }

    public void t(e8.c2 c2Var) {
    }

    public final a1 u(h0 h0Var) {
        synchronized (this) {
            try {
                if (this.f6716c != null) {
                    return null;
                }
                y3.e.J(h0Var, "stream");
                h0 h0Var2 = this.f6716c;
                y3.e.M(h0Var2, "realStream already set to %s", h0Var2 == null);
                this.f6716c = h0Var;
                this.f6721h = System.nanoTime();
                j0 j0Var = this.f6715b;
                if (j0Var == null) {
                    this.f6718e = null;
                    this.f6714a = true;
                }
                if (j0Var == null) {
                    return null;
                }
                Iterator it = this.f6722i.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                this.f6722i = null;
                this.f6716c.j(j0Var);
                return new a1(this, 1);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
