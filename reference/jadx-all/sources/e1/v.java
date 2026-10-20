package e1;

/* JADX INFO: loaded from: classes.dex */
public abstract class v implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a4.q f5072a = new a4.q();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f5073b;

    static {
        a(1.0f);
        a(-1.0f);
        f5073b = Float.intBitsToFloat(1056964608);
    }

    public static short a(float f10) {
        int i10;
        f5072a.getClass();
        int iFloatToRawIntBits = Float.floatToRawIntBits(f10);
        int i11 = iFloatToRawIntBits >>> 31;
        int i12 = (iFloatToRawIntBits >>> 23) & 255;
        int i13 = 8388607 & iFloatToRawIntBits;
        int i14 = 31;
        int i15 = 0;
        if (i12 != 255) {
            int i16 = i12 - 112;
            if (i16 >= 31) {
                i14 = 49;
            } else {
                if (i16 > 0) {
                    i15 = i13 >> 13;
                    if ((iFloatToRawIntBits & 4096) != 0) {
                        i10 = (((i16 << 10) | i15) + 1) | (i11 << 15);
                    } else {
                        i14 = i16;
                    }
                    return (short) i10;
                }
                if (i16 >= -10) {
                    int i17 = (8388608 | i13) >> (1 - i16);
                    if ((i17 & 4096) != 0) {
                        i17 += 8192;
                    }
                    i14 = 0;
                    i15 = i17 >> 13;
                } else {
                    i14 = 0;
                }
            }
        } else if (i13 != 0) {
            i15 = 512;
        }
        i10 = (i11 << 15) | (i14 << 10) | i15;
        return (short) i10;
    }

    public static final float b(short s9) {
        int i10;
        int i11;
        int i12;
        int i13 = Short.MIN_VALUE & s9;
        int i14 = ((65535 & s9) >>> 10) & 31;
        int i15 = s9 & 1023;
        if (i14 != 0) {
            int i16 = i15 << 13;
            if (i14 == 31) {
                i10 = 255;
                if (i16 != 0) {
                    i16 |= 4194304;
                }
            } else {
                i10 = i14 + 112;
            }
            int i17 = i10;
            i11 = i16;
            i12 = i17;
        } else {
            if (i15 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i15 + 1056964608) - f5073b;
                return i13 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i12 = 0;
            i11 = 0;
        }
        return Float.intBitsToFloat((i12 << 23) | (i13 << 16) | i11);
    }
}
