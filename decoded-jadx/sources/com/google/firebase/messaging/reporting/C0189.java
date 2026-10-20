package com.google.firebase.messaging.reporting;

import a2.C0005;
import a2.c0;
import a7.C0008;
import aa.C0011;
import android.view.View;
import androidx.compose.ui.semantics.C0039;
import androidx.preference.C0044;
import c7.C0068;
import c9.e;
import com.google.android.gms.internal.measurement.zzew;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.concurrent.C0137;
import com.google.firebase.installations.local.C0176;
import d5.p1;
import d5.q1;
import d7.a;
import d9.C0226;
import dagger.hilt.components.C0244;
import f0.b;
import f0.f2;
import f4.C0276;
import g1.k;
import h6.g;
import i7.h1;
import i7.i1;
import j2.C0324;
import j3.C0325;
import java.io.ByteArrayOutputStream;
import k.f;
import k0.l2;
import k0.v4;
import k0.w3;
import k6.a5;
import k6.o;
import k6.p7;
import k6.s5;
import l0.c;
import l0.u;
import m0.q;
import r6.C0401;
import s0.C0409;
import s8.C0416;
import t0.C0418;
import t1.C0419;
import u.C0429;
import u.w;
import w4.C0460;
import w5.C0462;
import y.t0;
import z7.C0488;

/* JADX INFO: renamed from: com.google.firebase.messaging.reporting.ۥۡ۠ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0189 {

    /* JADX INFO: renamed from: ۣ۟۠ۨ۟, reason: not valid java name and contains not printable characters */
    public static int f213 = -736;

    /* JADX INFO: renamed from: ۟۠ۥ۠ۢ, reason: not valid java name and contains not printable characters */
    public static View m3598(Object obj, int i10) {
        if (C0044.m860() > 0) {
            return ((View) obj).findViewById(i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۡۡ, reason: not valid java name and contains not printable characters */
    public static void m3599(Object obj, long j10) {
        if (C0039.m764() >= 0) {
            ((a5) obj).F(j10);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۢۨۥ, reason: not valid java name and contains not printable characters */
    public static int m3600(Object obj) {
        if (m3621() >= 0) {
            return ((q1) obj).f4739a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۢۥۦ, reason: not valid java name and contains not printable characters */
    public static FirebaseUser m3601(Object obj) {
        if (C0401.m7881() <= 0) {
            return ((AuthResult) obj).getUser();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۤۢۧ, reason: not valid java name and contains not printable characters */
    public static String m3602(String str) {
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

    /* JADX INFO: renamed from: ۟ۤۧۦۨ, reason: not valid java name and contains not printable characters */
    public static boolean m3603(Object obj) {
        if (C0226.m4372() <= 0) {
            return ((zzew.zzd) obj).zzj();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۣۤۥ, reason: not valid java name and contains not printable characters */
    public static void m3604(Object obj, Object obj2) {
        if (C0176.m3367() < 0) {
            i1.y((i1) obj, (h1) obj2);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۥۡ۟, reason: not valid java name and contains not printable characters */
    public static o m3605(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C0324.m6278() < 0) {
            return ((p7) obj).c((String) obj2, (o) obj3, (s5) obj4, (f) obj5);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۧۤۡ, reason: not valid java name and contains not printable characters */
    public static t0 m3606(Object obj) {
        if (C0429.m8415() >= 0) {
            return ((v4) obj).f9579t;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۧۡ, reason: not valid java name and contains not printable characters */
    public static void m3607(Object obj) {
        if (C0005.m104() > 0) {
            ((q) obj).w();
        }
    }

    /* JADX INFO: renamed from: ۟ۧۧۤ۠, reason: not valid java name and contains not printable characters */
    public static void m3608(Object obj) {
        if (C0462.m9013() <= 0) {
            a.j(obj);
        }
    }

    /* JADX INFO: renamed from: ۠ۤۤ, reason: not valid java name and contains not printable characters */
    public static e m3609(Object obj) {
        if (C0276.m5315() <= 0) {
            return ((l2) obj).f9175e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۤۧۤ, reason: not valid java name and contains not printable characters */
    public static u.i1 m3610(Object obj) {
        if (C0244.m4685() > 0) {
            return ((w3) obj).f9615d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۠۟۟, reason: not valid java name and contains not printable characters */
    public static y0.o m3611(Object obj) {
        if (C0419.m8247() >= 0) {
            return ((b) obj).f5606b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦۥ۟, reason: not valid java name and contains not printable characters */
    public static i1.f m3612() {
        if (C0409.m8037() < 0) {
            return g.f7586i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦۨۥ, reason: not valid java name and contains not printable characters */
    public static Object m3613(Object obj, Object obj2) {
        if (C0460.m8972() >= 0) {
            return ((a5.a) obj).invokeSuspend(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢ۟ۦ, reason: not valid java name and contains not printable characters */
    public static String m3614(Object obj, int i10, Object obj2, int i11) {
        if (C0068.m1322() > 0) {
            return l.q.i((String) obj, i10, (String) obj2, i11);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡ۠۠, reason: not valid java name and contains not printable characters */
    public static String m3615(Object obj) {
        if (C0488.m9505() > 0) {
            return ((p1) obj).f4721c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡۨۢ, reason: not valid java name and contains not printable characters */
    public static c0 m3616() {
        if (C0416.m8173() <= 0) {
            return u.f11187l;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۤۨۡ, reason: not valid java name and contains not printable characters */
    public static float m3617(Object obj) {
        if (C0011.m208() <= 0) {
            return ((k) obj).f6503a;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۤۦۣ, reason: not valid java name and contains not printable characters */
    public static float m3618(Object obj) {
        if (C0137.m2646() <= 0) {
            return ((w) obj).f14967a;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۥۣۤۨ, reason: contains not printable characters */
    public static int m3619(Object obj) {
        if (C0418.m8221() >= 0) {
            return ((f2) obj).f5703c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۤ۟ۦ, reason: contains not printable characters */
    public static int m3621() {
        return (-11) ^ C0008.f28;
    }

    /* JADX INFO: renamed from: ۣۧۤ۟, reason: not valid java name and contains not printable characters */
    public static long m3622() {
        if (C0325.m6295() >= 0) {
            return c.f11030v;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۨۤ۠, reason: not valid java name and contains not printable characters */
    public static int m3623(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۥۨۡۥ, reason: contains not printable characters */
    public static String m3620(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
