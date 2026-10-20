package com.google.firebase.analytics.connector.internal;

import a2.z;
import a6.C0007;
import android.support.v4.app.C0014;
import b4.C0052;
import c9.a;
import c9.e;
import ca.C0070;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.play.core.integrity.client.C0108;
import com.google.android.play.core.integrity.model.C0109;
import com.google.firebase.analytics.ktx.ktxtesting.C0120;
import com.google.firebase.appcheck.interop.C0129;
import com.google.firebase.components.C0135;
import com.google.firebase.emulators.C0140;
import com.google.firebase.firestore.ktx.C0158;
import com.google.firebase.firestore.remote.C0164;
import com.google.firebase.iid.C0171;
import com.google.firebase.installations.local.C0176;
import com.google.firebase.platforminfo.C0193;
import d5.i0;
import d5.j;
import e0.C0256;
import f0.c2;
import f0.r1;
import f5.c0;
import f5.u;
import f5.v;
import i7.h1;
import i7.t1;
import java.io.ByteArrayOutputStream;
import java.net.URL;
import java.net.URLConnection;
import k0.k1;
import k0.w;
import k0.w4;
import k0.y3;
import k6.x;
import k6.x3;
import m2.b;
import r1.x0;
import u4.C0435;
import w6.C0464;
import x.l;
import y0.o;

/* JADX INFO: renamed from: com.google.firebase.analytics.connector.internal.۟ۦ۟۠ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0114 {

    /* JADX INFO: renamed from: ۥۧۥۢ, reason: contains not printable characters */
    public static int f140 = -296;

    /* JADX INFO: renamed from: ۣ۟۠۠ۥ, reason: not valid java name and contains not printable characters */
    public static Object m2195(Object obj, Object obj2) {
        if (C0171.m3272() < 0) {
            return ((c0) obj).invokeSuspend(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦۨۧ, reason: not valid java name and contains not printable characters */
    public static String m2196() {
        if (C0070.m1363() >= 0) {
            return "select_language";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۦۧ, reason: not valid java name and contains not printable characters */
    public static c2 m2197(Object obj) {
        if (C0129.m2492() > 0) {
            return ((r1) obj).f5873a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۦۢ, reason: not valid java name and contains not printable characters */
    public static e m2198(Object obj) {
        if (C0435.m8516() > 0) {
            return ((y3) obj).f9674b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۦۣ, reason: not valid java name and contains not printable characters */
    public static l m2199(Object obj) {
        if (C0135.m2608() < 0) {
            return ((k1) obj).f9096d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤۥۧ, reason: not valid java name and contains not printable characters */
    public static int m2200(Object obj) {
        if (C0014.m269() <= 0) {
            return ((u) obj).f6330b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۦ۟۠, reason: not valid java name and contains not printable characters */
    public static int m2201(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۧۧۢۤ, reason: not valid java name and contains not printable characters */
    public static o m2202(Object obj) {
        if (C0108.m2101() < 0) {
            return ((w) obj).f9582a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۢۡ, reason: not valid java name and contains not printable characters */
    public static void m2203(Object obj, Object obj2) {
        if (C0464.m9059() < 0) {
            h1.y((h1) obj, (t1) obj2);
        }
    }

    /* JADX INFO: renamed from: ۠ۤۤ, reason: not valid java name and contains not printable characters */
    public static u8.e m2204(Object obj, Object obj2, Object obj3) {
        if (C0052.m1013() >= 0) {
            return ((v) obj).create(obj2, (u8.e) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢۤۢ, reason: not valid java name and contains not printable characters */
    public static int m2205() {
        return 206 ^ C0135.f161;
    }

    /* JADX INFO: renamed from: ۢ۠۠ۤ, reason: not valid java name and contains not printable characters */
    public static x3 m2206() {
        if (C0120.m2311() < 0) {
            return x.f10483f0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۠ۨۥ, reason: not valid java name and contains not printable characters */
    public static String m2207() {
        if (C0164.m3153() >= 0) {
            return "Apps";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۢۦ, reason: not valid java name and contains not printable characters */
    public static String m2208(String str) {
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

    /* JADX INFO: renamed from: ۤۤۦۨ, reason: not valid java name and contains not printable characters */
    public static float m2209(Object obj, float f10) {
        if (C0256.m4901() < 0) {
            return ((b) obj).v(f10);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۥ۠ۤۡ, reason: contains not printable characters */
    public static a m2210(Object obj) {
        if (C0193.m3691() <= 0) {
            return ((j) obj).f4582b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢۢ۠, reason: contains not printable characters */
    public static x0 m2212(Object obj) {
        if (C0007.m154() <= 0) {
            return ((w4) obj).f9622d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۣۤ۠, reason: contains not printable characters */
    public static int m2213(Object obj) {
        if (C0109.m2116() < 0) {
            return ((zzfi.zzl) obj).zzb();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۧ۟ۧ, reason: not valid java name and contains not printable characters */
    public static int m2214(Object obj) {
        if (C0176.m3367() <= 0) {
            return ((i0) obj).f4573s;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧۥۨۥ, reason: not valid java name and contains not printable characters */
    public static long m2215(Object obj) {
        if (C0140.m2699() >= 0) {
            return ((z) obj).f1061j;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۨۤۥۤ, reason: not valid java name and contains not printable characters */
    public static URLConnection m2216(Object obj) {
        if (C0158.m3012() > 0) {
            return ((URL) obj).openConnection();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟ۢ۠, reason: contains not printable characters */
    public static String m2211(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
