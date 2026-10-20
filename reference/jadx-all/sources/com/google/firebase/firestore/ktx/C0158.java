package com.google.firebase.firestore.ktx;

import a8.C0009;
import android.os.BaseBundle;
import androidx.compose.ui.graphics.C0031;
import c5.c;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.android.gms.internal.measurement.zzne;
import com.google.firebase.firestore.core.C0152;
import com.google.firebase.inject.C0172;
import com.google.firebase.messaging.ktx.C0186;
import com.google.gson.internal.sql.C0208;
import d5.e;
import d5.o1;
import d5.r0;
import dagger.hilt.android.internal.earlyentrypoint.C0231;
import dagger.hilt.internal.processedrootsentinel.C0252;
import e2.C0262;
import ea.C0268;
import f0.c2;
import f0.w;
import f4.C0275;
import i1.f;
import java.io.ByteArrayOutputStream;
import k0.l4;
import k0.n1;
import k6.k5;
import k6.m6;
import k6.n6;
import k6.q;
import k6.q6;
import k6.u7;
import k6.w3;
import m0.g1;
import m0.m;
import m4.C0354;
import p9.z;
import q6.C0387;
import q7.C0390;
import r6.C0402;
import s0.C0410;
import s8.C0418;
import u0.b;
import u3.C0435;
import y0.o;
import z1.C0484;

/* JADX INFO: renamed from: com.google.firebase.firestore.ktx.ۢ۠ۢۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0158 {

    /* JADX INFO: renamed from: ۟ۡ۠ۤۧ, reason: not valid java name and contains not printable characters */
    public static int f182 = 418;

    /* JADX INFO: renamed from: ۟۟ۡۥۥ, reason: not valid java name and contains not printable characters */
    public static b m3003() {
        if (C0172.m3296() > 0) {
            return c.f2976h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۦۨۤ, reason: not valid java name and contains not printable characters */
    public static String m3004(String str) {
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

    /* JADX INFO: renamed from: ۣ۟۠ۤۥ, reason: not valid java name and contains not printable characters */
    public static int m3005(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۡۡۨۢ, reason: not valid java name and contains not printable characters */
    public static long m3006() {
        if (C0186.m3548() < 0) {
            return zzne.zzu();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۦۣ, reason: not valid java name and contains not printable characters */
    public static l4 m3007() {
        if (C0157.m2999() >= 0) {
            return l4.f9186a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۢۡۥ, reason: not valid java name and contains not printable characters */
    public static long m3008(Object obj, Object obj2) {
        if (C0152.m2931() >= 0) {
            return ((BaseBundle) obj).getLong((String) obj2);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۡۥ, reason: not valid java name and contains not printable characters */
    public static String m3009() {
        if (C0435.m8498() < 0) {
            return "Waiting for Payment";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static void m3010(Object obj, Object obj2, Object obj3, long j10, Object obj4, Object obj5, int i10, int i11) {
        if (C0252.m4811() <= 0) {
            o1.m((f) obj, (String) obj2, (String) obj3, j10, (o) obj4, (m) obj5, i10, i11);
        }
    }

    /* JADX INFO: renamed from: ۡۥۨۤ, reason: not valid java name and contains not printable characters */
    public static z m3011(Object obj) {
        if (C0354.m6940() < 0) {
            return ((MainViewModel) obj).B;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۥۧ, reason: not valid java name and contains not printable characters */
    public static int m3012() {
        return 894 ^ C0418.f688;
    }

    /* JADX INFO: renamed from: ۢۥۢۤ, reason: not valid java name and contains not printable characters */
    public static Object m3013(Object obj) {
        if (C0402.m7881() <= 0) {
            return ((s0.b) obj).f13900b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۤ, reason: contains not printable characters */
    public static long m3015() {
        if (C0387.m7564() >= 0) {
            return d1.f.f4345c;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۥۣۡۥ, reason: contains not printable characters */
    public static int m3016(Object obj) {
        if (C0390.m7627() <= 0) {
            return ((r0) obj).f4750a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۣۣ۟, reason: contains not printable characters */
    public static n6 m3017(Object obj) {
        if (C0275.m5286() < 0) {
            return ((m6) obj).f10208a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۥۡۨ, reason: contains not printable characters */
    public static void m3018(Object obj, long j10, Object obj2) {
        if (C0268.m5113() <= 0) {
            ((q) obj).t(j10, (q6) obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۨ۠ۢ, reason: contains not printable characters */
    public static Object m3019(Object obj) {
        if (C0208.m3984() < 0) {
            return ((w3) obj).zza();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۨۨ, reason: contains not printable characters */
    public static boolean m3020(Object obj, Object obj2) {
        if (C0410.m8037() <= 0) {
            return ((u7) obj).m0((String) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۣۥۥ, reason: contains not printable characters */
    public static zzfc.zzd.zza m3021() {
        if (C0484.m9403() >= 0) {
            return zzfc.zzd.zze();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢۨۤ, reason: not valid java name and contains not printable characters */
    public static String m3022(Object obj) {
        if (C0262.m4991() >= 0) {
            return ((k5) obj).f10157d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥۣۥ, reason: not valid java name and contains not printable characters */
    public static g1 m3023(Object obj) {
        if (C0231.m4440() > 0) {
            return ((e) obj).f4461e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ۟ۡۢ, reason: not valid java name and contains not printable characters */
    public static boolean m3024(Object obj) {
        if (C0031.m598() >= 0) {
            return ((n1) obj).f9256f;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨۢۥۢ, reason: not valid java name and contains not printable characters */
    public static c2 m3025(Object obj) {
        if (C0009.m177() >= 0) {
            return ((w) obj).f5983d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۥۨ, reason: not valid java name and contains not printable characters */
    public static String m3014(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
