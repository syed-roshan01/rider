package com.google.firebase.concurrent;

import a5.i0;
import androidx.compose.ui.semantics.C0039;
import androidx.profileinstaller.C0045;
import b8.C0055;
import c1.C0060;
import com.auto.accept.data.model.AppConfig;
import com.google.android.gms.auth.api.signin.C0081;
import com.google.android.gms.internal.measurement.zzne;
import com.google.android.gms.internal.measurement.zzoc;
import com.google.firebase.annotations.concurrent.C0126;
import com.google.firebase.components.C0135;
import com.google.firebase.installations.ktx.C0175;
import com.google.firebase.ktx.C0180;
import com.google.firebase.messaging.C0191;
import d5.m1;
import f5.j;
import g4.C0290;
import ga.C0296;
import ia.C0323;
import j0.b0;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.Semaphore;
import k0.h0;
import k0.u3;
import k2.C0334;
import k6.a5;
import k6.d4;
import k6.f4;
import k6.h5;
import k6.p7;
import k6.q7;
import k6.u;
import k6.x7;
import l2.l;
import m0.m;
import n7.C0364;
import o1.C0368;
import q9.C0392;
import t0.C0419;
import x4.C0469;
import x8.C0474;
import y0.o;

/* JADX INFO: renamed from: com.google.firebase.concurrent.ۣ۟ۧۨۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0136 {

    /* JADX INFO: renamed from: ۤۤۦۥ, reason: not valid java name and contains not printable characters */
    public static int f162 = -343;

    /* JADX INFO: renamed from: ۟۠ۧۧۡ, reason: not valid java name and contains not printable characters */
    public static int m2618(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۡۢۡ۠, reason: not valid java name and contains not printable characters */
    public static o m2619(Object obj) {
        if (C0474.m9210() < 0) {
            return androidx.compose.ui.draw.a.c((o) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۧۤۡ, reason: not valid java name and contains not printable characters */
    public static float m2620() {
        if (C0334.m6472() <= 0) {
            return u3.f9528e;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۢۤۦۥ, reason: not valid java name and contains not printable characters */
    public static long m2621(Object obj) {
        if (C0368.m7199() < 0) {
            return ((a5) obj).l();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۢۧ, reason: not valid java name and contains not printable characters */
    public static long m2622(int i10, int i11) {
        if (C0055.m1056() > 0) {
            return l.d(i10, i11);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۡۧ, reason: not valid java name and contains not printable characters */
    public static void m2623(Object obj, Object obj2) {
        if (C0469.m9123() <= 0) {
            ((b0) obj).k((String) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۦۥ, reason: not valid java name and contains not printable characters */
    public static void m2624(Object obj) {
        if (C0135.m2608() < 0) {
            ((Semaphore) obj).release();
        }
    }

    /* JADX INFO: renamed from: ۟ۦۣۧۦ, reason: not valid java name and contains not printable characters */
    public static AppConfig m2625(Object obj) {
        if (C0180.m3448() > 0) {
            return ((i0) obj).c();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۦۣۢ, reason: not valid java name and contains not printable characters */
    public static int m2626(Object obj) {
        if (C0039.m764() > 0) {
            return ((u) obj).f10410a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠۟ۦۧ, reason: not valid java name and contains not printable characters */
    public static int m2627() {
        return (-387) ^ C0126.f152;
    }

    /* JADX INFO: renamed from: ۠ۦۣ۠, reason: not valid java name and contains not printable characters */
    public static String m2628(String str) {
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

    /* JADX INFO: renamed from: ۡ۠ۧۡ, reason: not valid java name and contains not printable characters */
    public static long m2629(Object obj) {
        if (C0191.m3643() >= 0) {
            return ((m1) obj).f4678c;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۡۦۥۤ, reason: not valid java name and contains not printable characters */
    public static float m2630(Object obj) {
        if (C0364.m7127() <= 0) {
            return ((h0) obj).f8965c;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۡۧ۠ۨ, reason: not valid java name and contains not printable characters */
    public static p7 m2631(Object obj) {
        if (C0296.m5679() > 0) {
            return ((q7) obj).f10330a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۤۥۤ, reason: not valid java name and contains not printable characters */
    public static String m2632(Object obj) {
        if (C0060.m1148() > 0) {
            return ((y3.c) obj).f16885a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۨۧ, reason: not valid java name and contains not printable characters */
    public static boolean m2633() {
        if (C0045.m874() >= 0) {
            return zzoc.zza();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۡۦۥ, reason: contains not printable characters */
    public static f4 m2634(Object obj) {
        if (C0055.m1056() > 0) {
            return ((d4) obj).f9972n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۨۢۡ, reason: contains not printable characters */
    public static void m2635(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i10, int i11) {
        if (C0323.m6244() >= 0) {
            d9.i.a(obj, (o) obj2, (c9.c) obj3, (y0.d) obj4, (String) obj5, (c9.c) obj6, (c9.g) obj7, (m) obj8, i10, i11);
        }
    }

    /* JADX INFO: renamed from: ۦۨۨۥ, reason: contains not printable characters */
    public static o m2636(Object obj) {
        if (C0392.m7657() >= 0) {
            return ((f0.i) obj).f5742b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡۦۤ, reason: not valid java name and contains not printable characters */
    public static void m2637(Object obj, Object obj2, Object obj3) {
        if (C0175.m3346() > 0) {
            ((h5) obj).l((k6.e) obj2, (x7) obj3);
        }
    }

    /* JADX INFO: renamed from: ۨۢ۟ۨ, reason: not valid java name and contains not printable characters */
    public static long m2638() {
        if (C0290.m5580() < 0) {
            return zzne.zzak();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۨۦۤ, reason: not valid java name and contains not printable characters */
    public static String m2639() {
        if (C0081.m1735() > 0) {
            return "select count(1) from audience_filter_values where app_id=?";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۧ۠ۡ, reason: not valid java name and contains not printable characters */
    public static Object m2640(Object obj) {
        if (C0419.m8221() > 0) {
            return ((j) obj).f6277a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۡ۟, reason: not valid java name and contains not printable characters */
    public static String m2617(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
