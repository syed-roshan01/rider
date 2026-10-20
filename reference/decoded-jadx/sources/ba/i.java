package ba;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import l.r;
import x9.b0;
import x9.s;
import x9.w;

/* JADX INFO: loaded from: classes.dex */
public final class i implements x9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f2790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f2791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f2792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f2793d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x9.n f2794e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f2795f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final AtomicBoolean f2796n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f2797o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public e f2798p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public k f2799q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f2800r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public d f2801s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f2802t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f2803u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f2804v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public volatile boolean f2805w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public volatile d f2806x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public volatile k f2807y;

    public i(w wVar, r rVar, boolean z10) {
        d7.a.m(wVar, "client");
        d7.a.m(rVar, "originalRequest");
        this.f2790a = wVar;
        this.f2791b = rVar;
        this.f2792c = z10;
        this.f2793d = (l) wVar.f16475b.f10455b;
        x9.n nVar = (x9.n) wVar.f16478e.f2290b;
        byte[] bArr = y9.b.f17000a;
        d7.a.m(nVar, "$this_asFactory");
        this.f2794e = nVar;
        h hVar = new h(this);
        hVar.g(0, TimeUnit.MILLISECONDS);
        this.f2795f = hVar;
        this.f2796n = new AtomicBoolean();
        this.f2804v = true;
    }

    public static final String a(i iVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(iVar.f2805w ? "canceled " : "");
        sb.append(iVar.f2792c ? "web socket" : "call");
        sb.append(" to ");
        sb.append(((s) iVar.f2791b.f10910b).f());
        return sb.toString();
    }

    public final void b(k kVar) {
        byte[] bArr = y9.b.f17000a;
        if (this.f2799q != null) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.f2799q = kVar;
        kVar.f2823p.add(new g(this, this.f2797o));
    }

    public final IOException c(IOException iOException) {
        IOException interruptedIOException;
        Socket socketI;
        byte[] bArr = y9.b.f17000a;
        k kVar = this.f2799q;
        if (kVar != null) {
            synchronized (kVar) {
                socketI = i();
            }
            if (this.f2799q == null) {
                if (socketI != null) {
                    y9.b.c(socketI);
                }
                this.f2794e.getClass();
            } else if (socketI != null) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        if (!this.f2800r && this.f2795f.i()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        if (iOException != null) {
            x9.n nVar = this.f2794e;
            d7.a.j(interruptedIOException);
            nVar.getClass();
        } else {
            this.f2794e.getClass();
        }
        return interruptedIOException;
    }

    public final Object clone() {
        return new i(this.f2790a, this.f2791b, this.f2792c);
    }

    public final void d() {
        Socket socket;
        if (this.f2805w) {
            return;
        }
        this.f2805w = true;
        d dVar = this.f2806x;
        if (dVar != null) {
            dVar.f2771d.cancel();
        }
        k kVar = this.f2807y;
        if (kVar != null && (socket = kVar.f2810c) != null) {
            y9.b.c(socket);
        }
        this.f2794e.getClass();
    }

    public final void e(boolean z10) {
        d dVar;
        synchronized (this) {
            if (!this.f2804v) {
                throw new IllegalStateException("released".toString());
            }
        }
        if (z10 && (dVar = this.f2806x) != null) {
            dVar.f2771d.cancel();
            dVar.f2768a.g(dVar, true, true, null);
        }
        this.f2801s = null;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x008f  */
    public final b0 f() throws Throwable {
        ArrayList arrayList = new ArrayList();
        r8.n.A0(this.f2790a.f16476c, arrayList);
        arrayList.add(new ca.g(this.f2790a));
        arrayList.add(new ca.a(this.f2790a.f16483q));
        this.f2790a.getClass();
        arrayList.add(new z9.a());
        arrayList.add(a.f2756a);
        if (!this.f2792c) {
            r8.n.A0(this.f2790a.f16477d, arrayList);
        }
        arrayList.add(new ca.b(this.f2792c));
        r rVar = this.f2791b;
        w wVar = this.f2790a;
        boolean z10 = false;
        try {
            b0 b0VarB = new ca.f(this, arrayList, 0, null, rVar, wVar.C, wVar.D, wVar.E).b(this.f2791b);
            if (this.f2805w) {
                y9.b.b(b0VarB);
                throw new IOException("Canceled");
            }
            h(null);
            return b0VarB;
        } catch (IOException e4) {
            try {
                IOException iOExceptionH = h(e4);
                d7.a.k(iOExceptionH, "null cannot be cast to non-null type kotlin.Throwable");
                throw iOExceptionH;
            } catch (Throwable th) {
                th = th;
                z10 = true;
                if (!z10) {
                    h(null);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            if (!z10) {
                h(null);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0020 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0022 A[Catch: all -> 0x0018, TryCatch #1 {all -> 0x0018, blocks: (B:8:0x0013, B:17:0x0022, B:19:0x0026, B:20:0x0028, B:22:0x002c, B:27:0x0035, B:29:0x0039, B:14:0x001c), top: B:53:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0026 A[Catch: all -> 0x0018, TryCatch #1 {all -> 0x0018, blocks: (B:8:0x0013, B:17:0x0022, B:19:0x0026, B:20:0x0028, B:22:0x002c, B:27:0x0035, B:29:0x0039, B:14:0x001c), top: B:53:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0032  */
    public final IOException g(d dVar, boolean z10, boolean z11, IOException iOException) {
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        d7.a.m(dVar, "exchange");
        if (!d7.a.d(dVar, this.f2806x)) {
            return iOException;
        }
        synchronized (this) {
            z12 = false;
            if (z10) {
                try {
                    if (this.f2802t) {
                        if (z10) {
                            this.f2802t = false;
                        }
                        if (z11) {
                            this.f2803u = false;
                        }
                        z14 = this.f2802t;
                        if (z14) {
                            z15 = false;
                        } else {
                            z15 = false;
                        }
                        if (!z14) {
                            z12 = true;
                        }
                        z13 = z12;
                        z12 = z15;
                    } else if (z11 || !this.f2803u) {
                        z13 = false;
                    } else {
                        if (z10) {
                            this.f2802t = false;
                        }
                        if (z11) {
                            this.f2803u = false;
                        }
                        z14 = this.f2802t;
                        if (z14 || this.f2803u) {
                            z15 = false;
                        } else {
                            z15 = true;
                        }
                        if (!z14 && !this.f2803u && !this.f2804v) {
                            z12 = true;
                        }
                        z13 = z12;
                        z12 = z15;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                if (z11) {
                }
                z13 = false;
            }
        }
        if (z12) {
            this.f2806x = null;
            k kVar = this.f2799q;
            if (kVar != null) {
                synchronized (kVar) {
                    kVar.f2820m++;
                }
            }
        }
        return z13 ? c(iOException) : iOException;
    }

    public final IOException h(IOException iOException) {
        boolean z10;
        synchronized (this) {
            z10 = false;
            if (this.f2804v) {
                this.f2804v = false;
                if (!this.f2802t && !this.f2803u) {
                    z10 = true;
                }
            }
        }
        return z10 ? c(iOException) : iOException;
    }

    public final Socket i() {
        k kVar = this.f2799q;
        d7.a.j(kVar);
        byte[] bArr = y9.b.f17000a;
        ArrayList arrayList = kVar.f2823p;
        Iterator it = arrayList.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            if (d7.a.d(((Reference) it.next()).get(), this)) {
                break;
            }
            i10++;
        }
        if (i10 == -1) {
            throw new IllegalStateException("Check failed.".toString());
        }
        arrayList.remove(i10);
        this.f2799q = null;
        if (arrayList.isEmpty()) {
            kVar.f2824q = System.nanoTime();
            l lVar = this.f2793d;
            lVar.getClass();
            byte[] bArr2 = y9.b.f17000a;
            boolean z10 = kVar.f2817j;
            aa.c cVar = lVar.f2827c;
            if (z10 || lVar.f2825a == 0) {
                kVar.f2817j = true;
                ConcurrentLinkedQueue concurrentLinkedQueue = lVar.f2829e;
                concurrentLinkedQueue.remove(kVar);
                if (concurrentLinkedQueue.isEmpty()) {
                    cVar.a();
                }
                Socket socket = kVar.f2811d;
                d7.a.j(socket);
                return socket;
            }
            cVar.c(lVar.f2828d, 0L);
        }
        return null;
    }
}
