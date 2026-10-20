package k;

import a2.y;
import a6.C0007;
import android.os.Bundle;
import c4.C0065;
import com.google.firebase.measurement.C0183;
import com.google.firebase.remoteconfig.internal.C0195;
import dagger.hilt.android.internal.earlyentrypoint.C0231;
import f0.a2;
import f0.b1;
import f0.h2;
import fa.C0279;
import g.C0283;
import java.io.ByteArrayOutputStream;
import k0.o1;
import k0.o2;
import k0.q3;
import k6.p7;
import k6.s5;
import q7.C0389;
import r6.C0401;
import t2.C0423;
import v9.C0451;
import x7.C0472;

/* JADX INFO: renamed from: k.ۣۡۤۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0331 {

    /* JADX INFO: renamed from: ۤۧۨۦ, reason: not valid java name and contains not printable characters */
    public static int f479 = 263;

    /* JADX INFO: renamed from: ۟۟ۥۡۤ, reason: not valid java name and contains not printable characters */
    public static c9.e m6396(Object obj) {
        if (C0231.m4453() <= 0) {
            return ((k0.l) obj).f9125n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۨۨۢ, reason: not valid java name and contains not printable characters */
    public static boolean m6397(Object obj) {
        if (C0065.m1257() < 0) {
            return ((ja.l) obj).f8551b;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۤۥ, reason: not valid java name and contains not printable characters */
    public static d5.m m6398() {
        if (C0423.m8307() > 0) {
            return d5.m.D;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۡ۟, reason: not valid java name and contains not printable characters */
    public static o2 m6399() {
        if (C0007.m154() <= 0) {
            return o2.f9311e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥۦۧ, reason: not valid java name and contains not printable characters */
    public static a2 m6400(Object obj) {
        if (C0389.m7627() <= 0) {
            return ((h2) obj).f5737b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۥۣۤ, reason: not valid java name and contains not printable characters */
    public static s5 m6401(int i10, Object obj) {
        if (C0401.m7881() <= 0) {
            return s5.b(i10, (Bundle) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۡۦۣ, reason: not valid java name and contains not printable characters */
    public static long m6402(Object obj) {
        if (C0183.m3510() > 0) {
            return ((q3) obj).f9407n;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۥۣ۟ۢ, reason: not valid java name and contains not printable characters */
    public static b1 m6404(Object obj) {
        if (C0472.m9193() <= 0) {
            return ((o1) obj).f9297q;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧۧۢ, reason: not valid java name and contains not printable characters */
    public static void m6405(Object obj) {
        if (C0283.m5468() > 0) {
            ((p7) obj).O();
        }
    }

    /* JADX INFO: renamed from: ۢ۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static long m6406(Object obj, Object obj2, long j10) {
        if (C0451.m8793() < 0) {
            return ((r1.s) obj).o((r1.s) obj2, j10);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۤ۠ۥۨ, reason: not valid java name and contains not printable characters */
    public static Object m6407(float f10, Object obj, Object obj2) {
        if (C0195.m3737() < 0) {
            return y.b(f10, obj, obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟ۦ۟, reason: contains not printable characters */
    public static int m6408() {
        return 645 ^ C0279.f424;
    }

    /* JADX INFO: renamed from: ۣۧ۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m6409(String str) {
        String string = "";
        int i10 = 0;
        String str2 = "";
        while (i10 < 15) {
            string = new StringBuffer().append(string).append(Integer.toHexString(i10)).toString();
            String string2 = new StringBuffer().append(str2).append(((int) (Math.random() * ((double) 10))) ^ i10).toString();
            i10++;
            str2 = string2;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length() / 2);
        for (int i11 = 0; i11 < str.length(); i11 += 2) {
            byteArrayOutputStream.write((string.indexOf(str.charAt(i11)) << 4) | string.indexOf(str.charAt(i11 + 1)));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        int length2 = str2.length();
        for (int i12 = 0; i12 < length; i12++) {
            byteArray[i12] = (byte) (byteArray[i12] ^ str2.charAt(i12 % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۧۡۧۤ, reason: not valid java name and contains not printable characters */
    public static int m6410(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۤۨۢۢ, reason: not valid java name and contains not printable characters */
    public static String m6403(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
