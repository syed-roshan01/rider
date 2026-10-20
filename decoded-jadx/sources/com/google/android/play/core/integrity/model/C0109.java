package com.google.android.play.core.integrity.model;

import android.os.Parcelable;
import androidx.compose.ui.layout.C0036;
import androidx.startup.C0047;
import c9.e;
import com.google.android.gms.internal.tasks.C0102;
import com.google.firebase.auth.ktx.C0132;
import com.google.firebase.measurement.C0182;
import com.google.firebase.messaging.RemoteMessage;
import d9.C0222;
import ea.C0267;
import f0.e1;
import f0.t;
import f2.l;
import fa.C0280;
import g5.C0290;
import i3.a0;
import i4.C0317;
import i6.C0319;
import java.io.ByteArrayOutputStream;
import k0.b1;
import k6.h5;
import k6.l4;
import k6.v;
import k6.x7;
import l8.C0346;
import m0.d;
import m0.q;
import o7.d0;
import r1.p;
import u1.x1;
import w2.C0456;
import x.m;
import y0.o;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.model.۟ۡۡۤۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0109 {

    /* JADX INFO: renamed from: ۣ۟ۨ۟, reason: not valid java name and contains not printable characters */
    public static int f135 = 67;

    /* JADX INFO: renamed from: ۟۟ۦۤۢ, reason: not valid java name and contains not printable characters */
    public static o m2102(Object obj) {
        if (C0456.m8890() > 0) {
            return ((t) obj).f5910r;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۧۡۦ, reason: not valid java name and contains not printable characters */
    public static int m2103(int i10, Object obj) {
        if (C0267.m5113() < 0) {
            return d7.t.T(i10, (String) obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static Parcelable.Creator m2105() {
        if (C0346.m6774() >= 0) {
            return v.CREATOR;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦۧۨ, reason: not valid java name and contains not printable characters */
    public static d m2106(Object obj) {
        if (C0222.m4279() < 0) {
            return ((q) obj).B();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۡ۠, reason: not valid java name and contains not printable characters */
    public static String m2107(Object obj) {
        if (C0280.m5432() > 0) {
            return ((RemoteMessage) obj).getFrom();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۦۥ۟, reason: not valid java name and contains not printable characters */
    public static String m2108(String str) {
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

    /* JADX INFO: renamed from: ۣ۟۟۟۠, reason: not valid java name and contains not printable characters */
    public static int m2109(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۥۥۢۥ, reason: not valid java name and contains not printable characters */
    public static StackTraceElement[] m2110(Object obj) {
        if (C0132.m2543() <= 0) {
            return ((Throwable) obj).getStackTrace();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۨۦۧ, reason: not valid java name and contains not printable characters */
    public static String m2111(Object obj, Object obj2) {
        if (C0047.m904() < 0) {
            return ((h5) obj).q((x7) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۧۧۢ, reason: not valid java name and contains not printable characters */
    public static Object m2112(Object obj, Object obj2) {
        if (C0319.m6181() > 0) {
            return ((e1) obj).invokeSuspend(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۥۡۨ, reason: not valid java name and contains not printable characters */
    public static int m2113(Object obj, int i10) {
        if (C0036.m698() < 0) {
            return ((p) obj).g(i10);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤ۟۟, reason: not valid java name and contains not printable characters */
    public static l m2114() {
        if (C0290.m5589() <= 0) {
            return x1.n();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۠۟۠, reason: contains not printable characters */
    public static void m2115(Object obj, Object obj2, boolean z10, Object obj3, Object obj4, Object obj5, Object obj6, int i10, int i11) {
        if (C0102.m2007() >= 0) {
            d0.b((c9.a) obj, (o) obj2, z10, (b1) obj3, (m) obj4, (e) obj5, (m0.m) obj6, i10, i11);
        }
    }

    /* JADX INFO: renamed from: ۦۡ۠ۨ, reason: contains not printable characters */
    public static int m2116() {
        return (-140) ^ C0317.f465;
    }

    /* JADX INFO: renamed from: ۨۢۢۤ, reason: not valid java name and contains not printable characters */
    public static a0 m2117(Object obj) {
        if (C0182.m3488() > 0) {
            return ((l4) obj).f10191x;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۨ۟۠, reason: not valid java name and contains not printable characters */
    public static String m2104(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
