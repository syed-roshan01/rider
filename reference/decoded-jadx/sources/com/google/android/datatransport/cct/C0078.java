package com.google.android.datatransport.cct;

import aa.C0012;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import androidx.compose.ui.draw.C0027;
import b.C0049;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.datatransport.runtime.backends.C0079;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.firebase.analytics.connector.internal.C0115;
import com.google.firebase.firestore.model.C0161;
import com.google.firebase.messaging.reporting.C0187;
import com.google.firebase.messaging.reporting.C0188;
import com.google.protobuf.v;
import d1.C0212;
import d8.C0221;
import f0.a2;
import f0.e0;
import f0.s0;
import g2.a0;
import h1.C0300;
import h6.C0309;
import j3.C0325;
import j4.l;
import java.io.ByteArrayOutputStream;
import k0.b5;
import k1.C0332;
import k6.d;
import k6.e6;
import k6.l4;
import k6.r7;
import k6.s5;
import m0.n1;
import p9.q0;
import s8.C0416;
import u1.C0431;
import w5.C0462;
import w5.C0463;
import y.h;
import y.k;
import y0.o;

/* JADX INFO: renamed from: com.google.android.datatransport.cct.ۨۡ۠ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0078 {

    /* JADX INFO: renamed from: ۦۨۧ۟, reason: contains not printable characters */
    public static int f112 = -94;

    /* JADX INFO: renamed from: ۟۟۠ۧ۟, reason: not valid java name and contains not printable characters */
    public static a2 m1679(Object obj) {
        if (C0049.m945() > 0) {
            return ((s0) obj).f5891b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠۠۟, reason: not valid java name and contains not printable characters */
    public static String m1680(String str) {
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
        while (length > 0) {
            byteArray[-1] = (byte) (byteArray[-1] ^ str2.charAt((-1) % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۟۠ۤۦ۟, reason: not valid java name and contains not printable characters */
    public static boolean m1681(Object obj) {
        if (C0079.m1701() > 0) {
            return ((d) obj).f();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۧۥۡ, reason: not valid java name and contains not printable characters */
    public static h m1683(float f10) {
        if (C0161.m3081() < 0) {
            return k.j(f10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۡۥۤ, reason: not valid java name and contains not printable characters */
    public static q0 m1684(Object obj) {
        if (C0462.m9013() < 0) {
            return ((MainViewModel) obj).T;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۟ۤ, reason: not valid java name and contains not printable characters */
    public static s5 m1685(Object obj) {
        if (C0115.m2227() < 0) {
            return ((l4) obj).u();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۠ۨ, reason: not valid java name and contains not printable characters */
    public static String m1686(Object obj) {
        if (C0187.m3565() > 0) {
            return ((e6) obj).f10011o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۥ۠, reason: not valid java name and contains not printable characters */
    public static void m1687(Object obj, int i10, long j10) {
        if (C0309.m5971() <= 0) {
            ((v) obj).y0(i10, j10);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۤۡۧ, reason: not valid java name and contains not printable characters */
    public static Intent m1688(Object obj, Object obj2) {
        if (C0332.m6454() <= 0) {
            return ((Intent) obj).setAction((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦۡۨ, reason: not valid java name and contains not printable characters */
    public static ClassLoader m1689(Object obj) {
        if (C0012.m226() > 0) {
            return ((Context) obj).getClassLoader();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢ۟۠, reason: not valid java name and contains not printable characters */
    public static a0 m1690(Object obj) {
        if (C0027.m541() >= 0) {
            return ((e0) obj).f5675b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۨۢۨ, reason: not valid java name and contains not printable characters */
    public static boolean m1691(Object obj, long j10, long j11) {
        if (C0463.m9033() > 0) {
            return ((r7) obj).Q(j10, j11);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۥۦۧ, reason: not valid java name and contains not printable characters */
    public static int m1692() {
        return (-225) ^ C0300.f448;
    }

    /* JADX INFO: renamed from: ۣۧ۠ۦ, reason: not valid java name and contains not printable characters */
    public static String m1693(Object obj) {
        if (C0431.m8447() < 0) {
            return ((b5) obj).f8751a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۨۤ, reason: not valid java name and contains not printable characters */
    public static int m1694(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۤۢ۟, reason: not valid java name and contains not printable characters */
    public static String m1695() {
        if (C0325.m6295() >= 0) {
            return "Failed to insert/update table (got -1). key";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۧۦۦ, reason: not valid java name and contains not printable characters */
    public static int m1696(Object obj, Object obj2, int i10) {
        if (C0212.m4051() >= 0) {
            return Settings.Secure.getInt((ContentResolver) obj, (String) obj2, i10);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۤۦۦ, reason: contains not printable characters */
    public static zzfi.zzg.zza m1697() {
        if (C0221.m4264() >= 0) {
            return zzfi.zzg.zze();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۦۤ, reason: contains not printable characters */
    public static o m1698(Object obj) {
        if (C0188.m3594() >= 0) {
            return ((b5) obj).f8752b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۨۥۥ, reason: not valid java name and contains not printable characters */
    public static n1 m1699(Object obj) {
        if (C0416.m8173() < 0) {
            return ((l) obj).f8369z;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۥۦۡ, reason: not valid java name and contains not printable characters */
    public static String m1682(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
