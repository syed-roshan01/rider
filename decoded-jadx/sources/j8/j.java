package j8;

import ja.z;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class j implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ja.h f8488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f8489b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ja.g f8490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f8491d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8492e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f8493f;

    public j(z zVar) {
        this.f8488a = zVar;
        ja.g gVar = new ja.g();
        this.f8490c = gVar;
        this.f8491d = new e(gVar);
        this.f8492e = 16384;
    }

    @Override // j8.b
    public final synchronized void D(a4.k kVar) {
        if (this.f8493f) {
            throw new IOException("closed");
        }
        int i10 = this.f8492e;
        if ((kVar.f1139a & 32) != 0) {
            i10 = kVar.f1142d[5];
        }
        this.f8492e = i10;
        a(0, 0, (byte) 4, (byte) 1);
        this.f8488a.flush();
    }

    @Override // j8.b
    public final synchronized void E() {
        try {
            if (this.f8493f) {
                throw new IOException("closed");
            }
            if (this.f8489b) {
                Logger logger = k.f8494a;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(String.format(">> CONNECTION %s", k.f8495b.e()));
                }
                this.f8488a.F(k.f8495b.s());
                this.f8488a.flush();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // j8.b
    public final synchronized void G(boolean z10, int i10, List list) {
        if (this.f8493f) {
            throw new IOException("closed");
        }
        b(i10, list, z10);
    }

    @Override // j8.b
    public final synchronized void N(int i10, long j10) {
        if (this.f8493f) {
            throw new IOException("closed");
        }
        if (j10 == 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(String.format(Locale.US, "windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j10)));
        }
        a(i10, 4, (byte) 8, (byte) 0);
        this.f8488a.s((int) j10);
        this.f8488a.flush();
    }

    @Override // j8.b
    public final int R() {
        return this.f8492e;
    }

    @Override // j8.b
    public final synchronized void X(int i10, boolean z10, int i11) {
        if (this.f8493f) {
            throw new IOException("closed");
        }
        a(0, 8, (byte) 6, z10 ? (byte) 1 : (byte) 0);
        this.f8488a.s(i10);
        this.f8488a.s(i11);
        this.f8488a.flush();
    }

    public final void a(int i10, int i11, byte b10, byte b11) {
        Logger logger = k.f8494a;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(h.a(false, i10, i11, b10, b11));
        }
        int i12 = this.f8492e;
        if (i11 > i12) {
            throw new IllegalArgumentException(String.format(Locale.US, "FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i12), Integer.valueOf(i11)));
        }
        if ((Integer.MIN_VALUE & i10) != 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "reserved bit set: %s", Integer.valueOf(i10)));
        }
        ja.h hVar = this.f8488a;
        hVar.C((i11 >>> 16) & 255);
        hVar.C((i11 >>> 8) & 255);
        hVar.C(i11 & 255);
        hVar.C(b10 & 255);
        hVar.C(b11 & 255);
        hVar.s(i10 & Integer.MAX_VALUE);
    }

    public final void b(int i10, List list, boolean z10) throws IOException {
        if (this.f8493f) {
            throw new IOException("closed");
        }
        this.f8491d.f(list);
        ja.g gVar = this.f8490c;
        long j10 = gVar.f8534b;
        int iMin = (int) Math.min(this.f8492e, j10);
        long j11 = iMin;
        byte b10 = j10 == j11 ? (byte) 4 : (byte) 0;
        if (z10) {
            b10 = (byte) (b10 | 1);
        }
        a(i10, iMin, (byte) 1, b10);
        ja.h hVar = this.f8488a;
        hVar.b0(gVar, j11);
        if (j10 > j11) {
            long j12 = j10 - j11;
            while (j12 > 0) {
                int iMin2 = (int) Math.min(this.f8492e, j12);
                long j13 = iMin2;
                j12 -= j13;
                a(i10, iMin2, (byte) 9, j12 == 0 ? (byte) 4 : (byte) 0);
                hVar.b0(gVar, j13);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f8493f = true;
        this.f8488a.close();
    }

    @Override // j8.b
    public final synchronized void d(a aVar, byte[] bArr) {
        try {
            if (this.f8493f) {
                throw new IOException("closed");
            }
            if (aVar.f8445a == -1) {
                throw new IllegalArgumentException(String.format(Locale.US, "errorCode.httpCode == -1", new Object[0]));
            }
            a(0, bArr.length + 8, (byte) 7, (byte) 0);
            this.f8488a.s(0);
            this.f8488a.s(aVar.f8445a);
            if (bArr.length > 0) {
                this.f8488a.F(bArr);
            }
            this.f8488a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // j8.b
    public final synchronized void flush() {
        if (this.f8493f) {
            throw new IOException("closed");
        }
        this.f8488a.flush();
    }

    @Override // j8.b
    public final synchronized void o(int i10, a aVar) {
        if (this.f8493f) {
            throw new IOException("closed");
        }
        if (aVar.f8445a == -1) {
            throw new IllegalArgumentException();
        }
        a(i10, 4, (byte) 3, (byte) 0);
        this.f8488a.s(aVar.f8445a);
        this.f8488a.flush();
    }

    @Override // j8.b
    public final synchronized void r(int i10, int i11, ja.g gVar, boolean z10) {
        if (this.f8493f) {
            throw new IOException("closed");
        }
        a(i10, i11, (byte) 0, z10 ? (byte) 1 : (byte) 0);
        if (i11 > 0) {
            this.f8488a.b0(gVar, i11);
        }
    }

    @Override // j8.b
    public final synchronized void v(a4.k kVar) {
        int i10;
        try {
            if (this.f8493f) {
                throw new IOException("closed");
            }
            int i11 = 0;
            a(0, Integer.bitCount(kVar.f1139a) * 6, (byte) 4, (byte) 0);
            while (i11 < 10) {
                if (kVar.a(i11)) {
                    if (i11 == 4) {
                        i10 = 3;
                    } else {
                        i10 = i11 == 7 ? 4 : i11;
                    }
                    this.f8488a.m(i10);
                    this.f8488a.s(kVar.f1142d[i11]);
                }
                i11++;
            }
            this.f8488a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }
}
