package ea;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class r implements Closeable {
    public static final c0 I;
    public long A;
    public long B;
    public long C;
    public long D;
    public final Socket E;
    public final z F;
    public final l G;
    public final LinkedHashSet H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f5495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f5496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f5497d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5498e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5499f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f5500n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final aa.f f5501o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final aa.c f5502p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final aa.c f5503q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final aa.c f5504r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final a4.q f5505s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f5506t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f5507u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f5508v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f5509w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f5510x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final c0 f5511y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public c0 f5512z;

    static {
        c0 c0Var = new c0();
        c0Var.c(7, 65535);
        c0Var.c(5, 16384);
        I = c0Var;
    }

    public r(f fVar) {
        boolean z10 = fVar.f5457a;
        this.f5494a = z10;
        this.f5495b = fVar.f5463g;
        this.f5496c = new LinkedHashMap();
        String str = fVar.f5460d;
        if (str == null) {
            d7.a.D("connectionName");
            throw null;
        }
        this.f5497d = str;
        this.f5499f = z10 ? 3 : 2;
        aa.f fVar2 = fVar.f5458b;
        this.f5501o = fVar2;
        aa.c cVarF = fVar2.f();
        this.f5502p = cVarF;
        this.f5503q = fVar2.f();
        this.f5504r = fVar2.f();
        this.f5505s = fVar.f5464h;
        c0 c0Var = new c0();
        if (z10) {
            c0Var.c(7, 16777216);
        }
        this.f5511y = c0Var;
        c0 c0Var2 = I;
        this.f5512z = c0Var2;
        this.D = c0Var2.a();
        Socket socket = fVar.f5459c;
        if (socket == null) {
            d7.a.D("socket");
            throw null;
        }
        this.E = socket;
        ja.h hVar = fVar.f5462f;
        if (hVar == null) {
            d7.a.D("sink");
            throw null;
        }
        this.F = new z(hVar, z10);
        ja.i iVar = fVar.f5461e;
        if (iVar == null) {
            d7.a.D("source");
            throw null;
        }
        this.G = new l(this, new u(iVar, z10));
        this.H = new LinkedHashSet();
        int i10 = fVar.f5465i;
        if (i10 != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(i10);
            cVarF.c(new p(str.concat(" ping"), this, nanos), nanos);
        }
    }

    public final void M(int i10, long j10) {
        this.f5502p.c(new q(this.f5497d + '[' + i10 + "] windowUpdate", this, i10, j10), 0L);
    }

    public final void a(b bVar, b bVar2, IOException iOException) {
        int i10;
        Object[] array;
        byte[] bArr = y9.b.f17000a;
        try {
            g(bVar);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (!this.f5496c.isEmpty()) {
                array = this.f5496c.values().toArray(new y[0]);
                this.f5496c.clear();
            } else {
                array = null;
            }
        }
        y[] yVarArr = (y[]) array;
        if (yVarArr != null) {
            for (y yVar : yVarArr) {
                try {
                    yVar.c(bVar2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.F.close();
        } catch (IOException unused3) {
        }
        try {
            this.E.close();
        } catch (IOException unused4) {
        }
        this.f5502p.e();
        this.f5503q.e();
        this.f5504r.e();
    }

    public final void b(IOException iOException) {
        b bVar = b.PROTOCOL_ERROR;
        a(bVar, bVar, iOException);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a(b.NO_ERROR, b.CANCEL, null);
    }

    public final synchronized y e(int i10) {
        return (y) this.f5496c.get(Integer.valueOf(i10));
    }

    public final synchronized y f(int i10) {
        y yVar;
        yVar = (y) this.f5496c.remove(Integer.valueOf(i10));
        notifyAll();
        return yVar;
    }

    public final void g(b bVar) {
        synchronized (this.F) {
            synchronized (this) {
                if (this.f5500n) {
                    return;
                }
                this.f5500n = true;
                this.F.e(this.f5498e, bVar, y9.b.f17000a);
            }
        }
    }

    public final synchronized void p(long j10) {
        long j11 = this.A + j10;
        this.A = j11;
        long j12 = j11 - this.B;
        if (j12 >= this.f5511y.a() / 2) {
            M(0, j12);
            this.B += j12;
        }
    }

    public final void q(int i10, boolean z10, ja.g gVar, long j10) {
        long j11;
        long j12;
        int iMin;
        long j13;
        if (j10 == 0) {
            this.F.r(i10, 0, gVar, z10);
            return;
        }
        while (j10 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            j11 = this.C;
                            j12 = this.D;
                            if (j11 >= j12) {
                                if (!this.f5496c.containsKey(Integer.valueOf(i10))) {
                                    throw new IOException("stream closed");
                                }
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                iMin = Math.min((int) Math.min(j10, j12 - j11), this.F.f5562d);
                j13 = iMin;
                this.C += j13;
            }
            j10 -= j13;
            this.F.r(i10, iMin, gVar, z10 && j10 == 0);
        }
    }

    public final void u(int i10, b bVar) {
        this.f5502p.c(new o(this.f5497d + '[' + i10 + "] writeSynReset", this, i10, bVar, 1), 0L);
    }
}
