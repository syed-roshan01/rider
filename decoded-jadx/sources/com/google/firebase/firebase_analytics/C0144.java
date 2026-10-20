package com.google.firebase.firebase_analytics;

import androidx.compose.ui.platform.C0038;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.firebase.components.C0134;
import com.google.firebase.emulators.C0141;
import com.google.firebase.remoteconfig.interop.C0196;
import com.google.firebase.remoteconfiginterop.C0203;
import com.google.gson.internal.bind.C0206;
import com.google.protobuf.C0209;
import d5.l0;
import dagger.hilt.migration.C0254;
import e2.C0263;
import f0.j1;
import g2.a0;
import h0.v0;
import java.io.ByteArrayOutputStream;
import k0.b0;
import k0.t4;
import k6.b7;
import k6.k;
import k6.k4;
import m0.g1;
import u8.e;
import w4.C0460;
import x4.C0468;

/* JADX INFO: renamed from: com.google.firebase.firebase_analytics.ۦۡۢۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0144 {

    /* JADX INFO: renamed from: ۟ۤۤۨۤ, reason: not valid java name and contains not printable characters */
    public static int f170 = -141;

    /* JADX INFO: renamed from: ۣ۟۠۟ۨ, reason: not valid java name and contains not printable characters */
    public static e m2757(Object obj, Object obj2, Object obj3) {
        if (C0263.m5033() <= 0) {
            return ((b0) obj).create(obj2, (e) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۨۨۥ, reason: not valid java name and contains not printable characters */
    public static a0 m2758(Object obj) {
        if (C0254.m4866() < 0) {
            return ((v0) obj).f7489r;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۦۣ, reason: not valid java name and contains not printable characters */
    public static String m2759() {
        if (C0209.m4013() > 0) {
            return "event_filters";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۦۣ۠, reason: not valid java name and contains not printable characters */
    public static int m2761(Object obj) {
        if (C0460.m8972() > 0) {
            return ((j1) obj).f5802f;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۢ۠ۥ, reason: not valid java name and contains not printable characters */
    public static void m2762(Object obj) {
        if (C0196.m3762() <= 0) {
            ((k4) obj).a();
        }
    }

    /* JADX INFO: renamed from: ۟ۦۦۡۡ, reason: not valid java name and contains not printable characters */
    public static String[] m2763() {
        if (C0206.m3931() >= 0) {
            return k.f10135f;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۦۧ, reason: not valid java name and contains not printable characters */
    public static long m2764(Object obj) {
        if (C0134.m2587() <= 0) {
            return ((b7) obj).f9920c;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۠ۧۥ۠, reason: not valid java name and contains not printable characters */
    public static int m2765(Object obj) {
        if (C0141.m2714() < 0) {
            return ((t4) obj).f9504d;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢۦۥ۠, reason: not valid java name and contains not printable characters */
    public static String m2766(String str) {
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

    /* JADX INFO: renamed from: ۣۣۧۨ, reason: not valid java name and contains not printable characters */
    public static int m2767() {
        return (-884) ^ C0203.f227;
    }

    /* JADX INFO: renamed from: ۦۨۥ, reason: contains not printable characters */
    public static boolean m2768(Object obj) {
        if (C0468.m9123() < 0) {
            return ((zzfi.zzj) obj).zzbs();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۧ۟ۥ, reason: not valid java name and contains not printable characters */
    public static String m2769(Object obj) {
        if (C0038.m750() < 0) {
            return l0.b((g1) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۤۦۤ, reason: not valid java name and contains not printable characters */
    public static int m2770(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۣ۟ۦۡ, reason: not valid java name and contains not printable characters */
    public static String m2760(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
