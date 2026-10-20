package com.auto.accept.service;

import a2.r;
import a5.u;
import android.util.Pair;
import androidx.compose.foundation.layout.a;
import c9.f;
import com.google.android.gms.common.util.C0086;
import com.google.crypto.tink.shaded.protobuf.p;
import com.google.firebase.appcheck.C0131;
import com.google.firebase.heartbeatinfo.C0167;
import com.google.firebase.ktx.C0180;
import com.google.firebase.measurement.C0183;
import com.google.firebase.remoteconfiginterop.C0202;
import e1.C0259;
import f0.d0;
import f0.e1;
import f4.C0276;
import g9.C0295;
import java.io.ByteArrayOutputStream;
import java.util.logging.Logger;
import k0.i0;
import k0.l1;
import k0.u4;
import k6.a5;
import k6.k4;
import l9.i;
import m0.m;
import m5.C0356;
import q6.C0387;
import t2.C0424;
import v0.C0442;
import w5.C0464;
import x0.C0467;
import y0.o;
import z0.C0483;

/* JADX INFO: renamed from: com.auto.accept.service.۟۠ۧۧۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0072 {

    /* JADX INFO: renamed from: ۡۨ۟ۨ, reason: not valid java name and contains not printable characters */
    public static int f104 = 113;

    /* JADX INFO: renamed from: ۟۟ۦۨۧ, reason: not valid java name and contains not printable characters */
    public static Logger m1550() {
        if (C0467.m9086() > 0) {
            return p.D;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۟ۢ۠, reason: not valid java name and contains not printable characters */
    public static boolean m1551(Object obj, Object obj2, boolean z10) {
        if (C0276.m5308() > 0) {
            return i.h1((String) obj, (String) obj2, z10);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟۠ۡۢ۟, reason: not valid java name and contains not printable characters */
    public static String m1552() {
        if (C0295.m5663() >= 0) {
            return "select_plan";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۤۨۨ, reason: not valid java name and contains not printable characters */
    public static boolean m1554(Object obj) {
        if (C0086.m1846() > 0) {
            return ((d0) obj).f5661b;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۧۤ, reason: not valid java name and contains not printable characters */
    public static int m1555(Object obj) {
        if (C0202.m3868() > 0) {
            return ((l1) obj).B;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۥ۠, reason: not valid java name and contains not printable characters */
    public static int m1556() {
        return (-193) ^ C0183.f207;
    }

    /* JADX INFO: renamed from: ۣۣ۟ۨۦ, reason: not valid java name and contains not printable characters */
    public static long m1557(Object obj) {
        if (C0180.m3448() >= 0) {
            return ((i0) obj).f9005i;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۣ۟ۤۢۥ, reason: not valid java name and contains not printable characters */
    public static float m1558() {
        if (C0167.m3200() > 0) {
            return u4.f9536g;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۟ۥ۠۟۟, reason: not valid java name and contains not printable characters */
    public static void m1559(Object obj, long j10) {
        if (C0483.m9389() > 0) {
            ((a5) obj).i(j10);
        }
    }

    /* JADX INFO: renamed from: ۟ۦۥۨۢ, reason: not valid java name and contains not printable characters */
    public static Object m1560(Object obj) {
        if (C0387.m7564() > 0) {
            return ((Pair) obj).first;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦۡۢ, reason: not valid java name and contains not printable characters */
    public static boolean m1561(Object obj) {
        if (C0259.m4939() <= 0) {
            return ((k4) obj).f10152b;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۥۤۨ, reason: not valid java name and contains not printable characters */
    public static String m1562(String str) {
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

    /* JADX INFO: renamed from: ۢۥۨ۟, reason: not valid java name and contains not printable characters */
    public static Object m1563(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0131.m2522() > 0) {
            return ((f) obj).e(obj2, obj3, obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۨۡ, reason: not valid java name and contains not printable characters */
    public static void m1564(Object obj, Object obj2) {
        if (C0424.m8307() > 0) {
            a.c((o) obj, (m) obj2);
        }
    }

    /* JADX INFO: renamed from: ۣۢۨۧ, reason: not valid java name and contains not printable characters */
    public static int m1565(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۧۢۤ, reason: not valid java name and contains not printable characters */
    public static Object m1566(Object obj) {
        if (C0464.m9033() > 0) {
            return ((e1) obj).f5684a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۤۦۥ, reason: not valid java name and contains not printable characters */
    public static Object m1567(Object obj, Object obj2) {
        if (C0442.m8612() >= 0) {
            return ((u) obj).invokeSuspend(obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۥۡۨ, reason: not valid java name and contains not printable characters */
    public static r m1568() {
        if (C0356.m6968() >= 0) {
            return r.f968c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠ۨۦ, reason: not valid java name and contains not printable characters */
    public static String m1553(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
