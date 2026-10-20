package com.google.android.gms.internal.tasks;

import a2.x;
import a5.z;
import android.content.res.Resources;
import android.os.Parcel;
import android.util.DisplayMetrics;
import androidx.compose.ui.draw.C0027;
import androidx.profileinstaller.C0045;
import com.google.android.datatransport.runtime.backends.C0079;
import com.google.android.gms.common.internal.C0084;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.stats.C0101;
import com.google.android.play.core.integrity.model.C0109;
import com.google.firebase.analytics.connector.internal.C0114;
import com.google.firebase.annotations.C0128;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.measurement.C0183;
import com.google.firebase.remoteconfig.interop.C0196;
import com.google.gson.internal.bind.C0206;
import d5.u0;
import d5.w;
import dagger.hilt.android.lifecycle.C0237;
import dagger.hilt.internal.definecomponent.C0249;
import e0.e;
import g2.a0;
import g2.h0;
import ga.C0295;
import java.io.ByteArrayOutputStream;
import java.util.List;
import k.f;
import k0.p1;
import k0.p2;
import k0.t2;
import k0.x2;
import k6.f5;
import k6.l;
import k6.p6;
import k6.x7;
import k6.y3;
import m0.g1;
import m0.q;
import m0.q2;
import q5.C0385;
import u3.a;
import v9.C0452;
import w2.C0456;
import x0.C0466;
import z3.C0487;

/* JADX INFO: renamed from: com.google.android.gms.internal.tasks.ۣۧۧۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0103 {

    /* JADX INFO: renamed from: ۟۠۟ۨۡ, reason: not valid java name and contains not printable characters */
    public static int f129 = -398;

    /* JADX INFO: renamed from: ۣ۟۠۟۟, reason: not valid java name and contains not printable characters */
    public static g1 m2010(Object obj) {
        if (C0124.m2386() > 0) {
            return ((w) obj).f4814c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۢۤ, reason: not valid java name and contains not printable characters */
    public static int m2011(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۠ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m2012(Object obj) {
        if (C0487.m9496() < 0) {
            return ((p1) obj).f9347u;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۧ۠, reason: not valid java name and contains not printable characters */
    public static boolean m2013(Object obj, Object obj2) {
        if (C0128.m2475() <= 0) {
            return ((q) obj).g(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۟۠, reason: not valid java name and contains not printable characters */
    public static String m2014(Object obj) {
        if (C0237.m4583() > 0) {
            return ((zzfi.zzj) obj).zzaj();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨ۠, reason: not valid java name and contains not printable characters */
    public static void m2015(Object obj, int i10) {
        if (C0084.m1804() >= 0) {
            ((Parcel) obj).writeInt(i10);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۥۥۨ, reason: not valid java name and contains not printable characters */
    public static z m2016(Object obj) {
        if (C0249.m4779() < 0) {
            return ((a5.q) obj).f1294a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۤۥۢ, reason: not valid java name and contains not printable characters */
    public static long m2017(Object obj) {
        if (C0114.m2205() <= 0) {
            return ((l) obj).f10164e;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۠۟ۧۦ, reason: not valid java name and contains not printable characters */
    public static e m2018() {
        if (C0206.m3931() >= 0) {
            return p2.f9357e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥۨۦ, reason: not valid java name and contains not printable characters */
    public static String m2019(String str) {
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

    /* JADX INFO: renamed from: ۡۨۦۥ, reason: not valid java name and contains not printable characters */
    public static p6 m2020(Object obj) {
        if (C0206.m3931() > 0) {
            return ((f5) obj).f10038o;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۠ۧ۠, reason: not valid java name and contains not printable characters */
    public static long m2021(Object obj) {
        if (C0385.m7546() >= 0) {
            return ((x) obj).f1042l;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۢۡ۠ۧ, reason: not valid java name and contains not printable characters */
    public static int m2022() {
        return 526 ^ C0045.f65;
    }

    /* JADX INFO: renamed from: ۣۢۢ۠, reason: not valid java name and contains not printable characters */
    public static e m2023() {
        if (C0079.m1701() > 0) {
            return p2.f9354b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۧۦ, reason: not valid java name and contains not printable characters */
    public static void m2024(Object obj, float f10) {
        if (C0452.m8825() >= 0) {
            ((f) obj).z(f10);
        }
    }

    /* JADX INFO: renamed from: ۢۨۡ, reason: not valid java name and contains not printable characters */
    public static void m2025(Object obj) {
        if (C0101.m1975() > 0) {
            ((q) obj).u();
        }
    }

    /* JADX INFO: renamed from: ۢۨۤ۟, reason: not valid java name and contains not printable characters */
    public static List m2026(Object obj, Object obj2, Object obj3, boolean z10, Object obj4) {
        if (C0109.m2116() < 0) {
            return ((y3) obj).e((String) obj2, (String) obj3, z10, (x7) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۥۡ, reason: not valid java name and contains not printable characters */
    public static x2 m2027(Object obj) {
        if (C0466.m9086() > 0) {
            return ((t2) obj).f9487b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤ۠, reason: contains not printable characters */
    public static a m2028() {
        if (C0196.m3762() <= 0) {
            return a.f15414a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۡۡۤ, reason: contains not printable characters */
    public static void m2029(Object obj, Object obj2, Object obj3) {
        if (C0027.m541() >= 0) {
            ((h0) obj).a((a0) obj2, (a0) obj3);
        }
    }

    /* JADX INFO: renamed from: ۧۥۣۧ, reason: not valid java name and contains not printable characters */
    public static u8.e m2030(Object obj, Object obj2, Object obj3) {
        if (C0295.m5679() >= 0) {
            return ((u0) obj).create(obj2, (u8.e) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۢۥۧ, reason: not valid java name and contains not printable characters */
    public static DisplayMetrics m2031(Object obj) {
        if (C0183.m3510() >= 0) {
            return ((Resources) obj).getDisplayMetrics();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۧۢۡ, reason: not valid java name and contains not printable characters */
    public static void m2032(Object obj, int i10, int i11, int i12) {
        if (C0456.m8890() >= 0) {
            ((q2) obj).C(i10, i11, i12);
        }
    }

    /* JADX INFO: renamed from: ۣ۟۟ۧ۠, reason: not valid java name and contains not printable characters */
    public static String m2009(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
