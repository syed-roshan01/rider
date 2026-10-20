package com.google.gson.internal.bind;

import a5.u;
import a8.C0009;
import android.content.Context;
import b1.C0050;
import c5.v;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzpr;
import com.google.firebase.abt.C0112;
import com.google.firebase.abt.C0113;
import com.google.firebase.analytics.connector.internal.C0115;
import com.google.firebase.analytics.ktxtesting.C0121;
import com.google.firebase.installations.interop.C0173;
import com.google.firebase.messaging.reporting.C0187;
import dagger.hilt.android.components.C0229;
import dagger.hilt.android.internal.modules.C0234;
import dagger.hilt.internal.aliasof.C0247;
import h.C0297;
import h0.v0;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.net.URLConnection;
import k0.a3;
import k0.r4;
import k0.z2;
import p9.z;
import q2.C0384;
import t2.C0423;

/* JADX INFO: renamed from: com.google.gson.internal.bind.۟ۨۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0206 {

    /* JADX INFO: renamed from: ۟ۦۣۢۨ, reason: not valid java name and contains not printable characters */
    public static int f230 = 101;

    /* JADX INFO: renamed from: ۟ۢۨۨۦ, reason: not valid java name and contains not printable characters */
    public static int m3931() {
        return (-138) ^ C0297.f445;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۨۡ, reason: not valid java name and contains not printable characters */
    public static v m3932() {
        if (C0234.m4512() > 0) {
            return v.f3020a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤۢ, reason: not valid java name and contains not printable characters */
    public static long m3933(Object obj) {
        if (C0423.m8307() >= 0) {
            return ((URLConnection) obj).getDate();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۤۦۦۢ, reason: not valid java name and contains not printable characters */
    public static float m3934() {
        if (C0112.m2176() >= 0) {
            return l0.e.f11042a;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۧۨ, reason: not valid java name and contains not printable characters */
    public static z m3935(Object obj) {
        if (C0229.m4421() <= 0) {
            return ((MainViewModel) obj).f3128z;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦۢۥ, reason: not valid java name and contains not printable characters */
    public static void m3936(Object obj, boolean z10) {
        if (C0009.m177() > 0) {
            ((v0) obj).p(z10);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۡۦۢ, reason: not valid java name and contains not printable characters */
    public static a3 m3937(Object obj) {
        if (C0247.m4732() <= 0) {
            return ((z2) obj).f9700e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۢۦۤ, reason: not valid java name and contains not printable characters */
    public static String m3938(Object obj) {
        if (C0384.m7527() <= 0) {
            return ((zzfi.zze.zza) obj).zze();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۤۨ, reason: not valid java name and contains not printable characters */
    public static boolean m3939() {
        if (C0050.m982() < 0) {
            return zzpr.zzb();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۦۧۧۦ, reason: not valid java name and contains not printable characters */
    public static int m3940(Object obj, Object obj2, int i10) {
        if (C0173.m3314() > 0) {
            return ((z5.f) obj).c((Context) obj2, i10);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۦۧ, reason: not valid java name and contains not printable characters */
    public static File[] m3941(Object obj) {
        if (C0115.m2227() <= 0) {
            return ((File) obj).listFiles();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۥۣۣ, reason: not valid java name and contains not printable characters */
    public static int m3942(Object obj) {
        if (C0187.m3565() >= 0) {
            return ((u) obj).f1310d;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۥ۠ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m3943(Object obj) {
        if (C0121.m2336() < 0) {
            return ((f0.h) obj).f5724u;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۦۦۨ, reason: not valid java name and contains not printable characters */
    public static c9.e m3944(Object obj) {
        if (C0113.m2182() <= 0) {
            return ((r4) obj).f9434s;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡۨۨ, reason: not valid java name and contains not printable characters */
    public static String m3945(String str) {
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

    /* JADX INFO: renamed from: ۣۨۧۥ, reason: not valid java name and contains not printable characters */
    public static int m3947(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۤۧۨ, reason: not valid java name and contains not printable characters */
    public static String m3946(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
