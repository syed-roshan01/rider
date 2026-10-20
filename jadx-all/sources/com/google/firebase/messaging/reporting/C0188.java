package com.google.firebase.messaging.reporting;

import aa.C0012;
import android.content.pm.PackageInfo;
import android.os.ext.SdkExtensions;
import c0.C0057;
import com.google.android.datatransport.runtime.backends.C0079;
import com.google.android.gms.internal.measurement.zzcv;
import com.google.firebase.annotations.concurrent.C0123;
import com.google.firebase.firestore.index.C0154;
import com.google.firebase.firestore.ktx.C0157;
import com.google.firebase.firestore.ktx.C0158;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfiginterop.C0203;
import d5.s1;
import e0.e;
import e0.f;
import e7.C0265;
import h0.b1;
import java.io.ByteArrayOutputStream;
import k0.a0;
import k0.i4;
import k6.d4;
import k6.d5;
import k6.f4;
import k6.u7;
import k6.x7;
import l9.C0348;
import m5.C0355;
import o2.C0369;
import o7.d0;
import p8.C0380;
import p9.q0;
import r4.C0399;
import t1.C0420;
import t2.C0421;
import v0.C0441;
import w0.u;
import z4.d;

/* JADX INFO: renamed from: com.google.firebase.messaging.reporting.۟ۤ۠ۡ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0188 {

    /* JADX INFO: renamed from: ۣۤۦۨ, reason: not valid java name and contains not printable characters */
    public static int f212 = 105;

    /* JADX INFO: renamed from: ۟۟۠, reason: not valid java name and contains not printable characters */
    public static String m3578() {
        if (C0420.m8247() > 0) {
            return "Shizuku Service Active ✓";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۧۦۧ, reason: not valid java name and contains not printable characters */
    public static int m3579(Object obj) {
        if (C0355.m6953() < 0) {
            return ((b1) obj).hashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۤۤۨ, reason: not valid java name and contains not printable characters */
    public static String m3580(String str) {
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

    /* JADX INFO: renamed from: ۟ۢۢۢ, reason: not valid java name and contains not printable characters */
    public static int m3581() {
        if (C0380.m7433() >= 0) {
            return SdkExtensions.getExtensionVersion(30);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣ۟۟ۡ, reason: not valid java name and contains not printable characters */
    public static int m3582(Object obj) {
        if (C0441.m8597() >= 0) {
            return ((s1) obj).f4771a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۤۨ, reason: not valid java name and contains not printable characters */
    public static e m3583(float f10, float f11, float f12, float f13, int i10) {
        if (C0123.m2379() > 0) {
            return f.b(f10, f11, f12, f13, i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static double m3584(Object obj) {
        return C0399.m7797() < 0 ? ((Number) obj).doubleValue() : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۧۤ, reason: not valid java name and contains not printable characters */
    public static int m3585(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۥۣ۠۟, reason: not valid java name and contains not printable characters */
    public static String m3586(Object obj) {
        if (C0421.m8263() > 0) {
            return ((d5) obj).f9975c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۨۤۥ, reason: not valid java name and contains not printable characters */
    public static u m3588(Object obj) {
        if (C0012.m226() >= 0) {
            return ((a0) obj).f8710b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۠۠ۨ, reason: not valid java name and contains not printable characters */
    public static long m3589(Object obj) {
        if (C0265.m5062() <= 0) {
            return ((x7) obj).f10552q;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۡۥۡۥ, reason: not valid java name and contains not printable characters */
    public static int m3590(Object obj) {
        if (C0154.m2958() <= 0) {
            return ((i4) obj).f9047f;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۦۥ۠, reason: not valid java name and contains not printable characters */
    public static f4 m3591(Object obj) {
        if (C0369.m7234() > 0) {
            return ((d4) obj).w();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۨ, reason: not valid java name and contains not printable characters */
    public static i1.f m3592() {
        if (C0057.m1090() < 0) {
            return d0.f12585n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۦ۠, reason: not valid java name and contains not printable characters */
    public static long m3593(Object obj) {
        if (C0348.m6808() <= 0) {
            return ((PackageInfo) obj).lastUpdateTime;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۧۦ۟, reason: not valid java name and contains not printable characters */
    public static int m3594() {
        return (-976) ^ C0157.f181;
    }

    /* JADX INFO: renamed from: ۣۤ, reason: not valid java name and contains not printable characters */
    public static String m3595() {
        if (C0203.m3894() > 0) {
            return "metadata";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۢۤۡ, reason: contains not printable characters */
    public static q0 m3596(Object obj) {
        if (C0158.m3012() > 0) {
            return ((d) obj).F;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۟۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m3597(Object obj, Object obj2, boolean z10) {
        if (C0079.m1701() >= 0) {
            ((u7) obj).I((zzcv) obj2, z10);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۧۨ۟, reason: not valid java name and contains not printable characters */
    public static String m3587(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
