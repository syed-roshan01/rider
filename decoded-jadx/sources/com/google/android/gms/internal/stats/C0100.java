package com.google.android.gms.internal.stats;

import a.C0002;
import android.view.accessibility.AccessibilityNodeInfo;
import b3.s;
import ca.C0070;
import com.google.android.datatransport.runtime.backends.C0079;
import com.google.firebase.firestore.remote.C0164;
import e5.a;
import e8.C0265;
import f0.C0271;
import ja.x;
import java.io.ByteArrayOutputStream;
import java.util.List;
import k0.q4;
import k6.s5;
import k6.x7;
import l4.h;
import m0.m;
import m0.q;
import n.C0360;
import r2.C0395;
import v8.C0450;
import w2.C0456;

/* JADX INFO: renamed from: com.google.android.gms.internal.stats.ۣۣ۟ۡۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0100 {

    /* JADX INFO: renamed from: ۣۢۡ, reason: not valid java name and contains not printable characters */
    public static int f126 = -570;

    /* JADX INFO: renamed from: ۟ۡ۠ۧۦ, reason: not valid java name and contains not printable characters */
    public static s5 m1954(Object obj, Object obj2) {
        if (C0456.m8890() >= 0) {
            return ((s5) obj).h((s5) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۦ۠ۡ, reason: not valid java name and contains not printable characters */
    public static int m1955(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۢۨ۠ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m1956(Object obj) {
        if (C0079.m1701() > 0) {
            return ((AccessibilityNodeInfo) obj).isClickable();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۡۢ, reason: not valid java name and contains not printable characters */
    public static boolean m1957(Object obj) {
        if (C0271.m5222() < 0) {
            return ((x7) obj).F;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۤۧۥ۠, reason: not valid java name and contains not printable characters */
    public static void m1958(Object obj, Object obj2, int i10) {
        if (C0079.m1701() > 0) {
            ((q4) obj).a((m) obj2, i10);
        }
    }

    /* JADX INFO: renamed from: ۟ۥۢۡۡ, reason: not valid java name and contains not printable characters */
    public static int m1959() {
        return (-941) ^ C0070.f90;
    }

    /* JADX INFO: renamed from: ۟ۧۡۨۧ, reason: not valid java name and contains not printable characters */
    public static int m1960(Object obj) {
        if (C0450.m8792() <= 0) {
            return ((s) obj).f2676a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۠۟ۡۡ, reason: not valid java name and contains not printable characters */
    public static void m1961(Object obj) {
        if (C0360.m7073() < 0) {
            ((q) obj).c0();
        }
    }

    /* JADX INFO: renamed from: ۣۡ۠۠, reason: not valid java name and contains not printable characters */
    public static String m1962() {
        if (C0395.m7737() >= 0) {
            return "grant_overlay";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤۤ۠, reason: not valid java name and contains not printable characters */
    public static List m1963(Object obj, Object obj2) {
        if (C0265.m5069() <= 0) {
            return ((h) obj).g((x) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۢۢ, reason: not valid java name and contains not printable characters */
    public static long m1964() {
        if (C0002.m46() <= 0) {
            return a.f5136l;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۧ۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static Object m1965(Object obj, Object obj2) {
        if (C0164.m3153() > 0) {
            return ((a5.m) obj).invokeSuspend(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۡۡۡ, reason: not valid java name and contains not printable characters */
    public static String m1967(String str) {
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

    /* JADX INFO: renamed from: ۣۣۧ۟, reason: not valid java name and contains not printable characters */
    public static String m1966(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
