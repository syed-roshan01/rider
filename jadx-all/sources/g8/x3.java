package g8;

import com.google.firebase.messaging.Constants;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.zip.DataFormatException;

/* JADX INFO: loaded from: classes.dex */
public final class x3 implements Closeable, r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v3 f7218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y5 f7220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e6 f7221d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e8.s f7222e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public t1 f7223f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte[] f7224n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f7225o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f7226p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f7227q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f7228r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public n0 f7229s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public n0 f7230t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f7231u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f7232v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f7233w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f7234x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f7235y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public volatile boolean f7236z;

    public x3(v3 v3Var, int i10, y5 y5Var, e6 e6Var) {
        e8.r rVar = e8.r.f5354a;
        this.f7226p = 1;
        this.f7227q = 5;
        this.f7230t = new n0();
        this.f7232v = false;
        this.f7233w = -1;
        this.f7235y = false;
        this.f7236z = false;
        y3.e.J(v3Var, "sink");
        this.f7218a = v3Var;
        this.f7222e = rVar;
        this.f7219b = i10;
        this.f7220c = y5Var;
        y3.e.J(e6Var, "transportTracer");
        this.f7221d = e6Var;
    }

    public final void M() {
        int unsignedByte = this.f7229s.readUnsignedByte();
        if ((unsignedByte & 254) != 0) {
            throw new e8.e2(e8.c2.f5223l.g("gRPC frame header malformed: reserved bits not zero"));
        }
        this.f7228r = (unsignedByte & 1) != 0;
        n0 n0Var = this.f7229s;
        n0Var.a(4);
        int unsignedByte2 = n0Var.readUnsignedByte() | (n0Var.readUnsignedByte() << 24) | (n0Var.readUnsignedByte() << 16) | (n0Var.readUnsignedByte() << 8);
        this.f7227q = unsignedByte2;
        if (unsignedByte2 < 0 || unsignedByte2 > this.f7219b) {
            throw new e8.e2(e8.c2.f5222k.g(String.format(Locale.US, "gRPC message exceeds maximum size %d: %d", Integer.valueOf(this.f7219b), Integer.valueOf(this.f7227q))));
        }
        int i10 = this.f7233w + 1;
        this.f7233w = i10;
        for (o7.d0 d0Var : this.f7220c.f7292a) {
            d0Var.I(i10);
        }
        e6 e6Var = this.f7221d;
        e6Var.f6748b.a();
        ((k4) e6Var.f6747a).a();
        this.f7226p = 2;
    }

    public final boolean O() throws Throwable {
        int i10;
        y5 y5Var = this.f7220c;
        int i11 = 0;
        try {
            if (this.f7229s == null) {
                this.f7229s = new n0();
            }
            int i12 = 0;
            i10 = 0;
            while (true) {
                try {
                    int i13 = this.f7227q - this.f7229s.f6977c;
                    if (i13 <= 0) {
                        if (i12 <= 0) {
                            return true;
                        }
                        this.f7218a.d(i12);
                        if (this.f7226p != 2) {
                            return true;
                        }
                        if (this.f7223f != null) {
                            y5Var.a(i10);
                            this.f7234x += i10;
                            return true;
                        }
                        y5Var.a(i12);
                        this.f7234x += i12;
                        return true;
                    }
                    if (this.f7223f != null) {
                        try {
                            byte[] bArr = this.f7224n;
                            if (bArr == null || this.f7225o == bArr.length) {
                                this.f7224n = new byte[Math.min(i13, 2097152)];
                                this.f7225o = 0;
                            }
                            int iA = this.f7223f.a(this.f7224n, this.f7225o, Math.min(i13, this.f7224n.length - this.f7225o));
                            t1 t1Var = this.f7223f;
                            int i14 = t1Var.f7138t;
                            t1Var.f7138t = 0;
                            i12 += i14;
                            int i15 = t1Var.f7139u;
                            t1Var.f7139u = 0;
                            i10 += i15;
                            if (iA == 0) {
                                if (i12 > 0) {
                                    this.f7218a.d(i12);
                                    if (this.f7226p == 2) {
                                        if (this.f7223f != null) {
                                            y5Var.a(i10);
                                            this.f7234x += i10;
                                        } else {
                                            y5Var.a(i12);
                                            this.f7234x += i12;
                                        }
                                    }
                                }
                                return false;
                            }
                            n0 n0Var = this.f7229s;
                            byte[] bArr2 = this.f7224n;
                            int i16 = this.f7225o;
                            o4 o4Var = p4.f7038a;
                            n0Var.b(new o4(bArr2, i16, iA));
                            this.f7225o += iA;
                        } catch (IOException e4) {
                            throw new RuntimeException(e4);
                        } catch (DataFormatException e10) {
                            throw new RuntimeException(e10);
                        }
                    } else {
                        int i17 = this.f7230t.f6977c;
                        if (i17 == 0) {
                            if (i12 > 0) {
                                this.f7218a.d(i12);
                                if (this.f7226p == 2) {
                                    if (this.f7223f != null) {
                                        y5Var.a(i10);
                                        this.f7234x += i10;
                                    } else {
                                        y5Var.a(i12);
                                        this.f7234x += i12;
                                    }
                                }
                            }
                            return false;
                        }
                        int iMin = Math.min(i13, i17);
                        i12 += iMin;
                        this.f7229s.b(this.f7230t.t(iMin));
                    }
                } catch (Throwable th) {
                    int i18 = i12;
                    th = th;
                    i11 = i18;
                    if (i11 > 0) {
                        this.f7218a.d(i11);
                        if (this.f7226p == 2) {
                            if (this.f7223f != null) {
                                y5Var.a(i10);
                                this.f7234x += i10;
                            } else {
                                y5Var.a(i11);
                                this.f7234x += i11;
                            }
                        }
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            i10 = 0;
        }
    }

    @Override // g8.r0
    public final void a(int i10) {
        y3.e.G("numMessages must be > 0", i10 > 0);
        if (q()) {
            return;
        }
        this.f7231u += (long) i10;
        p();
    }

    @Override // g8.r0
    public final void b(int i10) {
        this.f7219b = i10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, g8.r0
    public final void close() {
        if (q()) {
            return;
        }
        n0 n0Var = this.f7229s;
        boolean z10 = true;
        boolean z11 = n0Var != null && n0Var.f6977c > 0;
        try {
            t1 t1Var = this.f7223f;
            if (t1Var != null) {
                if (!z11) {
                    y3.e.N("GzipInflatingBuffer is closed", !t1Var.f7134p);
                    if (t1Var.f7128c.g() == 0 && t1Var.f7133o == 1) {
                        z10 = false;
                    }
                }
                this.f7223f.close();
                z11 = z10;
            }
            n0 n0Var2 = this.f7230t;
            if (n0Var2 != null) {
                n0Var2.close();
            }
            n0 n0Var3 = this.f7229s;
            if (n0Var3 != null) {
                n0Var3.close();
            }
            this.f7223f = null;
            this.f7230t = null;
            this.f7229s = null;
            this.f7218a.c(z11);
        } catch (Throwable th) {
            this.f7223f = null;
            this.f7230t = null;
            this.f7229s = null;
            throw th;
        }
    }

    @Override // g8.r0
    public final void e(m4 m4Var) throws Throwable {
        y3.e.J(m4Var, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        boolean z10 = true;
        try {
            if (!q() && !this.f7235y) {
                t1 t1Var = this.f7223f;
                if (t1Var != null) {
                    y3.e.N("GzipInflatingBuffer is closed", !t1Var.f7134p);
                    t1Var.f7126a.b(m4Var);
                    t1Var.f7140v = false;
                } else {
                    this.f7230t.b(m4Var);
                }
                try {
                    p();
                    return;
                } catch (Throwable th) {
                    th = th;
                    z10 = false;
                    if (z10) {
                        m4Var.close();
                    }
                    throw th;
                }
            }
            m4Var.close();
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        if (r4.f7230t.f6977c == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
    
        close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
    
        r4.f7235y = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        if (r0.f7140v != false) goto L12;
     */
    @Override // g8.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f() {
        /*
            r4 = this;
            boolean r0 = r4.q()
            if (r0 == 0) goto L7
            return
        L7:
            g8.t1 r0 = r4.f7223f
            r1 = 1
            if (r0 == 0) goto L19
            boolean r2 = r0.f7134p
            r2 = r2 ^ r1
            java.lang.String r3 = "GzipInflatingBuffer is closed"
            y3.e.N(r3, r2)
            boolean r0 = r0.f7140v
            if (r0 == 0) goto L23
            goto L1f
        L19:
            g8.n0 r0 = r4.f7230t
            int r0 = r0.f6977c
            if (r0 != 0) goto L23
        L1f:
            r4.close()
            goto L25
        L23:
            r4.f7235y = r1
        L25:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g8.x3.f():void");
    }

    @Override // g8.r0
    public final void g(e8.s sVar) {
        y3.e.N("Already set full stream decompressor", this.f7223f == null);
        this.f7222e = sVar;
    }

    public final void p() {
        if (this.f7232v) {
            return;
        }
        this.f7232v = true;
        while (!this.f7236z && this.f7231u > 0 && O()) {
            try {
                int iE = t.k.e(this.f7226p);
                if (iE == 0) {
                    M();
                } else {
                    if (iE != 1) {
                        throw new AssertionError("Invalid state: " + a7.a.D(this.f7226p));
                    }
                    u();
                    this.f7231u--;
                }
            } catch (Throwable th) {
                this.f7232v = false;
                throw th;
            }
        }
        if (this.f7236z) {
            close();
            this.f7232v = false;
            return;
        }
        if (this.f7235y) {
            t1 t1Var = this.f7223f;
            if (t1Var != null) {
                y3.e.N("GzipInflatingBuffer is closed", true ^ t1Var.f7134p);
                if (t1Var.f7140v) {
                    close();
                }
            } else if (this.f7230t.f6977c == 0) {
                close();
            }
        }
        this.f7232v = false;
    }

    public final boolean q() {
        return this.f7230t == null && this.f7223f == null;
    }

    public final void u() {
        InputStream w3Var;
        int i10 = this.f7233w;
        long j10 = this.f7234x;
        y5 y5Var = this.f7220c;
        for (o7.d0 d0Var : y5Var.f7292a) {
            d0Var.J(j10, i10);
        }
        this.f7234x = 0;
        if (this.f7228r) {
            e8.s sVar = this.f7222e;
            if (sVar == e8.r.f5354a) {
                throw new e8.e2(e8.c2.f5223l.g("Can't decode compressed gRPC message as compression not configured"));
            }
            try {
                n0 n0Var = this.f7229s;
                o4 o4Var = p4.f7038a;
                n4 n4Var = new n4();
                y3.e.J(n0Var, "buffer");
                n4Var.f7008a = n0Var;
                w3Var = new w3(sVar.b(n4Var), this.f7219b, y5Var);
            } catch (IOException e4) {
                throw new RuntimeException(e4);
            }
        } else {
            long j11 = this.f7229s.f6977c;
            for (o7.d0 d0Var2 : y5Var.f7292a) {
                d0Var2.K(j11);
            }
            n0 n0Var2 = this.f7229s;
            o4 o4Var2 = p4.f7038a;
            n4 n4Var2 = new n4();
            y3.e.J(n0Var2, "buffer");
            n4Var2.f7008a = n0Var2;
            w3Var = n4Var2;
        }
        this.f7229s = null;
        this.f7218a.a(new u(w3Var));
        this.f7226p = 1;
        this.f7227q = 5;
    }
}
