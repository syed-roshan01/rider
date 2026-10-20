package ea;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f5545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f5546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f5547d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f5548e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f5549f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayDeque f5550g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f5551h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w f5552i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final v f5553j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final x f5554k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final x f5555l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public b f5556m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public IOException f5557n;

    public y(int i10, r rVar, boolean z10, boolean z11, x9.q qVar) {
        this.f5544a = i10;
        this.f5545b = rVar;
        this.f5549f = rVar.f5512z.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f5550g = arrayDeque;
        this.f5552i = new w(this, rVar.f5511y.a(), z11);
        this.f5553j = new v(this, z10);
        this.f5554k = new x(this);
        this.f5555l = new x(this);
        if (qVar == null) {
            if (!g()) {
                throw new IllegalStateException("remotely-initiated streams should have headers".toString());
            }
        } else {
            if (!(!g())) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
            }
            arrayDeque.add(qVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x001b  */
    public final void a() {
        boolean z10;
        boolean zH;
        byte[] bArr = y9.b.f17000a;
        synchronized (this) {
            try {
                w wVar = this.f5552i;
                if (wVar.f5538b || !wVar.f5541e) {
                    z10 = false;
                } else {
                    v vVar = this.f5553j;
                    if (vVar.f5533a || vVar.f5535c) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                zH = h();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z10) {
            c(b.CANCEL, null);
        } else {
            if (zH) {
                return;
            }
            this.f5545b.f(this.f5544a);
        }
    }

    public final void b() throws IOException {
        v vVar = this.f5553j;
        if (vVar.f5535c) {
            throw new IOException("stream closed");
        }
        if (vVar.f5533a) {
            throw new IOException("stream finished");
        }
        if (this.f5556m != null) {
            IOException iOException = this.f5557n;
            if (iOException != null) {
                throw iOException;
            }
            b bVar = this.f5556m;
            d7.a.j(bVar);
            throw new d0(bVar);
        }
    }

    public final void c(b bVar, IOException iOException) {
        if (d(bVar, iOException)) {
            r rVar = this.f5545b;
            rVar.getClass();
            rVar.F.f(this.f5544a, bVar);
        }
    }

    public final boolean d(b bVar, IOException iOException) {
        byte[] bArr = y9.b.f17000a;
        synchronized (this) {
            if (this.f5556m != null) {
                return false;
            }
            this.f5556m = bVar;
            this.f5557n = iOException;
            notifyAll();
            if (this.f5552i.f5538b && this.f5553j.f5533a) {
                return false;
            }
            this.f5545b.f(this.f5544a);
            return true;
        }
    }

    public final void e(b bVar) {
        if (d(bVar, null)) {
            this.f5545b.u(this.f5544a, bVar);
        }
    }

    public final v f() {
        synchronized (this) {
            if (!this.f5551h && !g()) {
                throw new IllegalStateException("reply before requesting the sink".toString());
            }
        }
        return this.f5553j;
    }

    public final boolean g() {
        return this.f5545b.f5494a == ((this.f5544a & 1) == 1);
    }

    public final synchronized boolean h() {
        if (this.f5556m != null) {
            return false;
        }
        w wVar = this.f5552i;
        if (wVar.f5538b || wVar.f5541e) {
            v vVar = this.f5553j;
            if ((vVar.f5533a || vVar.f5535c) && this.f5551h) {
                return false;
            }
        }
        return true;
    }

    public final void i(x9.q qVar, boolean z10) {
        boolean zH;
        d7.a.m(qVar, "headers");
        byte[] bArr = y9.b.f17000a;
        synchronized (this) {
            try {
                if (this.f5551h && z10) {
                    this.f5552i.getClass();
                } else {
                    this.f5551h = true;
                    this.f5550g.add(qVar);
                }
                if (z10) {
                    this.f5552i.f5538b = true;
                }
                zH = h();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zH) {
            return;
        }
        this.f5545b.f(this.f5544a);
    }

    public final synchronized void j(b bVar) {
        if (this.f5556m == null) {
            this.f5556m = bVar;
            notifyAll();
        }
    }

    public final void k() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
