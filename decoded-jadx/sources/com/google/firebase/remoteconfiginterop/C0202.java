package com.google.firebase.remoteconfiginterop;

import a.C0000;
import a2.C0004;
import android.content.SharedPreferences;
import b.C0049;
import b8.C0055;
import com.google.android.gms.internal.measurement.zzcm;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.p000authapiphone.C0090;
import com.google.firebase.analytics.connector.internal.C0115;
import com.google.firebase.firestore.ktx.C0157;
import d5.y0;
import d7.C0220;
import dagger.hilt.internal.aggregatedroot.C0246;
import dagger.hilt.internal.componenttreedeps.C0248;
import e1.C0257;
import e1.C0259;
import g2.C0286;
import g8.C0293;
import g9.C0294;
import ga.C0295;
import h6.g;
import i1.f;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.List;
import k0.d2;
import k0.g3;
import k0.i0;
import k0.o2;
import k0.u1;
import k0.u4;
import k6.t4;
import k6.x7;
import o1.s;
import s.C0407;
import t7.C0425;
import w0.i;
import w0.p;
import z4.d;

/* JADX INFO: renamed from: com.google.firebase.remoteconfiginterop.۟ۤۢۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0202 {

    /* JADX INFO: renamed from: ۣۣۤۤ, reason: not valid java name and contains not printable characters */
    public static int f226 = -421;

    /* JADX INFO: renamed from: ۟۟ۨ۠ۥ, reason: not valid java name and contains not printable characters */
    public static int m3868() {
        return (-14) ^ C0115.f141;
    }

    /* JADX INFO: renamed from: ۟۟ۨۨۧ, reason: not valid java name and contains not printable characters */
    public static List m3869(Object obj) {
        if (C0004.m76() < 0) {
            return ((zzfi.zzj) obj).zzao();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤۥۧ, reason: not valid java name and contains not printable characters */
    public static int m3870(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۦ۟, reason: not valid java name and contains not printable characters */
    public static float m3871(Object obj) {
        if (C0425.m8351() < 0) {
            return ((u1) obj).f9519c;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۢۦۣۨ, reason: not valid java name and contains not printable characters */
    public static float m3872() {
        if (C0407.m7989() > 0) {
            return u4.f9534e;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۢ۟, reason: not valid java name and contains not printable characters */
    public static Runnable m3873(Object obj, Object obj2) {
        if (C0294.m5663() >= 0) {
            return ((zzcm) obj).zza((Runnable) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢ۠ۧ, reason: not valid java name and contains not printable characters */
    public static SharedPreferences m3874(Object obj) {
        if (C0157.m2999() >= 0) {
            return ((d) obj).f17209c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠۟ۥ, reason: not valid java name and contains not printable characters */
    public static long m3875(Object obj) {
        if (C0220.m4261() >= 0) {
            return ((x7) obj).f10547e;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۠ۨۥ, reason: not valid java name and contains not printable characters */
    public static long m3876(Object obj) {
        if (C0248.m4762() > 0) {
            return ((g3) obj).f8951n;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۡۦۡ, reason: not valid java name and contains not printable characters */
    public static f m3877() {
        if (C0257.m4918() > 0) {
            return g.f7592o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۡۤ, reason: not valid java name and contains not printable characters */
    public static Object m3878(Object obj) {
        if (C0246.m4717() < 0) {
            return ((d2) obj).f8835p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦ۟, reason: not valid java name and contains not printable characters */
    public static long m3879(Object obj) {
        if (C0090.m1920() >= 0) {
            return ((i0) obj).f9003g;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۥ۠ۡۧ, reason: contains not printable characters */
    public static zzew.zze.zza m3880() {
        if (C0000.m12() < 0) {
            return zzew.zze.zzc();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤ۠ۧ, reason: contains not printable characters */
    public static String m3881(String str) {
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

    /* JADX INFO: renamed from: ۦۧۡ۟, reason: contains not printable characters */
    public static byte[] m3882(Object obj, int i10) {
        if (C0286.m5522() > 0) {
            return s.d0((InputStream) obj, i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۨۢۨ, reason: contains not printable characters */
    public static q.f m3883(Object obj) {
        if (C0049.m945() >= 0) {
            return ((t4) obj).f10390n;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۢۨ۟, reason: not valid java name and contains not printable characters */
    public static i m3884() {
        if (C0055.m1056() > 0) {
            return p.i();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۥۧ۟, reason: not valid java name and contains not printable characters */
    public static int m3885(Object obj) {
        if (C0293.m5656() >= 0) {
            return ((y0) obj).f4864n;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۦۨۤ, reason: not valid java name and contains not printable characters */
    public static o2 m3886() {
        if (C0295.m5679() > 0) {
            return o2.f9308b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۧۤۥ, reason: not valid java name and contains not printable characters */
    public static String m3887(Object obj) {
        if (C0259.m4959() <= 0) {
            return ((zzfc.zzd) obj).zzi();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۡۢۢ, reason: not valid java name and contains not printable characters */
    public static String m3867(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
