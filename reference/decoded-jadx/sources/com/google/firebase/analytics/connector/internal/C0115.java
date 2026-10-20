package com.google.firebase.analytics.connector.internal;

import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.gms.internal.stats.C0101;
import com.google.android.play.core.integrity.client.C0108;
import h5.C0306;
import h7.C0310;
import h8.C0313;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.List;
import k0.c0;
import k0.i0;
import k0.p1;
import k0.u1;
import k6.g;
import k6.t5;
import o1.s;
import p8.C0380;
import r.C0392;
import r6.C0402;
import r9.C0405;
import s0.C0409;
import t.d;
import y.t0;

/* JADX INFO: renamed from: com.google.firebase.analytics.connector.internal.ۣۦ۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0115 {

    /* JADX INFO: renamed from: ۢۡۥۧ, reason: not valid java name and contains not printable characters */
    public static int f141 = -576;

    /* JADX INFO: renamed from: ۟۟ۢۦۥ, reason: not valid java name and contains not printable characters */
    public static String[] m2217() {
        if (C0306.m5925() <= 0) {
            return t5.f10399i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۡ, reason: not valid java name and contains not printable characters */
    public static int m2218(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۡۡ۠ۨ, reason: not valid java name and contains not printable characters */
    public static int m2219(Object obj) {
        if (C0405.m7952() <= 0) {
            return ((p1) obj).G;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۥۥ, reason: not valid java name and contains not printable characters */
    public static long m2220(Object obj) {
        if (C0108.m2101() < 0) {
            return ((i0) obj).B;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۦۦ۠ۨ, reason: not valid java name and contains not printable characters */
    public static String m2221(Object obj, Object obj2, Object obj3) {
        if (C0392.m7675() <= 0) {
            return ((g) obj).a((String) obj2, (String) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۧۦۢ, reason: not valid java name and contains not printable characters */
    public static String m2222(String str) {
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
        String str3 = "a";
        while (str3.length() > 0) {
            str3 = "";
            if ("".length() == 0) {
                str3 = "a";
            }
        }
        int length = str3.length();
        int length2 = str2.length();
        for (int i12 = 0; i12 < length; i12++) {
            byteArray[i12] = (byte) (byteArray[i12] ^ str2.charAt(i12 % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۟ۧۡۥ۟, reason: not valid java name and contains not printable characters */
    public static t0 m2223(Object obj) {
        if (C0313.m6072() < 0) {
            return ((u1) obj).f9520d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۥۥ, reason: not valid java name and contains not printable characters */
    public static d m2224(Object obj) {
        if (C0409.m8037() < 0) {
            return ((c0) obj).f8775b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۨۨۢ, reason: not valid java name and contains not printable characters */
    public static long m2225(Object obj, int i10) {
        if (C0402.m7897() >= 0) {
            return s.f0((InputStream) obj, i10);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۢۢ, reason: not valid java name and contains not printable characters */
    public static int m2226(double d10, double d11) {
        if (C0310.m5997() > 0) {
            return Double.compare(d10, d11);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣۤۦ, reason: not valid java name and contains not printable characters */
    public static int m2227() {
        return 220 ^ C0380.f651;
    }

    /* JADX INFO: renamed from: ۦۢ۠ۦ, reason: contains not printable characters */
    public static List m2229(Object obj, Object obj2) {
        if (C0101.m1975() > 0) {
            return ((AccessibilityNodeInfo) obj).findAccessibilityNodeInfosByText((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۢۥۢ, reason: contains not printable characters */
    public static String m2228(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
