package ja;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class a0 implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f8501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f8502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f8503c;

    public a0(g0 g0Var) {
        d7.a.m(g0Var, "source");
        this.f8501a = g0Var;
        this.f8502b = new g();
    }

    @Override // ja.i
    public final g A() {
        return this.f8502b;
    }

    @Override // ja.i
    public final boolean B() {
        if (!(!this.f8503c)) {
            throw new IllegalStateException("closed".toString());
        }
        g gVar = this.f8502b;
        return gVar.B() && this.f8501a.I(gVar, 8192L) == -1;
    }

    @Override // ja.g0
    public final long I(g gVar, long j10) {
        d7.a.m(gVar, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(a7.a.l("byteCount < 0: ", j10).toString());
        }
        if (!(!this.f8503c)) {
            throw new IllegalStateException("closed".toString());
        }
        g gVar2 = this.f8502b;
        if (gVar2.f8534b == 0 && this.f8501a.I(gVar2, 8192L) == -1) {
            return -1L;
        }
        return gVar2.I(gVar, Math.min(j10, gVar2.f8534b));
    }

    @Override // ja.i
    public final long J() {
        S(8L);
        return this.f8502b.J();
    }

    @Override // ja.i
    public final String K(long j10) throws EOFException {
        if (j10 < 0) {
            throw new IllegalArgumentException(a7.a.l("limit < 0: ", j10).toString());
        }
        long j11 = j10 == Long.MAX_VALUE ? Long.MAX_VALUE : j10 + 1;
        long jA = a((byte) 10, 0L, j11);
        g gVar = this.f8502b;
        if (jA != -1) {
            return ka.a.a(gVar, jA);
        }
        if (j11 < Long.MAX_VALUE && n(j11) && gVar.f(j11 - 1) == 13 && n(1 + j11) && gVar.f(j11) == 10) {
            return ka.a.a(gVar, j11);
        }
        g gVar2 = new g();
        gVar.e(0L, Math.min(32, gVar.f8534b), gVar2);
        throw new EOFException("\\n not found: limit=" + Math.min(gVar.f8534b, j10) + " content=" + gVar2.i(gVar2.f8534b).e() + '\u2026');
    }

    @Override // ja.i
    public final void S(long j10) {
        if (!n(j10)) {
            throw new EOFException();
        }
    }

    @Override // ja.i
    public final long Y() {
        g gVar;
        S(1L);
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            boolean zN = n(i11);
            gVar = this.f8502b;
            if (!zN) {
                break;
            }
            byte bF = gVar.f(i10);
            if ((bF < 48 || bF > 57) && ((bF < 97 || bF > 102) && (bF < 65 || bF > 70))) {
                if (i10 != 0) {
                    break;
                }
                d7.a.n(16);
                d7.a.n(16);
                String string = Integer.toString(bF, 16);
                d7.a.l(string, "toString(this, checkRadix(radix))");
                throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(string));
            }
            i10 = i11;
        }
        return gVar.Y();
    }

    public final long a(byte b10, long j10, long j11) {
        if (!(!this.f8503c)) {
            throw new IllegalStateException("closed".toString());
        }
        long jMax = 0;
        if (0 > j11) {
            throw new IllegalArgumentException(a7.a.l("fromIndex=0 toIndex=", j11).toString());
        }
        while (jMax < j11) {
            long jG = this.f8502b.g(b10, jMax, j11);
            if (jG != -1) {
                return jG;
            }
            g gVar = this.f8502b;
            long j12 = gVar.f8534b;
            if (j12 >= j11 || this.f8501a.I(gVar, 8192L) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, j12);
        }
        return -1L;
    }

    public final short b() {
        S(2L);
        return this.f8502b.O();
    }

    @Override // ja.g0
    public final i0 c() {
        return this.f8501a.c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        if (this.f8503c) {
            return;
        }
        this.f8503c = true;
        this.f8501a.close();
        this.f8502b.a();
    }

    public final String e(long j10) {
        S(j10);
        g gVar = this.f8502b;
        gVar.getClass();
        return gVar.P(j10, l9.a.f11393a);
    }

    @Override // ja.i
    public final j i(long j10) {
        S(j10);
        return this.f8502b.i(j10);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f8503c;
    }

    @Override // ja.i
    public final void l(long j10) {
        if (!(!this.f8503c)) {
            throw new IllegalStateException("closed".toString());
        }
        while (j10 > 0) {
            g gVar = this.f8502b;
            if (gVar.f8534b == 0 && this.f8501a.I(gVar, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j10, gVar.f8534b);
            gVar.l(jMin);
            j10 -= jMin;
        }
    }

    @Override // ja.i
    public final boolean n(long j10) {
        g gVar;
        if (j10 < 0) {
            throw new IllegalArgumentException(a7.a.l("byteCount < 0: ", j10).toString());
        }
        if (!(!this.f8503c)) {
            throw new IllegalStateException("closed".toString());
        }
        do {
            gVar = this.f8502b;
            if (gVar.f8534b >= j10) {
                return true;
            }
        } while (this.f8501a.I(gVar, 8192L) != -1);
        return false;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        d7.a.m(byteBuffer, "sink");
        g gVar = this.f8502b;
        if (gVar.f8534b == 0 && this.f8501a.I(gVar, 8192L) == -1) {
            return -1;
        }
        return gVar.read(byteBuffer);
    }

    @Override // ja.i
    public final byte readByte() {
        S(1L);
        return this.f8502b.readByte();
    }

    @Override // ja.i
    public final int readInt() {
        S(4L);
        return this.f8502b.readInt();
    }

    @Override // ja.i
    public final short readShort() {
        S(2L);
        return this.f8502b.readShort();
    }

    public final String toString() {
        return "buffer(" + this.f8501a + ')';
    }

    @Override // ja.i
    public final String w() {
        return K(Long.MAX_VALUE);
    }

    @Override // ja.i
    public final long x(z zVar) {
        g gVar;
        long j10 = 0;
        while (true) {
            g0 g0Var = this.f8501a;
            gVar = this.f8502b;
            if (g0Var.I(gVar, 8192L) == -1) {
                break;
            }
            long jB = gVar.b();
            if (jB > 0) {
                j10 += jB;
                zVar.b0(gVar, jB);
            }
        }
        long j11 = gVar.f8534b;
        if (j11 <= 0) {
            return j10;
        }
        long j12 = j10 + j11;
        zVar.b0(gVar, j11);
        return j12;
    }

    @Override // ja.i
    public final int y() {
        S(4L);
        return this.f8502b.y();
    }
}
