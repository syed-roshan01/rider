package ea;

import java.io.Closeable;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class z implements Closeable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Logger f5558n = Logger.getLogger(e.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ja.h f5559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f5560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ja.g f5561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f5563e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j8.e f5564f;

    public z(ja.h hVar, boolean z10) {
        this.f5559a = hVar;
        this.f5560b = z10;
        ja.g gVar = new ja.g();
        this.f5561c = gVar;
        this.f5562d = 16384;
        this.f5564f = new j8.e(gVar, 0);
    }

    public final synchronized void N(int i10, long j10) {
        if (this.f5563e) {
            throw new IOException("closed");
        }
        if (j10 == 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j10).toString());
        }
        b(i10, 4, 8, 0);
        this.f5559a.s((int) j10);
        this.f5559a.flush();
    }

    public final synchronized void X(int i10, boolean z10, int i11) {
        if (this.f5563e) {
            throw new IOException("closed");
        }
        b(0, 8, 6, z10 ? 1 : 0);
        this.f5559a.s(i10);
        this.f5559a.s(i11);
        this.f5559a.flush();
    }

    public final synchronized void a(c0 c0Var) {
        d7.a.m(c0Var, "peerSettings");
        if (this.f5563e) {
            throw new IOException("closed");
        }
        int i10 = this.f5562d;
        int i11 = c0Var.f5448a;
        if ((i11 & 32) != 0) {
            i10 = c0Var.f5449b[5];
        }
        this.f5562d = i10;
        if (((i11 & 2) != 0 ? c0Var.f5449b[1] : -1) != -1) {
            j8.e eVar = this.f5564f;
            int i12 = (i11 & 2) != 0 ? c0Var.f5449b[1] : -1;
            eVar.getClass();
            int iMin = Math.min(i12, 16384);
            int i13 = eVar.f8468f;
            if (i13 != iMin) {
                if (iMin < i13) {
                    eVar.f8466d = Math.min(eVar.f8466d, iMin);
                }
                eVar.f8467e = true;
                eVar.f8468f = iMin;
                int i14 = eVar.f8471i;
                if (iMin < i14) {
                    if (iMin == 0) {
                        eVar.a();
                    } else {
                        eVar.b(i14 - iMin);
                    }
                }
            }
        }
        b(0, 0, 4, 1);
        this.f5559a.flush();
    }

    public final void b(int i10, int i11, int i12, int i13) {
        Level level = Level.FINE;
        Logger logger = f5558n;
        if (logger.isLoggable(level)) {
            logger.fine(e.a(i10, i11, i12, i13, false));
        }
        if (i11 > this.f5562d) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f5562d + ": " + i11).toString());
        }
        if ((Integer.MIN_VALUE & i10) != 0) {
            throw new IllegalArgumentException(l.q.g("reserved bit set: ", i10).toString());
        }
        byte[] bArr = y9.b.f17000a;
        ja.h hVar = this.f5559a;
        d7.a.m(hVar, "<this>");
        hVar.C((i11 >>> 16) & 255);
        hVar.C((i11 >>> 8) & 255);
        hVar.C(i11 & 255);
        hVar.C(i12 & 255);
        hVar.C(i13 & 255);
        hVar.s(i10 & Integer.MAX_VALUE);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f5563e = true;
        this.f5559a.close();
    }

    public final synchronized void e(int i10, b bVar, byte[] bArr) {
        try {
            if (this.f5563e) {
                throw new IOException("closed");
            }
            if (bVar.f5437a == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
            }
            b(0, bArr.length + 8, 7, 0);
            this.f5559a.s(i10);
            this.f5559a.s(bVar.f5437a);
            if (!(bArr.length == 0)) {
                this.f5559a.F(bArr);
            }
            this.f5559a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void f(int i10, b bVar) {
        d7.a.m(bVar, "errorCode");
        if (this.f5563e) {
            throw new IOException("closed");
        }
        if (bVar.f5437a == -1) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        b(i10, 4, 3, 0);
        this.f5559a.s(bVar.f5437a);
        this.f5559a.flush();
    }

    public final synchronized void flush() {
        if (this.f5563e) {
            throw new IOException("closed");
        }
        this.f5559a.flush();
    }

    public final void g(int i10, long j10) {
        while (j10 > 0) {
            long jMin = Math.min(this.f5562d, j10);
            j10 -= jMin;
            b(i10, (int) jMin, 9, j10 == 0 ? 4 : 0);
            this.f5559a.b0(this.f5561c, jMin);
        }
    }

    public final synchronized void r(int i10, int i11, ja.g gVar, boolean z10) {
        if (this.f5563e) {
            throw new IOException("closed");
        }
        b(i10, i11, 0, z10 ? 1 : 0);
        if (i11 > 0) {
            d7.a.j(gVar);
            this.f5559a.b0(gVar, i11);
        }
    }
}
