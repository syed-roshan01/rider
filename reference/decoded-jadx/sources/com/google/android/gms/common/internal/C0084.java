package com.google.android.gms.common.internal;

import a.C0000;
import a6.C0007;
import aa.C0011;
import com.google.android.datatransport.cct.C0076;
import com.google.android.play.core.integrity.client.C0108;
import com.google.firebase.emulators.C0140;
import d5.k1;
import d5.t1;
import d5.x1;
import dagger.hilt.android.lifecycle.C0237;
import e9.C0266;
import f1.C0273;
import h4.C0305;
import java.io.ByteArrayOutputStream;
import k0.b2;
import k0.m2;
import k6.r4;
import l2.C0341;
import m0.g1;
import n1.C0362;
import o2.C0368;
import q6.C0387;
import r2.C0396;
import t.d1;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.ۣۧۧۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0084 {

    /* JADX INFO: renamed from: ۣۣ۟ۧۡ, reason: not valid java name and contains not printable characters */
    public static int f118 = 517;

    /* JADX INFO: renamed from: ۟۟ۥۥ, reason: not valid java name and contains not printable characters */
    public static String m1793() {
        if (C0000.m12() < 0) {
            return "Not stopping services. fetch, network, upload";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۦۨۡ, reason: not valid java name and contains not printable characters */
    public static g1 m1794(Object obj) {
        if (C0266.m5099() < 0) {
            return ((k1) obj).f4610c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۥۡ, reason: not valid java name and contains not printable characters */
    public static String m1795(Object obj) {
        if (C0305.m5904() > 0) {
            return ((t1) obj).f4782b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦ۠۟, reason: not valid java name and contains not printable characters */
    public static int m1796() {
        if (C0011.m208() <= 0) {
            return j4.p.f8372a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢۡ۠ۧ, reason: not valid java name and contains not printable characters */
    public static int m1797(Object obj) {
        if (C0273.m5273() <= 0) {
            return Integer.parseInt((String) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ, reason: not valid java name and contains not printable characters */
    public static long m1798(Object obj) {
        if (C0237.m4583() > 0) {
            return ((k0.y) obj).f9660a;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۤۢ, reason: not valid java name and contains not printable characters */
    public static String m1799() {
        if (C0076.m1655() > 0) {
            return "kn";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۡۨ, reason: not valid java name and contains not printable characters */
    public static void m1800(Object obj) {
        if (C0368.m7234() > 0) {
            ((j4.l) obj).a();
        }
    }

    /* JADX INFO: renamed from: ۟ۥۣۢۨ, reason: not valid java name and contains not printable characters */
    public static t.w m1801() {
        if (C0140.m2699() > 0) {
            return b2.f8737f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦۢۡ, reason: not valid java name and contains not printable characters */
    public static int m1802(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۧۦۥۣ, reason: not valid java name and contains not printable characters */
    public static d1 m1803(float f10, Object obj, int i10) {
        if (C0108.m2101() <= 0) {
            return t.e.r(f10, obj, i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۠ۨۨ, reason: not valid java name and contains not printable characters */
    public static int m1804() {
        return (-30) ^ C0007.f27;
    }

    /* JADX INFO: renamed from: ۢۧ, reason: not valid java name and contains not printable characters */
    public static boolean m1806(Object obj) {
        if (C0387.m7585() >= 0) {
            return ((r4) obj).a();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۨۤ۟, reason: not valid java name and contains not printable characters */
    public static String m1807(String str) {
        String string = "";
        int i10 = 0;
        String str2 = "";
        while (i10 < 15) {
            string = new StringBuffer().append(string).append(Integer.toHexString(i10)).toString();
            String string2 = new StringBuffer().append(str2).append(((int) (Math.random() * ((double) 10))) ^ i10).toString();
            i10++;
            str2 = string2;
        }
        while (string.length() > 0) {
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
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۣۥۥۤ, reason: not valid java name and contains not printable characters */
    public static Boolean m1808(Object obj) {
        if (C0341.m6699() <= 0) {
            return ((k6.t) obj).f10375k;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۠ۧ۟, reason: not valid java name and contains not printable characters */
    public static int m1809(Object obj) {
        if (C0362.m7099() <= 0) {
            return ((x1) obj).f4849e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۥۦ, reason: contains not printable characters */
    public static int m1810(Object obj) {
        if (C0396.m7755() > 0) {
            return ((m2) obj).f9213n;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۥۥ۠, reason: not valid java name and contains not printable characters */
    public static String m1805(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
