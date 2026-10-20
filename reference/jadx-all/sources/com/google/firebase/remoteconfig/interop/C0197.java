package com.google.firebase.remoteconfig.interop;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.ui.draw.C0027;
import androidx.compose.ui.graphics.C0031;
import androidx.compose.ui.layout.C0036;
import b1.C0050;
import c0.C0057;
import c9.c;
import com.google.firebase.firestore.model.C0161;
import com.google.gson.internal.bind.C0207;
import d5.m1;
import dagger.hilt.internal.C0254;
import ea.C0268;
import f0.c0;
import f0.c2;
import f0.j0;
import f5.b0;
import f5.t;
import fa.C0281;
import g4.C0290;
import h0.d0;
import h3.C0302;
import i1.f;
import ja.C0331;
import java.io.ByteArrayOutputStream;
import k0.e0;
import k0.l0;
import k0.s3;
import k1.C0333;
import k6.d;
import k6.t5;
import n7.C0365;
import t0.C0419;
import t1.i;
import t1.k;
import y1.u;
import y3.e;
import z3.C0486;

/* JADX INFO: renamed from: com.google.firebase.remoteconfig.interop.ۣۨۡ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0197 {

    /* JADX INFO: renamed from: ۣۥۨۦ, reason: not valid java name and contains not printable characters */
    public static int f221 = 99;

    /* JADX INFO: renamed from: ۣ۟۟ۥۤ, reason: not valid java name and contains not printable characters */
    public static String m3768() {
        if (C0268.m5113() <= 0) {
            return "location_filter";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۦ۟ۥ, reason: not valid java name and contains not printable characters */
    public static u m3769() {
        if (C0027.m541() >= 0) {
            return d0.f7376c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢ۟۟ۡ, reason: not valid java name and contains not printable characters */
    public static Long m3770(Object obj) {
        if (C0333.m6454() <= 0) {
            return ((d) obj).f9955e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۡۥ, reason: not valid java name and contains not printable characters */
    public static String m3771(Object obj) {
        if (C0281.m5432() >= 0) {
            return ((b0) obj).f6235d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۧۨ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m3772(Object obj, int i10) {
        if (C0290.m5580() < 0) {
            return ((StringBuilder) obj).append(i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۥۡ, reason: not valid java name and contains not printable characters */
    public static Context m3773(Object obj, Object obj2) {
        if (C0207.m3957() > 0) {
            return ((Context) obj).createConfigurationContext((Configuration) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۦ۟, reason: not valid java name and contains not printable characters */
    public static int m3774(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣ۟ۤۧۢ, reason: not valid java name and contains not printable characters */
    public static int m3775(Object obj) {
        if (C0161.m3081() <= 0) {
            return ((t) obj).f6325a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۣۡ۟, reason: not valid java name and contains not printable characters */
    public static f m3776(Object obj) {
        if (C0057.m1090() <= 0) {
            return ((m1) obj).f4676a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۢۤۦ, reason: not valid java name and contains not printable characters */
    public static String m3777(String str) {
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

    /* JADX INFO: renamed from: ۡۥۧۦ, reason: not valid java name and contains not printable characters */
    public static i m3778() {
        if (C0031.m598() >= 0) {
            return k.b();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦۢ۟, reason: not valid java name and contains not printable characters */
    public static c m3779(Object obj) {
        if (C0419.m8221() > 0) {
            return ((s3) obj).f9450b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۧۢ, reason: not valid java name and contains not printable characters */
    public static Object m3780(Object obj) {
        if (C0486.m9449() <= 0) {
            return ((e0) obj).f8862d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ۤ۟, reason: contains not printable characters */
    public static boolean m3781(Object obj) {
        if (C0365.m7147() < 0) {
            return ((StackTraceElement) obj).isNativeMethod();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۤۦۣ, reason: contains not printable characters */
    public static byte[] m3782() {
        if (C0036.m698() < 0) {
            return e.f16897d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟۟ۧ, reason: not valid java name and contains not printable characters */
    public static l0 m3783() {
        if (C0050.m982() <= 0) {
            return l0.f9147t;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۧۤۦ, reason: not valid java name and contains not printable characters */
    public static c2 m3784(Object obj) {
        if (C0331.m6374() > 0) {
            return ((c0) obj).f5632e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۨۤۢ, reason: not valid java name and contains not printable characters */
    public static int m3786() {
        return (-187) ^ C0486.f759;
    }

    /* JADX INFO: renamed from: ۨۨۤ۟, reason: not valid java name and contains not printable characters */
    public static String[] m3787() {
        if (C0302.m5797() < 0) {
            return t5.f10392b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۨۧۧ, reason: not valid java name and contains not printable characters */
    public static int m3788(Object obj) {
        if (C0254.m4844() > 0) {
            return ((j0) obj).f5793a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۧۨۧ, reason: not valid java name and contains not printable characters */
    public static String m3785(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
