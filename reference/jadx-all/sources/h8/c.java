package h8;

import g8.r5;
import ja.e0;
import ja.i0;
import java.io.IOException;
import java.net.Socket;

/* JADX INFO: loaded from: classes.dex */
public final class c implements e0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r5 f7605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f7606d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f7607e;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public e0 f7611p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Socket f7612q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f7613r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f7614s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f7615t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f7603a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ja.g f7604b = new ja.g();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f7608f = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f7609n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f7610o = false;

    public c(r5 r5Var, d dVar) {
        y3.e.J(r5Var, "executor");
        this.f7605c = r5Var;
        y3.e.J(dVar, "exceptionHandler");
        this.f7606d = dVar;
        this.f7607e = 10000;
    }

    public final void a(ja.b bVar, Socket socket) {
        y3.e.N("AsyncSink's becomeConnected should only be called once.", this.f7611p == null);
        this.f7611p = bVar;
        this.f7612q = socket;
    }

    @Override // ja.e0
    public final void b0(ja.g gVar, long j10) throws IOException {
        y3.e.J(gVar, "source");
        if (this.f7610o) {
            throw new IOException("closed");
        }
        o8.b.d();
        try {
            synchronized (this.f7603a) {
                try {
                    this.f7604b.b0(gVar, j10);
                    int i10 = this.f7615t + this.f7614s;
                    this.f7615t = i10;
                    this.f7614s = 0;
                    boolean z10 = true;
                    if (this.f7613r || i10 <= this.f7607e) {
                        if (!this.f7608f && !this.f7609n && this.f7604b.b() > 0) {
                            this.f7608f = true;
                            z10 = false;
                        }
                        o8.b.f12664a.getClass();
                        return;
                    }
                    this.f7613r = true;
                    if (!z10) {
                        this.f7605c.execute(new a(this, 0));
                        o8.b.f12664a.getClass();
                    } else {
                        try {
                            this.f7612q.close();
                        } catch (IOException e4) {
                            ((n) this.f7606d).p(e4);
                        }
                        o8.b.f12664a.getClass();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            try {
                o8.b.f12664a.getClass();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // ja.e0
    public final i0 c() {
        return i0.f8535d;
    }

    @Override // ja.e0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f7610o) {
            return;
        }
        this.f7610o = true;
        this.f7605c.execute(new h.a(this, 11));
    }

    @Override // ja.e0, java.io.Flushable
    public final void flush() throws IOException {
        if (this.f7610o) {
            throw new IOException("closed");
        }
        o8.b.d();
        try {
            synchronized (this.f7603a) {
                if (this.f7609n) {
                    o8.b.f12664a.getClass();
                    return;
                }
                this.f7609n = true;
                this.f7605c.execute(new a(this, 1));
                o8.b.f12664a.getClass();
            }
        } catch (Throwable th) {
            try {
                o8.b.f12664a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
