package com.google.firebase.firestore.auth;

import a5.j;
import a5.l;
import android.content.SharedPreferences;
import com.google.android.gms.common.internal.C0084;
import com.google.android.gms.internal.stats.C0100;
import com.google.firebase.analytics.connector.internal.C0115;
import com.google.firebase.analytics.ktx.ktxtesting.C0119;
import com.google.firebase.emulators.C0141;
import com.google.firebase.firestore.core.C0153;
import com.google.firebase.firestore.ktx.C0157;
import com.google.firebase.firestore.model.C0160;
import com.google.firebase.installations.C0177;
import com.google.firebase.ktx.C0179;
import com.google.gson.internal.bind.C0206;
import d5.t1;
import d5.w0;
import e2.C0260;
import i7.i1;
import java.io.ByteArrayOutputStream;
import java.util.List;
import k0.c4;
import k0.d5;
import k0.f0;
import k0.t3;
import k3.C0335;
import k6.f5;
import k6.k;
import k6.s6;
import k6.v7;
import k6.w;
import m0.l3;
import m0.m;
import n8.C0365;
import p8.C0379;
import r6.C0402;
import s.C0408;
import s6.C0413;
import t7.C0425;
import u.p2;
import u1.C0431;
import u8.e;
import v9.C0451;
import w0.u;

/* JADX INFO: renamed from: com.google.firebase.firestore.auth.۠ۦۣۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0146 {

    /* JADX INFO: renamed from: ۥۥۤۡ, reason: contains not printable characters */
    public static int f171 = -437;

    /* JADX INFO: renamed from: ۟۠۠۠ۥ, reason: not valid java name and contains not printable characters */
    public static String m2775() {
        if (C0206.m3931() > 0) {
            return "Grant permissions first";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۥۨۢ, reason: not valid java name and contains not printable characters */
    public static int m2776() {
        return (-45) ^ C0157.f181;
    }

    /* JADX INFO: renamed from: ۟۠ۦ۠ۤ, reason: not valid java name and contains not printable characters */
    public static Object m2777(Object obj) {
        if (C0100.m1959() <= 0) {
            return ((v7) obj).f10449e;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۡۡۧ, reason: not valid java name and contains not printable characters */
    public static float m2778(Object obj) {
        if (C0365.m7172() > 0) {
            return ((t3) obj).f9498r;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۡۦۧۦ, reason: not valid java name and contains not printable characters */
    public static p2 m2779(Object obj) {
        if (C0451.m8793() <= 0) {
            return androidx.compose.foundation.a.l((m) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢۧ, reason: not valid java name and contains not printable characters */
    public static int m2780(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۣ۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static Object m2781(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0141.m2714() <= 0) {
            return ((j) obj).g((String) obj2, (String) obj3, (e) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۢ, reason: not valid java name and contains not printable characters */
    public static w m2782() {
        if (C0425.m8351() <= 0) {
            return w.f10450a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۤ, reason: not valid java name and contains not printable characters */
    public static int m2783(Object obj) {
        if (C0084.m1804() > 0) {
            return ((l) obj).f1288d;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۤۦ, reason: not valid java name and contains not printable characters */
    public static boolean m2784(Object obj, Object obj2, boolean z10) {
        if (C0179.m3417() >= 0) {
            return ((SharedPreferences) obj).getBoolean((String) obj2, z10);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ۢۡ, reason: not valid java name and contains not printable characters */
    public static List m2785(Object obj) {
        if (C0335.m6500() < 0) {
            return ((i1) obj).B();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۦۨ, reason: not valid java name and contains not printable characters */
    public static String m2786() {
        if (C0431.m8447() <= 0) {
            return "Next upload time is 0";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤۥۡ, reason: not valid java name and contains not printable characters */
    public static c9.a m2787(Object obj) {
        if (C0379.m7433() > 0) {
            return ((t1) obj).f4783c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۧۦ, reason: not valid java name and contains not printable characters */
    public static long m2788(Object obj, Object obj2, Object obj3) {
        if (C0153.m2938() <= 0) {
            return ((k) obj).T((String) obj2, (String[]) obj3);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۢۢۦ, reason: not valid java name and contains not printable characters */
    public static s6 m2789(Object obj) {
        if (C0402.m7897() >= 0) {
            return ((f5) obj).m();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۦۣ, reason: not valid java name and contains not printable characters */
    public static void m2790(long j10, long j11, boolean z10, Object obj, Object obj2, int i10) {
        if (C0413.m8107() <= 0) {
            c4.c(j10, j11, z10, (c9.e) obj, (m) obj2, i10);
        }
    }

    /* JADX INFO: renamed from: ۣۡۦ۠, reason: not valid java name and contains not printable characters */
    public static String m2791(String str) {
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

    /* JADX INFO: renamed from: ۣۣۤۢ, reason: not valid java name and contains not printable characters */
    public static boolean m2793(Object obj, Object obj2) {
        if (C0177.m3380() > 0) {
            return ((u) obj).add(obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۤۤ, reason: not valid java name and contains not printable characters */
    public static l3 m2794(Object obj) {
        if (C0160.m3070() < 0) {
            return ((w0) obj).f4830t;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static long m2795(Object obj) {
        if (C0408.m8009() < 0) {
            return ((d5) obj).f8841c;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۥۣ۟ۡ, reason: contains not printable characters */
    public static float m2796(Object obj) {
        if (C0119.m2289() > 0) {
            return ((a2.k) obj).c();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۥۣۨۡ, reason: contains not printable characters */
    public static int m2797(Object obj) {
        if (C0115.m2227() <= 0) {
            return ((f0) obj).f8911s;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۨۢۤ, reason: contains not printable characters */
    public static m2.l m2798() {
        if (C0260.m4984() > 0) {
            return m2.l.f11815a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۡۧۦ, reason: not valid java name and contains not printable characters */
    public static String m2792(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
