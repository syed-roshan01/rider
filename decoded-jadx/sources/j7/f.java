package j7;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f8410a = Charset.forName("UTF-8");

    /* JADX WARN: Code duplicated, block: B:37:0x00b9  */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e2, code lost:
    
        if (r7 != 4) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] a(String str) {
        byte[] bytes = str.getBytes(f8410a);
        int length = bytes.length;
        int i10 = (length * 3) / 4;
        byte[] bArr = new byte[i10];
        int[] iArr = e.f8408c;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i11 < length) {
            if (i12 == 0) {
                while (true) {
                    int i15 = i11 + 4;
                    if (i15 > length || (i13 = (iArr[bytes[i11] & 255] << 18) | (iArr[bytes[i11 + 1] & 255] << 12) | (iArr[bytes[i11 + 2] & 255] << 6) | iArr[bytes[i11 + 3] & 255]) < 0) {
                        break;
                    }
                    bArr[i14 + 2] = (byte) i13;
                    bArr[i14 + 1] = (byte) (i13 >> 8);
                    bArr[i14] = (byte) (i13 >> 16);
                    i14 += 3;
                    i11 = i15;
                }
                if (i11 >= length) {
                    break;
                }
                throw new IllegalArgumentException("bad base-64");
            }
            int i16 = i11 + 1;
            int i17 = iArr[bytes[i11] & 255];
            if (i12 != 0) {
                if (i12 == 1) {
                    if (i17 >= 0) {
                        i17 |= i13 << 6;
                    } else if (i17 != -1) {
                        throw new IllegalArgumentException("bad base-64");
                    }
                    i11 = i16;
                } else if (i12 == 2) {
                    if (i17 >= 0) {
                        i17 |= i13 << 6;
                    } else if (i17 == -2) {
                        bArr[i14] = (byte) (i13 >> 4);
                        i12 = 4;
                        i14++;
                    } else if (i17 != -1) {
                        throw new IllegalArgumentException("bad base-64");
                    }
                    i11 = i16;
                } else if (i12 == 3) {
                    if (i17 >= 0) {
                        i17 |= i13 << 6;
                        bArr[i14 + 2] = (byte) i17;
                        bArr[i14 + 1] = (byte) (i17 >> 8);
                        bArr[i14] = (byte) (i17 >> 16);
                        i14 += 3;
                        i12 = 0;
                    } else if (i17 == -2) {
                        bArr[i14 + 1] = (byte) (i13 >> 2);
                        bArr[i14] = (byte) (i13 >> 10);
                        i14 += 2;
                        i12 = 5;
                    } else if (i17 != -1) {
                        throw new IllegalArgumentException("bad base-64");
                    }
                    i11 = i16;
                } else if (i12 == 4) {
                    if (i17 == -2) {
                        i12++;
                    } else if (i17 != -1) {
                        throw new IllegalArgumentException("bad base-64");
                    }
                    i11 = i16;
                } else {
                    if (i12 == 5 && i17 != -1) {
                        throw new IllegalArgumentException("bad base-64");
                    }
                    i11 = i16;
                }
                i12++;
            } else {
                if (i17 >= 0) {
                    i12++;
                } else if (i17 != -1) {
                    throw new IllegalArgumentException("bad base-64");
                }
                i11 = i16;
            }
            i13 = i17;
            i11 = i16;
        }
        if (i12 != 1) {
            if (i12 == 2) {
                bArr[i14] = (byte) (i13 >> 4);
                i14++;
            } else if (i12 == 3) {
                int i18 = i14 + 1;
                bArr[i14] = (byte) (i13 >> 10);
                i14 += 2;
                bArr[i18] = (byte) (i13 >> 2);
            }
            if (i14 == i10) {
                return bArr;
            }
            byte[] bArr2 = new byte[i14];
            System.arraycopy(bArr, 0, bArr2, 0, i14);
            return bArr2;
        }
        throw new IllegalArgumentException("bad base-64");
    }

    public static byte[] b(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = e.f8409d;
        int i10 = (length / 3) * 4;
        if (length % 3 > 0) {
            i10 += 4;
        }
        byte[] bArr3 = new byte[i10];
        int i11 = 0;
        int i12 = -1;
        int i13 = 0;
        while (true) {
            int i14 = i11 + 3;
            if (i14 > length) {
                break;
            }
            int i15 = (bArr[i11 + 2] & 255) | ((bArr[i11] & 255) << 16) | ((bArr[i11 + 1] & 255) << 8);
            bArr3[i13] = bArr2[(i15 >> 18) & 63];
            bArr3[i13 + 1] = bArr2[(i15 >> 12) & 63];
            bArr3[i13 + 2] = bArr2[(i15 >> 6) & 63];
            bArr3[i13 + 3] = bArr2[i15 & 63];
            int i16 = i13 + 4;
            i12--;
            if (i12 == 0) {
                i13 += 5;
                bArr3[i16] = 10;
                i12 = 19;
            } else {
                i13 = i16;
            }
            i11 = i14;
        }
        if (i11 == length - 1) {
            int i17 = (bArr[i11] & 255) << 4;
            bArr3[i13] = bArr2[(i17 >> 6) & 63];
            bArr3[i13 + 1] = bArr2[i17 & 63];
            bArr3[i13 + 2] = 61;
            bArr3[i13 + 3] = 61;
        } else if (i11 == length - 2) {
            int i18 = ((bArr[i11 + 1] & 255) << 2) | ((bArr[i11] & 255) << 10);
            bArr3[i13] = bArr2[(i18 >> 12) & 63];
            bArr3[i13 + 1] = bArr2[(i18 >> 6) & 63];
            bArr3[i13 + 2] = bArr2[i18 & 63];
            bArr3[i13 + 3] = 61;
        }
        return bArr3;
    }
}
