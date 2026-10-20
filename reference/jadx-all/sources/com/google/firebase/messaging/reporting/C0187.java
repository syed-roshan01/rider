package com.google.firebase.messaging.reporting;

import c3.C0062;
import c9.a;
import com.google.android.datatransport.cct.C0078;
import com.google.crypto.tink.shaded.protobuf.C0110;
import com.google.firebase.measurement.C0183;
import d5.e0;
import dagger.hilt.android.internal.earlyentrypoint.C0231;
import f0.a1;
import f0.n;
import f5.k;
import g2.b0;
import j9.C0330;
import java.io.ByteArrayOutputStream;
import k0.o3;
import k0.y4;
import k6.f;
import k6.t;
import k6.x3;
import p7.C0379;
import q1.C0384;
import t2.C0423;
import u8.e;
import w5.C0464;
import y0.o;

/* JADX INFO: renamed from: com.google.firebase.messaging.reporting.۟ۤ۟ۡۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0187 {

    /* JADX INFO: renamed from: ۧۨۡۤ, reason: not valid java name and contains not printable characters */
    public static int f211 = -323;

    /* JADX INFO: renamed from: ۣۣ۟۟۠, reason: not valid java name and contains not printable characters */
    public static int m3565() {
        return (-21) ^ C0183.f207;
    }

    /* JADX INFO: renamed from: ۟۠ۥۤۡ, reason: not valid java name and contains not printable characters */
    public static a m3566(Object obj) {
        if (C0062.m1186() >= 0) {
            return ((o3) obj).f9320o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۥۥ, reason: not valid java name and contains not printable characters */
    public static Object m3567(Object obj) {
        if (C0110.m2123() <= 0) {
            return ((e0) obj).f4470f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۨۤۧ, reason: not valid java name and contains not printable characters */
    public static o m3568(Object obj, float f10, float f11, float f12, float f13, int i10) {
        if (C0330.m6367() > 0) {
            return androidx.compose.foundation.layout.a.o((o) obj, f10, f11, f12, f13, i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۨ۟, reason: not valid java name and contains not printable characters */
    public static int m3569(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۤ۠۟۠, reason: not valid java name and contains not printable characters */
    public static e m3570(Object obj, Object obj2, Object obj3) {
        if (C0078.m1692() >= 0) {
            return ((k) obj).create(obj2, (e) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۠۠, reason: not valid java name and contains not printable characters */
    public static String m3571(String str) {
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

    /* JADX INFO: renamed from: ۟ۦۣ۠ۧ, reason: not valid java name and contains not printable characters */
    public static void m3572(Object obj, Object obj2) {
        if (C0384.m7523() < 0) {
            ((k6.k) obj).L((t) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۣۡ۟, reason: not valid java name and contains not printable characters */
    public static long m3573(Object obj) {
        if (C0423.m8294() > 0) {
            return ((y4) obj).f9678d;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۢۨۥۢ, reason: not valid java name and contains not printable characters */
    public static boolean m3575(Object obj, Object obj2, Object obj3) {
        if (C0231.m4440() >= 0) {
            return ((f) obj).v((String) obj2, (x3) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۣ۠ۢ, reason: contains not printable characters */
    public static a1 m3576() {
        if (C0464.m9033() >= 0) {
            return a1.f5591g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤۧ۟, reason: contains not printable characters */
    public static b0 m3577(Object obj) {
        if (C0379.m7420() > 0) {
            return ((n) obj).f5819b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦۡۡ, reason: not valid java name and contains not printable characters */
    public static String m3574(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
