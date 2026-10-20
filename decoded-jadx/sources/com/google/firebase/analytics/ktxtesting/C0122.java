package com.google.firebase.analytics.ktxtesting;

import a2.m;
import androidx.compose.ui.draw.C0028;
import c9.e;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.firebase.annotations.concurrent.C0125;
import com.google.firebase.annotations.concurrent.C0126;
import com.google.firebase.auth.ktx.C0133;
import com.google.firebase.inject.C0172;
import com.google.firebase.messaging.reporting.C0187;
import d5.k0;
import dagger.hilt.android.components.C0229;
import e1.l0;
import f0.c;
import f4.C0275;
import f6.C0278;
import h1.C0300;
import java.io.ByteArrayOutputStream;
import java.util.AbstractCollection;
import k0.f1;
import k0.f3;
import k0.r2;
import k6.a5;
import k6.t7;
import m0.l3;
import r8.p;
import s0.C0410;
import w5.C0462;
import w5.C0463;
import x8.C0473;

/* JADX INFO: renamed from: com.google.firebase.analytics.ktxtesting.ۦۣۤ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0122 {

    /* JADX INFO: renamed from: ۟ۢ۠ۨ۠, reason: not valid java name and contains not printable characters */
    public static int f148 = -56;

    /* JADX INFO: renamed from: ۟۟ۤ۠ۤ, reason: not valid java name and contains not printable characters */
    public static Object m2343(Object obj) {
        if (C0275.m5308() >= 0) {
            return ((t7) obj).e();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠۠۟, reason: not valid java name and contains not printable characters */
    public static e m2344(Object obj) {
        if (C0473.m9210() <= 0) {
            return ((f3) obj).f8925a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۡۥۡ, reason: not valid java name and contains not printable characters */
    public static boolean m2345(Object obj) {
        if (C0133.m2559() >= 0) {
            return ((zzfc.zzc.zza) obj).zzf();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۦۦۡ, reason: not valid java name and contains not printable characters */
    public static l3 m2346(Object obj) {
        if (C0125.m2408() >= 0) {
            return ((k0) obj).f4607q;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۡ, reason: not valid java name and contains not printable characters */
    public static f1 m2347() {
        if (C0300.m5773() < 0) {
            return f1.f8913a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۣۥ, reason: not valid java name and contains not printable characters */
    public static int m2348(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۥۡۢۧ, reason: not valid java name and contains not printable characters */
    public static int m2350(Object obj, int i10) {
        if (C0028.m557() > 0) {
            return ((m) obj).a(i10);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡ۟ۦۢ, reason: not valid java name and contains not printable characters */
    public static void m2351(Object obj, long j10) {
        if (C0410.m8063() >= 0) {
            ((a5) obj).D(j10);
        }
    }

    /* JADX INFO: renamed from: ۢۤ۟ۤ, reason: not valid java name and contains not printable characters */
    public static l0 m2352(int i10, Object obj) {
        if (C0278.m5394() > 0) {
            return r2.a(i10, (m0.m) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦ۠۠, reason: not valid java name and contains not printable characters */
    public static Object m2353(Object obj) {
        if (C0463.m9033() >= 0) {
            return p.E0((Iterable) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۨۧۡ, reason: not valid java name and contains not printable characters */
    public static String m2354(String str) {
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
        for (int i12 = 0; i12 < length; i12++) {
            byteArray[i12] = (byte) (byteArray[i12] ^ str2.charAt(i12 % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۥۣۡۡ, reason: contains not printable characters */
    public static int m2355() {
        return 1005 ^ C0172.f196;
    }

    /* JADX INFO: renamed from: ۥۥۧۨ, reason: contains not printable characters */
    public static boolean m2356(Object obj) {
        if (C0229.m4421() < 0) {
            return ((AbstractCollection) obj).isEmpty();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۧۦۢ, reason: not valid java name and contains not printable characters */
    public static long m2357(Object obj) {
        if (C0126.m2434() >= 0) {
            return ((c) obj).f5624b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۧۥۣ, reason: not valid java name and contains not printable characters */
    public static String m2358(Object obj) {
        if (C0187.m3565() >= 0) {
            return ((k6.e) obj).f9992f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦۥۥ, reason: not valid java name and contains not printable characters */
    public static void m2359(Object obj, long j10) {
        if (C0462.m9013() < 0) {
            ((MainViewModel) obj).t(j10);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۡ۟۠, reason: not valid java name and contains not printable characters */
    public static String m2349(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
