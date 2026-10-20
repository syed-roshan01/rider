package v7;

import com.google.firebase.remoteconfig.internal.Code;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Arrays;
import o7.i2;
import r7.e;
import u.k1;

/* JADX INFO: loaded from: classes.dex */
public class a implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Reader f15937a;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f15945p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f15946q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f15947r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int[] f15948s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String[] f15950u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int[] f15951v;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15938b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final char[] f15939c = new char[1024];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15940d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15941e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15942f = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f15943n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f15944o = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f15949t = 1;

    static {
        e.f13597b = new e(6);
    }

    public a(StringReader stringReader) {
        int[] iArr = new int[32];
        this.f15948s = iArr;
        iArr[0] = 6;
        this.f15950u = new String[32];
        this.f15951v = new int[32];
        this.f15937a = stringReader;
    }

    public final boolean M() throws IOException {
        int iF = this.f15944o;
        if (iF == 0) {
            iF = f();
        }
        return (iF == 2 || iF == 4 || iF == 17) ? false : true;
    }

    public final boolean O(char c10) throws c {
        if (c10 == '\t' || c10 == '\n' || c10 == '\f' || c10 == '\r' || c10 == ' ') {
            return false;
        }
        if (c10 != '#') {
            if (c10 == ',') {
                return false;
            }
            if (c10 != '/' && c10 != '=') {
                if (c10 == '{' || c10 == '}' || c10 == ':') {
                    return false;
                }
                if (c10 != ';') {
                    switch (c10) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        e();
        return false;
    }

    public final String P() {
        return " at line " + (this.f15942f + 1) + " column " + ((this.f15940d - this.f15943n) + 1) + " path " + u(false);
    }

    public final boolean Q() throws IOException {
        int iF = this.f15944o;
        if (iF == 0) {
            iF = f();
        }
        if (iF == 5) {
            this.f15944o = 0;
            int[] iArr = this.f15951v;
            int i10 = this.f15949t - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        }
        if (iF != 6) {
            throw new IllegalStateException("Expected a boolean but was " + k1.e(k0()) + P());
        }
        this.f15944o = 0;
        int[] iArr2 = this.f15951v;
        int i11 = this.f15949t - 1;
        iArr2[i11] = iArr2[i11] + 1;
        return false;
    }

    public final double T() throws IOException {
        int iF = this.f15944o;
        if (iF == 0) {
            iF = f();
        }
        if (iF == 15) {
            this.f15944o = 0;
            int[] iArr = this.f15951v;
            int i10 = this.f15949t - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f15945p;
        }
        if (iF == 16) {
            this.f15947r = new String(this.f15939c, this.f15940d, this.f15946q);
            this.f15940d += this.f15946q;
        } else if (iF == 8 || iF == 9) {
            this.f15947r = h0(iF == 8 ? '\'' : '\"');
        } else if (iF == 10) {
            this.f15947r = j0();
        } else if (iF != 11) {
            throw new IllegalStateException("Expected a double but was " + k1.e(k0()) + P());
        }
        this.f15944o = 11;
        double d10 = Double.parseDouble(this.f15947r);
        if (!this.f15938b && (Double.isNaN(d10) || Double.isInfinite(d10))) {
            throw new c("JSON forbids NaN and infinities: " + d10 + P());
        }
        this.f15947r = null;
        this.f15944o = 0;
        int[] iArr2 = this.f15951v;
        int i11 = this.f15949t - 1;
        iArr2[i11] = iArr2[i11] + 1;
        return d10;
    }

    public final void a() {
        int iF = this.f15944o;
        if (iF == 0) {
            iF = f();
        }
        if (iF == 3) {
            l0(1);
            this.f15951v[this.f15949t - 1] = 0;
            this.f15944o = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + k1.e(k0()) + P());
        }
    }

    public final void b() throws IOException {
        int iF = this.f15944o;
        if (iF == 0) {
            iF = f();
        }
        if (iF == 1) {
            l0(3);
            this.f15944o = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + k1.e(k0()) + P());
        }
    }

    public final int c0() throws IOException {
        int iF = this.f15944o;
        if (iF == 0) {
            iF = f();
        }
        if (iF == 15) {
            long j10 = this.f15945p;
            int i10 = (int) j10;
            if (j10 != i10) {
                throw new NumberFormatException("Expected an int but was " + this.f15945p + P());
            }
            this.f15944o = 0;
            int[] iArr = this.f15951v;
            int i11 = this.f15949t - 1;
            iArr[i11] = iArr[i11] + 1;
            return i10;
        }
        if (iF == 16) {
            this.f15947r = new String(this.f15939c, this.f15940d, this.f15946q);
            this.f15940d += this.f15946q;
        } else {
            if (iF != 8 && iF != 9 && iF != 10) {
                throw new IllegalStateException("Expected an int but was " + k1.e(k0()) + P());
            }
            if (iF == 10) {
                this.f15947r = j0();
            } else {
                this.f15947r = h0(iF == 8 ? '\'' : '\"');
            }
            try {
                int i12 = Integer.parseInt(this.f15947r);
                this.f15944o = 0;
                int[] iArr2 = this.f15951v;
                int i13 = this.f15949t - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return i12;
            } catch (NumberFormatException unused) {
            }
        }
        this.f15944o = 11;
        double d10 = Double.parseDouble(this.f15947r);
        int i14 = (int) d10;
        if (i14 != d10) {
            throw new NumberFormatException("Expected an int but was " + this.f15947r + P());
        }
        this.f15947r = null;
        this.f15944o = 0;
        int[] iArr3 = this.f15951v;
        int i15 = this.f15949t - 1;
        iArr3[i15] = iArr3[i15] + 1;
        return i14;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f15944o = 0;
        this.f15948s[0] = 8;
        this.f15949t = 1;
        this.f15937a.close();
    }

    public final long d0() throws IOException {
        int iF = this.f15944o;
        if (iF == 0) {
            iF = f();
        }
        if (iF == 15) {
            this.f15944o = 0;
            int[] iArr = this.f15951v;
            int i10 = this.f15949t - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f15945p;
        }
        if (iF == 16) {
            this.f15947r = new String(this.f15939c, this.f15940d, this.f15946q);
            this.f15940d += this.f15946q;
        } else {
            if (iF != 8 && iF != 9 && iF != 10) {
                throw new IllegalStateException("Expected a long but was " + k1.e(k0()) + P());
            }
            if (iF == 10) {
                this.f15947r = j0();
            } else {
                this.f15947r = h0(iF == 8 ? '\'' : '\"');
            }
            try {
                long j10 = Long.parseLong(this.f15947r);
                this.f15944o = 0;
                int[] iArr2 = this.f15951v;
                int i11 = this.f15949t - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return j10;
            } catch (NumberFormatException unused) {
            }
        }
        this.f15944o = 11;
        double d10 = Double.parseDouble(this.f15947r);
        long j11 = (long) d10;
        if (j11 != d10) {
            throw new NumberFormatException("Expected a long but was " + this.f15947r + P());
        }
        this.f15947r = null;
        this.f15944o = 0;
        int[] iArr3 = this.f15951v;
        int i12 = this.f15949t - 1;
        iArr3[i12] = iArr3[i12] + 1;
        return j11;
    }

    public final void e() throws c {
        if (this.f15938b) {
            return;
        }
        r0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    public final String e0() throws IOException {
        String strH0;
        int iF = this.f15944o;
        if (iF == 0) {
            iF = f();
        }
        if (iF == 14) {
            strH0 = j0();
        } else if (iF == 12) {
            strH0 = h0('\'');
        } else {
            if (iF != 13) {
                throw new IllegalStateException("Expected a name but was " + k1.e(k0()) + P());
            }
            strH0 = h0('\"');
        }
        this.f15944o = 0;
        this.f15950u[this.f15949t - 1] = strH0;
        return strH0;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x017b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:116:0x017c  */
    /* JADX WARN: Code duplicated, block: B:119:0x018c  */
    /* JADX WARN: Code duplicated, block: B:122:0x0192  */
    /* JADX WARN: Code duplicated, block: B:125:0x019d  */
    /* JADX WARN: Code duplicated, block: B:126:0x01a3 A[PHI: r2 r4
  0x01a3: PHI (r2v49 int) = (r2v48 int), (r2v51 int) binds: [B:118:0x018a, B:125:0x019d] A[DONT_GENERATE, DONT_INLINE]
  0x01a3: PHI (r4v10 int) = (r4v9 int), (r4v12 int) binds: [B:118:0x018a, B:125:0x019d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:128:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:130:0x01af  */
    /* JADX WARN: Code duplicated, block: B:170:0x021a  */
    /* JADX WARN: Code duplicated, block: B:171:0x021c  */
    /* JADX WARN: Code duplicated, block: B:183:0x023d A[DONT_INVERT, PHI: r1
  0x023d: PHI (r1v65 int) = (r1v64 int), (r1v68 int) binds: [B:169:0x0218, B:175:0x0225] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:184:0x023f  */
    /* JADX WARN: Code duplicated, block: B:197:0x0262  */
    /* JADX WARN: Code duplicated, block: B:199:0x0268  */
    /* JADX WARN: Code duplicated, block: B:202:0x026d  */
    /* JADX WARN: Code duplicated, block: B:207:0x027d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:208:0x027e  */
    /* JADX WARN: Code duplicated, block: B:210:0x0288  */
    /* JADX WARN: Code duplicated, block: B:212:0x0290  */
    /* JADX WARN: Code duplicated, block: B:222:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:231:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:233:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:275:0x018f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:276:0x018f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:277:0x019a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00e6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x00e8  */
    public final int f() throws IOException {
        int iF0;
        int i10;
        int iF1;
        int i11;
        String str;
        String str2;
        int i12;
        char c10;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z10;
        char c11;
        int i17;
        int i18;
        int i19;
        int i20;
        int[] iArr = this.f15948s;
        int i21 = 1;
        int i22 = this.f15949t - 1;
        int i23 = iArr[i22];
        char[] cArr = this.f15939c;
        if (i23 == 1) {
            iArr[i22] = 2;
        } else if (i23 == 2) {
            int iF2 = f0(true);
            if (iF2 != 44) {
                if (iF2 != 59) {
                    if (iF2 == 93) {
                        this.f15944o = 4;
                        return 4;
                    }
                    r0("Unterminated array");
                    throw null;
                }
                e();
            }
        } else {
            if (i23 == 3 || i23 == 5) {
                iArr[i22] = 4;
                if (i23 == 5 && (iF0 = f0(true)) != 44) {
                    if (iF0 != 59) {
                        if (iF0 == 125) {
                            this.f15944o = 2;
                            return 2;
                        }
                        r0("Unterminated object");
                        throw null;
                    }
                    e();
                }
                int iF3 = f0(true);
                if (iF3 == 34) {
                    this.f15944o = 13;
                    return 13;
                }
                if (iF3 == 39) {
                    e();
                    this.f15944o = 12;
                    return 12;
                }
                if (iF3 == 125) {
                    if (i23 != 5) {
                        this.f15944o = 2;
                        return 2;
                    }
                    r0("Expected name");
                    throw null;
                }
                e();
                this.f15940d--;
                if (O((char) iF3)) {
                    this.f15944o = 14;
                    return 14;
                }
                r0("Expected name");
                throw null;
            }
            if (i23 != 4) {
                if (i23 == 6) {
                    if (this.f15938b) {
                        f0(true);
                        int i24 = this.f15940d;
                        this.f15940d = i24 - 1;
                        if (i24 + 4 <= this.f15941e || q(5)) {
                            int i25 = this.f15940d;
                            if (cArr[i25] == ')' && cArr[i25 + 1] == ']' && cArr[i25 + 2] == '}' && cArr[i25 + 3] == '\'' && cArr[i25 + 4] == '\n') {
                                this.f15940d = i25 + 5;
                            }
                        }
                    }
                    this.f15948s[this.f15949t - 1] = 7;
                } else if (i23 == 7) {
                    i10 = 0;
                    if (f0(false) == -1) {
                        this.f15944o = 17;
                        return 17;
                    }
                    e();
                    this.f15940d--;
                } else {
                    i10 = 0;
                    if (i23 == 8) {
                        throw new IllegalStateException("JsonReader is closed");
                    }
                }
                iF1 = f0(true);
                if (iF1 != 34) {
                    this.f15944o = 9;
                    return 9;
                }
                if (iF1 != 39) {
                    e();
                    this.f15944o = 8;
                    return 8;
                }
                if (iF1 != 44 || iF1 == 59) {
                    i11 = 1;
                } else {
                    if (iF1 == 91) {
                        this.f15944o = 3;
                        return 3;
                    }
                    if (iF1 != 93) {
                        if (iF1 == 123) {
                            this.f15944o = 1;
                            return 1;
                        }
                        int i26 = this.f15940d - 1;
                        this.f15940d = i26;
                        char c12 = cArr[i26];
                        if (c12 == 't' || c12 == 'T') {
                            str = "true";
                            str2 = "TRUE";
                            i12 = 5;
                        } else {
                            if (c12 != 'f' && c12 != 'F') {
                                if (c12 != 'n' && c12 != 'N') {
                                    i12 = i10;
                                    break;
                                }
                                str = "null";
                                str2 = "NULL";
                                i12 = 7;
                                if (i12 != 0) {
                                    return i12;
                                }
                                i13 = this.f15940d;
                                i14 = this.f15941e;
                                i15 = i10;
                                i16 = i15;
                                int i27 = i16;
                                z10 = true;
                                long j10 = 0;
                                while (true) {
                                    if (i13 + i16 != i14) {
                                        c11 = cArr[i13 + i16];
                                        if (c11 != '+') {
                                            if (c11 != 'E' || c11 == 'e') {
                                                i17 = i14;
                                                i18 = 6;
                                                if (i15 != 2 || i15 == 4) {
                                                    i15 = 5;
                                                    i16++;
                                                    i14 = i17;
                                                    i21 = 1;
                                                }
                                            } else if (c11 == '-') {
                                                i17 = i14;
                                                i18 = 6;
                                                if (i15 == 0) {
                                                    i15 = 1;
                                                    i27 = 1;
                                                } else {
                                                    if (i15 != 5) {
                                                    }
                                                    i15 = i18;
                                                }
                                                i16++;
                                                i14 = i17;
                                                i21 = 1;
                                            } else if (c11 == '.') {
                                                i17 = i14;
                                                i18 = 6;
                                                if (i15 == 2) {
                                                    i15 = 3;
                                                    i16++;
                                                    i14 = i17;
                                                    i21 = 1;
                                                }
                                            } else if (c11 >= '0' && c11 <= '9') {
                                                if (i15 == i21 || i15 == 0) {
                                                    i17 = i14;
                                                    i18 = 6;
                                                    j10 = -(c11 - '0');
                                                    i15 = 2;
                                                } else if (i15 != 2) {
                                                    i17 = i14;
                                                    if (i15 == 3) {
                                                        i18 = 6;
                                                        i15 = 4;
                                                    } else {
                                                        i18 = 6;
                                                        if (i15 == 5 || i15 == 6) {
                                                            i15 = 7;
                                                        }
                                                    }
                                                } else if (j10 != 0) {
                                                    i17 = i14;
                                                    long j11 = (10 * j10) - ((long) (c11 - '0'));
                                                    z10 &= j10 > -922337203685477580L || (j10 == -922337203685477580L && j11 < j10);
                                                    j10 = j11;
                                                    i18 = 6;
                                                }
                                                i16++;
                                                i14 = i17;
                                                i21 = 1;
                                            } else if (!O(c11)) {
                                                i20 = 2;
                                                if (i15 != 2) {
                                                    if (i15 != i20 || i15 == 4 || i15 == 7) {
                                                        this.f15946q = i16;
                                                        i19 = 16;
                                                        this.f15944o = 16;
                                                    }
                                                } else if (z10 || ((j10 == Long.MIN_VALUE && i27 == 0) || (j10 == 0 && i27 != 0))) {
                                                    i20 = 2;
                                                    if (i15 != i20) {
                                                    }
                                                    this.f15946q = i16;
                                                    i19 = 16;
                                                    this.f15944o = 16;
                                                } else {
                                                    if (i27 == 0) {
                                                        j10 = -j10;
                                                    }
                                                    this.f15945p = j10;
                                                    this.f15940d += i16;
                                                    i19 = 15;
                                                    this.f15944o = 15;
                                                }
                                            }
                                            if (i19 != 0) {
                                                return i19;
                                            }
                                            if (O(cArr[this.f15940d])) {
                                                r0("Expected value");
                                                throw null;
                                            }
                                            e();
                                            this.f15944o = 10;
                                            return 10;
                                        }
                                        i17 = i14;
                                        i18 = 6;
                                        if (i15 != 5) {
                                        }
                                        i15 = i18;
                                        i16++;
                                        i14 = i17;
                                        i21 = 1;
                                    } else if (i16 != cArr.length) {
                                        if (!q(i16 + 1)) {
                                            int i28 = this.f15940d;
                                            i14 = this.f15941e;
                                            i13 = i28;
                                            c11 = cArr[i13 + i16];
                                            if (c11 != '+') {
                                                if (c11 != 'E') {
                                                    i17 = i14;
                                                    i18 = 6;
                                                    if (i15 != 2) {
                                                    }
                                                    i15 = 5;
                                                    i16++;
                                                    i14 = i17;
                                                    i21 = 1;
                                                } else {
                                                    i17 = i14;
                                                    i18 = 6;
                                                    if (i15 != 2) {
                                                    }
                                                    i15 = 5;
                                                    i16++;
                                                    i14 = i17;
                                                    i21 = 1;
                                                }
                                                if (i19 != 0) {
                                                    return i19;
                                                }
                                                if (O(cArr[this.f15940d])) {
                                                    r0("Expected value");
                                                    throw null;
                                                }
                                                e();
                                                this.f15944o = 10;
                                                return 10;
                                            }
                                            i17 = i14;
                                            i18 = 6;
                                            if (i15 != 5) {
                                            }
                                            i15 = i18;
                                            i16++;
                                            i14 = i17;
                                            i21 = 1;
                                        }
                                        i20 = 2;
                                        if (i15 != 2) {
                                            if (i15 != i20) {
                                            }
                                            this.f15946q = i16;
                                            i19 = 16;
                                            this.f15944o = 16;
                                        } else {
                                            if (z10) {
                                            }
                                            i20 = 2;
                                            if (i15 != i20) {
                                            }
                                            this.f15946q = i16;
                                            i19 = 16;
                                            this.f15944o = 16;
                                        }
                                        if (i19 != 0) {
                                            return i19;
                                        }
                                        if (O(cArr[this.f15940d])) {
                                            r0("Expected value");
                                            throw null;
                                        }
                                        e();
                                        this.f15944o = 10;
                                        return 10;
                                    }
                                    i19 = 0;
                                    if (i19 != 0) {
                                        return i19;
                                    }
                                    if (O(cArr[this.f15940d])) {
                                        r0("Expected value");
                                        throw null;
                                    }
                                    e();
                                    this.f15944o = 10;
                                    return 10;
                                }
                            }
                            str = "false";
                            str2 = "FALSE";
                            i12 = 6;
                        }
                        int length = str.length();
                        int i29 = 1;
                        while (true) {
                            if (i29 >= length) {
                                if ((this.f15940d + length >= this.f15941e && !q(length + 1)) || !O(cArr[this.f15940d + length])) {
                                    this.f15940d += length;
                                    this.f15944o = i12;
                                    break;
                                }
                                break;
                            }
                            if ((this.f15940d + i29 < this.f15941e || q(i29 + 1)) && ((c10 = cArr[this.f15940d + i29]) == str.charAt(i29) || c10 == str2.charAt(i29))) {
                                i29++;
                            }
                            i12 = i10;
                            break;
                        }
                        if (i12 != 0) {
                            return i12;
                        }
                        i13 = this.f15940d;
                        i14 = this.f15941e;
                        i15 = i10;
                        i16 = i15;
                        int i210 = i16;
                        z10 = true;
                        long j12 = 0;
                        while (true) {
                            if (i13 + i16 != i14) {
                                c11 = cArr[i13 + i16];
                                if (c11 != '+') {
                                    if (c11 != 'E') {
                                        i17 = i14;
                                        i18 = 6;
                                        if (i15 != 2) {
                                        }
                                        i15 = 5;
                                        i16++;
                                        i14 = i17;
                                        i21 = 1;
                                    } else {
                                        i17 = i14;
                                        i18 = 6;
                                        if (i15 != 2) {
                                        }
                                        i15 = 5;
                                        i16++;
                                        i14 = i17;
                                        i21 = 1;
                                    }
                                    if (i19 != 0) {
                                        return i19;
                                    }
                                    if (O(cArr[this.f15940d])) {
                                        r0("Expected value");
                                        throw null;
                                    }
                                    e();
                                    this.f15944o = 10;
                                    return 10;
                                }
                                i17 = i14;
                                i18 = 6;
                                if (i15 != 5) {
                                }
                                i15 = i18;
                                i16++;
                                i14 = i17;
                                i21 = 1;
                            } else if (i16 != cArr.length) {
                                if (!q(i16 + 1)) {
                                    int i211 = this.f15940d;
                                    i14 = this.f15941e;
                                    i13 = i211;
                                    c11 = cArr[i13 + i16];
                                    if (c11 != '+') {
                                        if (c11 != 'E') {
                                            i17 = i14;
                                            i18 = 6;
                                            if (i15 != 2) {
                                            }
                                            i15 = 5;
                                            i16++;
                                            i14 = i17;
                                            i21 = 1;
                                        } else {
                                            i17 = i14;
                                            i18 = 6;
                                            if (i15 != 2) {
                                            }
                                            i15 = 5;
                                            i16++;
                                            i14 = i17;
                                            i21 = 1;
                                        }
                                        if (i19 != 0) {
                                            return i19;
                                        }
                                        if (O(cArr[this.f15940d])) {
                                            r0("Expected value");
                                            throw null;
                                        }
                                        e();
                                        this.f15944o = 10;
                                        return 10;
                                    }
                                    i17 = i14;
                                    i18 = 6;
                                    if (i15 != 5) {
                                    }
                                    i15 = i18;
                                    i16++;
                                    i14 = i17;
                                    i21 = 1;
                                }
                                i20 = 2;
                                if (i15 != 2) {
                                    if (i15 != i20) {
                                    }
                                    this.f15946q = i16;
                                    i19 = 16;
                                    this.f15944o = 16;
                                } else {
                                    if (z10) {
                                    }
                                    i20 = 2;
                                    if (i15 != i20) {
                                    }
                                    this.f15946q = i16;
                                    i19 = 16;
                                    this.f15944o = 16;
                                }
                                if (i19 != 0) {
                                    return i19;
                                }
                                if (O(cArr[this.f15940d])) {
                                    r0("Expected value");
                                    throw null;
                                }
                                e();
                                this.f15944o = 10;
                                return 10;
                            }
                            i19 = 0;
                            if (i19 != 0) {
                                return i19;
                            }
                            if (O(cArr[this.f15940d])) {
                                r0("Expected value");
                                throw null;
                            }
                            e();
                            this.f15944o = 10;
                            return 10;
                        }
                    }
                    i11 = 1;
                    if (i23 == 1) {
                        this.f15944o = 4;
                        return 4;
                    }
                }
                if (i23 == i11 && i23 != 2) {
                    r0("Unexpected value");
                    throw null;
                }
                e();
                this.f15940d -= i11;
                this.f15944o = 7;
                return 7;
            }
            iArr[i22] = 5;
            int iF4 = f0(true);
            if (iF4 != 58) {
                if (iF4 != 61) {
                    r0("Expected ':'");
                    throw null;
                }
                e();
                if (this.f15940d < this.f15941e || q(1)) {
                    int i30 = this.f15940d;
                    if (cArr[i30] == '>') {
                        this.f15940d = i30 + 1;
                    }
                }
            }
        }
        i10 = 0;
        iF1 = f0(true);
        if (iF1 != 34) {
            this.f15944o = 9;
            return 9;
        }
        if (iF1 != 39) {
            e();
            this.f15944o = 8;
            return 8;
        }
        if (iF1 != 44) {
            i11 = 1;
        } else {
            i11 = 1;
        }
        if (i23 == i11) {
        }
        e();
        this.f15940d -= i11;
        this.f15944o = 7;
        return 7;
    }

    public final int f0(boolean z10) throws IOException {
        int i10 = this.f15940d;
        int i11 = this.f15941e;
        while (true) {
            if (i10 == i11) {
                this.f15940d = i10;
                if (!q(1)) {
                    if (!z10) {
                        return -1;
                    }
                    throw new EOFException("End of input" + P());
                }
                i10 = this.f15940d;
                i11 = this.f15941e;
            }
            int i12 = i10 + 1;
            char[] cArr = this.f15939c;
            char c10 = cArr[i10];
            if (c10 == '\n') {
                this.f15942f++;
                this.f15943n = i12;
            } else if (c10 != ' ' && c10 != '\r' && c10 != '\t') {
                if (c10 == '/') {
                    this.f15940d = i12;
                    if (i12 == i11) {
                        this.f15940d = i10;
                        boolean zQ = q(2);
                        this.f15940d++;
                        if (!zQ) {
                            return c10;
                        }
                    }
                    e();
                    int i13 = this.f15940d;
                    char c11 = cArr[i13];
                    if (c11 == '*') {
                        this.f15940d = i13 + 1;
                        while (true) {
                            if (this.f15940d + 2 > this.f15941e && !q(2)) {
                                r0("Unterminated comment");
                                throw null;
                            }
                            int i14 = this.f15940d;
                            if (cArr[i14] != '\n') {
                                int i15 = 0;
                                while (true) {
                                    if (i15 >= 2) {
                                        i10 = this.f15940d + 2;
                                        i11 = this.f15941e;
                                        break;
                                    }
                                    if (cArr[this.f15940d + i15] != "*/".charAt(i15)) {
                                        break;
                                    }
                                    i15++;
                                }
                            } else {
                                this.f15942f++;
                                this.f15943n = i14 + 1;
                            }
                            this.f15940d++;
                        }
                    } else {
                        if (c11 != '/') {
                            return c10;
                        }
                        this.f15940d = i13 + 1;
                        o0();
                        i10 = this.f15940d;
                        i11 = this.f15941e;
                    }
                } else {
                    if (c10 != '#') {
                        this.f15940d = i12;
                        return c10;
                    }
                    this.f15940d = i12;
                    e();
                    o0();
                    i10 = this.f15940d;
                    i11 = this.f15941e;
                }
            }
            i10 = i12;
        }
    }

    public final void g() {
        int iF = this.f15944o;
        if (iF == 0) {
            iF = f();
        }
        if (iF != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + k1.e(k0()) + P());
        }
        int i10 = this.f15949t;
        this.f15949t = i10 - 1;
        int[] iArr = this.f15951v;
        int i11 = i10 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.f15944o = 0;
    }

    public final void g0() {
        int iF = this.f15944o;
        if (iF == 0) {
            iF = f();
        }
        if (iF != 7) {
            throw new IllegalStateException("Expected null but was " + k1.e(k0()) + P());
        }
        this.f15944o = 0;
        int[] iArr = this.f15951v;
        int i10 = this.f15949t - 1;
        iArr[i10] = iArr[i10] + 1;
    }

    public final String h0(char c10) throws c {
        int i10;
        char[] cArr;
        StringBuilder sb = null;
        do {
            int i11 = this.f15940d;
            int i12 = this.f15941e;
            while (true) {
                int i13 = i12;
                i10 = i11;
                while (true) {
                    cArr = this.f15939c;
                    if (i11 < i13) {
                        int i14 = i11 + 1;
                        char c11 = cArr[i11];
                        if (c11 == c10) {
                            this.f15940d = i14;
                            int i15 = (i14 - i10) - 1;
                            if (sb == null) {
                                return new String(cArr, i10, i15);
                            }
                            sb.append(cArr, i10, i15);
                            return sb.toString();
                        }
                        if (c11 == '\\') {
                            this.f15940d = i14;
                            int i16 = i14 - i10;
                            int i17 = i16 - 1;
                            if (sb == null) {
                                sb = new StringBuilder(Math.max(i16 * 2, 16));
                            }
                            sb.append(cArr, i10, i17);
                            sb.append(m0());
                            i11 = this.f15940d;
                            i12 = this.f15941e;
                        } else {
                            if (c11 == '\n') {
                                this.f15942f++;
                                this.f15943n = i14;
                            }
                            i11 = i14;
                        }
                    }
                }
            }
            if (sb == null) {
                sb = new StringBuilder(Math.max((i11 - i10) * 2, 16));
            }
            sb.append(cArr, i10, i11 - i10);
            this.f15940d = i11;
        } while (q(1));
        r0("Unterminated string");
        throw null;
    }

    public final String i0() throws IOException {
        String str;
        int iF = this.f15944o;
        if (iF == 0) {
            iF = f();
        }
        if (iF == 10) {
            str = j0();
        } else if (iF == 8) {
            str = h0('\'');
        } else if (iF == 9) {
            str = h0('\"');
        } else if (iF == 11) {
            str = this.f15947r;
            this.f15947r = null;
        } else if (iF == 15) {
            str = Long.toString(this.f15945p);
        } else {
            if (iF != 16) {
                throw new IllegalStateException("Expected a string but was " + k1.e(k0()) + P());
            }
            str = new String(this.f15939c, this.f15940d, this.f15946q);
            this.f15940d += this.f15946q;
        }
        this.f15944o = 0;
        int[] iArr = this.f15951v;
        int i10 = this.f15949t - 1;
        iArr[i10] = iArr[i10] + 1;
        return str;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    public final String j0() throws c {
        String string;
        StringBuilder sb = null;
        int i10 = 0;
        while (true) {
            int i11 = 0;
            while (true) {
                int i12 = this.f15940d;
                int i13 = i12 + i11;
                int i14 = this.f15941e;
                char[] cArr = this.f15939c;
                if (i13 < i14) {
                    char c10 = cArr[i12 + i11];
                    if (c10 != '\t' && c10 != '\n' && c10 != '\f' && c10 != '\r' && c10 != ' ') {
                        if (c10 != '#') {
                            if (c10 != ',') {
                                if (c10 != '/' && c10 != '=') {
                                    if (c10 != '{' && c10 != '}' && c10 != ':') {
                                        if (c10 != ';') {
                                            switch (c10) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i11++;
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        e();
                    }
                    i10 = i11;
                } else if (i11 >= cArr.length) {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max(i11, 16));
                    }
                    sb.append(cArr, this.f15940d, i11);
                    this.f15940d += i11;
                    if (!q(1)) {
                    }
                } else if (!q(i11 + 1)) {
                    i10 = i11;
                }
                if (sb == null) {
                    string = new String(cArr, this.f15940d, i10);
                } else {
                    sb.append(cArr, this.f15940d, i10);
                    string = sb.toString();
                }
                this.f15940d += i10;
                return string;
            }
        }
    }

    public final int k0() throws IOException {
        int iF = this.f15944o;
        if (iF == 0) {
            iF = f();
        }
        switch (iF) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case Code.UNAVAILABLE /* 14 */:
                return 5;
            case 15:
            case Code.UNAUTHENTICATED /* 16 */:
                return 7;
            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    public final void l0(int i10) {
        int i11 = this.f15949t;
        int[] iArr = this.f15948s;
        if (i11 == iArr.length) {
            int i12 = i11 * 2;
            this.f15948s = Arrays.copyOf(iArr, i12);
            this.f15951v = Arrays.copyOf(this.f15951v, i12);
            this.f15950u = (String[]) Arrays.copyOf(this.f15950u, i12);
        }
        int[] iArr2 = this.f15948s;
        int i13 = this.f15949t;
        this.f15949t = i13 + 1;
        iArr2[i13] = i10;
    }

    public final char m0() throws c {
        int i10;
        if (this.f15940d == this.f15941e && !q(1)) {
            r0("Unterminated escape sequence");
            throw null;
        }
        int i11 = this.f15940d;
        int i12 = i11 + 1;
        this.f15940d = i12;
        char[] cArr = this.f15939c;
        char c10 = cArr[i11];
        if (c10 == '\n') {
            this.f15942f++;
            this.f15943n = i12;
        } else if (c10 != '\"' && c10 != '\'' && c10 != '/' && c10 != '\\') {
            if (c10 == 'b') {
                return '\b';
            }
            if (c10 == 'f') {
                return '\f';
            }
            if (c10 == 'n') {
                return '\n';
            }
            if (c10 == 'r') {
                return '\r';
            }
            if (c10 == 't') {
                return '\t';
            }
            if (c10 != 'u') {
                r0("Invalid escape sequence");
                throw null;
            }
            if (i11 + 5 > this.f15941e && !q(4)) {
                r0("Unterminated escape sequence");
                throw null;
            }
            int i13 = this.f15940d;
            int i14 = i13 + 4;
            char c11 = 0;
            while (i13 < i14) {
                char c12 = cArr[i13];
                char c13 = (char) (c11 << 4);
                if (c12 >= '0' && c12 <= '9') {
                    i10 = c12 - '0';
                } else if (c12 >= 'a' && c12 <= 'f') {
                    i10 = c12 - 'W';
                } else {
                    if (c12 < 'A' || c12 > 'F') {
                        throw new NumberFormatException("\\u".concat(new String(cArr, this.f15940d, 4)));
                    }
                    i10 = c12 - '7';
                }
                c11 = (char) (i10 + c13);
                i13++;
            }
            this.f15940d += 4;
            return c11;
        }
        return c10;
    }

    public final void n0(char c10) throws c {
        do {
            int i10 = this.f15940d;
            int i11 = this.f15941e;
            while (i10 < i11) {
                int i12 = i10 + 1;
                char c11 = this.f15939c[i10];
                if (c11 == c10) {
                    this.f15940d = i12;
                    return;
                }
                if (c11 == '\\') {
                    this.f15940d = i12;
                    m0();
                    i10 = this.f15940d;
                    i11 = this.f15941e;
                } else {
                    if (c11 == '\n') {
                        this.f15942f++;
                        this.f15943n = i12;
                    }
                    i10 = i12;
                }
            }
            this.f15940d = i10;
        } while (q(1));
        r0("Unterminated string");
        throw null;
    }

    public final void o0() {
        char c10;
        do {
            if (this.f15940d >= this.f15941e && !q(1)) {
                return;
            }
            int i10 = this.f15940d;
            int i11 = i10 + 1;
            this.f15940d = i11;
            c10 = this.f15939c[i10];
            if (c10 == '\n') {
                this.f15942f++;
                this.f15943n = i11;
                return;
            }
        } while (c10 != '\r');
    }

    public final void p() throws IOException {
        int iF = this.f15944o;
        if (iF == 0) {
            iF = f();
        }
        if (iF != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + k1.e(k0()) + P());
        }
        int i10 = this.f15949t;
        int i11 = i10 - 1;
        this.f15949t = i11;
        this.f15950u[i11] = null;
        int[] iArr = this.f15951v;
        int i12 = i10 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.f15944o = 0;
    }

    public final void p0() throws c {
        do {
            int i10 = 0;
            while (true) {
                int i11 = this.f15940d;
                if (i11 + i10 < this.f15941e) {
                    char c10 = this.f15939c[i11 + i10];
                    if (c10 != '\t' && c10 != '\n' && c10 != '\f' && c10 != '\r' && c10 != ' ') {
                        if (c10 != '#') {
                            if (c10 != ',') {
                                if (c10 != '/' && c10 != '=') {
                                    if (c10 != '{' && c10 != '}' && c10 != ':') {
                                        if (c10 != ';') {
                                            switch (c10) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i10++;
                                                    break;
                                            }
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                        e();
                    }
                    this.f15940d += i10;
                    return;
                }
                this.f15940d = i11 + i10;
            }
        } while (q(1));
    }

    public final boolean q(int i10) throws IOException {
        int i11;
        int i12;
        int i13 = this.f15943n;
        int i14 = this.f15940d;
        this.f15943n = i13 - i14;
        int i15 = this.f15941e;
        char[] cArr = this.f15939c;
        if (i15 != i14) {
            int i16 = i15 - i14;
            this.f15941e = i16;
            System.arraycopy(cArr, i14, cArr, 0, i16);
        } else {
            this.f15941e = 0;
        }
        this.f15940d = 0;
        do {
            int i17 = this.f15941e;
            int i18 = this.f15937a.read(cArr, i17, cArr.length - i17);
            if (i18 == -1) {
                return false;
            }
            i11 = this.f15941e + i18;
            this.f15941e = i11;
            if (this.f15942f == 0 && (i12 = this.f15943n) == 0 && i11 > 0 && cArr[0] == 65279) {
                this.f15940d++;
                this.f15943n = i12 + 1;
                i10++;
            }
        } while (i11 < i10);
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void q0() throws IOException {
        int i10 = 0;
        do {
            int iF = this.f15944o;
            if (iF == 0) {
                iF = f();
            }
            switch (iF) {
                case 1:
                    l0(3);
                    i10++;
                    this.f15944o = 0;
                    break;
                case 2:
                    if (i10 == 0) {
                        this.f15950u[this.f15949t - 1] = null;
                    }
                    this.f15949t--;
                    i10--;
                    this.f15944o = 0;
                    break;
                case 3:
                    l0(1);
                    i10++;
                    this.f15944o = 0;
                    break;
                case 4:
                    this.f15949t--;
                    i10--;
                    this.f15944o = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.f15944o = 0;
                    break;
                case 8:
                    n0('\'');
                    this.f15944o = 0;
                    break;
                case 9:
                    n0('\"');
                    this.f15944o = 0;
                    break;
                case 10:
                    p0();
                    this.f15944o = 0;
                    break;
                case 12:
                    n0('\'');
                    if (i10 == 0) {
                        this.f15950u[this.f15949t - 1] = "<skipped>";
                    }
                    this.f15944o = 0;
                    break;
                case 13:
                    n0('\"');
                    if (i10 == 0) {
                        this.f15950u[this.f15949t - 1] = "<skipped>";
                    }
                    this.f15944o = 0;
                    break;
                case Code.UNAVAILABLE /* 14 */:
                    p0();
                    if (i10 == 0) {
                        this.f15950u[this.f15949t - 1] = "<skipped>";
                    }
                    this.f15944o = 0;
                    break;
                case Code.UNAUTHENTICATED /* 16 */:
                    this.f15940d += this.f15946q;
                    this.f15944o = 0;
                    break;
                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    break;
            }
            return;
        } while (i10 > 0);
        int[] iArr = this.f15951v;
        int i11 = this.f15949t - 1;
        iArr[i11] = iArr[i11] + 1;
    }

    public final void r0(String str) throws c {
        throw new c(str + P());
    }

    public final String toString() {
        return a.class.getSimpleName() + P();
    }

    public final String u(boolean z10) {
        StringBuilder sb = new StringBuilder("$");
        int i10 = 0;
        while (true) {
            int i11 = this.f15949t;
            if (i10 >= i11) {
                return sb.toString();
            }
            int i12 = this.f15948s[i10];
            if (i12 == 1 || i12 == 2) {
                int i13 = this.f15951v[i10];
                if (z10 && i13 > 0 && i10 == i11 - 1) {
                    i13--;
                }
                sb.append('[');
                sb.append(i13);
                sb.append(']');
            } else if (i12 == 3 || i12 == 4 || i12 == 5) {
                sb.append('.');
                String str = this.f15950u[i10];
                if (str != null) {
                    sb.append(str);
                }
            }
            i10++;
        }
    }
}
