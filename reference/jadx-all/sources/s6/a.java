package s6;

import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char[] f14049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14050c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14051d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f14052e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f14053f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte[] f14054g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean[] f14055h;

    public a(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        int i10 = 0;
        while (true) {
            if (i10 >= cArr.length) {
                this.f14048a = str;
                this.f14049b = cArr;
                try {
                    int iQ0 = h6.g.q0(cArr.length, RoundingMode.UNNECESSARY);
                    this.f14051d = iQ0;
                    int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iQ0);
                    int i11 = 1 << (3 - iNumberOfTrailingZeros);
                    this.f14052e = i11;
                    this.f14053f = iQ0 >> iNumberOfTrailingZeros;
                    this.f14050c = cArr.length - 1;
                    this.f14054g = bArr;
                    boolean[] zArr = new boolean[i11];
                    for (int i12 = 0; i12 < this.f14053f; i12++) {
                        zArr[h6.g.R(i12 * 8, this.f14051d, RoundingMode.CEILING)] = true;
                    }
                    this.f14055h = zArr;
                    return;
                } catch (ArithmeticException e4) {
                    throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e4);
                }
            }
            char c10 = cArr[i10];
            if (!(c10 < 128)) {
                throw new IllegalArgumentException(f6.a.c0("Non-ASCII character: %s", Character.valueOf(c10)));
            }
            if (!(bArr[c10] == -1)) {
                throw new IllegalArgumentException(f6.a.c0("Duplicate character: %s", Character.valueOf(c10)));
            }
            bArr[c10] = (byte) i10;
            i10++;
        }
    }

    public final int a(char c10) throws d {
        if (c10 > 127) {
            throw new d("Unrecognized character: 0x" + Integer.toHexString(c10));
        }
        byte b10 = this.f14054g[c10];
        if (b10 != -1) {
            return b10;
        }
        if (c10 <= ' ' || c10 == 127) {
            throw new d("Unrecognized character: 0x" + Integer.toHexString(c10));
        }
        throw new d("Unrecognized character: " + c10);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        aVar.getClass();
        return Arrays.equals(this.f14049b, aVar.f14049b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f14049b) + 1237;
    }

    public final String toString() {
        return this.f14048a;
    }
}
