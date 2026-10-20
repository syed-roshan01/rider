package com.google.firebase.iid;

import a2.c0;
import a8.C0010;
import aa.C0011;
import c4.C0064;
import c9.a;
import c9.c;
import c9.e;
import com.google.android.gms.common.util.C0085;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.encoders.C0143;
import com.google.firebase.iid.internal.C0168;
import dagger.hilt.android.components.C0228;
import e2.C0261;
import e2.C0264;
import f0.a1;
import f0.d1;
import f0.k1;
import f5.p;
import j5.C0328;
import java.io.ByteArrayOutputStream;
import java.util.List;
import k0.g3;
import k0.o1;
import k0.z4;
import k6.k;
import k6.x;
import k6.x3;
import m0.m;
import r1.w0;
import r1.x0;
import t1.C0420;
import v6.C0448;
import w4.C0460;
import y0.o;

/* JADX INFO: renamed from: com.google.firebase.iid.ۥۣۣۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0170 {

    /* JADX INFO: renamed from: ۢۤۧۥ, reason: not valid java name and contains not printable characters */
    public static int f194 = -149;

    /* JADX INFO: renamed from: ۣ۟۟۟ۧ, reason: not valid java name and contains not printable characters */
    public static int m3247() {
        return (-186) ^ C0011.f31;
    }

    /* JADX INFO: renamed from: ۟۟ۧ۟ۡ, reason: not valid java name and contains not printable characters */
    public static Task m3248(Object obj, Object obj2) {
        if (C0085.m1825() > 0) {
            return ((FirebaseUser) obj).verifyBeforeUpdateEmail((String) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۨ۟, reason: not valid java name and contains not printable characters */
    public static void m3249(Object obj, Object obj2, long j10) {
        if (C0460.m8951() <= 0) {
            w0.f((w0) obj, (x0) obj2, j10);
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۢۡ۟, reason: not valid java name and contains not printable characters */
    public static int[] m3250() {
        if (C0460.m8951() <= 0) {
            return z4.f9709a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۥۦ, reason: not valid java name and contains not printable characters */
    public static String m3251(Object obj) {
        if (C0168.m3229() >= 0) {
            return ((p) obj).f6310c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۨۦۦ, reason: not valid java name and contains not printable characters */
    public static k1 m3252(Object obj) {
        if (C0261.m4984() >= 0) {
            return ((d1) obj).f5666c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۥۡ, reason: not valid java name and contains not printable characters */
    public static e m3253(Object obj) {
        if (C0448.m8732() <= 0) {
            return ((g3) obj).f8946b;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۣ۟۠, reason: not valid java name and contains not printable characters */
    public static String m3254(String str) {
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

    /* JADX INFO: renamed from: ۣ۟ۧ۟ۧ, reason: not valid java name and contains not printable characters */
    public static int m3255(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۟ۧۢ۟ۦ, reason: not valid java name and contains not printable characters */
    public static x3 m3256() {
        if (C0328.m6319() < 0) {
            return x.J;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠۟ۥۣ, reason: not valid java name and contains not printable characters */
    public static a2.x m3257(Object obj) {
        if (C0064.m1243() > 0) {
            return ((c0) obj).f911a;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۧۧ۟, reason: not valid java name and contains not printable characters */
    public static List m3258(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0228.m4380() >= 0) {
            return ((k) obj).B((String) obj2, (String) obj3, (String) obj4);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۤۤ, reason: not valid java name and contains not printable characters */
    public static String m3260() {
        if (C0010.m199() >= 0) {
            return "abs(bundle_end_timestamp - ?) > cast(? as integer)";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۤۤۤ, reason: not valid java name and contains not printable characters */
    public static c m3261(Object obj) {
        if (C0143.m2751() >= 0) {
            return ((a1) obj).f5594c;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤ۟ۦ, reason: contains not printable characters */
    public static void m3262(Object obj, Object obj2, boolean z10, boolean z11, Object obj3, Object obj4, Object obj5, int i10, int i11) {
        if (C0420.m8247() >= 0) {
            y3.e.g((String) obj, (a) obj2, z10, z11, (o) obj3, (List) obj4, (m) obj5, i10, i11);
        }
    }

    /* JADX INFO: renamed from: ۨۡۨۤ, reason: not valid java name and contains not printable characters */
    public static e m3263(Object obj) {
        if (C0264.m5033() < 0) {
            return ((o1) obj).f9305y;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۨۡۢ, reason: not valid java name and contains not printable characters */
    public static String m3259(short[] sArr, int i10, int i11, int i12) {
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = (char) (sArr[i10 + i13] ^ i12);
        }
        return new String(cArr);
    }
}
