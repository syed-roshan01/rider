package g8;

import java.text.ParseException;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f6963a = TimeUnit.SECONDS.toNanos(1);

    public static void a(List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!(list.get(i10) instanceof Map)) {
                throw new ClassCastException(String.format(Locale.US, "value %s for idx %d in %s is not object", list.get(i10), Integer.valueOf(i10), list));
            }
        }
    }

    public static Boolean b(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not Boolean", obj, str, map));
    }

    public static List c(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof List) {
            return (List) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not List", obj, str, map));
    }

    public static List d(String str, Map map) {
        List listC = c(str, map);
        if (listC == null) {
            return null;
        }
        for (int i10 = 0; i10 < listC.size(); i10++) {
            if (!(listC.get(i10) instanceof String)) {
                throw new ClassCastException(String.format(Locale.US, "value '%s' for idx %d in '%s' is not string", listC.get(i10), Integer.valueOf(i10), listC));
            }
        }
        return listC;
    }

    public static Double e(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (!(obj instanceof String)) {
            throw new IllegalArgumentException(String.format("value '%s' for key '%s' in '%s' is not a number", obj, str, map));
        }
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not a double", obj, str));
        }
    }

    public static Integer f(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (!(obj instanceof Double)) {
            if (!(obj instanceof String)) {
                throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not an integer", obj, str));
            }
            try {
                return Integer.valueOf(Integer.parseInt((String) obj));
            } catch (NumberFormatException unused) {
                throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not an integer", obj, str));
            }
        }
        Double d10 = (Double) obj;
        int iIntValue = d10.intValue();
        if (iIntValue == d10.doubleValue()) {
            return Integer.valueOf(iIntValue);
        }
        throw new ClassCastException("Number expected to be integer: " + d10);
    }

    public static Map g(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Map) {
            return (Map) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not object", obj, str, map));
    }

    public static String h(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not String", obj, str, map));
    }

    public static Long i(String str, Map map) {
        String strH = h(str, map);
        if (strH == null) {
            return null;
        }
        try {
            return Long.valueOf(k(strH));
        } catch (ParseException e4) {
            throw new RuntimeException(e4);
        }
    }

    public static long j(int i10, long j10) {
        long j11;
        int i11 = i10;
        long j12 = i11;
        long j13 = f6963a;
        if (j12 <= (-j13) || j12 >= j13) {
            long j14 = j12 / j13;
            j11 = j10 + j14;
            if (!((j10 ^ j14) < 0) && !((j10 ^ j11) >= 0)) {
                throw new ArithmeticException("overflow: checkedAdd(" + j10 + ", " + j14 + ")");
            }
            i11 = (int) (j12 % j13);
        } else {
            j11 = j10;
        }
        if (j11 > 0 && i11 < 0) {
            i11 = (int) (((long) i11) + j13);
            j11--;
        }
        if (j11 < 0 && i11 > 0) {
            i11 = (int) (((long) i11) - j13);
            j11++;
        }
        if (j11 >= -315576000000L && j11 <= 315576000000L) {
            long j15 = i11;
            if (j15 >= -999999999 && j15 < j13 && ((j11 >= 0 && i11 >= 0) || (j11 <= 0 && i11 <= 0))) {
                long nanos = TimeUnit.SECONDS.toNanos(j11);
                long j16 = i11;
                long j17 = nanos + j16;
                return (((j16 ^ nanos) > 0L ? 1 : ((j16 ^ nanos) == 0L ? 0 : -1)) < 0) | ((nanos ^ j17) >= 0) ? j17 : ((j17 >>> 63) ^ 1) + Long.MAX_VALUE;
            }
        }
        throw new IllegalArgumentException(String.format("Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds", Long.valueOf(j11), Integer.valueOf(i11)));
    }

    public static long k(String str) throws ParseException {
        boolean z10;
        String strSubstring;
        int iCharAt;
        if (str.isEmpty() || str.charAt(str.length() - 1) != 's') {
            throw new ParseException("Invalid duration string: ".concat(str), 0);
        }
        if (str.charAt(0) == '-') {
            str = str.substring(1);
            z10 = true;
        } else {
            z10 = false;
        }
        String strSubstring2 = str.substring(0, str.length() - 1);
        int iIndexOf = strSubstring2.indexOf(46);
        if (iIndexOf != -1) {
            strSubstring = strSubstring2.substring(iIndexOf + 1);
            strSubstring2 = strSubstring2.substring(0, iIndexOf);
        } else {
            strSubstring = "";
        }
        long j10 = Long.parseLong(strSubstring2);
        if (strSubstring.isEmpty()) {
            iCharAt = 0;
        } else {
            iCharAt = 0;
            for (int i10 = 0; i10 < 9; i10++) {
                iCharAt *= 10;
                if (i10 < strSubstring.length()) {
                    if (strSubstring.charAt(i10) < '0' || strSubstring.charAt(i10) > '9') {
                        throw new ParseException("Invalid nanoseconds.", 0);
                    }
                    iCharAt = (strSubstring.charAt(i10) - '0') + iCharAt;
                }
            }
        }
        if (j10 < 0) {
            throw new ParseException("Invalid duration string: ".concat(str), 0);
        }
        if (z10) {
            j10 = -j10;
            iCharAt = -iCharAt;
        }
        try {
            return j(iCharAt, j10);
        } catch (IllegalArgumentException unused) {
            throw new ParseException("Duration value is out of range.", 0);
        }
    }
}
