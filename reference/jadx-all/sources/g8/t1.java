package g8;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import java.util.zip.ZipException;

/* JADX INFO: loaded from: classes.dex */
public final class t1 implements Closeable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7130e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f7131f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Inflater f7132n;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f7135q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f7136r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f7137s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0 f7126a = new n0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CRC32 f7127b = new CRC32();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f7128c = new u(this);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f7129d = new byte[512];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f7133o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f7134p = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f7138t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f7139u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f7140v = true;

    public final int a(byte[] bArr, int i10, int i11) throws ZipException, DataFormatException {
        boolean zB;
        u uVar;
        int i12;
        boolean z10 = true;
        y3.e.N("GzipInflatingBuffer is closed", !this.f7134p);
        int i13 = 0;
        while (true) {
            zB = true;
            while (true) {
                uVar = this.f7128c;
                if (zB && (i12 = i11 - i13) > 0) {
                    int iE = t.k.e(this.f7133o);
                    CRC32 crc32 = this.f7127b;
                    byte[] bArr2 = this.f7129d;
                    switch (iE) {
                        case 0:
                            if (uVar.g() >= 10) {
                                if (uVar.f() != 35615) {
                                    throw new ZipException("Not in GZIP format");
                                }
                                if (uVar.e() != 8) {
                                    throw new ZipException("Unsupported compression method");
                                }
                                this.f7135q = uVar.e();
                                u.a(uVar, 6);
                                this.f7133o = 2;
                            }
                            zB = false;
                            break;
                        case 1:
                            if ((this.f7135q & 4) == 4) {
                                if (uVar.g() >= 2) {
                                    this.f7136r = uVar.f();
                                    this.f7133o = 3;
                                }
                                zB = false;
                            } else {
                                this.f7133o = 4;
                            }
                            break;
                        case 2:
                            int iG = uVar.g();
                            int i14 = this.f7136r;
                            if (iG >= i14) {
                                u.a(uVar, i14);
                                this.f7133o = 4;
                            }
                            zB = false;
                            break;
                        case 3:
                            if ((this.f7135q & 8) == 8) {
                                while (uVar.g() > 0) {
                                    if (uVar.e() == 0) {
                                        this.f7133o = 5;
                                    }
                                    break;
                                }
                                zB = false;
                            } else {
                                this.f7133o = 5;
                            }
                            break;
                        case 4:
                            if ((this.f7135q & 16) == 16) {
                                while (uVar.g() > 0) {
                                    if (uVar.e() == 0) {
                                        this.f7133o = 6;
                                    }
                                    break;
                                }
                                zB = false;
                            } else {
                                this.f7133o = 6;
                            }
                            break;
                        case 5:
                            if ((this.f7135q & 2) == 2) {
                                if (uVar.g() >= 2) {
                                    if ((((int) crc32.getValue()) & 65535) != uVar.f()) {
                                        throw new ZipException("Corrupt GZIP header");
                                    }
                                    this.f7133o = 7;
                                }
                                zB = false;
                            } else {
                                this.f7133o = 7;
                            }
                            break;
                        case 6:
                            Inflater inflater = this.f7132n;
                            if (inflater == null) {
                                this.f7132n = new Inflater(true);
                            } else {
                                inflater.reset();
                            }
                            crc32.reset();
                            int i15 = this.f7131f;
                            int i16 = this.f7130e;
                            int i17 = i15 - i16;
                            if (i17 <= 0) {
                                this.f7133o = 9;
                                break;
                            }
                            this.f7132n.setInput(bArr2, i16, i17);
                            this.f7133o = 8;
                            break;
                        case 7:
                            int i18 = i10 + i13;
                            y3.e.N("inflater is null", this.f7132n != null);
                            try {
                                int totalIn = this.f7132n.getTotalIn();
                                int iInflate = this.f7132n.inflate(bArr, i18, i12);
                                int totalIn2 = this.f7132n.getTotalIn() - totalIn;
                                this.f7138t += totalIn2;
                                this.f7139u += totalIn2;
                                this.f7130e += totalIn2;
                                crc32.update(bArr, i18, iInflate);
                                if (this.f7132n.finished()) {
                                    this.f7137s = this.f7132n.getBytesWritten() & 4294967295L;
                                    this.f7133o = 10;
                                } else if (this.f7132n.needsInput()) {
                                    this.f7133o = 9;
                                }
                                i13 += iInflate;
                                if (this.f7133o != 10) {
                                }
                                zB = b();
                            } catch (DataFormatException e4) {
                                throw new DataFormatException("Inflater data format exception: " + e4.getMessage());
                            }
                            break;
                        case 8:
                            y3.e.N("inflater is null", this.f7132n != null);
                            y3.e.N("inflaterInput has unconsumed bytes", this.f7130e == this.f7131f);
                            n0 n0Var = this.f7126a;
                            int iMin = Math.min(n0Var.f6977c, 512);
                            if (iMin != 0) {
                                this.f7130e = 0;
                                this.f7131f = iMin;
                                n0Var.Z(bArr2, 0, iMin);
                                this.f7132n.setInput(bArr2, this.f7130e, iMin);
                                this.f7133o = 8;
                            }
                            zB = false;
                            break;
                        case 9:
                            zB = b();
                            break;
                        default:
                            throw new AssertionError("Invalid state: ".concat(a7.a.C(this.f7133o)));
                    }
                }
            }
        }
        if (zB && (this.f7133o != 1 || uVar.g() >= 10)) {
            z10 = false;
        }
        this.f7140v = z10;
        return i13;
    }

    public final boolean b() throws ZipException {
        Inflater inflater = this.f7132n;
        u uVar = this.f7128c;
        if (inflater != null && uVar.g() <= 18) {
            this.f7132n.end();
            this.f7132n = null;
        }
        if (uVar.g() < 8) {
            return false;
        }
        CRC32 crc32 = this.f7127b;
        if (crc32.getValue() != (((long) uVar.f()) | (((long) uVar.f()) << 16)) || this.f7137s != (((long) uVar.f()) | (((long) uVar.f()) << 16))) {
            throw new ZipException("Corrupt GZIP trailer");
        }
        crc32.reset();
        this.f7133o = 1;
        return true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f7134p) {
            return;
        }
        this.f7134p = true;
        this.f7126a.close();
        Inflater inflater = this.f7132n;
        if (inflater != null) {
            inflater.end();
            this.f7132n = null;
        }
    }
}
