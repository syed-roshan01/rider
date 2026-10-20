package ja;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class g implements i, h, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b0 f8533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f8534b;

    @Override // ja.i
    public final g A() {
        return this;
    }

    @Override // ja.i
    public final boolean B() {
        return this.f8534b == 0;
    }

    @Override // ja.h
    public final /* bridge */ /* synthetic */ h C(int i10) {
        h0(i10);
        return this;
    }

    @Override // ja.h
    public final h F(byte[] bArr) {
        d7.a.m(bArr, "source");
        f0(bArr, 0, bArr.length);
        return this;
    }

    @Override // ja.g0
    public final long I(g gVar, long j10) {
        d7.a.m(gVar, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(a7.a.l("byteCount < 0: ", j10).toString());
        }
        long j11 = this.f8534b;
        if (j11 == 0) {
            return -1L;
        }
        if (j10 > j11) {
            j10 = j11;
        }
        gVar.b0(this, j10);
        return j10;
    }

    @Override // ja.i
    public final long J() throws EOFException {
        long j10;
        if (this.f8534b < 8) {
            throw new EOFException();
        }
        b0 b0Var = this.f8533a;
        d7.a.j(b0Var);
        int i10 = b0Var.f8508b;
        int i11 = b0Var.f8509c;
        if (i11 - i10 < 8) {
            j10 = ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
        } else {
            byte[] bArr = b0Var.f8507a;
            int i12 = i10 + 7;
            long j11 = ((((long) bArr[i10]) & 255) << 56) | ((((long) bArr[i10 + 1]) & 255) << 48) | ((((long) bArr[i10 + 2]) & 255) << 40) | ((((long) bArr[i10 + 3]) & 255) << 32) | ((((long) bArr[i10 + 4]) & 255) << 24) | ((((long) bArr[i10 + 5]) & 255) << 16) | ((((long) bArr[i10 + 6]) & 255) << 8);
            int i13 = i10 + 8;
            long j12 = j11 | (((long) bArr[i12]) & 255);
            this.f8534b -= 8;
            if (i13 == i11) {
                this.f8533a = b0Var.a();
                c0.a(b0Var);
            } else {
                b0Var.f8508b = i13;
            }
            j10 = j12;
        }
        return ((j10 & 255) << 56) | (((-72057594037927936L) & j10) >>> 56) | ((71776119061217280L & j10) >>> 40) | ((280375465082880L & j10) >>> 24) | ((1095216660480L & j10) >>> 8) | ((4278190080L & j10) << 8) | ((16711680 & j10) << 24) | ((65280 & j10) << 40);
    }

    @Override // ja.i
    public final String K(long j10) throws EOFException {
        if (j10 < 0) {
            throw new IllegalArgumentException(a7.a.l("limit < 0: ", j10).toString());
        }
        long j11 = j10 != Long.MAX_VALUE ? j10 + 1 : Long.MAX_VALUE;
        long jG = g((byte) 10, 0L, j11);
        if (jG != -1) {
            return ka.a.a(this, jG);
        }
        if (j11 < this.f8534b && f(j11 - 1) == 13 && f(j11) == 10) {
            return ka.a.a(this, j11);
        }
        g gVar = new g();
        e(0L, Math.min(32, this.f8534b), gVar);
        throw new EOFException("\\n not found: limit=" + Math.min(this.f8534b, j10) + " content=" + gVar.i(gVar.f8534b).e() + '\u2026');
    }

    public final byte[] M(long j10) throws EOFException {
        if (j10 < 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(a7.a.l("byteCount: ", j10).toString());
        }
        if (this.f8534b < j10) {
            throw new EOFException();
        }
        int i10 = (int) j10;
        byte[] bArr = new byte[i10];
        int i11 = 0;
        while (i11 < i10) {
            int iU = u(bArr, i11, i10 - i11);
            if (iU == -1) {
                throw new EOFException();
            }
            i11 += iU;
        }
        return bArr;
    }

    public final short O() throws EOFException {
        short s9 = readShort();
        return (short) (((s9 & 255) << 8) | ((65280 & s9) >>> 8));
    }

    public final String P(long j10, Charset charset) throws EOFException {
        d7.a.m(charset, "charset");
        if (j10 < 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(a7.a.l("byteCount: ", j10).toString());
        }
        if (this.f8534b < j10) {
            throw new EOFException();
        }
        if (j10 == 0) {
            return "";
        }
        b0 b0Var = this.f8533a;
        d7.a.j(b0Var);
        int i10 = b0Var.f8508b;
        if (((long) i10) + j10 > b0Var.f8509c) {
            return new String(M(j10), charset);
        }
        int i11 = (int) j10;
        String str = new String(b0Var.f8507a, i10, i11, charset);
        int i12 = b0Var.f8508b + i11;
        b0Var.f8508b = i12;
        this.f8534b -= j10;
        if (i12 == b0Var.f8509c) {
            this.f8533a = b0Var.a();
            c0.a(b0Var);
        }
        return str;
    }

    public final String Q() {
        return P(this.f8534b, l9.a.f11393a);
    }

    @Override // ja.i
    public final void S(long j10) throws EOFException {
        if (this.f8534b < j10) {
            throw new EOFException();
        }
    }

    public final j T() {
        long j10 = this.f8534b;
        if (j10 <= 2147483647L) {
            return c0((int) j10);
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f8534b).toString());
    }

    @Override // ja.h
    public final /* bridge */ /* synthetic */ h V(String str) {
        n0(str);
        return this;
    }

    @Override // ja.h
    public final /* bridge */ /* synthetic */ h W(long j10) {
        i0(j10);
        return this;
    }

    @Override // ja.i
    public final long Y() throws EOFException {
        int i10;
        if (this.f8534b == 0) {
            throw new EOFException();
        }
        int i11 = 0;
        boolean z10 = false;
        long j10 = 0;
        do {
            b0 b0Var = this.f8533a;
            d7.a.j(b0Var);
            int i12 = b0Var.f8508b;
            int i13 = b0Var.f8509c;
            while (i12 < i13) {
                byte b10 = b0Var.f8507a[i12];
                if (b10 >= 48 && b10 <= 57) {
                    i10 = b10 - 48;
                } else if (b10 >= 97 && b10 <= 102) {
                    i10 = b10 - 87;
                } else {
                    if (b10 < 65 || b10 > 70) {
                        z10 = true;
                        if (i11 != 0) {
                            break;
                        }
                        char[] cArr = ka.b.f10654a;
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(new String(new char[]{cArr[(b10 >> 4) & 15], cArr[b10 & 15]})));
                    }
                    i10 = b10 - 55;
                }
                if (((-1152921504606846976L) & j10) != 0) {
                    g gVar = new g();
                    gVar.j0(j10);
                    gVar.h0(b10);
                    throw new NumberFormatException("Number too large: ".concat(gVar.Q()));
                }
                j10 = (j10 << 4) | ((long) i10);
                i12++;
                i11++;
            }
            if (i12 == i13) {
                this.f8533a = b0Var.a();
                c0.a(b0Var);
            } else {
                b0Var.f8508b = i12;
            }
            if (z10) {
                break;
            }
        } while (this.f8533a != null);
        this.f8534b -= (long) i11;
        return j10;
    }

    public final void a() {
        l(this.f8534b);
    }

    public final long b() {
        long j10 = this.f8534b;
        if (j10 == 0) {
            return 0L;
        }
        b0 b0Var = this.f8533a;
        d7.a.j(b0Var);
        b0 b0Var2 = b0Var.f8513g;
        d7.a.j(b0Var2);
        int i10 = b0Var2.f8509c;
        if (i10 < 8192 && b0Var2.f8511e) {
            j10 -= (long) (i10 - b0Var2.f8508b);
        }
        return j10;
    }

    @Override // ja.e0
    public final void b0(g gVar, long j10) {
        b0 b0VarB;
        d7.a.m(gVar, "source");
        if (gVar == this) {
            throw new IllegalArgumentException("source == this".toString());
        }
        o7.d0.m(gVar.f8534b, 0L, j10);
        while (j10 > 0) {
            b0 b0Var = gVar.f8533a;
            d7.a.j(b0Var);
            int i10 = b0Var.f8509c;
            b0 b0Var2 = gVar.f8533a;
            d7.a.j(b0Var2);
            long j11 = i10 - b0Var2.f8508b;
            int i11 = 0;
            if (j10 < j11) {
                b0 b0Var3 = this.f8533a;
                b0 b0Var4 = b0Var3 != null ? b0Var3.f8513g : null;
                if (b0Var4 != null && b0Var4.f8511e) {
                    if ((((long) b0Var4.f8509c) + j10) - ((long) (b0Var4.f8510d ? 0 : b0Var4.f8508b)) <= 8192) {
                        b0 b0Var5 = gVar.f8533a;
                        d7.a.j(b0Var5);
                        b0Var5.d(b0Var4, (int) j10);
                        gVar.f8534b -= j10;
                        this.f8534b += j10;
                        return;
                    }
                }
                b0 b0Var6 = gVar.f8533a;
                d7.a.j(b0Var6);
                int i12 = (int) j10;
                if (i12 <= 0 || i12 > b0Var6.f8509c - b0Var6.f8508b) {
                    throw new IllegalArgumentException("byteCount out of range".toString());
                }
                if (i12 >= 1024) {
                    b0VarB = b0Var6.c();
                } else {
                    b0VarB = c0.b();
                    int i13 = b0Var6.f8508b;
                    b9.b.I(b0Var6.f8507a, 0, b0VarB.f8507a, i13, i13 + i12);
                }
                b0VarB.f8509c = b0VarB.f8508b + i12;
                b0Var6.f8508b += i12;
                b0 b0Var7 = b0Var6.f8513g;
                d7.a.j(b0Var7);
                b0Var7.b(b0VarB);
                gVar.f8533a = b0VarB;
            }
            b0 b0Var8 = gVar.f8533a;
            d7.a.j(b0Var8);
            long j12 = b0Var8.f8509c - b0Var8.f8508b;
            gVar.f8533a = b0Var8.a();
            b0 b0Var9 = this.f8533a;
            if (b0Var9 == null) {
                this.f8533a = b0Var8;
                b0Var8.f8513g = b0Var8;
                b0Var8.f8512f = b0Var8;
            } else {
                b0 b0Var10 = b0Var9.f8513g;
                d7.a.j(b0Var10);
                b0Var10.b(b0Var8);
                b0 b0Var11 = b0Var8.f8513g;
                if (b0Var11 == b0Var8) {
                    throw new IllegalStateException("cannot compact".toString());
                }
                d7.a.j(b0Var11);
                if (b0Var11.f8511e) {
                    int i14 = b0Var8.f8509c - b0Var8.f8508b;
                    b0 b0Var12 = b0Var8.f8513g;
                    d7.a.j(b0Var12);
                    int i15 = 8192 - b0Var12.f8509c;
                    b0 b0Var13 = b0Var8.f8513g;
                    d7.a.j(b0Var13);
                    if (!b0Var13.f8510d) {
                        b0 b0Var14 = b0Var8.f8513g;
                        d7.a.j(b0Var14);
                        i11 = b0Var14.f8508b;
                    }
                    if (i14 <= i15 + i11) {
                        b0 b0Var15 = b0Var8.f8513g;
                        d7.a.j(b0Var15);
                        b0Var8.d(b0Var15, i14);
                        b0Var8.a();
                        c0.a(b0Var8);
                    }
                }
            }
            gVar.f8534b -= j12;
            this.f8534b += j12;
            j10 -= j12;
        }
    }

    @Override // ja.g0
    public final i0 c() {
        return i0.f8535d;
    }

    public final j c0(int i10) {
        if (i10 == 0) {
            return j.f8539d;
        }
        o7.d0.m(this.f8534b, 0L, i10);
        b0 b0Var = this.f8533a;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            d7.a.j(b0Var);
            int i14 = b0Var.f8509c;
            int i15 = b0Var.f8508b;
            if (i14 == i15) {
                throw new AssertionError("s.limit == s.pos");
            }
            i12 += i14 - i15;
            i13++;
            b0Var = b0Var.f8512f;
        }
        byte[][] bArr = new byte[i13][];
        int[] iArr = new int[i13 * 2];
        b0 b0Var2 = this.f8533a;
        int i16 = 0;
        while (i11 < i10) {
            d7.a.j(b0Var2);
            bArr[i16] = b0Var2.f8507a;
            i11 += b0Var2.f8509c - b0Var2.f8508b;
            iArr[i16] = Math.min(i11, i10);
            iArr[i16 + i13] = b0Var2.f8508b;
            b0Var2.f8510d = true;
            i16++;
            b0Var2 = b0Var2.f8512f;
        }
        return new d0(bArr, iArr);
    }

    public final Object clone() {
        g gVar = new g();
        if (this.f8534b != 0) {
            b0 b0Var = this.f8533a;
            d7.a.j(b0Var);
            b0 b0VarC = b0Var.c();
            gVar.f8533a = b0VarC;
            b0VarC.f8513g = b0VarC;
            b0VarC.f8512f = b0VarC;
            for (b0 b0Var2 = b0Var.f8512f; b0Var2 != b0Var; b0Var2 = b0Var2.f8512f) {
                b0 b0Var3 = b0VarC.f8513g;
                d7.a.j(b0Var3);
                d7.a.j(b0Var2);
                b0Var3.b(b0Var2.c());
            }
            gVar.f8534b = this.f8534b;
        }
        return gVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, ja.e0
    public final void close() {
    }

    public final b0 d0(int i10) {
        if (i10 < 1 || i10 > 8192) {
            throw new IllegalArgumentException("unexpected capacity".toString());
        }
        b0 b0Var = this.f8533a;
        if (b0Var == null) {
            b0 b0VarB = c0.b();
            this.f8533a = b0VarB;
            b0VarB.f8513g = b0VarB;
            b0VarB.f8512f = b0VarB;
            return b0VarB;
        }
        b0 b0Var2 = b0Var.f8513g;
        d7.a.j(b0Var2);
        if (b0Var2.f8509c + i10 <= 8192 && b0Var2.f8511e) {
            return b0Var2;
        }
        b0 b0VarB2 = c0.b();
        b0Var2.b(b0VarB2);
        return b0VarB2;
    }

    public final void e(long j10, long j11, g gVar) {
        d7.a.m(gVar, "out");
        o7.d0.m(this.f8534b, j10, j11);
        if (j11 == 0) {
            return;
        }
        gVar.f8534b += j11;
        b0 b0Var = this.f8533a;
        while (true) {
            d7.a.j(b0Var);
            long j12 = b0Var.f8509c - b0Var.f8508b;
            if (j10 < j12) {
                break;
            }
            j10 -= j12;
            b0Var = b0Var.f8512f;
        }
        while (j11 > 0) {
            d7.a.j(b0Var);
            b0 b0VarC = b0Var.c();
            int i10 = b0VarC.f8508b + ((int) j10);
            b0VarC.f8508b = i10;
            b0VarC.f8509c = Math.min(i10 + ((int) j11), b0VarC.f8509c);
            b0 b0Var2 = gVar.f8533a;
            if (b0Var2 == null) {
                b0VarC.f8513g = b0VarC;
                b0VarC.f8512f = b0VarC;
                gVar.f8533a = b0VarC;
            } else {
                b0 b0Var3 = b0Var2.f8513g;
                d7.a.j(b0Var3);
                b0Var3.b(b0VarC);
            }
            j11 -= (long) (b0VarC.f8509c - b0VarC.f8508b);
            b0Var = b0Var.f8512f;
            j10 = 0;
        }
    }

    public final void e0(j jVar) {
        d7.a.m(jVar, "byteString");
        jVar.u(this, jVar.d());
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g) {
                long j10 = this.f8534b;
                g gVar = (g) obj;
                if (j10 == gVar.f8534b) {
                    if (j10 != 0) {
                        b0 b0Var = this.f8533a;
                        d7.a.j(b0Var);
                        b0 b0Var2 = gVar.f8533a;
                        d7.a.j(b0Var2);
                        int i10 = b0Var.f8508b;
                        int i11 = b0Var2.f8508b;
                        long j11 = 0;
                        while (j11 < this.f8534b) {
                            long jMin = Math.min(b0Var.f8509c - i10, b0Var2.f8509c - i11);
                            long j12 = 0;
                            while (j12 < jMin) {
                                int i12 = i10 + 1;
                                byte b10 = b0Var.f8507a[i10];
                                int i13 = i11 + 1;
                                if (b10 == b0Var2.f8507a[i11]) {
                                    j12++;
                                    i11 = i13;
                                    i10 = i12;
                                }
                            }
                            if (i10 == b0Var.f8509c) {
                                b0 b0Var3 = b0Var.f8512f;
                                d7.a.j(b0Var3);
                                i10 = b0Var3.f8508b;
                                b0Var = b0Var3;
                            }
                            if (i11 == b0Var2.f8509c) {
                                b0Var2 = b0Var2.f8512f;
                                d7.a.j(b0Var2);
                                i11 = b0Var2.f8508b;
                            }
                            j11 += jMin;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final byte f(long j10) {
        o7.d0.m(this.f8534b, j10, 1L);
        b0 b0Var = this.f8533a;
        if (b0Var == null) {
            d7.a.j(null);
            throw null;
        }
        long j11 = this.f8534b;
        if (j11 - j10 < j10) {
            while (j11 > j10) {
                b0Var = b0Var.f8513g;
                d7.a.j(b0Var);
                j11 -= (long) (b0Var.f8509c - b0Var.f8508b);
            }
            return b0Var.f8507a[(int) ((((long) b0Var.f8508b) + j10) - j11)];
        }
        long j12 = 0;
        while (true) {
            int i10 = b0Var.f8509c;
            int i11 = b0Var.f8508b;
            long j13 = ((long) (i10 - i11)) + j12;
            if (j13 > j10) {
                return b0Var.f8507a[(int) ((((long) i11) + j10) - j12)];
            }
            b0Var = b0Var.f8512f;
            d7.a.j(b0Var);
            j12 = j13;
        }
    }

    public final void f0(byte[] bArr, int i10, int i11) {
        d7.a.m(bArr, "source");
        long j10 = i11;
        o7.d0.m(bArr.length, i10, j10);
        int i12 = i11 + i10;
        while (i10 < i12) {
            b0 b0VarD0 = d0(1);
            int iMin = Math.min(i12 - i10, 8192 - b0VarD0.f8509c);
            int i13 = i10 + iMin;
            b9.b.I(bArr, b0VarD0.f8509c, b0VarD0.f8507a, i10, i13);
            b0VarD0.f8509c += iMin;
            i10 = i13;
        }
        this.f8534b += j10;
    }

    @Override // ja.h, ja.e0, java.io.Flushable
    public final void flush() {
    }

    public final long g(byte b10, long j10, long j11) {
        b0 b0Var;
        long j12 = 0;
        if (0 > j10 || j10 > j11) {
            throw new IllegalArgumentException(("size=" + this.f8534b + " fromIndex=" + j10 + " toIndex=" + j11).toString());
        }
        long j13 = this.f8534b;
        if (j11 > j13) {
            j11 = j13;
        }
        if (j10 == j11 || (b0Var = this.f8533a) == null) {
            return -1L;
        }
        if (j13 - j10 < j10) {
            while (j13 > j10) {
                b0Var = b0Var.f8513g;
                d7.a.j(b0Var);
                j13 -= (long) (b0Var.f8509c - b0Var.f8508b);
            }
            while (j13 < j11) {
                int iMin = (int) Math.min(b0Var.f8509c, (((long) b0Var.f8508b) + j11) - j13);
                for (int i10 = (int) ((((long) b0Var.f8508b) + j10) - j13); i10 < iMin; i10++) {
                    if (b0Var.f8507a[i10] == b10) {
                        return ((long) (i10 - b0Var.f8508b)) + j13;
                    }
                }
                j13 += (long) (b0Var.f8509c - b0Var.f8508b);
                b0Var = b0Var.f8512f;
                d7.a.j(b0Var);
                j10 = j13;
            }
            return -1L;
        }
        while (true) {
            long j14 = ((long) (b0Var.f8509c - b0Var.f8508b)) + j12;
            if (j14 > j10) {
                break;
            }
            b0Var = b0Var.f8512f;
            d7.a.j(b0Var);
            j12 = j14;
        }
        while (j12 < j11) {
            int iMin2 = (int) Math.min(b0Var.f8509c, (((long) b0Var.f8508b) + j11) - j12);
            for (int i11 = (int) ((((long) b0Var.f8508b) + j10) - j12); i11 < iMin2; i11++) {
                if (b0Var.f8507a[i11] == b10) {
                    return ((long) (i11 - b0Var.f8508b)) + j12;
                }
            }
            j12 += (long) (b0Var.f8509c - b0Var.f8508b);
            b0Var = b0Var.f8512f;
            d7.a.j(b0Var);
            j10 = j12;
        }
        return -1L;
    }

    public final void g0(g0 g0Var) {
        d7.a.m(g0Var, "source");
        while (g0Var.I(this, 8192L) != -1) {
        }
    }

    @Override // ja.h
    public final /* bridge */ /* synthetic */ h h(long j10) {
        j0(j10);
        return this;
    }

    public final void h0(int i10) {
        b0 b0VarD0 = d0(1);
        int i11 = b0VarD0.f8509c;
        b0VarD0.f8509c = i11 + 1;
        b0VarD0.f8507a[i11] = (byte) i10;
        this.f8534b++;
    }

    public final int hashCode() {
        b0 b0Var = this.f8533a;
        if (b0Var == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = b0Var.f8509c;
            for (int i12 = b0Var.f8508b; i12 < i11; i12++) {
                i10 = (i10 * 31) + b0Var.f8507a[i12];
            }
            b0Var = b0Var.f8512f;
            d7.a.j(b0Var);
        } while (b0Var != this.f8533a);
        return i10;
    }

    @Override // ja.i
    public final j i(long j10) throws EOFException {
        if (j10 < 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(a7.a.l("byteCount: ", j10).toString());
        }
        if (this.f8534b < j10) {
            throw new EOFException();
        }
        if (j10 < 4096) {
            return new j(M(j10));
        }
        j jVarC0 = c0((int) j10);
        l(j10);
        return jVarC0;
    }

    public final void i0(long j10) {
        boolean z10;
        byte[] bArr;
        if (j10 == 0) {
            h0(48);
            return;
        }
        int i10 = 1;
        if (j10 < 0) {
            j10 = -j10;
            if (j10 < 0) {
                n0("-9223372036854775808");
                return;
            }
            z10 = true;
        } else {
            z10 = false;
        }
        if (j10 < 100000000) {
            if (j10 < 10000) {
                if (j10 >= 100) {
                    i10 = j10 < 1000 ? 3 : 4;
                } else if (j10 >= 10) {
                    i10 = 2;
                }
            } else if (j10 < 1000000) {
                i10 = j10 < 100000 ? 5 : 6;
            } else {
                i10 = j10 < 10000000 ? 7 : 8;
            }
        } else if (j10 < 1000000000000L) {
            if (j10 < 10000000000L) {
                i10 = j10 < 1000000000 ? 9 : 10;
            } else {
                i10 = j10 < 100000000000L ? 11 : 12;
            }
        } else if (j10 < 1000000000000000L) {
            if (j10 < 10000000000000L) {
                i10 = 13;
            } else {
                i10 = j10 < 100000000000000L ? 14 : 15;
            }
        } else if (j10 < 100000000000000000L) {
            i10 = j10 < 10000000000000000L ? 16 : 17;
        } else {
            i10 = j10 < 1000000000000000000L ? 18 : 19;
        }
        if (z10) {
            i10++;
        }
        b0 b0VarD0 = d0(i10);
        int i11 = b0VarD0.f8509c + i10;
        while (true) {
            bArr = b0VarD0.f8507a;
            if (j10 == 0) {
                break;
            }
            long j11 = 10;
            i11--;
            bArr[i11] = ka.a.f10653a[(int) (j10 % j11)];
            j10 /= j11;
        }
        if (z10) {
            bArr[i11 - 1] = 45;
        }
        b0VarD0.f8509c += i10;
        this.f8534b += (long) i10;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final void j0(long j10) {
        if (j10 == 0) {
            h0(48);
            return;
        }
        long j11 = (j10 >>> 1) | j10;
        long j12 = j11 | (j11 >>> 2);
        long j13 = j12 | (j12 >>> 4);
        long j14 = j13 | (j13 >>> 8);
        long j15 = j14 | (j14 >>> 16);
        long j16 = j15 | (j15 >>> 32);
        long j17 = j16 - ((j16 >>> 1) & 6148914691236517205L);
        long j18 = ((j17 >>> 2) & 3689348814741910323L) + (j17 & 3689348814741910323L);
        long j19 = ((j18 >>> 4) + j18) & 1085102592571150095L;
        long j20 = j19 + (j19 >>> 8);
        long j21 = j20 + (j20 >>> 16);
        int i10 = (int) ((((j21 & 63) + ((j21 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        b0 b0VarD0 = d0(i10);
        int i11 = b0VarD0.f8509c;
        for (int i12 = (i11 + i10) - 1; i12 >= i11; i12--) {
            b0VarD0.f8507a[i12] = ka.a.f10653a[(int) (15 & j10)];
            j10 >>>= 4;
        }
        b0VarD0.f8509c += i10;
        this.f8534b += (long) i10;
    }

    public final void k0(int i10) {
        b0 b0VarD0 = d0(4);
        int i11 = b0VarD0.f8509c;
        byte[] bArr = b0VarD0.f8507a;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        bArr[i11 + 1] = (byte) ((i10 >>> 16) & 255);
        bArr[i11 + 2] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 3] = (byte) (i10 & 255);
        b0VarD0.f8509c = i11 + 4;
        this.f8534b += 4;
    }

    @Override // ja.i
    public final void l(long j10) {
        while (j10 > 0) {
            b0 b0Var = this.f8533a;
            if (b0Var == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j10, b0Var.f8509c - b0Var.f8508b);
            long j11 = iMin;
            this.f8534b -= j11;
            j10 -= j11;
            int i10 = b0Var.f8508b + iMin;
            b0Var.f8508b = i10;
            if (i10 == b0Var.f8509c) {
                this.f8533a = b0Var.a();
                c0.a(b0Var);
            }
        }
    }

    public final void l0(int i10) {
        b0 b0VarD0 = d0(2);
        int i11 = b0VarD0.f8509c;
        byte[] bArr = b0VarD0.f8507a;
        bArr[i11] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 1] = (byte) (i10 & 255);
        b0VarD0.f8509c = i11 + 2;
        this.f8534b += 2;
    }

    @Override // ja.h
    public final /* bridge */ /* synthetic */ h m(int i10) {
        l0(i10);
        return this;
    }

    public final void m0(int i10, int i11, String str) {
        char cCharAt;
        d7.a.m(str, "string");
        if (i10 < 0) {
            throw new IllegalArgumentException(l.q.g("beginIndex < 0: ", i10).toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(l.q.i("endIndex < beginIndex: ", i11, " < ", i10).toString());
        }
        if (i11 > str.length()) {
            StringBuilder sbQ = a7.a.q("endIndex > string.length: ", i11, " > ");
            sbQ.append(str.length());
            throw new IllegalArgumentException(sbQ.toString().toString());
        }
        while (i10 < i11) {
            char cCharAt2 = str.charAt(i10);
            if (cCharAt2 < '\u0080') {
                b0 b0VarD0 = d0(1);
                int i12 = b0VarD0.f8509c - i10;
                int iMin = Math.min(i11, 8192 - i12);
                int i13 = i10 + 1;
                byte[] bArr = b0VarD0.f8507a;
                bArr[i10 + i12] = (byte) cCharAt2;
                while (true) {
                    i10 = i13;
                    if (i10 >= iMin || (cCharAt = str.charAt(i10)) >= '\u0080') {
                        break;
                    }
                    i13 = i10 + 1;
                    bArr[i10 + i12] = (byte) cCharAt;
                }
                int i14 = b0VarD0.f8509c;
                int i15 = (i12 + i10) - i14;
                b0VarD0.f8509c = i14 + i15;
                this.f8534b += (long) i15;
            } else {
                if (cCharAt2 < '\u0800') {
                    b0 b0VarD1 = d0(2);
                    int i16 = b0VarD1.f8509c;
                    byte[] bArr2 = b0VarD1.f8507a;
                    bArr2[i16] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i16 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    b0VarD1.f8509c = i16 + 2;
                    this.f8534b += 2;
                } else if (cCharAt2 < '\ud800' || cCharAt2 > '\udfff') {
                    b0 b0VarD2 = d0(3);
                    int i17 = b0VarD2.f8509c;
                    byte[] bArr3 = b0VarD2.f8507a;
                    bArr3[i17] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i17 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i17 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    b0VarD2.f8509c = i17 + 3;
                    this.f8534b += 3;
                } else {
                    int i18 = i10 + 1;
                    char cCharAt3 = i18 < i11 ? str.charAt(i18) : (char) 0;
                    if (cCharAt2 > '\udbff' || '\udc00' > cCharAt3 || cCharAt3 >= '\ue000') {
                        h0(63);
                        i10 = i18;
                    } else {
                        int i19 = (((cCharAt2 & '\u03ff') << 10) | (cCharAt3 & '\u03ff')) + 65536;
                        b0 b0VarD3 = d0(4);
                        int i20 = b0VarD3.f8509c;
                        byte[] bArr4 = b0VarD3.f8507a;
                        bArr4[i20] = (byte) ((i19 >> 18) | 240);
                        bArr4[i20 + 1] = (byte) (((i19 >> 12) & 63) | 128);
                        bArr4[i20 + 2] = (byte) (((i19 >> 6) & 63) | 128);
                        bArr4[i20 + 3] = (byte) ((i19 & 63) | 128);
                        b0VarD3.f8509c = i20 + 4;
                        this.f8534b += 4;
                        i10 += 2;
                    }
                }
                i10++;
            }
        }
    }

    @Override // ja.i
    public final boolean n(long j10) {
        return this.f8534b >= j10;
    }

    public final void n0(String str) {
        d7.a.m(str, "string");
        m0(0, str.length(), str);
    }

    public final void o0(int i10) {
        String str;
        if (i10 < 128) {
            h0(i10);
            return;
        }
        if (i10 < 2048) {
            b0 b0VarD0 = d0(2);
            int i11 = b0VarD0.f8509c;
            byte[] bArr = b0VarD0.f8507a;
            bArr[i11] = (byte) ((i10 >> 6) | 192);
            bArr[i11 + 1] = (byte) ((i10 & 63) | 128);
            b0VarD0.f8509c = i11 + 2;
            this.f8534b += 2;
            return;
        }
        if (55296 <= i10 && i10 < 57344) {
            h0(63);
            return;
        }
        if (i10 < 65536) {
            b0 b0VarD1 = d0(3);
            int i12 = b0VarD1.f8509c;
            byte[] bArr2 = b0VarD1.f8507a;
            bArr2[i12] = (byte) ((i10 >> 12) | 224);
            bArr2[i12 + 1] = (byte) (((i10 >> 6) & 63) | 128);
            bArr2[i12 + 2] = (byte) ((i10 & 63) | 128);
            b0VarD1.f8509c = i12 + 3;
            this.f8534b += 3;
            return;
        }
        if (i10 <= 1114111) {
            b0 b0VarD2 = d0(4);
            int i13 = b0VarD2.f8509c;
            byte[] bArr3 = b0VarD2.f8507a;
            bArr3[i13] = (byte) ((i10 >> 18) | 240);
            bArr3[i13 + 1] = (byte) (((i10 >> 12) & 63) | 128);
            bArr3[i13 + 2] = (byte) (((i10 >> 6) & 63) | 128);
            bArr3[i13 + 3] = (byte) ((i10 & 63) | 128);
            b0VarD2.f8509c = i13 + 4;
            this.f8534b += 4;
            return;
        }
        StringBuilder sb = new StringBuilder("Unexpected code point: 0x");
        if (i10 != 0) {
            char[] cArr = ka.b.f10654a;
            int i14 = 0;
            char[] cArr2 = {cArr[(i10 >> 28) & 15], cArr[(i10 >> 24) & 15], cArr[(i10 >> 20) & 15], cArr[(i10 >> 16) & 15], cArr[(i10 >> 12) & 15], cArr[(i10 >> 8) & 15], cArr[(i10 >> 4) & 15], cArr[i10 & 15]};
            while (i14 < 8 && cArr2[i14] == '0') {
                i14++;
            }
            if (i14 < 0) {
                throw new IndexOutOfBoundsException(l.q.h("startIndex: ", i14, ", endIndex: 8, size: 8"));
            }
            if (i14 > 8) {
                throw new IllegalArgumentException(l.q.h("startIndex: ", i14, " > endIndex: 8"));
            }
            str = new String(cArr2, i14, 8 - i14);
        } else {
            str = "0";
        }
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    public final long p(j jVar) {
        int i10;
        int i11;
        d7.a.m(jVar, "targetBytes");
        b0 b0Var = this.f8533a;
        if (b0Var == null) {
            return -1L;
        }
        long j10 = this.f8534b;
        long j11 = 0;
        byte[] bArr = jVar.f8540a;
        if (j10 < 0) {
            while (j10 > 0) {
                b0Var = b0Var.f8513g;
                d7.a.j(b0Var);
                j10 -= (long) (b0Var.f8509c - b0Var.f8508b);
            }
            if (bArr.length == 2) {
                byte b10 = bArr[0];
                byte b11 = bArr[1];
                while (j10 < this.f8534b) {
                    i10 = (int) ((((long) b0Var.f8508b) + j11) - j10);
                    int i12 = b0Var.f8509c;
                    while (true) {
                        if (i10 >= i12) {
                            j11 = ((long) (b0Var.f8509c - b0Var.f8508b)) + j10;
                            b0Var = b0Var.f8512f;
                            d7.a.j(b0Var);
                            j10 = j11;
                        } else {
                            byte b12 = b0Var.f8507a[i10];
                            if (b12 == b10 || b12 == b11) {
                                i11 = b0Var.f8508b;
                            } else {
                                i10++;
                            }
                        }
                    }
                }
                return -1L;
            }
            while (j10 < this.f8534b) {
                i10 = (int) ((((long) b0Var.f8508b) + j11) - j10);
                int i13 = b0Var.f8509c;
                while (true) {
                    if (i10 < i13) {
                        byte b13 = b0Var.f8507a[i10];
                        int length = bArr.length;
                        int i14 = 0;
                        while (true) {
                            if (i14 >= length) {
                                i10++;
                            } else if (b13 == bArr[i14]) {
                                i11 = b0Var.f8508b;
                            } else {
                                i14++;
                            }
                        }
                    } else {
                        j11 = ((long) (b0Var.f8509c - b0Var.f8508b)) + j10;
                        b0Var = b0Var.f8512f;
                        d7.a.j(b0Var);
                        j10 = j11;
                    }
                }
            }
            return -1L;
        }
        j10 = 0;
        while (true) {
            long j12 = ((long) (b0Var.f8509c - b0Var.f8508b)) + j10;
            if (j12 > 0) {
                break;
            }
            b0Var = b0Var.f8512f;
            d7.a.j(b0Var);
            j10 = j12;
        }
        if (bArr.length == 2) {
            byte b14 = bArr[0];
            byte b15 = bArr[1];
            while (j10 < this.f8534b) {
                i10 = (int) ((((long) b0Var.f8508b) + j11) - j10);
                int i15 = b0Var.f8509c;
                while (true) {
                    if (i10 >= i15) {
                        j11 = ((long) (b0Var.f8509c - b0Var.f8508b)) + j10;
                        b0Var = b0Var.f8512f;
                        d7.a.j(b0Var);
                        j10 = j11;
                    } else {
                        byte b16 = b0Var.f8507a[i10];
                        if (b16 == b14 || b16 == b15) {
                            i11 = b0Var.f8508b;
                        } else {
                            i10++;
                        }
                    }
                }
            }
            return -1L;
        }
        while (j10 < this.f8534b) {
            i10 = (int) ((((long) b0Var.f8508b) + j11) - j10);
            int i16 = b0Var.f8509c;
            while (true) {
                if (i10 < i16) {
                    byte b17 = b0Var.f8507a[i10];
                    int length2 = bArr.length;
                    int i17 = 0;
                    while (true) {
                        if (i17 >= length2) {
                            i10++;
                        } else if (b17 == bArr[i17]) {
                            i11 = b0Var.f8508b;
                        } else {
                            i17++;
                        }
                    }
                } else {
                    j11 = ((long) (b0Var.f8509c - b0Var.f8508b)) + j10;
                    b0Var = b0Var.f8512f;
                    d7.a.j(b0Var);
                    j10 = j11;
                }
            }
        }
        return -1L;
        return ((long) (i10 - i11)) + j10;
    }

    public final boolean q(j jVar) {
        d7.a.m(jVar, "bytes");
        byte[] bArr = jVar.f8540a;
        int length = bArr.length;
        if (length < 0 || this.f8534b < length || bArr.length < length) {
            return false;
        }
        for (int i10 = 0; i10 < length; i10++) {
            if (f(i10) != bArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        d7.a.m(byteBuffer, "sink");
        b0 b0Var = this.f8533a;
        if (b0Var == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), b0Var.f8509c - b0Var.f8508b);
        byteBuffer.put(b0Var.f8507a, b0Var.f8508b, iMin);
        int i10 = b0Var.f8508b + iMin;
        b0Var.f8508b = i10;
        this.f8534b -= (long) iMin;
        if (i10 == b0Var.f8509c) {
            this.f8533a = b0Var.a();
            c0.a(b0Var);
        }
        return iMin;
    }

    @Override // ja.i
    public final byte readByte() {
        if (this.f8534b == 0) {
            throw new EOFException();
        }
        b0 b0Var = this.f8533a;
        d7.a.j(b0Var);
        int i10 = b0Var.f8508b;
        int i11 = b0Var.f8509c;
        int i12 = i10 + 1;
        byte b10 = b0Var.f8507a[i10];
        this.f8534b--;
        if (i12 == i11) {
            this.f8533a = b0Var.a();
            c0.a(b0Var);
        } else {
            b0Var.f8508b = i12;
        }
        return b10;
    }

    @Override // ja.i
    public final int readInt() throws EOFException {
        if (this.f8534b < 4) {
            throw new EOFException();
        }
        b0 b0Var = this.f8533a;
        d7.a.j(b0Var);
        int i10 = b0Var.f8508b;
        int i11 = b0Var.f8509c;
        if (i11 - i10 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = b0Var.f8507a;
        int i12 = i10 + 3;
        int i13 = ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 2] & 255) << 8);
        int i14 = i10 + 4;
        int i15 = i13 | (bArr[i12] & 255);
        this.f8534b -= 4;
        if (i14 == i11) {
            this.f8533a = b0Var.a();
            c0.a(b0Var);
        } else {
            b0Var.f8508b = i14;
        }
        return i15;
    }

    @Override // ja.i
    public final short readShort() throws EOFException {
        if (this.f8534b < 2) {
            throw new EOFException();
        }
        b0 b0Var = this.f8533a;
        d7.a.j(b0Var);
        int i10 = b0Var.f8508b;
        int i11 = b0Var.f8509c;
        if (i11 - i10 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        int i12 = i10 + 1;
        byte[] bArr = b0Var.f8507a;
        int i13 = (bArr[i10] & 255) << 8;
        int i14 = i10 + 2;
        int i15 = (bArr[i12] & 255) | i13;
        this.f8534b -= 2;
        if (i14 == i11) {
            this.f8533a = b0Var.a();
            c0.a(b0Var);
        } else {
            b0Var.f8508b = i14;
        }
        return (short) i15;
    }

    @Override // ja.h
    public final /* bridge */ /* synthetic */ h s(int i10) {
        k0(i10);
        return this;
    }

    public final String toString() {
        return T().toString();
    }

    public final int u(byte[] bArr, int i10, int i11) {
        d7.a.m(bArr, "sink");
        o7.d0.m(bArr.length, i10, i11);
        b0 b0Var = this.f8533a;
        if (b0Var == null) {
            return -1;
        }
        int iMin = Math.min(i11, b0Var.f8509c - b0Var.f8508b);
        int i12 = b0Var.f8508b;
        b9.b.I(b0Var.f8507a, i10, bArr, i12, i12 + iMin);
        int i13 = b0Var.f8508b + iMin;
        b0Var.f8508b = i13;
        this.f8534b -= (long) iMin;
        if (i13 == b0Var.f8509c) {
            this.f8533a = b0Var.a();
            c0.a(b0Var);
        }
        return iMin;
    }

    @Override // ja.i
    public final String w() {
        return K(Long.MAX_VALUE);
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        d7.a.m(byteBuffer, "source");
        int iRemaining = byteBuffer.remaining();
        int i10 = iRemaining;
        while (i10 > 0) {
            b0 b0VarD0 = d0(1);
            int iMin = Math.min(i10, 8192 - b0VarD0.f8509c);
            byteBuffer.get(b0VarD0.f8507a, b0VarD0.f8509c, iMin);
            i10 -= iMin;
            b0VarD0.f8509c += iMin;
        }
        this.f8534b += (long) iRemaining;
        return iRemaining;
    }

    @Override // ja.i
    public final long x(z zVar) {
        long j10 = this.f8534b;
        if (j10 > 0) {
            zVar.b0(this, j10);
        }
        return j10;
    }

    @Override // ja.i
    public final int y() throws EOFException {
        int i10 = readInt();
        return ((i10 & 255) << 24) | (((-16777216) & i10) >>> 24) | ((16711680 & i10) >>> 8) | ((65280 & i10) << 8);
    }

    @Override // ja.h
    public final /* bridge */ /* synthetic */ h z(j jVar) {
        e0(jVar);
        return this;
    }
}
