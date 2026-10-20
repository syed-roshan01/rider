package com.google.firebase.firestore.bundle;

import a5.h0;
import a5.i0;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.ui.graphics.C0030;
import androidx.compose.ui.layout.C0035;
import androidx.compose.ui.node.C0037;
import c9.a;
import com.google.android.gms.common.util.C0085;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.firebase.components.C0135;
import com.google.firebase.internal.api.C0178;
import com.google.firebase.measurement.C0181;
import d5.f1;
import d5.u1;
import d8.C0222;
import dagger.hilt.android.components.C0229;
import dagger.hilt.android.internal.earlyentrypoint.C0232;
import dagger.hilt.android.internal.migration.C0233;
import f0.a2;
import h3.C0303;
import java.io.ByteArrayOutputStream;
import java.util.List;
import k0.d2;
import k0.q3;
import k6.a5;
import k6.k;
import k6.s5;
import k6.y5;
import la.g;
import m0.l3;
import m0.m;
import n7.C0365;
import p4.C0377;
import r1.C0394;
import r2.C0396;
import s0.C0410;
import s7.C0415;
import t1.s1;
import t1.x0;
import v0.C0441;
import v7.C0450;
import x9.i;

/* JADX INFO: renamed from: com.google.firebase.firestore.bundle.ۡۦۤۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0149 {

    /* JADX INFO: renamed from: ۢۦۣۥ, reason: not valid java name and contains not printable characters */
    public static int f174 = -143;

    /* JADX INFO: renamed from: ۟۟ۤ۠ۧ, reason: not valid java name and contains not printable characters */
    public static void m2847(int i10) {
        if (C0415.m8130() <= 0) {
            g.g(i10);
        }
    }

    /* JADX INFO: renamed from: ۟۟ۥ۠ۧ, reason: not valid java name and contains not printable characters */
    public static long m2848(Object obj) {
        if (C0394.m7716() > 0) {
            return ((q3) obj).f9408o;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟۠ۤۤۤ, reason: not valid java name and contains not printable characters */
    public static List m2849(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0135.m2608() < 0) {
            return ((k) obj).U((String) obj2, (String) obj3, (String) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۧ۠, reason: not valid java name and contains not printable characters */
    public static int m2850(Object obj) {
        if (C0377.m7371() >= 0) {
            return ((AccessibilityNodeInfo) obj).getChildCount();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۥ۟ۥ, reason: not valid java name and contains not printable characters */
    public static String m2851(String str) {
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

    /* JADX INFO: renamed from: ۣ۟ۢ۠ۡ, reason: not valid java name and contains not printable characters */
    public static void m2852(Object obj, Object obj2, int i10) {
        if (C0178.m3402() > 0) {
            ((d2) obj).a((m) obj2, i10);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۥۣ۟, reason: not valid java name and contains not printable characters */
    public static boolean m2853(Object obj) {
        if (C0181.m3452() <= 0) {
            return ((y5) obj).f10574i;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۡۦۦ, reason: not valid java name and contains not printable characters */
    public static zzfi.zzg.zza m2855(Object obj, Object obj2) {
        if (C0150.m2892() < 0) {
            return ((zzfi.zzg.zza) obj).zzb((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static long m2856(Object obj) {
        if (C0396.m7737() >= 0) {
            return ((a2) obj).f5603d;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۡۦ, reason: not valid java name and contains not printable characters */
    public static void m2857(Object obj, Object obj2) {
        if (C0037.m733() > 0) {
            ((k) obj).M((a5) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۨۢۤ, reason: not valid java name and contains not printable characters */
    public static String m2858() {
        if (C0222.m4264() >= 0) {
            return "Play sound when ride is accepted";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۨۦۨ, reason: not valid java name and contains not printable characters */
    public static void m2859(Object obj, Object obj2, long j10, boolean z10, boolean z11) {
        if (C0410.m8037() < 0) {
            y5.K((y5) obj, (s5) obj2, j10, z10, z11);
        }
    }

    /* JADX INFO: renamed from: ۣ۠ۢۡ, reason: not valid java name and contains not printable characters */
    public static l3 m2860(Object obj) {
        if (C0035.m690() < 0) {
            return ((f1) obj).f4487d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠۠ۢ, reason: not valid java name and contains not printable characters */
    public static int m2861(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۣۧۡ, reason: not valid java name and contains not printable characters */
    public static a m2862(Object obj) {
        if (C0232.m4453() <= 0) {
            return ((u1) obj).f4794b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡۥۤ, reason: not valid java name and contains not printable characters */
    public static int m2863() {
        return 37 ^ C0233.f312;
    }

    /* JADX INFO: renamed from: ۤۡۨۨ, reason: not valid java name and contains not printable characters */
    public static String m2864() {
        if (C0085.m1825() >= 0) {
            return "Got multiple records for user property, expected one. appId";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۧ۟ۦ, reason: not valid java name and contains not printable characters */
    public static int m2865() {
        if (C0441.m8597() >= 0) {
            return zzcc.zza;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤۧۤۤ, reason: not valid java name and contains not printable characters */
    public static boolean m2866(Object obj) {
        if (C0229.m4402() >= 0) {
            return ((k0.u1) obj).f9518b;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ۟ۧۥ, reason: not valid java name and contains not printable characters */
    public static String[] m2867(Object obj) {
        if (C0030.m575() > 0) {
            return ((i) obj).f16418c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦۥۢ, reason: not valid java name and contains not printable characters */
    public static s1 m2868(Object obj) {
        if (C0450.m8755() > 0) {
            return ((x0) obj).f14578d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۧۤۤ, reason: not valid java name and contains not printable characters */
    public static String m2869() {
        if (C0303.m5836() >= 0) {
            return "shizuku_notice";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۨۡ, reason: not valid java name and contains not printable characters */
    public static i0 m2870(Object obj) {
        if (C0365.m7147() <= 0) {
            return ((h0) obj).f1264a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۡۤۧ, reason: not valid java name and contains not printable characters */
    public static String m2854(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
