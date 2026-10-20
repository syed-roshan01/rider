package ja;

import com.google.firebase.messaging.Constants;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class j implements Serializable, Comparable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j f8539d = new j(new byte[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f8540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient int f8541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient String f8542c;

    public j(byte[] bArr) {
        d7.a.m(bArr, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f8540a = bArr;
    }

    public static int g(j jVar, j jVar2) {
        jVar.getClass();
        d7.a.m(jVar2, "other");
        return jVar.f(0, jVar2.f8540a);
    }

    public static int k(j jVar, j jVar2) {
        jVar.getClass();
        d7.a.m(jVar2, "other");
        return jVar.j(-1234567890, jVar2.f8540a);
    }

    public static final j l(byte... bArr) {
        d7.a.m(bArr, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        d7.a.l(bArrCopyOf, "copyOf(this, size)");
        return new j(bArrCopyOf);
    }

    public static /* synthetic */ j q(j jVar, int i10, int i11, int i12) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = -1234567890;
        }
        return jVar.p(i10, i11);
    }

    public String a() {
        byte[] bArr = a.f8500a;
        byte[] bArr2 = this.f8540a;
        d7.a.m(bArr2, "<this>");
        d7.a.m(bArr, "map");
        byte[] bArr3 = new byte[((bArr2.length + 2) / 3) * 4];
        int length = bArr2.length - (bArr2.length % 3);
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            byte b10 = bArr2[i10];
            int i12 = i10 + 2;
            byte b11 = bArr2[i10 + 1];
            i10 += 3;
            byte b12 = bArr2[i12];
            bArr3[i11] = bArr[(b10 & 255) >> 2];
            bArr3[i11 + 1] = bArr[((b10 & 3) << 4) | ((b11 & 255) >> 4)];
            int i13 = i11 + 3;
            bArr3[i11 + 2] = bArr[((b11 & 15) << 2) | ((b12 & 255) >> 6)];
            i11 += 4;
            bArr3[i13] = bArr[b12 & 63];
        }
        int length2 = bArr2.length - length;
        if (length2 == 1) {
            byte b13 = bArr2[i10];
            bArr3[i11] = bArr[(b13 & 255) >> 2];
            bArr3[i11 + 1] = bArr[(b13 & 3) << 4];
            bArr3[i11 + 2] = 61;
            bArr3[i11 + 3] = 61;
        } else if (length2 == 2) {
            int i14 = i10 + 1;
            byte b14 = bArr2[i10];
            byte b15 = bArr2[i14];
            bArr3[i11] = bArr[(b14 & 255) >> 2];
            bArr3[i11 + 1] = bArr[((b14 & 3) << 4) | ((b15 & 255) >> 4)];
            bArr3[i11 + 2] = bArr[(b15 & 15) << 2];
            bArr3[i11 + 3] = 61;
        }
        return new String(bArr3, l9.a.f11393a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (r0 < r1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r7 < r8) goto L9;
     */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int compareTo(ja.j r10) {
        /*
            r9 = this;
            java.lang.String r0 = "other"
            d7.a.m(r10, r0)
            int r0 = r9.d()
            int r1 = r10.d()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L13:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L2e
            byte r7 = r9.i(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.i(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L28
            int r4 = r4 + 1
            goto L13
        L28:
            if (r7 >= r8) goto L2c
        L2a:
            r3 = r5
            goto L34
        L2c:
            r3 = r6
            goto L34
        L2e:
            if (r0 != r1) goto L31
            goto L34
        L31:
            if (r0 >= r1) goto L2c
            goto L2a
        L34:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ja.j.compareTo(ja.j):int");
    }

    public j c(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.f8540a, 0, d());
        byte[] bArrDigest = messageDigest.digest();
        d7.a.j(bArrDigest);
        return new j(bArrDigest);
    }

    public int d() {
        return this.f8540a.length;
    }

    public String e() {
        byte[] bArr = this.f8540a;
        char[] cArr = new char[bArr.length * 2];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            char[] cArr2 = ka.b.f10654a;
            cArr[i10] = cArr2[(b10 >> 4) & 15];
            i10 += 2;
            cArr[i11] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            int iD = jVar.d();
            byte[] bArr = this.f8540a;
            if (iD == bArr.length && jVar.n(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int f(int i10, byte[] bArr) {
        d7.a.m(bArr, "other");
        byte[] bArr2 = this.f8540a;
        int length = bArr2.length - bArr.length;
        int iMax = Math.max(i10, 0);
        if (iMax <= length) {
            while (!o7.d0.j(bArr2, iMax, bArr, 0, bArr.length)) {
                if (iMax != length) {
                    iMax++;
                }
            }
            return iMax;
        }
        return -1;
    }

    public byte[] h() {
        return this.f8540a;
    }

    public int hashCode() {
        int i10 = this.f8541b;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = Arrays.hashCode(this.f8540a);
        this.f8541b = iHashCode;
        return iHashCode;
    }

    public byte i(int i10) {
        return this.f8540a[i10];
    }

    public int j(int i10, byte[] bArr) {
        d7.a.m(bArr, "other");
        int iH0 = o7.d0.h0(this, i10);
        byte[] bArr2 = this.f8540a;
        for (int iMin = Math.min(iH0, bArr2.length - bArr.length); -1 < iMin; iMin--) {
            if (o7.d0.j(bArr2, iMin, bArr, 0, bArr.length)) {
                return iMin;
            }
        }
        return -1;
    }

    public boolean m(int i10, j jVar, int i11) {
        d7.a.m(jVar, "other");
        return jVar.n(0, this.f8540a, i10, i11);
    }

    public boolean n(int i10, byte[] bArr, int i11, int i12) {
        d7.a.m(bArr, "other");
        if (i10 >= 0) {
            byte[] bArr2 = this.f8540a;
            if (i10 <= bArr2.length - i12 && i11 >= 0 && i11 <= bArr.length - i12 && o7.d0.j(bArr2, i10, bArr, i11, i12)) {
                return true;
            }
        }
        return false;
    }

    public final boolean o(j jVar) {
        d7.a.m(jVar, "prefix");
        return m(0, jVar, jVar.d());
    }

    public j p(int i10, int i11) {
        int iH0 = o7.d0.h0(this, i11);
        if (i10 < 0) {
            throw new IllegalArgumentException("beginIndex < 0".toString());
        }
        byte[] bArr = this.f8540a;
        if (iH0 > bArr.length) {
            throw new IllegalArgumentException(a7.a.o(new StringBuilder("endIndex > length("), bArr.length, ')').toString());
        }
        if (iH0 - i10 >= 0) {
            return (i10 == 0 && iH0 == bArr.length) ? this : new j(b9.b.M(bArr, i10, iH0));
        }
        throw new IllegalArgumentException("endIndex < beginIndex".toString());
    }

    public j r() {
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f8540a;
            if (i10 >= bArr.length) {
                return this;
            }
            byte b10 = bArr[i10];
            if (b10 >= 65 && b10 <= 90) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                d7.a.l(bArrCopyOf, "copyOf(this, size)");
                bArrCopyOf[i10] = (byte) (b10 + 32);
                for (int i11 = i10 + 1; i11 < bArrCopyOf.length; i11++) {
                    byte b11 = bArrCopyOf[i11];
                    if (b11 >= 65 && b11 <= 90) {
                        bArrCopyOf[i11] = (byte) (b11 + 32);
                    }
                }
                return new j(bArrCopyOf);
            }
            i10++;
        }
    }

    public byte[] s() {
        byte[] bArr = this.f8540a;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        d7.a.l(bArrCopyOf, "copyOf(this, size)");
        return bArrCopyOf;
    }

    public final String t() {
        String str = this.f8542c;
        if (str != null) {
            return str;
        }
        byte[] bArrH = h();
        d7.a.m(bArrH, "<this>");
        String str2 = new String(bArrH, l9.a.f11393a);
        this.f8542c = str2;
        return str2;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x003c A[EDGE_INSN: B:22:0x003c->B:180:0x01a6 BREAK  A[LOOP:0: B:6:0x000f->B:241:0x000f]] */
    public String toString() {
        byte b10;
        int i10;
        byte[] bArr = this.f8540a;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        loop0: while (i11 < length) {
            byte b11 = bArr[i11];
            if (b11 < 0) {
                if ((b11 >> 5) != -2) {
                    if ((b11 >> 4) != -2) {
                        if ((b11 >> 3) != -2) {
                            if (i13 == 64) {
                                break;
                            }
                            i12 = -1;
                            break;
                        }
                        int i14 = i11 + 3;
                        if (length > i14) {
                            byte b12 = bArr[i11 + 1];
                            if ((b12 & 192) != 128) {
                                if (i13 == 64) {
                                    break;
                                }
                                i12 = -1;
                                break;
                            }
                            byte b13 = bArr[i11 + 2];
                            if ((b13 & 192) != 128) {
                                if (i13 == 64) {
                                    break;
                                }
                                i12 = -1;
                                break;
                            }
                            byte b14 = bArr[i14];
                            if ((b14 & 192) != 128) {
                                if (i13 == 64) {
                                    break;
                                }
                                i12 = -1;
                                break;
                            }
                            int i15 = (((b14 ^ 3678080) ^ (b13 << 6)) ^ (b12 << 12)) ^ (b11 << 18);
                            if (i15 <= 1114111) {
                                if (55296 <= i15 && i15 < 57344) {
                                    if (i13 == 64) {
                                        break;
                                    }
                                    i12 = -1;
                                    break;
                                }
                                if (i15 >= 65536) {
                                    i10 = i13 + 1;
                                    if (i13 == 64) {
                                        break;
                                    }
                                    if ((i15 != 10 && i15 != 13 && ((i15 >= 0 && i15 < 32) || (127 <= i15 && i15 < 160))) || i15 == 65533) {
                                        i12 = -1;
                                        break;
                                    }
                                    i12 += i15 < 65536 ? 1 : 2;
                                    i11 += 4;
                                    i13 = i10;
                                } else {
                                    if (i13 == 64) {
                                        break;
                                    }
                                    i12 = -1;
                                    break;
                                }
                            } else {
                                if (i13 == 64) {
                                    break;
                                }
                                i12 = -1;
                                break;
                            }
                        } else {
                            if (i13 == 64) {
                                break;
                            }
                            i12 = -1;
                            break;
                        }
                    } else {
                        int i16 = i11 + 2;
                        if (length > i16) {
                            byte b15 = bArr[i11 + 1];
                            if ((b15 & 192) != 128) {
                                if (i13 == 64) {
                                    break;
                                }
                                i12 = -1;
                                break;
                            }
                            byte b16 = bArr[i16];
                            if ((b16 & 192) != 128) {
                                if (i13 == 64) {
                                    break;
                                }
                                i12 = -1;
                                break;
                            }
                            int i17 = ((b16 ^ (-123008)) ^ (b15 << 6)) ^ (b11 << 12);
                            if (i17 >= 2048) {
                                if (55296 <= i17 && i17 < 57344) {
                                    if (i13 == 64) {
                                        break;
                                    }
                                    i12 = -1;
                                    break;
                                }
                                i10 = i13 + 1;
                                if (i13 == 64) {
                                    break;
                                }
                                if ((i17 != 10 && i17 != 13 && ((i17 >= 0 && i17 < 32) || (127 <= i17 && i17 < 160))) || i17 == 65533) {
                                    i12 = -1;
                                    break;
                                }
                                i12 += i17 < 65536 ? 1 : 2;
                                i11 += 3;
                                i13 = i10;
                            } else {
                                if (i13 == 64) {
                                    break;
                                }
                                i12 = -1;
                                break;
                            }
                        } else {
                            if (i13 == 64) {
                                break;
                            }
                            i12 = -1;
                            break;
                        }
                    }
                } else {
                    int i18 = i11 + 1;
                    if (length > i18) {
                        byte b17 = bArr[i18];
                        if ((b17 & 192) != 128) {
                            if (i13 == 64) {
                                break;
                            }
                            i12 = -1;
                            break;
                        }
                        int i19 = (b17 ^ 3968) ^ (b11 << 6);
                        if (i19 >= 128) {
                            i10 = i13 + 1;
                            if (i13 == 64) {
                                break;
                            }
                            if ((i19 != 10 && i19 != 13 && ((i19 >= 0 && i19 < 32) || (127 <= i19 && i19 < 160))) || i19 == 65533) {
                                i12 = -1;
                                break;
                            }
                            i12 += i19 < 65536 ? 1 : 2;
                            i11 += 2;
                            i13 = i10;
                        } else {
                            if (i13 == 64) {
                                break;
                            }
                            i12 = -1;
                            break;
                        }
                    } else {
                        if (i13 == 64) {
                            break;
                        }
                        i12 = -1;
                        break;
                    }
                }
            } else {
                int i20 = i13 + 1;
                if (i13 == 64) {
                    break;
                }
                if ((b11 == 10 || b11 == 13 || ((b11 < 0 || b11 >= 32) && (127 > b11 || b11 >= 160))) && b11 != 65533) {
                    i12 += b11 < 65536 ? 1 : 2;
                    i11++;
                    while (true) {
                        i13 = i20;
                        if (i11 < length && (b10 = bArr[i11]) >= 0) {
                            i11++;
                            i20 = i13 + 1;
                            if (i13 == 64) {
                                break loop0;
                            }
                            if ((b10 == 10 || b10 == 13 || ((b10 < 0 || b10 >= 32) && (127 > b10 || b10 >= 160))) && b10 != 65533) {
                                i12 += b10 < 65536 ? 1 : 2;
                            }
                        }
                    }
                }
                i12 = -1;
                break;
            }
        }
        if (i12 != -1) {
            String strT = t();
            String strSubstring = strT.substring(0, i12);
            d7.a.l(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String strC1 = l9.i.c1(l9.i.c1(l9.i.c1(strSubstring, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (i12 < strT.length()) {
                return l.q.m(new StringBuilder("[size="), bArr.length, " text=", strC1, "…]");
            }
            return "[text=" + strC1 + ']';
        }
        if (bArr.length <= 64) {
            return "[hex=" + e() + ']';
        }
        StringBuilder sb = new StringBuilder("[size=");
        sb.append(bArr.length);
        sb.append(" hex=");
        int iH0 = o7.d0.h0(this, 64);
        if (iH0 > bArr.length) {
            throw new IllegalArgumentException(a7.a.o(new StringBuilder("endIndex > length("), bArr.length, ')').toString());
        }
        if (iH0 < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex".toString());
        }
        sb.append((iH0 == bArr.length ? this : new j(b9.b.M(bArr, 0, iH0))).e());
        sb.append("…]");
        return sb.toString();
    }

    public void u(g gVar, int i10) {
        d7.a.m(gVar, "buffer");
        gVar.f0(this.f8540a, 0, i10);
    }
}
