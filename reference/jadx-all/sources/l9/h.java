package l9;

/* JADX INFO: loaded from: classes.dex */
public abstract class h extends g {
    public static Double B0(String str) {
        try {
            if (e.f11405a.a(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Float C0(String str) {
        d7.a.m(str, "<this>");
        try {
            if (e.f11405a.a(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Integer D0(String str) {
        boolean z10;
        int i10;
        int i11;
        d7.a.m(str, "<this>");
        d7.a.n(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i12 = 0;
        char cCharAt = str.charAt(0);
        int i13 = -2147483647;
        if (d7.a.o(cCharAt, 48) < 0) {
            i10 = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '-') {
                i13 = Integer.MIN_VALUE;
                z10 = true;
            } else {
                if (cCharAt != '+') {
                    return null;
                }
                z10 = false;
            }
        } else {
            z10 = false;
            i10 = 0;
        }
        int i14 = -59652323;
        while (i10 < length) {
            int iDigit = Character.digit((int) str.charAt(i10), 10);
            if (iDigit < 0) {
                return null;
            }
            if ((i12 < i14 && (i14 != -59652323 || i12 < (i14 = i13 / 10))) || (i11 = i12 * 10) < i13 + iDigit) {
                return null;
            }
            i12 = i11 - iDigit;
            i10++;
        }
        return z10 ? Integer.valueOf(i12) : Integer.valueOf(-i12);
    }

    public static Long E0(String str) {
        boolean z10;
        d7.a.m(str, "<this>");
        d7.a.n(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i10 = 0;
        char cCharAt = str.charAt(0);
        long j10 = -9223372036854775807L;
        if (d7.a.o(cCharAt, 48) < 0) {
            z10 = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '-') {
                j10 = Long.MIN_VALUE;
                i10 = 1;
            } else {
                if (cCharAt != '+') {
                    return null;
                }
                z10 = false;
                i10 = 1;
            }
        } else {
            z10 = false;
        }
        long j11 = -256204778801521550L;
        long j12 = 0;
        long j13 = -256204778801521550L;
        while (i10 < length) {
            int iDigit = Character.digit((int) str.charAt(i10), 10);
            if (iDigit < 0) {
                return null;
            }
            if (j12 < j13) {
                if (j13 != j11) {
                    return null;
                }
                j13 = j10 / ((long) 10);
                if (j12 < j13) {
                    return null;
                }
            }
            long j14 = j12 * ((long) 10);
            long j15 = iDigit;
            if (j14 < j10 + j15) {
                return null;
            }
            j12 = j14 - j15;
            i10++;
            j11 = -256204778801521550L;
        }
        return z10 ? Long.valueOf(j12) : Long.valueOf(-j12);
    }
}
