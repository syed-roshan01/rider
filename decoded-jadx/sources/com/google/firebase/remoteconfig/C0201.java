package com.google.firebase.remoteconfig;

import a4.q;
import android.util.Pair;
import androidx.appcompat.widget.C0020;
import androidx.compose.ui.node.C0037;
import com.google.firebase.iid.C0171;
import com.google.firebase.measurement.C0184;
import d1.C0211;
import d5.l;
import dagger.hilt.android.components.C0227;
import e1.z;
import f0.C0272;
import h7.C0311;
import j9.f;
import java.io.ByteArrayOutputStream;
import java.util.List;
import k0.j0;
import k0.l0;
import k6.a5;
import k6.f5;
import k6.l4;
import l9.j;
import m2.e;
import m7.C0358;
import o5.C0370;
import p0.C0373;
import p5.C0377;
import p7.C0378;
import q5.C0385;
import u4.C0436;
import y.j1;
import y0.n;
import y1.t;
import z8.C0492;

/* JADX INFO: renamed from: com.google.firebase.remoteconfig.۟ۧۥ۠۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0201 {

    /* JADX INFO: renamed from: ۦۡ۟ۡ, reason: contains not printable characters */
    public static int f225 = 60;

    /* JADX INFO: renamed from: ۟۠, reason: not valid java name and contains not printable characters */
    public static int m3848(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟۠ۢۢ, reason: not valid java name and contains not printable characters */
    public static n m3849(Object obj) {
        if (C0436.m8524() <= 0) {
            return ((n) obj).f16734e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤۨۤ, reason: not valid java name and contains not printable characters */
    public static int m3850(Object obj, Object obj2) {
        if (C0171.m3272() <= 0) {
            return ((e) obj).compareTo(obj2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۨ, reason: not valid java name and contains not printable characters */
    public static Object m3851(Object obj, Object obj2) {
        if (C0358.m7035() < 0) {
            return ((r0.d) obj).get(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۨۢۦ, reason: not valid java name and contains not printable characters */
    public static String m3852(Object obj) {
        if (C0385.m7546() >= 0) {
            return obj.toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۢۤۡ, reason: not valid java name and contains not printable characters */
    public static z m3853(Object obj) {
        if (C0377.m7389() >= 0) {
            return q.i((List) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۨۤۢ, reason: not valid java name and contains not printable characters */
    public static String m3854(int i10, Object obj) {
        if (C0037.m733() > 0) {
            return j.p1(i10, (String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۨۨ, reason: not valid java name and contains not printable characters */
    public static int m3855() {
        return (-240) ^ C0272.f388;
    }

    /* JADX INFO: renamed from: ۟ۥۣۢۦ, reason: not valid java name and contains not printable characters */
    public static Pair m3856() {
        if (C0211.m4046() >= 0) {
            return l4.f10169y;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۨۨۤ, reason: not valid java name and contains not printable characters */
    public static f5 m3857(Object obj) {
        if (C0020.m399() < 0) {
            return ((a5) obj).f9866a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۦۦ, reason: not valid java name and contains not printable characters */
    public static y.c m3858(Object obj) {
        if (C0373.m7322() <= 0) {
            return ((j1) obj).f16591g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۢۧۥ, reason: not valid java name and contains not printable characters */
    public static j0 m3859() {
        if (C0311.m6027() <= 0) {
            return j0.f9055c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥۨۦ, reason: not valid java name and contains not printable characters */
    public static double m3860(double d10) {
        return C0184.m3517() >= 0 ? Math.ulp(d10) : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: ۟ۨ۟ۦ, reason: not valid java name and contains not printable characters */
    public static f[] m3861() {
        if (C0227.m4380() >= 0) {
            return t.f16843a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۤۥ, reason: not valid java name and contains not printable characters */
    public static long m3863(Object obj) {
        if (C0370.m7269() > 0) {
            return ((Number) obj).longValue();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۢۧ۠, reason: not valid java name and contains not printable characters */
    public static l0 m3864() {
        if (C0492.m9578() >= 0) {
            return l0.f9137c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۤ۟, reason: not valid java name and contains not printable characters */
    public static l m3865() {
        if (C0378.m7420() > 0) {
            return l.f4636t;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۢۤۤ, reason: contains not printable characters */
    public static String m3866(String str) {
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

    /* JADX INFO: renamed from: ۢۡۡۡ, reason: not valid java name and contains not printable characters */
    public static String m3862(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
