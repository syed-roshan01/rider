package com.google.firebase.remoteconfig.ktx;

import a2.c0;
import a5.h0;
import android.os.SystemClock;
import androidx.compose.foundation.layout.C0022;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.C0088;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.firebase.firestore.bundle.C0148;
import com.google.firebase.firestore.core.C0151;
import com.google.firebase.measurement.C0181;
import d2.C0215;
import d5.w0;
import f0.C0272;
import f0.i;
import java.io.ByteArrayOutputStream;
import java.security.SecureRandom;
import k0.a2;
import k0.l0;
import k0.m0;
import k0.v3;
import k1.C0332;
import k6.j4;
import k6.k;
import k6.p6;
import k6.r6;
import k6.u7;
import k8.C0338;
import l0.C0340;
import l0.u;
import l2.C0341;
import m0.l3;
import m1.C0350;
import m5.C0354;
import q0.C0382;
import r6.C0401;
import t2.C0420;
import x2.C0467;
import y3.c;

/* JADX INFO: renamed from: com.google.firebase.remoteconfig.ktx.ۣ۟ۢ۠ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0199 {

    /* JADX INFO: renamed from: ۟ۢۢۧۢ, reason: not valid java name and contains not printable characters */
    public static int f223 = -56;

    /* JADX INFO: renamed from: ۟۟ۨۤ۟, reason: not valid java name and contains not printable characters */
    public static l0 m3812() {
        if (C0338.m6645() < 0) {
            return l0.f9149v;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۨۨ, reason: not valid java name and contains not printable characters */
    public static l3 m3813(Object obj) {
        if (C0215.m4108() <= 0) {
            return ((w0) obj).f4822e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۦۨۧ, reason: not valid java name and contains not printable characters */
    public static String m3814(String str) {
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

    /* JADX INFO: renamed from: ۣ۟ۧۤۧ, reason: not valid java name and contains not printable characters */
    public static boolean m3815(Object obj) {
        if (C0341.m6699() <= 0) {
            return ((j4) obj).t();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۥۧۨ, reason: not valid java name and contains not printable characters */
    public static String m3817(Object obj) {
        if (C0088.m1874() >= 0) {
            return ((zzfc.zzg) obj).zzb();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤۧۢ, reason: not valid java name and contains not printable characters */
    public static int m3818() {
        return 223 ^ C0272.f388;
    }

    /* JADX INFO: renamed from: ۣۣۡۦ, reason: not valid java name and contains not printable characters */
    public static c0 m3819() {
        if (C0151.m2903() >= 0) {
            return u.f11176a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤ۟۟, reason: not valid java name and contains not printable characters */
    public static long m3820() {
        if (C0350.m6878() <= 0) {
            return SystemClock.elapsedRealtime();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۢ۠ۡ۠, reason: not valid java name and contains not printable characters */
    public static int m3821(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۤ۠ۥۥ, reason: not valid java name and contains not printable characters */
    public static c0 m3822(Object obj) {
        if (C0148.m2838() <= 0) {
            return ((i) obj).f5743c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۤۨ۟, reason: not valid java name and contains not printable characters */
    public static Object m3823(Object obj) {
        if (C0022.m444() <= 0) {
            return ((a2) obj).invoke();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۨۥۣ, reason: not valid java name and contains not printable characters */
    public static String m3824() {
        if (C0382.m7487() <= 0) {
            return "Alert on Accept";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۢۨ, reason: contains not printable characters */
    public static String m3825(Object obj) {
        if (C0401.m7881() < 0) {
            return ((c) obj).f16886b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۡۥ, reason: contains not printable characters */
    public static SecureRandom m3826(Object obj) {
        if (C0181.m3452() <= 0) {
            return ((u7) obj).x0();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۥۣۧ, reason: contains not printable characters */
    public static String[] m3827() {
        if (C0354.m6953() <= 0) {
            return k.f10142m;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۦۤ۟, reason: contains not printable characters */
    public static boolean m3828(Object obj) {
        if (C0332.m6454() < 0) {
            return ((v3) obj).f9556a;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۢ۟ۡ, reason: not valid java name and contains not printable characters */
    public static m0 m3829() {
        if (C0467.m9101() <= 0) {
            return m0.f9200q;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥۦ۟, reason: not valid java name and contains not printable characters */
    public static p6 m3830(Object obj) {
        if (C0420.m8263() > 0) {
            return ((r6) obj).f10348b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦۥۧ, reason: not valid java name and contains not printable characters */
    public static int m3831(Object obj) {
        if (C0340.m6681() > 0) {
            return ((h0) obj).f1267d;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۥ۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m3816(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
