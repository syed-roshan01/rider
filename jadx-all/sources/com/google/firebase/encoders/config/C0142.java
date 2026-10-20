package com.google.firebase.encoders.config;

import a5.g;
import a7.C0008;
import android.content.Context;
import android.net.Uri;
import androidx.compose.ui.draw.C0029;
import com.auto.accept.service.C0072;
import com.google.android.gms.common.util.C0086;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzgn;
import com.google.firebase.analytics.ktx.ktxtesting.C0120;
import d5.r1;
import dagger.hilt.android.migration.C0240;
import e0.C0257;
import e9.C0267;
import f0.t;
import f6.a;
import h8.C0315;
import i.C0317;
import i1.f;
import java.io.ByteArrayOutputStream;
import java.util.Collections;
import java.util.List;
import k0.e1;
import k0.m4;
import k0.x3;
import k6.l4;
import k6.r7;
import m0.m;
import p5.C0378;
import q5.C0386;
import r9.C0406;
import y0.o;
import z3.C0487;

/* JADX INFO: renamed from: com.google.firebase.encoders.config.ۣۧۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0142 {

    /* JADX INFO: renamed from: ۡۤۧۤ, reason: not valid java name and contains not printable characters */
    public static int f168 = -614;

    /* JADX INFO: renamed from: ۟۟ۦۧ۠, reason: not valid java name and contains not printable characters */
    public static int m2723(Object obj) {
        if (C0315.m6079() >= 0) {
            return ((x3) obj).f9656q;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟ۧۡۢ, reason: not valid java name and contains not printable characters */
    public static String m2724(String str) {
        String string = "";
        int i10 = 0;
        String str2 = "";
        while (i10 < 15) {
            string = new StringBuffer().append(string).append(Integer.toHexString(i10)).toString();
            String string2 = new StringBuffer().append(str2).append(((int) (Math.random() * ((double) 10))) ^ i10).toString();
            i10++;
            str2 = string2;
        }
        while (string.length() > 0) {
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
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۟ۢۥۤ۠, reason: not valid java name and contains not printable characters */
    public static int m2725() {
        return 869 ^ C0240.f319;
    }

    /* JADX INFO: renamed from: ۟ۢۧ۠ۡ, reason: not valid java name and contains not printable characters */
    public static Object m2726(Object obj) {
        if (C0386.m7546() > 0) {
            return ((g) obj).f1256a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۢۦ, reason: not valid java name and contains not printable characters */
    public static int m2727(Object obj) {
        if (C0086.m1846() > 0) {
            return ((t) obj).f5902c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۤۦۧ۟, reason: not valid java name and contains not printable characters */
    public static StringBuilder m2728(Object obj, Object obj2) {
        if (C0487.m9464() >= 0) {
            return ((StringBuilder) obj).append((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۥۢ, reason: not valid java name and contains not printable characters */
    public static String m2729() {
        if (C0072.m1556() > 0) {
            return "Failed to insert column (got -1). appId";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟۟ۡ, reason: not valid java name and contains not printable characters */
    public static Uri m2730(Object obj) {
        if (C0406.m7952() < 0) {
            return Uri.parse((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۡۧۤ, reason: not valid java name and contains not printable characters */
    public static void m2732(Object obj) {
        if (C0267.m5099() < 0) {
            zzgn.zzb((Context) obj);
        }
    }

    /* JADX INFO: renamed from: ۣۢ۟ۤ, reason: not valid java name and contains not printable characters */
    public static long m2733(Object obj) {
        if (C0086.m1846() > 0) {
            return ((m4) obj).f9242v;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۢۨۤ, reason: not valid java name and contains not printable characters */
    public static int m2734(Object obj) {
        if (C0317.m6120() < 0) {
            return ((r1) obj).f4756e;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۥۡ۟, reason: contains not printable characters */
    public static long m2735(Object obj) {
        if (C0257.m4901() < 0) {
            return ((l4) obj).f10176i;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۥۥۨ۟, reason: contains not printable characters */
    public static void m2736(Object obj, Object obj2, Object obj3, long j10, Object obj4, int i10, int i11) {
        if (C0120.m2311() <= 0) {
            e1.b((f) obj, (String) obj2, (o) obj3, j10, (m) obj4, i10, i11);
        }
    }

    /* JADX INFO: renamed from: ۦۦۢۨ, reason: contains not printable characters */
    public static int m2737(Object obj, Object obj2) {
        if (C0378.m7389() > 0) {
            return r7.s((zzfi.zzj.zza) obj, (String) obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۦ۟ۤ, reason: not valid java name and contains not printable characters */
    public static f m2738() {
        if (C0029.m568() < 0) {
            return a.f6360i;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥۢ, reason: not valid java name and contains not printable characters */
    public static void m2739(Object obj) {
        if (C0008.m169() <= 0) {
            Collections.sort((List) obj);
        }
    }

    /* JADX INFO: renamed from: ۨۧۧۦ, reason: not valid java name and contains not printable characters */
    public static int m2740(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۡ۠۟ۦ, reason: not valid java name and contains not printable characters */
    public static String m2731(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
