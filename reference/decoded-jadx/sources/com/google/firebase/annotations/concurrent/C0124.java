package com.google.firebase.annotations.concurrent;

import a2.k;
import androidx.annotation.C0018;
import ca.C0070;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.common.api.internal.C0083;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.stats.C0100;
import com.google.firebase.analytics.connector.C0116;
import com.google.firebase.analytics.ktx.ktxtesting.C0120;
import com.google.firebase.messaging.reporting.C0187;
import d5.g;
import d5.o1;
import dagger.hilt.android.C0240;
import dagger.hilt.android.components.C0229;
import f0.e0;
import f0.x1;
import g2.o;
import g5.c;
import h0.C0299;
import java.io.ByteArrayOutputStream;
import k0.b1;
import k0.q;
import k6.s6;
import k6.y3;
import m0.j0;
import m0.m;
import m1.C0351;
import p4.C0376;
import p9.z;
import s6.C0413;
import t9.C0427;
import u1.C0432;
import y0.a;
import y0.e;
import y1.r;
import y1.u;
import y6.C0476;

/* JADX INFO: renamed from: com.google.firebase.annotations.concurrent.ۣ۟ۧۥۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0124 {

    /* JADX INFO: renamed from: ۤۥۤ, reason: not valid java name and contains not printable characters */
    public static int f150 = -110;

    /* JADX INFO: renamed from: ۟۟۟۠ۦ, reason: not valid java name and contains not printable characters */
    public static int m2383(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۡۥۣۡ, reason: not valid java name and contains not printable characters */
    public static e m2385() {
        if (C0432.m8470() >= 0) {
            return a.f16717q;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦ, reason: not valid java name and contains not printable characters */
    public static int m2386() {
        return (-823) ^ f150;
    }

    /* JADX INFO: renamed from: ۟ۥۣۤ۠, reason: not valid java name and contains not printable characters */
    public static y3 m2387(Object obj) {
        if (C0187.m3565() > 0) {
            return ((s6) obj).f10358d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۤۢ۠, reason: not valid java name and contains not printable characters */
    public static String m2388() {
        if (C0413.m8107() < 0) {
            return "Malayalam";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥۣۤ, reason: not valid java name and contains not printable characters */
    public static boolean m2389(Object obj) {
        if (C0116.m2247() >= 0) {
            return ((zzfi.zzj) obj).zzav();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۠ۧۢ, reason: not valid java name and contains not printable characters */
    public static boolean m2390(Object obj) {
        if (C0070.m1363() > 0) {
            return ((k) obj).b();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۧۤۡ, reason: not valid java name and contains not printable characters */
    public static j0 m2391(Object obj) {
        if (C0351.m6885() > 0) {
            return ((x1) obj).f6001c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢۧۥ, reason: not valid java name and contains not printable characters */
    public static long m2392(Object obj) {
        if (C0018.m354() >= 0) {
            return ((b1) obj).f8730c;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۡۤۥۦ, reason: not valid java name and contains not printable characters */
    public static String m2393() {
        if (C0229.m4421() <= 0) {
            return "grant_shizuku_btn";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦ۠ۤ, reason: not valid java name and contains not printable characters */
    public static z m2394(Object obj) {
        if (C0120.m2311() <= 0) {
            return ((MainViewModel) obj).f3113r0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢ۠۠, reason: not valid java name and contains not printable characters */
    public static c9.e m2395(Object obj) {
        if (C0476.m9298() <= 0) {
            return ((g) obj).f4499e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۢۡ۠, reason: not valid java name and contains not printable characters */
    public static c m2396() {
        if (C0376.m7371() >= 0) {
            return c.f6621d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣۧۨ, reason: contains not printable characters */
    public static String m2397(String str) {
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

    /* JADX INFO: renamed from: ۥۤ۟۠, reason: contains not printable characters */
    public static void m2398(Object obj, Object obj2, Object obj3, int i10) {
        if (C0299.m5752() < 0) {
            o1.h((String) obj, (String) obj2, (m) obj3, i10);
        }
    }

    /* JADX INFO: renamed from: ۣۧ۠۟, reason: not valid java name and contains not printable characters */
    public static o m2399(Object obj) {
        if (C0240.m4609() >= 0) {
            return ((e0) obj).f5678e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۟ۦۥ, reason: not valid java name and contains not printable characters */
    public static u m2400() {
        if (C0427.m8371() <= 0) {
            return r.f16839x;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۨۢ, reason: not valid java name and contains not printable characters */
    public static long m2401(Object obj) {
        if (C0083.m1779() >= 0) {
            return ((g1.g) obj).e();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۨۤۧۤ, reason: not valid java name and contains not printable characters */
    public static y0.o m2402(Object obj) {
        if (C0100.m1959() <= 0) {
            return ((q) obj).f9362a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۤۨۧ, reason: not valid java name and contains not printable characters */
    public static String m2384(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
