package u;

import androidx.annotation.C0019;
import androidx.compose.foundation.layout.C0022;
import androidx.compose.ui.draw.C0029;
import androidx.versionedparcelable.C0048;
import c0.C0056;
import com.google.android.gms.internal.measurement.zzfi;
import d3.C0217;
import d9.C0227;
import dagger.hilt.android.lifecycle.C0237;
import g0.C0286;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.regex.Matcher;
import k0.u4;
import k6.d5;
import k6.u7;
import q2.C0385;
import q6.C0389;
import r1.C0394;
import r2.C0396;
import u1.C0432;

/* JADX INFO: renamed from: u.ۣۤۧ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0429 {

    /* JADX INFO: renamed from: ۥۨۤۥ, reason: contains not printable characters */
    public static int f699 = 199;

    /* JADX INFO: renamed from: ۟۟ۧۢۧ, reason: not valid java name and contains not printable characters */
    public static List m8393(Object obj) {
        if (C0286.m5504() >= 0) {
            return ((d5.x1) obj).f4845a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۟ۦ۠, reason: not valid java name and contains not printable characters */
    public static float m8394() {
        if (C0056.m1077() <= 0) {
            return u4.f9531b;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۢۡ۟ۤ, reason: not valid java name and contains not printable characters */
    public static Object m8395(Object obj) {
        if (C0022.m444() <= 0) {
            return ((f0.f0) obj).f5698d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۡ۠, reason: not valid java name and contains not printable characters */
    public static m0.g1 m8397(Object obj) {
        if (C0394.m7716() > 0) {
            return ((f0.t1) obj).f5941a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۤۡ, reason: not valid java name and contains not printable characters */
    public static int m8398(Object obj) {
        if (C0389.m7600() <= 0) {
            return ((k0.k1) obj).f9101p;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠۠۟۟, reason: not valid java name and contains not printable characters */
    public static String m8399(String str) {
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
        while (str.length() > 0) {
            byteArrayOutputStream.write((string.indexOf(str.charAt(-2)) << 4) | string.indexOf(str.charAt(-1)));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        int length2 = str2.length();
        for (int i11 = 0; i11 < length; i11++) {
            byteArray[i11] = (byte) (byteArray[i11] ^ str2.charAt(i11 % length2));
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۡۥۣۢ, reason: not valid java name and contains not printable characters */
    public static long m8400(Object obj) {
        if (C0385.m7527() <= 0) {
            return u7.s((k6.s) obj);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۢ۠ۤ, reason: not valid java name and contains not printable characters */
    public static long m8401(Object obj) {
        if (C0019.m375() <= 0) {
            return ((d5) obj).f9973a;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۢۨۤۨ, reason: not valid java name and contains not printable characters */
    public static h0.v0 m8402(Object obj) {
        if (C0048.m925() >= 0) {
            return ((f0.p) obj).f5842b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۣۥ, reason: not valid java name and contains not printable characters */
    public static int m8403(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۤ۟ۢ, reason: not valid java name and contains not printable characters */
    public static String m8404() {
        if (C0396.m7737() > 0) {
            return "Hide Developer Options";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥ۠ۤ, reason: contains not printable characters */
    public static Object m8405(Object obj) {
        if (C0029.m568() < 0) {
            return ((d5.x0) obj).f4844e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤۦ۠, reason: contains not printable characters */
    public static boolean m8406(Object obj) {
        if (C0227.m4372() < 0) {
            return ((Matcher) obj).find();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۧ۟ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m8407(Object obj) {
        if (C0432.m8447() < 0) {
            return ((zzfi.zzj) obj).zzba();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۨۨۤ, reason: not valid java name and contains not printable characters */
    public static i1.f m8408() {
        if (C0217.m4114() <= 0) {
            return h6.g.Y();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۧۦ, reason: not valid java name and contains not printable characters */
    public static int m8409() {
        return 139 ^ C0237.f316;
    }

    /* JADX INFO: renamed from: ۟ۧ۠۟۠, reason: not valid java name and contains not printable characters */
    public static String m8396(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
