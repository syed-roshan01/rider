package com.google.android.gms.common.util;

import android.database.sqlite.SQLiteDatabase;
import android.graphics.Path;
import c9.e;
import com.auto.accept.data.model.TransactionData;
import com.google.firebase.encoders.C0143;
import d4.C0218;
import dagger.hilt.android.internal.earlyentrypoint.C0232;
import e1.g0;
import f0.a2;
import f0.f;
import f0.n0;
import f0.t;
import f0.y1;
import h3.C0304;
import i.C0317;
import java.io.ByteArrayOutputStream;
import k0.l1;
import k6.a5;
import k6.b4;
import k6.p7;
import k6.s5;
import k6.y5;
import k6.z3;
import m0.m;
import m0.x1;
import m5.C0356;
import p7.C0379;
import q0.C0383;
import q2.C0385;
import q7.C0390;
import r2.C0395;
import s2.C0412;
import t8.C0427;
import u1.C0432;
import w2.C0459;
import x4.C0470;
import x8.C0474;
import y0.o;

/* JADX INFO: renamed from: com.google.android.gms.common.util.ۣۤۡۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0086 {

    /* JADX INFO: renamed from: ۡۥۣۢ, reason: not valid java name and contains not printable characters */
    public static int f120 = -777;

    /* JADX INFO: renamed from: ۟۟ۡۢ۟, reason: not valid java name and contains not printable characters */
    public static n0 m1828() {
        if (C0459.m8930() > 0) {
            return n0.f5823a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۧ۟ۥ, reason: not valid java name and contains not printable characters */
    public static void m1829(Object obj, float f10, float f11) {
        if (C0390.m7627() < 0) {
            ((Path) obj).moveTo(f10, f11);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۢۡ۟, reason: not valid java name and contains not printable characters */
    public static long m1830(Object obj) {
        if (C0395.m7729() >= 0) {
            return b4.v((SQLiteDatabase) obj);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۟ۢۦۤ۟, reason: not valid java name and contains not printable characters */
    public static void m1831(Object obj, Object obj2, Object obj3) {
        if (C0470.m9143() >= 0) {
            y5.L((y5) obj, (s5) obj2, (s5) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۤۢۨۥ, reason: not valid java name and contains not printable characters */
    public static void m1832(Object obj, Object obj2, int i10) {
        if (C0379.m7420() >= 0) {
            f.b((o) obj, (m) obj2, i10);
        }
    }

    /* JADX INFO: renamed from: ۣۣۣ۟ۤ, reason: not valid java name and contains not printable characters */
    public static Object m1833(Object obj) {
        if (C0232.m4453() < 0) {
            return ((k0.o) obj).f9283c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۡ۟, reason: not valid java name and contains not printable characters */
    public static String m1835(Object obj) {
        if (C0143.m2751() >= 0) {
            return ((a5) obj).f9869d;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧۧۢ۠, reason: not valid java name and contains not printable characters */
    public static a2 m1836(Object obj) {
        if (C0304.m5859() < 0) {
            return ((y1) obj).f6009a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۨۡ۟, reason: not valid java name and contains not printable characters */
    public static String m1837() {
        if (C0474.m9210() <= 0) {
            return "Failed to insert raw event (got -1). appId";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠۠, reason: not valid java name and contains not printable characters */
    public static TransactionData m1838(Object obj, Object obj2, Object obj3, int i10, Object obj4, Object obj5, int i11, long j10, long j11) {
        if (C0218.m4144() > 0) {
            return ((TransactionData) obj).copy((String) obj2, (String) obj3, i10, (String) obj4, (String) obj5, i11, j10, j11);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡ۠ۦۡ, reason: not valid java name and contains not printable characters */
    public static k6.f m1839(Object obj) {
        if (C0383.m7487() <= 0) {
            return ((p7) obj).H();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۡۦۣ, reason: not valid java name and contains not printable characters */
    public static boolean m1840(int i10, int i11) {
        if (C0432.m8447() <= 0) {
            return g0.f(i10, i11);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۡ۟ۦ, reason: not valid java name and contains not printable characters */
    public static String m1841(String str) {
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

    /* JADX INFO: renamed from: ۣۢۦ۠, reason: not valid java name and contains not printable characters */
    public static String m1842(Object obj) {
        if (C0385.m7527() <= 0) {
            return ((z3) obj).f10591c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۦۣۣ, reason: not valid java name and contains not printable characters */
    public static o m1843(Object obj) {
        if (C0427.m8356() < 0) {
            return ((t) obj).f5909q;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ۟ۨۧ, reason: not valid java name and contains not printable characters */
    public static int m1844(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۧۢۡۦ, reason: not valid java name and contains not printable characters */
    public static m0.y1 m1845(Object obj) {
        if (C0356.m6968() >= 0) {
            return ((x1) obj).f11754b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧۦۦۢ, reason: not valid java name and contains not printable characters */
    public static int m1846() {
        return 938 ^ C0412.f682;
    }

    /* JADX INFO: renamed from: ۨۦ۟۠, reason: not valid java name and contains not printable characters */
    public static e m1847(Object obj) {
        if (C0317.m6120() <= 0) {
            return ((l1) obj).f9162r;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۟۠۟, reason: not valid java name and contains not printable characters */
    public static String m1834(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
