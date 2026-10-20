package com.google.firebase.provider;

import aa.C0012;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.ui.input.key.C0033;
import b8.C0055;
import c9.f;
import com.google.firebase.iid.C0169;
import dagger.hilt.internal.generatesrootinput.C0250;
import e1.C0258;
import g.C0284;
import h0.C0299;
import h3.C0301;
import i5.C0318;
import j9.C0329;
import java.io.ByteArrayOutputStream;
import k0.b3;
import k0.c1;
import k0.h4;
import k0.n0;
import k0.s1;
import k0.v0;
import k6.b5;
import k6.e;
import k6.k;
import k6.v7;
import k6.x3;
import k6.z4;
import l9.C0347;
import m0.m;
import s6.C0413;
import s7.C0415;
import u0.b;
import w4.C0459;
import z6.a;

/* JADX INFO: renamed from: com.google.firebase.provider.ۧۦ۟ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0194 {

    /* JADX INFO: renamed from: ۣۧ۠ۡ, reason: not valid java name and contains not printable characters */
    public static int f218 = 187;

    /* JADX INFO: renamed from: ۟۟ۥ۠ۥ, reason: not valid java name and contains not printable characters */
    public static int m3708(Object obj) {
        if (C0318.m6163() < 0) {
            return ((c1) obj).f8786n;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۟ۨۧۤ, reason: not valid java name and contains not printable characters */
    public static f m3709(Object obj) {
        if (C0012.m226() > 0) {
            return ((h4) obj).f8986e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤ۠ۤ, reason: not valid java name and contains not printable characters */
    public static String m3710(String str) {
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

    /* JADX INFO: renamed from: ۟ۤۧۤۥ, reason: not valid java name and contains not printable characters */
    public static b5 m3712(Object obj) {
        if (C0258.m4939() < 0) {
            return ((z4) obj).f10611h;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۧ۟, reason: not valid java name and contains not printable characters */
    public static int m3713() {
        return 895 ^ C0284.f429;
    }

    /* JADX INFO: renamed from: ۟ۦۨ۠۠, reason: not valid java name and contains not printable characters */
    public static Object m3714() {
        if (C0459.m8951() <= 0) {
            return x3.f10526g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۠ۢ, reason: not valid java name and contains not printable characters */
    public static int m3715(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۧۤۡۨ, reason: not valid java name and contains not printable characters */
    public static i1.f m3716() {
        if (C0413.m8107() <= 0) {
            return a.f17301b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۥۡ, reason: not valid java name and contains not printable characters */
    public static float m3717() {
        if (C0055.m1056() > 0) {
            return s1.f9445a;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۡۧۡۤ, reason: not valid java name and contains not printable characters */
    public static v7 m3718(Object obj, Object obj2, Object obj3) {
        if (C0347.m6808() < 0) {
            return ((k) obj).a0((String) obj2, (String) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۢ۠, reason: not valid java name and contains not printable characters */
    public static b m3719() {
        if (C0329.m6367() >= 0) {
            return n0.f9250b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۦۨۡ, reason: not valid java name and contains not printable characters */
    public static void m3720(Object obj, Object obj2, int i10) {
        if (C0299.m5752() < 0) {
            ((v0) obj).a((m) obj2, i10);
        }
    }

    /* JADX INFO: renamed from: ۢۨۡۤ, reason: not valid java name and contains not printable characters */
    public static void m3721(Object obj, Object obj2) {
        if (C0301.m5797() < 0) {
            ((AccessibilityNodeInfo) obj).getBoundsInScreen((Rect) obj2);
        }
    }

    /* JADX INFO: renamed from: ۢۨۦۣ, reason: not valid java name and contains not printable characters */
    public static void m3722(Object obj, Object obj2) {
        if (C0033.m652() <= 0) {
            ((Context) obj).sendBroadcast((Intent) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۥ, reason: not valid java name and contains not printable characters */
    public static long m3723(Object obj) {
        if (C0250.m4793() >= 0) {
            return ((e) obj).f9990d;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۥۤ۟ۨ, reason: contains not printable characters */
    public static boolean m3724(Object obj, Object obj2) {
        if (C0169.m3245() >= 0) {
            return ((k) obj).P((e) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۧۥۤ, reason: not valid java name and contains not printable characters */
    public static long m3725(Object obj) {
        if (C0415.m8144() >= 0) {
            return ((b3) obj).f8743f;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۨ, reason: not valid java name and contains not printable characters */
    public static String m3711(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
