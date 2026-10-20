package com.google.firebase.abt;

import a2.c0;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityWindowInfo;
import androidx.compose.ui.graphics.C0032;
import androidx.compose.ui.semantics.C0039;
import androidx.lifecycle.C0043;
import c7.C0068;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzne;
import com.google.android.gms.measurement.internal.C0104;
import com.google.firebase.firestore.proto.C0162;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import d5.g1;
import dagger.hilt.internal.aggregatedroot.C0247;
import f.C0271;
import f2.m;
import f5.y;
import i6.C0320;
import j2.C0324;
import j3.C0326;
import j6.C0329;
import java.io.ByteArrayOutputStream;
import k0.e5;
import k0.f5;
import k0.k2;
import k0.s0;
import k6.e;
import k6.e6;
import k6.f4;
import l0.c;
import m0.l3;
import m0.p0;
import m0.q2;
import m0.u;
import q2.C0385;
import s.C0409;
import u1.C0433;
import u1.a;
import v8.C0451;
import x7.C0473;
import z3.C0486;

/* JADX INFO: renamed from: com.google.firebase.abt.۟ۡۥۢۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0112 {

    /* JADX INFO: renamed from: ۣۣ۟۠۟, reason: not valid java name and contains not printable characters */
    public static int f138 = 568;

    /* JADX INFO: renamed from: ۟۟ۤۦۢ, reason: not valid java name and contains not printable characters */
    public static c0 m2156(Object obj, int i10) {
        if (C0320.m6181() > 0) {
            return f5.a((e5) obj, i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۠ۢۢ, reason: not valid java name and contains not printable characters */
    public static double m2157(Object obj) {
        return C0043.m833() >= 0 ? ((Double) obj).doubleValue() : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: ۟ۡۤۤۥ, reason: not valid java name and contains not printable characters */
    public static long m2158(Object obj) {
        if (C0433.m8470() > 0) {
            return ((e) obj).f9996q;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۡۥ۟ۤ, reason: not valid java name and contains not printable characters */
    public static l3 m2159(Object obj) {
        if (C0162.m3105() >= 0) {
            return ((g1) obj).f4512b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۧۥ, reason: not valid java name and contains not printable characters */
    public static u8.e m2160(Object obj, Object obj2, Object obj3) {
        if (C0329.m6350() > 0) {
            return ((y) obj).create(obj2, (u8.e) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m2161(Object obj, Object obj2) {
        if (C0486.m9449() < 0) {
            ((a) obj).setParentCompositionContext((u) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۠ۧۨ, reason: not valid java name and contains not printable characters */
    public static m m2162() {
        if (C0247.m4717() <= 0) {
            return f2.e.f6103c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۡۧ, reason: not valid java name and contains not printable characters */
    public static String m2163() {
        if (C0271.m5170() <= 0) {
            return "shizuku_not_installed_title";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣ۟۠, reason: not valid java name and contains not printable characters */
    public static String m2164() {
        if (C0473.m9193() <= 0) {
            return "Failed to insert/update user property (got -1). appId";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۠۟ۤ, reason: not valid java name and contains not printable characters */
    public static long m2165() {
        if (C0326.m6295() > 0) {
            return c.E;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۥۧۥ۠, reason: not valid java name and contains not printable characters */
    public static int m2166(Object obj, int i10) {
        if (C0324.m6259() < 0) {
            return ((q2) obj).o(i10);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۦۡۦ, reason: not valid java name and contains not printable characters */
    public static c9.e m2167(Object obj) {
        if (C0409.m8009() <= 0) {
            return ((k2) obj).f9105c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۥۦ, reason: not valid java name and contains not printable characters */
    public static p0 m2168() {
        if (C0039.m764() > 0) {
            return s0.f9444a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۡۦ۟, reason: not valid java name and contains not printable characters */
    public static void m2169(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0104.m2034() < 0) {
            ((f4) obj).d((String) obj2, obj3, obj4);
        }
    }

    /* JADX INFO: renamed from: ۢۡۡ۠, reason: not valid java name and contains not printable characters */
    public static String m2170(String str) {
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

    /* JADX INFO: renamed from: ۣۣۤۡ, reason: not valid java name and contains not printable characters */
    public static int m2171(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۥۣۥۨ, reason: contains not printable characters */
    public static zzfi.zzj.zza m2173(Object obj, Object obj2) {
        if (C0068.m1322() > 0) {
            return ((zzfi.zzj.zza) obj).zzs((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥۡۦ, reason: contains not printable characters */
    public static AccessibilityNodeInfo m2174(Object obj) {
        if (m2176() >= 0) {
            return ((AccessibilityWindowInfo) obj).getRoot();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥۦ۟, reason: contains not printable characters */
    public static boolean m2175(Object obj) {
        if (C0032.m620() < 0) {
            return ((e6) obj).f10009f;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ۟ۥۡ, reason: not valid java name and contains not printable characters */
    public static int m2176() {
        return (-908) ^ C0451.f721;
    }

    /* JADX INFO: renamed from: ۣۨۢۡ, reason: not valid java name and contains not printable characters */
    public static String m2177() {
        if (C0385.m7527() <= 0) {
            return zzne.zzaq();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦۨۦ, reason: not valid java name and contains not printable characters */
    public static String m2172(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
