package com.google.firebase.dynamicloading;

import a2.i;
import android.graphics.Rect;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.firebase.platforminfo.C0193;
import d7.C0219;
import d7.C0220;
import d9.C0226;
import ja.C0330;
import java.io.ByteArrayOutputStream;
import java.math.BigDecimal;
import k0.h0;
import k0.t0;
import k7.C0337;
import m0.l2;
import m0.m;
import o4.C0369;
import p0.C0373;
import rikka.shizuku.C0406;
import y3.e;
import z7.C0488;

/* JADX INFO: renamed from: com.google.firebase.dynamicloading.ۣ۟۠ۨۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0139 {

    /* JADX INFO: renamed from: ۣ۟ۦۦۦ, reason: not valid java name and contains not printable characters */
    public static int f165 = 642;

    /* JADX INFO: renamed from: ۟۠ۥۣۤ, reason: not valid java name and contains not printable characters */
    public static boolean m2680(Object obj) {
        if (C0219.m4237() > 0) {
            return ((zzfi.zze) obj).zzk();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۤۢ, reason: not valid java name and contains not printable characters */
    public static l2 m2681(Object obj) {
        if (C0373.m7322() <= 0) {
            return l2.a((m) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۡۨۡ, reason: not valid java name and contains not printable characters */
    public static zzew.zzd.zzb m2682() {
        if (C0226.m4372() < 0) {
            return zzew.zzd.zzb.UNKNOWN_COMPARISON_TYPE;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۧۡ, reason: not valid java name and contains not printable characters */
    public static int m2683(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۤۦ۠, reason: not valid java name and contains not printable characters */
    public static int m2684() {
        return (-548) ^ C0337.f608;
    }

    /* JADX INFO: renamed from: ۟ۦۣۤ۟, reason: not valid java name and contains not printable characters */
    public static byte[] m2685() {
        if (C0330.m6374() > 0) {
            return e.f16900g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۧۡ, reason: not valid java name and contains not printable characters */
    public static String m2686(String str) {
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

    /* JADX INFO: renamed from: ۣۢۨۡ, reason: not valid java name and contains not printable characters */
    public static boolean m2687(int i10, int i11) {
        if (C0406.m7977() < 0) {
            return t0.g(i10, i11);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۡۥۨ, reason: not valid java name and contains not printable characters */
    public static float m2688(Object obj) {
        if (C0220.m4261() >= 0) {
            return ((i) obj).f935d;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۥۣۢۨ, reason: contains not printable characters */
    public static float m2689(Object obj) {
        if (C0193.m3691() <= 0) {
            return ((h0) obj).f8964b;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۥۤۨۧ, reason: contains not printable characters */
    public static int m2690(Object obj) {
        if (C0369.m7254() > 0) {
            return ((Rect) obj).left;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۧۦ۠, reason: contains not printable characters */
    public static int m2691(Object obj, Object obj2) {
        if (C0488.m9505() >= 0) {
            return ((BigDecimal) obj).compareTo((BigDecimal) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨ۟ۨۡ, reason: not valid java name and contains not printable characters */
    public static String m2692(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
