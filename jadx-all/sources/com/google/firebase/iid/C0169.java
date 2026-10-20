package com.google.firebase.iid;

import c9.e;
import com.google.android.gms.internal.stats.C0101;
import com.google.firebase.auth.ktx.C0132;
import com.google.firebase.encoders.C0143;
import com.google.firebase.measurement.C0183;
import com.google.firebase.messaging.reporting.C0189;
import d.i;
import d.j;
import d5.e0;
import dagger.hilt.android.internal.C0236;
import f0.t1;
import g3.C0289;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import k0.q3;
import k0.v4;
import k6.x;
import k6.x3;
import l0.C0341;
import m0.q2;
import o8.C0372;
import s7.C0416;
import w5.C0464;
import y6.C0478;

/* JADX INFO: renamed from: com.google.firebase.iid.۟ۥ۟۠ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0169 {

    /* JADX INFO: renamed from: ۟ۥۨۤ۠, reason: not valid java name and contains not printable characters */
    public static int f193 = 740;

    /* JADX INFO: renamed from: ۟۟۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static int m3231(float f10) {
        if (C0183.m3510() > 0) {
            return Float.hashCode(f10);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟ۧۧ, reason: not valid java name and contains not printable characters */
    public static int m3232(Object obj) {
        if (C0341.m6681() > 0) {
            return ((q2) obj).f11682r;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟۠۠ۡ, reason: not valid java name and contains not printable characters */
    public static int m3233(Object obj) {
        if (C0464.m9033() > 0) {
            return ((t1) obj).f5942b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۥۦۡ, reason: not valid java name and contains not printable characters */
    public static String m3234(String str) {
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
        while (length > 0) {
            byteArray[-1] = (byte) (byteArray[-1] ^ str2.charAt((-1) % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۟ۢۥۡۡ, reason: not valid java name and contains not printable characters */
    public static i m3235(Object obj) {
        if (C0189.m3621() >= 0) {
            return ((j) obj).getActivityResultRegistry();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۧۡ, reason: not valid java name and contains not printable characters */
    public static void m3236(Object obj) {
        if (C0189.m3621() >= 0) {
            ((e0) obj).m4167invoke();
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۤۡۧ, reason: not valid java name and contains not printable characters */
    public static String m3237() {
        if (C0236.m4538() >= 0) {
            return "last_fire_timestamp";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۧ۠, reason: not valid java name and contains not printable characters */
    public static int m3238(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۦۤۦۦ, reason: not valid java name and contains not printable characters */
    public static x3 m3239() {
        if (C0478.m9312() <= 0) {
            return x.A;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۠ۨۥ, reason: not valid java name and contains not printable characters */
    public static void m3240(Object obj, int i10, boolean z10) {
        if (C0101.m1975() > 0) {
            ((q2.x) obj).c(i10, z10);
        }
    }

    /* JADX INFO: renamed from: ۤۧۢ۟, reason: not valid java name and contains not printable characters */
    public static byte[] m3241(Object obj, Object obj2) {
        if (C0372.m7283() >= 0) {
            return ((String) obj).getBytes((Charset) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۨۡ۠, reason: not valid java name and contains not printable characters */
    public static long m3242(Object obj) {
        if (C0143.m2751() >= 0) {
            return ((q3) obj).f9404k;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۦۨۧ۠, reason: contains not printable characters */
    public static String m3244() {
        if (C0289.m5547() > 0) {
            return "last_bundled_day";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۠ۡۨ, reason: not valid java name and contains not printable characters */
    public static int m3245() {
        return (-822) ^ C0132.f158;
    }

    /* JADX INFO: renamed from: ۨۧۦۦ, reason: not valid java name and contains not printable characters */
    public static e m3246(Object obj) {
        if (C0416.m8144() > 0) {
            return ((v4) obj).f9578s;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥۧۧ, reason: contains not printable characters */
    public static String m3243(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
