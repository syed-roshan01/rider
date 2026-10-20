package ja;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes.dex */
public final class q implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f8562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f8563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Inflater f8564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f8565d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CRC32 f8566e;

    public q(g0 g0Var) {
        d7.a.m(g0Var, "source");
        a0 a0Var = new a0(g0Var);
        this.f8563b = a0Var;
        Inflater inflater = new Inflater(true);
        this.f8564c = inflater;
        this.f8565d = new r(a0Var, inflater);
        this.f8566e = new CRC32();
    }

    public static void a(int i10, int i11, String str) throws IOException {
        if (i11 == i10) {
            return;
        }
        String str2 = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i11), Integer.valueOf(i10)}, 3));
        d7.a.l(str2, "format(this, *args)");
        throw new IOException(str2);
    }

    @Override // ja.g0
    public final long I(g gVar, long j10) throws IOException {
        a0 a0Var;
        long j11;
        d7.a.m(gVar, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(a7.a.l("byteCount < 0: ", j10).toString());
        }
        if (j10 == 0) {
            return 0L;
        }
        byte b10 = this.f8562a;
        CRC32 crc32 = this.f8566e;
        a0 a0Var2 = this.f8563b;
        if (b10 == 0) {
            a0Var2.S(10L);
            g gVar2 = a0Var2.f8502b;
            byte bF = gVar2.f(3L);
            boolean z10 = ((bF >> 1) & 1) == 1;
            if (z10) {
                b(0L, 10L, a0Var2.f8502b);
            }
            a(8075, a0Var2.readShort(), "ID1ID2");
            a0Var2.l(8L);
            if (((bF >> 2) & 1) == 1) {
                a0Var2.S(2L);
                if (z10) {
                    b(0L, 2L, a0Var2.f8502b);
                }
                long jO = gVar2.O() & 65535;
                a0Var2.S(jO);
                if (z10) {
                    b(0L, jO, a0Var2.f8502b);
                    j11 = jO;
                } else {
                    j11 = jO;
                }
                a0Var2.l(j11);
            }
            if (((bF >> 3) & 1) == 1) {
                a0Var = a0Var2;
                long jA = a0Var2.a((byte) 0, 0L, Long.MAX_VALUE);
                if (jA == -1) {
                    throw new EOFException();
                }
                if (z10) {
                    b(0L, jA + 1, a0Var.f8502b);
                }
                a0Var.l(jA + 1);
            } else {
                a0Var = a0Var2;
            }
            if (((bF >> 4) & 1) == 1) {
                long jA2 = a0Var.a((byte) 0, 0L, Long.MAX_VALUE);
                if (jA2 == -1) {
                    throw new EOFException();
                }
                if (z10) {
                    b(0L, jA2 + 1, a0Var.f8502b);
                }
                a0Var.l(jA2 + 1);
            }
            if (z10) {
                a(a0Var.b(), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            this.f8562a = (byte) 1;
        } else {
            a0Var = a0Var2;
        }
        if (this.f8562a == 1) {
            long j12 = gVar.f8534b;
            long jI = this.f8565d.I(gVar, j10);
            if (jI != -1) {
                b(j12, jI, gVar);
                return jI;
            }
            this.f8562a = (byte) 2;
        }
        if (this.f8562a != 2) {
            return -1L;
        }
        a(a0Var.y(), (int) crc32.getValue(), "CRC");
        a(a0Var.y(), (int) this.f8564c.getBytesWritten(), "ISIZE");
        this.f8562a = (byte) 3;
        if (a0Var.B()) {
            return -1L;
        }
        throw new IOException("gzip finished without exhausting source");
    }

    public final void b(long j10, long j11, g gVar) {
        b0 b0Var = gVar.f8533a;
        d7.a.j(b0Var);
        while (true) {
            int i10 = b0Var.f8509c;
            int i11 = b0Var.f8508b;
            if (j10 < i10 - i11) {
                break;
            }
            j10 -= (long) (i10 - i11);
            b0Var = b0Var.f8512f;
            d7.a.j(b0Var);
        }
        while (j11 > 0) {
            int i12 = (int) (((long) b0Var.f8508b) + j10);
            int iMin = (int) Math.min(b0Var.f8509c - i12, j11);
            this.f8566e.update(b0Var.f8507a, i12, iMin);
            j11 -= (long) iMin;
            b0Var = b0Var.f8512f;
            d7.a.j(b0Var);
            j10 = 0;
        }
    }

    @Override // ja.g0
    public final i0 c() {
        return this.f8563b.f8501a.c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f8565d.close();
    }
}
