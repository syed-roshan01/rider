package com.google.firebase.analytics.connector;

import a2.x;
import c1.C0059;
import ca.C0070;
import com.google.android.gms.tasks.C0106;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.model.C0160;
import com.google.firebase.messaging.reporting.C0190;
import ea.C0268;
import f4.C0274;
import f4.C0275;
import h6.C0309;
import h6.g;
import i.C0315;
import i7.a1;
import i7.h1;
import java.io.ByteArrayOutputStream;
import java.util.List;
import k0.m4;
import k0.n0;
import k6.k;
import k6.l;
import k6.p7;
import k6.y3;
import l0.C0340;
import l0.r;
import l9.i;
import m0.l3;
import m2.a;
import u0.b;
import w.C0453;
import w2.C0457;

/* JADX INFO: renamed from: com.google.firebase.analytics.connector.ۣ۟ۢۢ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0117 {

    /* JADX INFO: renamed from: ۦۥۧۤ, reason: contains not printable characters */
    public static int f143 = 959;

    /* JADX INFO: renamed from: ۣ۟۟ۢ, reason: not valid java name and contains not printable characters */
    public static String m2252(String str) {
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

    /* JADX INFO: renamed from: ۟ۤ۟ۥ۟, reason: not valid java name and contains not printable characters */
    public static String m2253(Object obj) {
        if (m2257() >= 0) {
            return ((x) obj).f1037g;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۤ, reason: not valid java name and contains not printable characters */
    public static void m2254(Object obj) {
        if (C0275.m5308() >= 0) {
            g.B0((String) obj);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۤۤ۠, reason: not valid java name and contains not printable characters */
    public static b m2255() {
        if (C0315.m6111() > 0) {
            return n0.f9249a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۦ۟, reason: not valid java name and contains not printable characters */
    public static l m2256(Object obj, long j10, Object obj2, long j11, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        if (C0453.m8831() <= 0) {
            return ((k) obj).D(j10, (String) obj2, j11, z10, z11, z12, z13, z14);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣۣۧ, reason: not valid java name and contains not printable characters */
    public static int m2257() {
        return 402 ^ C0160.f184;
    }

    /* JADX INFO: renamed from: ۟ۦۤۥۡ, reason: not valid java name and contains not printable characters */
    public static long m2258(Object obj) {
        if (C0457.m8901() <= 0) {
            return ((m4) obj).A;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۦۤۧۦ, reason: not valid java name and contains not printable characters */
    public static List m2259(Object obj, Object obj2, Object obj3, Object obj4, boolean z10) {
        if (C0070.m1363() > 0) {
            return ((y3) obj).i((String) obj2, (String) obj3, (String) obj4, z10);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۤۡۤ, reason: not valid java name and contains not printable characters */
    public static String m2260(Object obj, Object obj2, Object obj3) {
        if (C0268.m5123() > 0) {
            return i.c1((String) obj, (String) obj2, (String) obj3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۧۤ, reason: not valid java name and contains not printable characters */
    public static long m2261(Object obj) {
        if (C0274.m5286() < 0) {
            return ((p7) obj).A;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣۡ۟ۢ, reason: not valid java name and contains not printable characters */
    public static void m2262(Object obj, Object obj2) {
        if (C0190.m3639() >= 0) {
            h1.x((h1) obj, (a1) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۢۦۧ, reason: not valid java name and contains not printable characters */
    public static String m2263(Object obj) {
        if (C0309.m5971() < 0) {
            return ((FirebaseUser) obj).getDisplayName();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۥۦ, reason: not valid java name and contains not printable characters */
    public static int m2264(long j10) {
        if (C0340.m6681() > 0) {
            return a.j(j10);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥ۟ۦ۟, reason: contains not printable characters */
    public static int m2266() {
        if (C0106.m2067() >= 0) {
            return r.f11121b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۤۦۣ, reason: contains not printable characters */
    public static int m2267(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۧ۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static l3 m2268(Object obj) {
        if (C0059.m1117() <= 0) {
            return ((d5.i) obj).f4560p;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۤۤۡ, reason: not valid java name and contains not printable characters */
    public static String m2265(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
