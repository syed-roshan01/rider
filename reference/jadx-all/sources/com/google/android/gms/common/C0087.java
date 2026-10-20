package com.google.android.gms.common;

import a2.c0;
import android.os.Bundle;
import android.os.Parcel;
import androidx.compose.ui.draw.a;
import b.C0049;
import b3.C0051;
import b5.l;
import c9.c;
import c9.e;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzs;
import com.google.android.play.core.integrity.client.C0107;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.annotations.concurrent.C0125;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firebase_analytics.C0144;
import com.google.firebase.firestore.ktx.C0158;
import com.google.firebase.messaging.reporting.C0187;
import d5.c2;
import d5.z1;
import dagger.hilt.C0256;
import f5.z;
import f6.C0278;
import h3.C0304;
import h7.C0312;
import i.C0317;
import java.io.ByteArrayOutputStream;
import k.f;
import k0.b5;
import k0.e5;
import k0.f0;
import k0.i0;
import k0.k0;
import k0.q1;
import k6.s6;
import k6.v;
import k6.w7;
import k6.x6;
import l3.C0343;
import m0.g1;
import m0.q;
import m1.C0352;
import n9.C0367;
import p9.q0;
import t1.C0420;
import v9.C0452;
import x7.C0473;
import y.t0;
import y0.o;
import z0.C0483;
import z4.d;

/* JADX INFO: renamed from: com.google.android.gms.common.ۦۢۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0087 {

    /* JADX INFO: renamed from: ۦۢۥۧ, reason: contains not printable characters */
    public static int f121 = 604;

    /* JADX INFO: renamed from: ۟۟ۡۧۢ, reason: not valid java name and contains not printable characters */
    public static o m1848(Object obj) {
        if (C0312.m6027() <= 0) {
            return ((f0) obj).f8902c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۧۦ۟, reason: not valid java name and contains not printable characters */
    public static boolean m1849(Object obj) {
        if (C0107.m2075() <= 0) {
            return ((zzew.zze) obj).zzf();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۧ۠ۥ, reason: not valid java name and contains not printable characters */
    public static o m1851(Object obj, Object obj2) {
        if (C0420.m8247() > 0) {
            return a.f((o) obj, (c) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۧۡ, reason: not valid java name and contains not printable characters */
    public static int m1852() {
        return (-519) ^ C0124.f150;
    }

    /* JADX INFO: renamed from: ۟ۢۢۦۡ, reason: not valid java name and contains not printable characters */
    public static e m1853(Object obj) {
        if (C0049.m945() > 0) {
            return ((q1) obj).f9385t;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۨ۟ۤ, reason: not valid java name and contains not printable characters */
    public static String m1854(String str) {
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

    /* JADX INFO: renamed from: ۣ۟ۡۤ۟, reason: not valid java name and contains not printable characters */
    public static int m1855(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۠ۡ, reason: not valid java name and contains not printable characters */
    public static float m1856(Object obj) {
        if (C0125.m2408() > 0) {
            return ((t0) obj).c();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۥۨ, reason: not valid java name and contains not printable characters */
    public static long m1857(Object obj, int i10) {
        if (C0144.m2767() > 0) {
            return k0.c((i0) obj, i10);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۦۦ, reason: not valid java name and contains not printable characters */
    public static void m1858(Object obj, float f10, float f11, float f12, float f13) {
        if (C0051.m992() > 0) {
            ((f) obj).G(f10, f11, f12, f13);
        }
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۤ۟, reason: not valid java name and contains not printable characters */
    public static boolean m1859(Object obj, int i10) {
        if (C0304.m5859() <= 0) {
            return ((q) obj).e(i10);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۨۢ۠, reason: not valid java name and contains not printable characters */
    public static void m1860(Object obj, Object obj2, Object obj3) {
        if (C0256.m4876() < 0) {
            ((Bundle) obj).putByteArray((String) obj2, (byte[]) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۦۦ۠, reason: not valid java name and contains not printable characters */
    public static q0 m1861(Object obj) {
        if (C0367.m7189() > 0) {
            return ((d) obj).B;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۨۥ, reason: not valid java name and contains not printable characters */
    public static v m1862(Object obj) {
        if (C0483.m9389() > 0) {
            return ((k6.e) obj).f9997r;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۡۤ, reason: not valid java name and contains not printable characters */
    public static int m1863(int i10, Object obj) {
        if (C0304.m5859() <= 0) {
            return y3.e.Y0(i10, (Parcel) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠۟ۦۢ, reason: not valid java name and contains not printable characters */
    public static zzs m1864() {
        if (C0343.m6720() > 0) {
            return zzs.VERBOSE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۠ۥۦ, reason: not valid java name and contains not printable characters */
    public static g1 m1865(Object obj) {
        if (C0142.m2725() > 0) {
            return ((z1) obj).f4878e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢۡ, reason: not valid java name and contains not printable characters */
    public static int m1866(Object obj) {
        if (C0452.m8793() < 0) {
            return ((b5) obj).f8764u;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۧ۟ۥ, reason: contains not printable characters */
    public static String m1867(Object obj) {
        if (C0278.m5361() < 0) {
            return ((z) obj).f6350o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۧۨۨ, reason: contains not printable characters */
    public static s6 m1868(Object obj) {
        if (C0317.m6120() <= 0) {
            return ((x6) obj).f10542n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢۤۢ, reason: contains not printable characters */
    public static void m1869(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0473.m9193() < 0) {
            ((w7) obj).zza((String) obj2, (String) obj3, (Bundle) obj4);
        }
    }

    /* JADX INFO: renamed from: ۦۦ۟ۨ, reason: contains not printable characters */
    public static String m1870(Object obj) {
        if (C0352.m6885() > 0) {
            return ((c2) obj).f4440c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۡ۠ۨ, reason: not valid java name and contains not printable characters */
    public static l m1871() {
        if (C0158.m3012() > 0) {
            return l.f2729b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥۡۦ, reason: not valid java name and contains not printable characters */
    public static c0 m1872(Object obj) {
        if (C0187.m3565() > 0) {
            return ((e5) obj).f8884e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۠۟ۨ, reason: not valid java name and contains not printable characters */
    public static String m1850(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
